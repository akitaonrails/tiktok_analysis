package X;

import java.util.ListIterator;

/* JADX INFO: renamed from: X.13E2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13E2<E> implements ListIterator<E>, C03W4 {
    public int LL;
    public int LLILLJJLI;

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LL > 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LL - 1;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LL;
    }

    public C13E2(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
