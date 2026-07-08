package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19882112qh<T> extends AbstractList<T> {
    public final List<T> LL;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    public C19882112qh(List<T> list) {
        list.getClass();
        this.LL = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        List<T> list = this.LL;
        int size = size();
        C19864312np.LJFF(i, size);
        return (T) ListProtector.get(list, (size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        int size = size();
        C19864312np.LJIIIIZZ(i, size);
        final ListIterator<T> listIterator = this.LL.listIterator(size - i);
        return new ListIterator<T>() { // from class: X.12qm
            public boolean LL;

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return listIterator.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return listIterator.hasNext();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                C19882112qh c19882112qh = this.LLILLL;
                int iNextIndex = listIterator.nextIndex();
                int size2 = c19882112qh.size();
                C19864312np.LJIIIIZZ(iNextIndex, size2);
                return size2 - iNextIndex;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                C19863912nl.LIZJ(this.LL);
                listIterator.remove();
                this.LL = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.LL = true;
                return (T) listIterator.previous();
            }

            @Override // java.util.ListIterator
            public final T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.LL = true;
                return (T) listIterator.next();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator
            public final void add(T t) {
                listIterator.add(t);
                listIterator.previous();
                this.LL = false;
            }

            @Override // java.util.ListIterator
            public final void set(T t) {
                C19864312np.LJIILJJIL(this.LL);
                listIterator.set(t);
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        List<T> list = this.LL;
        int size = size();
        C19864312np.LJFF(i, size);
        return (T) ListProtector.remove(list, (size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        List<T> list = this.LL;
        int size = size();
        C19864312np.LJIIIIZZ(i, size);
        ListProtector.add(list, size - i, t);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        List<T> list = this.LL;
        int size = size();
        C19864312np.LJFF(i, size);
        return (T) ListProtector.set(list, (size - 1) - i, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<T> subList(int i, int i2) {
        C19864312np.LJIIIZ(i, i2, size());
        List<T> list = this.LL;
        int size = size();
        C19864312np.LJIIIIZZ(i2, size);
        int size2 = size();
        C19864312np.LJIIIIZZ(i, size2);
        return C19881612qc.LIZJ(list.subList(size - i2, size2 - i));
    }
}
