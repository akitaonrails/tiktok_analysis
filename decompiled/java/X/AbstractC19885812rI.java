package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: X.12rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19885812rI<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] LL = new Object[0];

    public Object[] LIZJ() {
        throw null;
    }

    public int LJ() {
        throw null;
    }

    public int LJFF() {
        throw null;
    }

    public abstract boolean LJIIIIZZ();

    public void LJIIIZ(Object[] objArr) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract C08CV<E> iterator();

    public AbstractC19885712rH<E> zze() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(LL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] objArrLIZJ = LIZJ();
            if (objArrLIZJ == null) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            } else {
                return (T[]) Arrays.copyOfRange(objArrLIZJ, LJ(), LJFF(), tArr.getClass());
            }
        } else if (length > size) {
            tArr[size] = null;
        }
        LJIIIZ(tArr);
        return tArr;
    }
}
