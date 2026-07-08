package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.13EU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EU<T> implements ListIterator<T>, C03W4 {
    public final C13ES<T> LL;
    public int LLILLJJLI;
    public int LLILLL = -1;
    public int LLILZ;

    public final void LIZ() {
        if (this.LL.LJFF() != this.LLILZ) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LLILLJJLI >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LLILLJJLI + 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        LIZ();
        int i = this.LLILLJJLI + 1;
        this.LLILLL = i;
        C13EX.LIZ(i, this.LL.size());
        T t = this.LL.get(i);
        this.LLILLJJLI = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        LIZ();
        C13EX.LIZ(this.LLILLJJLI, this.LL.size());
        int i = this.LLILLJJLI;
        this.LLILLL = i;
        this.LLILLJJLI--;
        return this.LL.get(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        LIZ();
        this.LL.remove(this.LLILLJJLI);
        this.LLILLJJLI--;
        this.LLILLL = -1;
        this.LLILZ = this.LL.LJFF();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LLILLJJLI;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        LIZ();
        this.LL.add(this.LLILLJJLI + 1, t);
        this.LLILLL = -1;
        this.LLILLJJLI++;
        this.LLILZ = this.LL.LJFF();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        LIZ();
        int i = this.LLILLL;
        if (i >= 0) {
            this.LL.set(i, t);
            this.LLILZ = this.LL.LJFF();
        } else {
            "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString();
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
    }

    public C13EU(C13ES<T> c13es, int i) {
        this.LL = c13es;
        this.LLILLJJLI = i - 1;
        this.LLILZ = c13es.LJFF();
    }
}
