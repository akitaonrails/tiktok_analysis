package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19992313Kf<E> implements Set<E>, C03W4 {
    public final AbstractC19992513Kh<E> LL;

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
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
    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.LJI == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return C2152108bv.LIZ(new C19992413Kg(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.LL.LJI;
    }

    public final String toString() {
        return this.LL.toString();
    }

    public C19992313Kf(AbstractC19992513Kh<E> abstractC19992513Kh) {
        this.LL = abstractC19992513Kh;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LL.LIZ(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!this.LL.LIZ((E) it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Intrinsics.LJFF(this.LL, ((C19992313Kf) obj).LL);
        }
        return false;
    }
}
