package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13B6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B6 implements List<AbstractC20055413dY>, C03W4 {
    public final int LL;
    public final int LLILLJJLI;
    public final /* synthetic */ C13B8 LLILLL;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC20055413dY abstractC20055413dY) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC20055413dY> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends AbstractC20055413dY> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC20055413dY remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC20055413dY> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC20055413dY set(int i, AbstractC20055413dY abstractC20055413dY) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC20055413dY> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLJJLI - this.LL == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<AbstractC20055413dY> iterator() {
        C13B8 c13b8 = this.LLILLL;
        int i = this.LL;
        return new C13B7(c13b8, i, i, this.LLILLJJLI);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC20055413dY> listIterator() {
        C13B8 c13b8 = this.LLILLL;
        int i = this.LL;
        return new C13B7(c13b8, i, i, this.LLILLJJLI);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LLILLJJLI - this.LL;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC20055413dY) || indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13dY, java.lang.Object] */
    @Override // java.util.List
    public final AbstractC20055413dY get(int i) {
        return this.LLILLL.LL.LIZIZ(i + this.LL);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof AbstractC20055413dY) || (i = this.LL) > (i2 = this.LLILLJJLI)) {
            return -1;
        }
        while (!Intrinsics.LJFF(this.LLILLL.LL.LIZIZ(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i++;
        }
        return i - this.LL;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof AbstractC20055413dY) || (i2 = this.LL) > (i = this.LLILLJJLI)) {
            return -1;
        }
        while (!Intrinsics.LJFF(this.LLILLL.LL.LIZIZ(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - this.LL;
    }

    @Override // java.util.List
    public final ListIterator<AbstractC20055413dY> listIterator(int i) {
        C13B8 c13b8 = this.LLILLL;
        int i2 = this.LL;
        return new C13B7(c13b8, i + i2, i2, this.LLILLJJLI);
    }

    @Override // java.util.List
    public final List<AbstractC20055413dY> subList(int i, int i2) {
        C13B8 c13b8 = this.LLILLL;
        int i3 = this.LL;
        return new C13B6(c13b8, i + i3, i3 + i2);
    }

    public C13B6(C13B8 c13b8, int i, int i2) {
        this.LLILLL = c13b8;
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
