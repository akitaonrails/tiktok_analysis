package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;

/* JADX INFO: renamed from: X.08Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2085108Ev {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String LIZ(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = bArrDigest[i2];
                int i3 = i + 1;
                char[] cArr2 = LIZ;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
