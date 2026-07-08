package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0kVW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1322040kVW<T> implements Iterator<T>, C03W4 {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;

    public abstract T LIZ(int i);

    public abstract void LIZIZ(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.LLILLL) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.LLILLJJLI - 1;
        this.LLILLJJLI = i;
        LIZIZ(i);
        this.LL--;
        this.LLILLL = false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tLIZ = LIZ(this.LLILLJJLI);
        this.LLILLJJLI++;
        this.LLILLL = true;
        return tLIZ;
    }

    public AbstractC1322040kVW(int i) {
        this.LL = i;
    }
}
