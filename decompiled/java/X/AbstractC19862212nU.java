package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12nU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19862212nU extends AbstractC19861212nK {
    public final int LL;
    public int LLILLJJLI;

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LLILLJJLI > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LLILLJJLI;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LLILLJJLI - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        return ((C19863012nc) this).LLILLL.get(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.LLILLJJLI - 1;
        this.LLILLJJLI = i;
        return ((C19863012nc) this).LLILLL.get(i);
    }

    public AbstractC19862212nU(int i, int i2) {
        if (i2 >= 0 && i2 <= i) {
            this.LL = i;
            this.LLILLJJLI = i2;
            return;
        }
        throw new IndexOutOfBoundsException(C19862312nV.LIZJ(i2, i, "index"));
    }
}
