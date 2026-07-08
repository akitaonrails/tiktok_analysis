package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19864712nt<E> extends AbstractC19864112nn<E> {
    public final int LL;
    public int LLILLJJLI;

    public abstract E LIZ(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LLILLJJLI > 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LLILLJJLI - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        return LIZ(i);
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.LLILLJJLI - 1;
        this.LLILLJJLI = i;
        return LIZ(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LLILLJJLI;
    }

    public AbstractC19864712nt(int i, int i2) {
        C19864312np.LJIIIIZZ(i2, i);
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
