package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;

/* JADX INFO: renamed from: X.0WHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820840WHy {
    public static String LIZ(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length > 0) {
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                char[] cArr2 = new char[bArrDigest.length * 2];
                int i = 0;
                for (byte b : bArrDigest) {
                    int i2 = i + 1;
                    cArr2[i] = cArr[(b >>> 4) & 15];
                    i = i2 + 1;
                    cArr2[i2] = cArr[b & 15];
                }
                return new String(cArr2);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
