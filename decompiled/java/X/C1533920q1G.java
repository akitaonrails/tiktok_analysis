package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.experiments.ForestExperiment;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533920q1G {
    public static void LIZLLL(int i) {
        Function2<? super String, ? super C1535250q3P, Unit> function2;
        C1533900q1E.LJIIZILJ = i;
        if (i % 10 == 0 && Forest.Companion.getSupportMonitorMemory$forest_release() && (function2 = C1533480q0Y.LIZ) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("loadCount", i);
            jSONObject.put("inMemoryCount", C1533900q1E.LJIJ.size());
            function2.invoke("ForestMemoryMonitor", new C1535250q3P("ResourceGroup", "onLoadCountChange", null, null, null, false, jSONObject, 60));
        }
    }

    public static void LIZ(C1533790q13 c1533790q13, JSONObject jSONObject) {
        jSONObject.put("res_from", c1533790q13.LJII(c1533790q13.LJ));
        jSONObject.put("res_version", c1533790q13.LJIIIZ);
        jSONObject.put("gecko_access_key", c1533790q13.LIZ.LJJJJLI.LIZ);
        jSONObject.put("gecko_channel", c1533790q13.LIZ.LJJJJLI.LIZIZ);
        jSONObject.put("gecko_bundle", c1533790q13.LIZ.LJJJJLI.LIZJ);
        jSONObject.put("client_start_timing", c1533790q13.LIZJ.LIZJ.get("res_load_start"));
    }

    public static C1533970q1L LIZIZ(C1533490q0Z c1533490q0Z, C1533970q1L c1533970q1L) {
        ConcurrentHashMap<String, C1533970q1L> concurrentHashMap;
        C1533970q1L c1533970q1LPutIfAbsent;
        List<String> blockMemoryCacheList;
        String str = c1533490q0Z.LJJJZ;
        if (str == null) {
            return null;
        }
        if ((!c1533490q0Z.LJJIIZ && (blockMemoryCacheList = ForestExperiment.INSTANCE.getBlockMemoryCacheList()) != null && blockMemoryCacheList.contains(str)) || (c1533970q1LPutIfAbsent = (concurrentHashMap = C1533900q1E.LJIJ).putIfAbsent(str, c1533970q1L)) == null) {
            return null;
        }
        ForestExperiment forestExperiment = ForestExperiment.INSTANCE;
        if ((forestExperiment.getEnableRetryOnFail() || (forestExperiment.getEnableRetryOnFailIfOnlyLocal() && c1533970q1LPutIfAbsent.LJFF)) && !c1533970q1LPutIfAbsent.LIZ.LJI()) {
            concurrentHashMap.remove(str, c1533970q1LPutIfAbsent);
            return LIZIZ(c1533490q0Z, c1533970q1L);
        }
        return c1533970q1LPutIfAbsent;
    }

    public static void LIZJ(C1533790q13 c1533790q13, C1533970q1L c1533970q1L, C1533900q1E c1533900q1E, boolean z) {
        C1533790q13 c1533790q132;
        String str;
        Set<String> set;
        AbstractC1534220q1k abstractC1534220q1kLIZ;
        if (c1533790q13 == null) {
            c1533790q132 = c1533970q1L.LJ;
            if (c1533790q132 == null) {
                return;
            }
        } else {
            c1533790q132 = c1533790q13;
        }
        C1533490q0Z c1533490q0Z = c1533790q132.LIZ;
        if (!c1533490q0Z.LJJIIZ && !z && c1533790q13 != null && c1533790q13.LIZIZ) {
            c1533900q1E.LJIILIIL++;
        }
        if (c1533790q132.LIZIZ && !c1533790q132.LJIJI && c1533970q1L.LIZLLL && c1533970q1L.LJII && !Intrinsics.LJFF(c1533790q132.LJ, "builtin") && (!Intrinsics.LJFF(c1533790q132.LJ, "memory") || !c1533790q132.LJJIJIIJI)) {
            C1534360q1y<?> c1534360q1y = c1533790q132.LJJIIJZLJL;
            if (c1534360q1y != null && (abstractC1534220q1kLIZ = C1534360q1y.LIZ(c1534360q1y, c1533790q132, true, 2)) != null) {
                C1533940q1I.LJII(new C1534840q2k(c1533790q132, abstractC1534220q1kLIZ));
            }
        } else if (z && c1533490q0Z.LJJIIZ && c1533970q1L.LJ != null && !c1533970q1L.LIZ.LJFF()) {
            c1533900q1E.LJIIIZ++;
            if (Intrinsics.LJFF(c1533490q0Z.LJJJIL, "hybrid_page_info")) {
                c1533900q1E.LJIIJJI++;
            }
        }
        c1533970q1L.LJ = null;
        if (!z && c1533970q1L.LIZLLL && (str = c1533970q1L.LIZIZ) != null && (set = c1533900q1E.LIZJ) != null) {
            set.add(str);
        }
        String str2 = c1533970q1L.LIZIZ;
        if (str2 != null) {
            C1533900q1E.LJIJ.remove(str2, c1533970q1L);
        }
    }
}
