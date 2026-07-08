package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0u52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690020u52 implements C06XG, InterfaceC1689980u4y {
    public final int LIZ;
    public final List<AbstractC1686530tzP> LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC1666960tTq LIZLLL;
    public final InterfaceC1682270tsX LJ;
    public final EnumC1671200tag LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ;
    public final Object LJIIJJI;
    public final Object LJIIL;
    public final LazyLayoutItemAnimator<C1690020u52> LJIILIIL;
    public final long LJIILJJIL;
    public int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public final int[] LJJI;

    public C1690020u52() {
        throw null;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LJII() {
        return 0;
    }

    @Override // X.InterfaceC1689980u4y
    public final void LJIIJJI() {
        this.LJIJJ = true;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LIZIZ() {
        return this.LIZIZ.size();
    }

    @Override // X.InterfaceC1689980u4y
    public final long LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1689980u4y
    public final boolean LJ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1689980u4y
    public final boolean LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LJI() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1689980u4y
    public final int LJIILIIL() {
        return this.LJIIZILJ;
    }

    @Override // X.C06XG, X.InterfaceC1689980u4y
    public final int getIndex() {
        return this.LIZ;
    }

    @Override // X.C06XG, X.InterfaceC1689980u4y
    public final Object getKey() {
        return this.LJIIJJI;
    }

    @Override // X.C06XG
    public final int getOffset() {
        return this.LJIILL;
    }

    @Override // X.C06XG
    public final int getSize() {
        return this.LJIILLIIL;
    }

    public final int LIZ(long j) {
        if (this.LIZJ) {
            return C1676820tjk.LIZJ(j);
        }
        return (int) (j >> 32);
    }

    @Override // X.InterfaceC1689980u4y
    public final long LJIIIZ(int i) {
        int[] iArr = this.LJJI;
        int i2 = i * 2;
        return (((long) iArr[i2]) << 32) | (((long) iArr[i2 + 1]) & 4294967295L);
    }

    @Override // X.InterfaceC1689980u4y
    public final Object LJIILJJIL(int i) {
        return ((AbstractC1686530tzP) ListProtector.get(this.LIZIZ, i)).LJJJ();
    }

    public final void LJIIIIZZ(AbstractC1683310tuD abstractC1683310tuD, boolean z) {
        int i;
        int i2;
        if (this.LJIJJLI == Integer.MIN_VALUE) {
            C1691080u6k.LIZ("position() should be called first");
        }
        int iLIZIZ = LIZIZ();
        for (int i3 = 0; i3 < iLIZIZ; i3++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(this.LIZIZ, i3);
            int i4 = this.LJIL;
            if (this.LIZJ) {
                i = abstractC1686530tzP.LLILLJJLI;
            } else {
                i = abstractC1686530tzP.LL;
            }
            int i5 = i4 - i;
            int i6 = this.LJJ;
            long jLJIIIZ = LJIIIZ(i3);
            C1686480tzK c1686480tzKLIZ = this.LJIILIIL.LIZ(i3, this.LJIIJJI);
            C1695970uEd c1695970uEd = null;
            if (c1686480tzKLIZ != null) {
                if (z) {
                    c1686480tzKLIZ.LJIIZILJ = jLJIIIZ;
                } else {
                    if (!C1676820tjk.LIZIZ(c1686480tzKLIZ.LJIIZILJ, C1686480tzK.LJIJ)) {
                        jLJIIIZ = c1686480tzKLIZ.LJIIZILJ;
                    }
                    long jLJ = C1676820tjk.LJ(jLJIIIZ, ((C1676820tjk) ((C13FE) c1686480tzKLIZ.LJIILLIIL).getValue()).LIZ);
                    if (((LIZ(jLJIIIZ) <= i5 && LIZ(jLJ) <= i5) || (LIZ(jLJIIIZ) >= i6 && LIZ(jLJ) >= i6)) && ((Boolean) ((C13FE) c1686480tzKLIZ.LJII).getValue()).booleanValue()) {
                        C23250099c.LIZLLL(c1686480tzKLIZ.LIZ, null, null, new C1686440tzG(c1686480tzKLIZ, null), 3);
                    }
                    jLJIIIZ = jLJ;
                }
                c1695970uEd = c1686480tzKLIZ.LJIILIIL;
            }
            if (this.LJI) {
                if (this.LIZJ) {
                    int i7 = (int) (jLJIIIZ >> 32);
                    int iLIZJ = this.LJIJJLI - C1676820tjk.LIZJ(jLJIIIZ);
                    if (this.LIZJ) {
                        i2 = abstractC1686530tzP.LLILLJJLI;
                    } else {
                        i2 = abstractC1686530tzP.LL;
                    }
                    jLJIIIZ = (((long) (iLIZJ - i2)) & 4294967295L) | (((long) i7) << 32);
                } else {
                    jLJIIIZ = (((long) ((this.LJIJJLI - ((int) (jLJIIIZ >> 32))) - abstractC1686530tzP.LL)) << 32) | (4294967295L & ((long) C1676820tjk.LIZJ(jLJIIIZ)));
                }
            }
            long jLJ2 = C1676820tjk.LJ(jLJIIIZ, this.LJIIJ);
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

    public final void LJIIJ(int i, int i2, int i3) {
        int i4;
        int i5;
        this.LJIILL = i;
        if (this.LIZJ) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.LJIJJLI = i4;
        List<AbstractC1686530tzP> list = this.LIZIZ;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(list, i6);
            int i7 = i6 * 2;
            if (this.LIZJ) {
                int[] iArr = this.LJJI;
                InterfaceC1666960tTq interfaceC1666960tTq = this.LIZLLL;
                if (interfaceC1666960tTq != null) {
                    iArr[i7] = interfaceC1666960tTq.LIZ(abstractC1686530tzP.LL, i2, this.LJFF);
                    this.LJJI[i7 + 1] = i;
                    i5 = abstractC1686530tzP.LLILLJJLI;
                } else {
                    C1691080u6k.LIZIZ("null horizontalAlignment when isVertical == true");
                    throw new C2197108jB();
                }
            } else {
                int[] iArr2 = this.LJJI;
                iArr2[i7] = i;
                int i8 = i7 + 1;
                InterfaceC1682270tsX interfaceC1682270tsX = this.LJ;
                if (interfaceC1682270tsX != null) {
                    iArr2[i8] = interfaceC1682270tsX.LIZ(abstractC1686530tzP.LLILLJJLI, i3);
                    i5 = abstractC1686530tzP.LL;
                } else {
                    C1691080u6k.LIZIZ("null verticalAlignment when isVertical == false");
                    throw new C2197108jB();
                }
            }
            i += i5;
        }
        this.LJIL = -this.LJII;
        this.LJJ = this.LJIJJLI + this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1689980u4y
    public final void LIZJ(int i, int i2, int i3, int i4) {
        LJIIJ(i, i3, i4);
    }

    public C1690020u52(int i, List list, boolean z, InterfaceC1666960tTq interfaceC1666960tTq, InterfaceC1682270tsX interfaceC1682270tsX, EnumC1671200tag enumC1671200tag, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        int i5;
        int i6;
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = interfaceC1666960tTq;
        this.LJ = interfaceC1682270tsX;
        this.LJFF = enumC1671200tag;
        this.LJI = z2;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = j;
        this.LJIIJJI = obj;
        this.LJIIL = obj2;
        this.LJIILIIL = lazyLayoutItemAnimator;
        this.LJIILJJIL = j2;
        this.LJIIZILJ = 1;
        this.LJIJJLI = Integer.MIN_VALUE;
        int size = list.size();
        int i7 = 0;
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(list, i8);
            boolean z3 = this.LIZJ;
            if (z3) {
                i5 = abstractC1686530tzP.LLILLJJLI;
            } else {
                i5 = abstractC1686530tzP.LL;
            }
            i7 += i5;
            if (!z3) {
                i6 = abstractC1686530tzP.LLILLJJLI;
            } else {
                i6 = abstractC1686530tzP.LL;
            }
            iMax = Math.max(iMax, i6);
        }
        this.LJIILLIIL = i7;
        int i9 = i7 + this.LJIIIZ;
        this.LJIJ = i9 >= 0 ? i9 : 0;
        this.LJIJI = iMax;
        this.LJJI = new int[this.LIZIZ.size() * 2];
    }
}
