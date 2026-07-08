package X;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.0omW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractConcurrentMapC1486340omW<K, V> extends C08J5<K, V> implements ConcurrentMap<K, V> {
    @Override // X.C08J5
    /* JADX INFO: renamed from: LJJ, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> LJIIL();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        return LJIIL().putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        return LJIIL().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k, V v) {
        return LJIIL().replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        return LJIIL().replace(k, v, v2);
    }
}
