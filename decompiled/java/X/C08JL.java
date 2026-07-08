package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: X.08JL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JL<T> implements Collection<T>, C03W4 {
    public final int LL;
    public final LinkedList<T> LLILLJJLI = new LinkedList<>();
    public final Set<T> LLILLL = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super T> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.LLILLJJLI.clear();
        this.LLILLL.clear();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLJJLI.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.LLILLJJLI.iterator();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LLILLJJLI.size();
    }

    public C08JL(int i) {
        this.LL = i;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.LLILLL.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.LLILLL.containsAll(collection);
    }
}
