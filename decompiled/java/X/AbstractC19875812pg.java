package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: X.12pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19875812pg<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] LL = new Object[0];

    public Object[] LJ() {
        return null;
    }

    public abstract boolean LJIIIZ();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC19853312m3<E> iterator();

    public int LJFF() {
        throw new UnsupportedOperationException();
    }

    public int LJIIIIZZ() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(LL);
    }

    public Object writeReplace() {
        return new C19876612po(toArray());
    }

    public AbstractC19875512pd<E> asList() {
        if (isEmpty()) {
            return AbstractC19875512pd.of();
        }
        Object[] array = toArray();
        C19864812nu c19864812nu = AbstractC19875512pd.LLILLJJLI;
        return AbstractC19875512pd.LJIIJ(array.length, array);
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
        if (tArr.length < size) {
            Object[] objArrLJ = LJ();
            if (objArrLJ != null) {
                return (T[]) Arrays.copyOfRange(objArrLJ, LJIIIIZZ(), LJFF(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        LIZJ(0, tArr);
        return tArr;
    }

    public int LIZJ(int i, Object[] objArr) {
        AbstractC19853312m3<E> it2 = iterator();
        while (it2.hasNext()) {
            objArr[i] = it2.next();
            i++;
        }
        return i;
    }
}
