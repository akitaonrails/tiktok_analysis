package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;

/* JADX INFO: renamed from: X.010M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010M {
    public static final String LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = URLEncoder.encode(str, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = str;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (String) obj;
    }
}
