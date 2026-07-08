package X;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19975813Dw<E> extends AbstractC19975913Dx<E> {
    public final Object[] LLILLJJLI;
    public final Object[] LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    @Override // X.C13E1
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final C19975613Du<E> builder() {
        return new C19975613Du<>(this, this.LLILLJJLI, this.LLILLL, this.LLILZIL);
    }

    public final int LJIIZILJ() {
        return (LIZJ() - 1) & (-32);
    }

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZ;
    }

    @Override // X.C13E1
    public final C13E1 LJIILLIIL(AwS609S0100000_30 awS609S0100000_30) {
        C19975613Du<E> c19975613DuBuilder = builder();
        c19975613DuBuilder.LJJIJ(awS609S0100000_30);
        return c19975613DuBuilder.LIZJ();
    }

    @Override // X.C13E1
    public final C13E1<E> LJZI(int i) {
        C19973813Dc.LIZ(i, this.LLILZ);
        int iLJIIZILJ = LJIIZILJ();
        if (i >= iLJIIZILJ) {
            return LJIILJJIL(iLJIIZILJ, this.LLILZIL, i - iLJIIZILJ, this.LLILLJJLI);
        }
        return LJIILJJIL(iLJIIZILJ, this.LLILZIL, 0, LJIILIIL(this.LLILLJJLI, this.LLILZIL, i, new C13E5(this.LLILLL[0])));
    }

    @Override // java.util.Collection, java.util.List, X.C13E1
    public final C13E1<E> add(E e) {
        int iLJIIZILJ = this.LLILZ - LJIIZILJ();
        if (iLJIIZILJ < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.LLILLL, 32);
            objArrCopyOf[iLJIIZILJ] = e;
            return new C19975813Dw(this.LLILZ + 1, this.LLILZIL, this.LLILLJJLI, objArrCopyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = e;
        return LJIIJJI(this.LLILLJJLI, this.LLILLL, objArr);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C19973813Dc.LIZ(i, LIZJ());
        if (LJIIZILJ() <= i) {
            objArr = this.LLILLL;
        } else {
            objArr = this.LLILLJJLI;
            for (int i2 = this.LLILZIL; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[(i >> i2) & 31];
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<E> listIterator(final int i) {
        C19973813Dc.LIZIZ(i, LIZJ());
        final Object[] objArr = this.LLILLJJLI;
        final Object[] objArr2 = this.LLILLL;
        final int iLIZJ = LIZJ();
        final int i2 = (this.LLILZIL / 5) + 1;
        return new C13E2<T>(i, iLIZJ, i2, objArr, objArr2) { // from class: X.13Dz
            public final T[] LLILLL;
            public final C13E0<T> LLILZ;

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (this.LLILZ.hasNext()) {
                    this.LL++;
                    return this.LLILZ.next();
                }
                T[] tArr = this.LLILLL;
                int i3 = this.LL;
                this.LL = i3 + 1;
                return tArr[i3 - this.LLILZ.LLILLJJLI];
            }

            @Override // java.util.ListIterator
            public final T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.LL;
                C13E0<T> c13e0 = this.LLILZ;
                int i4 = c13e0.LLILLJJLI;
                if (i3 <= i4) {
                    this.LL = i3 - 1;
                    return c13e0.previous();
                }
                T[] tArr = this.LLILLL;
                int i5 = i3 - 1;
                this.LL = i5;
                return tArr[i5 - i4];
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(i, iLIZJ);
                this.LLILLL = objArr2;
                int i3 = (iLIZJ - 1) & (-32);
                this.LLILZ = new C13E0<>(i > i3 ? i3 : i, i3, i2, objArr);
            }
        };
    }

    @Override // java.util.List, X.C13E1
    public final C13E1<E> add(int i, E e) {
        C19973813Dc.LIZIZ(i, LIZJ());
        if (i == LIZJ()) {
            return add((Object) e);
        }
        int iLJIIZILJ = LJIIZILJ();
        if (i >= iLJIIZILJ) {
            return LJIIIIZZ(i - iLJIIZILJ, e, this.LLILLJJLI);
        }
        C13E5 c13e5 = new C13E5(null);
        return LJIIIIZZ(0, c13e5.LIZ, LJFF(this.LLILLJJLI, this.LLILZIL, i, e, c13e5));
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final C13E1<E> set(int i, E e) {
        C19973813Dc.LIZ(i, LIZJ());
        if (LJIIZILJ() <= i) {
            Object[] objArrCopyOf = Arrays.copyOf(this.LLILLL, 32);
            objArrCopyOf[i & 31] = e;
            return new C19975813Dw(LIZJ(), this.LLILZIL, this.LLILLJJLI, objArrCopyOf);
        }
        return new C19975813Dw(LIZJ(), this.LLILZIL, LJIJ(this.LLILZIL, i, e, this.LLILLJJLI), this.LLILLL);
    }

    public final C19975813Dw LJIIIIZZ(int i, Object obj, Object[] objArr) {
        int iLJIIZILJ = this.LLILZ - LJIIZILJ();
        Object[] objArrCopyOf = Arrays.copyOf(this.LLILLL, 32);
        if (iLJIIZILJ < 32) {
            System.arraycopy(this.LLILLL, i, objArrCopyOf, i + 1, iLJIIZILJ - i);
            objArrCopyOf[i] = obj;
            return new C19975813Dw(this.LLILZ + 1, this.LLILZIL, objArr, objArrCopyOf);
        }
        Object[] objArr2 = this.LLILLL;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, objArrCopyOf, i + 1, (iLJIIZILJ - 1) - i);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return LJIIJJI(objArr, objArrCopyOf, objArr3);
    }

    public final C19975813Dw<E> LJIIJJI(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.LLILZ >> 5;
        int i2 = this.LLILZIL;
        if (i > (1 << i2)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i3 = i2 + 5;
            return new C19975813Dw<>(this.LLILZ + 1, i3, LJIIL(i3, objArr4, objArr2), objArr3);
        }
        return new C19975813Dw<>(this.LLILZ + 1, this.LLILZIL, LJIIL(i2, objArr, objArr2), objArr3);
    }

    public final Object[] LJIIL(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iLIZJ = ((LIZJ() - 1) >> i) & 31;
        if (objArr == null || (objArrCopyOf = Arrays.copyOf(objArr, 32)) == null) {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[iLIZJ] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iLIZJ] = LJIIL(i - 5, (Object[]) objArrCopyOf[iLIZJ], objArr2);
        return objArrCopyOf;
    }

    public C19975813Dw(int i, int i2, Object[] objArr, Object[] objArr2) {
        this.LLILLJJLI = objArr;
        this.LLILLL = objArr2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        if (LIZJ() <= 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Trie-based persistent vector should have at least 33 elements, got ");
            sbLIZ.append(LIZJ());
            C13D4.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final Object[] LJIIIZ(Object[] objArr, int i, int i2, C13E5 c13e5) {
        Object[] objArrLJIIIZ;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            c13e5.LIZ = objArr[i3];
            objArrLJIIIZ = null;
        } else {
            objArrLJIIIZ = LJIIIZ((Object[]) objArr[i3], i - 5, i2, c13e5);
            if (objArrLJIIIZ == null) {
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
            objArrCopyOf[i3] = objArrLJIIIZ;
            return objArrCopyOf;
        }
        if (i3 == 0) {
            return null;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2[i3] = objArrLJIIIZ;
        return objArrCopyOf2;
    }

    public final Object[] LJIILIIL(Object[] objArr, int i, int i2, C13E5 c13e5) {
        Object[] objArrCopyOf;
        int iLJIIZILJ = 31;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
            }
            int i4 = i3 + 1;
            System.arraycopy(objArr, i4, objArrCopyOf, i3, 32 - i4);
            objArrCopyOf[31] = c13e5.LIZ;
            c13e5.LIZ = objArr[i3];
            return objArrCopyOf;
        }
        if (objArr[31] == null) {
            iLJIIZILJ = 31 & ((LJIIZILJ() - 1) >> i);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= iLJIIZILJ) {
            while (true) {
                objArrCopyOf2[iLJIIZILJ] = LJIILIIL((Object[]) objArrCopyOf2[iLJIIZILJ], i5, 0, c13e5);
                if (iLJIIZILJ == i6) {
                    break;
                }
                iLJIIZILJ--;
            }
        }
        objArrCopyOf2[i3] = LJIILIIL((Object[]) objArrCopyOf2[i3], i5, i2, c13e5);
        return objArrCopyOf2;
    }

    public final AbstractC19975913Dx LJIILJJIL(int i, int i2, int i3, Object[] objArr) {
        int i4 = this.LLILZ - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new C19975713Dv(objArr);
            }
            C13E5 c13e5 = new C13E5(null);
            Object[] objArrLJIIIZ = LJIIIZ(objArr, i2, i - 1, c13e5);
            Object[] objArr2 = (Object[]) c13e5.LIZ;
            if (objArrLJIIIZ[1] == null) {
                return new C19975813Dw(i, i2 - 5, (Object[]) objArrLJIIIZ[0], objArr2);
            }
            return new C19975813Dw(i, i2, objArrLJIIIZ, objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.LLILLL, 32);
        int i5 = i4 - 1;
        if (i3 < i5) {
            int i6 = i3 + 1;
            System.arraycopy(this.LLILLL, i6, objArrCopyOf, i3, i4 - i6);
        }
        objArrCopyOf[i5] = null;
        return new C19975813Dw((i + i4) - 1, i2, objArr, objArrCopyOf);
    }

    public final Object[] LJIJ(int i, int i2, Object obj, Object[] objArr) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        objArrCopyOf[i3] = LJIJ(i - 5, i2, obj, (Object[]) objArrCopyOf[i3]);
        return objArrCopyOf;
    }

    public final Object[] LJFF(Object[] objArr, int i, int i2, Object obj, C13E5 c13e5) {
        Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
            }
            System.arraycopy(objArr, i3, objArrCopyOf, i3 + 1, 31 - i3);
            c13e5.LIZ = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        objArrCopyOf2[i3] = LJFF((Object[]) objArr[i3], i4, i2, obj, c13e5);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            objArrCopyOf2[i3] = LJFF((Object[]) objArr[i3], i4, 0, c13e5.LIZ, c13e5);
        }
        return objArrCopyOf2;
    }
}
