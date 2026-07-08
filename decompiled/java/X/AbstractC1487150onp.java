package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0onp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1487150onp<K, V> extends AbstractMap<K, V> implements Map<K, V>, InterfaceC2095908Iz {
    public abstract Set<Map.Entry<K, V>> LIZ();

    public /* bridge */ Set<Object> LIZIZ() {
        return super.keySet();
    }

    public /* bridge */ int LIZJ() {
        return super.size();
    }

    public /* bridge */ Collection<Object> LIZLLL() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return LIZ();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) LIZIZ();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return LIZJ();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) LIZLLL();
    }
}
