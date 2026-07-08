package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19882912qp<E> extends C08J6 implements Collection<E> {
    @Override // X.C08J6
    /* JADX INFO: renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> LJIIL();

    @Override // java.util.Collection
    public void clear() {
        LJIIL().clear();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return LJIIL().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return LJIIL().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return LJIIL().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return LJIIL().toArray();
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        return LJIIL().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return LJIIL().addAll(collection);
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return LJIIL().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return LJIIL().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return LJIIL().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return LJIIL().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return LJIIL().retainAll(collection);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) LJIIL().toArray(tArr);
    }
}
