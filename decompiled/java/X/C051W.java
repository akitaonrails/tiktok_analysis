package X;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.051W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051W {
    public static final <K, V> void LIZ(Map<K, V> map, K k, V v, Function2<? super V, ? super V, ? extends V> function2) {
        if (k == null) {
            return;
        }
        V v2 = map.get(k);
        if (v2 == null) {
            map.put(k, v);
        } else {
            map.put(k, function2.invoke(v2, v));
        }
    }
}
