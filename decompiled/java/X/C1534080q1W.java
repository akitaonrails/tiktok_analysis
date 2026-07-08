package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.forest.pollyfill.DefaultForestNetAPI;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS137S1100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534080q1W implements InterfaceC1534850q2l {
    public static final C1534080q1W LIZ = new C1534080q1W();
    public static AbstractC1522670pj7 LIZIZ = new DefaultForestNetAPI();
    public static final ConcurrentHashMap<String, C1534070q1V> LIZJ = new ConcurrentHashMap<>();

    public static AbstractC1522730pjD LJIIIIZZ(AbstractC1522680pj8 abstractC1522680pj8) {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        try {
            AbstractC1522730pjD abstractC1522730pjDLIZLLL = LIZIZ.LIZLLL(abstractC1522680pj8);
            abstractC1522730pjDLIZLLL.LIZIZ.put("forest-append-on-request", strValueOf);
            return abstractC1522730pjDLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(abstractC1522680pj8.cancel()));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            C1534250q1n.LIZJ("TTNetDepender", "net error", th, true);
            throw th;
        }
    }

    public static void LJIIJJI(C1522700pjA c1522700pjA) {
        LIZIZ = c1522700pjA;
    }

    @Override // X.InterfaceC1534850q2l
    public final void LIZIZ(C1534070q1V c1534070q1V) {
        AbstractC1522680pj8 abstractC1522680pj8;
        Object obj = c1534070q1V.LJIILIIL;
        if ((obj instanceof AbstractC1522680pj8) && (abstractC1522680pj8 = (AbstractC1522680pj8) obj) != null) {
            abstractC1522680pj8.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e6  */
    @Override // X.InterfaceC1534850q2l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final X.C1534070q1V r32) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534080q1W.LIZJ(X.0q1V):void");
    }

    public static boolean LIZLLL(Map map, Map map2) {
        List<String> listLJJLIIIJILLIZJL;
        Object obj;
        if (map == null) {
            return false;
        }
        String str = (String) map.get("vary");
        if (str != null && (!a0.LJJJIL(str)) && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null && !listLJJLIIIJILLIZJL.isEmpty()) {
            for (String str2 : listLJJLIIIJILLIZJL) {
                if (!a0.LJJJIL(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("forest-append-");
                    sbLIZ.append(str2);
                    Object obj2 = map.get(C2188811AlT.LIZIZ(sbLIZ));
                    if (map2 == null || (obj = map2.get(str2)) == null) {
                        obj = "";
                    }
                    if (!Intrinsics.LJFF(obj2, obj)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static AbstractC1522680pj8 LJ(C1534070q1V c1534070q1V, Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof WebResourceRequest)) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            if (!Intrinsics.LJFF(webResourceRequest.getMethod().toLowerCase(Locale.ENGLISH), "get")) {
                return null;
            }
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders != null && (setKeySet = requestHeaders.keySet()) != null && (setKeySet.contains("If-None-Match") || setKeySet.contains("If-Modified-Since"))) {
                C1534250q1n.LJII("TTNetDepender", "cache exists in kernel", true);
                return null;
            }
            return LIZIZ.LIZIZ(webResourceRequest, c1534070q1V);
        }
        return LIZIZ.LIZJ(c1534070q1V, c1534070q1V.LIZIZ.LIZ.LJJII);
    }

    public static AbstractC1522730pjD LJII(C1534070q1V c1534070q1V, AbstractC1522680pj8 abstractC1522680pj8) throws Throwable {
        Unit unit;
        if (c1534070q1V.LIZIZ.LIZ.LJJJ == EnumC1533980q1M.LYNX_TEMPLATE && ForestExperiment.INSTANCE.getAddCSRFHeadersForLynxMainTemplate()) {
            Map<String, String> linkedHashMap = abstractC1522680pj8.LJ;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            linkedHashMap.put("x-security-argus", "StaticResource/page/Spark");
            abstractC1522680pj8.LJ = linkedHashMap;
        }
        AbstractC1522730pjD abstractC1522730pjDLJIIIIZZ = null;
        Throwable th = null;
        while (true) {
            boolean z = false;
            if (c1534070q1V.LJ != EnumC1534560q2I.LLILZ) {
                C1533640q0o c1533640q0o = c1534070q1V.LJII;
                int i = c1533640q0o.LJFF;
                if (i > 0) {
                    z = true;
                }
                c1533640q0o.LJFF = i - 1;
                if (z) {
                    try {
                        abstractC1522730pjDLJIIIIZZ = LJIIIIZZ(abstractC1522680pj8);
                    } catch (C1522640pj4 e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1533480q0Y.LIZJ("TTNetDepender", null, null, null, "Forest defined exception", null, null, e, null, null, null, 8046);
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C1534250q1n.LIZJ("TTNetDepender", "net error", th, true);
                    }
                    if (AbstractC1522730pjD.LJII.contains(Integer.valueOf(abstractC1522730pjDLJIIIIZZ.LIZ))) {
                        try {
                            abstractC1522730pjDLJIIIIZZ.close();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            C189200o6.m2constructorimpl(new C098200Yq(th3));
                        }
                    } else {
                        return abstractC1522730pjDLJIIIIZZ;
                    }
                }
            }
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(abstractC1522680pj8.cancel()));
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                C189200o6.m2constructorimpl(new C098200Yq(th4));
            }
            if (abstractC1522730pjDLJIIIIZZ == null) {
                unit = null;
            } else {
                try {
                    abstractC1522730pjDLJIIIIZZ.close();
                    unit = Unit.LIZ;
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    C189200o6.m2constructorimpl(new C098200Yq(th5));
                }
            }
            C189200o6.m2constructorimpl(unit);
            if (th == null) {
                return null;
            }
            throw th;
        }
    }

    public static AbstractC1522730pjD LJI(C1534110q1Z c1534110q1Z, AbstractC1522680pj8 abstractC1522680pj8, C1534070q1V c1534070q1V) {
        AbstractC1522730pjD abstractC1522730pjDLJII;
        C1534250q1n.LIZ.LJIIL("TTNetDepender", "doValidate");
        if (c1534070q1V != null) {
            try {
                abstractC1522730pjDLJII = LJII(c1534070q1V, abstractC1522680pj8);
                if (abstractC1522730pjDLJII == null) {
                }
                return abstractC1522730pjDLJII;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
            }
        }
        abstractC1522730pjDLJII = LJIIIIZZ(abstractC1522680pj8);
        th = null;
        if (abstractC1522730pjDLJII == null) {
            C1534250q1n.LIZJ("TTNetDepender", "revalidate failed, url: " + abstractC1522680pj8.LIZ, th, true);
            c1534110q1Z.LIZJ(true);
            return null;
        }
        return abstractC1522730pjDLJII;
    }

    public static void LJIIL(AbstractC1522680pj8 abstractC1522680pj8, C1534070q1V c1534070q1V, C1533790q13 c1533790q13) {
        AbstractC1522730pjD abstractC1522730pjDLJII;
        C1492150ovt timer;
        String str;
        C1492150ovt timer2;
        boolean zLJI = MethodIDManager.LJI(137359);
        C1534250q1n.LIZ.LJIIL("TTNetDepender", "tryFetchOnline");
        try {
            abstractC1522730pjDLJII = LJII(c1534070q1V, abstractC1522680pj8);
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            abstractC1522730pjDLJII = null;
        }
        if (abstractC1522730pjDLJII == null) {
            C1534250q1n.LJFF("TTNetDepender", "tryFetchOnline", "fetch failed " + th, null, true);
            ResourceFetcher resourceFetcher = c1533790q13.LJIJJ;
            if (resourceFetcher != null && (timer2 = resourceFetcher.getTimer()) != null) {
                timer2.LIZJ("load");
            }
            c1534070q1V.LIZ(new C1533670q0r(7, 0, "fetch failed, url: " + abstractC1522680pj8.LIZ + ", error: " + th));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        abstractC1522730pjDLJII.LIZJ = abstractC1522680pj8;
        C1534250q1n.LJIIIZ("TTNetDepender", "tryFetchOnline", "response received", C2097608Jq.LJIIIIZZ(new Pair("url", abstractC1522680pj8.LIZ), new Pair("http code", String.valueOf(abstractC1522730pjDLJII.LIZ))), true);
        int i = abstractC1522730pjDLJII.LIZ;
        if (300 <= i && i < 400 && (str = abstractC1522730pjDLJII.LIZIZ.get("location")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("redirect to ");
            sbLIZ.append(str);
            sbLIZ.append(", source url: ");
            sbLIZ.append(c1534070q1V.LIZIZ.LIZ.LJJJJIZL);
            C1534250q1n.LJII("TTNetDepender", C2188811AlT.LIZIZ(sbLIZ), true);
            c1534070q1V.LIZIZ(str, null);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        c1533790q13.LJIILJJIL = abstractC1522730pjDLJII;
        C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
        int i2 = abstractC1522730pjDLJII.LIZ;
        c1533810q15.LIZJ = i2;
        C1529710puT.LIZ.getClass();
        if (200 <= i2 && i2 < 301) {
            c1533790q13.LJJIIZ = abstractC1522730pjDLJII.LJ;
            c1533790q13.LJIILJJIL(abstractC1522730pjDLJII.LJI);
            LJIIIZ(abstractC1522730pjDLJII.LIZIZ, c1533790q13, false, null);
            c1534070q1V.LIZIZ.LJ = "cdn";
            ResourceFetcher resourceFetcher2 = c1533790q13.LJIJJ;
            if (resourceFetcher2 != null && (timer = resourceFetcher2.getTimer()) != null) {
                timer.LIZJ("load");
            }
            c1534070q1V.LIZJ();
            C1534250q1n.LJII("TTNetDepender", "request fetch task succeeded, " + abstractC1522680pj8.LIZ, false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        abstractC1522730pjDLJII.close();
        c1534070q1V.LIZ(new C1533670q0r(7, abstractC1522730pjDLJII.LIZ, "fetch failed, url: " + abstractC1522680pj8.LIZ + ", code is " + abstractC1522730pjDLJII.LIZ));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static AbstractC1522680pj8 LJFF(Map map, AbstractC1522680pj8 abstractC1522680pj8, C1534110q1Z c1534110q1Z, C1534070q1V c1534070q1V) {
        HashMap map2 = new HashMap();
        Map map3 = abstractC1522680pj8.LJ;
        if (map3 == null) {
            map3 = new HashMap();
        }
        for (Map.Entry entry : map3.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        Object obj = map.get("last-modified");
        if (obj != null) {
            map2.put("If-Modified-Since", obj);
        }
        Object obj2 = map.get("etag");
        if (obj2 != null) {
            map2.put("If-None-Match", obj2);
        }
        AbstractC1522680pj8 abstractC1522680pj8LIZJ = LIZIZ.LIZJ(c1534070q1V, map2);
        if (abstractC1522680pj8LIZJ == null) {
            c1534110q1Z.LIZJ(true);
        }
        return abstractC1522680pj8LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(java.util.Map r4, X.C1533790q13 r5, boolean r6, java.lang.Long r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "content-type"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lf
            java.lang.String r0 = "text/html; charset=UTF-8"
        Lf:
            X.0X0P r3 = X.C0X0P.LIZJ(r0)
            if (r3 != 0) goto L6e
            java.lang.String r2 = "text/html"
        L17:
            java.lang.String r1 = "utf-8"
        L19:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            r5.LJJI = r1
            r5.LJJIIZI = r0
            java.lang.String r0 = "x-gecko-proxy-pkgid"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6b
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L6b
            long r0 = r0.longValue()
        L42:
            r5.LJIIIZ = r0
            if (r7 != 0) goto L53
            X.0puT r0 = X.C1529710puT.LIZ
            r0.getClass()
            long r0 = X.C1529710puT.LIZ(r4)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L53:
            r5.LJIILIIL = r7
            X.0q0Z r0 = r5.LIZ
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L68
            if (r6 == 0) goto L68
            X.0puT r0 = X.C1529710puT.LIZ
            r0.getClass()
            java.util.Map r4 = X.C1529710puT.LJFF(r4)
        L68:
            r5.LJIILLIIL = r4
            return
        L6b:
            r0 = 0
            goto L42
        L6e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r3.LIZIZ
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = r3.LIZJ
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            java.nio.charset.Charset r0 = r3.LIZ(r0)
            if (r0 == 0) goto L17
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L19
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534080q1W.LJIIIZ(java.util.Map, X.0q13, boolean, java.lang.Long):void");
    }

    public static void LJIIJ(AbstractC1522730pjD abstractC1522730pjD, Map map, C1534110q1Z c1534110q1Z, C1533790q13 c1533790q13) {
        File file;
        String str = abstractC1522730pjD.LIZJ.LIZ;
        Boolean boolValueOf = null;
        if (abstractC1522730pjD.LJFF(map)) {
            C1534000q1O c1534000q1OLJFF = c1534110q1Z.LJFF();
            if (c1534000q1OLJFF == null) {
                c1534110q1Z.LIZJ(true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cache is corrupted ");
                sbLIZ.append(str);
                C1534250q1n.LIZIZ("TTNetDepender", C2188811AlT.LIZIZ(sbLIZ), null);
                return;
            }
            C1534250q1n c1534250q1n = C1534250q1n.LIZ;
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("url", str), new Pair("headers", String.valueOf(abstractC1522730pjD.LIZIZ)));
            c1534250q1n.getClass();
            C1534250q1n.LJIIIZ("TTNetDepender", "handleValidateResponse", "cache is valid", mapLJIIIIZZ, false);
            abstractC1522730pjD.close();
            try {
                if (c1534110q1Z.LIZ() && (file = c1534110q1Z.LIZJ) != null) {
                    boolValueOf = Boolean.valueOf(file.setLastModified(System.currentTimeMillis()));
                }
                C189200o6.m2constructorimpl(boolValueOf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1529710puT.LIZ.getClass();
            Map<String, String> mapLJFF = C1529710puT.LJFF(map);
            ((HashMap) mapLJFF).putAll(abstractC1522730pjD.LIZIZ);
            try {
                AbstractC1522680pj8 abstractC1522680pj8 = abstractC1522730pjD.LIZJ;
                String str2 = abstractC1522680pj8.LIZ;
                Map<String, String> mapLJ = abstractC1522680pj8.LJ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                c1534110q1Z.LJI(str2, mapLJ, mapLJFF, c1534000q1OLJFF);
                c1533790q13.LJI = true;
                c1533790q13.LJIJ = EnumC1534700q2W.NEGOTIATED;
                LJIIIZ(mapLJFF, c1533790q13, false, Long.valueOf(c1534110q1Z.LJ));
                c1533790q13.LJIILL(c1534000q1OLJFF);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1533480q0Y.LIZJ("TTNetDepender", null, null, null, "update failed", str, null, th2, null, null, null, 8014);
                c1534110q1Z.LIZJ(true);
                return;
            }
        } else {
            C1529710puT c1529710puT = C1529710puT.LIZ;
            int i = abstractC1522730pjD.LIZ;
            c1529710puT.getClass();
            if (200 <= i && i < 301) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("content changed: ");
                sbLIZ2.append(str);
                C1534250q1n.LJII("TTNetDepender", C2188811AlT.LIZIZ(sbLIZ2), false);
                c1533790q13.LJIILJJIL(abstractC1522730pjD.LJI);
                c1533790q13.LJJIIZ = abstractC1522730pjD.LJ;
                LJIIIZ(abstractC1522730pjD.LIZIZ, c1533790q13, false, null);
            } else {
                abstractC1522730pjD.close();
                c1534110q1Z.LIZJ(true);
                return;
            }
        }
        c1533790q13.LIZIZ = true;
        c1533790q13.LIZLLL.LIZJ = abstractC1522730pjD.LIZ;
        c1533790q13.LJIILJJIL = abstractC1522730pjD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1534850q2l
    public final Boolean LIZ(Uri uri, String str, boolean z, Set set, File file) {
        String name = file.getName();
        if (name == null) {
            name = "";
        }
        C259800zU c259800zU = new C259800zU();
        C1534130q1b.LIZIZ(uri, str, set, new AwS137S1100000_23(name, (String) c259800zU, (C259800zU<Boolean>) 8), z);
        return (Boolean) c259800zU.element;
    }
}
