package X;

import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1ARP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARP implements C1AR6, C1ARC {
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(620));

    public final C1ARU<C1AR6> LIZIZ() {
        return (C1ARU) this.LL.getValue();
    }

    public final void LIZJ() {
        LIZIZ().LIZ.clear();
    }

    public final void LIZ(C1AR6 c1ar6) {
        LIZIZ().LIZ(c1ar6);
    }

    @Override // X.C1AR6
    public final void LJI(InterfaceC2179261AQq interfaceC2179261AQq) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(interfaceC2179261AQq, 242));
    }

    @Override // X.C1AR6
    public final void LJIIIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(interfaceC2179131AQd, 244));
    }

    @Override // X.C1AR6
    public final void LJIIL(C1AQY c1aqy) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c1aqy, 243));
    }

    @Override // X.C1ARC
    public final void LJIL(C1AR6 c1ar6) {
        LIZIZ().LIZ.remove(c1ar6);
    }
}
