package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Hig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448720Hig {
    public static String LIZ(String str) {
        try {
            return a0.LJJJJJL('0', 32, new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8))).toString(16));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
