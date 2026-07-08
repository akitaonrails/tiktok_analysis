package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ono, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1487140ono<K, V> extends AbstractC2252311DDp<Map<K, ? extends V>> implements Map<K, V>, InterfaceC2095908Iz {
    public final Map<K, V> LLILLL;

    public C1487140ono() {
        this(null);
    }

    @Override // java.util.Map
    public final void clear() {
        this.LLILLL.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LLILLL.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.LLILLL.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.LLILLL.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LLILLL.isEmpty();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.LLILLL.entrySet();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.LLILLL.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LLILLL.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.LLILLL.values();
    }

    public C1487140ono(Object obj) {
        this.LLILLL = new ConcurrentHashMap();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        this.LLILLL.putAll(map);
        LJ(this);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        V vRemove = this.LLILLL.remove(obj);
        LJ(this);
        return vRemove;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        V vPut = this.LLILLL.put(k, v);
        LJ(this);
        return vPut;
    }
}
