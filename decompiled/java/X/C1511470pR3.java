package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.infra.CollectingTimingConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pR3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511470pR3 extends AbstractC1511510pR7 {
    public final String LIZ;
    public AbstractC1511520pR8 LIZIZ;
    public C1511480pR4 LIZJ;
    public OneSmartDataTrackConfig LIZLLL;
    public String LJ;
    public C1512100pS4 LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final void LIZLLL() {
        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        if (abstractC1511520pR8 != null) {
            if (!this.LJIIJ || (this.LJII < 12 && !abstractC1511520pR8.LJ())) {
                C1511480pR4 c1511480pR4 = this.LIZJ;
                if (c1511480pR4 != null && !c1511480pR4.LJII) {
                    c1511480pR4.LJIIIZ.LIZ = System.currentTimeMillis();
                }
                synchronized (this) {
                    try {
                        abstractC1511520pR8.LJFF();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C1511480pR4 c1511480pR42 = this.LIZJ;
                if (c1511480pR42 != null && !c1511480pR42.LJII) {
                    c1511480pR42.LJII = true;
                    c1511480pR42.LJIIIZ.LIZIZ = System.currentTimeMillis();
                }
                this.LJIIJ = true;
            }
        }
    }

    @Override // X.AbstractC1511510pR7
    public final boolean checkIfOffload() {
        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        if (abstractC1511520pR8 != null) {
            return abstractC1511520pR8.LIZ();
        }
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public final boolean enable() {
        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        if (abstractC1511520pR8 != null) {
            return abstractC1511520pR8.LIZJ();
        }
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public final boolean isEnvReady() {
        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        if (abstractC1511520pR8 != null) {
            return abstractC1511520pR8.LJ();
        }
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public final void releaseModel() {
        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        if (abstractC1511520pR8 != null) {
            abstractC1511520pR8.LJII();
        }
    }

    @Override // X.AbstractC1511510pR7
    public final void preloadEnv() {
        if (enable()) {
            C1511690pRP.LIZIZ(new Runnable() { // from class: X.0pR9
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SmartCommonService@e90e.preloadEnv$1");
                    try {
                        this.LL.LIZLLL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SmartCommonService@e90e.preloadEnv$1");
                }
            });
        }
    }

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 lastResult() {
        return this.LJFF;
    }

    public C1511470pR3(String str) {
        super(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ml#");
        sbLIZ.append(str);
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LIZIZ(C1509310pNZ c1509310pNZ) {
        String str;
        String str2;
        C1510230pP3 c1510230pP3;
        List<String> listLJ;
        SmartSceneConfig smartSceneConfigLIZJ;
        CollectingTimingConfig uploadTiming;
        SmartSceneConfig smartSceneConfig;
        CollectingTimingConfig collectTiming;
        OneSmartDataTrackConfig oneSmartDataTrackConfig = this.LIZLLL;
        if (oneSmartDataTrackConfig != null) {
            SmartDataTrackerService.Companion.getClass();
            ISmartDataTrackerService iSmartDataTrackerService = C1512160pSA.LIZ;
            if (iSmartDataTrackerService.enable(oneSmartDataTrackConfig.getScene())) {
                if (oneSmartDataTrackConfig.getTrackType() == 0) {
                    String scene = oneSmartDataTrackConfig.getScene();
                    C1509310pNZ c1509310pNZ2 = new C1509310pNZ(0);
                    C1511360pQs.LIZLLL(c1509310pNZ2, c1509310pNZ);
                    iSmartDataTrackerService.onScenePredictCheckOrRun(scene, c1509310pNZ2);
                }
                if (oneSmartDataTrackConfig.getRealTriggerType() == 0) {
                    String scene2 = oneSmartDataTrackConfig.getScene();
                    C1509310pNZ c1509310pNZ3 = new C1509310pNZ(0);
                    C1511360pQs.LIZLLL(c1509310pNZ3, c1509310pNZ);
                    iSmartDataTrackerService.onSceneRealCheckAndReport(scene2, c1509310pNZ3);
                }
            }
        }
        C1510230pP3 c1510230pP32 = this.config;
        if (c1510230pP32 != null && (smartSceneConfig = c1510230pP32.LIZIZ) != null && (collectTiming = smartSceneConfig.getCollectTiming()) != null) {
            str = collectTiming.eventName;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "client_ai_scene_predict")) {
            SmartDataCollectorService.LIZ.getClass();
            SmartDataCollectorService value = C1510760pPu.LIZIZ.getValue();
            if (value != null) {
                String str3 = this.name;
                C1509310pNZ c1509310pNZ4 = new C1509310pNZ(0);
                C1511360pQs.LIZLLL(c1509310pNZ4, c1509310pNZ);
                value.LIZ(str3, c1509310pNZ4);
            }
        }
        C1510230pP3 c1510230pP33 = this.config;
        if (c1510230pP33 != null && (smartSceneConfigLIZJ = C1511360pQs.LIZJ(c1510230pP33)) != null && (uploadTiming = smartSceneConfigLIZJ.getUploadTiming()) != null) {
            str2 = uploadTiming.eventName;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "client_ai_scene_predict") || ((c1510230pP3 = this.config) != null && (listLJ = C1511360pQs.LJ(c1510230pP3)) != null && listLJ.contains("client_ai_scene_predict"))) {
            SmartDataCollectorService.LIZ.getClass();
            SmartDataCollectorService value2 = C1510760pPu.LIZIZ.getValue();
            if (value2 != null) {
                String str4 = this.name;
                C1509310pNZ c1509310pNZ5 = new C1509310pNZ(0);
                C1511360pQs.LIZLLL(c1509310pNZ5, c1509310pNZ);
                value2.LIZIZ(str4, c1509310pNZ5);
            }
        }
        C1511480pR4 c1511480pR4 = this.LIZJ;
        if (c1511480pR4 != null) {
            c1511480pR4.LJ(0);
            c1511480pR4.LJIIJ.LIZ = System.currentTimeMillis();
            c1511480pR4.LJI++;
            c1511480pR4.LJIIJJI.LIZ = System.currentTimeMillis();
        }
        String str5 = this.LJ;
        if (str5 != null) {
            if (c1509310pNZ != null) {
                JSONObject jSONObjectLIZJ = C1509290pNX.LIZJ(str5, c1509310pNZ, this.name);
                if (jSONObjectLIZJ == null) {
                    C1511480pR4 c1511480pR42 = this.LIZJ;
                    if (c1511480pR42 != null) {
                        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
                        if (abstractC1511520pR8 != null) {
                            c1511480pR42.LIZLLL(-3, abstractC1511520pR8);
                        }
                    }
                    return -3;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObjectLIZJ.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectLIZJ.opt(next);
                    if (!(objOpt instanceof Number) && !(objOpt instanceof String) && !(objOpt instanceof Boolean)) {
                        linkedHashMap.put(next, null);
                    } else {
                        linkedHashMap.put(next, objOpt);
                    }
                }
                c1509310pNZ.LIZIZ().putAll(linkedHashMap);
            }
        } else {
            if (c1509310pNZ != null) {
                c1509310pNZ.LIZLLL = false;
            }
            C1509290pNX.LIZIZ(this.config, c1509310pNZ);
        }
        C1511480pR4 c1511480pR43 = this.LIZJ;
        if (c1511480pR43 != null) {
            c1511480pR43.LJIIJJI.LIZIZ = System.currentTimeMillis();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01b9  */
    @Override // X.AbstractC1511510pR7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configService(final X.C1510230pP3 r20) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1511470pR3.configService(X.0pP3):void");
    }

    @Override // X.AbstractC1511510pR7
    public final void downloadModel(InterfaceC1511740pRU interfaceC1511740pRU) {
        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        if (abstractC1511520pR8 != null) {
            abstractC1511520pR8.LIZIZ(interfaceC1511740pRU);
        }
    }

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 runSync(C1509310pNZ c1509310pNZ) {
        long jCurrentTimeMillis;
        AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        Aweme awemeLIZ = null;
        if (abstractC1511520pR8 == null) {
            return null;
        }
        if (!abstractC1511520pR8.LJIIJ()) {
            return super.runSync(c1509310pNZ);
        }
        if (!abstractC1511520pR8.LIZLLL()) {
            this.LJII++;
            if (C1511670pRN.LIZ) {
                String str = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("runSync end, skip, base env not ready envNotReadyTimes:");
                sbLIZ.append(this.LJII);
                C1511670pRN.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ), null);
            }
            C1511480pR4 c1511480pR4 = this.LIZJ;
            if (c1511480pR4 != null) {
                c1511480pR4.LIZLLL(-2, abstractC1511520pR8);
            }
            return new C1512100pS4(-2);
        }
        if (this.LJIIIIZZ > 16) {
            if (C1511670pRN.LIZ) {
                String str2 = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("runSync end, skip, continues failed failTimes:");
                sbLIZ2.append(this.LJIIIIZZ);
                C1511670pRN.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            C1511480pR4 c1511480pR42 = this.LIZJ;
            if (c1511480pR42 != null) {
                c1511480pR42.LIZLLL(-7, abstractC1511520pR8);
            }
            return new C1512100pS4(-7);
        }
        try {
            synchronized (this) {
                try {
                    if (this.LJI) {
                        C1511480pR4 c1511480pR43 = this.LIZJ;
                        if (c1511480pR43 != null) {
                            c1511480pR43.LIZLLL(-9, abstractC1511520pR8);
                        }
                        return new C1512100pS4(-9);
                    }
                    this.LJI = true;
                    LIZLLL();
                    if (!abstractC1511520pR8.LJ()) {
                        this.LJII++;
                        if (C1511670pRN.LIZ) {
                            String str3 = this.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("runSync end, skip, env not ready envNotReadyTimes:");
                            sbLIZ3.append(this.LJII);
                            C1511670pRN.LIZJ(str3, C2188811AlT.LIZIZ(sbLIZ3), null);
                        }
                        C1511480pR4 c1511480pR44 = this.LIZJ;
                        if (c1511480pR44 != null) {
                            c1511480pR44.LIZLLL(-2, abstractC1511520pR8);
                        }
                        this.LJI = false;
                        return new C1512100pS4(-2);
                    }
                    int iLIZIZ = LIZIZ(c1509310pNZ);
                    if (iLIZIZ < 0) {
                        C1511480pR4 c1511480pR45 = this.LIZJ;
                        if (c1511480pR45 != null) {
                            c1511480pR45.LIZLLL(iLIZIZ, abstractC1511520pR8);
                        }
                        this.LJI = false;
                        return new C1512100pS4(iLIZIZ);
                    }
                    boolean z = C1511670pRN.LIZ;
                    if (z) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    C1512100pS4 c1512100pS4LJIIIZ = abstractC1511520pR8.LJIIIZ(c1509310pNZ);
                    C1511480pR4 c1511480pR46 = this.LIZJ;
                    if (c1511480pR46 != null) {
                        c1511480pR46.LJFF(c1509310pNZ, c1512100pS4LJIIIZ, abstractC1511520pR8);
                    }
                    LIZJ(c1509310pNZ, c1512100pS4LJIIIZ);
                    if (z) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        String str4 = this.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("runSync end, cost:");
                        sbLIZ4.append(jCurrentTimeMillis2);
                        sbLIZ4.append(" result:");
                        sbLIZ4.append(c1512100pS4LJIIIZ);
                        C1511670pRN.LIZ(str4, C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (c1512100pS4LJIIIZ == null || !c1512100pS4LJIIIZ.LIZIZ()) {
                        this.LJIIIIZZ++;
                    } else {
                        this.LJIIIIZZ = 0;
                        C1509240pNS c1509240pNS = C1509240pNS.LIZ;
                        C1510230pP3 c1510230pP3 = this.config;
                        String str5 = this.name;
                        if (c1509310pNZ != null) {
                            awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
                        }
                        c1509240pNS.getClass();
                        C1509240pNS.LIZJ(c1510230pP3, str5, awemeLIZ, c1512100pS4LJIIIZ);
                    }
                    this.LJFF = c1512100pS4LJIIIZ;
                    this.LJI = false;
                    return c1512100pS4LJIIIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1511670pRN.LIZIZ().LIZIZ();
            C1AF0.LJ(th2);
            C1511480pR4 c1511480pR47 = this.LIZJ;
            if (c1511480pR47 != null) {
                c1511480pR47.LIZLLL(-6, abstractC1511520pR8);
            }
            this.LJI = false;
            return new C1512100pS4(-6);
        }
    }

    public final void LIZJ(C1509310pNZ c1509310pNZ, C1512100pS4 c1512100pS4) {
        if (C1511670pRN.LIZ && c1509310pNZ != null) {
            HashMap map = new HashMap();
            for (Map.Entry<String, Object> entry : c1509310pNZ.LIZIZ().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof Number) || ((Number) value).floatValue() != 0.0f) {
                    if (value != null) {
                        map.put(key, value);
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" run data for debug");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Input: ");
            sbLIZ2.append(map);
            sbLIZ2.append(", output: ");
            sbLIZ2.append(c1512100pS4);
            C1511670pRN.LIZJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null);
        }
    }

    @Override // X.AbstractC1511510pR7
    public final C1510130pOt callExtMethod(String str, C1510130pOt c1510130pOt) {
        if (Intrinsics.LJFF(str, "getSmartRunner")) {
            C1510130pOt c1510130pOt2 = new C1510130pOt();
            c1510130pOt2.LJ(this.LIZIZ, "result");
            return c1510130pOt2;
        }
        return null;
    }

    @Override // X.AbstractC1511510pR7
    public final void runAsyncDelay(long j, final C1509310pNZ c1509310pNZ, final InterfaceC1511740pRU interfaceC1511740pRU) {
        final AbstractC1511520pR8 abstractC1511520pR8 = this.LIZIZ;
        if (abstractC1511520pR8 == null) {
            if (interfaceC1511740pRU != null) {
                interfaceC1511740pRU.LIZ(null);
                return;
            }
            return;
        }
        if (!abstractC1511520pR8.LIZLLL()) {
            this.LJII++;
            if (C1511670pRN.LIZ) {
                String str = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("runAsyncDelay end, skip, base env not ready envNotReadyTimes:");
                sbLIZ.append(this.LJII);
                C1511670pRN.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ), null);
            }
            C1511480pR4 c1511480pR4 = this.LIZJ;
            if (c1511480pR4 != null) {
                c1511480pR4.LIZLLL(-2, abstractC1511520pR8);
            }
            if (interfaceC1511740pRU != null) {
                interfaceC1511740pRU.LIZ(new C1512100pS4(-2));
                return;
            }
            return;
        }
        if (this.LJIIIIZZ > 16) {
            if (C1511670pRN.LIZ) {
                String str2 = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("runAsyncDelay end, skip, continues failed failTimes:");
                sbLIZ2.append(this.LJIIIIZZ);
                C1511670pRN.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            C1511480pR4 c1511480pR42 = this.LIZJ;
            if (c1511480pR42 != null) {
                c1511480pR42.LIZLLL(-7, abstractC1511520pR8);
            }
            if (interfaceC1511740pRU != null) {
                interfaceC1511740pRU.LIZ(new C1512100pS4(-7));
                return;
            }
            return;
        }
        C1511690pRP.LIZJ(j, new Runnable() { // from class: X.0pR5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [X.0pR6] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void LIZ() {
                try {
                    C1511470pR3 c1511470pR3 = this.LL;
                    if (c1511470pR3.LJI) {
                        C1511480pR4 c1511480pR43 = c1511470pR3.LIZJ;
                        if (c1511480pR43 != null) {
                            c1511480pR43.LIZLLL(-9, abstractC1511520pR8);
                        }
                        InterfaceC1511740pRU interfaceC1511740pRU2 = interfaceC1511740pRU;
                        if (interfaceC1511740pRU2 != null) {
                            interfaceC1511740pRU2.LIZ(new C1512100pS4(-9));
                            return;
                        }
                        return;
                    }
                    c1511470pR3.LJI = true;
                    c1511470pR3.LIZLLL();
                    if (!abstractC1511520pR8.LJ()) {
                        C1511470pR3 c1511470pR32 = this.LL;
                        c1511470pR32.LJII++;
                        if (C1511670pRN.LIZ) {
                            String str3 = c1511470pR32.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("runAsyncDelay end, skip, env not ready envNotReadyTimes:");
                            sbLIZ3.append(this.LL.LJII);
                            C1511670pRN.LIZJ(str3, C2188811AlT.LIZIZ(sbLIZ3), null);
                        }
                        C1511480pR4 c1511480pR44 = this.LL.LIZJ;
                        if (c1511480pR44 != null) {
                            c1511480pR44.LIZLLL(-2, abstractC1511520pR8);
                        }
                        InterfaceC1511740pRU interfaceC1511740pRU3 = interfaceC1511740pRU;
                        if (interfaceC1511740pRU3 != null) {
                            interfaceC1511740pRU3.LIZ(new C1512100pS4(-2));
                        }
                        this.LL.LJI = false;
                        return;
                    }
                    int iLIZIZ = this.LL.LIZIZ(c1509310pNZ);
                    if (iLIZIZ >= 0) {
                        final long jCurrentTimeMillis = C1511670pRN.LIZ ? System.currentTimeMillis() : 0L;
                        final AbstractC1511520pR8 abstractC1511520pR82 = abstractC1511520pR8;
                        final C1509310pNZ c1509310pNZ2 = c1509310pNZ;
                        final C1511470pR3 c1511470pR33 = this.LL;
                        final InterfaceC1511740pRU interfaceC1511740pRU4 = interfaceC1511740pRU;
                        abstractC1511520pR82.LJIIIIZZ(c1509310pNZ2, new InterfaceC1511740pRU() { // from class: X.0pR6
                            @Override // X.InterfaceC1511740pRU
                            public final void LIZ(C1512100pS4 c1512100pS4) {
                                Aweme awemeLIZ;
                                C1511470pR3 c1511470pR34 = c1511470pR33;
                                c1511470pR34.LJI = false;
                                c1511470pR34.LIZJ(c1509310pNZ2, c1512100pS4);
                                C1511480pR4 c1511480pR45 = c1511470pR33.LIZJ;
                                if (c1511480pR45 != null) {
                                    c1511480pR45.LJFF(c1509310pNZ2, c1512100pS4, abstractC1511520pR82);
                                }
                                c1511470pR33.LJFF = c1512100pS4;
                                InterfaceC1511740pRU interfaceC1511740pRU5 = interfaceC1511740pRU4;
                                if (interfaceC1511740pRU5 != null) {
                                    interfaceC1511740pRU5.LIZ(c1512100pS4);
                                }
                                if (c1512100pS4 != null && c1512100pS4.LIZIZ()) {
                                    C1511470pR3 c1511470pR35 = c1511470pR33;
                                    c1511470pR35.LJIIIIZZ = 0;
                                    C1509240pNS c1509240pNS = C1509240pNS.LIZ;
                                    C1510230pP3 c1510230pP3 = c1511470pR35.config;
                                    String str4 = c1511470pR35.name;
                                    C1509310pNZ c1509310pNZ3 = c1509310pNZ2;
                                    if (c1509310pNZ3 != null) {
                                        awemeLIZ = C1511360pQs.LIZ(c1509310pNZ3);
                                    } else {
                                        awemeLIZ = null;
                                    }
                                    c1509240pNS.getClass();
                                    C1509240pNS.LIZJ(c1510230pP3, str4, awemeLIZ, c1512100pS4);
                                } else {
                                    c1511470pR33.LJIIIIZZ++;
                                }
                                if (C1511670pRN.LIZ) {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                    C1511670pRN.LIZ(c1511470pR33.LIZ, "run end, cost:" + jCurrentTimeMillis2 + " result:" + c1512100pS4);
                                }
                            }
                        });
                        return;
                    }
                    C1511480pR4 c1511480pR45 = this.LL.LIZJ;
                    if (c1511480pR45 != null) {
                        c1511480pR45.LIZLLL(iLIZIZ, abstractC1511520pR8);
                    }
                    this.LL.LJI = false;
                    InterfaceC1511740pRU interfaceC1511740pRU5 = interfaceC1511740pRU;
                    if (interfaceC1511740pRU5 != null) {
                        interfaceC1511740pRU5.LIZ(new C1512100pS4(iLIZIZ));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1511670pRN.LIZIZ().LIZIZ();
                    C1AF0.LJFF(th, "SmartCommonService");
                    C1511480pR4 c1511480pR46 = this.LL.LIZJ;
                    if (c1511480pR46 != null) {
                        c1511480pR46.LIZLLL(-6, abstractC1511520pR8);
                    }
                    InterfaceC1511740pRU interfaceC1511740pRU6 = interfaceC1511740pRU;
                    if (interfaceC1511740pRU6 != null) {
                        interfaceC1511740pRU6.LIZ(new C1512100pS4(-6));
                    }
                    this.LL.LJI = false;
                    if (C1511670pRN.LIZ) {
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SmartCommonService@e90e.runAsyncDelay$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SmartCommonService@e90e.runAsyncDelay$1");
            }
        });
    }
}
