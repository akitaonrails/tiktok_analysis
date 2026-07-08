package X;

import Y.AObjectS369S0100000_26;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19969013Bg<K, V> implements Map<K, V>, C03W4 {
    public static final C19969113Bh LL;
    public volatile Set<? extends K> _keys;
    public volatile Collection<? extends V> _values;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Bh] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LL = new Object(defaultConstructorMarker) { // from class: X.13Bh
        };
    }

    public abstract Set<Map.Entry<K, V>> LIZJ();

    @Override // java.util.Map
    public final void clear() {
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
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<K> LIZLLL() {
        if (this._keys == null) {
            this._keys = new AbstractC19969413Bk<K>(this) { // from class: X.13Bj
                public final /* synthetic */ AbstractC19969013Bg<K, V> LLILLJJLI;

                @Override // X.AbstractC2253808sK
                public final int LIZJ() {
                    return this.LLILLJJLI.size();
                }

                @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator<K> iterator() {
                    return new C11UB(this.LLILLJJLI.entrySet().iterator());
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LLILLJJLI = this;
                }

                @Override // X.AbstractC2253808sK, java.util.Collection
                public final boolean contains(Object obj) {
                    return this.LLILLJJLI.containsKey(obj);
                }
            };
        }
        return this._keys;
    }

    public Collection<V> LJFF() {
        if (this._values == null) {
            this._values = new AbstractC2253808sK<V>(this) { // from class: X.13Bi
                public final /* synthetic */ AbstractC19969013Bg<K, V> LL;

                @Override // X.AbstractC2253808sK
                public final int LIZJ() {
                    return this.LL.size();
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator<V> iterator() {
                    return new C11UC(this.LL.entrySet().iterator());
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = this;
                }

                @Override // X.AbstractC2253808sK, java.util.Collection
                public final boolean contains(Object obj) {
                    return this.LL.containsValue(obj);
                }
            };
        }
        return this._values;
    }

    public int LJ() {
        return entrySet().size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return LIZJ();
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return LIZLLL();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return LJ();
    }

    public final String toString() {
        return C13LP.LJJLIIIJ(entrySet(), ", ", "{", "}", 0, null, new AObjectS369S0100000_26(this, 1), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return LJFF();
    }

    public final Map.Entry<K, V> LJI(K k) {
        Object next;
        Iterator<T> it2 = entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Map.Entry) next).getKey(), k)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (Map.Entry) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (LJI(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Map.Entry) it2.next()).getValue(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (entry != null) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    V v = get(key);
                    if (Intrinsics.LJFF(value, v)) {
                        if (v == null && !containsKey(key)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry<K, V> entryLJI = LJI(obj);
        if (entryLJI != null) {
            return entryLJI.getValue();
        }
        return null;
    }
}
