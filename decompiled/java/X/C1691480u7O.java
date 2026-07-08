package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS106S0201000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0u7O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691480u7O extends AbstractC20055413dY implements InterfaceC20052813d8, InterfaceC20051113cr {
    public C1689390u41 LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LLIIJI() {
        return false;
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        C1212320heY<Boolean> c1212320heY = C1696500uFU.LJIILIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
        Boolean bool = Boolean.TRUE;
        c1212320heY.getClass();
        interfaceC1692460u8y.LIZJ(c1212320heY, bool);
        C1869430ykP c1869430ykP = new C1869430ykP(new AwS569S0100000_25(this, 819), new AwS569S0100000_25(this, 820), this.LLJJI);
        if (this.LLJJIII) {
            C1212320heY<C1869430ykP> c1212320heY2 = C1696500uFU.LJIJJ;
            c1212320heY2.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY2, c1869430ykP);
        } else {
            C1212320heY<C1869430ykP> c1212320heY3 = C1696500uFU.LJIJI;
            c1212320heY3.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY3, c1869430ykP);
        }
    }

    public C1691480u7O(C1689390u41 c1689390u41, boolean z, boolean z2) {
        this.LLJJ = c1689390u41;
        this.LLJJI = z;
        this.LLJJIII = z2;
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (!this.LLJJIII) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1676340tiy.LJJIJ(i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (!this.LLJJIII) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1676340tiy.LJJIIZ(i);
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        EnumC1684030tvN enumC1684030tvN;
        int iLJII;
        Function1<Object, Unit> function1LJ;
        int i;
        if (this.LLJJIII) {
            enumC1684030tvN = EnumC1684030tvN.Vertical;
        } else {
            enumC1684030tvN = EnumC1684030tvN.Horizontal;
        }
        C1690410u5f.LIZ(j, enumC1684030tvN);
        int iLJIIIIZZ = Integer.MAX_VALUE;
        if (this.LLJJIII) {
            iLJII = Integer.MAX_VALUE;
        } else {
            iLJII = C1682380tsi.LJII(j);
        }
        if (this.LLJJIII) {
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682380tsi.LIZ(C1682380tsi.LJIIJ(j), iLJIIIIZZ, C1682380tsi.LJIIIZ(j), iLJII));
        int i2 = abstractC1686530tzPLJJJJZ.LL;
        int iLJIIIIZZ2 = C1682380tsi.LJIIIIZZ(j);
        if (i2 > iLJIIIIZZ2) {
            i2 = iLJIIIIZZ2;
        }
        int i3 = abstractC1686530tzPLJJJJZ.LLILLJJLI;
        int iLJII2 = C1682380tsi.LJII(j);
        if (i3 > iLJII2) {
            i3 = iLJII2;
        }
        int i4 = abstractC1686530tzPLJJJJZ.LLILLJJLI - i3;
        int i5 = abstractC1686530tzPLJJJJZ.LL - i2;
        if (!this.LLJJIII) {
            i4 = i5;
        }
        C1689390u41 c1689390u41 = this.LLJJ;
        ((C13FG) c1689390u41.LIZLLL).LJIIJ(i4);
        C13YG c13ygLIZ = C13YI.LIZ();
        if (c13ygLIZ != null) {
            function1LJ = c13ygLIZ.LJ();
        } else {
            function1LJ = null;
        }
        C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
        try {
            if (c1689390u41.LJII() > i4) {
                ((C13FG) c1689390u41.LIZ).LJIIJ(i4);
            }
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            C1689390u41 c1689390u412 = this.LLJJ;
            if (this.LLJJIII) {
                i = i3;
            } else {
                i = i2;
            }
            ((C13FG) c1689390u412.LIZIZ).LJIIJ(i);
            return interfaceC1689940u4u.LJLJJL(i2, i3, C2097608Jq.LJ(), new AwS106S0201000_25(this, i4, abstractC1686530tzPLJJJJZ, 1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            throw th;
        }
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (this.LLJJIII) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1676340tiy.LJJII(i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (this.LLJJIII) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1676340tiy.LJJIL(i);
    }
}
