package X;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0WVS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WVS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str != null) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, new byte[12]));
            return new String(cipher.doFinal(Base64.decode(str, 0)), Charsets.UTF_8);
        }
        throw new RuntimeException("decrypt failed: content null");
    }
}
