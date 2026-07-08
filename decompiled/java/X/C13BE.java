package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13BE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i(with = C19980613Fs.class)
public final class C13BE extends AbstractC19979113Fd implements List<AbstractC19979113Fd>, C03W4 {
    public static final C13BF Companion = new Object() { // from class: X.13BF
        public final C13HG<C13BE> serializer() {
            return C19980613Fs.LIZ;
        }
    };
    public final List<AbstractC19979113Fd> LL;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC19979113Fd abstractC19979113Fd) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC19979113Fd> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends AbstractC19979113Fd> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.LL.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<AbstractC19979113Fd> iterator() {
        return this.LL.iterator();
    }

    @Override // java.util.List
    public final ListIterator<AbstractC19979113Fd> listIterator() {
        return this.LL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<AbstractC19979113Fd> listIterator(int i) {
        return this.LL.listIterator(i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd remove(int i) {
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

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC19979113Fd> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd set(int i, AbstractC19979113Fd abstractC19979113Fd) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC19979113Fd> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC19979113Fd> subList(int i, int i2) {
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
    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LL.size();
    }

    public final String toString() {
        return C13LP.LJJLIIIJ(this.LL, ",", e3.e, e3.f, 0, null, null, 56);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13BE(List<? extends AbstractC19979113Fd> list) {
        this.LL = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC19979113Fd)) {
            return false;
        }
        return this.LL.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return Intrinsics.LJFF(this.LL, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.13Fd, java.lang.Object] */
    @Override // java.util.List
    public final AbstractC19979113Fd get(int i) {
        return ListProtector.get(this.LL, i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC19979113Fd)) {
            return -1;
        }
        return this.LL.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC19979113Fd)) {
            return -1;
        }
        return this.LL.lastIndexOf(obj);
    }
}
