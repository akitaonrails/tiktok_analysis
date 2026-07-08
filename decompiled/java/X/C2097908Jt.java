package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08Jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2097908Jt extends C08J4 {
    public static final int LIZIZ(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> LIZJ(Pair<? extends K, ? extends V> pair) {
        return Collections.singletonMap(pair.getFirst(), pair.getSecond());
    }

    public static final SortedMap LIZLLL(Comparator comparator, Map map) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
