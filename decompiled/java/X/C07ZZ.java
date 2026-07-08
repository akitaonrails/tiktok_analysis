package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZZ {
    public static C07ZY LIZ(Map map, Map map2, Map map3) {
        HashMap map4 = new HashMap();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if (!Intrinsics.LJFF(obj, value)) {
                if (obj == null) {
                    hashSet.add(key);
                } else {
                    map4.put(key, obj);
                }
            }
        }
        if (map3 != null && !map3.isEmpty()) {
            map4.putAll(map3);
        }
        if (map4.isEmpty() && hashSet.isEmpty()) {
            return C07ZY.LIZJ;
        }
        return new C07ZY(map4, hashSet);
    }
}
