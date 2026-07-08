package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507760pL4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.lynx.tasm.TemplateData] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static C1507770pL5 LIZ(String str, long j, Map map, Object obj, List list, boolean z) {
        C1507780pL6 c1507780pL6;
        ?? LJ;
        Map map2 = null;
        if (!z || map == null) {
            c1507780pL6 = null;
        } else {
            try {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LJ = new LinkedHashMap(iLIZIZ);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C080U c080u = (C080U) it2.next();
                    Pair pair = new Pair(c080u.LIZ, c080u.LIZIZ);
                    LJ.put(pair.getFirst(), pair.getSecond());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJ = C2097608Jq.LJ();
            }
            C1495280p0w.LIZ.getClass();
            Map mapLIZIZ = C1495280p0w.LIZIZ(obj, list, null, null, false);
            mapLIZIZ.put("ec_prefetch_callback_time", Long.valueOf(j));
            ?? LJII = TemplateData.LJII(map);
            LJII.LJIILIIL("header", LJ);
            LJII.LJIILIIL("metrics", mapLIZIZ);
            LJII.LJIILIIL("__lynx_timing_flag", "_update_timing_from_server");
            c1507780pL6 = new C1507780pL6(LJII, mapLIZIZ, (String) LJ.get("ec_lynx_net_reuse_key"));
        }
        if (c1507780pL6 == null) {
            map2 = map;
        }
        return new C1507770pL5(str, j, map2, obj, list, c1507780pL6);
    }
}
