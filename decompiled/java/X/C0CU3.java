package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0CU3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CU3 {
    public static final Aweme LIZ(String str) {
        Object c098200Yq;
        Object obj = null;
        if (!C288600BSw.LIZIZ || str == null || str.length() == 0) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (Aweme) C1227904rF.LIZIZ(str, Aweme.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Aweme) obj;
    }
}
