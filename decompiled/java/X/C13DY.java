package X;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13DY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DY<E> implements ListIterator<E>, C03W4 {
    public final C13DV<E> LL;
    public int LLILLJJLI;
    public int LLILLL = -1;
    public int LLILZ;

    public final void LIZ() {
        if (((AbstractList) this.LL).modCount != this.LLILZ) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LLILLJJLI > 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LLILLJJLI - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        LIZ();
        int i = this.LLILLJJLI;
        C13DV<E> c13dv = this.LL;
        if (i >= c13dv.length) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = i + 1;
        this.LLILLL = i;
        return c13dv.backing[i];
    }

    @Override // java.util.ListIterator
    public final E previous() {
        LIZ();
        int i = this.LLILLJJLI;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.LLILLJJLI = i2;
        this.LLILLL = i2;
        return this.LL.backing[i2];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        LIZ();
        int i = this.LLILLL;
        if (i == -1) {
            "Call next() or previous() before removing element from the iterator.".toString();
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        this.LL.remove(i);
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = -1;
        this.LLILZ = ((AbstractList) this.LL).modCount;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LLILLJJLI;
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        LIZ();
        C13DV<E> c13dv = this.LL;
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        c13dv.add(i, e);
        this.LLILLL = -1;
        this.LLILZ = ((AbstractList) this.LL).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        LIZ();
        int i = this.LLILLL;
        if (i != -1) {
            this.LL.set(i, e);
        } else {
            "Call next() or previous() before replacing element from the iterator.".toString();
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    public C13DY(C13DV<E> c13dv, int i) {
        this.LL = c13dv;
        this.LLILLJJLI = i;
        this.LLILZ = ((AbstractList) c13dv).modCount;
    }
}
