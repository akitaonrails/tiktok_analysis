package X;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19883312qt<K, V> implements Map<K, V> {
    public final InterfaceC19883512qv LL;
    public final Map<K, V> LLILLJJLI;

    @Override // java.util.Map
    public final void clear() {
        ((C19915712w7) this.LL).LIZIZ();
        this.LLILLJJLI.clear();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C19883212qs(this.LL, this.LLILLJJLI.entrySet());
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LLILLJJLI.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new C19883212qs(this.LL, this.LLILLJJLI.keySet());
    }

    @Override // java.util.Map
    public final int size() {
        return this.LLILLJJLI.size();
    }

    public final String toString() {
        return this.LLILLJJLI.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        final InterfaceC19883512qv interfaceC19883512qv = this.LL;
        final Collection<V> collectionValues = this.LLILLJJLI.values();
        return (Collection<V>) new Collection<E>(interfaceC19883512qv, collectionValues) { // from class: X.12qr
            public final InterfaceC19883512qv LL;
            public final Collection<E> LLILLJJLI;

            @Override // java.util.Collection
            public final void clear() {
                ((C19915712w7) this.LL).LIZIZ();
                this.LLILLJJLI.clear();
            }

            @Override // java.util.Collection
            public final int hashCode() {
                return this.LLILLJJLI.hashCode();
            }

            @Override // java.util.Collection
            public final boolean isEmpty() {
                return this.LLILLJJLI.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public final Iterator<E> iterator() {
                return new C19883412qu(this.LL, this.LLILLJJLI.iterator());
            }

            @Override // java.util.Collection
            public final int size() {
                return this.LLILLJJLI.size();
            }

            @Override // java.util.Collection
            public final Object[] toArray() {
                return this.LLILLJJLI.toArray();
            }

            public final String toString() {
                return this.LLILLJJLI.toString();
            }

            @Override // java.util.Collection
            public final boolean add(E e) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public final boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public final boolean contains(Object obj) {
                return this.LLILLJJLI.contains(obj);
            }

            @Override // java.util.Collection
            public final boolean containsAll(Collection<?> collection) {
                return this.LLILLJJLI.containsAll(collection);
            }

            @Override // java.util.Collection
            public final boolean equals(Object obj) {
                return this.LLILLJJLI.equals(obj);
            }

            @Override // java.util.Collection
            public final boolean remove(Object obj) {
                ((C19915712w7) this.LL).LIZIZ();
                return this.LLILLJJLI.remove(obj);
            }

            @Override // java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                ((C19915712w7) this.LL).LIZIZ();
                return this.LLILLJJLI.removeAll(collection);
            }

            @Override // java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                ((C19915712w7) this.LL).LIZIZ();
                return this.LLILLJJLI.retainAll(collection);
            }

            @Override // java.util.Collection
            public final <T> T[] toArray(T[] tArr) {
                return (T[]) this.LLILLJJLI.toArray(tArr);
            }

            {
                this.LL = interfaceC19883512qv;
                this.LLILLJJLI = collectionValues;
            }
        };
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LLILLJJLI.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.LLILLJJLI.containsValue(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.LLILLJJLI.equals(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.LLILLJJLI.get(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        ((C19915712w7) this.LL).LIZIZ();
        for (K k : map.keySet()) {
            Charset charset = C19922012x8.LIZ;
            k.getClass();
            map.get(k).getClass();
        }
        this.LLILLJJLI.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        ((C19915712w7) this.LL).LIZIZ();
        return this.LLILLJJLI.remove(obj);
    }

    public C19883312qt(InterfaceC19883512qv interfaceC19883512qv, Map<K, V> map) {
        this.LL = interfaceC19883512qv;
        this.LLILLJJLI = map;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        ((C19915712w7) this.LL).LIZIZ();
        Charset charset = C19922012x8.LIZ;
        k.getClass();
        v.getClass();
        return this.LLILLJJLI.put(k, v);
    }
}
