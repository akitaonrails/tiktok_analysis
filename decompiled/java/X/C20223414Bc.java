package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: X.14Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20223414Bc {
    public static BiometricPrompt.AuthenticationCallback LIZ(final C20223514Bd c20223514Bd) {
        return new BiometricPrompt.AuthenticationCallback() { // from class: X.14Bb
            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                c20223514Bd.LIZIZ();
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject cryptoObjectLIZIZ;
                IdentityCredential identityCredentialLIZIZ;
                C14BY c14by = null;
                if (authenticationResult != null && (cryptoObjectLIZIZ = C20223414Bc.LIZIZ(authenticationResult)) != null) {
                    Cipher cipherLIZLLL = C14BZ.LIZLLL(cryptoObjectLIZIZ);
                    if (cipherLIZLLL != null) {
                        c14by = new C14BY(cipherLIZLLL);
                    } else {
                        Signature signatureLJFF = C14BZ.LJFF(cryptoObjectLIZIZ);
                        if (signatureLJFF != null) {
                            c14by = new C14BY(signatureLJFF);
                        } else {
                            Mac macLJ = C14BZ.LJ(cryptoObjectLIZIZ);
                            if (macLJ != null) {
                                c14by = new C14BY(macLJ);
                            } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialLIZIZ = C20223214Ba.LIZIZ(cryptoObjectLIZIZ)) != null) {
                                c14by = new C14BY(identityCredentialLIZIZ);
                            }
                        }
                    }
                }
                int i = Build.VERSION.SDK_INT;
                int iLIZ = -1;
                if (i >= 30) {
                    if (authenticationResult != null) {
                        iLIZ = C20223614Be.LIZ(authenticationResult);
                    }
                } else if (i != 29) {
                    iLIZ = 2;
                }
                c20223514Bd.LIZJ(new C20223714Bf(c14by, iLIZ));
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                c20223514Bd.LIZ(i, charSequence);
            }
        };
    }

    public static BiometricPrompt.CryptoObject LIZIZ(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }
}
