package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.08GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GQ {
    static {
        Charset.forName("UTF-8");
    }

    public static byte[] LIZ(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
