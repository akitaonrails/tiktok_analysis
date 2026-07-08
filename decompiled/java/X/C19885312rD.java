package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19885312rD extends AbstractC19885212rC {
    public final AbstractC19884912r9 LLILLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19885312rD(AbstractC19884912r9 abstractC19884912r9, final int i) {
        final int size = abstractC19884912r9.size();
        new AbstractC19885412rE(size, i) { // from class: X.12rC
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
                int i2 = this.LLILLJJLI;
                this.LLILLJJLI = i2 + 1;
                return ((C19885312rD) this).LLILLL.get(i2);
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.LLILLJJLI - 1;
                this.LLILLJJLI = i2;
                return ((C19885312rD) this).LLILLL.get(i2);
            }

            {
                C19863812nk.LIZIZ(i, size);
                this.LL = size;
                this.LLILLJJLI = i;
            }
        };
        this.LLILLL = abstractC19884912r9;
    }
}
