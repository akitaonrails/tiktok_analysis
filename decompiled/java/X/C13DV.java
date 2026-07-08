package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13DV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DV<E> extends C13DZ<E> implements RandomAccess, Serializable {
    public static final C13DV LL;
    public E[] backing;
    public boolean isReadOnly;
    public int length;

    public C13DV() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    static {
        C13DV c13dv = new C13DV(0);
        c13dv.isReadOnly = true;
        LL = c13dv;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new C13DI(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void LIZJ() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        E[] eArr = this.backing;
        int i = this.length;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            E e = eArr[i2];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.backing;
        int i = this.length;
        C1691430u7J.LIZ(i, eArr.length);
        return Arrays.copyOfRange(eArr, 0, i);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return C08EC.LIZLLL(this.backing, 0, this.length, this);
    }

    public final List<E> build() {
        LIZJ();
        this.isReadOnly = true;
        return this.length > 0 ? this : LL;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        LIZJ();
        removeRangeInternal(0, this.length);
    }

    @Override // X.C13DZ
    public int getSize() {
        return this.length;
    }

    public C13DV(int i) {
        this.backing = (E[]) C08EC.LIZ(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        LIZJ();
        addAtInternal(this.length, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        LIZJ();
        int size = collection.size();
        addAllInternal(this.length, collection, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!C08EC.LIZJ(this.backing, 0, this.length, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        return this.backing[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.LJFF(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.LJFF(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, i2);
        return new C13DY(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        LIZJ();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        LIZJ();
        if (retainOrRemoveAllInternal(0, this.length, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C13DZ
    public E removeAt(int i) {
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        return removeAtInternal(i);
    }

    public final E removeAtInternal(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.backing;
        E e = eArr[i];
        int i2 = i + 1;
        System.arraycopy(eArr, i2, eArr, i, this.length - i2);
        E[] eArr2 = this.backing;
        int i3 = this.length - 1;
        eArr2[i3] = null;
        this.length = i3;
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        LIZJ();
        if (retainOrRemoveAllInternal(0, this.length, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.length;
        if (length < i) {
            return (T[]) Arrays.copyOfRange(this.backing, 0, i, tArr.getClass());
        }
        System.arraycopy(this.backing, 0, tArr, 0, i);
        int i2 = this.length;
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public final void LJ(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 >= 0) {
            E[] eArr = this.backing;
            if (i3 > eArr.length) {
                C19973713Db c19973713Db = AbstractC19974313Dh.LL;
                int length = eArr.length;
                c19973713Db.getClass();
                this.backing = (E[]) Arrays.copyOf(this.backing, C19973713Db.LJ(length, i3));
            }
            E[] eArr2 = this.backing;
            System.arraycopy(eArr2, i, eArr2, i + i2, this.length - i);
            this.length += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, i2);
        addAtInternal(i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, i2);
        int size = collection.size();
        addAllInternal(i, collection, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    public final void addAtInternal(int i, E e) {
        ((AbstractList) this).modCount++;
        LJ(i, 1);
        this.backing[i] = e;
    }

    public final void removeRangeInternal(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.backing;
        int i3 = i + i2;
        System.arraycopy(eArr, i3, eArr, i, this.length - i3);
        E[] eArr2 = this.backing;
        int i4 = this.length;
        C08EC.LIZIZ(i4 - i2, i4, eArr2);
        this.length -= i2;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        E[] eArr = this.backing;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i3 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZLLL(i, i2, i3);
        return new C13DW(this.backing, i, i2 - i, null, this);
    }

    public /* synthetic */ C13DV(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        LJ(i, i2);
        Iterator<? extends E> it2 = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it2.next();
        }
    }

    public final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.backing[i5]) == z) {
                E[] eArr = this.backing;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.backing;
        int i7 = i2 + i;
        System.arraycopy(eArr2, i7, eArr2, i + i4, this.length - i7);
        E[] eArr3 = this.backing;
        int i8 = this.length;
        C08EC.LIZIZ(i8 - i6, i8, eArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= i6;
        return i6;
    }
}
