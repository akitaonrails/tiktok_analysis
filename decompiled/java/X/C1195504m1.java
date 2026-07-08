package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.04m1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1195504m1 {
    public final Map<Integer, C542680LQc> LIZ = new LinkedHashMap();
    public final Map<Integer, C1195604m2> LIZIZ = new LinkedHashMap();
    public final Map<Integer, Set<Integer>> LIZJ = new LinkedHashMap();

    public final void LIZ(C1195604m2 c1195604m2) {
        this.LIZIZ.put(Integer.valueOf(c1195604m2.LIZ), c1195604m2);
        Map<Integer, Set<Integer>> map = this.LIZJ;
        Integer numValueOf = Integer.valueOf(c1195604m2.LIZJ);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object linkedHashSet = linkedHashMap.get(numValueOf);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(numValueOf, linkedHashSet);
        }
        ((Set) linkedHashSet).add(Integer.valueOf(c1195604m2.LIZIZ));
    }

    public static final void LIZIZ(Set<Integer> set, C1195504m1 c1195504m1, List<C542680LQc> list, int i) {
        if (set.contains(Integer.valueOf(i))) {
            return;
        }
        Set set2 = (Set) ((LinkedHashMap) c1195504m1.LIZJ).get(Integer.valueOf(i));
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                LIZIZ(set, c1195504m1, list, ((Number) it2.next()).intValue());
            }
        }
        set.add(Integer.valueOf(i));
        Object obj = ((LinkedHashMap) c1195504m1.LIZ).get(Integer.valueOf(i));
        if (obj != null) {
            ((ArrayList) list).add(obj);
        }
    }
}
