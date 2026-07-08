package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;

/* JADX INFO: renamed from: X.08HH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HH {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String LIZ(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return LIZIZ(messageDigest.digest());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static String LIZIZ(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= bArr.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (byte b : bArr) {
                    int i3 = b & 255;
                    int i4 = i2 + 1;
                    char[] cArr2 = LIZ;
                    cArr[i2] = cArr2[i3 >> 4];
                    i2 = i4 + 1;
                    cArr[i4] = cArr2[i3 & 15];
                }
                return new String(cArr, 0, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
