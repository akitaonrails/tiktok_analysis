package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: X.18gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21348018gY {
    public static C21347918gX LIZ(String str, String str2) {
        try {
            return new C21347918gX(str2, str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
