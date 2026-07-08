package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680980tqS extends AbstractC1680990tqT implements List<C0NUU>, C03W4 {
    public final List<C0NUU> LLILLJJLI;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, C0NUU c0nuu) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends C0NUU> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends C0NUU> collection) {
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
        return this.LLILLJJLI.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLJJLI.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<C0NUU> iterator() {
        return this.LLILLJJLI.iterator();
    }

    @Override // java.util.List
    public final ListIterator<C0NUU> listIterator() {
        return this.LLILLJJLI.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<C0NUU> listIterator(int i) {
        return this.LLILLJJLI.listIterator(i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C0NUU remove(int i) {
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
    public final void replaceAll(UnaryOperator<C0NUU> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C0NUU set(int i, C0NUU c0nuu) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super C0NUU> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<C0NUU> subList(int i, int i2) {
        return this.LLILLJJLI.subList(i, i2);
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
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LLILLJJLI.size();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FontListFontFamily(fonts=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1680980tqS(List<? extends C0NUU> list) {
        this.LLILLJJLI = list;
        if (!(!list.isEmpty())) {
            C1681000tqU.LIZJ("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C0NUU)) {
            return false;
        }
        return this.LLILLJJLI.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1680980tqS) && Intrinsics.LJFF(this.LLILLJJLI, ((C1680980tqS) obj).LLILLJJLI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0NUU, java.lang.Object] */
    @Override // java.util.List
    public final C0NUU get(int i) {
        return ListProtector.get(this.LLILLJJLI, i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof C0NUU)) {
            return -1;
        }
        return this.LLILLJJLI.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C0NUU)) {
            return -1;
        }
        return this.LLILLJJLI.lastIndexOf(obj);
    }
}
