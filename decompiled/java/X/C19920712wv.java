package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19920712wv extends AbstractList<String> implements InterfaceC19921312x1, RandomAccess {
    public final InterfaceC19921312x1 LL;

    @Override // X.InterfaceC19921312x1
    public final InterfaceC19921312x1 LJJJ() {
        return this;
    }

    @Override // X.InterfaceC19921312x1
    public final List<?> LJJJJJ() {
        return this.LL.LJJJJJ();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new Iterator<String>(this) { // from class: X.12wx
            public final Iterator<String> LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL.hasNext();
            }

            @Override // java.util.Iterator
            public final String next() {
                return this.LL.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            {
                this.LL = this.LL.iterator();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LL.size();
    }

    public C19920712wv(InterfaceC19921312x1 interfaceC19921312x1) {
        this.LL = interfaceC19921312x1;
    }

    @Override // X.InterfaceC19921312x1
    public final Object LJJJLL(int i) {
        return this.LL.LJJJLL(i);
    }

    @Override // X.InterfaceC19921312x1
    public final void LJL(AbstractC19922812xG abstractC19922812xG) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.LL.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(final int i) {
        return new ListIterator<String>(this, i) { // from class: X.12ww
            public final ListIterator<String> LL;

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.LL.hasNext();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.LL.hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final Object next() {
                return this.LL.next();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.LL.nextIndex();
            }

            @Override // java.util.ListIterator
            public final String previous() {
                return this.LL.previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.LL.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public final void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public final void set(String str) {
                throw new UnsupportedOperationException();
            }

            {
                this.LL = this.LL.listIterator(i);
            }
        };
    }
}
