package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.08QL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08QL<T> implements Iterator<T>, C03W4 {
    public int LL;
    public T LLILLJJLI;

    public abstract void LIZ();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.LL;
        if (i == 0) {
            this.LL = 3;
            LIZ();
            if (this.LL != 1) {
                return false;
            }
        } else if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.LL;
        if (i == 1) {
            this.LL = 0;
            return this.LLILLJJLI;
        }
        if (i != 2) {
            this.LL = 3;
            LIZ();
            if (this.LL == 1) {
                this.LL = 0;
                return this.LLILLJJLI;
            }
        }
        throw new NoSuchElementException();
    }
}
