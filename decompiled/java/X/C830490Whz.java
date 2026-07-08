package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Whz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830490Whz<K, V> extends C830530Wi3<K, V> implements Map<K, V> {
    public C830490Whz<K, V>.a LLILZ;
    public C830490Whz<K, V>.c LLILZIL;
    public C830490Whz<K, V>.e LLILZLL;

    /* JADX INFO: renamed from: X.0Whz$a */
    public final class a extends AbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C830520Wi2(C830490Whz.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C830490Whz.this.LLILLL;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: X.0Whz$c */
    public final class c implements Set<K> {
        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            C830490Whz.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int iHashCode = 0;
            for (int i = C830490Whz.this.LLILLL - 1; i >= 0; i--) {
                K kLJFF = C830490Whz.this.LJFF(i);
                iHashCode += kLJFF == null ? 0 : kLJFF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return C830490Whz.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            final C830490Whz c830490Whz = C830490Whz.this;
            return new AbstractC1322040kVW<K>() { // from class: X.0Wi0
                {
                    super(this.LLILZ.LLILLL);
                }

                @Override // X.AbstractC1322040kVW
                public final K LIZ(int i) {
                    return this.LLILZ.LJFF(i);
                }

                @Override // X.AbstractC1322040kVW
                public final void LIZIZ(int i) {
                    this.LLILZ.LJI(i);
                }
            };
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return C830490Whz.this.LLILLL;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            int i = C830490Whz.this.LLILLL;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C830490Whz.this.LJFF(i2);
            }
            return objArr;
        }

        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return C830490Whz.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return C830490Whz.this.LJIIIZ(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                            return true;
                        }
                    }
                } catch (ClassCastException | NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int iLIZLLL = C830490Whz.this.LIZLLL(obj);
            if (iLIZLLL >= 0) {
                C830490Whz.this.LJI(iLIZLLL);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return C830490Whz.this.LJIIJJI(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return C830490Whz.this.LJIIL(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int i = C830490Whz.this.LLILLL;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = C830490Whz.this.LJFF(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: renamed from: X.0Whz$e */
    public final class e implements Collection<V> {
        @Override // java.util.Collection
        public final void clear() {
            C830490Whz.this.clear();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return C830490Whz.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            final C830490Whz c830490Whz = C830490Whz.this;
            return new AbstractC1322040kVW<V>() { // from class: X.0Wi1
                {
                    super(this.LLILZ.LLILLL);
                }

                @Override // X.AbstractC1322040kVW
                public final V LIZ(int i) {
                    return this.LLILZ.LJIIIIZZ(i);
                }

                @Override // X.AbstractC1322040kVW
                public final void LIZIZ(int i) {
                    this.LLILZ.LJI(i);
                }
            };
        }

        @Override // java.util.Collection
        public final int size() {
            return C830490Whz.this.LLILLL;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            int i = C830490Whz.this.LLILLL;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C830490Whz.this.LJIIIIZZ(i2);
            }
            return objArr;
        }

        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            if (C830490Whz.this.LIZ(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int iLIZ = C830490Whz.this.LIZ(obj);
            if (iLIZ >= 0) {
                C830490Whz.this.LJI(iLIZ);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i = C830490Whz.this.LLILLL;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(C830490Whz.this.LJIIIIZZ(i2))) {
                    C830490Whz.this.LJI(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int i = C830490Whz.this.LLILLL;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(C830490Whz.this.LJIIIIZZ(i2))) {
                    C830490Whz.this.LJI(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int i = C830490Whz.this.LLILLL;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = C830490Whz.this.LJIIIIZZ(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C830490Whz<K, V>.a aVar = this.LLILZ;
        if (aVar != null) {
            return aVar;
        }
        C830490Whz<K, V>.a aVar2 = new a();
        this.LLILZ = aVar2;
        return aVar2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C830490Whz<K, V>.c cVar = this.LLILZIL;
        if (cVar != null) {
            return cVar;
        }
        C830490Whz<K, V>.c cVar2 = new c();
        this.LLILZIL = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C830490Whz<K, V>.e eVar = this.LLILZLL;
        if (eVar != null) {
            return eVar;
        }
        C830490Whz<K, V>.e eVar2 = new e();
        this.LLILZLL = eVar2;
        return eVar2;
    }

    public C830490Whz() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C830490Whz(C830490Whz c830490Whz) {
        super(0);
        if (c830490Whz != null) {
            int i = c830490Whz.LLILLL;
            LIZIZ(this.LLILLL + i);
            if (this.LLILLL == 0) {
                if (i > 0) {
                    System.arraycopy(c830490Whz.LL, 0, this.LL, 0, i);
                    System.arraycopy(c830490Whz.LLILLJJLI, 0, this.LLILLJJLI, 0, i << 1);
                    this.LLILLL = i;
                    return;
                }
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                put(c830490Whz.LJFF(i2), c830490Whz.LJIIIIZZ(i2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIIZ(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!super.containsKey(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIJJI(Collection<?> collection) {
        int i = this.LLILLL;
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            super.remove(it2.next());
        }
        if (i != this.LLILLL) {
            return true;
        }
        return false;
    }

    public final boolean LJIIL(Collection<?> collection) {
        int i = this.LLILLL;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(LJFF(i2))) {
                LJI(i2);
            }
        }
        if (i != this.LLILLL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C830530Wi3, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C830530Wi3, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C830530Wi3, java.util.Map
    public final V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        LIZIZ(this.LLILLL + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C830530Wi3, java.util.Map
    public final V remove(Object obj) {
        return (V) super.remove(obj);
    }

    public C830490Whz(int i) {
        super(i);
    }
}
