package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2251708rz {
    public static final C2251708rz LIZ = new C2251708rz();
    public static final char[] LIZIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String LIZ(String str) {
        MessageDigest messageDigest;
        byte[] bArrDigest;
        boolean z;
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return "";
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        synchronized (C2251708rz.class) {
            try {
                bArrDigest = messageDigest.digest(bytes);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (bArrDigest != null) {
            if (bArrDigest.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
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
            return "";
        }
        return "";
    }
}
