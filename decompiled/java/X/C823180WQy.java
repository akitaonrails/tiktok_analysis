package X;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823180WQy<E> extends AbstractSet<E> implements Set<E> {
    public final Map<E, Boolean> LL;
    public final transient Set<E> LLILLJJLI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ((ConcurrentHashMap) this.LL).clear();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return ((ConcurrentHashMap) this.LL).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.LLILLJJLI.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((ConcurrentHashMap) this.LL).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return this.LLILLJJLI.toArray();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.LLILLJJLI.toString();
    }

    public C823180WQy() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LL = concurrentHashMap;
        this.LLILLJJLI = concurrentHashMap.keySet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        if (((ConcurrentHashMap) this.LL).put(e, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ((ConcurrentHashMap) this.LL).containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.LLILLJJLI.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this && !this.LLILLJJLI.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (((ConcurrentHashMap) this.LL).remove(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        return this.LLILLJJLI.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        return this.LLILLJJLI.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.LLILLJJLI.toArray(tArr);
    }
}
