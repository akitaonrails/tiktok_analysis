package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.08J5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08J5<K, V> extends C08J6 implements Map<K, V> {
    @Override // X.C08J6
    /* JADX INFO: renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    public abstract Map<K, V> LJIIL();

    @Override // java.util.Map
    public final void clear() {
        LJIIL().clear();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return LJIIL().entrySet();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return LJIIL().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return LJIIL().isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return LJIIL().keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return LJIIL().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return LJIIL().values();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return LJIIL().containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return LJIIL().containsValue(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this && !LJIIL().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return LJIIL().get(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        LJIIL().putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return LJIIL().remove(obj);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return LJIIL().put(k, v);
    }
}
