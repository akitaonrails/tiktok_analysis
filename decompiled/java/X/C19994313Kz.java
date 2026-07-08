package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.13Kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19994313Kz<T> implements List<T>, InterfaceC1687470u0v {
    public final LinkedList<T> LL;

    @Override // java.util.List
    public final void add(int i, T t) {
        this.LL.add(i, t);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return this.LL.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return this.LL.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LL.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.LL.containsAll(collection);
    }

    @Override // java.util.List
    public final T get(int i) {
        return this.LL.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.LL.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.LL.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.LL.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return this.LL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return this.LL.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LL.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.LL.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.LL.retainAll(collection);
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        return this.LL.set(i, t);
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        return this.LL.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LL.size();
    }

    public C19994313Kz(LinkedList linkedList) {
        this.LL = linkedList;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        if (this.LL.isEmpty()) {
            this.LL.add(t);
            return true;
        }
        ListIterator<T> listIterator = this.LL.listIterator();
        while (listIterator.hasNext()) {
            if (C13L0.LL.compare(t, listIterator.next()) < 0 && listIterator.hasPrevious()) {
                listIterator.previous();
                listIterator.add(t);
                return true;
            }
        }
        this.LL.add(t);
        return true;
    }

    @Override // java.util.List
    public final T remove(int i) {
        return this.LL.remove(i);
    }
}
