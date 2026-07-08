package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19886212rM<E> extends AbstractC19885912rJ<E> {
    public final AbstractC19885712rH<E> LLILLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19886212rM(AbstractC19885712rH<E> abstractC19885712rH, final int i) {
        final int size = abstractC19885712rH.size();
        new C08CW<E>(size, i) { // from class: X.12rJ
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
            public final E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.LLILLJJLI;
                this.LLILLJJLI = i2 + 1;
                return ((C19886212rM) this).LLILLL.get(i2);
            }

            @Override // java.util.ListIterator
            public final E previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.LLILLJJLI - 1;
                this.LLILLJJLI = i2;
                return ((C19886212rM) this).LLILLL.get(i2);
            }

            {
                if (i >= 0 && i <= size) {
                    this.LL = size;
                    this.LLILLJJLI = i;
                    return;
                }
                throw new IndexOutOfBoundsException(C19863612ni.LIZJ(i, size, "index"));
            }
        };
        this.LLILLL = abstractC19885712rH;
    }
}
