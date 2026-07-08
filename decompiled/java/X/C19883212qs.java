package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.12qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19883212qs<E> implements Set<E> {
    public final InterfaceC19883512qv LL;
    public final Set<E> LLILLJJLI;

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ((C19915712w7) this.LL).LIZIZ();
        this.LLILLJJLI.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLJJLI.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C19883412qu(this.LL, this.LLILLJJLI.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.LLILLJJLI.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.LLILLJJLI.toArray();
    }

    public final String toString() {
        return this.LLILLJJLI.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(E e) {
        ((C19915712w7) this.LL).LIZIZ();
        return this.LLILLJJLI.add(e);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        ((C19915712w7) this.LL).LIZIZ();
        return this.LLILLJJLI.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LLILLJJLI.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.LLILLJJLI.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return this.LLILLJJLI.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        ((C19915712w7) this.LL).LIZIZ();
        return this.LLILLJJLI.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        ((C19915712w7) this.LL).LIZIZ();
        return this.LLILLJJLI.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        ((C19915712w7) this.LL).LIZIZ();
        return this.LLILLJJLI.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.LLILLJJLI.toArray(tArr);
    }

    public C19883212qs(InterfaceC19883512qv interfaceC19883512qv, Set<E> set) {
        this.LL = interfaceC19883512qv;
        this.LLILLJJLI = set;
    }
}
