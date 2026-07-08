package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08Er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084708Er {
    public static String LIZ(String str) {
        byte[] bytes;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (str != null && (bytes = str.getBytes(Charsets.UTF_8)) != null) {
                messageDigest.update(bytes);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("MD5 hashing algorithm not found", e);
        }
    }
}
