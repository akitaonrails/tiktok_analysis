package X;

import com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0vKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738250vKp {
    public static final C1738250vKp LIZ = new C1738250vKp();
    public static final Map<Integer, C1738270vKr> LIZIZ = new LinkedHashMap();
    public static String LIZJ = "unkown";
    public static String LIZLLL = "unkown";

    public static String LIZ(String str) {
        C0VSJ c0vsj = new C0VSJ(C1335810krj.LJIIIIZZ);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1335810krj.LJIIIIZZ);
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Long LIZIZ(int i) {
        C1738270vKr c1738270vKr = (C1738270vKr) ((LinkedHashMap) LIZIZ).get(Integer.valueOf(i));
        if (c1738270vKr != null) {
            return Long.valueOf(c1738270vKr.LIZIZ);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r2 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData LIZLLL(java.lang.String r3) {
        /*
            r2 = 0
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = "duration_info.json"
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L1c
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L17
            com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData r2 = LJFF(r3)     // Catch: java.lang.Exception -> L1c
            r1.delete()     // Catch: java.lang.Exception -> L1c
            if (r2 != 0) goto L20
        L17:
            com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData r2 = LJ(r3)     // Catch: java.lang.Exception -> L1c
            return r2
        L1c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1738250vKp.LIZLLL(java.lang.String):com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData");
    }

    public static EffectPackageData LJ(String str) {
        Object objLIZ;
        CKEDraftInfo cKEDraftInfoLIZIZ;
        String draftId;
        String strLIZ;
        C1569570qwl c1569570qwlLIZ = C1706510uVd.LIZ();
        if (c1569570qwlLIZ != null) {
            objLIZ = c1569570qwlLIZ.LIZ(InterfaceC1736600vIA.class);
        } else {
            objLIZ = null;
        }
        InterfaceC1736600vIA interfaceC1736600vIA = (InterfaceC1736600vIA) objLIZ;
        if (interfaceC1736600vIA != null && (cKEDraftInfoLIZIZ = interfaceC1736600vIA.LIZIZ(str)) != null && (draftId = cKEDraftInfoLIZIZ.getDraftId()) != null && (strLIZ = LIZ(draftId)) != null) {
            try {
                if (strLIZ.length() != 0 && C09BK.LIZJ(str)) {
                    return (EffectPackageData) new Gson().LJII(C09BH.LJI(new C0VSJ(strLIZ), Charsets.UTF_8), EffectPackageData.class);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("readDurationInfo error: ");
                sbLIZ.append(e);
                C1706630uVp.LIZJ("DurationReporter", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return null;
    }

    public static EffectPackageData LJFF(String str) {
        C0VSJ c0vsj = new C0VSJ(str, "duration_info.json");
        try {
            if (c0vsj.exists() && c0vsj.isFile()) {
                return (EffectPackageData) new Gson().LJII(C09BH.LJI(c0vsj, Charsets.UTF_8), EffectPackageData.class);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readDurationInfo error: ");
            sbLIZ.append(e);
            C1706630uVp.LIZJ("DurationReporter", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static void LJI(int i) {
        Map<Integer, C1738270vKr> map = LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c1738270vKr = linkedHashMap.get(numValueOf);
        if (c1738270vKr == null) {
            c1738270vKr = new C1738270vKr();
            linkedHashMap.put(numValueOf, c1738270vKr);
        }
        ((C1738270vKr) c1738270vKr).LIZ = System.currentTimeMillis();
    }

    public static void LJII(int i) {
        C1738270vKr c1738270vKr = (C1738270vKr) ((LinkedHashMap) LIZIZ).get(Integer.valueOf(i));
        if (c1738270vKr != null && c1738270vKr.LIZ > 0) {
            c1738270vKr.LIZIZ += System.currentTimeMillis() - c1738270vKr.LIZ;
        }
    }

    public static void LJIIIIZZ(String str, EffectPackageData effectPackageData) throws Throwable {
        try {
            effectPackageData.projectSource = LIZJ;
            String strLJIILL = new Gson().LJIILL(effectPackageData);
            C0VSJ c0vsj = new C0VSJ(LIZ(str));
            c0vsj.createNewFile();
            C09BH.LJIIIZ(c0vsj, strLJIILL, Charsets.UTF_8);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("-->");
            sbLIZ.append(strLJIILL);
            C1706630uVp.LIZJ("DurationReporter", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveDurationInfo error: ");
            sbLIZ2.append(e);
            C1706630uVp.LIZJ("DurationReporter", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1738260vKq
            if (r0 == 0) goto L99
            r3 = r10
            X.0vKq r3 = (X.C1738260vKq) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r6 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r7 = 1
            if (r0 == 0) goto L8d
            if (r0 != r7) goto La0
            X.C155000ia.LIZIZ(r6)
        L22:
            com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData r6 = (com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData) r6
            java.util.Map<java.lang.Integer, X.0vKr> r5 = X.C1738250vKp.LIZIZ
            r0 = 0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r4 = r5.get(r0)
            if (r4 != 0) goto L3b
            X.0vKr r4 = new X.0vKr
            r4.<init>()
            r5.put(r0, r4)
        L3b:
            X.0vKr r4 = (X.C1738270vKr) r4
            r2 = 0
            if (r6 == 0) goto L8a
            long r0 = r6.duration
        L43:
            r4.LIZIZ = r0
            java.lang.Integer r0 = X.C2286608xc.LJ(r7)
            java.lang.Object r4 = r5.get(r0)
            if (r4 != 0) goto L57
            X.0vKr r4 = new X.0vKr
            r4.<init>()
            r5.put(r0, r4)
        L57:
            X.0vKr r4 = (X.C1738270vKr) r4
            if (r6 == 0) goto L87
            long r0 = r6.layerDuration
        L5d:
            r4.LIZIZ = r0
            r0 = 2
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.Object r0 = r5.get(r1)
            if (r0 != 0) goto L72
            X.0vKr r0 = new X.0vKr
            r0.<init>()
            r5.put(r1, r0)
        L72:
            X.0vKr r0 = (X.C1738270vKr) r0
            if (r6 == 0) goto L78
            long r2 = r6.interactionDuration
        L78:
            r0.LIZIZ = r2
            if (r6 == 0) goto L80
            java.lang.String r0 = r6.projectSource
            if (r0 != 0) goto L82
        L80:
            java.lang.String r0 = "unkown"
        L82:
            X.C1738250vKp.LIZJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L87:
            r0 = 0
            goto L5d
        L8a:
            r0 = 0
            goto L43
        L8d:
            X.C155000ia.LIZIZ(r6)
            r3.LLILLL = r7
            com.bytedance.effectcreatormobile.infrastructure.define.model.draft.EffectPackageData r6 = LIZLLL(r9)
            if (r6 != r1) goto L22
            return r1
        L99:
            X.0vKq r3 = new X.0vKq
            r3.<init>(r8, r10)
            goto L12
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1738250vKp.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
