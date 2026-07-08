package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS146S0110000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20074313gb extends C0NW3 {
    public boolean LLJZ;
    public Function1<? super Boolean, Unit> LLJZIJLIL;
    public final AwS574S0100000_30 LLL;

    public C20074313gb() {
        throw null;
    }

    @Override // X.AbstractC20072513gJ
    public final void LLJJIJI(InterfaceC1692460u8y interfaceC1692460u8y) {
        C11A1 c11a1;
        if (this.LLJZ) {
            c11a1 = C11A1.On;
        } else {
            c11a1 = C11A1.Off;
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        C1212320heY<C11A1> c1212320heY = C1696500uFU.LJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
        c1212320heY.getClass();
        interfaceC1692460u8y.LIZJ(c1212320heY, c11a1);
    }

    public C20074313gb(boolean z, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1693230uAD interfaceC1693230uAD, boolean z2, C20279814Wu c20279814Wu, Function1 function1) {
        super(interfaceC595010NVj, interfaceC1693230uAD, z2, null, c20279814Wu, new AwS146S0110000_30(function1, (Function1<? super Boolean, Unit>) z, true));
        this.LLJZ = z;
        this.LLJZIJLIL = function1;
        this.LLL = new AwS574S0100000_30(this, 405);
    }
}
