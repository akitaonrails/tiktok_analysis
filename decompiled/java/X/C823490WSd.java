package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823490WSd implements InterfaceC1259504wL {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;
    public final Map<String, Object> LIZJ;

    public static void LIZ(Map map, Map map2) {
        Map map3;
        List list;
        Object obj = map2.get("remove");
        if ((obj instanceof List) && (list = (List) obj) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if ((obj2 instanceof String) && obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                Object obj3 = map.get("remove");
                if (C19719512Dh.LJI(obj3)) {
                    C19719512Dh.LIZIZ(obj3).addAll(arrayList);
                } else {
                    map.put("remove", new ArrayList(arrayList));
                }
            }
        }
        Object obj4 = map2.get("update");
        if ((obj4 instanceof Map) && (map3 = (Map) obj4) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof String)) {
                    arrayList2.add(new Pair(key, value));
                }
            }
            Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList2);
            if (!mapLJIILLIIL.isEmpty()) {
                Object obj5 = map.get("update");
                if (C19719512Dh.LJII(obj5)) {
                    C19719512Dh.LIZJ(obj5).putAll(mapLJIILLIIL);
                } else {
                    map.put("update", new LinkedHashMap(mapLJIILLIIL));
                }
            }
        }
    }

    public C823490WSd(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
    }
}
