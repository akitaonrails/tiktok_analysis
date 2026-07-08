package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08Jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2097608Jq extends C2097908Jt {
    public static final <K, V> Map<K, V> LJ() {
        return C1901607cc.LL;
    }

    public static final <K, V> HashMap<K, V> LJI(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> map = new HashMap<>(C2097908Jt.LIZIZ(pairArr.length));
        LJIILL(map, pairArr);
        return map;
    }

    public static final <K, V> LinkedHashMap<K, V> LJII(Pair<? extends K, ? extends V>... pairArr) {
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(C2097908Jt.LIZIZ(pairArr.length));
        LJIILL(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> LJIIIIZZ(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(pairArr.length));
            LJIILL(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        return C1901607cc.LL;
    }

    public static final <K, V> Map<K, V> LJIIJ(Pair<? extends K, ? extends V>... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(pairArr.length));
        LJIILL(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> LJIIJJI(Map<K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                Map.Entry<K, V> next = ((LinkedHashMap) map).entrySet().iterator().next();
                return Collections.singletonMap(next.getKey(), next.getValue());
            }
            return map;
        }
        return C1901607cc.LL;
    }

    public static final <K, V> Map<K, V> LJIILLIIL(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Object next;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(collection.size()));
                    LJIILJJIL(iterable, linkedHashMap);
                    return linkedHashMap;
                }
                if (iterable instanceof List) {
                    next = ListProtector.get((List) iterable, 0);
                } else {
                    next = collection.iterator().next();
                }
                return C2097908Jt.LIZJ((Pair) next);
            }
            return C1901607cc.LL;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LJIILJJIL(iterable, linkedHashMap2);
        return LJIIJJI(linkedHashMap2);
    }

    public static final <K, V> Map<K, V> LJIIZILJ(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
            return Collections.singletonMap(next.getKey(), next.getValue());
        }
        return C1901607cc.LL;
    }

    public static final <K, V> Map<K, V> LJIJ(Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIJI(linkedHashMap, sequence);
        return LJIIJJI(linkedHashMap);
    }

    public static final <K, V> Map<K, V> LJIJJ(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap(map);
    }

    public static final Object LJFF(Object obj, Map map) {
        if (map instanceof C08I0) {
            return ((C08I0) map).LJIIJ(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Key ");
        sbLIZ.append(obj);
        sbLIZ.append(" is missing in the map.");
        throw new NoSuchElementException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Map LJIIIZ(Object obj, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return LJIIJJI(linkedHashMap);
    }

    public static final <K, V> Map<K, V> LJIIL(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> LJIILIIL(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        if (map.isEmpty()) {
            return C2097908Jt.LIZJ(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final void LJIILJJIL(Iterable iterable, Map map) {
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final <K, V> void LJIILL(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final void LJIJI(Map map, Sequence sequence) {
        Iterator it2 = sequence.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            map.put(pair.getFirst(), pair.getSecond());
        }
    }
}
