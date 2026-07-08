package X;

import X.AnonymousClass1376;
import X.C137C;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.1375, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1375<K, V, E extends C137C<K, V, E>, S extends AnonymousClass1376<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final C137N LLJI = new C137R<Object, Object, C137Q>() { // from class: X.137N
        @Override // X.C137R
        public final /* bridge */ /* synthetic */ C137C LIZIZ() {
            return null;
        }

        @Override // X.C137R
        public final void clear() {
        }

        @Override // X.C137R
        public final Object get() {
            return null;
        }

        @Override // X.C137R
        public final C137R LIZ(ReferenceQueue referenceQueue, C137O c137o) {
            return this;
        }
    };
    public static final long serialVersionUID = 5;
    public final transient int LL;
    public final transient int LLILLJJLI;
    public final transient AnonymousClass1376<K, V, E, S>[] LLILLL;
    public final int LLILZ;
    public final C137H<Object> LLILZIL;
    public final transient C137B<K, V, E, S> LLILZLL;
    public transient AnonymousClass1373 LLIZ;
    public transient C199579136z LLIZLLLIL;
    public transient AnonymousClass1374 LLJ;

    /* JADX INFO: renamed from: X.1375$h */
    public abstract class h<T> implements Iterator<T> {
        public int LL;
        public int LLILLJJLI = -1;
        public AnonymousClass1376<K, V, E, S> LLILLL;
        public AtomicReferenceArray<E> LLILZ;
        public E LLILZIL;
        public AnonymousClass1375<K, V, E, S>.h0 LLILZLL;
        public AnonymousClass1375<K, V, E, S>.h0 LLIZ;

        public final void LIZ() {
            this.LLILZLL = null;
            E e = this.LLILZIL;
            if (e != null) {
                while (true) {
                    E e2 = (E) e.getNext();
                    this.LLILZIL = e2;
                    if (e2 == null) {
                        break;
                    } else if (LIZIZ(e2)) {
                        return;
                    } else {
                        e = this.LLILZIL;
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
                AnonymousClass1376<K, V, E, S>[] anonymousClass1376Arr = AnonymousClass1375.this.LLILLL;
                this.LL = i - 1;
                AnonymousClass1376<K, V, E, S> anonymousClass1376 = anonymousClass1376Arr[i];
                this.LLILLL = anonymousClass1376;
                if (anonymousClass1376.LLILLJJLI != 0) {
                    this.LLILZ = this.LLILLL.LLILZIL;
                    this.LLILLJJLI = r0.length() - 1;
                    if (LJ()) {
                        return;
                    }
                }
            }
        }

        public final AnonymousClass1375<K, V, E, S>.h0 LIZLLL() {
            AnonymousClass1375<K, V, E, S>.h0 h0Var = this.LLILZLL;
            if (h0Var == null) {
                throw new NoSuchElementException();
            }
            this.LLIZ = h0Var;
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
                java.util.concurrent.atomic.AtomicReferenceArray<E extends X.137C<K, V, E>> r1 = r3.LLILZ
                int r0 = r2 + (-1)
                r3.LLILLJJLI = r0
                java.lang.Object r0 = r1.get(r2)
                X.137C r0 = (X.C137C) r0
                r3.LLILZIL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                r1 = 1
                if (r0 != 0) goto L31
                E extends X.137C<K, V, E> r0 = r3.LLILZIL
                if (r0 == 0) goto L0
            L20:
                X.137C r0 = r0.getNext()
                r3.LLILZIL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                if (r0 != 0) goto L31
                E extends X.137C<K, V, E> r0 = r3.LLILZIL
                goto L20
            L31:
                return r1
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1375.h.LJ():boolean");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LLILZLL != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C19863912nl.LIZJ(this.LLIZ != null);
            AnonymousClass1375.this.remove(this.LLIZ.LL);
            this.LLIZ = null;
        }

        public h() {
            this.LL = AnonymousClass1375.this.LLILLL.length - 1;
            LIZ();
        }

        public final boolean LIZIZ(E e) {
            Object value;
            try {
                Object key = e.getKey();
                AnonymousClass1375.this.getClass();
                if (e.getKey() != null && (value = e.getValue()) != null) {
                    this.LLILZLL = new h0(key, value);
                    this.LLILLL.LJI();
                    return true;
                }
                this.LLILLL.LJI();
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLL.LJI();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X.1375$h0 */
    public final class h0 extends AbstractC19868112oR<K, V> {
        public final K LL;
        public V LLILLJJLI;

        @Override // X.AbstractC19868112oR, java.util.Map.Entry
        public final int hashCode() {
            return this.LL.hashCode() ^ this.LLILLJJLI.hashCode();
        }

        @Override // X.AbstractC19868112oR, java.util.Map.Entry
        public final K getKey() {
            return this.LL;
        }

        @Override // X.AbstractC19868112oR, java.util.Map.Entry
        public final V getValue() {
            return this.LLILLJJLI;
        }

        @Override // X.AbstractC19868112oR, java.util.Map.Entry
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

        @Override // X.AbstractC19868112oR, java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) AnonymousClass1375.this.put(this.LL, v);
            this.LLILLJJLI = v;
            return v2;
        }

        public h0(K k, V v) {
            this.LL = k;
            this.LLILLJJLI = v;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (AnonymousClass1376<K, V, E, S> anonymousClass1376 : this.LLILLL) {
            if (anonymousClass1376.LLILLJJLI != 0) {
                anonymousClass1376.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = anonymousClass1376.LLILZIL;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    anonymousClass1376.LJ();
                    anonymousClass1376.LLILZLL.set(0);
                    anonymousClass1376.LLILLL++;
                    anonymousClass1376.LLILLJJLI = 0;
                    anonymousClass1376.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    anonymousClass1376.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        AnonymousClass1374 anonymousClass1374 = this.LLJ;
        if (anonymousClass1374 != null) {
            return anonymousClass1374;
        }
        AbstractC19889212rq<Map.Entry<K, V>> abstractC19889212rq = new AbstractC19889212rq<Map.Entry<K, V>>() { // from class: X.1374
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return new AnonymousClass1375<K, V, E, S>.h<Map.Entry<K, V>>(this.LL) { // from class: X.1371
                    @Override // java.util.Iterator
                    public final Object next() {
                        return LIZLLL();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LL.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Map.Entry entry;
                Object key;
                Object obj2;
                if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.LL.get(key)) == null || !this.LL.LLILZLL.LIZIZ().LIZJ().LIZJ(entry.getValue(), obj2)) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Map.Entry entry;
                Object key;
                if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !this.LL.remove(key, entry.getValue())) {
                    return false;
                }
                return true;
            }
        };
        this.LLJ = abstractC19889212rq;
        return abstractC19889212rq;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        AnonymousClass1376<K, V, E, S>[] anonymousClass1376Arr = this.LLILLL;
        long j = 0;
        for (int i = 0; i < anonymousClass1376Arr.length; i++) {
            if (anonymousClass1376Arr[i].LLILLJJLI != 0) {
                return false;
            }
            j += (long) anonymousClass1376Arr[i].LLILLL;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < anonymousClass1376Arr.length; i2++) {
            if (anonymousClass1376Arr[i2].LLILLJJLI != 0) {
                return false;
            }
            j -= (long) anonymousClass1376Arr[i2].LLILLL;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        AnonymousClass1373 anonymousClass1373 = this.LLIZ;
        if (anonymousClass1373 != null) {
            return anonymousClass1373;
        }
        AbstractC19889212rq<K> abstractC19889212rq = new AbstractC19889212rq<K>() { // from class: X.1373
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<K> iterator() {
                return new AnonymousClass1375<K, V, E, S>.h<K>(this.LL) { // from class: X.1372
                    @Override // java.util.Iterator
                    public final K next() {
                        return LIZLLL().LL;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LL.size();
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
        this.LLIZ = abstractC19889212rq;
        return abstractC19889212rq;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (AnonymousClass1376<K, V, E, S> anonymousClass1376 : this.LLILLL) {
            j += (long) anonymousClass1376.LLILLJJLI;
        }
        return C19881312qZ.LIZIZ(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C199579136z c199579136z = this.LLIZLLLIL;
        if (c199579136z != null) {
            return c199579136z;
        }
        AbstractCollection<V> abstractCollection = new AbstractCollection<V>() { // from class: X.136z
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
                final AnonymousClass1375 anonymousClass1375 = this.LL;
                return new AnonymousClass1375<K, V, E, S>.h<V>(anonymousClass1375) { // from class: X.1370
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
                return AnonymousClass1375.LIZJ(this).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final <T> T[] toArray(T[] tArr) {
                return (T[]) AnonymousClass1375.LIZJ(this).toArray(tArr);
            }
        };
        this.LLIZLLLIL = abstractCollection;
        return abstractCollection;
    }

    public Object writeReplace() {
        final C137L c137lLIZ = this.LLILZLL.LIZ();
        final C137L c137lLIZIZ = this.LLILZLL.LIZIZ();
        final C137H<Object> c137h = this.LLILZIL;
        this.LLILZLL.LIZIZ().LIZJ();
        final int i = this.LLILZ;
        return new C137A<K, V>(c137lLIZ, c137lLIZIZ, c137h, i, this) { // from class: X.1377
            public static final long serialVersionUID = 3;

            private Object readResolve() {
                return this.LLILZIL;
            }

            private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                objectInputStream.defaultReadObject();
                int i2 = objectInputStream.readInt();
                AnonymousClass1378 anonymousClass1378 = new AnonymousClass1378();
                int i3 = anonymousClass1378.LIZIZ;
                boolean z6 = false;
                if (i3 == -1) {
                    z = true;
                } else {
                    z = false;
                }
                C19864312np.LJIIJ(i3, "initial capacity was already set to %s", z);
                if (i2 >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C19864312np.LJ(z2);
                anonymousClass1378.LIZIZ = i2;
                anonymousClass1378.LIZLLL(this.LL);
                C137L c137l = this.LLILLJJLI;
                C137L c137l2 = anonymousClass1378.LJ;
                if (c137l2 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C19864312np.LJIIL(c137l2, "Value strength was already set to %s", z3);
                c137l.getClass();
                anonymousClass1378.LJ = c137l;
                if (c137l != C137L.LL) {
                    anonymousClass1378.LIZ = true;
                }
                C137H<Object> c137h2 = this.LLILLL;
                C137H<Object> c137h3 = anonymousClass1378.LJFF;
                if (c137h3 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C19864312np.LJIIL(c137h3, "key equivalence was already set to %s", z4);
                c137h2.getClass();
                anonymousClass1378.LJFF = c137h2;
                anonymousClass1378.LIZ = true;
                int i4 = this.LLILZ;
                int i5 = anonymousClass1378.LIZJ;
                if (i5 == -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C19864312np.LJIIJ(i5, "concurrency level was already set to %s", z5);
                if (i4 > 0) {
                    z6 = true;
                }
                C19864312np.LJ(z6);
                anonymousClass1378.LIZJ = i4;
                this.LLILZIL = anonymousClass1378.LIZJ();
                while (true) {
                    Object object = objectInputStream.readObject();
                    if (object == null) {
                        return;
                    }
                    this.LLILZIL.put((K) object, (V) objectInputStream.readObject());
                }
            }

            private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
                objectOutputStream.defaultWriteObject();
                objectOutputStream.writeInt(this.LLILZIL.size());
                for (Map.Entry<K, V> entry : this.LLILZIL.entrySet()) {
                    objectOutputStream.writeObject(entry.getKey());
                    objectOutputStream.writeObject(entry.getValue());
                }
                objectOutputStream.writeObject(null);
            }
        };
    }

    public static <E> ArrayList<E> LIZJ(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C19867212oI.LIZ(arrayList, collection.iterator());
        return arrayList;
    }

    public final int LIZ(Object obj) {
        int iLIZIZ;
        C137H<Object> c137h = this.LLILZIL;
        if (obj == null) {
            c137h.getClass();
            iLIZIZ = 0;
        } else {
            iLIZIZ = c137h.LIZIZ(obj);
        }
        int i = iLIZIZ + ((iLIZIZ << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final AnonymousClass1376<K, V, E, S> LIZIZ(int i) {
        return this.LLILLL[(i >>> this.LLILLJJLI) & this.LL];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C137C c137cLIZLLL;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iLIZ = LIZ(obj);
        AnonymousClass1376<K, V, E, S> anonymousClass1376LIZIZ = LIZIZ(iLIZ);
        anonymousClass1376LIZIZ.getClass();
        try {
            if (anonymousClass1376LIZIZ.LLILLJJLI != 0 && (c137cLIZLLL = anonymousClass1376LIZIZ.LIZLLL(iLIZ, obj)) != null) {
                if (c137cLIZLLL.getValue() != null) {
                    z = true;
                }
            }
            anonymousClass1376LIZIZ.LJI();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            anonymousClass1376LIZIZ.LJI();
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        AnonymousClass1376<K, V, E, S>[] anonymousClass1376Arr = this.LLILLL;
        long j = -1;
        int i = 0;
        do {
            long j2 = 0;
            for (AnonymousClass1376<K, V, E, S> anonymousClass1376 : anonymousClass1376Arr) {
                AtomicReferenceArray<E> atomicReferenceArray = anonymousClass1376.LLILZIL;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    for (E next = atomicReferenceArray.get(i2); next != null; next = next.getNext()) {
                        if (next.getKey() == null) {
                            anonymousClass1376.LJIIL();
                        } else {
                            Object value = next.getValue();
                            if (value == null) {
                                anonymousClass1376.LJIIL();
                            } else if (this.LLILZLL.LIZIZ().LIZJ().LIZJ(obj, value)) {
                                return true;
                            }
                        }
                    }
                }
                j2 += (long) anonymousClass1376.LLILLL;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        } while (i < 3);
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iLIZ = LIZ(obj);
        AnonymousClass1376<K, V, E, S> anonymousClass1376LIZIZ = LIZIZ(iLIZ);
        anonymousClass1376LIZIZ.getClass();
        try {
            C137C c137cLIZLLL = anonymousClass1376LIZIZ.LIZLLL(iLIZ, obj);
            if (c137cLIZLLL != null && (v = (V) c137cLIZLLL.getValue()) == null) {
                anonymousClass1376LIZIZ.LJIIL();
            }
            anonymousClass1376LIZIZ.LJI();
            return v;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            anonymousClass1376LIZIZ.LJI();
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r2 = (V) r1.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1.getValue() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r4.LLILLL++;
        r1 = r4.LJIIIIZZ(r6, r1);
        r0 = r4.LLILLJJLI - 1;
        r5.set(r3, (E) r1);
        r4.LLILLJJLI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return r2;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 0
            if (r11 != 0) goto L4
            return r9
        L4:
            int r8 = r10.LIZ(r11)
            X.1376 r4 = r10.LIZIZ(r8)
            r4.lock()
            r4.LJIIIZ()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.137C<K, V, E>> r5 = r4.LLILZIL     // Catch: java.lang.Throwable -> L6b
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L6b
            r7 = 1
            int r3 = r3 - r7
            r3 = r3 & r8
            java.lang.Object r6 = r5.get(r3)     // Catch: java.lang.Throwable -> L6b
            X.137C r6 = (X.C137C) r6     // Catch: java.lang.Throwable -> L6b
            r1 = r6
        L22:
            if (r1 == 0) goto L67
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L6b
            int r0 = r1.getHash()     // Catch: java.lang.Throwable -> L6b
            if (r0 != r8) goto L47
            if (r2 == 0) goto L47
            X.1375<K, V, E extends X.137C<K, V, E>, S extends X.1376<K, V, E, S>> r0 = r4.LL     // Catch: java.lang.Throwable -> L6b
            X.137H<java.lang.Object> r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.LIZJ(r11, r2)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L47
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L51
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L4c
            goto L4e
        L47:
            X.137C r1 = r1.getNext()     // Catch: java.lang.Throwable -> L6b
            goto L22
        L4c:
            r0 = 0
            goto L4f
        L4e:
            r0 = 1
        L4f:
            if (r0 == 0) goto L67
        L51:
            int r0 = r4.LLILLL     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + 1
            r4.LLILLL = r0     // Catch: java.lang.Throwable -> L6b
            X.137C r1 = r4.LJIIIIZZ(r6, r1)     // Catch: java.lang.Throwable -> L6b
            int r0 = r4.LLILLJJLI     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 - r7
            r5.set(r3, r1)     // Catch: java.lang.Throwable -> L6b
            r4.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L6b
            r4.unlock()
            return r2
        L67:
            r4.unlock()
            return r9
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1375.remove(java.lang.Object):java.lang.Object");
    }

    public AnonymousClass1375(AnonymousClass1378 anonymousClass1378, C137B<K, V, E, S> c137b) {
        int i = anonymousClass1378.LIZJ;
        this.LLILZ = Math.min(i == -1 ? 4 : i, 65536);
        this.LLILZIL = (C137H) C135U.LIZ(anonymousClass1378.LJFF, anonymousClass1378.LIZ().LIZJ());
        this.LLILZLL = c137b;
        int i2 = anonymousClass1378.LIZIZ;
        int iMin = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.LLILZ) {
            i6++;
            i5 <<= 1;
        }
        this.LLILLJJLI = 32 - i6;
        this.LL = i5 - 1;
        this.LLILLL = new AnonymousClass1376[i5];
        int i7 = iMin / i5;
        while (i3 < (i5 * i7 < iMin ? i7 + 1 : i7)) {
            i3 <<= 1;
        }
        while (true) {
            AnonymousClass1376<K, V, E, S>[] anonymousClass1376Arr = this.LLILLL;
            if (i4 < anonymousClass1376Arr.length) {
                anonymousClass1376Arr[i4] = this.LLILZLL.LIZJ(this, i3);
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int iLIZ = LIZ(k);
        return (V) LIZIZ(iLIZ).LJII(iLIZ, k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int iLIZ = LIZ(k);
        return (V) LIZIZ(iLIZ).LJII(iLIZ, k, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r3.LL.LLILZLL.LIZIZ().LIZJ().LIZJ(r12, r1.getValue()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r1.getValue() != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r3.LLILLL++;
        r1 = r3.LJIIIIZZ(r5, r1);
        r0 = r3.LLILLJJLI - 1;
        r4.set(r2, (E) r1);
        r3.LLILLJJLI = r0;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r9 = 0
            if (r11 == 0) goto L7d
            if (r12 == 0) goto L7d
            int r8 = r10.LIZ(r11)
            X.1376 r3 = r10.LIZIZ(r8)
            r3.lock()
            r3.LJIIIZ()     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.137C<K, V, E>> r4 = r3.LLILZIL     // Catch: java.lang.Throwable -> L75
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L75
            r7 = 1
            int r2 = r2 - r7
            r2 = r2 & r8
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L75
            X.137C r5 = (X.C137C) r5     // Catch: java.lang.Throwable -> L75
            r1 = r5
        L23:
            if (r1 == 0) goto L71
            java.lang.Object r6 = r1.getKey()     // Catch: java.lang.Throwable -> L75
            int r0 = r1.getHash()     // Catch: java.lang.Throwable -> L75
            if (r0 != r8) goto L52
            if (r6 == 0) goto L52
            X.1375<K, V, E extends X.137C<K, V, E>, S extends X.1376<K, V, E, S>> r0 = r3.LL     // Catch: java.lang.Throwable -> L75
            X.137H<java.lang.Object> r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.LIZJ(r11, r6)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L52
            java.lang.Object r6 = r1.getValue()     // Catch: java.lang.Throwable -> L75
            X.1375<K, V, E extends X.137C<K, V, E>, S extends X.1376<K, V, E, S>> r0 = r3.LL     // Catch: java.lang.Throwable -> L75
            X.137B<K, V, E extends X.137C<K, V, E>, S extends X.1376<K, V, E, S>> r0 = r0.LLILZLL     // Catch: java.lang.Throwable -> L75
            X.137L r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L75
            X.137H r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.LIZJ(r12, r6)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L59
            goto L57
        L52:
            X.137C r1 = r1.getNext()     // Catch: java.lang.Throwable -> L75
            goto L23
        L57:
            r9 = 1
            goto L5f
        L59:
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L71
        L5f:
            int r0 = r3.LLILLL     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + 1
            r3.LLILLL = r0     // Catch: java.lang.Throwable -> L75
            X.137C r1 = r3.LJIIIIZZ(r5, r1)     // Catch: java.lang.Throwable -> L75
            int r0 = r3.LLILLJJLI     // Catch: java.lang.Throwable -> L75
            int r0 = r0 - r7
            r4.set(r2, r1)     // Catch: java.lang.Throwable -> L75
            r3.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L75
        L71:
            r3.unlock()
            return r9
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L75
            r3.unlock()
            throw r0
        L7d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1375.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r2.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r11, V r12) {
        /*
            r10 = this;
            r11.getClass()
            r12.getClass()
            int r9 = r10.LIZ(r11)
            X.1376 r2 = r10.LIZIZ(r9)
            r2.lock()
            r2.LJIIIZ()     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.137C<K, V, E>> r5 = r2.LLILZIL     // Catch: java.lang.Throwable -> L78
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L78
            r8 = 1
            int r4 = r4 - r8
            r4 = r4 & r9
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L78
            X.137C r6 = (X.C137C) r6     // Catch: java.lang.Throwable -> L78
            r3 = r6
        L24:
            r7 = 0
            if (r3 == 0) goto L74
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L78
            int r0 = r3.getHash()     // Catch: java.lang.Throwable -> L78
            if (r0 != r9) goto L4a
            if (r1 == 0) goto L4a
            X.1375<K, V, E extends X.137C<K, V, E>, S extends X.1376<K, V, E, S>> r0 = r2.LL     // Catch: java.lang.Throwable -> L78
            X.137H<java.lang.Object> r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r0.LIZJ(r11, r1)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L67
            java.lang.Object r0 = r3.getValue()     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L4f
            goto L51
        L4a:
            X.137C r3 = r3.getNext()     // Catch: java.lang.Throwable -> L78
            goto L24
        L4f:
            r0 = 0
            goto L52
        L51:
            r0 = 1
        L52:
            if (r0 == 0) goto L74
            int r0 = r2.LLILLL     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + 1
            r2.LLILLL = r0     // Catch: java.lang.Throwable -> L78
            X.137C r1 = r2.LJIIIIZZ(r6, r3)     // Catch: java.lang.Throwable -> L78
            int r0 = r2.LLILLJJLI     // Catch: java.lang.Throwable -> L78
            int r0 = r0 - r8
            r5.set(r4, r1)     // Catch: java.lang.Throwable -> L78
            r2.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L78
            goto L74
        L67:
            int r0 = r2.LLILLL     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + 1
            r2.LLILLL = r0     // Catch: java.lang.Throwable -> L78
            r2.LJIIJJI(r3, r12)     // Catch: java.lang.Throwable -> L78
            r2.unlock()
            return r1
        L74:
            r2.unlock()
            return r7
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L78
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1375.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int iLIZ = LIZ(k);
        AnonymousClass1376<K, V, E, S> anonymousClass1376LIZIZ = LIZIZ(iLIZ);
        anonymousClass1376LIZIZ.lock();
        try {
            anonymousClass1376LIZIZ.LJIIIZ();
            AtomicReferenceArray<E> atomicReferenceArray = anonymousClass1376LIZIZ.LLILZIL;
            int length = (atomicReferenceArray.length() - 1) & iLIZ;
            E e = atomicReferenceArray.get(length);
            C137C next = e;
            while (true) {
                if (next == null) {
                    break;
                }
                Object key = next.getKey();
                if (next.getHash() == iLIZ && key != null && anonymousClass1376LIZIZ.LL.LLILZIL.LIZJ(k, key)) {
                    Object value = next.getValue();
                    if (value == null) {
                        if (next.getValue() == null) {
                            anonymousClass1376LIZIZ.LLILLL++;
                            C137C c137cLJIIIIZZ = anonymousClass1376LIZIZ.LJIIIIZZ(e, next);
                            int i = anonymousClass1376LIZIZ.LLILLJJLI - 1;
                            atomicReferenceArray.set(length, (E) c137cLJIIIIZZ);
                            anonymousClass1376LIZIZ.LLILLJJLI = i;
                        }
                    } else if (anonymousClass1376LIZIZ.LL.LLILZLL.LIZIZ().LIZJ().LIZJ(v, value)) {
                        anonymousClass1376LIZIZ.LLILLL++;
                        anonymousClass1376LIZIZ.LJIIJJI(next, v2);
                        anonymousClass1376LIZIZ.unlock();
                        return true;
                    }
                } else {
                    next = next.getNext();
                }
            }
            anonymousClass1376LIZIZ.unlock();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            anonymousClass1376LIZIZ.unlock();
            throw th;
        }
    }
}
