package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.10qE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19369610qE extends AbstractC20055413dY implements InterfaceC20051113cr {
    public Function0<? extends InterfaceC1690480u5m> LLJJ;
    public InterfaceC19369510qD LLJJI;
    public EnumC1684030tvN LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C1869430ykP LLJJIJIL;
    public final AwS608S0100000_29 LLJJJ = new AwS608S0100000_29(this, 785);
    public AwS608S0100000_29 LLJJJIL;

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LLIIJI() {
        return false;
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    public final void LLJJ() {
        this.LLJJIJIL = new C1869430ykP(new AwS573S0100000_29(this, 1051), new AwS573S0100000_29(this, 1052), this.LLJJIJIIJIL);
        this.LLJJJIL = this.LLJJIJI ? new AwS608S0100000_29(this, 786) : null;
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        boolean z;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        C1212320heY<Boolean> c1212320heY = C1696500uFU.LJIILIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
        Boolean bool = Boolean.TRUE;
        c1212320heY.getClass();
        interfaceC1692460u8y.LIZJ(c1212320heY, bool);
        interfaceC1692460u8y.LIZJ(C1696500uFU.LJJIJLIJ, this.LLJJJ);
        if (this.LLJJIII == EnumC1684030tvN.Vertical) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1869430ykP c1869430ykP = this.LLJJIJIL;
            if (c1869430ykP == null) {
                c1869430ykP = null;
            }
            C1212320heY<C1869430ykP> c1212320heY2 = C1696500uFU.LJIJJ;
            c1212320heY2.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY2, c1869430ykP);
        } else {
            C1869430ykP c1869430ykP2 = this.LLJJIJIL;
            if (c1869430ykP2 == null) {
                c1869430ykP2 = null;
            }
            C1212320heY<C1869430ykP> c1212320heY3 = C1696500uFU.LJIJI;
            c1212320heY3.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY3, c1869430ykP2);
        }
        AwS608S0100000_29 awS608S0100000_29 = this.LLJJJIL;
        if (awS608S0100000_29 != null) {
            interfaceC1692460u8y.LIZJ(C1694480uCE.LJFF, new C1697110uGT(null, awS608S0100000_29));
        }
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJJIII, new C1697110uGT(null, new AwS582S0100000_3(new AwS573S0100000_29(this, 1050), 162)));
        C1690920u6U c1690920u6ULJ = this.LLJJI.LJ();
        C1212320heY<C1690920u6U> c1212320heY4 = C1696500uFU.LJI;
        c1212320heY4.getClass();
        interfaceC1692460u8y.LIZJ(c1212320heY4, c1690920u6ULJ);
    }

    public C19369610qE(Function0<? extends InterfaceC1690480u5m> function0, InterfaceC19369510qD interfaceC19369510qD, EnumC1684030tvN enumC1684030tvN, boolean z, boolean z2) {
        this.LLJJ = function0;
        this.LLJJI = interfaceC19369510qD;
        this.LLJJIII = enumC1684030tvN;
        this.LLJJIJI = z;
        this.LLJJIJIIJIL = z2;
        LLJJ();
    }
}
