package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.089H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089H<T> implements Collection<T>, C03W4 {
    public final T[] LL;
    public final boolean LLILLJJLI;

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.LL.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C089E(this.LL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LL.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.LL;
        return (this.LLILLJJLI && Intrinsics.LJFF(tArr.getClass(), Object[].class)) ? tArr : Arrays.copyOf(tArr, tArr.length, Object[].class);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return C13LQ.LJIILLIIL(obj, this.LL);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public C089H(T[] tArr, boolean z) {
        this.LL = tArr;
        this.LLILLJJLI = z;
    }
}
