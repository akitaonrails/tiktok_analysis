package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: X.0f3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112580f3g<E> extends ArrayList<E> implements Queue<E> {
    public final int LL;
    public final Comparator<? super E> LLILLJJLI;
    public boolean LLILLL;

    @Override // java.util.Queue
    public E poll() {
        return remove(0);
    }

    @Override // java.util.Queue
    public E element() {
        E ePeek = peek();
        if (ePeek != null) {
            return ePeek;
        }
        throw new NoSuchElementException();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final boolean isFull() {
        return size() == this.LL;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return remove(size() - 1);
    }

    @Override // java.util.Queue
    public E remove() {
        E ePoll = poll();
        if (ePoll != null) {
            return ePoll;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final int getCapacity() {
        return this.LL;
    }

    public final boolean getEnableSort() {
        return this.LLILLL;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Queue
    public boolean add(E e) {
        return offer(e);
    }

    public final int getIndex(E e) {
        if (isEmpty()) {
            return 0;
        }
        if (!this.LLILLL) {
            if (isFull()) {
                return -1;
            }
            return size() - 1;
        }
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Comparator<? super E> comparator = this.LLILLJJLI;
            if (comparator != null && comparator.compare(e, get(i2)) > 0) {
                return i2;
            }
            i++;
        }
        if (i >= this.LL) {
            return -1;
        }
        return i;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return insertAt(e, getIndex(e));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void setEnableSort(boolean z) {
        this.LLILLL = z;
    }

    public C1112580f3g(int i, Comparator<? super E> comparator) {
        super(i);
        this.LL = i;
        this.LLILLJJLI = comparator;
        this.LLILLL = true;
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        super.add(i, e);
        if (size() > this.LL) {
            pollLast();
        }
    }

    public final boolean insertAt(E e, int i) {
        if (i < 0) {
            return false;
        }
        add(i, e);
        return true;
    }

    public final E putToIndex(int i, E e) {
        super.add(i, e);
        if (size() > this.LL) {
            return pollLast();
        }
        return null;
    }
}
