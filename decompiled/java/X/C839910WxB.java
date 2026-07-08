package X;

import com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839910WxB {
    public static void LIZ(int i) {
        Object c098200Yq;
        try {
            TTNetServiceImpl.queryLruCache.resize(i);
            TTNetServiceImpl.cookieLruCache.resize(i);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }
}
