package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19975613Du<E> extends C13DZ<E> implements Collection, InterfaceC19719812Dk {
    public C13E1<? extends E> LL;
    public Object[] LLILLJJLI;
    public Object[] LLILLL;
    public int LLILZ;
    public C19972913Ct LLILZIL = new C19972913Ct();
    public Object[] LLILZLL;
    public Object[] LLIZ;
    public int LLIZLLLIL;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final C13E1<E> LIZJ() {
        C19975813Dw c19975713Dv;
        Object[] objArr = this.LLILZLL;
        if (objArr == this.LLILLJJLI && this.LLIZ == this.LLILLL) {
            c19975713Dv = this.LL;
        } else {
            this.LLILZIL = new C19972913Ct();
            this.LLILLJJLI = objArr;
            Object[] objArr2 = this.LLIZ;
            this.LLILLL = objArr2;
            c19975713Dv = objArr == null ? objArr2.length == 0 ? C19975713Dv.LLILLL : new C19975713Dv(Arrays.copyOf(this.LLIZ, size())) : new C19975813Dw(size(), this.LLILZ, this.LLILZLL, this.LLIZ);
        }
        this.LL = c19975713Dv;
        return (C13E1<E>) c19975713Dv;
    }

    public final Object[] LJIJ() {
        Object[] objArr = new Object[33];
        objArr[32] = this.LLILZIL;
        return objArr;
    }

    public final int LJJIJIL() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final int LJJIL() {
        int size = size();
        return size > 32 ? size - ((size - 1) & (-32)) : size;
    }

    public final int LJFF() {
        return ((AbstractList) this).modCount;
    }

    @Override // X.C13DZ
    public final int getSize() {
        return this.LLIZLLLIL;
    }

    public final boolean LJIIL(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.LLILZIL) {
            return true;
        }
        return false;
    }

    public final ListIterator<Object[]> LJIILIIL(final int i) {
        final Object[] objArr = this.LLILZLL;
        if (objArr != null) {
            int iLJJIJIL = LJJIJIL() >> 5;
            C19973813Dc.LIZIZ(i, iLJJIJIL);
            int i2 = this.LLILZ;
            if (i2 == 0) {
                return new C13E2<E>(i, objArr) { // from class: X.13E4
                    public final E LLILLL;

                    @Override // java.util.ListIterator, java.util.Iterator
                    public final E next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        this.LL++;
                        return this.LLILLL;
                    }

                    @Override // java.util.ListIterator
                    public final E previous() {
                        if (!hasPrevious()) {
                            throw new NoSuchElementException();
                        }
                        this.LL--;
                        return this.LLILLL;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LLILLL = objArr;
                    }
                };
            }
            return new C13E0(i, iLJJIJIL, i2 / 5, objArr);
        }
        "Invalid root".toString();
        throw new IllegalStateException("Invalid root");
    }

    public final Object[] LJIILJJIL(Object[] objArr) {
        if (objArr == null) {
            return LJIJ();
        }
        if (LJIIL(objArr)) {
            return objArr;
        }
        Object[] objArrLJIJ = LJIJ();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        C13DL.LJ(objArr, objArrLJIJ, 0, length, 6);
        return objArrLJIJ;
    }

    public final Object[] LJIL(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.LLILZIL;
        return objArr;
    }

    public final boolean LJJIJ(Function1<? super E, Boolean> function1) {
        Object[] objArrLJJII;
        int i;
        C19975613Du c19975613Du = this;
        int iLJJIL = c19975613Du.LJJIL();
        Object[] objArrLJJ = null;
        C13E5 c13e5 = new C13E5(null);
        if (c19975613Du.LLILZLL == null) {
            int iLJJIIZI = c19975613Du.LJJIIZI(function1, c19975613Du.LLIZ, iLJJIL, c13e5);
            if (iLJJIIZI == iLJJIL) {
                iLJJIIZI = iLJJIL;
            } else {
                Object[] objArr = (Object[]) c13e5.LIZ;
                Arrays.fill(objArr, iLJJIIZI, iLJJIL, (Object) null);
                c19975613Du.LLIZ = objArr;
                c19975613Du.LLIZLLLIL = c19975613Du.size() - (iLJJIL - iLJJIIZI);
            }
            if (iLJJIIZI == iLJJIL) {
                return false;
            }
        } else {
            ListIterator<Object[]> listIteratorLJIILIIL = c19975613Du.LJIILIIL(0);
            while (true) {
                if (!((C13E2) listIteratorLJIILIIL).hasNext()) {
                    break;
                }
                int iLJJIIZI2 = c19975613Du.LJJIIZI(function1, listIteratorLJIILIIL.next(), 32, c13e5);
                if (iLJJIIZI2 != 32) {
                    if (iLJJIIZI2 != 32) {
                        C13E2 c13e2 = (C13E2) listIteratorLJIILIIL;
                        int i2 = (c13e2.LL - 1) << 5;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        while (c13e2.hasNext()) {
                            iLJJIIZI2 = c19975613Du.LJJIIZ(function1, listIteratorLJIILIIL.next(), 32, iLJJIIZI2, c13e5, arrayList2, arrayList);
                        }
                        Object[] objArr2 = c19975613Du.LLIZ;
                        c19975613Du = c19975613Du;
                        int iLJJIIZ = c19975613Du.LJJIIZ(function1, objArr2, iLJJIL, iLJJIIZI2, c13e5, arrayList2, arrayList);
                        Object[] objArr3 = (Object[]) c13e5.LIZ;
                        Arrays.fill(objArr3, iLJJIIZ, 32, (Object) null);
                        if (arrayList.isEmpty()) {
                            objArrLJJII = c19975613Du.LLILZLL;
                        } else {
                            objArrLJJII = c19975613Du.LJJII(c19975613Du.LLILZLL, i2, c19975613Du.LLILZ, arrayList.iterator());
                        }
                        int size = i2 + (arrayList.size() << 5);
                        if ((size & 31) != 0) {
                            C13D4.LIZ("invalid size");
                        }
                        if (size == 0) {
                            c19975613Du.LLILZ = 0;
                        } else {
                            int i3 = size - 1;
                            while (true) {
                                i = c19975613Du.LLILZ;
                                if ((i3 >> i) != 0) {
                                    break;
                                }
                                c19975613Du.LLILZ = i - 5;
                                objArrLJJII = objArrLJJII[0];
                            }
                            objArrLJJ = c19975613Du.LJJ(i3, i, objArrLJJII);
                        }
                        c19975613Du.LLILZLL = objArrLJJ;
                        c19975613Du.LLIZ = objArr3;
                        c19975613Du.LLIZLLLIL = size + iLJJIIZ;
                    }
                }
            }
            int iLJJIIZI3 = c19975613Du.LJJIIZI(function1, c19975613Du.LLIZ, iLJJIL, c13e5);
            if (iLJJIIZI3 == iLJJIL) {
                iLJJIIZI3 = iLJJIL;
            } else {
                Object[] objArr4 = (Object[]) c13e5.LIZ;
                Arrays.fill(objArr4, iLJJIIZI3, iLJJIL, (Object) null);
                c19975613Du.LLIZ = objArr4;
                c19975613Du.LLIZLLLIL = c19975613Du.size() - (iLJJIL - iLJJIIZI3);
            }
            if (iLJJIIZI3 == 0) {
                c19975613Du.LJJIFFI(c19975613Du.size(), c19975613Du.LLILZ, c19975613Du.LLILZLL);
            }
            if (iLJJIIZI3 == iLJJIL) {
                return false;
            }
        }
        ((AbstractList) c19975613Du).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iLJJIL = LJJIL();
        if (iLJJIL < 32) {
            Object[] objArrLJIILJJIL = LJIILJJIL(this.LLIZ);
            objArrLJIILJJIL[iLJJIL] = e;
            this.LLIZ = objArrLJIILJJIL;
            this.LLIZLLLIL = size() + 1;
            return true;
        }
        LJJIIJ(this.LLILZLL, this.LLIZ, LJIL(e));
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iLJJIL = LJJIL();
        Iterator<? extends E> it2 = collection.iterator();
        if (32 - iLJJIL >= collection.size()) {
            Object[] objArrLJIILJJIL = LJIILJJIL(this.LLIZ);
            LJ(objArrLJIILJJIL, iLJJIL, it2);
            this.LLIZ = objArrLJIILJJIL;
            this.LLIZLLLIL = size() + collection.size();
            return true;
        }
        int size = ((collection.size() + iLJJIL) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrLJIILJJIL2 = LJIILJJIL(this.LLIZ);
        LJ(objArrLJIILJJIL2, iLJJIL, it2);
        objArr[0] = objArrLJIILJJIL2;
        for (int i = 1; i < size; i++) {
            Object[] objArrLJIJ = LJIJ();
            LJ(objArrLJIJ, 0, it2);
            objArr[i] = objArrLJIJ;
        }
        this.LLILZLL = LJJIII(this.LLILZLL, LJJIJIL(), objArr);
        Object[] objArrLJIJ2 = LJIJ();
        LJ(objArrLJIJ2, 0, it2);
        this.LLIZ = objArrLJIJ2;
        this.LLIZLLLIL = size() + collection.size();
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C19973813Dc.LIZ(i, size());
        if (LJJIJIL() <= i) {
            objArr = this.LLIZ;
        } else {
            objArr = this.LLILZLL;
            for (int i2 = this.LLILZ; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[(i >> i2) & 31];
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(final int i) {
        C19973813Dc.LIZIZ(i, size());
        return new C13E2<T>(this, i) { // from class: X.13Dy
            public final C19975613Du<T> LLILLL;
            public int LLILZ;
            public C13E0<? extends T> LLILZIL;
            public int LLILZLL;

            public final void LIZ() {
                if (this.LLILZ != this.LLILLL.LJFF()) {
                    throw new ConcurrentModificationException();
                }
            }

            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v8 */
            /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
            public final void LIZIZ() {
                Object[] objArr = this.LLILLL.LLILZLL;
                if (objArr == null) {
                    this.LLILZIL = null;
                    return;
                }
                int size = (r0.size() - 1) & (-32);
                int i2 = this.LL;
                if (i2 > size) {
                    i2 = size;
                }
                int i3 = (this.LLILLL.LLILZ / 5) + 1;
                C13E0<? extends T> c13e0 = this.LLILZIL;
                if (c13e0 == null) {
                    this.LLILZIL = new C13E0<>(i2, size, i3, objArr);
                    return;
                }
                c13e0.LL = i2;
                c13e0.LLILLJJLI = size;
                c13e0.LLILLL = i3;
                if (c13e0.LLILZ.length < i3) {
                    c13e0.LLILZ = new Object[i3];
                }
                c13e0.LLILZ[0] = objArr;
                ?? r0 = i2 == size ? 1 : 0;
                c13e0.LLILZIL = r0;
                c13e0.LIZIZ(i2 - r0, 1);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                LIZ();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.LL;
                this.LLILZLL = i2;
                C13E0<? extends T> c13e0 = this.LLILZIL;
                if (c13e0 == null) {
                    Object[] objArr = this.LLILLL.LLIZ;
                    this.LL = i2 + 1;
                    return (T) objArr[i2];
                }
                if (c13e0.hasNext()) {
                    this.LL++;
                    return c13e0.next();
                }
                Object[] objArr2 = this.LLILLL.LLIZ;
                int i3 = this.LL;
                this.LL = i3 + 1;
                return (T) objArr2[i3 - c13e0.LLILLJJLI];
            }

            @Override // java.util.ListIterator
            public final T previous() {
                LIZ();
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.LL;
                int i3 = i2 - 1;
                this.LLILZLL = i3;
                C13E0<? extends T> c13e0 = this.LLILZIL;
                if (c13e0 == null) {
                    Object[] objArr = this.LLILLL.LLIZ;
                    this.LL = i3;
                    return (T) objArr[i3];
                }
                int i4 = c13e0.LLILLJJLI;
                if (i2 <= i4) {
                    this.LL = i3;
                    return c13e0.previous();
                }
                Object[] objArr2 = this.LLILLL.LLIZ;
                this.LL = i3;
                return (T) objArr2[i3 - i4];
            }

            @Override // X.C13E2, java.util.ListIterator, java.util.Iterator
            public final void remove() {
                LIZ();
                int i2 = this.LLILZLL;
                if (i2 == -1) {
                    throw new IllegalStateException();
                }
                this.LLILLL.remove(i2);
                int i3 = this.LLILZLL;
                if (i3 < this.LL) {
                    this.LL = i3;
                }
                this.LLILLJJLI = this.LLILLL.size();
                this.LLILZ = this.LLILLL.LJFF();
                this.LLILZLL = -1;
                LIZIZ();
            }

            @Override // X.C13E2, java.util.ListIterator
            public final void add(T t) {
                LIZ();
                this.LLILLL.add(this.LL, t);
                this.LL++;
                this.LLILLJJLI = this.LLILLL.size();
                this.LLILZ = this.LLILLL.LJFF();
                this.LLILZLL = -1;
                LIZIZ();
            }

            @Override // X.C13E2, java.util.ListIterator
            public final void set(T t) {
                LIZ();
                int i2 = this.LLILZLL;
                if (i2 != -1) {
                    this.LLILLL.set(i2, t);
                    this.LLILZ = this.LLILLL.LJFF();
                    LIZIZ();
                    return;
                }
                throw new IllegalStateException();
            }

            {
                int size = this.size();
                this.LLILLL = this;
                this.LLILZ = this.LJFF();
                this.LLILZLL = -1;
                LIZIZ();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        return LJJIJ(new AwS609S0100000_30(collection, 156));
    }

    @Override // X.C13DZ
    public final E removeAt(int i) {
        C19973813Dc.LIZ(i, size());
        ((AbstractList) this).modCount++;
        int iLJJIJIL = LJJIJIL();
        if (i >= iLJJIJIL) {
            return (E) LJJIJIIJIL(iLJJIJIL, this.LLILZ, i - iLJJIJIL, this.LLILZLL);
        }
        C13E5 c13e5 = new C13E5(this.LLIZ[0]);
        LJJIJIIJIL(iLJJIJIL, this.LLILZ, 0, LJJIJIIJI(this.LLILZLL, this.LLILZ, i, c13e5));
        return (E) c13e5.LIZ;
    }

    public final Object[] LJIIZILJ(int i, Object[] objArr) {
        if (LJIIL(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrLJIJ = LJIJ();
        System.arraycopy(objArr, 0, objArrLJIJ, i, 32 - i);
        return objArrLJIJ;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        C19973813Dc.LIZIZ(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iLJJIJIL = LJJIJIL();
        if (i >= iLJJIJIL) {
            LJIIJJI(i - iLJJIJIL, e, this.LLILZLL);
        } else {
            C13E5 c13e5 = new C13E5(null);
            LJIIJJI(0, c13e5.LIZ, LJIIIZ(this.LLILZLL, this.LLILZ, i, e, c13e5));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArrLJIJ;
        C19973813Dc.LIZIZ(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            LJJIJIL();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.LLIZ;
            Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
            System.arraycopy(objArr, i3, objArrLJIILJJIL, size2 + 1, LJJIL() - i3);
            LJ(objArrLJIILJJIL, i3, collection.iterator());
            this.LLIZ = objArrLJIILJJIL;
            this.LLIZLLLIL = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iLJJIL = LJJIL();
        int size3 = size() + collection.size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= LJJIJIL()) {
            objArrLJIJ = LJIJ();
            LJJIJLIJ(collection, i, this.LLIZ, iLJJIL, objArr2, size, objArrLJIJ);
        } else if (size3 > iLJJIL) {
            int i4 = size3 - iLJJIL;
            objArrLJIJ = LJIIZILJ(i4, this.LLIZ);
            LJIIIIZZ(collection, i, i4, objArr2, size, objArrLJIJ);
        } else {
            Object[] objArr3 = this.LLIZ;
            objArrLJIJ = LJIJ();
            int i5 = iLJJIL - size3;
            System.arraycopy(objArr3, i5, objArrLJIJ, 0, iLJJIL - i5);
            int i6 = 32 - i5;
            Object[] objArrLJIIZILJ = LJIIZILJ(i6, this.LLIZ);
            int i7 = size - 1;
            objArr2[i7] = objArrLJIIZILJ;
            LJIIIIZZ(collection, i, i6, objArr2, i7, objArrLJIIZILJ);
        }
        this.LLILZLL = LJJIII(this.LLILZLL, i2, objArr2);
        this.LLIZ = objArrLJIJ;
        this.LLIZLLLIL = size() + collection.size();
        return true;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        C19973813Dc.LIZ(i, size());
        if (LJJIJIL() <= i) {
            Object[] objArrLJIILJJIL = LJIILJJIL(this.LLIZ);
            if (objArrLJIILJJIL != this.LLIZ) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) objArrLJIILJJIL[i2];
            objArrLJIILJJIL[i2] = e;
            this.LLIZ = objArrLJIILJJIL;
            return e2;
        }
        C13E5 c13e5 = new C13E5(null);
        this.LLILZLL = LJJIJL(this.LLILZLL, this.LLILZ, i, e, c13e5);
        return (E) c13e5.LIZ;
    }

    public static final void LJ(Object[] objArr, int i, Iterator it2) {
        while (i < 32 && it2.hasNext()) {
            objArr[i] = it2.next();
            i++;
        }
    }

    public final void LJIIJJI(int i, Object obj, Object[] objArr) {
        int iLJJIL = LJJIL();
        Object[] objArrLJIILJJIL = LJIILJJIL(this.LLIZ);
        if (iLJJIL < 32) {
            System.arraycopy(this.LLIZ, i, objArrLJIILJJIL, i + 1, iLJJIL - i);
            objArrLJIILJJIL[i] = obj;
            this.LLILZLL = objArr;
            this.LLIZ = objArrLJIILJJIL;
            this.LLIZLLLIL = size() + 1;
            return;
        }
        Object[] objArr2 = this.LLIZ;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, objArrLJIILJJIL, i + 1, 31 - i);
        objArrLJIILJJIL[i] = obj;
        LJJIIJ(objArr, objArrLJIILJJIL, LJIL(obj2));
    }

    public final Object[] LJJ(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            C13D4.LIZ("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = (i >> i2) & 31;
        Object objLJJ = LJJ(i, i2 - 5, (Object[]) objArr[i3]);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (LJIIL(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] objArrLJIJ = LJIJ();
                System.arraycopy(objArr, 0, objArrLJIJ, 0, i4);
                objArr = objArrLJIJ;
            }
        }
        if (objLJJ != objArr[i3]) {
            Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
            objArrLJIILJJIL[i3] = objLJJ;
            return objArrLJIILJJIL;
        }
        return objArr;
    }

    public final void LJJIFFI(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.LLILZLL = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.LLIZ = objArr;
            this.LLIZLLLIL = i;
            this.LLILZ = i2;
            return;
        }
        C13E5 c13e5 = new C13E5(null);
        Object[] objArrLJJI = LJJI(objArr, i2, i, c13e5);
        this.LLIZ = (Object[]) c13e5.LIZ;
        this.LLIZLLLIL = i;
        if (objArrLJJI[1] == null) {
            this.LLILZLL = (Object[]) objArrLJJI[0];
            this.LLILZ = i2 - 5;
        } else {
            this.LLILZLL = objArrLJJI;
            this.LLILZ = i2;
        }
    }

    public final Object[] LJJIII(Object[] objArr, int i, Object[][] objArr2) {
        Object[] objArrLJIILJJIL;
        C089E c089e = new C089E(objArr2);
        int i2 = i >> 5;
        int i3 = this.LLILZ;
        if (i2 < (1 << i3)) {
            objArrLJIILJJIL = LJJII(objArr, i, i3, c089e);
        } else {
            objArrLJIILJJIL = LJIILJJIL(objArr);
        }
        while (c089e.hasNext()) {
            this.LLILZ += 5;
            objArrLJIILJJIL = LJIL(objArrLJIILJJIL);
            int i4 = this.LLILZ;
            LJJII(objArrLJIILJJIL, 1 << i4, i4, c089e);
        }
        return objArrLJIILJJIL;
    }

    public final void LJJIIJ(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.LLILZ;
        if (size > (1 << i)) {
            this.LLILZLL = LJJIIJZLJL(this.LLILZ + 5, LJIL(objArr), objArr2);
            this.LLIZ = objArr3;
            this.LLILZ += 5;
            this.LLIZLLLIL = size() + 1;
            return;
        }
        if (objArr == null) {
            this.LLILZLL = objArr2;
            this.LLIZ = objArr3;
            this.LLIZLLLIL = size() + 1;
        } else {
            this.LLILZLL = LJJIIJZLJL(i, objArr, objArr2);
            this.LLIZ = objArr3;
            this.LLIZLLLIL = size() + 1;
        }
    }

    public final Object[] LJJIIJZLJL(int i, Object[] objArr, Object[] objArr2) {
        int size = ((size() - 1) >> i) & 31;
        Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
        if (i == 5) {
            objArrLJIILJJIL[size] = objArr2;
            return objArrLJIILJJIL;
        }
        objArrLJIILJJIL[size] = LJJIIJZLJL(i - 5, (Object[]) objArrLJIILJJIL[size], objArr2);
        return objArrLJIILJJIL;
    }

    public C19975613Du(C13E1<? extends E> c13e1, Object[] objArr, Object[] objArr2, int i) {
        this.LL = c13e1;
        this.LLILLJJLI = objArr;
        this.LLILLL = objArr2;
        this.LLILZ = i;
        this.LLILZLL = objArr;
        this.LLIZ = objArr2;
        this.LLIZLLLIL = c13e1.size();
    }

    public final Object[] LJJI(Object[] objArr, int i, int i2, C13E5 c13e5) {
        Object[] objArrLJJI;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            c13e5.LIZ = objArr[i3];
            objArrLJJI = null;
        } else {
            objArrLJJI = LJJI((Object[]) objArr[i3], i - 5, i2, c13e5);
            if (objArrLJJI == null) {
            }
            Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
            objArrLJIILJJIL[i3] = objArrLJJI;
            return objArrLJIILJJIL;
        }
        if (i3 == 0) {
            return null;
        }
        Object[] objArrLJIILJJIL2 = LJIILJJIL(objArr);
        objArrLJIILJJIL2[i3] = objArrLJJI;
        return objArrLJIILJJIL2;
    }

    public final Object[] LJJII(Object[] objArr, int i, int i2, Iterator<Object[]> it2) {
        if (!it2.hasNext()) {
            C13D4.LIZ("invalid buffersIterator");
        }
        if (i2 < 0) {
            C13D4.LIZ("negative shift");
        }
        if (i2 == 0) {
            return it2.next();
        }
        Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
        int i3 = (i >> i2) & 31;
        int i4 = i2 - 5;
        objArrLJIILJJIL[i3] = LJJII((Object[]) objArrLJIILJJIL[i3], i, i4, it2);
        while (true) {
            i3++;
            if (i3 >= 32 || !it2.hasNext()) {
                break;
            }
            objArrLJIILJJIL[i3] = LJJII((Object[]) objArrLJIILJJIL[i3], 0, i4, it2);
        }
        return objArrLJIILJJIL;
    }

    public final int LJJIIZI(Function1<? super E, Boolean> function1, Object[] objArr, int i, C13E5 c13e5) {
        Object[] objArrLJIILJJIL = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrLJIILJJIL = LJIILJJIL(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrLJIILJJIL[i2] = obj;
                i2++;
            }
        }
        c13e5.LIZ = objArrLJIILJJIL;
        return i2;
    }

    public final Object[] LJJIJIIJI(Object[] objArr, int i, int i2, C13E5 c13e5) {
        int iLJJIJIL = 31;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
            int i4 = i3 + 1;
            System.arraycopy(objArr, i4, objArrLJIILJJIL, i3, 32 - i4);
            objArrLJIILJJIL[31] = c13e5.LIZ;
            c13e5.LIZ = obj;
            return objArrLJIILJJIL;
        }
        if (objArr[31] == null) {
            iLJJIJIL = 31 & ((LJJIJIL() - 1) >> i);
        }
        Object[] objArrLJIILJJIL2 = LJIILJJIL(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= iLJJIJIL) {
            while (true) {
                objArrLJIILJJIL2[iLJJIJIL] = LJJIJIIJI((Object[]) objArrLJIILJJIL2[iLJJIJIL], i5, 0, c13e5);
                if (iLJJIJIL == i6) {
                    break;
                }
                iLJJIJIL--;
            }
        }
        objArrLJIILJJIL2[i3] = LJJIJIIJI((Object[]) objArrLJIILJJIL2[i3], i5, i2, c13e5);
        return objArrLJIILJJIL2;
    }

    public final Object LJJIJIIJIL(int i, int i2, int i3, Object[] objArr) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.LLIZ[0];
            LJJIFFI(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.LLIZ;
        Object obj2 = objArr2[i3];
        Object[] objArrLJIILJJIL = LJIILJJIL(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrLJIILJJIL, i3, size - i4);
        objArrLJIILJJIL[size - 1] = null;
        this.LLILZLL = objArr;
        this.LLIZ = objArrLJIILJJIL;
        this.LLIZLLLIL = (i + size) - 1;
        this.LLILZ = i2;
        return obj2;
    }

    public final Object[] LJIIIZ(Object[] objArr, int i, int i2, Object obj, C13E5 c13e5) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            c13e5.LIZ = objArr[31];
            Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
            System.arraycopy(objArr, i3, objArrLJIILJJIL, i3 + 1, 31 - i3);
            objArrLJIILJJIL[i3] = obj;
            return objArrLJIILJJIL;
        }
        Object[] objArrLJIILJJIL2 = LJIILJJIL(objArr);
        int i4 = i - 5;
        objArrLJIILJJIL2[i3] = LJIIIZ((Object[]) objArrLJIILJJIL2[i3], i4, i2, obj, c13e5);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = objArrLJIILJJIL2[i3]) == null) {
                break;
            }
            objArrLJIILJJIL2[i3] = LJIIIZ((Object[]) obj2, i4, 0, c13e5.LIZ, c13e5);
        }
        return objArrLJIILJJIL2;
    }

    public final Object[] LJJIJL(Object[] objArr, int i, int i2, E e, C13E5 c13e5) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
        if (i == 0) {
            if (objArrLJIILJJIL != objArr) {
                ((AbstractList) this).modCount++;
            }
            c13e5.LIZ = objArrLJIILJJIL[i3];
            objArrLJIILJJIL[i3] = e;
            return objArrLJIILJJIL;
        }
        objArrLJIILJJIL[i3] = LJJIJL((Object[]) objArrLJIILJJIL[i3], i - 5, i2, e, c13e5);
        return objArrLJIILJJIL;
    }

    public final void LJIIIIZZ(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3 = objArr2;
        if (this.LLILZLL != null) {
            int i4 = i >> 5;
            ListIterator<Object[]> listIteratorLJIILIIL = LJIILIIL(LJJIJIL() >> 5);
            int i5 = i3;
            Object[] objArrLJIIZILJ = objArr3;
            while (((C13E2) listIteratorLJIILIIL).LL - 1 != i4) {
                Object[] objArrPrevious = listIteratorLJIILIIL.previous();
                int i6 = 32 - i2;
                System.arraycopy(objArrPrevious, i6, objArrLJIIZILJ, 0, 32 - i6);
                objArrLJIIZILJ = LJIIZILJ(i2, objArrPrevious);
                i5--;
                objArr[i5] = objArrLJIIZILJ;
            }
            Object[] objArrPrevious2 = listIteratorLJIILIIL.previous();
            int iLJJIJIL = i3 - (((LJJIJIL() >> 5) - 1) - i4);
            if (iLJJIJIL < i3) {
                objArr3 = objArr[iLJJIJIL];
            }
            LJJIJLIJ(collection, i, objArrPrevious2, 32, objArr, iLJJIJIL, objArr3);
            return;
        }
        "root is null".toString();
        throw new IllegalStateException("root is null");
    }

    public final int LJJIIZ(Function1<? super E, Boolean> function1, Object[] objArr, int i, int i2, C13E5 c13e5, List<Object[]> list, List<Object[]> list2) {
        if (LJIIL(objArr)) {
            ((ArrayList) list).add(objArr);
        }
        Object[] objArr2 = (Object[]) c13e5.LIZ;
        Object[] objArrLJIJ = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!function1.invoke(obj).booleanValue()) {
                if (i2 == 32) {
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        objArrLJIJ = (Object[]) ListProtector.remove(list, arrayList.size() - 1);
                    } else {
                        objArrLJIJ = LJIJ();
                    }
                    i2 = 0;
                }
                objArrLJIJ[i2] = obj;
                i2++;
            }
        }
        c13e5.LIZ = objArrLJIJ;
        if (objArr2 != objArrLJIJ) {
            ((ArrayList) list2).add(objArr2);
        }
        return i2;
    }

    public final void LJJIJLIJ(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrLJIJ;
        if (i3 < 1) {
            C13D4.LIZ("requires at least one nullBuffer");
        }
        Object[] objArrLJIILJJIL = LJIILJJIL(objArr);
        objArr2[0] = objArrLJIILJJIL;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = i2 - i4;
        int i6 = size + i5;
        if (i6 < 32) {
            System.arraycopy(objArrLJIILJJIL, i4, objArr3, size + 1, i5);
        } else {
            int i7 = (i6 - 32) + 1;
            if (i3 == 1) {
                objArrLJIJ = objArrLJIILJJIL;
            } else {
                objArrLJIJ = LJIJ();
                i3--;
                objArr2[i3] = objArrLJIJ;
            }
            int i8 = i2 - i7;
            System.arraycopy(objArrLJIILJJIL, i8, objArr3, 0, i2 - i8);
            System.arraycopy(objArrLJIILJJIL, i4, objArrLJIJ, size + 1, i8 - i4);
            objArr3 = objArrLJIJ;
        }
        Iterator<? extends E> it2 = collection.iterator();
        LJ(objArrLJIILJJIL, i4, it2);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] objArrLJIJ2 = LJIJ();
            LJ(objArrLJIJ2, 0, it2);
            objArr2[i9] = objArrLJIJ2;
        }
        LJ(objArr3, 0, it2);
    }
}
