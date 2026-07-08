package X;

import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19565311gh extends i<InterfaceC362840EKk, C19565011ge, C07WH, C19565211gg> implements InterfaceC379610EuV, InterfaceC362840EKk {
    public static final int LLJJIJI = 8;
    public final C1DRG LLJILJILJ;
    public Function0<Unit> LLJILLL;
    public Function0<Unit> LLJJ;
    public final Function0<C07WH> LLJJI;
    public final Function0<C19565211gg> LLJJIII;

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07WH> o2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19565211gg> w2() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC362840EKk
    public void G4(Function0<Unit> function0) {
        this.LLJILLL = function0;
    }

    @Override // X.InterfaceC362840EKk
    public void OI0(boolean z) {
        i3(new AwS41S0010000_29(z, 40));
    }

    @Override // X.InterfaceC362840EKk
    public void rH2(Function0<Unit> function0) {
        this.LLJJ = function0;
    }

    public C19565311gh(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJJI = AFwS218S0000000_29.get$arr$(295);
        this.LLJJIII = new AwS573S0100000_29(this, 728);
    }
}
