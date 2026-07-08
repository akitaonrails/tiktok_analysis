package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.08QT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QT<T> implements Iterator<T>, C03W4 {
    public final Iterator<T> LL;
    public int LLILLJJLI = -1;
    public T LLILLL;
    public final /* synthetic */ C08QU<T> LLILZ;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void LIZ() {
        while (this.LL.hasNext()) {
            T next = this.LL.next();
            if (this.LLILZ.LIZJ.invoke(next).booleanValue() == this.LLILZ.LIZIZ) {
                this.LLILLL = next;
                this.LLILLJJLI = 1;
                return;
            }
        }
        this.LLILLJJLI = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LLILLJJLI == -1) {
            LIZ();
        }
        return this.LLILLJJLI == 1;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.LLILLJJLI == -1) {
            LIZ();
        }
        if (this.LLILLJJLI == 0) {
            throw new NoSuchElementException();
        }
        T t = this.LLILLL;
        this.LLILLL = null;
        this.LLILLJJLI = -1;
        return t;
    }

    public C08QT(C08QU<T> c08qu) {
        this.LLILZ = c08qu;
        this.LL = c08qu.LIZ.iterator();
    }
}
