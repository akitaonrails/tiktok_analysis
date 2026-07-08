package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.08sR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2254508sR {
    public static final MessageDigest LIZ;
    public static final char[] LIZIZ;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            messageDigest = null;
        }
        LIZ = messageDigest;
        LIZIZ = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String LIZ(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = LIZ;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (C2254508sR.class) {
            try {
                bArrDigest = messageDigest.digest(bytes);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (bArrDigest != null && bArrDigest.length != 0) {
            char[] cArr = new char[bArrDigest.length << 1];
            int i = 0;
            for (byte b : bArrDigest) {
                int i2 = i + 1;
                char[] cArr2 = LIZIZ;
                cArr[i] = cArr2[(b & 240) >> 4];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        }
        return null;
    }
}
