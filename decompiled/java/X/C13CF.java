package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS318S0000000_30;

/* JADX INFO: renamed from: X.13CF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CF<K, V> extends AbstractC1487150onp<K, V> implements C08J1<K, V> {
    public C13C5<K, V> LL;
    public C13CS LLILLJJLI = new C13CS();
    public C13CU<K, V> LLILLL;
    public V LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    @Override // X.AbstractC1487150onp
    public final Set<Map.Entry<K, V>> LIZ() {
        return new C13CP<Map.Entry<K, V>, K, V>(this) { // from class: X.13CH
            public final C13CF<K, V> LL;

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
                return new C19977613Eo(this.LL);
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
        return new C13CT<K>(this) { // from class: X.13CI
            public final C13CF<K, V> LL;

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
                final C13CF<K, V> c13cf = this.LL;
                return new C19977413Em<K, V, K>(c13cf) { // from class: X.13Eu
                    {
                        AbstractC19977713Ep[] abstractC19977713EpArr = new AbstractC19977713Ep[8];
                        int i = 0;
                        do {
                            abstractC19977713EpArr[i] = new C19978513Ex();
                            i++;
                        } while (i < 8);
                    }
                };
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
    public final Collection<V> LIZLLL() {
        return new C139S<V>(this) { // from class: X.13CM
            public final C13CF<K, V> LL;

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
                final C13CF<K, V> c13cf = this.LL;
                return new C19977413Em<K, V, V>(c13cf) { // from class: X.13Ew
                    {
                        AbstractC19977713Ep[] abstractC19977713EpArr = new AbstractC19977713Ep[8];
                        int i = 0;
                        do {
                            abstractC19977713EpArr[i] = new C19978613Ey();
                            i++;
                        } while (i < 8);
                    }
                };
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
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final C13C5<K, V> build() {
        C13CU<K, V> c13cu = this.LLILLL;
        C13C5<K, V> c13c5 = this.LL;
        if (c13cu != c13c5.LLILLJJLI) {
            this.LLILLJJLI = new C13CS();
            c13c5 = new C13C5<>(this.LLILLL, LIZJ());
        }
        this.LL = c13c5;
        return c13c5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.LLILLL = C13CU.LJ;
        LJFF(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // X.AbstractC1487150onp
    public final int LIZJ() {
        return this.LLILZLL;
    }

    public C13CF(C13C5<K, V> c13c5) {
        this.LL = c13c5;
        this.LLILLL = c13c5.LLILLJJLI;
        this.LLILZLL = c13c5.LJ();
    }

    public final void LJFF(int i) {
        this.LLILZLL = i;
        this.LLILZIL++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int iHashCode;
        C13CU<K, V> c13cu = this.LLILLL;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        return c13cu.LIZLLL(iHashCode, 0, obj);
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
        if (this.LLILZLL != map.size()) {
            return false;
        }
        if (map instanceof C13C5) {
            return this.LLILLL.LJI(((C13C5) obj).LLILLJJLI, AFwS318S0000000_30.get$arr$(25));
        }
        if (map instanceof C13CF) {
            return this.LLILLL.LJI(((C13CF) obj).LLILLL, AFwS318S0000000_30.get$arr$(26));
        }
        if (map instanceof C13C4) {
            return this.LLILLL.LJI(((C13C4) obj).LLILZ.LLILLJJLI, AFwS318S0000000_30.get$arr$(27));
        }
        if (map instanceof C13CE) {
            return this.LLILLL.LJI(((C13CE) obj).LLILZ.LLILLL, AFwS318S0000000_30.get$arr$(28));
        }
        return C219800t2.LIZIZ(this, map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int iHashCode;
        C13CU<K, V> c13cu = this.LLILLL;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        return (V) c13cu.LJII(iHashCode, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C13CF c13cf;
        C13C5<K, V> c13c5Build;
        if (((map instanceof C13C5) && (c13c5Build = (C13C5) map) != null) || ((map instanceof C13CF) && (c13cf = (C13CF) map) != null && (c13c5Build = c13cf.build()) != null)) {
            C07WU c07wu = new C07WU(0);
            int i = this.LLILZLL;
            this.LLILLL = this.LLILLL.LJIILIIL(c13c5Build.LLILLJJLI, 0, c07wu, this);
            int i2 = (c13c5Build.LLILLL + i) - c07wu.LIZ;
            if (i != i2) {
                LJFF(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        int iHashCode;
        this.LLILZ = null;
        C13CU<K, V> c13cu = this.LLILLL;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        C13CU<K, V> c13cuLJIILJJIL = c13cu.LJIILJJIL(iHashCode, obj, 0, this);
        if (c13cuLJIILJJIL == null) {
            c13cuLJIILJJIL = C13CU.LJ;
        }
        this.LLILLL = c13cuLJIILJJIL;
        return this.LLILZ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int iHashCode;
        this.LLILZ = null;
        C13CU<K, V> c13cu = this.LLILLL;
        if (k == null) {
            iHashCode = 0;
        } else {
            iHashCode = k.hashCode();
        }
        this.LLILLL = c13cu.LJIIL(iHashCode, k, v, 0, this);
        return this.LLILZ;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iHashCode;
        int iLIZJ = LIZJ();
        C13CU<K, V> c13cu = this.LLILLL;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        C13CU<K, V> c13cuLJIILL = c13cu.LJIILL(iHashCode, obj, obj2, 0, this);
        if (c13cuLJIILL == null) {
            c13cuLJIILL = C13CU.LJ;
        }
        this.LLILLL = c13cuLJIILL;
        if (iLIZJ == LIZJ()) {
            return false;
        }
        return true;
    }
}
