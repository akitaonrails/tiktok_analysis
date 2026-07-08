package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1008603wy {
    public static final <V> void LIZ(Map<String, V> map, Pair<String, ? extends V>... pairArr) {
        for (Pair<String, ? extends V> pair : pairArr) {
            V second = pair.getSecond();
            if (second != null) {
                map.put(pair.getFirst(), second);
            }
        }
    }

    public static final void LIZIZ(Map map, Object obj, Object obj2) {
        if (obj2 != null) {
            map.put(obj, obj2);
        }
    }
}
