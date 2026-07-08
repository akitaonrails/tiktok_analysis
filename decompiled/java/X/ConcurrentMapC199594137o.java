package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.137o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ConcurrentMapC199594137o<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final Logger LLJJJJ = Logger.getLogger(ConcurrentMapC199594137o.class.getName());
    public static final AnonymousClass1357 LLJJJJJIL = new C135A<Object, Object>() { // from class: X.1357
        @Override // X.C135A
        public final int LIZ() {
            return 0;
        }

        @Override // X.C135A
        public final InterfaceC199564136k<Object, Object> LIZIZ() {
            return null;
        }

        @Override // X.C135A
        public final void LIZJ(Object obj) {
        }

        @Override // X.C135A
        public final Object LIZLLL() {
            return null;
        }

        @Override // X.C135A
        public final C135A<Object, Object> LJ(ReferenceQueue<Object> referenceQueue, Object obj, InterfaceC199564136k<Object, Object> interfaceC199564136k) {
            return this;
        }

        @Override // X.C135A
        public final Object get() {
            return null;
        }

        @Override // X.C135A
        public final boolean isActive() {
            return false;
        }

        @Override // X.C135A
        public final boolean isLoading() {
            return false;
        }
    };
    public static final C19894412sg LLJJJJLIIL = new AbstractQueue<Object>() { // from class: X.12sg
        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return AbstractC19875112pZ.of().iterator();
        }
    };
    public final int LL;
    public final int LLILLJJLI;
    public final C199595137p<K, V>[] LLILLL;
    public final int LLILZ;
    public final C137H<Object> LLILZIL;
    public final C137H<Object> LLILZLL;
    public final C137F LLIZ;
    public final C137F LLIZLLLIL;
    public final long LLJ;
    public final AnonymousClass1387<K, V> LLJI;
    public final long LLJIJIL;
    public final long LLJILJIL;
    public final long LLJILJILJ;
    public final Queue<C199603137x<K, V>> LLJILLL;
    public final AnonymousClass1385<K, V> LLJJ;
    public final C138F LLJJI;
    public final EnumC199565136l LLJJIII;
    public final AnonymousClass1386 LLJJIJI;
    public final C135O<? super K, V> LLJJIJIIJIL;
    public AnonymousClass1380 LLJJIJIL;
    public C199598137s LLJJJ;
    public C199599137t LLJJJIL;

    /* JADX INFO: renamed from: X.137o$c */
    public abstract class c<T> extends AbstractSet<T> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            ConcurrentMapC199594137o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return ConcurrentMapC199594137o.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ConcurrentMapC199594137o.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return ConcurrentMapC199594137o.LJII(this).toArray();
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC199594137o.LJII(this).toArray(eArr);
        }
    }

    /* JADX INFO: renamed from: X.137o$i */
    public abstract class i<T> implements Iterator<T> {
        public int LL;
        public int LLILLJJLI = -1;
        public C199595137p<K, V> LLILLL;
        public AtomicReferenceArray<InterfaceC199564136k<K, V>> LLILZ;
        public InterfaceC199564136k<K, V> LLILZIL;
        public ConcurrentMapC199594137o<K, V>.j0 LLILZLL;
        public ConcurrentMapC199594137o<K, V>.j0 LLIZ;

        public final void LIZ() {
            this.LLILZLL = null;
            InterfaceC199564136k<K, V> interfaceC199564136k = this.LLILZIL;
            if (interfaceC199564136k != null) {
                while (true) {
                    InterfaceC199564136k<K, V> next = interfaceC199564136k.getNext();
                    this.LLILZIL = next;
                    if (next == null) {
                        break;
                    } else if (LIZIZ(next)) {
                        return;
                    } else {
                        interfaceC199564136k = this.LLILZIL;
                    }
                }
            }
            if (LJ()) {
                return;
            }
            while (true) {
                int i = this.LL;
                if (i < 0) {
                    return;
                }
                C199595137p<K, V>[] c199595137pArr = ConcurrentMapC199594137o.this.LLILLL;
                this.LL = i - 1;
                C199595137p<K, V> c199595137p = c199595137pArr[i];
                this.LLILLL = c199595137p;
                if (c199595137p.LLILLJJLI != 0) {
                    this.LLILZ = this.LLILLL.LLILZLL;
                    this.LLILLJJLI = r0.length() - 1;
                    if (LJ()) {
                        return;
                    }
                }
            }
        }

        public final ConcurrentMapC199594137o<K, V>.j0 LIZLLL() {
            ConcurrentMapC199594137o<K, V>.j0 j0Var = this.LLILZLL;
            if (j0Var == null) {
                throw new NoSuchElementException();
            }
            this.LLIZ = j0Var;
            LIZ();
            return this.LLIZ;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0000, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean LJ() {
            /*
                r3 = this;
            L0:
                int r2 = r3.LLILLJJLI
                r0 = 0
                if (r2 < 0) goto L32
                java.util.concurrent.atomic.AtomicReferenceArray<X.136k<K, V>> r1 = r3.LLILZ
                int r0 = r2 + (-1)
                r3.LLILLJJLI = r0
                java.lang.Object r0 = r1.get(r2)
                X.136k r0 = (X.InterfaceC199564136k) r0
                r3.LLILZIL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                r1 = 1
                if (r0 != 0) goto L31
                X.136k<K, V> r0 = r3.LLILZIL
                if (r0 == 0) goto L0
            L20:
                X.136k r0 = r0.getNext()
                r3.LLILZIL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                if (r0 != 0) goto L31
                X.136k<K, V> r0 = r3.LLILZIL
                goto L20
            L31:
                return r1
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC199594137o.i.LJ():boolean");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LLILZLL != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C19864312np.LJIILJJIL(this.LLIZ != null);
            ConcurrentMapC199594137o.this.remove(this.LLIZ.LL);
            this.LLIZ = null;
        }

        public i() {
            this.LL = ConcurrentMapC199594137o.this.LLILLL.length - 1;
            LIZ();
        }

        public final boolean LIZIZ(InterfaceC199564136k<K, V> interfaceC199564136k) {
            V v;
            try {
                long jLIZ = ConcurrentMapC199594137o.this.LLJJI.LIZ();
                K key = interfaceC199564136k.getKey();
                ConcurrentMapC199594137o concurrentMapC199594137o = ConcurrentMapC199594137o.this;
                concurrentMapC199594137o.getClass();
                if (interfaceC199564136k.getKey() != null && (v = interfaceC199564136k.LIZJ().get()) != null && !concurrentMapC199594137o.LJ(interfaceC199564136k, jLIZ)) {
                    this.LLILZLL = new j0(key, v);
                    this.LLILLL.LJIIL();
                    return true;
                }
                this.LLILLL.LJIIL();
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLL.LJIIL();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X.137o$j0 */
    public final class j0 implements Map.Entry<K, V> {
        public final K LL;
        public V LLILLJJLI;

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.LL.hashCode() ^ this.LLILLJJLI.hashCode();
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.LL);
            String strValueOf2 = String.valueOf(this.LLILLJJLI);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.LL;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.LLILLJJLI;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.LL.equals(entry.getKey()) || !this.LLILLJJLI.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) ConcurrentMapC199594137o.this.put(this.LL, v);
            this.LLILLJJLI = v;
            return v2;
        }

        public j0(K k, V v) {
            this.LL = k;
            this.LLILLJJLI = v;
        }
    }

    public final boolean LIZ() {
        return this.LLJ >= 0;
    }

    public final boolean LIZIZ() {
        return this.LLJIJIL > 0;
    }

    public final boolean LIZJ() {
        return this.LLJILJIL > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (C199595137p<K, V> c199595137p : this.LLILLL) {
            if (c199595137p.LLILLJJLI != 0) {
                c199595137p.lock();
                try {
                    c199595137p.LJIJJ(c199595137p.LL.LLJJI.LIZ());
                    AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = c199595137p.LLILZLL;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (InterfaceC199564136k<K, V> next = atomicReferenceArray.get(i2); next != null; next = next.getNext()) {
                            if (next.LIZJ().isActive()) {
                                K key = next.getKey();
                                V v = next.LIZJ().get();
                                EnumC199605137z enumC199605137z = (key == null || v == null) ? EnumC199605137z.COLLECTED : EnumC199605137z.EXPLICIT;
                                next.getHash();
                                c199595137p.LIZLLL(key, v, next.LIZJ().LIZ(), enumC199605137z);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (c199595137p.LL.LLIZ != C137F.LL) {
                        while (c199595137p.LLIZLLLIL.poll() != null) {
                        }
                    }
                    if (c199595137p.LL.LLIZLLLIL != C137F.LL) {
                        while (c199595137p.LLJ.poll() != null) {
                        }
                    }
                    c199595137p.LLJILJIL.clear();
                    c199595137p.LLJILJILJ.clear();
                    c199595137p.LLJIJIL.set(0);
                    c199595137p.LLILZ++;
                    c199595137p.LLILLJJLI = 0;
                    c199595137p.unlock();
                    c199595137p.LJIJJLI();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c199595137p.unlock();
                    c199595137p.LJIJJLI();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C199599137t c199599137t = this.LLJJJIL;
        if (c199599137t != null) {
            return c199599137t;
        }
        ConcurrentMapC199594137o<K, V>.c<Map.Entry<K, V>> cVar = new ConcurrentMapC199594137o<K, V>.c<Map.Entry<K, V>>() { // from class: X.137t
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                final ConcurrentMapC199594137o concurrentMapC199594137o = this.LLILLJJLI;
                return new ConcurrentMapC199594137o<K, V>.i<Map.Entry<K, V>>(concurrentMapC199594137o) { // from class: X.1382
                    @Override // java.util.Iterator
                    public final Object next() {
                        return LIZLLL();
                    }
                };
            }

            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Map.Entry entry;
                Object key;
                Object obj2;
                if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.LLILLJJLI.get(key)) == null || !this.LLILLJJLI.LLILZLL.LIZJ(entry.getValue(), obj2)) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Map.Entry entry;
                Object key;
                if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !this.LLILLJJLI.remove(key, entry.getValue())) {
                    return false;
                }
                return true;
            }
        };
        this.LLJJJIL = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C199595137p<K, V>[] c199595137pArr = this.LLILLL;
        long j = 0;
        for (int i2 = 0; i2 < c199595137pArr.length; i2++) {
            if (c199595137pArr[i2].LLILLJJLI != 0) {
                return false;
            }
            j += (long) c199595137pArr[i2].LLILZ;
        }
        if (j == 0) {
            return true;
        }
        for (int i3 = 0; i3 < c199595137pArr.length; i3++) {
            if (c199595137pArr[i3].LLILLJJLI != 0) {
                return false;
            }
            j -= (long) c199595137pArr[i3].LLILZ;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        AnonymousClass1380 anonymousClass1380 = this.LLJJIJIL;
        if (anonymousClass1380 != null) {
            return anonymousClass1380;
        }
        ConcurrentMapC199594137o<K, V>.c<K> cVar = new ConcurrentMapC199594137o<K, V>.c<K>() { // from class: X.1380
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<K> iterator() {
                final ConcurrentMapC199594137o concurrentMapC199594137o = this.LLILLJJLI;
                return new ConcurrentMapC199594137o<K, V>.i<K>(concurrentMapC199594137o) { // from class: X.1383
                    @Override // java.util.Iterator
                    public final K next() {
                        return LIZLLL().LL;
                    }
                };
            }

            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LLILLJJLI.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (this.LLILLJJLI.remove(obj) != null) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJIJIL = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (C199595137p<K, V> c199595137p : this.LLILLL) {
            jMax += (long) Math.max(0, c199595137p.LLILLJJLI);
        }
        return C19881312qZ.LIZIZ(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C199598137s c199598137s = this.LLJJJ;
        if (c199598137s != null) {
            return c199598137s;
        }
        AbstractCollection<V> abstractCollection = new AbstractCollection<V>() { // from class: X.137s
            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                final ConcurrentMapC199594137o concurrentMapC199594137o = this.LL;
                return new ConcurrentMapC199594137o<K, V>.i<V>(concurrentMapC199594137o) { // from class: X.1384
                    @Override // java.util.Iterator
                    public final V next() {
                        return LIZLLL().LLILLJJLI;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return this.LL.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final Object[] toArray() {
                return ConcurrentMapC199594137o.LJII(this).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final <E> E[] toArray(E[] eArr) {
                return (E[]) ConcurrentMapC199594137o.LJII(this).toArray(eArr);
            }
        };
        this.LLJJJ = abstractCollection;
        return abstractCollection;
    }

    public final boolean LJFF() {
        return LIZJ() || this.LLJILJILJ > 0;
    }

    public final boolean LJIIIIZZ() {
        return LIZIZ() || LIZ();
    }

    public ConcurrentMapC199594137o(C199593137n c199593137n) {
        long j;
        Queue<C199603137x<K, V>> concurrentLinkedQueue;
        boolean z;
        char c2;
        boolean z2;
        int i2;
        int i3 = c199593137n.LIZJ;
        this.LLILZ = Math.min(i3 == -1 ? 4 : i3, 65536);
        C137F c137f = c199593137n.LJI;
        C137D c137d = C137F.LL;
        C137F c137f2 = (C137F) C135U.LIZ(c137f, c137d);
        this.LLIZ = c137f2;
        this.LLIZLLLIL = (C137F) C135U.LIZ(c199593137n.LJII, c137d);
        this.LLILZIL = (C137H) C135U.LIZ(c199593137n.LJIIJJI, ((C137F) C135U.LIZ(c199593137n.LJI, c137d)).LIZJ());
        this.LLILZLL = (C137H) C135U.LIZ(c199593137n.LJIIL, ((C137F) C135U.LIZ(c199593137n.LJII, c137d)).LIZJ());
        if (c199593137n.LJIIIIZZ != 0 && c199593137n.LJIIIZ != 0) {
            if (c199593137n.LJFF == null) {
                j = c199593137n.LIZLLL;
            } else {
                j = c199593137n.LJ;
            }
        } else {
            j = 0;
        }
        this.LLJ = j;
        AnonymousClass1387<? super K, ? super V> anonymousClass1387 = c199593137n.LJFF;
        EnumC199604137y enumC199604137y = EnumC199604137y.LL;
        AnonymousClass1387<K, V> anonymousClass13872 = (AnonymousClass1387) C135U.LIZ(anonymousClass1387, enumC199604137y);
        this.LLJI = anonymousClass13872;
        long j2 = c199593137n.LJIIIZ;
        this.LLJIJIL = j2 == -1 ? 0L : j2;
        long j3 = c199593137n.LJIIIIZZ;
        this.LLJILJIL = j3 == -1 ? 0L : j3;
        long j4 = c199593137n.LJIIJ;
        this.LLJILJILJ = j4 != -1 ? j4 : 0L;
        AnonymousClass1385<? super K, ? super V> anonymousClass1385 = c199593137n.LJIILIIL;
        EnumC199600137u enumC199600137u = EnumC199600137u.LL;
        AnonymousClass1385<K, V> anonymousClass13852 = (AnonymousClass1385) C135U.LIZ(anonymousClass1385, enumC199600137u);
        this.LLJJ = anonymousClass13852;
        if (anonymousClass13852 == enumC199600137u) {
            concurrentLinkedQueue = LLJJJJLIIL;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        }
        this.LLJILLL = concurrentLinkedQueue;
        int i4 = 0;
        int i5 = 1;
        if (!LJFF() && !LIZIZ()) {
            z = false;
        } else {
            z = true;
        }
        C138F c138f = c199593137n.LJIILJJIL;
        if (c138f == null) {
            if (z) {
                c138f = C138F.LIZ;
            } else {
                c138f = C199593137n.LJIIZILJ;
            }
        }
        this.LLJJI = c138f;
        if (!LJIIIIZZ() && !LIZIZ()) {
            c2 = 0;
        } else {
            c2 = 1;
        }
        if (!LIZJ() && !LJFF()) {
            z2 = false;
        } else {
            z2 = true;
        }
        EnumC199565136l[] enumC199565136lArr = EnumC199565136l.LL;
        int i6 = (c137f2 != C137F.LLILLJJLI ? (char) 0 : (char) 4) | c2;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.LLJJIII = EnumC199565136l.LL[i6 | i2];
        this.LLJJIJI = (AnonymousClass1386) c199593137n.LJIILL.LL;
        this.LLJJIJIIJIL = null;
        int i7 = c199593137n.LIZIZ;
        int iMin = Math.min(i7 == -1 ? 16 : i7, 1073741824);
        if (LIZ() && anonymousClass13872 == enumC199604137y) {
            iMin = (int) Math.min(iMin, j);
        }
        int i8 = 0;
        int i9 = 1;
        while (i9 < this.LLILZ && (!LIZ() || i9 * 20 <= this.LLJ)) {
            i8++;
            i9 <<= 1;
        }
        this.LLILLJJLI = 32 - i8;
        this.LL = i9 - 1;
        this.LLILLL = new C199595137p[i9];
        int i10 = iMin / i9;
        while (i5 < (i10 * i9 < iMin ? i10 + 1 : i10)) {
            i5 <<= 1;
        }
        if (LIZ()) {
            long j5 = this.LLJ;
            long j6 = i9;
            long j7 = (j5 / j6) + 1;
            long j8 = j5 % j6;
            while (true) {
                C199595137p<K, V>[] c199595137pArr = this.LLILLL;
                if (i4 < c199595137pArr.length) {
                    if (i4 == j8) {
                        j7--;
                    }
                    c199595137pArr[i4] = new C199595137p<>(this, i5, j7, (AnonymousClass1386) c199593137n.LJIILL.LL);
                    i4++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C199595137p<K, V>[] c199595137pArr2 = this.LLILLL;
                if (i4 < c199595137pArr2.length) {
                    c199595137pArr2[i4] = new C199595137p<>(this, i5, -1L, (AnonymousClass1386) c199593137n.LJIILL.LL);
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public static <E> ArrayList<E> LJII(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C19867212oI.LIZ(arrayList, collection.iterator());
        return arrayList;
    }

    public final int LIZLLL(Object obj) {
        int iLIZIZ;
        C137H<Object> c137h = this.LLILZIL;
        if (obj == null) {
            c137h.getClass();
            iLIZIZ = 0;
        } else {
            iLIZIZ = c137h.LIZIZ(obj);
        }
        int i2 = iLIZIZ + ((iLIZIZ << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public final C199595137p<K, V> LJI(int i2) {
        return this.LLILLL[(i2 >>> this.LLILLJJLI) & this.LL];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iLIZLLL = LIZLLL(obj);
        C199595137p<K, V> c199595137pLJI = LJI(iLIZLLL);
        c199595137pLJI.getClass();
        try {
            if (c199595137pLJI.LLILLJJLI != 0) {
                long jLIZ = c199595137pLJI.LL.LLJJI.LIZ();
                InterfaceC199564136k<K, V> interfaceC199564136kLJIIIZ = c199595137pLJI.LJIIIZ(iLIZLLL, obj);
                if (interfaceC199564136kLJIIIZ != null) {
                    if (c199595137pLJI.LL.LJ(interfaceC199564136kLJIIIZ, jLIZ)) {
                        if (c199595137pLJI.tryLock()) {
                            try {
                                c199595137pLJI.LJI(jLIZ);
                                c199595137pLJI.unlock();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c199595137pLJI.unlock();
                                throw th;
                            }
                        }
                    } else if (interfaceC199564136kLJIIIZ.LIZJ().get() != null) {
                        z = true;
                    }
                }
            }
            c199595137pLJI.LJIIL();
            return z;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c199595137pLJI.LJIIL();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long jLIZ = this.LLJJI.LIZ();
        C199595137p<K, V>[] c199595137pArr = this.LLILLL;
        long j = -1;
        int i2 = 0;
        do {
            long j2 = 0;
            for (C199595137p<K, V> c199595137p : c199595137pArr) {
                AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = c199595137p.LLILZLL;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (InterfaceC199564136k<K, V> next = atomicReferenceArray.get(i3); next != null; next = next.getNext()) {
                        V vLJIIJ = c199595137p.LJIIJ(next, jLIZ);
                        if (vLJIIJ != null && this.LLILZLL.LIZJ(obj, vLJIIJ)) {
                            return true;
                        }
                    }
                }
                j2 += (long) c199595137p.LLILZ;
            }
            if (j2 == j) {
                return false;
            }
            i2++;
            j = j2;
        } while (i2 < 3);
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iLIZLLL = LIZLLL(obj);
        return (V) LJI(iLIZLLL).LJII(iLIZLLL, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r11 = r7.LIZJ();
        r10 = r11.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r12 = X.EnumC199605137z.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r5.LLILZ++;
        r1 = r5.LJIJI(r6, r7, r8, r9, r10, r11, r12);
        r0 = r5.LLILLJJLI - 1;
        r3.set(r2, r1);
        r5.LLILLJJLI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r11.isActive() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r12 = X.EnumC199605137z.COLLECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r5.unlock();
        r5.LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        return r10;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r14) {
        /*
            r13 = this;
            r4 = 0
            if (r14 != 0) goto L4
            return r4
        L4:
            int r9 = r13.LIZLLL(r14)
            X.137p r5 = r13.LJI(r9)
            r5.lock()
            X.137o<K, V> r0 = r5.LL     // Catch: java.lang.Throwable -> L7e
            X.138F r0 = r0.LLJJI     // Catch: java.lang.Throwable -> L7e
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L7e
            r5.LJIJJ(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicReferenceArray<X.136k<K, V>> r3 = r5.LLILZLL     // Catch: java.lang.Throwable -> L7e
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L7e
            int r2 = r0 + (-1)
            r2 = r2 & r9
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L7e
            X.136k r6 = (X.InterfaceC199564136k) r6     // Catch: java.lang.Throwable -> L7e
            r7 = r6
        L2a:
            if (r7 == 0) goto L77
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L7e
            int r0 = r7.getHash()     // Catch: java.lang.Throwable -> L7e
            if (r0 != r9) goto L6b
            if (r8 == 0) goto L6b
            X.137o<K, V> r0 = r5.LL     // Catch: java.lang.Throwable -> L7e
            X.137H<java.lang.Object> r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.LIZJ(r14, r8)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L6b
            X.135A r11 = r7.LIZJ()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = r11.get()     // Catch: java.lang.Throwable -> L7e
            if (r10 == 0) goto L62
            X.137z r12 = X.EnumC199605137z.EXPLICIT     // Catch: java.lang.Throwable -> L7e
        L4e:
            int r0 = r5.LLILZ     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + 1
            r5.LLILZ = r0     // Catch: java.lang.Throwable -> L7e
            X.136k r1 = r5.LJIJI(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7e
            int r0 = r5.LLILLJJLI     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L7e
            r5.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L7e
            goto L70
        L62:
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L77
            X.137z r12 = X.EnumC199605137z.COLLECTED     // Catch: java.lang.Throwable -> L7e
            goto L4e
        L6b:
            X.136k r7 = r7.getNext()     // Catch: java.lang.Throwable -> L7e
            goto L2a
        L70:
            r5.unlock()
            r5.LJIJJLI()
            return r10
        L77:
            r5.unlock()
            r5.LJIJJLI()
            return r4
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7e
            r5.unlock()
            r5.LJIJJLI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC199594137o.remove(java.lang.Object):java.lang.Object");
    }

    public final boolean LJ(InterfaceC199564136k<K, V> interfaceC199564136k, long j) {
        interfaceC199564136k.getClass();
        if (LIZIZ() && j - interfaceC199564136k.LJIILJJIL() >= this.LLJIJIL) {
            return true;
        }
        if (LIZJ() && j - interfaceC199564136k.LJII() >= this.LLJILJIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int iLIZLLL = LIZLLL(k);
        return (V) LJI(iLIZLLL).LJIILIIL(iLIZLLL, k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int iLIZLLL = LIZLLL(k);
        return (V) LJI(iLIZLLL).LJIILIIL(iLIZLLL, k, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r13 = r9.LIZJ();
        r12 = r13.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.LL.LLILZLL.LIZJ(r17, r12) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r14 = X.EnumC199605137z.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r7.LLILZ++;
        r1 = r7.LJIJI(r8, r9, r10, r11, r12, r13, r14);
        r0 = r7.LLILLJJLI - 1;
        r3.set(r2, r1);
        r7.LLILLJJLI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r14 != X.EnumC199605137z.EXPLICIT) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r12 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r13.isActive() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r14 = X.EnumC199605137z.COLLECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r6 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r6 = 0
            r4 = r16
            if (r4 == 0) goto L95
            r1 = r17
            if (r1 == 0) goto L95
            int r11 = r15.LIZLLL(r4)
            X.137p r7 = r15.LJI(r11)
            r7.lock()
            X.137o<K, V> r0 = r7.LL     // Catch: java.lang.Throwable -> L8a
            X.138F r0 = r0.LLJJI     // Catch: java.lang.Throwable -> L8a
            long r2 = r0.LIZ()     // Catch: java.lang.Throwable -> L8a
            r7.LJIJJ(r2)     // Catch: java.lang.Throwable -> L8a
            java.util.concurrent.atomic.AtomicReferenceArray<X.136k<K, V>> r3 = r7.LLILZLL     // Catch: java.lang.Throwable -> L8a
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L8a
            r5 = 1
            int r2 = r2 - r5
            r2 = r2 & r11
            java.lang.Object r8 = r3.get(r2)     // Catch: java.lang.Throwable -> L8a
            X.136k r8 = (X.InterfaceC199564136k) r8     // Catch: java.lang.Throwable -> L8a
            r9 = r8
        L2f:
            if (r9 == 0) goto L83
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> L8a
            int r0 = r9.getHash()     // Catch: java.lang.Throwable -> L8a
            if (r0 != r11) goto L7d
            if (r10 == 0) goto L7d
            X.137o<K, V> r0 = r7.LL     // Catch: java.lang.Throwable -> L8a
            X.137H<java.lang.Object> r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.LIZJ(r4, r10)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L7d
            X.135A r13 = r9.LIZJ()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r12 = r13.get()     // Catch: java.lang.Throwable -> L8a
            X.137o<K, V> r0 = r7.LL     // Catch: java.lang.Throwable -> L8a
            X.137H<java.lang.Object> r0 = r0.LLILZLL     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.LIZJ(r1, r12)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L72
            X.137z r14 = X.EnumC199605137z.EXPLICIT     // Catch: java.lang.Throwable -> L8a
        L5b:
            int r0 = r7.LLILZ     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + 1
            r7.LLILZ = r0     // Catch: java.lang.Throwable -> L8a
            X.136k r1 = r7.LJIJI(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8a
            int r0 = r7.LLILLJJLI     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 - r5
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L8a
            r7.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L8a
            X.137z r0 = X.EnumC199605137z.EXPLICIT     // Catch: java.lang.Throwable -> L8a
            if (r14 != r0) goto L83
            goto L82
        L72:
            if (r12 != 0) goto L83
            boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L83
            X.137z r14 = X.EnumC199605137z.COLLECTED     // Catch: java.lang.Throwable -> L8a
            goto L5b
        L7d:
            X.136k r9 = r9.getNext()     // Catch: java.lang.Throwable -> L8a
            goto L2f
        L82:
            r6 = 1
        L83:
            r7.unlock()
            r7.LJIJJLI()
            return r6
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8a
            r7.unlock()
            r7.LJIJJLI()
            throw r0
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC199594137o.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r5.unlock();
        r5.LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r18, V r19) {
        /*
            r17 = this;
            r13 = r18
            r13.getClass()
            r14 = r19
            r14.getClass()
            r0 = r17
            int r9 = r0.LIZLLL(r13)
            X.137p r5 = r0.LJI(r9)
            r5.lock()
            X.137o<K, V> r0 = r5.LL     // Catch: java.lang.Throwable -> L9c
            X.138F r0 = r0.LLJJI     // Catch: java.lang.Throwable -> L9c
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L9c
            r5.LJIJJ(r0)     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.atomic.AtomicReferenceArray<X.136k<K, V>> r3 = r5.LLILZLL     // Catch: java.lang.Throwable -> L9c
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L9c
            int r2 = r2 + (-1)
            r2 = r2 & r9
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L9c
            X.136k r6 = (X.InterfaceC199564136k) r6     // Catch: java.lang.Throwable -> L9c
            r7 = r6
        L32:
            if (r7 == 0) goto L94
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L9c
            int r4 = r7.getHash()     // Catch: java.lang.Throwable -> L9c
            if (r4 != r9) goto L70
            if (r8 == 0) goto L70
            X.137o<K, V> r4 = r5.LL     // Catch: java.lang.Throwable -> L9c
            X.137H<java.lang.Object> r4 = r4.LLILZIL     // Catch: java.lang.Throwable -> L9c
            boolean r4 = r4.LIZJ(r13, r8)     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L70
            X.135A r11 = r7.LIZJ()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r10 = r11.get()     // Catch: java.lang.Throwable -> L9c
            if (r10 != 0) goto L75
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L94
            int r0 = r5.LLILZ     // Catch: java.lang.Throwable -> L9c
            int r0 = r0 + 1
            r5.LLILZ = r0     // Catch: java.lang.Throwable -> L9c
            X.137z r12 = X.EnumC199605137z.COLLECTED     // Catch: java.lang.Throwable -> L9c
            X.136k r1 = r5.LJIJI(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.LLILLJJLI     // Catch: java.lang.Throwable -> L9c
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L9c
            r5.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L9c
            goto L94
        L70:
            X.136k r7 = r7.getNext()     // Catch: java.lang.Throwable -> L9c
            goto L32
        L75:
            int r2 = r5.LLILZ     // Catch: java.lang.Throwable -> L9c
            int r2 = r2 + 1
            r5.LLILZ = r2     // Catch: java.lang.Throwable -> L9c
            int r3 = r11.LIZ()     // Catch: java.lang.Throwable -> L9c
            X.137z r2 = X.EnumC199605137z.REPLACED     // Catch: java.lang.Throwable -> L9c
            r5.LIZLLL(r13, r10, r3, r2)     // Catch: java.lang.Throwable -> L9c
            r11 = r5
            r12 = r7
            r15 = r0
            r11.LJJ(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L9c
            r5.LJ(r7)     // Catch: java.lang.Throwable -> L9c
            r5.unlock()
            r5.LJIJJLI()
            return r10
        L94:
            r5.unlock()
            r5.LJIJJLI()
            r10 = 0
            return r10
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
            r5.unlock()
            r5.LJIJJLI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC199594137o.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int iLIZLLL = LIZLLL(k);
        C199595137p<K, V> c199595137pLJI = LJI(iLIZLLL);
        c199595137pLJI.lock();
        try {
            long jLIZ = c199595137pLJI.LL.LLJJI.LIZ();
            c199595137pLJI.LJIJJ(jLIZ);
            AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = c199595137pLJI.LLILZLL;
            int length = (atomicReferenceArray.length() - 1) & iLIZLLL;
            InterfaceC199564136k<K, V> interfaceC199564136k = atomicReferenceArray.get(length);
            InterfaceC199564136k<K, V> next = interfaceC199564136k;
            while (true) {
                if (next == null) {
                    break;
                }
                K key = next.getKey();
                if (next.getHash() == iLIZLLL && key != null && c199595137pLJI.LL.LLILZIL.LIZJ(k, key)) {
                    C135A<K, V> c135aLIZJ = next.LIZJ();
                    V v3 = c135aLIZJ.get();
                    if (v3 == null) {
                        if (c135aLIZJ.isActive()) {
                            c199595137pLJI.LLILZ++;
                            InterfaceC199564136k<K, V> interfaceC199564136kLJIJI = c199595137pLJI.LJIJI(interfaceC199564136k, next, key, iLIZLLL, v3, c135aLIZJ, EnumC199605137z.COLLECTED);
                            int i2 = c199595137pLJI.LLILLJJLI - 1;
                            atomicReferenceArray.set(length, interfaceC199564136kLJIJI);
                            c199595137pLJI.LLILLJJLI = i2;
                        }
                    } else {
                        if (c199595137pLJI.LL.LLILZLL.LIZJ(v, v3)) {
                            c199595137pLJI.LLILZ++;
                            c199595137pLJI.LIZLLL(k, v3, c135aLIZJ.LIZ(), EnumC199605137z.REPLACED);
                            c199595137pLJI.LJJ(next, k, v2, jLIZ);
                            c199595137pLJI.LJ(next);
                            c199595137pLJI.unlock();
                            c199595137pLJI.LJIJJLI();
                            return true;
                        }
                        c199595137pLJI.LJIILJJIL(next, jLIZ);
                    }
                } else {
                    next = next.getNext();
                }
            }
            c199595137pLJI.unlock();
            c199595137pLJI.LJIJJLI();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c199595137pLJI.unlock();
            c199595137pLJI.LJIJJLI();
            throw th;
        }
    }
}
