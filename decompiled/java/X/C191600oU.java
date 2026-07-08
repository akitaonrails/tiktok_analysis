package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C191600oU extends C09AY implements Function0<Map<String, Map<String, Object>>> {
    public C191600oU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, Map<String, Object>> invoke() {
        Map<String, Map<String, Object>> map = C0QXQ.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Map map2 = (Map) C0C64.LJIILLIIL().LJJII(Map.class, map, "ec_search_entrance", true);
        if (map2 != null && (!map2.isEmpty())) {
            linkedHashMap.putAll(map2);
        }
        Map map3 = (Map) linkedHashMap.get("all");
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!Intrinsics.LJFF(entry2.getKey(), "all") && !((Map) entry2.getValue()).containsKey(entry.getKey())) {
                        ((Map) entry2.getValue()).put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
