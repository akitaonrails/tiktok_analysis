package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.08F0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F0 {
    public static String LIZIZ() {
        if (TextUtils.isEmpty("")) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update("".getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toString(i, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append(C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(cCharAt)}));
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }
}
