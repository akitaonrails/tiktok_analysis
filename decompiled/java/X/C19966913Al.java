package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19966913Al extends AbstractC19966713Aj {
    public final AbstractC19966113Ad LLILLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19966913Al(AbstractC19966113Ad abstractC19966113Ad, final int i) {
        final int size = abstractC19966113Ad.size();
        new AbstractC19967013Am(size, i) { // from class: X.13Aj
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
                return ((C19966913Al) this).LLILLL.get(i2);
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.LLILLJJLI - 1;
                this.LLILLJJLI = i2;
                return ((C19966913Al) this).LLILLL.get(i2);
            }

            {
                if (i >= 0 && i <= size) {
                    this.LL = size;
                    this.LLILLJJLI = i;
                    return;
                }
                throw new IndexOutOfBoundsException(C19863712nj.LIZJ(i, size, "index"));
            }
        };
        this.LLILLL = abstractC19966113Ad;
    }
}
