package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import xlp.c;

/* JADX INFO: renamed from: X.0W99, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W99 {
    public static byte[] LIZ(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(c.LJIIIIZZ), "AES");
        Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
        int blockSize = cipher.getBlockSize() + 16;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(bArr, 16, blockSize));
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, blockSize, bArr.length);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArrCopyOfRange);
    }
}
