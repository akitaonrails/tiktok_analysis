package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import jkp.j;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19974813Dm<E> extends C13DZ<E> implements InterfaceC1687440u0s<E> {
    public InterfaceC1664360tPe<? extends E> LL;
    public Object[] LLILLJJLI;
    public Object[] LLILLL;
    public int LLILZ;
    public C13CS LLILZIL = new C13CS();
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

    public final Object[] LJIIZILJ() {
        Object[] objArr = new Object[33];
        objArr[32] = this.LLILZIL;
        return objArr;
    }

    @Override // X.InterfaceC1687440u0s
    public final InterfaceC1664360tPe<E> build() {
        C19974713Dl jVar;
        Object[] objArr = this.LLILZLL;
        if (objArr == this.LLILLJJLI && this.LLIZ == this.LLILLL) {
            jVar = this.LL;
        } else {
            this.LLILZIL = new C13CS();
            this.LLILLJJLI = objArr;
            Object[] objArr2 = this.LLIZ;
            this.LLILLL = objArr2;
            jVar = objArr == null ? objArr2.length == 0 ? j.LLILLL : new j(Arrays.copyOf(this.LLIZ, size())) : new C19974713Dl(size(), this.LLILZ, this.LLILZLL, this.LLIZ);
        }
        this.LL = jVar;
        return (InterfaceC1664360tPe<E>) jVar;
    }

    public final int LJJIJIIJIL() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final int LJJIJLIJ() {
        int size = size();
        return size > 32 ? size - ((size - 1) & (-32)) : size;
    }

    public final int LJ() {
        return ((AbstractList) this).modCount;
    }

    @Override // X.C13DZ
    public final int getSize() {
        return this.LLIZLLLIL;
    }

    public final boolean LJIIJJI(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.LLILZIL) {
            return true;
        }
        return false;
    }

    public final ListIterator<Object[]> LJIIL(final int i) {
        if (this.LLILZLL != null) {
            int iLJJIJIIJIL = LJJIJIIJIL() >> 5;
            C19973913Dd.LIZIZ(i, iLJJIJIIJIL);
            int i2 = this.LLILZ;
            if (i2 == 0) {
                final Object[] objArr = this.LLILZLL;
                return new AbstractC19975213Dq<E>(i, objArr) { // from class: X.13Ds
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
            return new C19975013Do(i, iLJJIJIIJIL, i2 / 5, this.LLILZLL);
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final Object[] LJIILIIL(Object[] objArr) {
        if (objArr == null) {
            return LJIIZILJ();
        }
        if (LJIIJJI(objArr)) {
            return objArr;
        }
        Object[] objArrLJIIZILJ = LJIIZILJ();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        C13DL.LJ(objArr, objArrLJIIZILJ, 0, length, 6);
        return objArrLJIIZILJ;
    }

    public final Object[] LJIJ(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.LLILZIL;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iLJJIJLIJ = LJJIJLIJ();
        if (iLJJIJLIJ < 32) {
            Object[] objArrLJIILIIL = LJIILIIL(this.LLIZ);
            objArrLJIILIIL[iLJJIJLIJ] = e;
            this.LLIZ = objArrLJIILIIL;
            this.LLIZLLLIL = size() + 1;
            return true;
        }
        LJJIII(this.LLILZLL, this.LLIZ, LJIJ(e));
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iLJJIJLIJ = LJJIJLIJ();
        Iterator<? extends E> it2 = collection.iterator();
        if (32 - iLJJIJLIJ >= collection.size()) {
            Object[] objArrLJIILIIL = LJIILIIL(this.LLIZ);
            LIZJ(objArrLJIILIIL, iLJJIJLIJ, it2);
            this.LLIZ = objArrLJIILIIL;
            this.LLIZLLLIL = size() + collection.size();
            return true;
        }
        int size = ((collection.size() + iLJJIJLIJ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrLJIILIIL2 = LJIILIIL(this.LLIZ);
        LIZJ(objArrLJIILIIL2, iLJJIJLIJ, it2);
        objArr[0] = objArrLJIILIIL2;
        for (int i = 1; i < size; i++) {
            Object[] objArrLJIIZILJ = LJIIZILJ();
            LIZJ(objArrLJIIZILJ, 0, it2);
            objArr[i] = objArrLJIIZILJ;
        }
        this.LLILZLL = LJJII(this.LLILZLL, LJJIJIIJIL(), objArr);
        Object[] objArrLJIIZILJ2 = LJIIZILJ();
        LIZJ(objArrLJIIZILJ2, 0, it2);
        this.LLIZ = objArrLJIIZILJ2;
        this.LLIZLLLIL = size() + collection.size();
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C19973913Dd.LIZ(i, size());
        if (LJJIJIIJIL() <= i) {
            objArr = this.LLIZ;
        } else {
            objArr = this.LLILZLL;
            for (int i2 = this.LLILZ; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                if (obj != null) {
                    objArr = (Object[]) obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        C19973913Dd.LIZIZ(i, size());
        return new C19974913Dn(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        Object[] objArrLJJIFFI;
        AwS609S0100000_30 awS609S0100000_30 = new AwS609S0100000_30(collection, 205);
        C19974813Dm<E> c19974813Dm = this;
        int iLJJIJLIJ = c19974813Dm.LJJIJLIJ();
        Object[] objArrLJIL = null;
        C19975513Dt c19975513Dt = new C19975513Dt(null);
        if (c19974813Dm.LLILZLL == null) {
            if (c19974813Dm.LJJIIZI(awS609S0100000_30, iLJJIJLIJ, c19975513Dt) == iLJJIJLIJ) {
                return false;
            }
        } else {
            ListIterator<Object[]> listIteratorLJIIL = c19974813Dm.LJIIL(0);
            while (true) {
                if (!((AbstractC19975213Dq) listIteratorLJIIL).hasNext()) {
                    break;
                }
                int iLJJIIZ = c19974813Dm.LJJIIZ(awS609S0100000_30, listIteratorLJIIL.next(), 32, c19975513Dt);
                if (iLJJIIZ != 32) {
                    if (iLJJIIZ != 32) {
                        AbstractC19975213Dq abstractC19975213Dq = (AbstractC19975213Dq) listIteratorLJIIL;
                        int i = (abstractC19975213Dq.LL - 1) << 5;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        while (abstractC19975213Dq.hasNext()) {
                            iLJJIIZ = c19974813Dm.LJJIIJZLJL(awS609S0100000_30, listIteratorLJIIL.next(), 32, iLJJIIZ, c19975513Dt, arrayList2, arrayList);
                        }
                        Object[] objArr = c19974813Dm.LLIZ;
                        c19974813Dm = c19974813Dm;
                        int iLJJIIJZLJL = c19974813Dm.LJJIIJZLJL(awS609S0100000_30, objArr, iLJJIJLIJ, iLJJIIZ, c19975513Dt, arrayList2, arrayList);
                        Object obj = c19975513Dt.LIZ;
                        if (obj != null) {
                            Object[] objArr2 = (Object[]) obj;
                            Arrays.fill(objArr2, iLJJIIJZLJL, 32, (Object) null);
                            if (arrayList.isEmpty()) {
                                objArrLJJIFFI = c19974813Dm.LLILZLL;
                            } else {
                                objArrLJJIFFI = c19974813Dm.LJJIFFI(c19974813Dm.LLILZLL, i, c19974813Dm.LLILZ, arrayList.iterator());
                            }
                            int size = i + (arrayList.size() << 5);
                            if ((size & 31) == 0) {
                                if (size == 0) {
                                    c19974813Dm.LLILZ = 0;
                                } else {
                                    int i2 = size - 1;
                                    while (true) {
                                        int i3 = c19974813Dm.LLILZ;
                                        if ((i2 >> i3) == 0) {
                                            c19974813Dm.LLILZ = i3 - 5;
                                            Object[] objArr3 = objArrLJJIFFI[0];
                                            if (objArr3 != null) {
                                                objArrLJJIFFI = objArr3;
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                                            }
                                        } else {
                                            objArrLJIL = c19974813Dm.LJIL(i2, i3, objArrLJJIFFI);
                                            break;
                                        }
                                    }
                                }
                                c19974813Dm.LLILZLL = objArrLJIL;
                                c19974813Dm.LLIZ = objArr2;
                                c19974813Dm.LLIZLLLIL = size + iLJJIIJZLJL;
                            } else {
                                "Check failed.".toString();
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                }
            }
            int iLJJIIZI = c19974813Dm.LJJIIZI(awS609S0100000_30, iLJJIJLIJ, c19975513Dt);
            if (iLJJIIZI == 0) {
                c19974813Dm.LJJI(c19974813Dm.size(), c19974813Dm.LLILZ, c19974813Dm.LLILZLL);
            }
            if (iLJJIIZI == iLJJIJLIJ) {
                return false;
            }
        }
        ((AbstractList) c19974813Dm).modCount++;
        return true;
    }

    @Override // X.C13DZ
    public final E removeAt(int i) {
        C19973913Dd.LIZ(i, size());
        ((AbstractList) this).modCount++;
        int iLJJIJIIJIL = LJJIJIIJIL();
        if (i >= iLJJIJIIJIL) {
            return (E) LJJIJIIJI(iLJJIJIIJIL, this.LLILZ, i - iLJJIJIIJIL, this.LLILZLL);
        }
        C19975513Dt c19975513Dt = new C19975513Dt(this.LLIZ[0]);
        LJJIJIIJI(iLJJIJIIJIL, this.LLILZ, 0, LJJIJ(this.LLILZLL, this.LLILZ, i, c19975513Dt));
        return (E) c19975513Dt.LIZ;
    }

    public final Object[] LJIILJJIL(int i, Object[] objArr) {
        if (LJIIJJI(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrLJIIZILJ = LJIIZILJ();
        System.arraycopy(objArr, 0, objArrLJIIZILJ, i, 32 - i);
        return objArrLJIIZILJ;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        C19973913Dd.LIZIZ(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iLJJIJIIJIL = LJJIJIIJIL();
        if (i >= iLJJIJIIJIL) {
            LJIIIZ(i - iLJJIJIIJIL, e, this.LLILZLL);
        } else {
            C19975513Dt c19975513Dt = new C19975513Dt(null);
            LJIIIZ(0, c19975513Dt.LIZ, LJIIIIZZ(this.LLILZLL, this.LLILZ, i, e, c19975513Dt));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArrLJIIZILJ;
        C19973913Dd.LIZIZ(i, size());
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
            LJJIJIIJIL();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.LLIZ;
            Object[] objArrLJIILIIL = LJIILIIL(objArr);
            System.arraycopy(objArr, i3, objArrLJIILIIL, size2 + 1, LJJIJLIJ() - i3);
            LIZJ(objArrLJIILIIL, i3, collection.iterator());
            this.LLIZ = objArrLJIILIIL;
            this.LLIZLLLIL = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iLJJIJLIJ = LJJIJLIJ();
        int size3 = size() + collection.size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= LJJIJIIJIL()) {
            objArrLJIIZILJ = LJIIZILJ();
            LJJIJL(collection, i, this.LLIZ, iLJJIJLIJ, objArr2, size, objArrLJIIZILJ);
        } else if (size3 > iLJJIJLIJ) {
            int i4 = size3 - iLJJIJLIJ;
            objArrLJIIZILJ = LJIILJJIL(i4, this.LLIZ);
            LJFF(collection, i, i4, objArr2, size, objArrLJIIZILJ);
        } else {
            Object[] objArr3 = this.LLIZ;
            objArrLJIIZILJ = LJIIZILJ();
            int i5 = iLJJIJLIJ - size3;
            System.arraycopy(objArr3, i5, objArrLJIIZILJ, 0, iLJJIJLIJ - i5);
            int i6 = 32 - i5;
            Object[] objArrLJIILJJIL = LJIILJJIL(i6, this.LLIZ);
            int i7 = size - 1;
            objArr2[i7] = objArrLJIILJJIL;
            LJFF(collection, i, i6, objArr2, i7, objArrLJIILJJIL);
        }
        this.LLILZLL = LJJII(this.LLILZLL, i2, objArr2);
        this.LLIZ = objArrLJIIZILJ;
        this.LLIZLLLIL = size() + collection.size();
        return true;
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        C19973913Dd.LIZ(i, size());
        if (LJJIJIIJIL() <= i) {
            Object[] objArrLJIILIIL = LJIILIIL(this.LLIZ);
            if (objArrLJIILIIL != this.LLIZ) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) objArrLJIILIIL[i2];
            objArrLJIILIIL[i2] = e;
            this.LLIZ = objArrLJIILIIL;
            return e2;
        }
        C19975513Dt c19975513Dt = new C19975513Dt(null);
        this.LLILZLL = LJJIJIL(this.LLILZLL, this.LLILZ, i, e, c19975513Dt);
        return (E) c19975513Dt.LIZ;
    }

    public static final void LIZJ(Object[] objArr, int i, Iterator it2) {
        while (i < 32 && it2.hasNext()) {
            objArr[i] = it2.next();
            i++;
        }
    }

    public final void LJIIIZ(int i, Object obj, Object[] objArr) {
        int iLJJIJLIJ = LJJIJLIJ();
        Object[] objArrLJIILIIL = LJIILIIL(this.LLIZ);
        if (iLJJIJLIJ < 32) {
            System.arraycopy(this.LLIZ, i, objArrLJIILIIL, i + 1, iLJJIJLIJ - i);
            objArrLJIILIIL[i] = obj;
            this.LLILZLL = objArr;
            this.LLIZ = objArrLJIILIIL;
            this.LLIZLLLIL = size() + 1;
            return;
        }
        Object[] objArr2 = this.LLIZ;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, objArrLJIILIIL, i + 1, 31 - i);
        objArrLJIILIIL[i] = obj;
        LJJIII(objArr, objArrLJIILIIL, LJIJ(obj2));
    }

    public final Object[] LJIL(int i, int i2, Object[] objArr) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return objArr;
            }
            int i3 = (i >> i2) & 31;
            Object obj = objArr[i3];
            if (obj != null) {
                Object objLJIL = LJIL(i, i2 - 5, (Object[]) obj);
                if (i3 < 31) {
                    int i4 = i3 + 1;
                    if (objArr[i4] != null) {
                        if (LJIIJJI(objArr)) {
                            Arrays.fill(objArr, i4, 32, (Object) null);
                        }
                        Object[] objArrLJIIZILJ = LJIIZILJ();
                        System.arraycopy(objArr, 0, objArrLJIIZILJ, 0, i4);
                        objArr = objArrLJIIZILJ;
                    }
                }
                if (objLJIL != objArr[i3]) {
                    Object[] objArrLJIILIIL = LJIILIIL(objArr);
                    objArrLJIILIIL[i3] = objLJIL;
                    return objArrLJIILIIL;
                }
                return objArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final void LJJI(int i, int i2, Object[] objArr) {
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
        C19975513Dt c19975513Dt = new C19975513Dt(null);
        Object[] objArrLJJ = LJJ(objArr, i2, i, c19975513Dt);
        Object obj = c19975513Dt.LIZ;
        if (obj != null) {
            this.LLIZ = (Object[]) obj;
            this.LLIZLLLIL = i;
            if (objArrLJJ[1] == null) {
                this.LLILZLL = (Object[]) objArrLJJ[0];
                this.LLILZ = i2 - 5;
                return;
            } else {
                this.LLILZLL = objArrLJJ;
                this.LLILZ = i2;
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object[] LJJII(Object[] objArr, int i, Object[][] objArr2) {
        Object[] objArrLJIILIIL;
        C089E c089e = new C089E(objArr2);
        int i2 = i >> 5;
        int i3 = this.LLILZ;
        if (i2 < (1 << i3)) {
            objArrLJIILIIL = LJJIFFI(objArr, i, i3, c089e);
        } else {
            objArrLJIILIIL = LJIILIIL(objArr);
        }
        while (c089e.hasNext()) {
            this.LLILZ += 5;
            objArrLJIILIIL = LJIJ(objArrLJIILIIL);
            int i4 = this.LLILZ;
            LJJIFFI(objArrLJIILIIL, 1 << i4, i4, c089e);
        }
        return objArrLJIILIIL;
    }

    public final void LJJIII(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.LLILZ;
        if (size > (1 << i)) {
            this.LLILZLL = LJJIIJ(this.LLILZ + 5, LJIJ(objArr), objArr2);
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
            this.LLILZLL = LJJIIJ(i, objArr, objArr2);
            this.LLIZ = objArr3;
            this.LLIZLLLIL = size() + 1;
        }
    }

    public final Object[] LJJIIJ(int i, Object[] objArr, Object[] objArr2) {
        int size = ((size() - 1) >> i) & 31;
        Object[] objArrLJIILIIL = LJIILIIL(objArr);
        if (i == 5) {
            objArrLJIILIIL[size] = objArr2;
            return objArrLJIILIIL;
        }
        objArrLJIILIIL[size] = LJJIIJ(i - 5, (Object[]) objArrLJIILIIL[size], objArr2);
        return objArrLJIILIIL;
    }

    public final int LJJIIZI(AwS609S0100000_30 awS609S0100000_30, int i, C19975513Dt c19975513Dt) {
        int iLJJIIZ = LJJIIZ(awS609S0100000_30, this.LLIZ, i, c19975513Dt);
        if (iLJJIIZ == i) {
            return i;
        }
        Object obj = c19975513Dt.LIZ;
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            Arrays.fill(objArr, iLJJIIZ, i, (Object) null);
            this.LLIZ = objArr;
            this.LLIZLLLIL = size() - (i - iLJJIIZ);
            return iLJJIIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public C19974813Dm(InterfaceC1664360tPe<? extends E> interfaceC1664360tPe, Object[] objArr, Object[] objArr2, int i) {
        this.LL = interfaceC1664360tPe;
        this.LLILLJJLI = objArr;
        this.LLILLL = objArr2;
        this.LLILZ = i;
        this.LLILZLL = objArr;
        this.LLIZ = objArr2;
        this.LLIZLLLIL = interfaceC1664360tPe.size();
    }

    public final Object[] LJJ(Object[] objArr, int i, int i2, C19975513Dt c19975513Dt) {
        Object[] objArrLJJ;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            c19975513Dt.LIZ = objArr[i3];
            objArrLJJ = null;
        } else {
            Object obj = objArr[i3];
            if (obj != null) {
                objArrLJJ = LJJ((Object[]) obj, i - 5, i2, c19975513Dt);
                if (objArrLJJ == null) {
                }
                Object[] objArrLJIILIIL = LJIILIIL(objArr);
                objArrLJIILIIL[i3] = objArrLJJ;
                return objArrLJIILIIL;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        if (i3 == 0) {
            return null;
        }
        Object[] objArrLJIILIIL2 = LJIILIIL(objArr);
        objArrLJIILIIL2[i3] = objArrLJJ;
        return objArrLJIILIIL2;
    }

    public final Object[] LJJIFFI(Object[] objArr, int i, int i2, Iterator<Object[]> it2) {
        if (it2.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return it2.next();
                }
                Object[] objArrLJIILIIL = LJIILIIL(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                objArrLJIILIIL[i3] = LJJIFFI((Object[]) objArrLJIILIIL[i3], i, i4, it2);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it2.hasNext()) {
                        break;
                    }
                    objArrLJIILIIL[i3] = LJJIFFI((Object[]) objArrLJIILIIL[i3], 0, i4, it2);
                }
                return objArrLJIILIIL;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final int LJJIIZ(AwS609S0100000_30 awS609S0100000_30, Object[] objArr, int i, C19975513Dt c19975513Dt) {
        int i2 = 0;
        Object[] objArrLJIILIIL = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) awS609S0100000_30.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrLJIILIIL = LJIILIIL(objArr);
                    z = true;
                    i3 = i2;
                }
            } else if (z) {
                i2 = i3 + 1;
                objArrLJIILIIL[i3] = obj;
                i3 = i2;
            }
            i2 = i4;
        }
        c19975513Dt.LIZ = objArrLJIILIIL;
        return i3;
    }

    public final Object[] LJJIJ(Object[] objArr, int i, int i2, C19975513Dt c19975513Dt) {
        int iLJJIJIIJIL = 31;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrLJIILIIL = LJIILIIL(objArr);
            int i4 = i3 + 1;
            System.arraycopy(objArr, i4, objArrLJIILIIL, i3, 32 - i4);
            objArrLJIILIIL[31] = c19975513Dt.LIZ;
            c19975513Dt.LIZ = obj;
            return objArrLJIILIIL;
        }
        if (objArr[31] == null) {
            iLJJIJIIJIL = 31 & ((LJJIJIIJIL() - 1) >> i);
        }
        Object[] objArrLJIILIIL2 = LJIILIIL(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= iLJJIJIIJIL) {
            while (true) {
                int i7 = iLJJIJIIJIL - 1;
                Object obj2 = objArrLJIILIIL2[iLJJIJIIJIL];
                if (obj2 != null) {
                    objArrLJIILIIL2[iLJJIJIIJIL] = LJJIJ((Object[]) obj2, i5, 0, c19975513Dt);
                    if (iLJJIJIIJIL == i6) {
                        break;
                    }
                    iLJJIJIIJIL = i7;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj3 = objArrLJIILIIL2[i3];
        if (obj3 != null) {
            objArrLJIILIIL2[i3] = LJJIJ((Object[]) obj3, i5, i2, c19975513Dt);
            return objArrLJIILIIL2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object LJJIJIIJI(int i, int i2, int i3, Object[] objArr) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.LLIZ[0];
            LJJI(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.LLIZ;
        Object obj2 = objArr2[i3];
        Object[] objArrLJIILIIL = LJIILIIL(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrLJIILIIL, i3, size - i4);
        objArrLJIILIIL[size - 1] = null;
        this.LLILZLL = objArr;
        this.LLIZ = objArrLJIILIIL;
        this.LLIZLLLIL = (i + size) - 1;
        this.LLILZ = i2;
        return obj2;
    }

    public final Object[] LJIIIIZZ(Object[] objArr, int i, int i2, Object obj, C19975513Dt c19975513Dt) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            c19975513Dt.LIZ = objArr[31];
            Object[] objArrLJIILIIL = LJIILIIL(objArr);
            System.arraycopy(objArr, i3, objArrLJIILIIL, i3 + 1, 31 - i3);
            objArrLJIILIIL[i3] = obj;
            return objArrLJIILIIL;
        }
        Object[] objArrLJIILIIL2 = LJIILIIL(objArr);
        int i4 = i - 5;
        Object obj2 = objArrLJIILIIL2[i3];
        if (obj2 != null) {
            objArrLJIILIIL2[i3] = LJIIIIZZ((Object[]) obj2, i4, i2, obj, c19975513Dt);
            int i5 = i3 + 1;
            while (i5 < 32) {
                int i6 = i5 + 1;
                Object obj3 = objArrLJIILIIL2[i5];
                if (obj3 == null) {
                    break;
                }
                objArrLJIILIIL2[i5] = LJIIIIZZ((Object[]) obj3, i4, 0, c19975513Dt.LIZ, c19975513Dt);
                i5 = i6;
            }
            return objArrLJIILIIL2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object[] LJJIJIL(Object[] objArr, int i, int i2, E e, C19975513Dt c19975513Dt) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrLJIILIIL = LJIILIIL(objArr);
        if (i == 0) {
            if (objArrLJIILIIL != objArr) {
                ((AbstractList) this).modCount++;
            }
            c19975513Dt.LIZ = objArrLJIILIIL[i3];
            objArrLJIILIIL[i3] = e;
            return objArrLJIILIIL;
        }
        Object obj = objArrLJIILIIL[i3];
        if (obj != null) {
            objArrLJIILIIL[i3] = LJJIJIL((Object[]) obj, i - 5, i2, e, c19975513Dt);
            return objArrLJIILIIL;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final void LJFF(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3 = objArr2;
        if (this.LLILZLL != null) {
            int i4 = i >> 5;
            ListIterator<Object[]> listIteratorLJIIL = LJIIL(LJJIJIIJIL() >> 5);
            int i5 = i3;
            Object[] objArrLJIILJJIL = objArr3;
            while (((AbstractC19975213Dq) listIteratorLJIIL).LL - 1 != i4) {
                Object[] objArrPrevious = listIteratorLJIIL.previous();
                int i6 = 32 - i2;
                System.arraycopy(objArrPrevious, i6, objArrLJIILJJIL, 0, 32 - i6);
                objArrLJIILJJIL = LJIILJJIL(i2, objArrPrevious);
                i5--;
                objArr[i5] = objArrLJIILJJIL;
            }
            Object[] objArrPrevious2 = listIteratorLJIIL.previous();
            int iLJJIJIIJIL = i3 - (((LJJIJIIJIL() >> 5) - 1) - i4);
            if (iLJJIJIIJIL < i3) {
                objArr3 = objArr[iLJJIJIIJIL];
            }
            LJJIJL(collection, i, objArrPrevious2, 32, objArr, iLJJIJIIJIL, objArr3);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final int LJJIIJZLJL(AwS609S0100000_30 awS609S0100000_30, Object[] objArr, int i, int i2, C19975513Dt c19975513Dt, List list, List list2) {
        if (LJIIJJI(objArr)) {
            ((ArrayList) list).add(objArr);
        }
        Object obj = c19975513Dt.LIZ;
        if (obj != null) {
            Object[] objArr2 = (Object[]) obj;
            Object[] objArrLJIIZILJ = objArr2;
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                Object obj2 = objArr[i3];
                if (!((Boolean) awS609S0100000_30.invoke(obj2)).booleanValue()) {
                    if (i2 == 32) {
                        ArrayList arrayList = (ArrayList) list;
                        if (!arrayList.isEmpty()) {
                            objArrLJIIZILJ = (Object[]) ListProtector.remove(list, arrayList.size() - 1);
                        } else {
                            objArrLJIIZILJ = LJIIZILJ();
                        }
                        i2 = 0;
                    }
                    objArrLJIIZILJ[i2] = obj2;
                    i3 = i4;
                    i2++;
                } else {
                    i3 = i4;
                }
            }
            c19975513Dt.LIZ = objArrLJIIZILJ;
            if (objArr2 != objArrLJIIZILJ) {
                ((ArrayList) list2).add(objArr2);
            }
            return i2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final void LJJIJL(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrLJIIZILJ;
        if (i3 >= 1) {
            Object[] objArrLJIILIIL = LJIILIIL(objArr);
            objArr2[0] = objArrLJIILIIL;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = i2 - i4;
            int i6 = size + i5;
            if (i6 < 32) {
                System.arraycopy(objArrLJIILIIL, i4, objArr3, size + 1, i5);
            } else {
                int i7 = (i6 - 32) + 1;
                if (i3 == 1) {
                    objArrLJIIZILJ = objArrLJIILIIL;
                } else {
                    objArrLJIIZILJ = LJIIZILJ();
                    i3--;
                    objArr2[i3] = objArrLJIIZILJ;
                }
                int i8 = i2 - i7;
                System.arraycopy(objArrLJIILIIL, i8, objArr3, 0, i2 - i8);
                System.arraycopy(objArrLJIILIIL, i4, objArrLJIIZILJ, size + 1, i8 - i4);
                objArr3 = objArrLJIIZILJ;
            }
            Iterator<? extends E> it2 = collection.iterator();
            LIZJ(objArrLJIILIIL, i4, it2);
            for (int i9 = 1; i9 < i3; i9++) {
                Object[] objArrLJIIZILJ2 = LJIIZILJ();
                LIZJ(objArrLJIIZILJ2, 0, it2);
                objArr2[i9] = objArrLJIIZILJ2;
            }
            LIZJ(objArr3, 0, it2);
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
