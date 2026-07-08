package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.08Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2085008Eu {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String LIZ(String str) {
        byte[] bArrDigest;
        int length;
        if (str == null || str.length() == 0) {
            return "";
        }
        byte[] bytes = str.getBytes();
        if (bytes != null && bytes.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
                bArrDigest = null;
            }
        } else {
            bArrDigest = null;
        }
        if (bArrDigest == null || (length = bArrDigest.length) <= 0) {
            return "";
        }
        char[] cArr = new char[length << 1];
        int i = 0;
        for (byte b : bArrDigest) {
            int i2 = i + 1;
            char[] cArr2 = LIZ;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
