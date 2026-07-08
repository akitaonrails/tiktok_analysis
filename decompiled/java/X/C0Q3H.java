package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Q3H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3H {
    public static C0Q2N LIZ;
    public static final Map<String, Long> LIZIZ = C2097608Jq.LJIIJ(new Pair("recom_search", 0L));

    public static boolean LIZ(int i, String str, long j, String str2) {
        List<Pair<Integer, String>> list;
        List<Pair<Integer, String>> list2;
        Map<String, Long> map = LIZIZ;
        if (!map.containsKey(str)) {
            C0Q3I c0q3i = C0Q3I.COMMON;
            C0Q54 c0q54 = C0Q54.COMMON;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown module: ");
            sbLIZ.append(str);
            C664410Q4h.LIZIZ(c0q3i, c0q54, new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)), "MiddleExposureMobError", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
            return false;
        }
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l == null) {
            return false;
        }
        long jLongValue = l.longValue();
        if (j > jLongValue) {
            C0Q2N c0q2n = LIZ;
            if (c0q2n != null && (list2 = c0q2n.LJFF) != null) {
                list2.clear();
            }
            map.put(str, Long.valueOf(j));
            jLongValue = j;
        }
        if (j != jLongValue) {
            return false;
        }
        C0Q2N c0q2n2 = LIZ;
        if (c0q2n2 != null && (list = c0q2n2.LJFF) != null) {
            list.add(new Pair<>(Integer.valueOf(i), str2));
            return true;
        }
        return true;
    }
}
