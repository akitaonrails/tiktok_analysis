package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688410u2R implements InterfaceC1673370teB {
    public final InterfaceC1676340tiy LL;
    public final EnumC995460c0m LLILLJJLI;
    public final EnumC1154470g9F LLILLL;

    @Override // X.InterfaceC1676340tiy
    public final Object LJJJ() {
        return this.LL.LJJJ();
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJII(int i) {
        return this.LL.LJJII(i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIIZ(int i) {
        return this.LL.LJJIIZ(i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIJ(int i) {
        return this.LL.LJJIJ(i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIL(int i) {
        return this.LL.LJJIL(i);
    }

    @Override // X.InterfaceC1673370teB
    public final AbstractC1686530tzP LJJJJZ(long j) {
        final int iLJJIJ;
        final int iLJJII;
        final int iLJIIIIZZ = 32767;
        if (this.LLILLL == EnumC1154470g9F.Width) {
            if (this.LLILLJJLI == EnumC995460c0m.Max) {
                iLJJII = this.LL.LJJIL(C1682380tsi.LJII(j));
            } else {
                iLJJII = this.LL.LJJII(C1682380tsi.LJII(j));
            }
            if (C1682380tsi.LIZLLL(j)) {
                iLJIIIIZZ = C1682380tsi.LJII(j);
            }
            return new AbstractC1686530tzP(iLJJII, iLJIIIIZZ) { // from class: X.0u2T
                @Override // X.InterfaceC1678850tn1
                public final int LJJIJL(C115T c115t) {
                    return Integer.MIN_VALUE;
                }

                @Override // X.AbstractC1686530tzP
                public final void LJJLIIIJJIZ(long j2, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
                }

                {
                    LJJLIIJ((((long) iLJIIIIZZ) & 4294967295L) | (((long) iLJJII) << 32));
                }
            };
        }
        if (this.LLILLJJLI == EnumC995460c0m.Max) {
            iLJJIJ = this.LL.LJJIIZ(C1682380tsi.LJIIIIZZ(j));
        } else {
            iLJJIJ = this.LL.LJJIJ(C1682380tsi.LJIIIIZZ(j));
        }
        if (C1682380tsi.LJ(j)) {
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        }
        return new AbstractC1686530tzP(iLJIIIIZZ, iLJJIJ) { // from class: X.0u2T
            @Override // X.InterfaceC1678850tn1
            public final int LJJIJL(C115T c115t) {
                return Integer.MIN_VALUE;
            }

            @Override // X.AbstractC1686530tzP
            public final void LJJLIIIJJIZ(long j2, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
            }

            {
                LJJLIIJ((((long) iLJJIJ) & 4294967295L) | (((long) iLJIIIIZZ) << 32));
            }
        };
    }

    public C1688410u2R(InterfaceC1676340tiy interfaceC1676340tiy, EnumC995460c0m enumC995460c0m, EnumC1154470g9F enumC1154470g9F) {
        this.LL = interfaceC1676340tiy;
        this.LLILLJJLI = enumC995460c0m;
        this.LLILLL = enumC1154470g9F;
    }
}
