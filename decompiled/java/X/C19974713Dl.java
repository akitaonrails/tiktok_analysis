package X;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19974713Dl<E> extends AbstractC19974413Di<E> {
    public final Object[] LLILLJJLI;
    public final Object[] LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    @Override // X.InterfaceC1664360tPe
    public final C19974813Dm builder() {
        return new C19974813Dm(this, this.LLILLJJLI, this.LLILLL, this.LLILZIL);
    }

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C19973913Dd.LIZ(i, this.LLILZ);
        if (((LIZJ() - 1) & (-32)) <= i) {
            objArr = this.LLILLL;
        } else {
            objArr = this.LLILLJJLI;
            for (int i2 = this.LLILZIL; i2 > 0; i2 -= 5) {
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

    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<E> listIterator(final int i) {
        C19973913Dd.LIZIZ(i, LIZJ());
        final Object[] objArr = this.LLILLJJLI;
        final Object[] objArr2 = this.LLILLL;
        final int iLIZJ = LIZJ();
        final int i2 = (this.LLILZIL / 5) + 1;
        return new AbstractC19975213Dq<T>(i, iLIZJ, i2, objArr, objArr2) { // from class: X.13Dp
            public final T[] LLILLL;
            public final C19975013Do<T> LLILZ;

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
                C19975013Do<T> c19975013Do = this.LLILZ;
                int i4 = c19975013Do.LLILLJJLI;
                if (i3 <= i4) {
                    this.LL = i3 - 1;
                    return c19975013Do.previous();
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
                this.LLILZ = new C19975013Do<>(i > i3 ? i3 : i, i3, i2, objArr);
            }
        };
    }

    @Override // X.InterfaceC1664360tPe
    public final InterfaceC1664360tPe LJLJJLL(int i, C1350505Qh c1350505Qh) {
        C19973913Dd.LIZ(i, this.LLILZ);
        if (((LIZJ() - 1) & (-32)) <= i) {
            Object[] objArrCopyOf = Arrays.copyOf(this.LLILLL, 32);
            objArrCopyOf[i & 31] = c1350505Qh;
            return new C19974713Dl(this.LLILZ, this.LLILZIL, this.LLILLJJLI, objArrCopyOf);
        }
        return new C19974713Dl(this.LLILZ, this.LLILZIL, LJ(this.LLILZIL, i, c1350505Qh, this.LLILLJJLI), this.LLILLL);
    }

    public C19974713Dl(int i, int i2, Object[] objArr, Object[] objArr2) {
        this.LLILLJJLI = objArr;
        this.LLILLL = objArr2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        if (LIZJ() > 32) {
            return;
        }
        String strLJIIJJI = Intrinsics.LJIIJJI(Integer.valueOf(LIZJ()), "Trie-based persistent vector should have at least 33 elements, got ");
        strLJIIJJI.toString();
        throw new IllegalArgumentException(strLJIIJJI);
    }

    public final Object[] LJ(int i, int i2, Object obj, Object[] objArr) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[i3];
        if (obj2 != null) {
            objArrCopyOf[i3] = LJ(i - 5, i2, obj, (Object[]) obj2);
            return objArrCopyOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
}
