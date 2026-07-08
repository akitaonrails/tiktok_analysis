package X;

import java.util.ListIterator;

/* JADX INFO: renamed from: X.13B7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B7 implements ListIterator<AbstractC20055413dY>, C03W4 {
    public int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final /* synthetic */ C13B8 LLILZ;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(AbstractC20055413dY abstractC20055413dY) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(AbstractC20055413dY abstractC20055413dY) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLL;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LL > this.LLILLJJLI;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        C13B1<Object> c13b1 = this.LLILZ.LL;
        int i = this.LL;
        this.LL = i + 1;
        return c13b1.LIZIZ(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LL - this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.13dY, java.lang.Object] */
    @Override // java.util.ListIterator
    public final AbstractC20055413dY previous() {
        C13B1<Object> c13b1 = this.LLILZ.LL;
        int i = this.LL - 1;
        this.LL = i;
        return c13b1.LIZIZ(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.LL - this.LLILLJJLI) - 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13B7(C13B8 c13b8, int i, int i2) {
        int i3;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            i3 = c13b8.LL.LIZIZ;
        } else {
            i3 = 0;
        }
        this(c13b8, i, 0, i3);
    }

    public C13B7(C13B8 c13b8, int i, int i2, int i3) {
        this.LLILZ = c13b8;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
