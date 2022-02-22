package com.java;

import java.util.Scanner;

public class EjercicioBassico5 {

	public static void main(String[] args) {
		// Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar

			Scanner numero1 = new Scanner (System.in);	
		 int numero;
			
		System.out.println("Ingrese un número positivo o negativo : ");
		numero = numero1.nextInt();
		
		System.out.print("El numero ingresado es :" + numero);
		
		if (numero > 0) {
			System.out.print("\nEl número es positivo");
			}else{
				System.out.print("\nEl número es negativo");
				}
		
		if (numero %2 == 0){
		      System.out.println(" y es Par");
            }else{
            System.out.println(" y es Impar");
        
				}
			}
         
}
