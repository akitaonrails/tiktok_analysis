package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.08G3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08G3 {
    public static String LIZ;

    public static String LIZ(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LIZIZ(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(C786410Ut5.j4("%02x", new Object[]{Byte.valueOf(b)}));
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LIZJ(String str, String str2) {
        byte[] bytes = str.getBytes();
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            return LIZIZ(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
