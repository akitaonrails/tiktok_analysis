package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0j0B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264170j0B implements List<C14ZJ>, InterfaceC1687470u0v {
    public final List<C14ZJ> LL;

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends C14ZJ> collection) {
        return this.LL.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends C14ZJ> collection) {
        return this.LL.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.LL.clear();
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
    public final Iterator<C14ZJ> iterator() {
        return this.LL.iterator();
    }

    @Override // java.util.List
    public final ListIterator<C14ZJ> listIterator() {
        return this.LL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<C14ZJ> listIterator(int i) {
        return this.LL.listIterator(i);
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
    public final List<C14ZJ> subList(int i, int i2) {
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

    public C1264170j0B(List<C14ZJ> list) {
        this.LL = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.LL.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C14ZJ)) {
            return false;
        }
        return this.LL.contains(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.14ZJ, java.lang.Object] */
    @Override // java.util.List
    public final C14ZJ get(int i) {
        return ListProtector.get(this.LL, i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof C14ZJ)) {
            return -1;
        }
        return this.LL.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C14ZJ)) {
            return -1;
        }
        return this.LL.lastIndexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof C14ZJ)) {
            return false;
        }
        return this.LL.remove(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.14ZJ, java.lang.Object] */
    @Override // java.util.List
    public final C14ZJ remove(int i) {
        return ListProtector.remove(this.LL, i);
    }

    @Override // java.util.List
    public final void add(int i, C14ZJ c14zj) {
        ListProtector.add(this.LL, i, c14zj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.14ZJ, java.lang.Object] */
    @Override // java.util.List
    public final C14ZJ set(int i, C14ZJ c14zj) {
        return ListProtector.set(this.LL, i, c14zj);
    }
}
