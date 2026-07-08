package X;

import Y.AObjectS109S0000000_3;
import Y.AObjectS347S0100000_3;
import com.google.gson.h;
import com.google.gson.k;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.07ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1934307ht implements List<Object>, C03W4 {
    public final h LL;

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Object> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Object> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C1930307hF(this);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return new C1934407hu(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    public C1934307ht(h hVar) {
        this.LL = hVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List
    public final Object get(int i) {
        k kVarLJJIIJZLJL = this.LL.LJJIIJZLJL(i);
        if (kVarLJJIIJZLJL != null) {
            return C1931407hQ.LIZ(kVarLJJIIJZLJL);
        }
        return null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i) {
        return new C1934407hu(this, i);
    }

    @Override // java.util.List
    public final List<Object> subList(int i, int i2) {
        return C09RB.LJJII(new C08LY(new C08LY(new C08QU(new C2083008Ea(C09R4.LIZIZ(this.LL.iterator())), true, new AObjectS347S0100000_3(new C1930407hG(i, i2), 1)), new AObjectS109S0000000_3(8)), AFwS231S0000000_3.get$arr$(253)));
    }
}
