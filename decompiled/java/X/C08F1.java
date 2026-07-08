package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.08F1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F1 {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String LIZ(C0VSJ c0vsj) {
        int i;
        if (!c0vsj.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(c0vsj));
            while (true) {
                int i2 = bufferedInputStream.read(bArr, 0, 1024);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            bufferedInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null || bArrDigest.length <= 0) {
                return "";
            }
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i3 = 0;
            for (byte b : bArrDigest) {
                int i4 = i3 + 1;
                cArr2[i3] = cArr[(b >>> 4) & 15];
                i3 = i4 + 1;
                cArr2[i4] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return LIZJ(str.getBytes());
    }

    public static String LIZJ(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                char[] cArr = LIZ;
                stringBuffer.append(cArr[(b & 240) >> 4]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
