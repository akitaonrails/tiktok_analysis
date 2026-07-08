package a75;

import X.AnonymousClass1391;
import X.AnonymousClass1394;
import X.AnonymousClass1398;
import X.AnonymousClass1399;
import X.C138R;
import X.C138T;
import X.C138W;
import X.C138X;
import X.C139C;
import X.C139I;
import X.C139J;
import X.C19917312wN;
import X.C199610138e;
import X.C2188811AlT;
import X.EnumC199614138i;
import X.EnumC20531082n;
import X.InterfaceC199612138g;
import X.InterfaceC199613138h;
import a75.c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes31.dex */
public class c<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final AnonymousClass1394 LLJJIJIL;
    public static final C19917312wN LLJJJ;
    public final int LL;
    public final int LLILLJJLI;
    public final C199610138e<K, V>[] LLILLL;
    public final int LLILZ;
    public final AnonymousClass1398<Object> LLILZIL;
    public final AnonymousClass1398<Object> LLILZLL;
    public final C139J LLIZ;
    public final C139J LLIZLLLIL;
    public final long LLJ;
    public final EnumC20531082n LLJI;
    public final long LLJIJIL;
    public final long LLJILJIL;
    public final long LLJILJILJ;
    public final C19917312wN LLJILLL;
    public final C139C LLJJ;
    public final EnumC199614138i LLJJI;
    public C138T LLJJIII;
    public C138R LLJJIJI;
    public C138W LLJJIJIIJIL;

    /* JADX INFO: renamed from: a75.c$c, reason: collision with other inner class name */
    public abstract class AbstractC0002c<T> extends AbstractSet<T> {
        public final ConcurrentMap<?, ?> LL;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.LL.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.LL.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.LL.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return c.LJII(this).toArray();
        }

        public AbstractC0002c(ConcurrentMap concurrentMap) {
            this.LL = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) c.LJII(this).toArray(eArr);
        }
    }

    public final class c0 implements Map.Entry<K, V> {
        public final K LL;
        public V LLILLJJLI;

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.LL.hashCode() ^ this.LLILLJJLI.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append("=");
            sbLIZ.append(this.LLILLJJLI);
            return C2188811AlT.LIZIZ(sbLIZ);
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
            V v2 = (V) c.this.put(this.LL, v);
            this.LLILLJJLI = v;
            return v2;
        }

        public c0(K k, V v) {
            this.LL = k;
            this.LLILLJJLI = v;
        }
    }

    public abstract class i<T> implements Iterator<T> {
        public int LL;
        public int LLILLJJLI = -1;
        public C199610138e<K, V> LLILLL;
        public AtomicReferenceArray<InterfaceC199613138h<K, V>> LLILZ;
        public InterfaceC199613138h<K, V> LLILZIL;
        public c<K, V>.c0 LLILZLL;
        public c<K, V>.c0 LLIZ;

        public final void LIZ() {
            this.LLILZLL = null;
            InterfaceC199613138h<K, V> interfaceC199613138h = this.LLILZIL;
            if (interfaceC199613138h != null) {
                while (true) {
                    InterfaceC199613138h<K, V> next = interfaceC199613138h.getNext();
                    this.LLILZIL = next;
                    if (next == null) {
                        break;
                    } else if (LIZIZ(next)) {
                        return;
                    } else {
                        interfaceC199613138h = this.LLILZIL;
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
                C199610138e<K, V>[] c199610138eArr = c.this.LLILLL;
                this.LL = i - 1;
                C199610138e<K, V> c199610138e = c199610138eArr[i];
                this.LLILLL = c199610138e;
                if (c199610138e.LLILLJJLI != 0) {
                    this.LLILZ = this.LLILLL.LLILZLL;
                    this.LLILLJJLI = r0.length() - 1;
                    if (LJ()) {
                        return;
                    }
                }
            }
        }

        public final c<K, V>.c0 LIZLLL() {
            c<K, V>.c0 c0Var = this.LLILZLL;
            if (c0Var == null) {
                throw new NoSuchElementException();
            }
            this.LLIZ = c0Var;
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
                java.util.concurrent.atomic.AtomicReferenceArray<X.138h<K, V>> r1 = r3.LLILZ
                int r0 = r2 + (-1)
                r3.LLILLJJLI = r0
                java.lang.Object r0 = r1.get(r2)
                X.138h r0 = (X.InterfaceC199613138h) r0
                r3.LLILZIL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                r1 = 1
                if (r0 != 0) goto L31
                X.138h<K, V> r0 = r3.LLILZIL
                if (r0 == 0) goto L0
            L20:
                X.138h r0 = r0.getNext()
                r3.LLILZIL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                if (r0 != 0) goto L31
                X.138h<K, V> r0 = r3.LLILZIL
                goto L20
            L31:
                return r1
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a75.c.i.LJ():boolean");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LLILZLL != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            c<K, V>.c0 c0Var = this.LLIZ;
            if (c0Var == null) {
                throw new IllegalStateException();
            }
            c.this.remove(c0Var.LL);
            this.LLIZ = null;
        }

        public i() {
            this.LL = c.this.LLILLL.length - 1;
            LIZ();
        }

        public final boolean LIZIZ(InterfaceC199613138h<K, V> interfaceC199613138h) {
            V v;
            try {
                long jLIZ = c.this.LLJJ.LIZ();
                K key = interfaceC199613138h.getKey();
                c cVar = c.this;
                cVar.getClass();
                if (interfaceC199613138h.getKey() != null && (v = interfaceC199613138h.LIZJ().get()) != null && !cVar.LJ(interfaceC199613138h, jLIZ)) {
                    this.LLILZLL = new c0(key, v);
                    this.LLILLL.LJIIIZ();
                    return true;
                }
                this.LLILLL.LJIIIZ();
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLL.LJIIIZ();
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1394] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.12wN] */
    static {
        Logger.getLogger(c.class.getName());
        LLJJIJIL = new InterfaceC199612138g<Object, Object>() { // from class: X.1394
            @Override // X.InterfaceC199612138g
            public final int LIZ() {
                return 0;
            }

            @Override // X.InterfaceC199612138g
            public final InterfaceC199613138h<Object, Object> LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC199612138g
            public final void LIZJ() {
            }

            @Override // X.InterfaceC199612138g
            public final InterfaceC199612138g<Object, Object> LIZLLL(ReferenceQueue<Object> referenceQueue, Object obj, InterfaceC199613138h<Object, Object> interfaceC199613138h) {
                return this;
            }

            @Override // X.InterfaceC199612138g
            public final Object get() {
                return null;
            }

            @Override // X.InterfaceC199612138g
            public final boolean isActive() {
                return false;
            }

            @Override // X.InterfaceC199612138g
            public final void isLoading() {
            }
        };
        LLJJJ = new AbstractQueue<Object>() { // from class: X.12wN
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
                return Collections.emptyIterator();
            }
        };
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
        for (C199610138e<K, V> c199610138e : this.LLILLL) {
            if (c199610138e.LLILLJJLI != 0) {
                c199610138e.lock();
                try {
                    c199610138e.LJIILJJIL(c199610138e.LL.LLJJ.LIZ());
                    AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray = c199610138e.LLILZLL;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (InterfaceC199613138h<K, V> next = atomicReferenceArray.get(i2); next != null; next = next.getNext()) {
                            if (next.LIZJ().isActive()) {
                                K key = next.getKey();
                                V v = next.LIZJ().get();
                                AnonymousClass1391 anonymousClass1391 = (key == null || v == null) ? AnonymousClass1391.COLLECTED : AnonymousClass1391.EXPLICIT;
                                next.getHash();
                                c199610138e.LIZLLL(key, v, next.LIZJ().LIZ(), anonymousClass1391);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (c199610138e.LL.LLIZ != C139I.LL) {
                        while (c199610138e.LLIZLLLIL.poll() != null) {
                        }
                    }
                    if (c199610138e.LL.LLIZLLLIL != C139I.LL) {
                        while (c199610138e.LLJ.poll() != null) {
                        }
                    }
                    c199610138e.LLJILJIL.clear();
                    c199610138e.LLJILJILJ.clear();
                    c199610138e.LLJIJIL.set(0);
                    c199610138e.LLILZ++;
                    c199610138e.LLILLJJLI = 0;
                    c199610138e.unlock();
                    c199610138e.LJIILL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c199610138e.unlock();
                    c199610138e.LJIILL();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C138W c138w = this.LLJJIJIIJIL;
        if (c138w != null) {
            return c138w;
        }
        c<K, V>.AbstractC0002c<Map.Entry<K, V>> abstractC0002c = new c<K, V>.AbstractC0002c<Map.Entry<K, V>>(this) { // from class: X.138W
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return new c<K, V>.i<Map.Entry<K, V>>(this.LLILLJJLI) { // from class: X.138V
                    @Override // java.util.Iterator
                    public final Object next() {
                        return LIZLLL();
                    }
                };
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
        this.LLJJIJIIJIL = abstractC0002c;
        return abstractC0002c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C199610138e<K, V>[] c199610138eArr = this.LLILLL;
        long j = 0;
        for (int i2 = 0; i2 < c199610138eArr.length; i2++) {
            if (c199610138eArr[i2].LLILLJJLI != 0) {
                return false;
            }
            j += (long) c199610138eArr[i2].LLILZ;
        }
        if (j == 0) {
            return true;
        }
        for (int i3 = 0; i3 < c199610138eArr.length; i3++) {
            if (c199610138eArr[i3].LLILLJJLI != 0) {
                return false;
            }
            j -= (long) c199610138eArr[i3].LLILZ;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C138T c138t = this.LLJJIII;
        if (c138t != null) {
            return c138t;
        }
        c<K, V>.AbstractC0002c<K> abstractC0002c = new c<K, V>.AbstractC0002c<K>(this) { // from class: X.138T
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<K> iterator() {
                final c cVar = this.LLILLJJLI;
                return new c<K, V>.i<K>(cVar) { // from class: X.138U
                    @Override // java.util.Iterator
                    public final K next() {
                        return LIZLLL().LL;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LL.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (this.LL.remove(obj) != null) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJIII = abstractC0002c;
        return abstractC0002c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (C199610138e<K, V> c199610138e : this.LLILLL) {
            jMax += (long) Math.max(0, c199610138e.LLILLJJLI);
        }
        if (jMax > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jMax < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) jMax;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C138R c138r = this.LLJJIJI;
        if (c138r != null) {
            return c138r;
        }
        AbstractCollection<V> abstractCollection = new AbstractCollection<V>(this) { // from class: X.138R
            public final ConcurrentMap<?, ?> LL;

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
                final c cVar = this.LLILLJJLI;
                return new c<K, V>.i<V>(cVar) { // from class: X.138S
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
                return c.LJII(this).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final <E> E[] toArray(E[] eArr) {
                return (E[]) c.LJII(this).toArray(eArr);
            }

            {
                this.LL = this;
            }
        };
        this.LLJJIJI = abstractCollection;
        return abstractCollection;
    }

    public final boolean LJFF() {
        return LIZJ() || this.LLJILJILJ > 0;
    }

    public final boolean LJIIIIZZ() {
        return LIZIZ() || LIZ();
    }

    public c(C138X<? super K, ? super V> c138x) {
        long j;
        C139C c139c;
        char c;
        boolean z;
        char c2;
        int i2 = c138x.LIZIZ;
        this.LLILZ = Math.min(i2 == -1 ? 4 : i2, 65536);
        C139J c139j = C139I.LL;
        this.LLIZ = c139j;
        this.LLIZLLLIL = c139j;
        AnonymousClass1399 anonymousClass1399 = AnonymousClass1399.LL;
        if (anonymousClass1399 != null) {
            this.LLILZIL = anonymousClass1399;
            this.LLILZLL = anonymousClass1399;
            long j2 = c138x.LJ;
            if (j2 != 0 && c138x.LJFF != 0) {
                j = c138x.LIZJ;
            } else {
                j = 0;
            }
            this.LLJ = j;
            this.LLJI = EnumC20531082n.LL;
            long j3 = c138x.LJFF;
            this.LLJIJIL = j3 == -1 ? 0L : j3;
            this.LLJILJIL = j2 == -1 ? 0L : j2;
            long j4 = c138x.LJI;
            this.LLJILJILJ = j4 != -1 ? j4 : 0L;
            this.LLJILLL = LLJJJ;
            int i3 = 1;
            int i4 = 0;
            if (!LJFF() && !LIZIZ()) {
                c139c = C138X.LJII;
            } else {
                c139c = C139C.LIZ;
            }
            this.LLJJ = c139c;
            if (!LJIIIIZZ() && !LIZIZ()) {
                c = 0;
            } else {
                c = 1;
            }
            if (!LIZJ() && !LJFF()) {
                z = false;
            } else {
                z = true;
            }
            EnumC199614138i[] enumC199614138iArr = EnumC199614138i.LL;
            if (z) {
                c2 = 2;
            } else {
                c2 = 0;
            }
            this.LLJJI = EnumC199614138i.LL[c | c2];
            int i5 = c138x.LIZ;
            int iMin = Math.min(i5 == -1 ? 16 : i5, 1073741824);
            iMin = LIZ() ? (int) Math.min(iMin, j) : iMin;
            int i6 = 1;
            int i7 = 0;
            while (i6 < this.LLILZ && (!LIZ() || i6 * 20 <= this.LLJ)) {
                i7++;
                i6 <<= 1;
            }
            this.LLILLJJLI = 32 - i7;
            this.LL = i6 - 1;
            this.LLILLL = new C199610138e[i6];
            int i8 = iMin / i6;
            while (i3 < (i8 * i6 < iMin ? i8 + 1 : i8)) {
                i3 <<= 1;
            }
            if (LIZ()) {
                long j5 = this.LLJ;
                long j6 = i6;
                long j7 = (j5 / j6) + 1;
                long j8 = j5 % j6;
                while (true) {
                    C199610138e<K, V>[] c199610138eArr = this.LLILLL;
                    if (i4 < c199610138eArr.length) {
                        if (i4 == j8) {
                            j7--;
                        }
                        c199610138eArr[i4] = new C199610138e<>(this, i3, j7);
                        i4++;
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    C199610138e<K, V>[] c199610138eArr2 = this.LLILLL;
                    if (i4 < c199610138eArr2.length) {
                        c199610138eArr2[i4] = new C199610138e<>(this, i3, -1L);
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new NullPointerException("Both parameters are null");
        }
    }

    public static <E> ArrayList<E> LJII(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterator<E> it2 = collection.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public final int LIZLLL(Object obj) {
        int iLIZIZ;
        AnonymousClass1398<Object> anonymousClass1398 = this.LLILZIL;
        if (obj == null) {
            anonymousClass1398.getClass();
            iLIZIZ = 0;
        } else {
            iLIZIZ = anonymousClass1398.LIZIZ(obj);
        }
        int i2 = iLIZIZ + ((iLIZIZ << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public final C199610138e<K, V> LJI(int i2) {
        return this.LLILLL[(i2 >>> this.LLILLJJLI) & this.LL];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        InterfaceC199613138h interfaceC199613138hLJIIIIZZ;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iLIZLLL = LIZLLL(obj);
        C199610138e<K, V> c199610138eLJI = LJI(iLIZLLL);
        c199610138eLJI.getClass();
        try {
            if (c199610138eLJI.LLILLJJLI != 0 && (interfaceC199613138hLJIIIIZZ = c199610138eLJI.LJIIIIZZ(iLIZLLL, c199610138eLJI.LL.LLJJ.LIZ(), obj)) != null) {
                if (interfaceC199613138hLJIIIIZZ.LIZJ().get() != null) {
                    z = true;
                }
            }
            c199610138eLJI.LJIIIZ();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c199610138eLJI.LJIIIZ();
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        V v;
        if (obj == null) {
            return false;
        }
        long jLIZ = this.LLJJ.LIZ();
        C199610138e<K, V>[] c199610138eArr = this.LLILLL;
        long j = -1;
        int i2 = 0;
        do {
            int length = c199610138eArr.length;
            long j2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                C199610138e<K, V> c199610138e = c199610138eArr[i3];
                AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray = c199610138e.LLILZLL;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (InterfaceC199613138h<K, V> next = atomicReferenceArray.get(i4); next != null; next = next.getNext()) {
                        if (next.getKey() == null || (v = next.LIZJ().get()) == null) {
                            c199610138e.LJIIZILJ();
                        } else {
                            if (c199610138e.LL.LJ(next, jLIZ)) {
                                if (c199610138e.tryLock()) {
                                    try {
                                        c199610138e.LJI(jLIZ);
                                        c199610138e.unlock();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c199610138e.unlock();
                                        throw th;
                                    }
                                }
                            }
                            if (v == null && this.LLILZLL.LIZJ(obj, v)) {
                                return true;
                            }
                        }
                        v = null;
                        if (v == null) {
                        }
                    }
                }
                j2 += (long) c199610138e.LLILZ;
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
    
        r12 = X.AnonymousClass1391.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r5.LLILZ++;
        r1 = r5.LJIILIIL(r6, r7, r8, r9, r10, r11, r12);
        r0 = r5.LLILLJJLI - 1;
        r3.set(r2, r1);
        r5.LLILLJJLI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r11.isActive() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r12 = X.AnonymousClass1391.COLLECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r5.unlock();
        r5.LJIILL();
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
            X.138e r5 = r13.LJI(r9)
            r5.lock()
            a75.c<K, V> r0 = r5.LL     // Catch: java.lang.Throwable -> L7e
            X.139C r0 = r0.LLJJ     // Catch: java.lang.Throwable -> L7e
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L7e
            r5.LJIILJJIL(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicReferenceArray<X.138h<K, V>> r3 = r5.LLILZLL     // Catch: java.lang.Throwable -> L7e
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L7e
            int r2 = r0 + (-1)
            r2 = r2 & r9
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L7e
            X.138h r6 = (X.InterfaceC199613138h) r6     // Catch: java.lang.Throwable -> L7e
            r7 = r6
        L2a:
            if (r7 == 0) goto L77
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L7e
            int r0 = r7.getHash()     // Catch: java.lang.Throwable -> L7e
            if (r0 != r9) goto L6b
            if (r8 == 0) goto L6b
            a75.c<K, V> r0 = r5.LL     // Catch: java.lang.Throwable -> L7e
            X.1398<java.lang.Object> r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.LIZJ(r14, r8)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L6b
            X.138g r11 = r7.LIZJ()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = r11.get()     // Catch: java.lang.Throwable -> L7e
            if (r10 == 0) goto L62
            X.1391 r12 = X.AnonymousClass1391.EXPLICIT     // Catch: java.lang.Throwable -> L7e
        L4e:
            int r0 = r5.LLILZ     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + 1
            r5.LLILZ = r0     // Catch: java.lang.Throwable -> L7e
            X.138h r1 = r5.LJIILIIL(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7e
            int r0 = r5.LLILLJJLI     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L7e
            r5.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L7e
            goto L70
        L62:
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L77
            X.1391 r12 = X.AnonymousClass1391.COLLECTED     // Catch: java.lang.Throwable -> L7e
            goto L4e
        L6b:
            X.138h r7 = r7.getNext()     // Catch: java.lang.Throwable -> L7e
            goto L2a
        L70:
            r5.unlock()
            r5.LJIILL()
            return r10
        L77:
            r5.unlock()
            r5.LJIILL()
            return r4
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7e
            r5.unlock()
            r5.LJIILL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a75.c.remove(java.lang.Object):java.lang.Object");
    }

    public final boolean LJ(InterfaceC199613138h<K, V> interfaceC199613138h, long j) {
        interfaceC199613138h.getClass();
        if (LIZIZ() && j - interfaceC199613138h.LJIILJJIL() >= this.LLJIJIL) {
            return true;
        }
        if (LIZJ() && j - interfaceC199613138h.LJII() >= this.LLJILJIL) {
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
        return (V) LJI(iLIZLLL).LJIIJ(iLIZLLL, k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int iLIZLLL = LIZLLL(k);
        return (V) LJI(iLIZLLL).LJIIJ(iLIZLLL, k, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r13 = r9.LIZJ();
        r12 = r13.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.LL.LLILZLL.LIZJ(r17, r12) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r14 = X.AnonymousClass1391.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r7.LLILZ++;
        r1 = r7.LJIILIIL(r8, r9, r10, r11, r12, r13, r14);
        r0 = r7.LLILLJJLI - 1;
        r3.set(r2, r1);
        r7.LLILLJJLI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r14 != X.AnonymousClass1391.EXPLICIT) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r12 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r13.isActive() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r14 = X.AnonymousClass1391.COLLECTED;
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
            X.138e r7 = r15.LJI(r11)
            r7.lock()
            a75.c<K, V> r0 = r7.LL     // Catch: java.lang.Throwable -> L8a
            X.139C r0 = r0.LLJJ     // Catch: java.lang.Throwable -> L8a
            long r2 = r0.LIZ()     // Catch: java.lang.Throwable -> L8a
            r7.LJIILJJIL(r2)     // Catch: java.lang.Throwable -> L8a
            java.util.concurrent.atomic.AtomicReferenceArray<X.138h<K, V>> r3 = r7.LLILZLL     // Catch: java.lang.Throwable -> L8a
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L8a
            r5 = 1
            int r2 = r2 - r5
            r2 = r2 & r11
            java.lang.Object r8 = r3.get(r2)     // Catch: java.lang.Throwable -> L8a
            X.138h r8 = (X.InterfaceC199613138h) r8     // Catch: java.lang.Throwable -> L8a
            r9 = r8
        L2f:
            if (r9 == 0) goto L83
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> L8a
            int r0 = r9.getHash()     // Catch: java.lang.Throwable -> L8a
            if (r0 != r11) goto L7d
            if (r10 == 0) goto L7d
            a75.c<K, V> r0 = r7.LL     // Catch: java.lang.Throwable -> L8a
            X.1398<java.lang.Object> r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.LIZJ(r4, r10)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L7d
            X.138g r13 = r9.LIZJ()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r12 = r13.get()     // Catch: java.lang.Throwable -> L8a
            a75.c<K, V> r0 = r7.LL     // Catch: java.lang.Throwable -> L8a
            X.1398<java.lang.Object> r0 = r0.LLILZLL     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.LIZJ(r1, r12)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L72
            X.1391 r14 = X.AnonymousClass1391.EXPLICIT     // Catch: java.lang.Throwable -> L8a
        L5b:
            int r0 = r7.LLILZ     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + 1
            r7.LLILZ = r0     // Catch: java.lang.Throwable -> L8a
            X.138h r1 = r7.LJIILIIL(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8a
            int r0 = r7.LLILLJJLI     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 - r5
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L8a
            r7.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L8a
            X.1391 r0 = X.AnonymousClass1391.EXPLICIT     // Catch: java.lang.Throwable -> L8a
            if (r14 != r0) goto L83
            goto L82
        L72:
            if (r12 != 0) goto L83
            boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L83
            X.1391 r14 = X.AnonymousClass1391.COLLECTED     // Catch: java.lang.Throwable -> L8a
            goto L5b
        L7d:
            X.138h r9 = r9.getNext()     // Catch: java.lang.Throwable -> L8a
            goto L2f
        L82:
            r6 = 1
        L83:
            r7.unlock()
            r7.LJIILL()
            return r6
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8a
            r7.unlock()
            r7.LJIILL()
            throw r0
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a75.c.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        r5.unlock();
        r5.LJIILL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r14, V r15) {
        /*
            r13 = this;
            r14.getClass()
            r15.getClass()
            int r9 = r13.LIZLLL(r14)
            X.138e r5 = r13.LJI(r9)
            r5.lock()
            a75.c<K, V> r0 = r5.LL     // Catch: java.lang.Throwable -> L93
            X.139C r0 = r0.LLJJ     // Catch: java.lang.Throwable -> L93
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L93
            r5.LJIILJJIL(r0)     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.atomic.AtomicReferenceArray<X.138h<K, V>> r3 = r5.LLILZLL     // Catch: java.lang.Throwable -> L93
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L93
            int r2 = r2 + (-1)
            r2 = r2 & r9
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L93
            X.138h r6 = (X.InterfaceC199613138h) r6     // Catch: java.lang.Throwable -> L93
            r7 = r6
        L2c:
            if (r7 == 0) goto L8b
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L93
            int r4 = r7.getHash()     // Catch: java.lang.Throwable -> L93
            if (r4 != r9) goto L6a
            if (r8 == 0) goto L6a
            a75.c<K, V> r4 = r5.LL     // Catch: java.lang.Throwable -> L93
            X.1398<java.lang.Object> r4 = r4.LLILZIL     // Catch: java.lang.Throwable -> L93
            boolean r4 = r4.LIZJ(r14, r8)     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L6a
            X.138g r11 = r7.LIZJ()     // Catch: java.lang.Throwable -> L93
            java.lang.Object r10 = r11.get()     // Catch: java.lang.Throwable -> L93
            if (r10 != 0) goto L6f
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8b
            int r0 = r5.LLILZ     // Catch: java.lang.Throwable -> L93
            int r0 = r0 + 1
            r5.LLILZ = r0     // Catch: java.lang.Throwable -> L93
            X.1391 r12 = X.AnonymousClass1391.COLLECTED     // Catch: java.lang.Throwable -> L93
            X.138h r1 = r5.LJIILIIL(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L93
            int r0 = r5.LLILLJJLI     // Catch: java.lang.Throwable -> L93
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L93
            r5.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L93
            goto L8b
        L6a:
            X.138h r7 = r7.getNext()     // Catch: java.lang.Throwable -> L93
            goto L2c
        L6f:
            int r2 = r5.LLILZ     // Catch: java.lang.Throwable -> L93
            int r2 = r2 + 1
            r5.LLILZ = r2     // Catch: java.lang.Throwable -> L93
            int r3 = r11.LIZ()     // Catch: java.lang.Throwable -> L93
            X.1391 r2 = X.AnonymousClass1391.REPLACED     // Catch: java.lang.Throwable -> L93
            r5.LIZLLL(r14, r10, r3, r2)     // Catch: java.lang.Throwable -> L93
            r5.LJIILLIIL(r7, r15, r0)     // Catch: java.lang.Throwable -> L93
            r5.LJ(r7)     // Catch: java.lang.Throwable -> L93
            r5.unlock()
            r5.LJIILL()
            return r10
        L8b:
            r5.unlock()
            r5.LJIILL()
            r10 = 0
            return r10
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L93
            r5.unlock()
            r5.LJIILL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a75.c.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int iLIZLLL = LIZLLL(k);
        C199610138e<K, V> c199610138eLJI = LJI(iLIZLLL);
        c199610138eLJI.lock();
        try {
            long jLIZ = c199610138eLJI.LL.LLJJ.LIZ();
            c199610138eLJI.LJIILJJIL(jLIZ);
            AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray = c199610138eLJI.LLILZLL;
            int length = (atomicReferenceArray.length() - 1) & iLIZLLL;
            InterfaceC199613138h<K, V> interfaceC199613138h = atomicReferenceArray.get(length);
            InterfaceC199613138h<K, V> next = interfaceC199613138h;
            while (true) {
                if (next == null) {
                    break;
                }
                K key = next.getKey();
                if (next.getHash() == iLIZLLL && key != null && c199610138eLJI.LL.LLILZIL.LIZJ(k, key)) {
                    InterfaceC199612138g<K, V> interfaceC199612138gLIZJ = next.LIZJ();
                    V v3 = interfaceC199612138gLIZJ.get();
                    if (v3 == null) {
                        if (interfaceC199612138gLIZJ.isActive()) {
                            c199610138eLJI.LLILZ++;
                            InterfaceC199613138h<K, V> interfaceC199613138hLJIILIIL = c199610138eLJI.LJIILIIL(interfaceC199613138h, next, key, iLIZLLL, v3, interfaceC199612138gLIZJ, AnonymousClass1391.COLLECTED);
                            int i2 = c199610138eLJI.LLILLJJLI - 1;
                            atomicReferenceArray.set(length, interfaceC199613138hLJIILIIL);
                            c199610138eLJI.LLILLJJLI = i2;
                        }
                    } else {
                        if (c199610138eLJI.LL.LLILZLL.LIZJ(v, v3)) {
                            c199610138eLJI.LLILZ++;
                            c199610138eLJI.LIZLLL(k, v3, interfaceC199612138gLIZJ.LIZ(), AnonymousClass1391.REPLACED);
                            c199610138eLJI.LJIILLIIL(next, v2, jLIZ);
                            c199610138eLJI.LJ(next);
                            c199610138eLJI.unlock();
                            c199610138eLJI.LJIILL();
                            return true;
                        }
                        if (c199610138eLJI.LL.LIZIZ()) {
                            next.LJIIIZ(jLIZ);
                        }
                        c199610138eLJI.LLJILJILJ.add(next);
                    }
                } else {
                    next = next.getNext();
                }
            }
            c199610138eLJI.unlock();
            c199610138eLJI.LJIILL();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c199610138eLJI.unlock();
            c199610138eLJI.LJIILL();
            throw th;
        }
    }
}
