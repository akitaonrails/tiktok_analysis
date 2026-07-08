package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.08wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2281108wj {
    public static final ExecutorService LIZ = C786410Ut5.h4();
    public static final C822650WOx LIZIZ;

    static {
        C822650WOx c822650WOx = new C822650WOx(10, 10, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        c822650WOx.allowCoreThreadTimeOut(true);
        LIZIZ = c822650WOx;
    }

    public static ExecutorService LIZ(EnumC2281308wl enumC2281308wl) {
        int i = C2281208wk.LIZ[enumC2281308wl.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return LIZIZ;
            }
            throw new C1954807lC();
        }
        return LIZ;
    }

    public static void LIZIZ(EnumC2281308wl enumC2281308wl, boolean z, Runnable runnable) {
        Object c098200Yq;
        try {
            c098200Yq = LIZ(enumC2281308wl).submit(runnable);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && !z) {
            throw thM5exceptionOrNullimpl;
        }
    }
}
