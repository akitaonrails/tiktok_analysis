package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.13KX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13KX<K, V> implements Set<K>, C03W4 {
    public final C13KZ<K, V> LL;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(K k) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.LJ();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        return C2152108bv.LIZ(new C13KY(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.LL.LJ;
    }

    public C13KX(C13KZ<K, V> c13kz) {
        this.LL = c13kz;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LL.LIZIZ(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!this.LL.LIZIZ((K) it2.next())) {
                return false;
            }
        }
        return true;
    }
}
