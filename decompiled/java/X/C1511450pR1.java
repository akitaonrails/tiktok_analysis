package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderExperiment;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneMonitorConfig;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pR1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511450pR1 extends AbstractC1511510pR7 implements InterfaceC1488230opZ {
    public static C1511470pR3 LIZJ;
    public static SmartPrerenderConfig LIZLLL;
    public static int LJ;
    public static final C1511450pR1 LIZ = new C1511450pR1();
    public static Boolean LIZIZ = Boolean.FALSE;
    public static final LruCache<String, C1512100pS4> LJFF = new LruCache<>(5);

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 lastResult() {
        return null;
    }

    public C1511450pR1() {
        super(SmartPrerenderExperiment.SCENE);
    }

    public static final void LIZIZ() {
        SmartSceneMonitorConfig monitorConfig;
        C1511480pR4 c1511480pR4;
        Boolean bool = LIZIZ;
        if (bool != null) {
            bool.booleanValue();
            LIZIZ = Boolean.TRUE;
            SmartPrerenderConfig config = SmartPrerenderExperiment.INSTANCE.getConfig();
            if (config == null) {
                return;
            }
            LIZLLL = config;
            C1511470pR3 c1511470pR3 = new C1511470pR3(SmartPrerenderExperiment.SCENE);
            LIZJ = c1511470pR3;
            C1510230pP3 c1510230pP3 = new C1510230pP3(SmartPrerenderExperiment.SCENE);
            c1510230pP3.LIZIZ = LIZLLL;
            c1511470pR3.configService(c1510230pP3);
            SmartPrerenderConfig smartPrerenderConfig = LIZLLL;
            if (smartPrerenderConfig == null || (monitorConfig = smartPrerenderConfig.getMonitorConfig()) == null || !monitorConfig.getEnableMonitor() || (c1511480pR4 = C1511480pR4.LJIIZILJ.get(SmartPrerenderExperiment.SCENE)) == null) {
                return;
            }
            C1510500pPU c1510500pPU = new C1510500pPU(0, null, 0, 31);
            SmartPrerenderConfig smartPrerenderConfig2 = LIZLLL;
            c1510500pPU.LIZJ = smartPrerenderConfig2 != null ? smartPrerenderConfig2.waitCountForMonitor : 3;
            c1510500pPU.LIZ = 103;
            c1511480pR4.LJII(c1510500pPU, LIZ);
        }
    }

    @Override // X.AbstractC1511510pR7
    public final boolean enable() {
        return LIZLLL != null;
    }

    @Override // X.AbstractC1511510pR7
    public final void preloadEnv() {
        C1511470pR3 c1511470pR3 = LIZJ;
        if (c1511470pR3 != null) {
            c1511470pR3.preloadEnv();
        }
    }

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 runSync(C1509310pNZ c1509310pNZ) {
        SmartPrerenderConfig smartPrerenderConfig;
        Aweme awemeLIZ;
        String aid;
        C1512100pS4 c1512100pS4;
        C1512100pS4 c1512100pS4RunSync = null;
        if (!enable() || (smartPrerenderConfig = LIZLLL) == null) {
            return null;
        }
        if (c1509310pNZ != null && (awemeLIZ = C1511360pQs.LIZ(c1509310pNZ)) != null && (aid = awemeLIZ.getAid()) != null) {
            if (smartPrerenderConfig.getSkipCount() > 0 && LJ < smartPrerenderConfig.getSkipCount()) {
                int i = LJ + 1;
                LJ = i;
                if (i + 1 >= smartPrerenderConfig.getSkipCount()) {
                    preloadEnv();
                }
                return null;
            }
            if (Intrinsics.LJFF(c1509310pNZ.LIZJ, "enable_cache") && (c1512100pS4 = LJFF.get(aid)) != null) {
                return c1512100pS4;
            }
            C1511470pR3 c1511470pR3 = LIZJ;
            if (c1511470pR3 != null && (c1512100pS4RunSync = c1511470pR3.runSync(c1509310pNZ)) != null && c1512100pS4RunSync.LIZIZ()) {
                LJFF.put(aid, c1512100pS4RunSync);
            }
        }
        return c1512100pS4RunSync;
    }

    @Override // X.InterfaceC1488230opZ
    public final boolean LIZ(JSONObject jSONObject, C1509310pNZ c1509310pNZ) {
        String aid;
        String str;
        SmartPrerenderConfig smartPrerenderConfig = LIZLLL;
        if (smartPrerenderConfig != null) {
            long j = smartPrerenderConfig.timeThreshold;
            Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
            if (awemeLIZ != null && (aid = awemeLIZ.getAid()) != null) {
                C1509610pO3 c1509610pO3 = C1509610pO3.LIZIZ;
                if (C1509610pO3.LIZ(aid) == null) {
                    return false;
                }
                try {
                    if (C1509460pNo.LIZIZ(r1, "play_time") > j) {
                        str = "gt";
                    } else {
                        str = "lt";
                    }
                    jSONObject.put("ss_result", str);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJFF(th, "SmartPrerenderException");
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public final void runAsyncDelay(long j, C1509310pNZ c1509310pNZ, final InterfaceC1511740pRU interfaceC1511740pRU) {
        Aweme awemeLIZ;
        C1512100pS4 c1512100pS4;
        final String aid = null;
        if (!enable()) {
            if (interfaceC1511740pRU != null) {
                interfaceC1511740pRU.LIZ(null);
                return;
            }
            return;
        }
        SmartPrerenderConfig smartPrerenderConfig = LIZLLL;
        if (smartPrerenderConfig != null && c1509310pNZ != null && (awemeLIZ = C1511360pQs.LIZ(c1509310pNZ)) != null && awemeLIZ.getAid() != null) {
            if (smartPrerenderConfig.getSkipCount() > 0 && LJ < smartPrerenderConfig.getSkipCount()) {
                int i = LJ + 1;
                LJ = i;
                if (i + 1 >= smartPrerenderConfig.getSkipCount()) {
                    preloadEnv();
                }
                if (interfaceC1511740pRU != null) {
                    interfaceC1511740pRU.LIZ(null);
                    return;
                }
                return;
            }
            Aweme awemeLIZ2 = C1511360pQs.LIZ(c1509310pNZ);
            if (awemeLIZ2 != null) {
                aid = awemeLIZ2.getAid();
            }
            if (Intrinsics.LJFF(c1509310pNZ.LIZJ, "enable_cache") && (c1512100pS4 = LJFF.get(aid)) != null) {
                if (interfaceC1511740pRU != null) {
                    interfaceC1511740pRU.LIZ(c1512100pS4);
                    return;
                }
                return;
            } else {
                C1511470pR3 c1511470pR3 = LIZJ;
                if (c1511470pR3 != null) {
                    c1511470pR3.runAsync(c1509310pNZ, new InterfaceC1511740pRU() { // from class: X.0pRA
                        @Override // X.InterfaceC1511740pRU
                        public final void LIZ(C1512100pS4 c1512100pS42) {
                            if (c1512100pS42 != null && c1512100pS42.LIZIZ()) {
                                C1511450pR1.LJFF.put(aid, c1512100pS42);
                            }
                            InterfaceC1511740pRU interfaceC1511740pRU2 = interfaceC1511740pRU;
                            if (interfaceC1511740pRU2 != null) {
                                interfaceC1511740pRU2.LIZ(c1512100pS42);
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (interfaceC1511740pRU != null) {
            interfaceC1511740pRU.LIZ(null);
        }
    }
}
