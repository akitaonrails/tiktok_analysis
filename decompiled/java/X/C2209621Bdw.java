package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1Bdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209621Bdw {
    public int LIZ;
    public Map<Integer, C2209631Bdx> LIZLLL;
    public Map<String, Integer> LJFF;
    public JSONArray LJI;
    public int LIZIZ = 5;
    public int LIZJ = -1;
    public final Set<String> LJ = new HashSet();
    public boolean LJII = false;

    public final boolean LIZ() {
        Map<Integer, C2209631Bdx> map;
        C2209631Bdx c2209631Bdx;
        return this.LIZ >= 0 && this.LIZIZ > 0 && (map = this.LIZLLL) != null && !map.isEmpty() && map.containsKey(-1) && (c2209631Bdx = map.get(-1)) != null && c2209631Bdx.LIZJ > 0;
    }

    public final void LIZIZ(Map<Integer, C2209631Bdx> map) {
        C2209631Bdx value;
        this.LIZLLL = map;
        ((HashSet) this.LJ).clear();
        Map<Integer, C2209631Bdx> map2 = this.LIZLLL;
        if (map2 == null) {
            return;
        }
        for (Map.Entry<Integer, C2209631Bdx> entry : map2.entrySet()) {
            if (-1 != entry.getKey().intValue() && (value = entry.getValue()) != null) {
                Map<String, List<Set<String>>> map3 = value.LJ;
                if (map3 != null && !((HashMap) map3).isEmpty()) {
                    this.LJ.addAll(((HashMap) value.LJ).keySet());
                }
                Map<String, List<Map<String, Object>>> map4 = value.LJFF;
                if (map4 != null && !((HashMap) map4).isEmpty()) {
                    this.LJ.addAll(((HashMap) value.LJFF).keySet());
                }
            }
        }
    }
}
