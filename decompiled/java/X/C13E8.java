package X;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13E8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13E8<E> extends C13DZ<E> {
    public static final C13E9 LLILZ;
    public static final Object[] LLILZIL = new Object[0];
    public int LL;
    public Object[] LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13E9] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZ = new Object(defaultConstructorMarker) { // from class: X.13E9
        };
    }

    public final void LJIILIIL() {
        ((AbstractList) this).modCount++;
    }

    public C13E8() {
        this.LLILLJJLI = LLILZIL;
    }

    public final E LJFF() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.LLILLJJLI[this.LL];
    }

    public final E LJIIIIZZ() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.LLILLJJLI[LJIIL(this.LL + (size() - 1))];
    }

    public final E LJIILJJIL() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E LJIIZILJ() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            LJIILIIL();
            LJIIJJI(this.LL, LJIIL(this.LL + size()));
        }
        this.LL = 0;
        this.LLILLL = 0;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.LLILLJJLI[this.LL];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.LLILLJJLI[LJIIL(this.LL + (size() - 1))];
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        LJIILIIL();
        Object[] objArr = this.LLILLJJLI;
        int i = this.LL;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.LL = i == objArr.length + (-1) ? 0 : i + 1;
        this.LLILLL = size() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        LJIILIIL();
        int iLJIIL = LJIIL(this.LL + (size() - 1));
        Object[] objArr = this.LLILLJJLI;
        E e = (E) objArr[iLJIIL];
        objArr[iLJIIL] = null;
        this.LLILLL = size() - 1;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // X.C13DZ
    public final int getSize() {
        return this.LLILLL;
    }

    public C13E8(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = LLILZIL;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal Capacity: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILLJJLI = objArr;
    }

    public final void LJ(int i) {
        if (i >= 0) {
            Object[] objArr = this.LLILLJJLI;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == LLILZIL) {
                if (i < 10) {
                    i = 10;
                }
                this.LLILLJJLI = new Object[i];
                return;
            }
            C19973713Db c19973713Db = AbstractC19974313Dh.LL;
            int length = objArr.length;
            c19973713Db.getClass();
            Object[] objArr2 = new Object[C19973713Db.LJ(length, i)];
            Object[] objArr3 = this.LLILLJJLI;
            int i2 = this.LL;
            System.arraycopy(objArr3, i2, objArr2, 0, objArr3.length - i2);
            Object[] objArr4 = this.LLILLJJLI;
            int length2 = objArr4.length;
            int i3 = this.LL;
            System.arraycopy(objArr4, 0, objArr2, length2 - i3, i3);
            this.LL = 0;
            this.LLILLJJLI = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int LJIIIZ(int i) {
        if (i < 0) {
            return i + this.LLILLJJLI.length;
        }
        return i;
    }

    public final int LJIIL(int i) {
        Object[] objArr = this.LLILLJJLI;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        LJIILIIL();
        LJ(size() + collection.size());
        LIZJ(LJIIL(this.LL + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        LJIILIIL();
        LJ(size() + 1);
        int length = this.LL;
        if (length == 0) {
            length = this.LLILLJJLI.length;
        }
        int i = length - 1;
        this.LL = i;
        this.LLILLJJLI[i] = e;
        this.LLILLL = size() + 1;
    }

    public final void addLast(E e) {
        LJIILIIL();
        LJ(size() + 1);
        this.LLILLJJLI[LJIIL(this.LL + size())] = e;
        this.LLILLL = size() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = size();
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, size);
        return (E) this.LLILLJJLI[LJIIL(this.LL + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iLJIIL = LJIIL(this.LL + size());
        int length = this.LL;
        if (length >= iLJIIL) {
            if (length >= iLJIIL) {
                int length2 = this.LLILLJJLI.length;
                while (true) {
                    if (length < length2) {
                        if (Intrinsics.LJFF(obj, this.LLILLJJLI[length])) {
                            i = this.LL;
                            break;
                        }
                        length++;
                    } else {
                        for (int i2 = 0; i2 < iLJIIL; i2++) {
                            if (Intrinsics.LJFF(obj, this.LLILLJJLI[i2])) {
                                length = i2 + this.LLILLJJLI.length;
                                i = this.LL;
                            }
                        }
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        } else {
            while (length < iLJIIL) {
                if (Intrinsics.LJFF(obj, this.LLILLJJLI[length])) {
                    i = this.LL;
                } else {
                    length++;
                }
            }
            return -1;
        }
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iLJIIL = LJIIL(this.LL + size());
        int i2 = this.LL;
        if (i2 < iLJIIL) {
            length = iLJIIL - 1;
            if (i2 <= length) {
                while (!Intrinsics.LJFF(obj, this.LLILLJJLI[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.LL;
                return length - i;
            }
            return -1;
        }
        if (i2 > iLJIIL) {
            int i3 = iLJIIL - 1;
            while (true) {
                if (-1 < i3) {
                    if (Intrinsics.LJFF(obj, this.LLILLJJLI[i3])) {
                        length = i3 + this.LLILLJJLI.length;
                        i = this.LL;
                        break;
                    }
                    i3--;
                } else {
                    length = this.LLILLJJLI.length - 1;
                    int i4 = this.LL;
                    if (i4 <= length) {
                        while (!Intrinsics.LJFF(obj, this.LLILLJJLI[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.LL;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int iLJIIL;
        boolean z = false;
        if (!isEmpty() && this.LLILLJJLI.length != 0) {
            int iLJIIL2 = LJIIL(this.LL + size());
            int i = this.LL;
            if (i < iLJIIL2) {
                iLJIIL = i;
                while (i < iLJIIL2) {
                    Object obj = this.LLILLJJLI[i];
                    if (!collection.contains(obj)) {
                        this.LLILLJJLI[iLJIIL] = obj;
                        iLJIIL++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.LLILLJJLI, iLJIIL, iLJIIL2, (Object) null);
            } else {
                int length = this.LLILLJJLI.length;
                z = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.LLILLJJLI;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.LLILLJJLI[i2] = obj2;
                        i2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                iLJIIL = LJIIL(i2);
                for (int i3 = 0; i3 < iLJIIL2; i3++) {
                    Object[] objArr2 = this.LLILLJJLI;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.LLILLJJLI[iLJIIL] = obj3;
                        if (iLJIIL == r0.length - 1) {
                            iLJIIL = 0;
                        } else {
                            iLJIIL++;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                LJIILIIL();
                this.LLILLL = LJIIIZ(iLJIIL - this.LL);
            }
        }
        return z;
    }

    @Override // X.C13DZ
    public final E removeAt(int i) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = size();
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        LJIILIIL();
        int iLJIIL = LJIIL(this.LL + i);
        E e = (E) this.LLILLJJLI[iLJIIL];
        int i2 = 0;
        if (i < (size() >> 1)) {
            int i3 = this.LL;
            if (iLJIIL >= i3) {
                Object[] objArr = this.LLILLJJLI;
                System.arraycopy(objArr, i3, objArr, i3 + 1, iLJIIL - i3);
            } else {
                Object[] objArr2 = this.LLILLJJLI;
                System.arraycopy(objArr2, 0, objArr2, 1, iLJIIL);
                Object[] objArr3 = this.LLILLJJLI;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.LL;
                System.arraycopy(objArr3, i4, objArr3, i4 + 1, (objArr3.length - 1) - i4);
            }
            Object[] objArr4 = this.LLILLJJLI;
            int i5 = this.LL;
            objArr4[i5] = null;
            if (i5 != objArr4.length - 1) {
                i2 = i5 + 1;
            }
            this.LL = i2;
        } else {
            int iLJIIL2 = LJIIL(this.LL + (size() - 1));
            if (iLJIIL <= iLJIIL2) {
                Object[] objArr5 = this.LLILLJJLI;
                int i6 = iLJIIL + 1;
                System.arraycopy(objArr5, i6, objArr5, iLJIIL, (iLJIIL2 + 1) - i6);
            } else {
                Object[] objArr6 = this.LLILLJJLI;
                int i7 = iLJIIL + 1;
                System.arraycopy(objArr6, i7, objArr6, iLJIIL, objArr6.length - i7);
                Object[] objArr7 = this.LLILLJJLI;
                objArr7[objArr7.length - 1] = objArr7[0];
                System.arraycopy(objArr7, 1, objArr7, 0, (iLJIIL2 + 1) - 1);
            }
            this.LLILLJJLI[iLJIIL2] = null;
        }
        this.LLILLL = size() - 1;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int iLJIIL;
        boolean z = false;
        if (!isEmpty() && this.LLILLJJLI.length != 0) {
            int iLJIIL2 = LJIIL(this.LL + size());
            int i = this.LL;
            if (i < iLJIIL2) {
                iLJIIL = i;
                while (i < iLJIIL2) {
                    Object obj = this.LLILLJJLI[i];
                    if (collection.contains(obj)) {
                        this.LLILLJJLI[iLJIIL] = obj;
                        iLJIIL++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.LLILLJJLI, iLJIIL, iLJIIL2, (Object) null);
            } else {
                int length = this.LLILLJJLI.length;
                z = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.LLILLJJLI;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.LLILLJJLI[i2] = obj2;
                        i2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                iLJIIL = LJIIL(i2);
                for (int i3 = 0; i3 < iLJIIL2; i3++) {
                    Object[] objArr2 = this.LLILLJJLI;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.LLILLJJLI[iLJIIL] = obj3;
                        if (iLJIIL == r0.length - 1) {
                            iLJIIL = 0;
                        } else {
                            iLJIIL++;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                LJIILIIL();
                this.LLILLL = LJIIIZ(iLJIIL - this.LL);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < size()) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size()));
        }
        int iLJIIL = LJIIL(this.LL + size());
        int i = this.LL;
        if (i < iLJIIL) {
            C13DL.LJ(this.LLILLJJLI, tArr, i, iLJIIL, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.LLILLJJLI;
            int i2 = this.LL;
            System.arraycopy(objArr, i2, tArr, 0, objArr.length - i2);
            Object[] objArr2 = this.LLILLJJLI;
            System.arraycopy(objArr2, 0, tArr, objArr2.length - this.LL, iLJIIL);
        }
        int size = size();
        if (size < tArr.length) {
            tArr[size] = null;
        }
        return tArr;
    }

    public C13E8(Collection<? extends E> collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.LLILLJJLI = array;
        this.LLILLL = array.length;
        if (array.length == 0) {
            this.LLILLJJLI = LLILZIL;
        }
    }

    public final void LIZJ(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        int length = this.LLILLJJLI.length;
        while (i < length && it2.hasNext()) {
            this.LLILLJJLI[i] = it2.next();
            i++;
        }
        int i2 = this.LL;
        for (int i3 = 0; i3 < i2 && it2.hasNext(); i3++) {
            this.LLILLJJLI[i3] = it2.next();
        }
        this.LLILLL = size() + collection.size();
    }

    public final void LJIIJJI(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.LLILLJJLI, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.LLILLJJLI;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.LLILLJJLI, 0, i2, (Object) null);
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int length;
        int length2;
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = size();
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, size);
        if (i == size()) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        LJIILIIL();
        LJ(size() + 1);
        int iLJIIL = LJIIL(this.LL + i);
        if (i < ((size() + 1) >> 1)) {
            if (iLJIIL == 0) {
                length = this.LLILLJJLI.length - 1;
            } else {
                length = iLJIIL - 1;
            }
            int i2 = this.LL;
            if (i2 == 0) {
                length2 = this.LLILLJJLI.length - 1;
            } else {
                length2 = i2 - 1;
            }
            if (length >= i2) {
                Object[] objArr = this.LLILLJJLI;
                objArr[length2] = objArr[i2];
                int i3 = i2 + 1;
                System.arraycopy(objArr, i3, objArr, i2, (length + 1) - i3);
            } else {
                Object[] objArr2 = this.LLILLJJLI;
                System.arraycopy(objArr2, i2, objArr2, i2 - 1, objArr2.length - i2);
                Object[] objArr3 = this.LLILLJJLI;
                objArr3[objArr3.length - 1] = objArr3[0];
                System.arraycopy(objArr3, 1, objArr3, 0, (length + 1) - 1);
            }
            this.LLILLJJLI[length] = e;
            this.LL = length2;
        } else {
            int iLJIIL2 = LJIIL(this.LL + size());
            if (iLJIIL < iLJIIL2) {
                Object[] objArr4 = this.LLILLJJLI;
                System.arraycopy(objArr4, iLJIIL, objArr4, iLJIIL + 1, iLJIIL2 - iLJIIL);
            } else {
                Object[] objArr5 = this.LLILLJJLI;
                System.arraycopy(objArr5, 0, objArr5, 1, iLJIIL2);
                Object[] objArr6 = this.LLILLJJLI;
                objArr6[0] = objArr6[objArr6.length - 1];
                System.arraycopy(objArr6, iLJIIL, objArr6, iLJIIL + 1, (objArr6.length - 1) - iLJIIL);
            }
            this.LLILLJJLI[iLJIIL] = e;
        }
        this.LLILLL = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = size();
        c19973713Db.getClass();
        C19973713Db.LIZJ(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        LJIILIIL();
        LJ(size() + collection.size());
        int iLJIIL = LJIIL(this.LL + size());
        int iLJIIL2 = LJIIL(this.LL + i);
        int size2 = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.LL;
            int length = i2 - size2;
            if (iLJIIL2 >= i2) {
                if (length >= 0) {
                    Object[] objArr = this.LLILLJJLI;
                    System.arraycopy(objArr, i2, objArr, length, iLJIIL2 - i2);
                } else {
                    Object[] objArr2 = this.LLILLJJLI;
                    length += objArr2.length;
                    int i3 = iLJIIL2 - i2;
                    int length2 = objArr2.length - length;
                    if (length2 >= i3) {
                        System.arraycopy(objArr2, i2, objArr2, length, i3);
                    } else {
                        System.arraycopy(objArr2, i2, objArr2, length, (i2 + length2) - i2);
                        Object[] objArr3 = this.LLILLJJLI;
                        int i4 = this.LL + length2;
                        System.arraycopy(objArr3, i4, objArr3, 0, iLJIIL2 - i4);
                    }
                }
            } else {
                Object[] objArr4 = this.LLILLJJLI;
                System.arraycopy(objArr4, i2, objArr4, length, objArr4.length - i2);
                if (size2 >= iLJIIL2) {
                    Object[] objArr5 = this.LLILLJJLI;
                    System.arraycopy(objArr5, 0, objArr5, objArr5.length - size2, iLJIIL2);
                } else {
                    Object[] objArr6 = this.LLILLJJLI;
                    System.arraycopy(objArr6, 0, objArr6, objArr6.length - size2, size2);
                    Object[] objArr7 = this.LLILLJJLI;
                    System.arraycopy(objArr7, size2, objArr7, 0, iLJIIL2 - size2);
                }
            }
            this.LL = length;
            LIZJ(LJIIIZ(iLJIIL2 - size2), collection);
            return true;
        }
        int i5 = iLJIIL2 + size2;
        if (iLJIIL2 < iLJIIL) {
            int i6 = size2 + iLJIIL;
            Object[] objArr8 = this.LLILLJJLI;
            if (i6 <= objArr8.length) {
                System.arraycopy(objArr8, iLJIIL2, objArr8, i5, iLJIIL - iLJIIL2);
            } else if (i5 >= objArr8.length) {
                System.arraycopy(objArr8, iLJIIL2, objArr8, i5 - objArr8.length, iLJIIL - iLJIIL2);
            } else {
                int length3 = iLJIIL - (i6 - objArr8.length);
                System.arraycopy(objArr8, length3, objArr8, 0, iLJIIL - length3);
                Object[] objArr9 = this.LLILLJJLI;
                System.arraycopy(objArr9, iLJIIL2, objArr9, i5, length3 - iLJIIL2);
            }
        } else {
            Object[] objArr10 = this.LLILLJJLI;
            System.arraycopy(objArr10, 0, objArr10, size2, iLJIIL);
            Object[] objArr11 = this.LLILLJJLI;
            if (i5 >= objArr11.length) {
                System.arraycopy(objArr11, iLJIIL2, objArr11, i5 - objArr11.length, objArr11.length - iLJIIL2);
            } else {
                int length4 = objArr11.length - size2;
                System.arraycopy(objArr11, length4, objArr11, 0, objArr11.length - length4);
                Object[] objArr12 = this.LLILLJJLI;
                System.arraycopy(objArr12, iLJIIL2, objArr12, i5, (objArr12.length - size2) - iLJIIL2);
            }
        }
        LIZJ(iLJIIL2, collection);
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = size();
        c19973713Db.getClass();
        C19973713Db.LIZLLL(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        LJIILIIL();
        if (i < size() - i2) {
            int iLJIIL = LJIIL(this.LL + (i - 1));
            int iLJIIL2 = LJIIL(this.LL + (i2 - 1));
            while (i > 0) {
                int i4 = iLJIIL + 1;
                int iMin = Math.min(i, Math.min(i4, iLJIIL2 + 1));
                Object[] objArr = this.LLILLJJLI;
                int i5 = iLJIIL2 - iMin;
                int i6 = iLJIIL - iMin;
                int i7 = i6 + 1;
                System.arraycopy(objArr, i7, objArr, i5 + 1, i4 - i7);
                iLJIIL = LJIIIZ(i6);
                iLJIIL2 = LJIIIZ(i5);
                i -= iMin;
            }
            int iLJIIL3 = LJIIL(this.LL + i3);
            LJIIJJI(this.LL, iLJIIL3);
            this.LL = iLJIIL3;
        } else {
            int iLJIIL4 = LJIIL(this.LL + i2);
            int iLJIIL5 = LJIIL(this.LL + i);
            int size2 = size();
            while (true) {
                size2 -= i2;
                if (size2 <= 0) {
                    break;
                }
                Object[] objArr2 = this.LLILLJJLI;
                i2 = Math.min(size2, Math.min(objArr2.length - iLJIIL4, objArr2.length - iLJIIL5));
                Object[] objArr3 = this.LLILLJJLI;
                int i8 = iLJIIL4 + i2;
                System.arraycopy(objArr3, iLJIIL4, objArr3, iLJIIL5, i8 - iLJIIL4);
                iLJIIL4 = LJIIL(i8);
                iLJIIL5 = LJIIL(iLJIIL5 + i2);
            }
            int iLJIIL6 = LJIIL(this.LL + size());
            LJIIJJI(LJIIIZ(iLJIIL6 - i3), iLJIIL6);
        }
        this.LLILLL = size() - i3;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = size();
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, size);
        int iLJIIL = LJIIL(this.LL + i);
        Object[] objArr = this.LLILLJJLI;
        E e2 = (E) objArr[iLJIIL];
        objArr[iLJIIL] = e;
        return e2;
    }
}
