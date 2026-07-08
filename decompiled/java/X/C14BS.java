package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.14BS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BS {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C14BV(this));

    public final void LIZJ() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(this.LIZ, 3).setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).setBlockModes("GCM").build());
        keyGenerator.generateKey();
    }

    public C14BS(String str) {
        this.LIZ = str;
    }

    public final String LIZ(String str) {
        boolean z;
        SecretKey secretKey;
        if (this.LIZIZ.getValue() == null) {
            return null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode.length <= 12) {
                return null;
            }
            byte[] bArr = new byte[bArrDecode.length - 12];
            byte[] bArr2 = new byte[12];
            System.arraycopy(bArrDecode, 0, bArr, 0, bArrDecode.length - 12);
            int length = bArrDecode.length - 12;
            System.arraycopy(bArrDecode, length, bArr2, 0, bArrDecode.length - length);
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) this.LIZIZ.getValue();
            if (secretKeyEntry != null) {
                secretKey = secretKeyEntry.getSecretKey();
            } else {
                secretKey = null;
            }
            cipher.init(2, secretKey, gCMParameterSpec);
            return new String(cipher.doFinal(bArr), Charsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("StringEncryptionHelper", e2.toString());
            return null;
        }
    }

    public final String LIZIZ(String str) {
        boolean z;
        SecretKey secretKey;
        if (this.LIZIZ.getValue() == null) {
            return null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) this.LIZIZ.getValue();
            if (secretKeyEntry != null) {
                secretKey = secretKeyEntry.getSecretKey();
            } else {
                secretKey = null;
            }
            cipher.init(1, secretKey, gCMParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes(Charsets.UTF_8));
            byte[] bArr2 = new byte[bArrDoFinal.length + 12];
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, bArrDoFinal.length);
            System.arraycopy(bArr, 0, bArr2, bArrDoFinal.length, 12);
            return Base64.encodeToString(bArr2, 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("StringEncryptionHelper", e2.toString());
            return null;
        }
    }
}
