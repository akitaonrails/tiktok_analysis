package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13CE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CE<K, V> extends AbstractC1487150onp<K, V> implements C08J1<K, V> {
    public C13C4<K, V> LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public final C13CF<K, C13CR<V>> LLILZ;

    @Override // X.AbstractC1487150onp
    public final Set<Map.Entry<K, V>> LIZ() {
        return new C13CP<Map.Entry<K, V>, K, V>(this) { // from class: X.13CG
            public final C13CE<K, V> LL;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // X.C13CT
            public final int getSize() {
                return this.LL.LIZJ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return new C13CD(this.LL);
            }

            {
                this.LL = this;
            }

            @Override // X.C13CP
            public final boolean LIZJ(Map.Entry<? extends K, ? extends V> entry) {
                return C219800t2.LIZ(this.LL, entry);
            }

            @Override // X.C13CP
            public final boolean LJ(Map.Entry<? extends K, ? extends V> entry) {
                return this.LL.remove(entry.getKey(), entry.getValue());
            }

            @Override // X.C13CT, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // X.AbstractC1487150onp
    public final Set<K> LIZIZ() {
        return new C13CT<K>(this) { // from class: X.13CJ
            public final C13CE<K, V> LL;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // X.C13CT
            public final int getSize() {
                return this.LL.LIZJ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<K> iterator() {
                return new C13CK(this.LL);
            }

            {
                this.LL = this;
            }

            @Override // X.C13CT, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean add(K k) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LL.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (this.LL.containsKey(obj)) {
                    this.LL.remove(obj);
                    return true;
                }
                return false;
            }
        };
    }

    @Override // X.AbstractC1487150onp
    public final int LIZJ() {
        return this.LLILZ.LIZJ();
    }

    @Override // X.AbstractC1487150onp
    public final Collection<V> LIZLLL() {
        return new C139S<V>(this) { // from class: X.13CN
            public final C13CE<K, V> LL;

            @Override // X.C139S
            public final int LIZJ() {
                return this.LL.LIZJ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                return new C13CO(this.LL);
            }

            {
                this.LL = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean add(V v) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsValue(obj);
            }
        };
    }

    @Override // X.C08J1
    public final InterfaceC2091408Hg<K, V> build() {
        C13C5<K, C13CR<V>> c13c5Build = this.LLILZ.build();
        C13C4<K, V> c13c4 = this.LL;
        if (c13c5Build != c13c4.LLILZ) {
            c13c4 = new C13C4<>(this.LLILLJJLI, this.LLILLL, c13c5Build);
        }
        this.LL = c13c4;
        return c13c4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.LLILZ.clear();
        C13C3 c13c3 = C13C3.LIZ;
        this.LLILLJJLI = c13c3;
        this.LLILLL = c13c3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public C13CE(C13C4<K, V> c13c4) {
        this.LL = c13c4;
        this.LLILLJJLI = c13c4.LLILLJJLI;
        this.LLILLL = c13c4.LLILLL;
        C13C5<K, C13CR<V>> c13c5 = c13c4.LLILZ;
        c13c5.getClass();
        this.LLILZ = new C13CF<>(c13c5);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LLILZ.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (LIZJ() != map.size()) {
            return false;
        }
        if (map instanceof C13C4) {
            return this.LLILZ.LLILLL.LJI(((C13C4) obj).LLILZ.LLILLJJLI, AFwS318S0000000_30.get$arr$(33));
        }
        if (map instanceof C13CE) {
            return this.LLILZ.LLILLL.LJI(((C13CE) obj).LLILZ.LLILLL, AFwS318S0000000_30.get$arr$(34));
        }
        if (map instanceof C13C5) {
            return this.LLILZ.LLILLL.LJI(((C13C5) obj).LLILLJJLI, AFwS318S0000000_30.get$arr$(35));
        }
        if (map instanceof C13CF) {
            return this.LLILZ.LLILLL.LJI(((C13CF) obj).LLILLL, AFwS318S0000000_30.get$arr$(36));
        }
        return C219800t2.LIZIZ(this, map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        C13CR<V> c13cr = this.LLILZ.get(obj);
        if (c13cr == null) {
            return null;
        }
        return c13cr.LIZ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        C13CR<V> c13crRemove = this.LLILZ.remove(obj);
        if (c13crRemove == null) {
            return null;
        }
        Object obj2 = c13crRemove.LIZIZ;
        C13C3 c13c3 = C13C3.LIZ;
        if (obj2 != c13c3) {
            C13CR<V> c13cr = this.LLILZ.get(obj2);
            C13CF<K, C13CR<V>> c13cf = this.LLILZ;
            Object obj3 = c13crRemove.LIZIZ;
            Object obj4 = c13crRemove.LIZJ;
            c13cr.getClass();
            c13cf.put((K) obj3, new C13CR<>(c13cr.LIZ, c13cr.LIZIZ, obj4));
        } else {
            this.LLILLJJLI = c13crRemove.LIZJ;
        }
        Object obj5 = c13crRemove.LIZJ;
        if (obj5 != c13c3) {
            C13CR<V> c13cr2 = this.LLILZ.get(obj5);
            this.LLILZ.put((K) c13crRemove.LIZJ, new C13CR<>(c13cr2.LIZ, c13crRemove.LIZIZ, c13cr2.LIZJ));
        } else {
            this.LLILLL = c13crRemove.LIZIZ;
        }
        return c13crRemove.LIZ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        C13CR<V> c13cr = this.LLILZ.get(k);
        if (c13cr != null) {
            if (c13cr.LIZ == v) {
                return v;
            }
            this.LLILZ.put(k, new C13CR<>(v, c13cr.LIZIZ, c13cr.LIZJ));
            return c13cr.LIZ;
        }
        if (isEmpty()) {
            this.LLILLJJLI = k;
            this.LLILLL = k;
            C13CF<K, C13CR<V>> c13cf = this.LLILZ;
            C13C3 c13c3 = C13C3.LIZ;
            c13cf.put(k, new C13CR<>(v, c13c3, c13c3));
            return null;
        }
        Object obj = this.LLILLL;
        C13CR<V> c13cr2 = this.LLILZ.get(obj);
        C13C3 c13c32 = C13C3.LIZ;
        this.LLILZ.put((K) obj, new C13CR<>(c13cr2.LIZ, c13cr2.LIZIZ, k));
        this.LLILZ.put(k, new C13CR<>(v, obj, c13c32));
        this.LLILLL = k;
        return null;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        C13CR<V> c13cr = this.LLILZ.get(obj);
        if (c13cr == null || !Intrinsics.LJFF(c13cr.LIZ, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
