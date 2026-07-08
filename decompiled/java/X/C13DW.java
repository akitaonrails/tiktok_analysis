package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13DW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DW<E> extends C13DZ<E> implements RandomAccess, Serializable {
    public final C13DW<E> LL;
    public E[] backing;
    public int length;
    public final int offset;
    public final C13DV<E> root;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.root.isReadOnly) {
            return new C13DI(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void LIZJ() {
        if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void LJ() {
        if (this.root.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        LJ();
        LIZJ();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // X.C13DZ
    public int getSize() {
        LIZJ();
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        LIZJ();
        E[] eArr = this.backing;
        int i = this.offset;
        int i2 = this.length;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            E e = eArr[i + i3];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        LIZJ();
        return this.length == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        LIZJ();
        E[] eArr = this.backing;
        int i = this.offset;
        int i2 = this.length + i;
        C1691430u7J.LIZ(i2, eArr.length);
        return Arrays.copyOfRange(eArr, i, i2);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        LIZJ();
        return C08EC.LIZLLL(this.backing, this.offset, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        LJ();
        LIZJ();
        addAtInternal(this.offset + this.length, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        LJ();
        LIZJ();
        int size = collection.size();
        addAllInternal(this.offset + this.length, collection, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        LIZJ();
        if (obj != this) {
            if (obj instanceof List) {
                if (C08EC.LIZJ(this.backing, this.offset, this.length, (List) obj)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        return this.backing[this.offset + i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        LIZJ();
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.LJFF(this.backing[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        LIZJ();
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.LJFF(this.backing[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, i2);
        return new C13DX(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        LJ();
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
        LJ();
        LIZJ();
        if (retainOrRemoveAllInternal(this.offset, this.length, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C13DZ
    public E removeAt(int i) {
        LJ();
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        return removeAtInternal(this.offset + i);
    }

    public final E removeAtInternal(int i) {
        E eRemoveAtInternal;
        ((AbstractList) this).modCount++;
        C13DW<E> c13dw = this.LL;
        if (c13dw != null) {
            eRemoveAtInternal = c13dw.removeAtInternal(i);
        } else {
            eRemoveAtInternal = this.root.removeAtInternal(i);
        }
        this.length--;
        return eRemoveAtInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        LJ();
        LIZJ();
        if (retainOrRemoveAllInternal(this.offset, this.length, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        LIZJ();
        int length = tArr.length;
        int i = this.length;
        if (length < i) {
            E[] eArr = this.backing;
            int i2 = this.offset;
            return (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
        }
        E[] eArr2 = this.backing;
        int i3 = this.offset;
        System.arraycopy(eArr2, i3, tArr, 0, (i + i3) - i3);
        int i4 = this.length;
        if (i4 < tArr.length) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        LJ();
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, i2);
        addAtInternal(this.offset + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        LJ();
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, i2);
        int size = collection.size();
        addAllInternal(this.offset + i, collection, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    public final void addAtInternal(int i, E e) {
        ((AbstractList) this).modCount++;
        C13DW<E> c13dw = this.LL;
        if (c13dw != null) {
            c13dw.addAtInternal(i, e);
        } else {
            this.root.addAtInternal(i, e);
        }
        this.backing = this.root.backing;
        this.length++;
    }

    public final void removeRangeInternal(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C13DW<E> c13dw = this.LL;
        if (c13dw != null) {
            c13dw.removeRangeInternal(i, i2);
        } else {
            this.root.removeRangeInternal(i, i2);
        }
        this.length -= i2;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        LJ();
        LIZJ();
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        E[] eArr = this.backing;
        int i3 = this.offset + i;
        E e2 = eArr[i3];
        eArr[i3] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i3 = this.length;
        c19973713Db.getClass();
        C19973713Db.LIZLLL(i, i2, i3);
        return new C13DW(this.backing, this.offset + i, i2 - i, this, this.root);
    }

    public final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        C13DW<E> c13dw = this.LL;
        if (c13dw != null) {
            c13dw.addAllInternal(i, collection, i2);
        } else {
            this.root.addAllInternal(i, collection, i2);
        }
        this.backing = this.root.backing;
        this.length += i2;
    }

    public final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
        int iRetainOrRemoveAllInternal;
        C13DW<E> c13dw = this.LL;
        if (c13dw != null) {
            iRetainOrRemoveAllInternal = c13dw.retainOrRemoveAllInternal(i, i2, collection, z);
        } else {
            iRetainOrRemoveAllInternal = this.root.retainOrRemoveAllInternal(i, i2, collection, z);
        }
        if (iRetainOrRemoveAllInternal > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= iRetainOrRemoveAllInternal;
        return iRetainOrRemoveAllInternal;
    }

    public C13DW(E[] eArr, int i, int i2, C13DW<E> c13dw, C13DV<E> c13dv) {
        this.backing = eArr;
        this.offset = i;
        this.length = i2;
        this.LL = c13dw;
        this.root = c13dv;
        ((AbstractList) this).modCount = ((AbstractList) c13dv).modCount;
    }
}
