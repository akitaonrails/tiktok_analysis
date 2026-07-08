package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.08Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084908Et {
    public static String LIZ(byte[] bArr) {
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

    public static String LIZIZ(String str) {
        String str2 = "MD5";
        byte[] bytes = str.getBytes();
        try {
            if (C2093608Ic.LJ("MD5")) {
                str2 = "SHA-256";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            return LIZ(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
