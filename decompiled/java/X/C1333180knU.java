package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0knU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333180knU<K, V> extends ConcurrentHashMap<K, V> {
    public C1333180knU() {
    }

    public C1333180knU(int i) {
        super(i);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) super.get(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) super.remove(obj);
    }

    public C1333180knU(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public C1333180knU(int i, float f) {
        super(i, f);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null && v != null) {
            return (V) super.put(k, v);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        if (k != null && v != null) {
            return (V) super.putIfAbsent(k, v);
        }
        return null;
    }

    public C1333180knU(int i, float f, int i2) {
        super(i, f, i2);
    }
}
