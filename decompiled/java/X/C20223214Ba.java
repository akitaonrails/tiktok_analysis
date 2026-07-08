package X;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* JADX INFO: renamed from: X.14Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20223214Ba {
    public static BiometricPrompt.CryptoObject LIZ(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential LIZIZ(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
