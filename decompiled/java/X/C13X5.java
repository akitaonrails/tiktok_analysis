package X;

import Y.AComparatorS49S0000000_30;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: X.13X5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13X5<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final AComparatorS49S0000000_30 LLJ = new AComparatorS49S0000000_30(15);
    public int LLILZ;
    public int LLILZIL;
    public C13X5<K, V>.d LLIZ;
    public C13X5<K, V>.e LLIZLLLIL;
    public final Comparator<? super K> LL = LLJ;
    public final C13X6<K, V> LLILLL = new C13X6<>();
    public C13X6<K, V>[] LLILLJJLI = new C13X6[16];
    public int LLILZLL = 12;

    /* JADX INFO: renamed from: X.13X5$d */
    public final class d extends AbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C13X5.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C13X5<K, V>.f<Map.Entry<K, V>>(this) { // from class: X.13X8
                @Override // java.util.Iterator
                public final Object next() {
                    return LIZ();
                }

                {
                    super();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C13X5.this.LLILZ;
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && C13X5.this.LIZIZ((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C13X6<K, V> c13x6LIZIZ;
            if (!(obj instanceof Map.Entry) || (c13x6LIZIZ = C13X5.this.LIZIZ((Map.Entry) obj)) == null) {
                return false;
            }
            C13X5.this.LJ(c13x6LIZIZ, true);
            return true;
        }
    }

    /* JADX INFO: renamed from: X.13X5$e */
    public final class e extends AbstractSet<K> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C13X5.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C13X5<K, V>.f<K>(this) { // from class: X.13X9
                @Override // java.util.Iterator
                public final K next() {
                    return LIZ().LLILZLL;
                }

                {
                    super();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C13X5.this.LLILZ;
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C13X5.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C13X5 c13x5 = C13X5.this;
            C13X6<K, V> c13x6LIZJ = c13x5.LIZJ(obj);
            if (c13x6LIZJ != null) {
                c13x5.LJ(c13x6LIZJ, true);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: X.13X5$f */
    public abstract class f<T> implements Iterator<T> {
        public C13X6<K, V> LL;
        public C13X6<K, V> LLILLJJLI;
        public int LLILLL;

        public final C13X6<K, V> LIZ() {
            C13X6<K, V> c13x6 = this.LL;
            C13X5 c13x5 = C13X5.this;
            if (c13x6 == c13x5.LLILLL) {
                throw new NoSuchElementException();
            }
            if (c13x5.LLILZIL != this.LLILLL) {
                throw new ConcurrentModificationException();
            }
            this.LL = c13x6.LLILZ;
            this.LLILLJJLI = c13x6;
            return c13x6;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LL != C13X5.this.LLILLL;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C13X6<K, V> c13x6 = this.LLILLJJLI;
            if (c13x6 == null) {
                throw new IllegalStateException();
            }
            C13X5.this.LJ(c13x6, true);
            this.LLILLJJLI = null;
            this.LLILLL = C13X5.this.LLILZIL;
        }

        public f() {
            this.LL = C13X5.this.LLILLL.LLILZ;
            this.LLILLL = C13X5.this.LLILZIL;
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.LLILLJJLI, (Object) null);
        this.LLILZ = 0;
        this.LLILZIL++;
        C13X6<K, V> c13x6 = this.LLILLL;
        C13X6<K, V> c13x62 = c13x6.LLILZ;
        while (c13x62 != c13x6) {
            C13X6<K, V> c13x63 = c13x62.LLILZ;
            c13x62.LLILZIL = null;
            c13x62.LLILZ = null;
            c13x62 = c13x63;
        }
        c13x6.LLILZIL = c13x6;
        c13x6.LLILZ = c13x6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C13X5<K, V>.d dVar = this.LLIZ;
        if (dVar != null) {
            return dVar;
        }
        C13X5<K, V>.d dVar2 = new d();
        this.LLIZ = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C13X5<K, V>.e eVar = this.LLIZLLLIL;
        if (eVar != null) {
            return eVar;
        }
        C13X5<K, V>.e eVar2 = new e();
        this.LLIZLLLIL = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LLILZ;
    }

    public final C13X6<K, V> LIZIZ(Map.Entry<?, ?> entry) {
        C13X6<K, V> c13x6LIZJ = LIZJ(entry.getKey());
        if (c13x6LIZJ != null) {
            V v = c13x6LIZJ.LLIZLLLIL;
            Object value = entry.getValue();
            if (v == value || (v != null && v.equals(value))) {
                return c13x6LIZJ;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C13X6<K, V> LIZJ(Object obj) {
        C13X6<K, V> c13x6LIZ = null;
        if (obj != 0) {
            try {
                c13x6LIZ = LIZ(obj, false);
                return c13x6LIZ;
            } catch (ClassCastException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return c13x6LIZ;
    }

    public final void LJI(C13X6<K, V> c13x6) {
        int i;
        int i2;
        C13X6<K, V> c13x62 = c13x6.LLILLJJLI;
        C13X6<K, V> c13x63 = c13x6.LLILLL;
        C13X6<K, V> c13x64 = c13x63.LLILLJJLI;
        C13X6<K, V> c13x65 = c13x63.LLILLL;
        c13x6.LLILLL = c13x64;
        if (c13x64 != null) {
            c13x64.LL = c13x6;
        }
        LJFF(c13x6, c13x63);
        c13x63.LLILLJJLI = c13x6;
        c13x6.LL = c13x63;
        int i3 = 0;
        if (c13x62 != null) {
            i = c13x62.LLJ;
        } else {
            i = 0;
        }
        if (c13x64 != null) {
            i2 = c13x64.LLJ;
        } else {
            i2 = 0;
        }
        int iMax = Math.max(i, i2) + 1;
        c13x6.LLJ = iMax;
        if (c13x65 != null) {
            i3 = c13x65.LLJ;
        }
        c13x63.LLJ = Math.max(iMax, i3) + 1;
    }

    public final void LJII(C13X6<K, V> c13x6) {
        int i;
        int i2;
        C13X6<K, V> c13x62 = c13x6.LLILLJJLI;
        C13X6<K, V> c13x63 = c13x6.LLILLL;
        C13X6<K, V> c13x64 = c13x62.LLILLJJLI;
        C13X6<K, V> c13x65 = c13x62.LLILLL;
        c13x6.LLILLJJLI = c13x65;
        if (c13x65 != null) {
            c13x65.LL = c13x6;
        }
        LJFF(c13x6, c13x62);
        c13x62.LLILLL = c13x6;
        c13x6.LL = c13x62;
        int i3 = 0;
        if (c13x63 != null) {
            i = c13x63.LLJ;
        } else {
            i = 0;
        }
        if (c13x65 != null) {
            i2 = c13x65.LLJ;
        } else {
            i2 = 0;
        }
        int iMax = Math.max(i, i2) + 1;
        c13x6.LLJ = iMax;
        if (c13x64 != null) {
            i3 = c13x64.LLJ;
        }
        c13x62.LLJ = Math.max(iMax, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (LIZJ(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        C13X6<K, V> c13x6LIZJ = LIZJ(obj);
        if (c13x6LIZJ != null) {
            return c13x6LIZJ.LLIZLLLIL;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        C13X6<K, V> c13x6LIZJ = LIZJ(obj);
        if (c13x6LIZJ != null) {
            LJ(c13x6LIZJ, true);
            return c13x6LIZJ.LLIZLLLIL;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[PHI: r1 r7
      0x0040: PHI (r1v26 java.lang.Comparable) = (r1v25 java.lang.Comparable), (r1v28 java.lang.Comparable) binds: [B:15:0x003f, B:6:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r7v3 X.13X6<K, V>) = (r7v0 X.13X6<K, V>), (r7v6 X.13X6<K, V>) binds: [B:15:0x003f, B:6:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003a -> B:6:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C13X6<K, V> LIZ(K r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13X5.LIZ(java.lang.Object, boolean):X.13X6");
    }

    public final void LIZLLL(C13X6<K, V> c13x6, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c13x6 != null) {
            C13X6<K, V> c13x62 = c13x6.LLILLJJLI;
            C13X6<K, V> c13x63 = c13x6.LLILLL;
            int i5 = 0;
            if (c13x62 != null) {
                i = c13x62.LLJ;
            } else {
                i = 0;
            }
            if (c13x63 != null) {
                i2 = c13x63.LLJ;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C13X6<K, V> c13x64 = c13x63.LLILLJJLI;
                C13X6<K, V> c13x65 = c13x63.LLILLL;
                if (c13x65 != null) {
                    i4 = c13x65.LLJ;
                } else {
                    i4 = 0;
                }
                if (c13x64 != null) {
                    i5 = c13x64.LLJ;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    LJI(c13x6);
                } else {
                    LJII(c13x63);
                    LJI(c13x6);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C13X6<K, V> c13x66 = c13x62.LLILLJJLI;
                C13X6<K, V> c13x67 = c13x62.LLILLL;
                if (c13x67 != null) {
                    i3 = c13x67.LLJ;
                } else {
                    i3 = 0;
                }
                if (c13x66 != null) {
                    i5 = c13x66.LLJ;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    LJII(c13x6);
                } else {
                    LJI(c13x62);
                    LJII(c13x6);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c13x6.LLJ = i + 1;
                if (z) {
                    return;
                }
            } else {
                c13x6.LLJ = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c13x6 = c13x6.LL;
        }
    }

    public final void LJ(C13X6<K, V> c13x6, boolean z) {
        C13X6<K, V> c13x62;
        int i;
        if (z) {
            C13X6<K, V> c13x63 = c13x6.LLILZIL;
            c13x63.LLILZ = c13x6.LLILZ;
            c13x6.LLILZ.LLILZIL = c13x63;
            c13x6.LLILZIL = null;
            c13x6.LLILZ = null;
        }
        C13X6<K, V> c13x64 = c13x6.LLILLJJLI;
        C13X6<K, V> c13x65 = c13x6.LLILLL;
        C13X6<K, V> c13x66 = c13x6.LL;
        int i2 = 0;
        if (c13x64 != null) {
            if (c13x65 != null) {
                if (c13x64.LLJ > c13x65.LLJ) {
                    C13X6<K, V> c13x67 = c13x64.LLILLL;
                    while (true) {
                        c13x62 = c13x64;
                        c13x64 = c13x67;
                        if (c13x67 == null) {
                            break;
                        } else {
                            c13x67 = c13x67.LLILLL;
                        }
                    }
                } else {
                    C13X6<K, V> c13x68 = c13x65.LLILLJJLI;
                    while (true) {
                        c13x62 = c13x65;
                        c13x65 = c13x68;
                        if (c13x65 == null) {
                            break;
                        } else {
                            c13x68 = c13x65.LLILLJJLI;
                        }
                    }
                }
                LJ(c13x62, false);
                C13X6<K, V> c13x69 = c13x6.LLILLJJLI;
                if (c13x69 != null) {
                    i = c13x69.LLJ;
                    c13x62.LLILLJJLI = c13x69;
                    c13x69.LL = c13x62;
                    c13x6.LLILLJJLI = null;
                } else {
                    i = 0;
                }
                C13X6<K, V> c13x610 = c13x6.LLILLL;
                if (c13x610 != null) {
                    i2 = c13x610.LLJ;
                    c13x62.LLILLL = c13x610;
                    c13x610.LL = c13x62;
                    c13x6.LLILLL = null;
                }
                c13x62.LLJ = Math.max(i, i2) + 1;
                LJFF(c13x6, c13x62);
                return;
            }
            LJFF(c13x6, c13x64);
            c13x6.LLILLJJLI = null;
        } else if (c13x65 != null) {
            LJFF(c13x6, c13x65);
            c13x6.LLILLL = null;
        } else {
            LJFF(c13x6, null);
        }
        LIZLLL(c13x66, false);
        this.LLILZ--;
        this.LLILZIL++;
    }

    public final void LJFF(C13X6<K, V> c13x6, C13X6<K, V> c13x62) {
        C13X6<K, V> c13x63 = c13x6.LL;
        c13x6.LL = null;
        if (c13x62 != null) {
            c13x62.LL = c13x63;
        }
        if (c13x63 != null) {
            if (c13x63.LLILLJJLI == c13x6) {
                c13x63.LLILLJJLI = c13x62;
                return;
            } else {
                c13x63.LLILLL = c13x62;
                return;
            }
        }
        int i = c13x6.LLIZ;
        this.LLILLJJLI[i & (r1.length - 1)] = c13x62;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k != null) {
            C13X6<K, V> c13x6LIZ = LIZ(k, true);
            V v2 = c13x6LIZ.LLIZLLLIL;
            c13x6LIZ.LLIZLLLIL = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }
}
