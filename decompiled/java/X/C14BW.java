package X;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.KeyGenerator;

/* JADX INFO: renamed from: X.14BW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14BW {
    public static KeyGenParameterSpec LIZ(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    public static void LIZLLL(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }

    public static void LJ(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }

    public static KeyGenParameterSpec.Builder LIZIZ(String str, int i) {
        return new KeyGenParameterSpec.Builder(str, i);
    }

    public static void LIZJ(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
        keyGenerator.init(keyGenParameterSpec);
    }
}
