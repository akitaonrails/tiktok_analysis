package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514690pWF {
    public static volatile boolean LIZ;
    public static JSONObject LIZIZ;
    public static JSONObject LIZJ;
    public static final List<AbstractC1514700pWG> LIZLLL = new ArrayList();
    public static final List<AbstractC1514710pWH> LJ = new ArrayList();

    public static final void LJ() {
        if (!LIZ) {
            C824310WVh.LIZJ(new Runnable() { // from class: X.0pW3
                /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:17:0x005e, B:20:0x0066, B:21:0x006a, B:23:0x0070, B:24:0x0085, B:19:0x0064), top: B:35:0x005e }] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:6:0x000e, B:9:0x0016, B:8:0x0014), top: B:33:0x000e }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static void LIZ() {
                    /*
                        X.0pgP r0 = X.EnumC1520990pgP.ENABLE_ISSUE_TRACING
                        boolean r0 = r0.isEnabled()
                        if (r0 == 0) goto Lac
                        org.json.JSONObject r0 = X.C1514580pW4.LIZ
                        org.json.JSONObject r2 = X.C1514690pWF.LIZIZ
                        if (r2 == 0) goto L14
                        int r0 = r2.length()     // Catch: java.lang.Throwable -> L43
                        if (r0 != 0) goto L16
                    L14:
                        org.json.JSONObject r2 = X.C1514580pW4.LIZ     // Catch: java.lang.Throwable -> L43
                    L16:
                        X.0pW5 r1 = new X.0pW5     // Catch: java.lang.Throwable -> L43
                        java.lang.String r0 = "format_logs"
                        org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L43
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L43
                        X.C1514580pW4.LIZIZ = r1     // Catch: java.lang.Throwable -> L43
                        X.08I3 r1 = new X.08I3     // Catch: java.lang.Throwable -> L43
                        java.lang.String r0 = "single_event"
                        org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L43
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L43
                        X.C1514580pW4.LIZJ = r1     // Catch: java.lang.Throwable -> L43
                        X.0pVv r1 = new X.0pVv     // Catch: java.lang.Throwable -> L43
                        java.lang.String r0 = "blank_attribution"
                        org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L43
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L43
                        X.C1514580pW4.LIZLLL = r1     // Catch: java.lang.Throwable -> L43
                        kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L43
                        X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L43
                        goto L4f
                    L43:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        X.00Yq r0 = new X.00Yq
                        r0.<init>(r1)
                        X.C189200o6.m2constructorimpl(r0)
                    L4f:
                        java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
                        if (r0 == 0) goto L58
                        X.C1520960pgM.LIZIZ(r0)
                    L58:
                        org.json.JSONObject r0 = X.C1514540pW0.LIZ
                        org.json.JSONObject r5 = X.C1514690pWF.LIZJ
                        if (r5 == 0) goto L64
                        int r0 = r5.length()     // Catch: java.lang.Throwable -> L8b
                        if (r0 != 0) goto L66
                    L64:
                        org.json.JSONObject r5 = X.C1514540pW0.LIZ     // Catch: java.lang.Throwable -> L8b
                    L66:
                        java.util.Iterator r4 = r5.keys()     // Catch: java.lang.Throwable -> L8b
                    L6a:
                        boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L8b
                        if (r0 == 0) goto L85
                        java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L8b
                        java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L8b
                        java.util.Map<java.lang.String, X.0pVy> r2 = X.C1514540pW0.LIZIZ     // Catch: java.lang.Throwable -> L8b
                        X.0pVy r1 = new X.0pVy     // Catch: java.lang.Throwable -> L8b
                        org.json.JSONObject r0 = r5.optJSONObject(r3)     // Catch: java.lang.Throwable -> L8b
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L8b
                        r2.put(r3, r1)     // Catch: java.lang.Throwable -> L8b
                        goto L6a
                    L85:
                        kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8b
                        X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L8b
                        goto L97
                    L8b:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        X.00Yq r0 = new X.00Yq
                        r0.<init>(r1)
                        X.C189200o6.m2constructorimpl(r0)
                    L97:
                        java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
                        if (r0 == 0) goto La0
                        X.C1520960pgM.LIZIZ(r0)
                    La0:
                        java.util.List<X.0pWG> r1 = X.C1514690pWF.LIZLLL
                        X.0pW6 r0 = new X.0pW6
                        r0.<init>()
                        java.util.ArrayList r1 = (java.util.ArrayList) r1
                        r1.add(r0)
                    Lac:
                        r0 = 1
                        X.C1514690pWF.LIZ = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1514570pW3.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("IssueTracing@2856.initialize$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IssueTracing@2856.initialize$1");
                }
            });
        } else {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("HBMonitorSDK_V2", "HybridTracing is initialized");
        }
    }

    public static void LIZ(C1514720pWI c1514720pWI) {
        ((ArrayList) LJ).add(c1514720pWI);
    }

    public static void LJFF(JSONObject jSONObject) {
        LIZJ = jSONObject;
    }

    public static void LJI(JSONObject jSONObject) {
        LIZIZ = jSONObject;
    }

    public static final void LIZLLL(String str, EnumC1514620pW8 enumC1514620pW8) {
        if (EnumC1520990pgP.ENABLE_ISSUE_TRACING.not()) {
            return;
        }
        Iterator<AbstractC1514710pWH> it2 = LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str, enumC1514620pW8);
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (!EnumC1520990pgP.ENABLE_ISSUE_TRACING.not() && jSONObject != null) {
            EnumC1514740pWK enumC1514740pWK = EnumC1514740pWK.ReceivedIssue;
            JSONObject jSONObject2 = new JSONObject();
            C12868051u.LJI(jSONObject2, "type", str2);
            C12868051u.LJI(jSONObject2, "info", jSONObject);
            LIZJ(enumC1514740pWK, str, jSONObject2);
        }
    }

    public static final void LIZJ(EnumC1514740pWK enumC1514740pWK, String str, JSONObject jSONObject) {
        Object c098200Yq;
        if (EnumC1520990pgP.ENABLE_ISSUE_TRACING.not()) {
            return;
        }
        try {
            switch (C1514730pWJ.LIZ[enumC1514740pWK.ordinal()]) {
                case 1:
                    Iterator it2 = ((ArrayList) LIZLLL).iterator();
                    while (it2.hasNext()) {
                        ((AbstractC1514700pWG) it2.next()).LJFF(str);
                    }
                    break;
                case 2:
                    String strOptString = jSONObject.optString("name");
                    if (strOptString == null) {
                        return;
                    }
                    long jOptLong = jSONObject.optLong("ts");
                    Iterator it3 = ((ArrayList) LIZLLL).iterator();
                    while (it3.hasNext()) {
                        ((AbstractC1514700pWG) it3.next()).LIZJ(Long.valueOf(jOptLong), str, strOptString);
                    }
                    break;
                    break;
                case 3:
                    String strOptString2 = jSONObject.optString("key");
                    if (strOptString2 == null) {
                        return;
                    }
                    Object objOpt = jSONObject.opt("value");
                    Iterator it4 = ((ArrayList) LIZLLL).iterator();
                    while (it4.hasNext()) {
                        ((AbstractC1514700pWG) it4.next()).LIZ(objOpt, str, strOptString2);
                    }
                    break;
                    break;
                case 4:
                    Iterator it5 = ((ArrayList) LIZLLL).iterator();
                    while (it5.hasNext()) {
                        ((AbstractC1514700pWG) it5.next()).LJ(str, jSONObject.optString("type"), jSONObject.optJSONObject("info"));
                    }
                    break;
                case 5:
                    Iterator it6 = ((ArrayList) LIZLLL).iterator();
                    while (it6.hasNext()) {
                        ((AbstractC1514700pWG) it6.next()).LIZLLL(str, jSONObject.optString("eventName"), jSONObject.optJSONObject("info"));
                    }
                    break;
                case 6:
                    Iterator it7 = ((ArrayList) LIZLLL).iterator();
                    while (it7.hasNext()) {
                        ((AbstractC1514700pWG) it7.next()).LIZIZ(str);
                    }
                    break;
                default:
                    throw new C1954807lC();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
    }
}
