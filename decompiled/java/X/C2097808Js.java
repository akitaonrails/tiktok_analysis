package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08Js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2097808Js extends C2097708Jr {
    public static final C1939607ik LJIJJLI(Map map) {
        return new C1939607ik(map.entrySet());
    }

    public static final <K, V> List<Pair<K, V>> LJIL(Map<? extends K, ? extends V> map) {
        if (map.size() == 0) {
            return C13BV.INSTANCE;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it2 = map.entrySet().iterator();
        if (!it2.hasNext()) {
            return C13BV.INSTANCE;
        }
        Map.Entry<? extends K, ? extends V> next = it2.next();
        if (!it2.hasNext()) {
            return Collections.singletonList(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it2.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it2.hasNext());
        return arrayList;
    }
}
