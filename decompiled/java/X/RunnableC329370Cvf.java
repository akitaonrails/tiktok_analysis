package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreCacheMonitor;

/* JADX INFO: renamed from: X.0Cvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC329370Cvf implements Runnable {
    public static final RunnableC329370Cvf LL = new RunnableC329370Cvf();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ExplorePerfPreloadInit@1ace.preloadExploreCache$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExplorePerfPreloadInit@1ace.preloadExploreCache$1");
    }

    public static void LIZ() {
        if (C296240BjK.LIZ() || ((Number) C04WX.LIZ.getValue()).intValue() == 0 || !C15T0.LIZIZ.compareAndSet(false, true)) {
            return;
        }
        try {
            ExploreCacheMonitor.INSTANCE.startReadCache(EnumC993440bxW.TYPE_PRELOAD);
            C15T0.LJII();
            C15T0.LJIIIIZZ();
            C15T0.LJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "ExplorePerfPreloadInit_log");
        }
    }
}
