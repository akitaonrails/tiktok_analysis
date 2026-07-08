package X;

import java.util.ListIterator;

/* JADX INFO: renamed from: X.13Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19975213Dq<E> implements ListIterator<E>, C03W4 {
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

    public AbstractC19975213Dq(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
