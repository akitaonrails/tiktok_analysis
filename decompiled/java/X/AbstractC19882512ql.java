package X;

import java.util.ListIterator;

/* JADX INFO: renamed from: X.12ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19882512ql<F, T> extends AbstractC19882412qk<F, T> implements ListIterator<T> {
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.LL).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.LL).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) LIZ(((ListIterator) this.LL).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.LL).previousIndex();
    }

    public AbstractC19882512ql(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
