package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690040u54 implements InterfaceC1685110tx7, InterfaceC1690350u5Z {
    public final C1690210u5L LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final InterfaceC1690350u5Z LJ;
    public final float LJFF;
    public final boolean LJI;
    public final InterfaceC497601wk LJII;
    public final InterfaceC1690500u5o LJIIIIZZ;
    public final int LJIIIZ;
    public final Function1<Integer, List<Pair<Integer, C1682380tsi>>> LJIIJ;
    public final List<C1690030u53> LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final boolean LJIILL;
    public final EnumC1684030tvN LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;

    @Override // X.InterfaceC1690350u5Z
    public final Map<C115T, Integer> LJIILL() {
        return this.LJ.LJIILL();
    }

    @Override // X.InterfaceC1690350u5Z
    public final void LJIILLIIL() {
        this.LJ.LJIILLIIL();
    }

    @Override // X.InterfaceC1690350u5Z
    public final Function1<Object, Unit> LJIIZILJ() {
        return this.LJ.LJIIZILJ();
    }

    @Override // X.InterfaceC1690350u5Z
    public final int getHeight() {
        return this.LJ.getHeight();
    }

    @Override // X.InterfaceC1690350u5Z
    public final int getWidth() {
        return this.LJ.getWidth();
    }

    @Override // X.InterfaceC1685110tx7
    public final int LIZJ() {
        return -this.LJIIL;
    }

    @Override // X.InterfaceC1685110tx7
    public final long LIZ() {
        int width = getWidth();
        return (((long) getHeight()) & 4294967295L) | (((long) width) << 32);
    }

    @Override // X.InterfaceC1685110tx7
    public final int LIZIZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1685110tx7
    public final int LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1685110tx7
    public final int LJ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1685110tx7
    public final int LJFF() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1685110tx7
    public final int LJI() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1685110tx7
    public final List<C1690030u53> LJII() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1685110tx7
    public final EnumC1684030tvN getOrientation() {
        return this.LJIILLIIL;
    }

    public final C1690040u54 LJIIIIZZ(int i, boolean z) {
        C1690210u5L c1690210u5L;
        boolean z2;
        int iIntValue;
        if (!this.LJI && !this.LJIIJJI.isEmpty() && (c1690210u5L = this.LIZ) != null) {
            int i2 = c1690210u5L.LJII;
            int i3 = this.LIZIZ - i;
            if (i3 >= 0 && i3 < i2) {
                C1690030u53 c1690030u53 = (C1690030u53) C13LP.LJJJJZI(this.LJIIJJI);
                C1690030u53 c1690030u532 = (C1690030u53) C13LP.LJJLIIIJJI(this.LJIIJJI);
                if (!c1690030u53.LJJI && !c1690030u532.LJJI && (i >= 0 ? Math.min(this.LJIIL - C1685170txD.LIZ(c1690030u53, this.LJIILLIIL), this.LJIILIIL - C1685170txD.LIZ(c1690030u532, this.LJIILLIIL)) > i : Math.min((C1685170txD.LIZ(c1690030u53, this.LJIILLIIL) + c1690030u53.LJIILLIIL) - this.LJIIL, (C1685170txD.LIZ(c1690030u532, this.LJIILLIIL) + c1690030u532.LJIILLIIL) - this.LJIILIIL) > (-i))) {
                    List<C1690030u53> list = this.LJIIJJI;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C1690030u53 c1690030u533 = (C1690030u53) ListProtector.get(list, i4);
                        if (!c1690030u533.LJJI) {
                            long j = c1690030u533.LJIJJLI;
                            boolean z3 = c1690030u533.LIZJ;
                            int i5 = (int) (j >> 32);
                            if (!z3) {
                                i5 += i;
                            }
                            int iLIZJ = C1676820tjk.LIZJ(j);
                            if (z3) {
                                iLIZJ += i;
                            }
                            c1690030u533.LJIJJLI = (((long) i5) << 32) | (((long) iLIZJ) & 4294967295L);
                            if (z) {
                                int iLIZIZ = c1690030u533.LIZIZ();
                                for (int i6 = 0; i6 < iLIZIZ; i6++) {
                                    C1686480tzK c1686480tzKLIZ = c1690030u533.LJIIJJI.LIZ(i6, c1690030u533.LIZIZ);
                                    if (c1686480tzKLIZ != null) {
                                        long j2 = c1686480tzKLIZ.LJIIJJI;
                                        long j3 = j2 >> 32;
                                        if (c1690030u533.LIZJ) {
                                            iIntValue = (int) j3;
                                        } else {
                                            iIntValue = Integer.valueOf(((int) j3) + i).intValue();
                                        }
                                        boolean z4 = c1690030u533.LIZJ;
                                        int iLIZJ2 = C1676820tjk.LIZJ(j2);
                                        if (z4) {
                                            iLIZJ2 = Integer.valueOf(iLIZJ2 + i).intValue();
                                        }
                                        c1686480tzKLIZ.LJIIJJI = (((long) iLIZJ2) & 4294967295L) | (((long) iIntValue) << 32);
                                    }
                                }
                            }
                        }
                    }
                    C1690210u5L c1690210u5L2 = this.LIZ;
                    int i7 = this.LIZIZ - i;
                    if (!this.LIZJ && i <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    return new C1690040u54(c1690210u5L2, i7, z2, i, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1690040u54(C1690210u5L c1690210u5L, int i, boolean z, float f, InterfaceC1690350u5Z interfaceC1690350u5Z, float f2, boolean z2, InterfaceC497601wk interfaceC497601wk, InterfaceC1690500u5o interfaceC1690500u5o, int i2, Function1<? super Integer, ? extends List<Pair<Integer, C1682380tsi>>> function1, List<C1690030u53> list, int i3, int i4, int i5, boolean z3, EnumC1684030tvN enumC1684030tvN, int i6, int i7) {
        this.LIZ = c1690210u5L;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = interfaceC1690350u5Z;
        this.LJFF = f2;
        this.LJI = z2;
        this.LJII = interfaceC497601wk;
        this.LJIIIIZZ = interfaceC1690500u5o;
        this.LJIIIZ = i2;
        this.LJIIJ = function1;
        this.LJIIJJI = list;
        this.LJIIL = i3;
        this.LJIILIIL = i4;
        this.LJIILJJIL = i5;
        this.LJIILL = z3;
        this.LJIILLIIL = enumC1684030tvN;
        this.LJIIZILJ = i6;
        this.LJIJ = i7;
    }
}
