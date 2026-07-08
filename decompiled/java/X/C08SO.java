package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08SO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08SO {
    public static final <T, K> Map<K, Integer> LIZ(C08SN<T, ? extends K> c08sn) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itLIZ = c08sn.LIZ();
        while (itLIZ.hasNext()) {
            K kLIZIZ = c08sn.LIZIZ(itLIZ.next());
            Object c118300cf = linkedHashMap.get(kLIZIZ);
            if (c118300cf == null && !linkedHashMap.containsKey(kLIZIZ)) {
                c118300cf = new C118300cf();
            }
            C118300cf c118300cf2 = (C118300cf) c118300cf;
            c118300cf2.element++;
            linkedHashMap.put(kLIZIZ, c118300cf2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if ((entry instanceof C03W4) && !(entry instanceof C08J0)) {
                C19719512Dh.LJIIJ(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((C118300cf) entry.getValue()).element));
        }
        return C19719512Dh.LIZJ(linkedHashMap);
    }
}
