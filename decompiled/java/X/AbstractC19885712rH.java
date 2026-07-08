package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19885712rH<E> extends AbstractC19885812rI<E> implements List<E>, RandomAccess {
    public static final C19886212rM LLILLJJLI = new C19886212rM(C19886012rK.LLILZIL, 0);

    @Override // X.AbstractC19885812rI, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC19885812rI
    /* JADX INFO: renamed from: zza */
    public final C08CV<E> iterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC19885812rI
    public final AbstractC19885712rH<E> zze() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public static <E> AbstractC19885712rH<E> zzi() {
        return C19886012rK.LLILZIL;
    }

    public static <E> AbstractC19885712rH<E> zzj(Collection<? extends E> collection) {
        if (collection instanceof AbstractC19885812rI) {
            AbstractC19885712rH<E> abstractC19885712rHZze = ((AbstractC19885812rI) collection).zze();
            if (abstractC19885712rHZze.LJIIIIZZ()) {
                Object[] array = abstractC19885712rHZze.toArray();
                int length = array.length;
                if (length == 0) {
                    return C19886012rK.LLILZIL;
                }
                return new C19886012rK(length, array);
            }
            return abstractC19885712rHZze;
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        for (int i = 0; i < length2; i++) {
            if (array2[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        if (length2 == 0) {
            return C19886012rK.LLILZIL;
        }
        return new C19886012rK(length2, array2);
    }

    @Override // X.AbstractC19885812rI
    public void LJIIIZ(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        E next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = ListProtector.get(this, i);
                        Object obj3 = ListProtector.get(list, i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator<E> it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it3.hasNext() || ((next = it2.next()) != (next2 = it3.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it3.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(ListProtector.get(this, i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(ListProtector.get(this, size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final C08CW<E> listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return LLILLJJLI;
            }
            return new C19886212rM(this, i);
        }
        throw new IndexOutOfBoundsException(C19863612ni.LIZJ(i, size, "index"));
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
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public AbstractC19885712rH<E> subList(final int i, int i2) {
        C19863612ni.LIZIZ(i, i2, size());
        final int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C19886012rK.LLILZIL;
        }
        return new AbstractC19885712rH(i, i3) { // from class: X.12rL
            public final transient int LLILLL;
            public final transient int LLILZ;

            @Override // X.AbstractC19885812rI
            public final Object[] LIZJ() {
                return this.LLILZIL.LIZJ();
            }

            @Override // X.AbstractC19885812rI
            public final int LJ() {
                return this.LLILZIL.LJ() + this.LLILLL;
            }

            @Override // X.AbstractC19885812rI
            public final int LJFF() {
                return this.LLILZIL.LJ() + this.LLILLL + this.LLILZ;
            }

            @Override // X.AbstractC19885812rI
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILZ;
            }

            @Override // java.util.List
            public final Object get(int i4) {
                C19863612ni.LIZ(i4, this.LLILZ);
                return this.LLILZIL.get(i4 + this.LLILLL);
            }

            @Override // X.AbstractC19885712rH, java.util.List
            public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
                return subList(i4, i5);
            }

            @Override // X.AbstractC19885712rH
            /* JADX INFO: renamed from: zzh */
            public final AbstractC19885712rH subList(int i4, int i5) {
                C19863612ni.LIZIZ(i4, i5, this.LLILZ);
                AbstractC19885712rH abstractC19885712rH = this.LLILZIL;
                int i6 = this.LLILLL;
                return abstractC19885712rH.subList(i4 + i6, i5 + i6);
            }

            {
                this.LLILLL = i;
                this.LLILZ = i3;
            }
        };
    }
}
