package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.13EM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EM<T> implements ListIterator<T>, C03W4 {
    public final ListIterator<T> LL;
    public final /* synthetic */ C13EL<T> LLILLJJLI;

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LL.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        return this.LL.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        C13EL<T> c13el = this.LLILLJJLI;
        return (c13el.size() - 1) - this.LL.previousIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return this.LL.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        C13EL<T> c13el = this.LLILLJJLI;
        return (c13el.size() - 1) - this.LL.nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13EM(C13EL<? extends T> c13el, int i) {
        this.LLILLJJLI = c13el;
        this.LL = c13el.LLILLJJLI.listIterator(C13EP.LJJIJIL(i, c13el));
    }
}
