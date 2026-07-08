package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.13Dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19974513Dj<E> extends AbstractC19974313Dh<E>.b implements ListIterator<E> {
    public final /* synthetic */ AbstractC19974313Dh<E> LLILLL;

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LL > 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LL - 1;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        AbstractC19974313Dh<E> abstractC19974313Dh = this.LLILLL;
        int i = this.LL - 1;
        this.LL = i;
        return abstractC19974313Dh.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19974513Dj(AbstractC19974313Dh abstractC19974313Dh, int i) {
        super();
        this.LLILLL = abstractC19974313Dh;
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = abstractC19974313Dh.size();
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, size);
        this.LL = i;
    }
}
