package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: X.0Vpu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809920Vpu {
    public static volatile AtomicInteger LIZ = new AtomicInteger(0);

    public static byte[] LIZ(String str) throws Throwable {
        boolean z;
        GZIPOutputStream gZIPOutputStream;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        if (z) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            gZIPOutputStream.write(str.getBytes(Charset.forName("UTF-8")));
            gZIPOutputStream.close();
        } catch (IOException e2) {
            e = e2;
            gZIPOutputStream2 = gZIPOutputStream;
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            e.getMessage();
            if (gZIPOutputStream2 != null) {
                gZIPOutputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            TryCatchGuardChecker.doCheck(th);
            if (gZIPOutputStream2 != null) {
                gZIPOutputStream2.close();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] LIZIZ(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(secretKeySpec.getEncoded(), 0, 16);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        byte[] bArr3 = new byte[bArrDoFinal.length + 16];
        System.arraycopy(ivParameterSpec.getIV(), 0, bArr3, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr3, 16, bArrDoFinal.length);
        return bArr3;
    }
}
