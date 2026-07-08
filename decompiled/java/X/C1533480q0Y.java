package X;

import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533480q0Y {
    public static Function2<? super String, ? super C1535250q3P, Unit> LIZ;
    public static Function1<? super C1533490q0Z, ? extends AbstractC1491750ovF> LIZLLL;
    public static boolean LIZIZ = true;
    public static final List<AbstractC1520540pfg> LIZJ = new ArrayList();
    public static final List<String> LJ = C1697810uHb.LJIIJJI("proxy", "dns", "tcp", "ssl", "send", "ttfb", "rtt", "inner");
    public static final Map<String, String> LJFF = C2097608Jq.LJIIIIZZ(new Pair("res_loader_name", "forest"), new Pair("res_loader_version", BuildConfig.VERSION_NAME));

    public static Map LIZ(C1533790q13 c1533790q13) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1533790q13.LIZLLL.getClass();
        linkedHashMap.put("net_library_error_code", 0);
        linkedHashMap.put("http_status_code", Integer.valueOf(c1533790q13.LIZLLL.LIZJ));
        linkedHashMap.put("res_loader_error_code", Integer.valueOf(c1533790q13.LIZLLL.LIZIZ));
        linkedHashMap.put("res_error_msg", c1533790q13.LIZLLL.toString());
        Integer numLIZJ = c1533790q13.LIZLLL.LIZJ();
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        linkedHashMap.put("gecko_error_code", Integer.valueOf(iIntValue));
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0410  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(X.C1533790q13 r11) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533480q0Y.LIZIZ(X.0q13):java.util.Map");
    }

    public static void LJFF(AFwS308S0000000_23 aFwS308S0000000_23) {
        LIZ = aFwS308S0000000_23;
    }

    public static JSONObject LJI(Map map) {
        String strLJJJLL;
        String str;
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                boolean z = false;
                if (u.LJIIZILJ(str2, "_start", false)) {
                    strLJJJLL = a0.LJJJLL("_start", str2);
                    z = true;
                } else if (u.LJIIZILJ(str2, "_finish", false)) {
                    strLJJJLL = a0.LJJJLL("_finish", str2);
                } else {
                    jSONObject.put(str2, map.get(str2));
                }
                if (jSONObject.opt(strLJJJLL) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJJJLL);
                    if (!z) {
                        str = "_start";
                    } else {
                        str = "_end";
                    }
                    sbLIZ.append(str);
                    Object objLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (map.containsKey(objLIZIZ)) {
                        if (!z) {
                            jLongValue = ((Number) entry.getValue()).longValue() - ((Number) map.get(objLIZIZ)).longValue();
                        } else {
                            jLongValue = ((Number) map.get(objLIZIZ)).longValue() - ((Number) entry.getValue()).longValue();
                        }
                        jSONObject.put(strLJJJLL, jLongValue);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1534250q1n.LIZIZ("ResourceReporter", "assemble duration error", e);
        }
        return jSONObject;
    }

    public static void LJ(final C1533790q13 c1533790q13, final Runnable runnable) {
        if (LIZIZ && c1533790q13.LJIL.compareAndSet(false, true)) {
            C086F c086f = C086F.LIZ;
            Runnable runnable2 = new Runnable() { // from class: X.0piy
                public final void LIZ() throws JSONException {
                    Object c098200Yq;
                    Runnable runnable3 = runnable;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    C1533790q13 c1533790q132 = c1533790q13;
                    C1533490q0Z c1533490q0Z = c1533790q132.LIZ;
                    Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                    Map<String, String> map = C1533480q0Y.LJFF;
                    Map mapLIZIZ = C1533480q0Y.LIZIZ(c1533790q132);
                    Map mapLIZ = C1533480q0Y.LIZ(c1533790q13);
                    C1533790q13 c1533790q133 = c1533790q13;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("res_loader_info", map);
                    linkedHashMap.put("res_info", mapLIZIZ);
                    linkedHashMap.put("res_load_perf", c1533790q133.LIZJ.LIZJ);
                    linkedHashMap.put("res_load_error", mapLIZ);
                    JSONObject jSONObject = new JSONObject(C19719512Dh.LIZJ(mapLIZIZ));
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    for (Map.Entry entry2 : ((LinkedHashMap) mapLIZ).entrySet()) {
                        jSONObject.put((String) entry2.getKey(), entry2.getValue());
                    }
                    boolean zContains = C1697810uHb.LJIIJJI(EnumC1533980q1M.LYNX_TEMPLATE, EnumC1533980q1M.WEB_MAIN_DOCUMENT, EnumC1533980q1M.MYNA_TEMPLATE).contains(c1533490q0Z.LJJJ);
                    try {
                        c098200Yq = new JSONObject(c1533490q0Z.LJFF);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    JSONObject jSONObject2 = (JSONObject) c098200Yq;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    C1533790q13 c1533790q134 = c1533790q13;
                    if (!c1533790q134.LIZIZ) {
                        String str = zContains ? "res_loader_error_template" : "res_loader_error";
                        Function2<? super String, ? super C1535250q3P, Unit> function22 = C1533480q0Y.LIZ;
                        C1533480q0Y.LIZLLL(str, jSONObject, c1533790q134, jSONObject2, linkedHashMap, 0);
                    }
                    String str2 = zContains ? "res_loader_perf_template" : "res_loader_perf";
                    Function2<? super String, ? super C1535250q3P, Unit> function23 = C1533480q0Y.LIZ;
                    C1533480q0Y.LIZLLL(str2, jSONObject, c1533790q13, jSONObject2, linkedHashMap, 1);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ResourceReporter@3468.reportFetchResult$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ResourceReporter@3468.reportFetchResult$1");
                }
            };
            c086f.getClass();
            C086F.LJFF(runnable2);
        }
    }

    public static void LIZLLL(String str, JSONObject jSONObject, C1533790q13 c1533790q13, JSONObject jSONObject2, Map map, int i) {
        JSONObject jSONObjectLJI;
        Object c098200Yq;
        Object c098200Yq2;
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        Map<String, Long> map2 = c1533790q13.LIZJ.LIZJ;
        C1533520q0c c1533520q0c = C1533530q0d.LIZ;
        if (c1533520q0c.LIZIZ.get()) {
            jSONObjectLJI = LJI(map2);
            if (c1533520q0c.LIZIZ.get()) {
                C0VCC c0vcc = c1533520q0c.LIZ;
                if (c0vcc != null) {
                    c0vcc.LJIIJ(str, jSONObject, jSONObjectLJI, jSONObject2);
                }
            } else {
                throw new IllegalStateException("Please init MonitorManager first");
            }
        } else {
            jSONObjectLJI = null;
        }
        if (c1533490q0Z.LJJIIZ && ForestExperiment.INSTANCE.getOptimizePreloadReport()) {
            if (jSONObjectLJI == null) {
                jSONObjectLJI = LJI(c1533790q13.LIZJ.LIZJ);
            }
            C1533490q0Z c1533490q0Z2 = c1533790q13.LIZ;
            Iterator it2 = ((ArrayList) LIZJ).iterator();
            while (it2.hasNext()) {
                try {
                    try {
                        ((AbstractC1520540pfg) it2.next()).LIZ(str, c1533490q0Z2.LJJJJIZL, null, c1533490q0Z2.LJJIFFI, jSONObject, jSONObjectLJI, jSONObject2, i);
                        c098200Yq2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl != null) {
                    C1534250q1n.LIZIZ("ResourceReporter", "custom report error", thM5exceptionOrNullimpl);
                }
            }
            return;
        }
        Map<String, Object> mapLJ = c1533490q0Z.LJFF;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Iterator it3 = ((ArrayList) LIZJ).iterator();
        while (it3.hasNext()) {
            try {
                ((AbstractC1520540pfg) it3.next()).LIZIZ(str, map, mapLJ);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl2 != null) {
                C1534250q1n.LIZIZ("ResourceReporter", "custom report error", thM5exceptionOrNullimpl2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008b A[PHI: r11
      0x008b: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v3 java.lang.String) binds: [B:49:0x007b, B:54:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af A[PHI: r15
      0x00af: PHI (r15v4 org.json.JSONObject) = (r15v1 org.json.JSONObject), (r15v5 org.json.JSONObject) binds: [B:57:0x0092, B:64:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb A[PHI: r13 r15
      0x00bb: PHI (r13v2 X.0q1f) = (r13v3 X.0q1f), (r13v1 X.0q1f) binds: [B:70:0x00b9, B:64:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r15v2 org.json.JSONObject) = (r15v4 org.json.JSONObject), (r15v5 org.json.JSONObject) binds: [B:70:0x00b9, B:64:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r5, X.EnumC1533980q1M r6, java.lang.String r7, java.lang.Boolean r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Throwable r12, X.AbstractC1534170q1f r13, X.AbstractC1533800q14 r14, org.json.JSONObject r15, int r16) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533480q0Y.LIZJ(java.lang.String, X.0q1M, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable, X.0q1f, X.0q14, org.json.JSONObject, int):void");
    }
}
