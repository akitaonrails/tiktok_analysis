package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0u53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690030u53 implements InterfaceC1685080tx4, InterfaceC1689980u4y {
    public final int LIZ;
    public final Object LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final EnumC1671200tag LJFF;
    public final int LJI;
    public final int LJII;
    public final List<AbstractC1686530tzP> LJIIIIZZ;
    public final long LJIIIZ;
    public final Object LJIIJ;
    public final LazyLayoutItemAnimator<C1690030u53> LJIIJJI;
    public final long LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public final long LJIJJ;
    public long LJIJJLI;
    public int LJIL;
    public int LJJ;
    public boolean LJJI;

    public C1690030u53() {
        throw null;
    }

    @Override // X.InterfaceC1689980u4y
    public final void LJIIJJI() {
        this.LJJI = true;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LIZIZ() {
        return this.LJIIIIZZ.size();
    }

    @Override // X.InterfaceC1685080tx4
    public final long LIZ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1689980u4y
    public final long LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1689980u4y
    public final boolean LJ() {
        return this.LJJI;
    }

    @Override // X.InterfaceC1689980u4y
    public final boolean LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LJII() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1685080tx4
    public final int LJIIIIZZ() {
        return this.LJIL;
    }

    @Override // X.InterfaceC1685080tx4
    public final int LJIIJ() {
        return this.LJJ;
    }

    @Override // X.InterfaceC1685080tx4
    public final long LJIIL() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LJIILIIL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1685080tx4, X.InterfaceC1689980u4y
    public final int getIndex() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1689980u4y
    public final Object getKey() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1689980u4y
    public final long LJIIIZ(int i) {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1689980u4y
    public final Object LJIILJJIL(int i) {
        return ((AbstractC1686530tzP) ListProtector.get(this.LJIIIIZZ, i)).LJJJ();
    }

    public final int LJIILL(long j) {
        if (this.LIZJ) {
            return C1676820tjk.LIZJ(j);
        }
        return (int) (j >> 32);
    }

    public final void LJIILLIIL(AbstractC1683310tuD abstractC1683310tuD, boolean z) {
        int i;
        int iLIZJ;
        int i2;
        long j;
        if (this.LJIIZILJ == Integer.MIN_VALUE) {
            C1691080u6k.LIZ("position() should be called first");
        }
        int iLIZIZ = LIZIZ();
        for (int i3 = 0; i3 < iLIZIZ; i3++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(this.LJIIIIZZ, i3);
            int i4 = this.LJIJ;
            if (this.LIZJ) {
                i = abstractC1686530tzP.LLILLJJLI;
            } else {
                i = abstractC1686530tzP.LL;
            }
            int i5 = i4 - i;
            int i6 = this.LJIJI;
            long j2 = this.LJIJJLI;
            C1686480tzK c1686480tzKLIZ = this.LJIIJJI.LIZ(i3, this.LIZIZ);
            C1695970uEd c1695970uEd = null;
            if (c1686480tzKLIZ != null) {
                if (z) {
                    c1686480tzKLIZ.LJIIZILJ = j2;
                } else {
                    if (!C1676820tjk.LIZIZ(c1686480tzKLIZ.LJIIZILJ, C1686480tzK.LJIJ)) {
                        j = c1686480tzKLIZ.LJIIZILJ;
                    } else {
                        j = j2;
                    }
                    long jLJ = C1676820tjk.LJ(j, ((C1676820tjk) ((C13FE) c1686480tzKLIZ.LJIILLIIL).getValue()).LIZ);
                    if (((LJIILL(j2) <= i5 && LJIILL(jLJ) <= i5) || (LJIILL(j2) >= i6 && LJIILL(jLJ) >= i6)) && ((Boolean) ((C13FE) c1686480tzKLIZ.LJII).getValue()).booleanValue()) {
                        C23250099c.LIZLLL(c1686480tzKLIZ.LIZ, null, null, new C1686440tzG(c1686480tzKLIZ, null), 3);
                    }
                    j2 = jLJ;
                }
                c1695970uEd = c1686480tzKLIZ.LJIILIIL;
            }
            if (this.LJ) {
                int i7 = (int) (j2 >> 32);
                if (this.LIZJ) {
                    int iLIZJ2 = this.LJIIZILJ - C1676820tjk.LIZJ(j2);
                    if (this.LIZJ) {
                        i2 = abstractC1686530tzP.LLILLJJLI;
                    } else {
                        i2 = abstractC1686530tzP.LL;
                    }
                    iLIZJ = iLIZJ2 - i2;
                } else {
                    i7 = (this.LJIIZILJ - i7) - abstractC1686530tzP.LL;
                    iLIZJ = C1676820tjk.LIZJ(j2);
                }
                j2 = (((long) iLIZJ) & 4294967295L) | (((long) i7) << 32);
            }
            long jLJ2 = C1676820tjk.LJ(j2, this.LJIIIZ);
            if (!z && c1686480tzKLIZ != null) {
                c1686480tzKLIZ.LJIIL = jLJ2;
            }
            if (this.LIZJ) {
                if (c1695970uEd != null) {
                    abstractC1683310tuD.getClass();
                    AbstractC1683310tuD.LIZ(abstractC1683310tuD, abstractC1686530tzP);
                    abstractC1686530tzP.LJJLIIIJJI(C1676820tjk.LJ(jLJ2, abstractC1686530tzP.LLILZIL), 0.0f, c1695970uEd);
                } else {
                    AbstractC1683310tuD.LJIIJJI(abstractC1683310tuD, abstractC1686530tzP, jLJ2);
                }
            } else if (c1695970uEd != null) {
                AbstractC1683310tuD.LJIIIIZZ(abstractC1683310tuD, abstractC1686530tzP, jLJ2, c1695970uEd);
            } else {
                AbstractC1683310tuD.LJII(abstractC1683310tuD, abstractC1686530tzP, jLJ2);
            }
        }
    }

    @Override // X.InterfaceC1689980u4y
    public final void LIZJ(int i, int i2, int i3, int i4) {
        LJIIZILJ(i, i2, i3, i4, -1, -1);
    }

    public final void LJIIZILJ(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        boolean z = this.LIZJ;
        if (!z) {
            i4 = i3;
        }
        this.LJIIZILJ = i4;
        if (z && this.LJFF == EnumC1671200tag.Rtl) {
            i2 = (i3 - i2) - this.LIZLLL;
        }
        if (z) {
            j = (((long) i) & 4294967295L) | (((long) i2) << 32);
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.LJIJJLI = j;
        this.LJIL = i5;
        this.LJJ = i6;
        this.LJIJ = -this.LJI;
        this.LJIJI = i4 + this.LJII;
    }

    public C1690030u53(int i, Object obj, boolean z, int i2, int i3, boolean z2, EnumC1671200tag enumC1671200tag, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        long j3;
        int i8;
        this.LIZ = i;
        this.LIZIZ = obj;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = z2;
        this.LJFF = enumC1671200tag;
        this.LJI = i4;
        this.LJII = i5;
        this.LJIIIIZZ = list;
        this.LJIIIZ = j;
        this.LJIIJ = obj2;
        this.LJIIJJI = lazyLayoutItemAnimator;
        this.LJIIL = j2;
        this.LJIILIIL = i6;
        this.LJIILJJIL = i7;
        this.LJIIZILJ = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(list, i9);
            if (this.LIZJ) {
                i8 = abstractC1686530tzP.LLILLJJLI;
            } else {
                i8 = abstractC1686530tzP.LL;
            }
            iMax = Math.max(iMax, i8);
        }
        this.LJIILL = iMax;
        int i10 = iMax + i3;
        this.LJIILLIIL = i10 >= 0 ? i10 : 0;
        if (this.LIZJ) {
            j3 = (((long) iMax) & 4294967295L) | (((long) this.LIZLLL) << 32);
        } else {
            j3 = (((long) this.LIZLLL) & 4294967295L) | (((long) iMax) << 32);
        }
        this.LJIJJ = j3;
        this.LJIJJLI = 0L;
        this.LJIL = -1;
        this.LJJ = -1;
    }
}
