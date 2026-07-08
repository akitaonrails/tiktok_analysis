package X;

import com.ss.android.ugc.aweme.ml.ab.SmartLivePreviewStreamConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartLivePreviewStreamExperiment;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneMonitorConfig;

/* JADX INFO: renamed from: X.0pR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511440pR0 extends AbstractC1511510pR7 implements InterfaceC1488230opZ {
    public static final C1511440pR0 LIZ = new C1511440pR0();
    public static Boolean LIZIZ = Boolean.FALSE;
    public static C1511470pR3 LIZJ;
    public static SmartLivePreviewStreamConfig LIZLLL;
    public static int LJ;
    public static volatile boolean LJFF;

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 lastResult() {
        return null;
    }

    public C1511440pR0() {
        super(SmartLivePreviewStreamExperiment.SCENE);
    }

    public static boolean LIZJ() {
        SmartLivePreviewStreamConfig smartLivePreviewStreamConfig = LIZLLL;
        return (smartLivePreviewStreamConfig == null || !smartLivePreviewStreamConfig.delayPrepare || LJFF) ? false : true;
    }

    public final void LIZIZ() {
        SmartSceneMonitorConfig monitorConfig;
        C1511480pR4 c1511480pR4;
        Boolean bool = LIZIZ;
        if (bool != null) {
            bool.booleanValue();
            LIZIZ = Boolean.TRUE;
            SmartLivePreviewStreamConfig config = SmartLivePreviewStreamExperiment.INSTANCE.getConfig();
            if (config == null) {
                return;
            }
            LIZLLL = config;
            C1511470pR3 c1511470pR3 = new C1511470pR3(SmartLivePreviewStreamExperiment.SCENE);
            LIZJ = c1511470pR3;
            C1510230pP3 c1510230pP3 = new C1510230pP3(SmartLivePreviewStreamExperiment.SCENE);
            c1510230pP3.LIZIZ = LIZLLL;
            c1511470pR3.configService(c1510230pP3);
            SmartLivePreviewStreamConfig smartLivePreviewStreamConfig = LIZLLL;
            if (smartLivePreviewStreamConfig != null && smartLivePreviewStreamConfig.preload) {
                preloadEnv();
            }
            SmartLivePreviewStreamConfig smartLivePreviewStreamConfig2 = LIZLLL;
            if (smartLivePreviewStreamConfig2 == null || (monitorConfig = smartLivePreviewStreamConfig2.getMonitorConfig()) == null || !monitorConfig.getEnableMonitor() || (c1511480pR4 = C1511480pR4.LJIIZILJ.get(SmartLivePreviewStreamExperiment.SCENE)) == null) {
                return;
            }
            C1510500pPU c1510500pPU = new C1510500pPU(0, null, 0, 31);
            SmartLivePreviewStreamConfig smartLivePreviewStreamConfig3 = LIZLLL;
            c1510500pPU.LIZJ = smartLivePreviewStreamConfig3 != null ? smartLivePreviewStreamConfig3.getSkipCount() : 2;
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
        int skipCount;
        C1511470pR3 c1511470pR3;
        C1512100pS4 c1512100pS4RunSync;
        if (!enable() || LIZJ()) {
            return null;
        }
        SmartLivePreviewStreamConfig smartLivePreviewStreamConfig = LIZLLL;
        if (smartLivePreviewStreamConfig != null) {
            skipCount = smartLivePreviewStreamConfig.getSkipCount();
            if (skipCount > 0) {
            }
            c1511470pR3 = LIZJ;
            if (c1511470pR3 != null || (c1512100pS4RunSync = c1511470pR3.runSync(c1509310pNZ)) == null) {
                return null;
            }
            return c1512100pS4RunSync;
        }
        skipCount = 2;
        int i = LJ;
        if (i < skipCount) {
            int i2 = i + 1;
            LJ = i2;
            if (i2 + 1 >= skipCount) {
                preloadEnv();
            }
            return null;
        }
        c1511470pR3 = LIZJ;
        if (c1511470pR3 != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    @Override // X.InterfaceC1488230opZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(org.json.JSONObject r6, X.C1509310pNZ r7) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C1511360pQs.LIZ(r7)
            r4 = 0
            if (r0 == 0) goto L61
            java.lang.String r1 = r0.getAid()
            if (r1 == 0) goto L61
            X.0pO3 r0 = X.C1509610pO3.LIZIZ
            X.0pNr r1 = X.C1509610pO3.LIZ(r1)
            if (r1 != 0) goto L16
            return r4
        L16:
            java.lang.String r0 = "play_time"
            int r3 = X.C1509460pNo.LIZIZ(r1, r0)
            r1 = 8000(0x1f40, float:1.121E-41)
            r0 = 9000(0x2328, float:1.2612E-41)
            r2 = 1
            if (r1 > r3) goto L4d
            if (r3 >= r0) goto L26
            goto L50
        L26:
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 > r3) goto L4d
            if (r3 >= r1) goto L2f
            java.lang.String r1 = "gt9s"
            goto L52
        L2f:
            r0 = 11000(0x2af8, float:1.5414E-41)
            if (r1 > r3) goto L4d
            if (r3 >= r0) goto L38
            java.lang.String r1 = "gt10s"
            goto L52
        L38:
            r1 = 12000(0x2ee0, float:1.6816E-41)
            if (r0 > r3) goto L4d
            if (r3 >= r1) goto L41
            java.lang.String r1 = "gt11s"
            goto L52
        L41:
            r0 = 13000(0x32c8, float:1.8217E-41)
            if (r1 > r3) goto L4d
            if (r3 >= r0) goto L4a
            java.lang.String r1 = "gt12s"
            goto L52
        L4a:
            java.lang.String r1 = "gt13s"
            goto L52
        L4d:
            java.lang.String r1 = "lt8s"
            goto L52
        L50:
            java.lang.String r1 = "gt8s"
        L52:
            java.lang.String r0 = "ss_result"
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L58
            return r2
        L58:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "SmartPrerenderException"
            X.C1AF0.LJFF(r1, r0)
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1511440pR0.LIZ(org.json.JSONObject, X.0pNZ):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC1511510pR7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void runAsyncDelay(long r4, X.C1509310pNZ r6, X.InterfaceC1511740pRU r7) {
        /*
            r3 = this;
            boolean r0 = r3.enable()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r7 == 0) goto Lc
            r7.LIZ(r2)
        Lc:
            return
        Ld:
            boolean r0 = LIZJ()
            if (r0 == 0) goto L19
            if (r7 == 0) goto L18
            r7.LIZ(r2)
        L18:
            return
        L19:
            com.ss.android.ugc.aweme.ml.ab.SmartLivePreviewStreamConfig r0 = X.C1511440pR0.LIZLLL
            if (r0 == 0) goto L38
            int r1 = r0.getSkipCount()
            if (r1 <= 0) goto L3a
        L23:
            int r0 = X.C1511440pR0.LJ
            if (r0 >= r1) goto L3a
            int r0 = r0 + 1
            X.C1511440pR0.LJ = r0
            int r0 = r0 + 1
            if (r0 < r1) goto L32
            r3.preloadEnv()
        L32:
            if (r7 == 0) goto L37
            r7.LIZ(r2)
        L37:
            return
        L38:
            r1 = 2
            goto L23
        L3a:
            X.0pR3 r0 = X.C1511440pR0.LIZJ
            if (r0 == 0) goto L41
            r0.runAsync(r6, r7)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1511440pR0.runAsyncDelay(long, X.0pNZ, X.0pRU):void");
    }
}
