package X;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: X.14BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14BZ {
    public static BiometricPrompt.CryptoObject LIZ(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    public static BiometricPrompt.CryptoObject LIZIZ(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static BiometricPrompt.CryptoObject LIZJ(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    public static Cipher LIZLLL(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    public static Mac LJ(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    public static Signature LJFF(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }
}
