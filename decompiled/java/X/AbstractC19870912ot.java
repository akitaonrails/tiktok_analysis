package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* JADX INFO: renamed from: X.12ot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19870912ot<K, V> implements Map<K, V>, Serializable {
    public transient AbstractC19875112pZ<Map.Entry<K, V>> LL;
    public transient AbstractC19875112pZ<K> LLILLJJLI;
    public transient AbstractC19875812pg<V> LLILLL;
    public transient C19872912pD<K, V> LLILZ;

    public abstract AbstractC19875112pZ<Map.Entry<K, V>> LIZ();

    public abstract AbstractC19875112pZ<K> LIZIZ();

    public abstract AbstractC19875812pg<V> LIZJ();

    public boolean LIZLLL() {
        return false;
    }

    public abstract boolean LJ();

    @Override // java.util.Map
    public abstract V get(Object obj);

    public static <K, V> C19871112ov<K, V> builder() {
        return new C19871112ov<>(4);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public AbstractC19875112pZ<Map.Entry<K, V>> entrySet() {
        AbstractC19875112pZ<Map.Entry<K, V>> abstractC19875112pZ = this.LL;
        if (abstractC19875112pZ != null) {
            return abstractC19875112pZ;
        }
        AbstractC19875112pZ<Map.Entry<K, V>> abstractC19875112pZLIZ = LIZ();
        this.LL = abstractC19875112pZLIZ;
        return abstractC19875112pZLIZ;
    }

    @Override // java.util.Map
    public AbstractC19875112pZ<K> keySet() {
        AbstractC19875112pZ<K> abstractC19875112pZ = this.LLILLJJLI;
        if (abstractC19875112pZ != null) {
            return abstractC19875112pZ;
        }
        AbstractC19875112pZ<K> abstractC19875112pZLIZIZ = LIZIZ();
        this.LLILLJJLI = abstractC19875112pZLIZIZ;
        return abstractC19875112pZLIZIZ;
    }

    @Override // java.util.Map
    public AbstractC19875812pg<V> values() {
        AbstractC19875812pg<V> abstractC19875812pg = this.LLILLL;
        if (abstractC19875812pg != null) {
            return abstractC19875812pg;
        }
        AbstractC19875812pg<V> abstractC19875812pgLIZJ = LIZJ();
        this.LLILLL = abstractC19875812pgLIZJ;
        return abstractC19875812pgLIZJ;
    }

    public Object writeReplace() {
        return new Serializable(this) { // from class: X.12ou
            public static final long serialVersionUID = 0;
            public final Object LL;
            public final Object LLILLJJLI;

            public final Object readResolve() {
                Object obj = this.LL;
                if (obj instanceof AbstractC19875112pZ) {
                    AbstractC19875812pg abstractC19875812pg = (AbstractC19875812pg) obj;
                    AbstractC19875812pg abstractC19875812pg2 = (AbstractC19875812pg) this.LLILLJJLI;
                    C19871112ov c19871112ov = new C19871112ov(abstractC19875812pg.size());
                    AbstractC19853312m3 it2 = abstractC19875812pg.iterator();
                    AbstractC19853312m3 it3 = abstractC19875812pg2.iterator();
                    while (it2.hasNext()) {
                        c19871112ov.LIZIZ(it2.next(), it3.next());
                    }
                    return c19871112ov.LIZ();
                }
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) this.LLILLJJLI;
                C19871112ov c19871112ov2 = new C19871112ov(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    c19871112ov2.LIZIZ(objArr[i], objArr2[i]);
                }
                return c19871112ov2.LIZ();
            }

            {
                Object[] objArr = new Object[this.size()];
                Object[] objArr2 = new Object[this.size()];
                AbstractC19853312m3<Map.Entry<K, V>> it2 = this.entrySet().iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Map.Entry<K, V> next = it2.next();
                    objArr[i] = next.getKey();
                    objArr2[i] = next.getValue();
                    i++;
                }
                this.LL = objArr;
                this.LLILLJJLI = objArr2;
            }
        };
    }

    public C19872912pD<K, V> asMultimap() {
        if (isEmpty()) {
            return C19872912pD.of();
        }
        C19872912pD<K, V> c19872912pD = this.LLILZ;
        if (c19872912pD != null) {
            return c19872912pD;
        }
        C19872912pD<K, V> c19872912pD2 = new C19872912pD<>(new AbstractC19869212oc<K, AbstractC19875112pZ<V>>() { // from class: X.12oY
            @Override // X.AbstractC19869212oc, X.AbstractC19870912ot
            public final AbstractC19875112pZ<K> LIZIZ() {
                return this.LLILZIL.keySet();
            }

            @Override // X.AbstractC19870912ot
            public final boolean LIZLLL() {
                return this.LLILZIL.LIZLLL();
            }

            @Override // X.AbstractC19870912ot
            public final boolean LJ() {
                return this.LLILZIL.LJ();
            }

            @Override // X.AbstractC19869212oc
            public final AbstractC19853312m3<Map.Entry<K, AbstractC19875112pZ<V>>> LJFF() {
                final AbstractC19853312m3<Map.Entry<K, V>> it2 = this.LLILZIL.entrySet().iterator();
                return new AbstractC19853312m3<Map.Entry<K, AbstractC19875112pZ<V>>>() { // from class: X.12oU
                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it2.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        final Map.Entry entry = (Map.Entry) it2.next();
                        return new AbstractC19868112oR<Object, AbstractC19875112pZ<Object>>() { // from class: X.12oT
                            @Override // X.AbstractC19868112oR, java.util.Map.Entry
                            public final Object getKey() {
                                return entry.getKey();
                            }

                            @Override // X.AbstractC19868112oR, java.util.Map.Entry
                            public final Object getValue() {
                                return AbstractC19875112pZ.of(entry.getValue());
                            }
                        };
                    }
                };
            }

            @Override // X.AbstractC19870912ot, java.util.Map
            public final int hashCode() {
                return this.LLILZIL.hashCode();
            }

            @Override // java.util.Map
            public final int size() {
                return this.LLILZIL.size();
            }

            @Override // X.AbstractC19870912ot, java.util.Map
            public final boolean containsKey(Object obj) {
                return this.LLILZIL.containsKey(obj);
            }

            @Override // X.AbstractC19870912ot, java.util.Map
            public final Object get(Object obj) {
                Object obj2 = this.LLILZIL.get(obj);
                if (obj2 == null) {
                    return null;
                }
                return AbstractC19875112pZ.of(obj2);
            }
        }, size());
        this.LLILZ = c19872912pD2;
        return c19872912pD2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return C1664790tQL.LIZIZ(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        int size = size();
        C19863912nl.LIZIZ(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static <K, V> AbstractC19870912ot<K, V> of() {
        return C19869812oi.LLIZLLLIL;
    }

    public static <K, V> C19871112ov<K, V> builderWithExpectedSize(int i) {
        C19863912nl.LIZIZ(i, "expectedSize");
        return new C19871112ov<>(i);
    }

    public static <K, V> AbstractC19870912ot<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC19870912ot) && !(map instanceof SortedMap)) {
            AbstractC19870912ot<K, V> abstractC19870912ot = (AbstractC19870912ot) map;
            if (!abstractC19870912ot.LJ()) {
                return abstractC19870912ot;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> AbstractC19870912ot<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> AbstractC19870912ot<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            size = 4;
        }
        C19871112ov c19871112ov = new C19871112ov(size);
        c19871112ov.LIZJ(iterable);
        return c19871112ov.LIZ();
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v) {
        C19863912nl.LIZ(k, v);
        return C19869812oi.LJFF(1, new Object[]{k, v});
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        return C19869812oi.LJFF(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        return C19869812oi.LJFF(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        C19863912nl.LIZ(k4, v4);
        return C19869812oi.LJFF(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        C19863912nl.LIZ(k4, v4);
        C19863912nl.LIZ(k5, v5);
        return C19869812oi.LJFF(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        C19863912nl.LIZ(k4, v4);
        C19863912nl.LIZ(k5, v5);
        C19863912nl.LIZ(k6, v6);
        return C19869812oi.LJFF(6, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v8) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        C19863912nl.LIZ(k4, v4);
        C19863912nl.LIZ(k5, v5);
        C19863912nl.LIZ(k6, v6);
        C19863912nl.LIZ(k7, v8);
        return C19869812oi.LJFF(7, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v8});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v8, K k8, V v9) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        C19863912nl.LIZ(k4, v4);
        C19863912nl.LIZ(k5, v5);
        C19863912nl.LIZ(k6, v6);
        C19863912nl.LIZ(k7, v8);
        C19863912nl.LIZ(k8, v9);
        return C19869812oi.LJFF(8, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v8, k8, v9});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v8, K k8, V v9, K k9, V v10) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        C19863912nl.LIZ(k4, v4);
        C19863912nl.LIZ(k5, v5);
        C19863912nl.LIZ(k6, v6);
        C19863912nl.LIZ(k7, v8);
        C19863912nl.LIZ(k8, v9);
        C19863912nl.LIZ(k9, v10);
        return C19869812oi.LJFF(9, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v8, k8, v9, k9, v10});
    }

    public static <K, V> AbstractC19870912ot<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v8, K k8, V v9, K k9, V v10, K k10, V v11) {
        C19863912nl.LIZ(k, v);
        C19863912nl.LIZ(k2, v2);
        C19863912nl.LIZ(k3, v3);
        C19863912nl.LIZ(k4, v4);
        C19863912nl.LIZ(k5, v5);
        C19863912nl.LIZ(k6, v6);
        C19863912nl.LIZ(k7, v8);
        C19863912nl.LIZ(k8, v9);
        C19863912nl.LIZ(k9, v10);
        C19863912nl.LIZ(k10, v11);
        return C19869812oi.LJFF(10, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v8, k8, v9, k9, v10, k10, v11});
    }
}
