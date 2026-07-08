package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19875512pd<E> extends AbstractC19875812pg<E> implements List<E>, RandomAccess {
    public static final C19864812nu LLILLJJLI = new C19864812nu(C19865012nw.LLILZIL, 0);

    @Override // X.AbstractC19875812pg
    public final AbstractC19875512pd<E> asList() {
        return this;
    }

    @Override // java.util.List
    public AbstractC19864112nn<E> listIterator() {
        return listIterator(0);
    }

    public static <E> C19876312pl<E> builder() {
        return new C19876312pl<>();
    }

    @Override // X.AbstractC19875812pg
    public Object writeReplace() {
        return new C19876612po(toArray());
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC19853312m3<E> iterator() {
        return listIterator();
    }

    public AbstractC19875512pd<E> reverse() {
        return size() <= 1 ? this : new AbstractC19875512pd<E>(this) { // from class: X.12ph
            public final transient AbstractC19875512pd<E> LLILLL;

            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return this.LLILLL.LJIIIZ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILLL.size();
            }

            @Override // X.AbstractC19875512pd, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return super.iterator();
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator() {
                return super.listIterator();
            }

            @Override // X.AbstractC19875512pd
            public final AbstractC19875512pd<E> reverse() {
                return this.LLILLL;
            }

            {
                this.LLILLL = this;
            }

            @Override // X.AbstractC19875512pd, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LLILLL.contains(obj);
            }

            @Override // java.util.List
            public final E get(int i) {
                C19864312np.LJFF(i, size());
                return this.LLILLL.get((size() - 1) - i);
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final int indexOf(Object obj) {
                int iLastIndexOf = this.LLILLL.lastIndexOf(obj);
                if (iLastIndexOf < 0) {
                    return -1;
                }
                return (size() - 1) - iLastIndexOf;
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final int lastIndexOf(Object obj) {
                int iIndexOf = this.LLILLL.indexOf(obj);
                if (iIndexOf < 0) {
                    return -1;
                }
                return (size() - 1) - iIndexOf;
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
                return super.listIterator(i);
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final AbstractC19875512pd<E> subList(int i, int i2) {
                C19864312np.LJIIIZ(i, i2, size());
                return this.LLILLL.subList(size() - i2, size() - i).reverse();
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
                return subList(i, i2);
            }
        };
    }

    public static <E> AbstractC19875512pd<E> of() {
        return C19865012nw.LLILZIL;
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> C19876312pl<E> builderWithExpectedSize(int i) {
        C19863912nl.LIZIZ(i, "expectedSize");
        return new C19876312pl<>(i);
    }

    public static <E> AbstractC19875512pd<E> copyOf(Iterator<? extends E> it2) {
        if (!it2.hasNext()) {
            return of();
        }
        E next = it2.next();
        if (!it2.hasNext()) {
            return of((Object) next);
        }
        C19876312pl c19876312pl = new C19876312pl();
        c19876312pl.LIZLLL(next);
        while (it2.hasNext()) {
            c19876312pl.LIZ(it2.next());
        }
        return c19876312pl.LJI();
    }

    public static <E> AbstractC19875512pd<E> of(E e) {
        Object[] objArr = {e};
        C1702230uOj.LIZ(1, objArr);
        return LJIIJ(1, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> AbstractC19875512pd<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Collection arrayList;
        Comparable[] comparableArr = new Comparable[0];
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<? extends E> it2 = iterable.iterator();
            arrayList = new ArrayList();
            C19867212oI.LIZ(arrayList, it2);
        }
        Comparable[] comparableArr2 = (Comparable[]) arrayList.toArray(comparableArr);
        C1702230uOj.LIZ(comparableArr2.length, comparableArr2);
        Arrays.sort(comparableArr2);
        return LJIIJ(comparableArr2.length, comparableArr2);
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C19837412jU.LIZ(ListProtector.get(this, i), ListProtector.get(list, i))) {
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator<E> it3 = list.iterator();
                while (it2.hasNext()) {
                    if (!it3.hasNext() || !C19837412jU.LIZ(it2.next(), it3.next())) {
                    }
                }
                return !it3.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(ListProtector.get(this, i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(ListProtector.get(this, size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public AbstractC19864112nn<E> listIterator(int i) {
        C19864312np.LJIIIIZZ(i, size());
        if (isEmpty()) {
            return LLILLJJLI;
        }
        return new C19864812nu(this, i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC19875512pd<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof AbstractC19875812pg) {
            AbstractC19875512pd<E> abstractC19875512pdAsList = ((AbstractC19875812pg) collection).asList();
            if (abstractC19875512pdAsList.LJIIIZ()) {
                Object[] array = abstractC19875512pdAsList.toArray();
                return LJIIJ(array.length, array);
            }
            return abstractC19875512pdAsList;
        }
        Object[] array2 = collection.toArray();
        C1702230uOj.LIZ(array2.length, array2);
        return LJIIJ(array2.length, array2);
    }

    public static <E> AbstractC19875512pd<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        Object[] objArr = (Object[]) eArr.clone();
        C1702230uOj.LIZ(objArr.length, objArr);
        return LJIIJ(objArr.length, objArr);
    }

    public static <E> AbstractC19875512pd<E> copyOf(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static AbstractC19875512pd LJIIJ(int i, Object[] objArr) {
        if (i == 0) {
            return of();
        }
        return new C19865012nw(i, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2) {
        Object[] objArr = {e, e2};
        C1702230uOj.LIZ(2, objArr);
        return LJIIJ(2, objArr);
    }

    public static <E> AbstractC19875512pd<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection arrayList;
        comparator.getClass();
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<? extends E> it2 = iterable.iterator();
            arrayList = new ArrayList();
            C19867212oI.LIZ(arrayList, it2);
        }
        Object[] array = arrayList.toArray();
        C1702230uOj.LIZ(array.length, array);
        Arrays.sort(array, comparator);
        return LJIIJ(array.length, array);
    }

    @Override // X.AbstractC19875812pg
    public int LIZJ(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public AbstractC19875512pd<E> subList(final int i, int i2) {
        C19864312np.LJIIIZ(i, i2, size());
        final int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return new AbstractC19875512pd<E>(i, i3) { // from class: X.12pi
            public final transient int LLILLL;
            public final transient int LLILZ;

            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // X.AbstractC19875812pg
            public final Object[] LJ() {
                return this.LLILZIL.LJ();
            }

            @Override // X.AbstractC19875812pg
            public final int LJFF() {
                return this.LLILZIL.LJIIIIZZ() + this.LLILLL + this.LLILZ;
            }

            @Override // X.AbstractC19875812pg
            public final int LJIIIIZZ() {
                return this.LLILZIL.LJIIIIZZ() + this.LLILLL;
            }

            @Override // X.AbstractC19875512pd, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return super.iterator();
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator() {
                return super.listIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILZ;
            }

            @Override // java.util.List
            public final E get(int i4) {
                C19864312np.LJFF(i4, this.LLILZ);
                return this.LLILZIL.get(i4 + this.LLILLL);
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
                return super.listIterator(i4);
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final AbstractC19875512pd<E> subList(int i4, int i5) {
                C19864312np.LJIIIZ(i4, i5, this.LLILZ);
                AbstractC19875512pd abstractC19875512pd = this.LLILZIL;
                int i6 = this.LLILLL;
                return abstractC19875512pd.subList(i4 + i6, i5 + i6);
            }

            @Override // X.AbstractC19875512pd, java.util.List
            public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
                return subList(i4, i5);
            }

            {
                this.LLILLL = i;
                this.LLILZ = i3;
            }
        };
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3) {
        Object[] objArr = {e, e2, e3};
        C1702230uOj.LIZ(3, objArr);
        return LJIIJ(3, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4) {
        Object[] objArr = {e, e2, e3, e4};
        C1702230uOj.LIZ(4, objArr);
        return LJIIJ(4, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        C1702230uOj.LIZ(5, objArr);
        return LJIIJ(5, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        C1702230uOj.LIZ(6, objArr);
        return LJIIJ(6, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7};
        C1702230uOj.LIZ(7, objArr);
        return LJIIJ(7, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8};
        C1702230uOj.LIZ(8, objArr);
        return LJIIJ(8, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9};
        C1702230uOj.LIZ(9, objArr);
        return LJIIJ(9, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        C1702230uOj.LIZ(10, objArr);
        return LJIIJ(10, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11};
        C1702230uOj.LIZ(11, objArr);
        return LJIIJ(11, objArr);
    }

    public static <E> AbstractC19875512pd<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LIZLLL("the total number of elements must fit in an int", z);
        int length = eArr.length + 12;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        C1702230uOj.LIZ(length, objArr);
        return LJIIJ(length, objArr);
    }
}
