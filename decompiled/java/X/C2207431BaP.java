package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207431BaP {
    public static final C2207261Ba8 LIZJ = new C593510NPp<Context>() { // from class: X.1Ba8
        @Override // X.C593510NPp
        public final Context LIZIZ() {
            return null;
        }
    };
    public static boolean LIZLLL = true;
    public static final Map<String, Boolean> LJ;
    public final C2207491BaV LIZ;
    public final C2207561Bac LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Ba8] */
    static {
        HashMap map = new HashMap();
        String strName = EnumC2207441BaQ.SS.name();
        Boolean bool = Boolean.TRUE;
        map.put(strName, bool);
        map.put(EnumC2207441BaQ.CHRY.name(), bool);
        map.put(EnumC2207441BaQ.OP.name(), bool);
        map.put(EnumC2207441BaQ.VO.name(), bool);
        map.put(EnumC2207441BaQ.XM.name(), bool);
        LJ = Collections.unmodifiableMap(map);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BaM, X.1BaV] */
    public final Object LIZ(C2207331BaF c2207331BaF) {
        ?? r2;
        C2207451BaR c2207451BaRLIZJ = c2207331BaF.LLILZLL ? c2207331BaF.LLJJI : LIZJ(c2207331BaF);
        if (c2207451BaRLIZJ == null || (r2 = c2207451BaRLIZJ.LIZIZ) == 0) {
            return null;
        }
        C2207501BaW c2207501BaW = c2207451BaRLIZJ.LIZLLL;
        if (c2207501BaW != null) {
            c2207501BaW.LIZIZ = EnumC1649640t1u.END;
        }
        return r2.LIZIZ(c2207451BaRLIZJ);
    }

    public static C2207431BaP LIZIZ() {
        if (LIZJ.LIZ() != null) {
            return C2207511BaX.LIZ;
        }
        C2207231Ba5.LIZ(5);
        return null;
    }

    public C2207431BaP() {
        Map<String, Boolean> map;
        EnumC2207441BaQ enumC2207441BaQ;
        C2207491BaV c2207551Bab;
        StringBuilder sbLIZ;
        String str;
        boolean z = LIZLLL;
        C2207261Ba8 c2207261Ba8 = LIZJ;
        if (z) {
            if (this.LIZ == null) {
                String str2 = Build.MANUFACTURER;
                EnumC2207441BaQ enumC2207441BaQ2 = (TextUtils.isEmpty(str2) || !str2.contains("samsung")) ? EnumC2207441BaQ.UNKNOWN : EnumC2207441BaQ.SS;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("create ");
                sbLIZ2.append(enumC2207441BaQ2);
                sbLIZ2.append(" provider.");
                C2188811AlT.LIZIZ(sbLIZ2);
                C2207231Ba5.LIZ(3);
                if (C2207221Ba4.LIZ.LIZ() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vendor", enumC2207441BaQ2.name());
                        C2207221Ba4.LIZ("vboost_event_launch", jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                int i = C2207521BaY.LIZ[enumC2207441BaQ2.ordinal()];
                if (i == 1) {
                    map = LJ;
                    enumC2207441BaQ = EnumC2207441BaQ.SS;
                    if (!map.containsKey(enumC2207441BaQ.name()) || map.get(enumC2207441BaQ.name()).booleanValue()) {
                        c2207551Bab = new C2207551Bab(c2207261Ba8.LIZ());
                        this.LIZ = c2207551Bab;
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        str = "Not allow to create ss provider, enableVendorMap[ss] = ";
                        sbLIZ.append(str);
                        sbLIZ.append(map.get(enumC2207441BaQ.name()));
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                } else if (i == 2) {
                    map = LJ;
                    enumC2207441BaQ = EnumC2207441BaQ.CHRY;
                    if (!map.containsKey(enumC2207441BaQ.name())) {
                        c2207551Bab = new C2207551Bab(c2207261Ba8.LIZ());
                    } else if (map.get(enumC2207441BaQ.name()).booleanValue()) {
                        c2207261Ba8.LIZ();
                        c2207551Bab = new C2207461BaS();
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        str = "Not allow to create chry provider, enableVendorMap[chry] = ";
                        sbLIZ.append(str);
                        sbLIZ.append(map.get(enumC2207441BaQ.name()));
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    this.LIZ = c2207551Bab;
                } else if (i != 3) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Not implement provider of this device ");
                    sbLIZ3.append(enumC2207441BaQ2);
                    sbLIZ3.append("!");
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C2207231Ba5.LIZ(5);
                } else {
                    map = LJ;
                    enumC2207441BaQ = EnumC2207441BaQ.OP;
                    if (!map.containsKey(enumC2207441BaQ.name()) || map.get(enumC2207441BaQ.name()).booleanValue()) {
                        c2207261Ba8.LIZ();
                        c2207551Bab = new C2207481BaU();
                        this.LIZ = c2207551Bab;
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        str = "Not allow to create op provider, enableVendorMap[op] = ";
                        sbLIZ.append(str);
                        sbLIZ.append(map.get(enumC2207441BaQ.name()));
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
            this.LIZIZ = new C2207561Bac(c2207261Ba8.LIZ());
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Not allow to create vendor provider, enableVendorProvider = ");
        sbLIZ4.append(LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ4);
        C2207231Ba5.LIZ(4);
        this.LIZIZ = new C2207561Bac(c2207261Ba8.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[PHI: r6 r7
      0x00fa: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:52:0x00ee, B:55:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r7v3 X.1BaT) = (r7v1 X.1BaT), (r7v5 X.1BaT) binds: [B:52:0x00ee, B:55:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1BaM, X.1BaV] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.1BaM, X.1BaV] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1BaM, X.1BaV] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.1BaM, X.1BaV] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.1BaM, X.1BaV] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.1BaM, X.1BaV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2207451BaR LIZJ(X.C2207331BaF r14) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2207431BaP.LIZJ(X.1BaF):X.1BaR");
    }
}
