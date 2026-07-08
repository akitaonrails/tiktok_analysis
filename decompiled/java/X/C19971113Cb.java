package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.13Cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19971113Cb<K, V> extends AbstractC1487150onp<K, V> implements C13D3<K, V> {
    public C19971313Cd<K, V> LL;
    public C19972913Ct LLILLJJLI = new C19972913Ct();
    public C19971213Cc<K, V> LLILLL;
    public V LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    @Override // X.AbstractC1487150onp
    public final Set<Map.Entry<K, V>> LIZ() {
        return new C19971013Ca(this);
    }

    @Override // X.AbstractC1487150onp
    public final Set<K> LIZIZ() {
        return new C13CT<K>(this) { // from class: X.13CY
            public final C19971113Cb<K, V> LL;

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
                final C19971113Cb<K, V> c19971113Cb = this.LL;
                return new C19978713Ez<K, V, K>(c19971113Cb) { // from class: X.13F8
                    {
                        C13F3[] c13f3Arr = new C13F3[8];
                        int i = 0;
                        do {
                            c13f3Arr[i] = new C13FB();
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
        return new C139S<V>(this) { // from class: X.13CX
            public final C19971113Cb<K, V> LL;

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
                final C19971113Cb<K, V> c19971113Cb = this.LL;
                return new C19978713Ez<K, V, V>(c19971113Cb) { // from class: X.13FA
                    {
                        C13F3[] c13f3Arr = new C13F3[8];
                        int i = 0;
                        do {
                            c13f3Arr[i] = new C13FC();
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

    @Override // X.C13D3
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public C19971313Cd<K, V> build() {
        C19971213Cc<K, V> c19971213Cc = this.LLILLL;
        C19971313Cd<K, V> c19971313Cd = this.LL;
        if (c19971213Cc != c19971313Cd.LLILLJJLI) {
            this.LLILLJJLI = new C19972913Ct();
            c19971313Cd = new C19971313Cd<>(this.LLILLL, LIZJ());
        }
        this.LL = c19971313Cd;
        return c19971313Cd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.LLILLL = C19971213Cc.LJ;
        LJFF(0);
    }

    @Override // X.AbstractC1487150onp
    public final int LIZJ() {
        return this.LLILZLL;
    }

    public C19971113Cb(C19971313Cd<K, V> c19971313Cd) {
        this.LL = c19971313Cd;
        this.LLILLL = c19971313Cd.LLILLJJLI;
        this.LLILZLL = c19971313Cd.size();
    }

    public final void LJFF(int i) {
        this.LLILZLL = i;
        this.LLILZIL++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k) {
        int iHashCode;
        C19971213Cc<K, V> c19971213Cc = this.LLILLL;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        return c19971213Cc.LIZLLL(iHashCode, 0, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k) {
        int iHashCode;
        C19971213Cc<K, V> c19971213Cc = this.LLILLL;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        return (V) c19971213Cc.LJI(iHashCode, 0, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C19971113Cb c19971113Cb;
        C19971313Cd<K, V> c19971313CdBuild;
        if (((map instanceof C19971313Cd) && (c19971313CdBuild = (C19971313Cd) map) != null) || ((map instanceof C19971113Cb) && (c19971113Cb = (C19971113Cb) map) != null && (c19971313CdBuild = c19971113Cb.build()) != null)) {
            C19972713Cr c19972713Cr = new C19972713Cr();
            int i = this.LLILZLL;
            this.LLILLL = this.LLILLL.LJIIL(c19971313CdBuild.LLILLJJLI, 0, c19972713Cr, this);
            int size = (c19971313CdBuild.size() + i) - c19972713Cr.LIZ;
            if (i != size) {
                LJFF(size);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k) {
        int iHashCode;
        this.LLILZ = null;
        C19971213Cc<K, V> c19971213Cc = this.LLILLL;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        C19971213Cc<K, V> c19971213CcLJIILIIL = c19971213Cc.LJIILIIL(iHashCode, k, 0, this);
        if (c19971213CcLJIILIIL == null) {
            c19971213CcLJIILIIL = C19971213Cc.LJ;
        }
        this.LLILLL = c19971213CcLJIILIIL;
        return this.LLILZ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int iHashCode;
        this.LLILZ = null;
        C19971213Cc<K, V> c19971213Cc = this.LLILLL;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        this.LLILLL = c19971213Cc.LJIIJJI(iHashCode, k, v, 0, this);
        return this.LLILZ;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iHashCode;
        int iLIZJ = LIZJ();
        C19971213Cc<K, V> c19971213Cc = this.LLILLL;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        C19971213Cc<K, V> c19971213CcLJIILJJIL = c19971213Cc.LJIILJJIL(iHashCode, obj, obj2, 0, this);
        if (c19971213CcLJIILJJIL == null) {
            c19971213CcLJIILJJIL = C19971213Cc.LJ;
        }
        this.LLILLL = c19971213CcLJIILJJIL;
        if (iLIZJ == LIZJ()) {
            return false;
        }
        return true;
    }
}
