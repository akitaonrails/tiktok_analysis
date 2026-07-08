package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.13Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19993713Kt<T> implements Set<T>, C03W4 {
    public final AbstractC19993613Ks<T> LL;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
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
        return this.LL.LIZIZ();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return C2152108bv.LIZ(new C19993813Ku(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.LL.LIZLLL;
    }

    public C19993713Kt(C19994113Kx c19994113Kx) {
        this.LL = c19994113Kx;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LL.LIZ(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!this.LL.LIZ(it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
