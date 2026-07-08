package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13KU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13KU<K, V> implements Map<K, V>, C03W4 {
    public final C13KZ<K, V> LL;
    public C13KV<K, V> LLILLJJLI;
    public C13KX<K, V> LLILLL;
    public C13KT<K, V> LLILZ;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C13KV<K, V> c13kv = this.LLILLJJLI;
        if (c13kv != null) {
            return c13kv;
        }
        C13KV<K, V> c13kv2 = new C13KV<>(this.LL);
        this.LLILLJJLI = c13kv2;
        return c13kv2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LL.LJ();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C13KX<K, V> c13kx = this.LLILLL;
        if (c13kx != null) {
            return c13kx;
        }
        C13KX<K, V> c13kx2 = new C13KX<>(this.LL);
        this.LLILLL = c13kx2;
        return c13kx2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.LL.LJ;
    }

    public final String toString() {
        return this.LL.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C13KT<K, V> c13kt = this.LLILZ;
        if (c13kt != null) {
            return c13kt;
        }
        C13KT<K, V> c13kt2 = new C13KT<>(this.LL);
        this.LLILZ = c13kt2;
        return c13kt2;
    }

    public C13KU(C19991913Kb c19991913Kb) {
        this.LL = c19991913Kb;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LL.LIZIZ(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.LL.LIZJ(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13KU.class == obj.getClass()) {
            return Intrinsics.LJFF(this.LL, ((C13KU) obj).LL);
        }
        return false;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.LL.LIZLLL(obj);
    }
}
