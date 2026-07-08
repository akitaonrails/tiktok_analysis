package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.experiment.ExplorePreConnectConfig;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreCacheMonitor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584550rKv {
    public static final C1584550rKv LIZ = new C1584550rKv();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicLong LIZLLL = new AtomicLong(0);

    public static void LIZ() throws JSONException {
        if (((Boolean) C282320B4s.LIZ.getValue()).booleanValue() && LIZIZ.compareAndSet(false, true)) {
            LIZLLL.set(System.currentTimeMillis());
            C1600620rkq.LIZ("weak_intent_scheduled", null, null, null, null, 30);
            C0CN5.LIZJ(8000L, new Runnable() { // from class: X.0rKz
                public static void LIZ() throws JSONException {
                    C1584550rKv.LIZ.getClass();
                    if (C1584550rKv.LIZJ.compareAndSet(false, true)) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - C1584550rKv.LIZLLL.get();
                        if (jCurrentTimeMillis < 0) {
                            jCurrentTimeMillis = 0;
                        }
                        C1600620rkq.LIZ("weak_intent_executed", null, null, Long.valueOf(jCurrentTimeMillis), null, 22);
                        if (!C296240BjK.LIZ() && C15T0.LIZ.compareAndSet(false, true)) {
                            C2493709pv.LIZ.getClass();
                            C2493709pv.LIZIZ();
                        }
                        C15T0.LIZ(new Runnable() { // from class: X.0Cvg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ExplorePerfPreloadInit@1ace.preloadExploreCacheMetadataOnly$1");
                                try {
                                    if (!C296240BjK.LIZ() && C15T0.LJFF.compareAndSet(false, true)) {
                                        try {
                                            ExploreCacheMonitor.INSTANCE.startReadCache(EnumC993440bxW.TYPE_PRELOAD);
                                            C15T0.LJII();
                                            C15T0.LJIIIIZZ();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C1AF0.LJFF(th, "ExplorePerfPreloadInit_weak_intent_log");
                                        }
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ExplorePerfPreloadInit@1ace.preloadExploreCacheMetadataOnly$1");
                            }
                        });
                        C2171408f2.LIZ.getClass();
                        if (((ExplorePreConnectConfig) C09E8.LIZIZ.getValue()).enable) {
                            C23250099c.LIZLLL(C2171408f2.LIZIZ, null, null, new C2171308f1(null), 3);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExploreTabWeakIntentPreloadTrigger@5d48.schedule$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreTabWeakIntentPreloadTrigger@5d48.schedule$1");
                }
            }, true);
        }
    }
}
