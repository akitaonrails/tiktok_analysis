package X;

import Y.AObjectS160S0000000_3;
import Y.ARunnableS1S1000000_3;
import Y.ARunnableS4S1300000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2124108Tv extends AbstractC1547260qMm {
    public static final C2124108Tv LL = new C2124108Tv();
    public static final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public static final ConcurrentHashMap<String, WeakReference<LynxView>> LLILLL = new ConcurrentHashMap<>();

    static {
        C2123008Tk.LIZJ.add(new AObjectS160S0000000_3(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static Object LIZ(Object obj) {
        Object arrayList;
        String string;
        Object objLIZ;
        if (obj instanceof Map) {
            arrayList = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && (string = key.toString()) != null) {
                    LL.getClass();
                    if (!u.LJIJI(string, "body", true) && !u.LJIJI(string, "data", true) && !u.LJIJI(string, "header", true) && !u.LJIJI(string, "metrics", true)) {
                        objLIZ = LIZ(value);
                    } else {
                        objLIZ = "...";
                    }
                    arrayList.put(string, objLIZ);
                }
            }
        } else if (obj instanceof Iterable) {
            Iterable iterable = (Iterable) obj;
            arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            for (Object obj2 : iterable) {
                LL.getClass();
                arrayList.add(LIZ(obj2));
            }
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            arrayList = new ArrayList(objArr.length);
            for (Object obj3 : objArr) {
                LL.getClass();
                arrayList.add(LIZ(obj3));
            }
        } else {
            return obj;
        }
        return arrayList;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        boolean z;
        String strLIZJ;
        if (str != null && (strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(str), "ec_native_prefetch_multi")) != null && strLIZJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        return matchInterceptRules(url);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(final SparkContext sparkContext, String str) {
        final String strLIZJ;
        super.handleSparkContext(sparkContext, str);
        if (str != null && (strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(str), "ec_native_prefetch_multi")) != null) {
            new AwS88S1000000_3(strLIZJ, 3);
            C034Y.LIZ();
            sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.08g3
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    C1537910q7h c1537910q7h;
                    if (C2177808g4.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
                        new AwS88S1000000_3(strLIZJ, 4);
                        C034Y.LIZ();
                        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                            final SparkContext sparkContext2 = sparkContext;
                            final String str2 = strLIZJ;
                            c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.08g2
                                @Override // com.lynx.tasm.LynxViewClient
                                public final void LJIIIIZZ() {
                                    new AwS88S1000000_3(str2, 5);
                                    C034Y.LIZ();
                                    C2124108Tv.LLILLL.remove(str2);
                                    ConcurrentHashMap<String, ConcurrentHashMap<String, C2124208Tw>> concurrentHashMap = C2123008Tk.LIZ;
                                    C2123008Tk.LIZLLL.execute(new ARunnableS1S1000000_3(str2, 4));
                                }

                                /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003f -> B:20:0x0040). Please report as a decompilation issue!!! */
                                @Override // com.lynx.tasm.LynxViewClient
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LJIILJJIL() {
                                    /*
                                        r5 = this;
                                        X.08Tv r0 = X.C2124108Tv.LL
                                        com.bytedance.hybrid.spark.SparkContext r2 = r1
                                        r0.getClass()
                                        X.0dfi r1 = r2.LJJIJLIJ()
                                        boolean r0 = r1 instanceof X.InterfaceC1546650qLn     // Catch: java.lang.Exception -> L3b
                                        if (r0 == 0) goto L1c
                                        X.0qLn r1 = (X.InterfaceC1546650qLn) r1     // Catch: java.lang.Exception -> L3b
                                        com.bytedance.hybrid.spark.page.SparkFragment r0 = r1.getSparkFragment()     // Catch: java.lang.Exception -> L3b
                                        if (r0 == 0) goto L3f
                                        X.0qEH r2 = r0.getKitView()     // Catch: java.lang.Exception -> L3b
                                        goto L40
                                    L1c:
                                        boolean r0 = r1 instanceof com.bytedance.hybrid.spark.page.SparkPopup     // Catch: java.lang.Exception -> L3b
                                        if (r0 == 0) goto L2b
                                        com.bytedance.hybrid.spark.page.SparkPopup r1 = (com.bytedance.hybrid.spark.page.SparkPopup) r1     // Catch: java.lang.Exception -> L3b
                                        com.bytedance.hybrid.spark.page.SparkFragment r0 = r1.LLJILLL     // Catch: java.lang.Exception -> L3b
                                        if (r0 == 0) goto L3f
                                        X.0qEH r2 = r0.getKitView()     // Catch: java.lang.Exception -> L3b
                                        goto L40
                                    L2b:
                                        boolean r0 = r1 instanceof com.bytedance.hybrid.spark.page.SparkFragment     // Catch: java.lang.Exception -> L3b
                                        if (r0 == 0) goto L36
                                        com.bytedance.hybrid.spark.page.SparkFragment r1 = (com.bytedance.hybrid.spark.page.SparkFragment) r1     // Catch: java.lang.Exception -> L3b
                                        X.0qEH r2 = r1.getKitView()     // Catch: java.lang.Exception -> L3b
                                        goto L40
                                    L36:
                                        X.0qEH r2 = r2.LJIJJ()     // Catch: java.lang.Exception -> L3b
                                        goto L40
                                    L3b:
                                        r0 = move-exception
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                    L3f:
                                        r2 = 0
                                    L40:
                                        boolean r0 = r2 instanceof com.lynx.tasm.LynxView
                                        if (r0 == 0) goto L6b
                                        X.08Tv r0 = X.C2124108Tv.LL
                                        java.lang.String r4 = r2
                                        com.lynx.tasm.LynxView r2 = (com.lynx.tasm.LynxView) r2
                                        r0.getClass()
                                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.lynx.tasm.LynxView>> r1 = X.C2124108Tv.LLILLL
                                        java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                                        r0.<init>(r2)
                                        r1.put(r4, r0)
                                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, X.08Tw>> r0 = X.C2123008Tk.LIZ
                                        kotlin.jvm.internal.AwS117S1100000_3 r3 = new kotlin.jvm.internal.AwS117S1100000_3
                                        r0 = 4
                                        r3.<init>(r2, r4, r0)
                                        java.util.concurrent.ExecutorService r2 = X.C2123008Tk.LIZLLL
                                        Y.ARunnableS9S1100000_3 r1 = new Y.ARunnableS9S1100000_3
                                        r0 = 12
                                        r1.<init>(r3, r4, r0)
                                        r2.execute(r1)
                                    L6b:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C2177608g2.LJIILJJIL():void");
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static void LIZIZ(String str, LynxView lynxView, C2124208Tw c2124208Tw) {
        Object objLJ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("dataFrom", "multi_update_network");
        pairArr[1] = new Pair("__lynx_timing_flag", "_update_timing_from_server");
        String str2 = c2124208Tw.LIZ;
        try {
            List<C080U> list = c2124208Tw.LJFF;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            objLJ = new LinkedHashMap(iLIZIZ);
            for (C080U c080u : list) {
                Pair pair = new Pair(c080u.LIZ, c080u.LIZIZ);
                objLJ.put(pair.getFirst(), pair.getSecond());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objLJ = C2097608Jq.LJ();
        }
        C1495280p0w c1495280p0w = C1495280p0w.LIZ;
        Object obj = c2124208Tw.LJ;
        List<C080U> list2 = c2124208Tw.LJFF;
        c1495280p0w.getClass();
        Map mapLIZIZ = C1495280p0w.LIZIZ(obj, list2, null, null, false);
        mapLIZIZ.put("ec_prefetch_callback_time", Long.valueOf(c2124208Tw.LIZJ));
        pairArr[2] = new Pair("nativePrefetchMulti", C2097908Jt.LIZJ(new Pair(str2, C2097608Jq.LJIIIIZZ(new Pair("unique_id", c2124208Tw.LIZ), new Pair("requestKey", c2124208Tw.LIZ), new Pair("apiPath", c2124208Tw.LIZIZ), new Pair("data", c2124208Tw.LIZLLL), new Pair("header", objLJ), new Pair("metrics", mapLIZIZ)))));
        C786410Ut5.LJL(LLILLJJLI, new ARunnableS4S1300000_3(lynxView, str, C2097608Jq.LJIIIIZZ(pairArr), c2124208Tw, 0));
    }
}
