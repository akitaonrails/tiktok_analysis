package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: X.14BX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BX {
    public static C14BY LIZ() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderLIZIZ = C14BW.LIZIZ("androidxBiometric", 3);
            C14BW.LIZLLL(builderLIZIZ);
            C14BW.LJ(builderLIZIZ);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            C14BW.LIZJ(keyGenerator, C14BW.LIZ(builderLIZIZ));
            keyGenerator.generateKey();
            Key key = keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, key);
            return new C14BY(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject LIZIZ(C14BY c14by) {
        IdentityCredential identityCredential;
        if (c14by == null) {
            return null;
        }
        Cipher cipher = c14by.LIZIZ;
        if (cipher != null) {
            return C14BZ.LIZIZ(cipher);
        }
        Signature signature = c14by.LIZ;
        if (signature != null) {
            return C14BZ.LIZ(signature);
        }
        Mac mac = c14by.LIZJ;
        if (mac != null) {
            return C14BZ.LIZJ(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = c14by.LIZLLL) == null) {
            return null;
        }
        return C20223214Ba.LIZ(identityCredential);
    }
}
