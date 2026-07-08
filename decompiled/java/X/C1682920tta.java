package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: X.0tta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682920tta implements List<InterfaceC1690590u5x>, C03W4 {
    public final List<InterfaceC1690590u5x> LL = new C13ES();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, InterfaceC1690590u5x interfaceC1690590u5x) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends InterfaceC1690590u5x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends InterfaceC1690590u5x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return this.LL.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC1690590u5x> iterator() {
        return this.LL.iterator();
    }

    @Override // java.util.List
    public final ListIterator<InterfaceC1690590u5x> listIterator() {
        return this.LL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<InterfaceC1690590u5x> listIterator(int i) {
        return this.LL.listIterator(i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC1690590u5x remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<InterfaceC1690590u5x> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC1690590u5x set(int i, InterfaceC1690590u5x interfaceC1690590u5x) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super InterfaceC1690590u5x> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<InterfaceC1690590u5x> subList(int i, int i2) {
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

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC1690590u5x)) {
            return false;
        }
        return this.LL.contains(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0u5x, java.lang.Object] */
    @Override // java.util.List
    public final InterfaceC1690590u5x get(int i) {
        return ListProtector.get(this.LL, i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC1690590u5x)) {
            return -1;
        }
        return this.LL.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC1690590u5x)) {
            return -1;
        }
        return this.LL.lastIndexOf(obj);
    }
}
