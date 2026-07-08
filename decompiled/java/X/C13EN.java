package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.13EN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EN<T> implements ListIterator<T>, C03W4 {
    public final ListIterator<T> LL;
    public final /* synthetic */ C13EO<T> LLILLJJLI;

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
        C13EO<T> c13eo = this.LLILLJJLI;
        return (c13eo.size() - 1) - this.LL.previousIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return this.LL.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        C13EO<T> c13eo = this.LLILLJJLI;
        return (c13eo.size() - 1) - this.LL.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.LL.remove();
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        this.LL.add(t);
        this.LL.previous();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        this.LL.set(t);
    }

    public C13EN(C13EO<T> c13eo, int i) {
        this.LLILLJJLI = c13eo;
        this.LL = c13eo.LL.listIterator(C13EP.LJJIJIL(i, c13eo));
    }
}
