package proje3;

import java.util.Scanner;

public class proje3_3 {
    public static void main(String[] args) {
    
                    int menzil = 0, yas, yolculuk_tipi;
    		        double toplam_tutar = 0;

    		        Scanner input = new Scanner(System.in);

    		        System.out.print("Mesafeyi giriniz : ");
    		        menzil= input.nextInt();

    		        System.out.print("Yasinizi giriniz: ");
    		        yas = input.nextInt();

    		        System.out.print("Yolculuk tipini giriniz(1-) Tek Yon, 2-) Gidis-Donus): ");
    		       yolculuk_tipi = input.nextInt();

    		        if (menzil > 0){
    		        	toplam_tutar = menzil * 0.1;
    		        }
    		        else{
    		            System.out.println("Mesafeyi ölçmek için geçerli bir değer giriniz");
    		        }

    		        if (yas > 0){
    		            if (yas < 12){
    		            	toplam_tutar -= (toplam_tutar * 0.50);
    		            }
    		            else if((yas >= 12) && (yas <=24)){
    		            	toplam_tutar -= (toplam_tutar * 0.10);
    		            }
    		            else if(yas >65){
    		            	toplam_tutar-= (toplam_tutar * 0.30);
    		            }
    		        }
    		        else{
    		            System.out.println("Yas icin uygun deger giriniz");
    		        }

    		        if ((yolculuk_tipi == 1) || (yolculuk_tipi == 2)){
    		            if (yolculuk_tipi == 2){
    		            	toplam_tutar -= (toplam_tutar * 0.20);
    		            	toplam_tutar *= 2;
    		            }
    		        }
    		        else{
    		            System.out.println("Yolculuk şekli için 1 ve 2 değerlerinden birini seçiniz");
    		        }

    		        System.out.println("Toplam tutar: " + toplam_tutar + " TL");
    		    }
    		}