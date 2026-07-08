package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533940q1I {
    public static int LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1534980q2y());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1534990q2z());

    public static C1534370q1z LIZJ() {
        return (C1534370q1z) LIZIZ.getValue();
    }

    public static C1534370q1z LIZLLL() {
        return (C1534370q1z) LIZJ.getValue();
    }

    public static void LJFF() {
        try {
            ForestExperiment forestExperiment = ForestExperiment.INSTANCE;
            if (forestExperiment.getAllowTrimMemoryCache()) {
                LIZJ().LIZ.evictAll();
            }
            if (forestExperiment.getAllowTrimResourceGroup()) {
                for (Map.Entry<String, C1533970q1L> entry : C1533900q1E.LJIJ.entrySet()) {
                    if (Intrinsics.LJFF(entry.getValue().LIZ.LJIIJ.get(), Boolean.TRUE)) {
                        entry.getValue().LIZ();
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static String LIZ(C1533490q0Z c1533490q0Z) {
        if (c1533490q0Z.LJJJJLI.LIZ()) {
            String str = c1533490q0Z.LJJJJIZL;
            if (str.length() == 0) {
                return null;
            }
            if (c1533490q0Z.LJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("-false-false");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('-');
            sbLIZ2.append(c1533490q0Z.LJJIJL);
            sbLIZ2.append("-false");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(c1533510q0b.LIZ);
        sbLIZ3.append('-');
        sbLIZ3.append(c1533510q0b.LIZIZ);
        sbLIZ3.append('-');
        sbLIZ3.append(c1533510q0b.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static C1534840q2k LIZIZ(C1533790q13 c1533790q13) {
        C1534840q2k c1534840q2k;
        C1534840q2k c1534840q2kRemove;
        if (c1533790q13.LIZ.LJIJJ) {
            C1534370q1z c1534370q1zLIZLLL = LIZLLL();
            c1534370q1zLIZLLL.getClass();
            String strLIZ = LIZ(c1533790q13.LIZ);
            if (strLIZ != null && (c1534840q2kRemove = c1534370q1zLIZLLL.LIZ.remove(strLIZ)) != null) {
                C1534250q1n.LIZ.getClass();
                C1534250q1n.LJIIIZ("MemoryManager", "getCachedBuffer", "fetch from preload pool", null, false);
                LJII(c1534840q2kRemove);
                return c1534840q2kRemove;
            }
        }
        C1534370q1z c1534370q1zLIZJ = LIZJ();
        c1534370q1zLIZJ.getClass();
        String str = c1533790q13.LIZ.LJJJZ;
        if (str == null || (c1534840q2k = c1534370q1zLIZJ.LIZ.get(str)) == null) {
            return null;
        }
        C1534250q1n.LIZ.getClass();
        C1534250q1n.LJIIIZ("MemoryManager", "getCachedBuffer", "fetch from normal pool", null, false);
        return c1534840q2k;
    }

    public static void LJ(C1533790q13 c1533790q13) {
        C1534370q1z c1534370q1zLIZJ = LIZJ();
        c1534370q1zLIZJ.getClass();
        String strLIZ = LIZ(c1533790q13.LIZ);
        if (strLIZ != null && strLIZ.length() != 0) {
            c1534370q1zLIZJ.LIZ.remove(strLIZ);
        }
    }

    public static void LJI(C1534840q2k c1534840q2k) {
        Function2<? super String, ? super C1535250q3P, Unit> function2;
        C1533790q13 c1533790q13 = c1534840q2k.LIZ;
        if (c1533790q13.LJIJI) {
            return;
        }
        int i = LIZ + 1;
        LIZ = i;
        if (i % 5 == 0 && Forest.Companion.getSupportMonitorMemory$forest_release() && (function2 = C1533480q0Y.LIZ) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("loadCount", i);
            jSONObject.put("hitMemoryCount", LIZLLL().LIZ.hitCount() + LIZJ().LIZ.hitCount());
            jSONObject.put("inMemoryCount", LIZLLL().LIZ.size() + LIZJ().LIZ.size());
            function2.invoke("ForestMemoryMonitor", new C1535250q3P("MemoryManager", "onLoadCountChange", null, null, null, false, jSONObject, 60));
        }
        c1533790q13.LJIJI = true;
        if (c1533790q13.LIZ.LJJIIZ) {
            LIZLLL().LIZ(c1534840q2k);
        } else {
            LJII(c1534840q2k);
        }
    }

    public static void LJII(C1534840q2k c1534840q2k) {
        String str = c1534840q2k.LIZ.LIZ.LJJJZ;
        if (str == null) {
            return;
        }
        List<String> blockMemoryCacheList = ForestExperiment.INSTANCE.getBlockMemoryCacheList();
        if (blockMemoryCacheList != null && blockMemoryCacheList.contains(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is blocked");
            C1535250q3P c1535250q3P = new C1535250q3P("MemoryManager", "updateMemoryCache", C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 120);
            c1534840q2k.LIZ.LJIILIIL(c1535250q3P);
            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 196));
            return;
        }
        LIZJ().LIZ(c1534840q2k);
    }
}
