package X;

import Y.AObjectS163S0000000_23;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.network.EcLynxNetReuseHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS138S1200000_23;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS86S1300000_23;

/* JADX INFO: renamed from: X.0pkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523320pkA extends AbstractC1547260qMm {
    public static final C1523320pkA LL = new C1523320pkA();
    public static final Map<String, WeakReference<LynxView>> LLILLJJLI = new LinkedHashMap();
    public static final WeakHashMap<LynxView, String> LLILLL = new WeakHashMap<>();
    public static final C01GW LLILZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(69));
    public static final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public static final C1523440pkM LLILZLL = new C1523440pkM();

    static {
        AObjectS163S0000000_23 aObjectS163S0000000_23 = new AObjectS163S0000000_23(0);
        C1505650pHf.LIZ.getClass();
        C1505650pHf.LIZLLL.add(aObjectS163S0000000_23);
    }

    public static String LIZ(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String strValueOf = String.valueOf(entry.getValue());
            if (strValueOf.length() > 10) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C13LN.LJZL(5, strValueOf));
                sbLIZ.append("...");
                strValueOf = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('\"');
            sbLIZ2.append(key);
            sbLIZ2.append("\":\"");
            sbLIZ2.append(strValueOf);
            sbLIZ2.append('\"');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return C13LP.LJJLIIIJ(arrayList, ", ", "{", "}", 0, null, null, 56);
    }

    public static String LIZIZ(C1507770pL5 c1507770pL5) {
        boolean z;
        String strLIZIZ = "null";
        if (c1507770pL5 == null) {
            return "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{dataMap:");
        Map<String, Object> mapLJ = c1507770pL5.LIZJ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        sbLIZ.append(LIZ(mapLJ));
        sbLIZ.append(", preparedData:");
        C1507780pL6 c1507780pL6 = c1507770pL5.LJFF;
        if (c1507780pL6 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("{templateData:true, monitorSize:");
            sbLIZ2.append(c1507780pL6.LIZIZ.size());
            sbLIZ2.append(", reuseKeyPresent:");
            if (c1507780pL6.LIZJ != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            sbLIZ2.append('}');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        String strLIZJ = null;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        if (url != null) {
            strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(url), "ec_native_prefetch_key");
        }
        return C770702zh.LIZIZ(strLIZJ);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        String strLIZJ;
        if (str != null) {
            strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(str), "ec_native_prefetch_key");
        } else {
            strLIZJ = null;
        }
        return C770702zh.LIZIZ(strLIZJ);
    }

    public static void LIZJ(LynxView lynxView, String str) {
        C1523440pkM c1523440pkM = LLILZLL;
        C1523430pkL c1523430pkL = (C1523430pkL) ((LinkedHashMap) c1523440pkM.LIZ).get(str);
        if (c1523430pkL != null) {
            c1523430pkL.LJI = System.currentTimeMillis();
        }
        C1505650pHf.LIZ.getClass();
        C1507770pL5 c1507770pL5Remove = C1505650pHf.LIZIZ.remove(str);
        if (c1507770pL5Remove != null && (c1507770pL5Remove.LJFF != null || c1507770pL5Remove.LIZJ != null)) {
            new AwS547S0100000_3(lynxView, 134);
            C1507560pKk.LIZ();
            TemplateData templateDataLJ = LJ(str, c1507770pL5Remove);
            if (templateDataLJ != null) {
                c1523440pkM.LIZ(str, "internal_load_network", new AwS86S1300000_23(lynxView, templateDataLJ, c1507770pL5Remove, str, 3));
                return;
            } else {
                c1523440pkM.LIZ(str, "internal_load_network", new AwS86S1300000_23(lynxView, (LynxView) LIZLLL(str, c1507770pL5Remove, "internal_load_network"), (Map<String, ? extends Object>) c1507770pL5Remove, (C1507770pL5) str, (String) 2));
                return;
            }
        }
        new AwS547S0100000_3(lynxView, 135);
        C1507560pKk.LIZ();
        LLILLJJLI.put(str, new WeakReference<>(lynxView));
    }

    public static TemplateData LJ(String str, C1507770pL5 c1507770pL5) {
        C1507780pL6 c1507780pL6 = c1507770pL5.LJFF;
        if (c1507780pL6 == null) {
            return null;
        }
        new AwS138S1200000_23(str, c1507770pL5, c1507780pL6, 0);
        C1507560pKk.LIZ();
        String str2 = c1507780pL6.LIZJ;
        if (str2 != null) {
            C054G c054g = EcLynxNetReuseHandler.LIZJ;
            C1507460pKa.LIZIZ(str2);
        }
        LLILZLL.LIZIZ(str, c1507780pL6.LIZIZ);
        return c1507780pL6.LIZ;
    }

    public static Map LJFF(C1507770pL5 c1507770pL5, TemplateData templateData) {
        Object objLJIJI;
        Map<String, Object> map = c1507770pL5.LIZJ;
        if (map != null) {
            return map;
        }
        Object obj = null;
        if (templateData == null) {
            objLJIJI = null;
        } else {
            try {
                objLJIJI = templateData.LJIJI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLJIJI = new C098200Yq(th);
                C189200o6.m2constructorimpl(objLJIJI);
            }
        }
        if (!(objLJIJI instanceof Map)) {
            objLJIJI = null;
        }
        C189200o6.m2constructorimpl(objLJIJI);
        if (C189200o6.m5exceptionOrNullimpl(objLJIJI) == null) {
            obj = objLJIJI;
        }
        return (Map) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleSparkContext(final com.bytedance.hybrid.spark.SparkContext r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1523320pkA.handleSparkContext(com.bytedance.hybrid.spark.SparkContext, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static Map LIZLLL(String str, C1507770pL5 c1507770pL5, String str2) {
        LinkedHashMap linkedHashMap;
        ?? LJ;
        Map<String, Object> map = c1507770pL5.LIZJ;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        try {
            List<C080U> list = c1507770pL5.LJ;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (C080U c080u : list) {
                Pair pair = new Pair(c080u.LIZ, c080u.LIZIZ);
                LJ.put(pair.getFirst(), pair.getSecond());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new AwS567S0100000_23(e, 92);
            C1507560pKk.LIZ();
            LJ = C2097608Jq.LJ();
        }
        linkedHashMap.put("dataFrom", str2);
        linkedHashMap.put("header", LJ);
        String str3 = (String) LJ.get("ec_lynx_net_reuse_key");
        if (str3 != null) {
            C054G c054g = EcLynxNetReuseHandler.LIZJ;
            C1507460pKa.LIZIZ(str3);
        }
        C1495280p0w c1495280p0w = C1495280p0w.LIZ;
        Object obj = c1507770pL5.LIZLLL;
        List<C080U> list2 = c1507770pL5.LJ;
        c1495280p0w.getClass();
        Map<String, ? extends Object> mapLIZIZ = C1495280p0w.LIZIZ(obj, list2, null, null, false);
        mapLIZIZ.put("ec_prefetch_callback_time", Long.valueOf(c1507770pL5.LIZIZ));
        LLILZLL.LIZIZ(str, mapLIZIZ);
        linkedHashMap.put("metrics", mapLIZIZ);
        linkedHashMap.put("__lynx_timing_flag", "_update_timing_from_server");
        return linkedHashMap;
    }
}
