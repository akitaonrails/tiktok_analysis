package X;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.09Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2341309Fj<T> implements Iterable<T> {
    public final /* synthetic */ Object LL;

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new Iterator<T>() { // from class: X.09Fk
            public final int LL;
            public int LLILLJJLI = 0;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LLILLJJLI < this.LL;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.LLILLL.LL;
                int i = this.LLILLJJLI;
                this.LLILLJJLI = i + 1;
                return (T) Array.get(obj, i);
            }

            {
                this.LL = Array.getLength(this.LLILLL.LL);
            }
        };
    }

    public C2341309Fj(Object obj) {
        this.LL = obj;
    }
}
