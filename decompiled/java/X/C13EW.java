package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.13EW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EW<T> implements ListIterator<T>, C03W4 {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ C13ET<T> LLILLJJLI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LL.element < this.LLILLJJLI.LLILZ - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LL.element >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        int i = this.LL.element + 1;
        C13EX.LIZ(i, this.LLILLJJLI.LLILZ);
        this.LL.element = i;
        return this.LLILLJJLI.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LL.element + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.LL.element;
        C13EX.LIZ(i, this.LLILLJJLI.LLILZ);
        this.LL.element = i - 1;
        return this.LLILLJJLI.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LL.element;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        "Cannot modify a state list through an iterator".toString();
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        "Cannot modify a state list through an iterator".toString();
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        "Cannot modify a state list through an iterator".toString();
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public C13EW(C118300cf c118300cf, C13ET<T> c13et) {
        this.LL = c118300cf;
        this.LLILLJJLI = c13et;
    }
}
