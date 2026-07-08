package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: X.13Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19993013Km implements Collection<Object>, C03W4 {
    public final C19992713Kj<Object> LL;

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super Object> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.LL.LIZJ();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.LL.LJI == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        C19992713Kj<Object> c19992713Kj = this.LL;
        c19992713Kj.getClass();
        return new C19993113Kn(new C19992813Kk(c19992713Kj));
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LL.LJI;
    }

    public C19993013Km(int i) {
        int i2 = C19993213Ko.LIZ;
        this.LL = new C19992713Kj<>(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.LL.LIZIZ(obj);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.LL.LIZ(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!this.LL.LIZ(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.LL.LJI(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        return this.LL.LJI(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return this.LL.LJIIIIZZ(collection);
    }
}
