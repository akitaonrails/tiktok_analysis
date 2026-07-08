package X;

import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513840pUs implements C0Z0G {
    public final TarsConfig.TaskConfig LIZ;
    public final String LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 173));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 174));

    @Override // X.C0Z03
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C0Z03
    public final boolean LJ() {
        return true;
    }

    @Override // X.C0Z03
    public final void releaseResource() {
        AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) this.LIZLLL.getValue();
        if (abstractC1511510pR7 != null) {
            abstractC1511510pR7.releaseModel();
        }
    }

    @Override // X.InterfaceC892680Z0g, X.C0Z03
    public final TarsConfig.TaskConfig LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC892680Z0g
    public final String getName() {
        return this.LIZIZ;
    }

    public C1513840pUs(TarsConfig.TaskConfig taskConfig) {
        this.LIZ = taskConfig;
        this.LIZIZ = taskConfig.task;
    }

    @Override // X.C0Z03
    public final Object LIZ(C0Z01 c0z01) {
        PitayaResourceHelper pitayaResourceHelper = PitayaResourceHelper.LIZ;
        String scene = ((SmartSceneConfig) this.LIZJ.getValue()).getScene();
        if (scene == null) {
            scene = "";
        }
        return pitayaResourceHelper.LIZIZ(scene, true, c0z01);
    }

    @Override // X.C0Z03
    public final Object LIZIZ(final InterfaceC882520Yji interfaceC882520Yji, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) this.LIZLLL.getValue();
        if (abstractC1511510pR7 != null) {
            abstractC1511510pR7.downloadModel(new InterfaceC1511740pRU() { // from class: X.0pUw
                @Override // X.InterfaceC1511740pRU
                public final void LIZ(C1512100pS4 c1512100pS4) {
                    if (c1512100pS4 != null && c1512100pS4.LIZ == 0) {
                        InterfaceC882520Yji interfaceC882520Yji2 = interfaceC882520Yji;
                        if (interfaceC882520Yji2 != null) {
                            interfaceC882520Yji2.onSuccess(c1512100pS4);
                            return;
                        }
                        return;
                    }
                    InterfaceC882520Yji interfaceC882520Yji3 = interfaceC882520Yji;
                    if (interfaceC882520Yji3 == null) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pitaya error with ");
                    Integer numValueOf = null;
                    if (c1512100pS4 != null) {
                        numValueOf = Integer.valueOf(c1512100pS4.LIZ);
                    }
                    sbLIZ.append(numValueOf);
                    interfaceC882520Yji3.LIZ(new C892820Z0u(C2188811AlT.LIZIZ(sbLIZ), "runtime"));
                }
            });
        } else if (interfaceC882520Yji != null) {
            interfaceC882520Yji.LIZ(new C892820Z0u("smartService is null", "runtime"));
        }
        return Unit.LIZ;
    }

    @Override // X.C0Z0G
    public final Object LIZJ(InterfaceC882480Yje interfaceC882480Yje, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws C892820Z0u {
        if (this.LIZ.batch) {
            Object objLJIIL = LJIIL(interfaceC882480Yje, interfaceC1364105Vn);
            if (objLJIIL == C099R.LJFF()) {
                return objLJIIL;
            }
            return Unit.LIZ;
        }
        Object objLJIILIIL = LJIILIIL(interfaceC882480Yje.LIZ(), interfaceC1364105Vn);
        if (objLJIILIIL == C099R.LJFF()) {
            return objLJIILIIL;
        }
        return Unit.LIZ;
    }

    @Override // X.C0Z03
    public final Object LJI(C0Z08 c0z08, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) this.LIZLLL.getValue();
        if (abstractC1511510pR7 != null) {
            abstractC1511510pR7.preloadEnv();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC882480Yje r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) throws X.C892820Z0u {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1513870pUv
            if (r0 == 0) goto L77
            r5 = r10
            X.0pUv r5 = (X.C1513870pUv) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r7 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            if (r0 == 0) goto L6f
            if (r0 != r4) goto L8c
            X.0YkJ r3 = r5.LL
            X.C155000ia.LIZIZ(r7)
        L24:
            X.0pS4 r7 = (X.C1512100pS4) r7
            if (r7 == 0) goto L82
            int r0 = r7.LIZ
            if (r0 == 0) goto L52
            X.0Z0u r2 = new X.0Z0u
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pitaya task failed with error Code "
            r1.append(r0)
            int r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = " in scene "
            r1.append(r0)
            java.lang.String r0 = r8.LIZIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "runtime"
            r2.<init>(r1, r0)
            r3.LJFF(r2)
        L52:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "pitaya_output"
            r1.<init>(r0, r7)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            r3.LIZIZ(r0)
            X.0YkJ r3 = r3.LJI
        L62:
            if (r3 == 0) goto L7d
            r5.LL = r3
            r5.LLILZ = r4
            java.lang.Object r7 = r8.LJIILIIL(r3, r5)
            if (r7 != r6) goto L24
            return r6
        L6f:
            X.C155000ia.LIZIZ(r7)
            X.0YkJ r3 = r9.LIZ()
            goto L62
        L77:
            X.0pUv r5 = new X.0pUv
            r5.<init>(r8, r10)
            goto L12
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L82:
            X.0Z0u r2 = new X.0Z0u
            java.lang.String r1 = "get null smartOutputData"
            java.lang.String r0 = "runtime"
            r2.<init>(r1, r0)
            throw r2
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513840pUs.LJIIL(X.0Yje, X.05Vn):java.lang.Object");
    }

    public final Object LJIILIIL(final C882890YkJ c882890YkJ, InterfaceC1364105Vn<? super C1512100pS4> interfaceC1364105Vn) {
        TarsConfig.EngineConfig engineConfig;
        Map<String, String> map;
        String str;
        List listLJJLIIIJILLIZJL;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
        TarsConfig.Engine engine = this.LIZ.engine;
        if (engine != null && (engineConfig = engine.config) != null && (map = engineConfig.inferenceParams) != null && (str = map.get("feature_keys")) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"|"}, 0, 6)) != null && (!listLJJLIIIJILLIZJL.isEmpty())) {
            Map<String, Object> map2 = c882890YkJ.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                if (listLJJLIIIJILLIZJL != null && listLJJLIIIJILLIZJL.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            c1509310pNZ.LIZIZ().putAll(linkedHashMap);
        } else {
            c1509310pNZ.LIZIZ().putAll(c882890YkJ.LIZIZ);
        }
        AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) this.LIZLLL.getValue();
        if (abstractC1511510pR7 != null) {
            abstractC1511510pR7.runAsync(c1509310pNZ, new InterfaceC1511740pRU() { // from class: X.0pUt
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
                /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r9v3, types: [X.13BV] */
                @Override // X.InterfaceC1511740pRU
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C1512100pS4 r28) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 812
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1513850pUt.LIZ(X.0pS4):void");
                }
            });
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("empty smart service as scene name is ");
            sbLIZ.append(this.LIZ);
            C098200Yq c098200Yq = new C098200Yq(new C892820Z0u(C2188811AlT.LIZIZ(sbLIZ), "runtime"));
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
