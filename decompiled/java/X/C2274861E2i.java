package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.1E2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274861E2i extends i<InterfaceC19555511f7, C1B0Y, C1819740xSG, C1260304wT> implements InterfaceC379610EuV, InterfaceC19555511f7 {
    public static final int LLJJIII = 8;
    public final C1DRG LLJILJILJ;
    public final Function0<C1819740xSG> LLJILLL;
    public final Function0<C1260304wT> LLJJ;
    public InterfaceC19556011fC LLJJI;

    @Override // X.InterfaceC19555511f7
    public void LJ() {
        i3(AFwS283S0000000_35.get$arr$(106));
    }

    public final void LLILZLL() {
        InterfaceC19556011fC interfaceC19556011fC = this.LLJJI;
        if (interfaceC19556011fC != null) {
            interfaceC19556011fC.LIZIZ();
        }
    }

    @Override // X.InterfaceC19555511f7
    public void bo1() {
        i3(AFwS283S0000000_35.get$arr$(105));
    }

    @Override // X.InterfaceC19555511f7
    public void m91() {
        i3(AFwS283S0000000_35.get$arr$(107));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1819740xSG> o2() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1260304wT> w2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC19555511f7
    public void tO2(InterfaceC19556011fC interfaceC19556011fC) {
        this.LLJJI = interfaceC19556011fC;
    }

    public C2274861E2i(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = AFwS226S0000000_35.get$arr$(319);
        this.LLJJ = new AwS549S0100000_5(this, 769);
    }
}
