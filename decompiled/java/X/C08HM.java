package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;

/* JADX INFO: renamed from: X.08HM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HM {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] LIZ(String str) {
        if (str != null && str.length() % 2 != 1) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(charArray[i], 16) << 4) + Character.digit(charArray[i + 1], 16));
            }
            return bArr;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hexBinary needs to be even-length: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZIZ(C0VSJ c0vsj) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            C0VSP c0vsp = new C0VSP(c0vsj);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = c0vsp.read(bArr, 0, 8192);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    c0vsp.close();
                    return LJ(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZJ(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return LJ(messageDigest.digest());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static String LIZLLL(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(bArr);
                    return LJ(messageDigest.digest());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static String LJ(byte[] bArr) {
        if (bArr != null) {
            return LJFF(bArr, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String LJFF(byte[] bArr, int i) {
        if (bArr != null) {
            if (i <= bArr.length) {
                int i2 = i * 2;
                char[] cArr = new char[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = bArr[i4] & 255;
                    int i6 = i3 + 1;
                    char[] cArr2 = LIZ;
                    cArr[i3] = cArr2[i5 >> 4];
                    i3 = i6 + 1;
                    cArr[i6] = cArr2[i5 & 15];
                }
                return new String(cArr, 0, i2);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
