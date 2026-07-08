package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08Z8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Z8 implements InterfaceC885120Ynu {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1296));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 140));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 142));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 141));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 143));

    @Override // X.InterfaceC885120Ynu
    public final void LIZ() {
        LJII(new C08Z6(null));
    }

    @Override // X.InterfaceC885120Ynu
    public final void LIZIZ() {
        LJII(new C08Z5(null));
    }

    @Override // X.InterfaceC885120Ynu
    public final void LIZJ() {
        LJII(new C08Z7(null));
    }

    @Override // X.InterfaceC885120Ynu
    public final void LIZLLL() {
        LJII(new C08ZA(null));
    }

    @Override // X.InterfaceC885120Ynu
    public final void LJ() {
        LJII(new C08Z9(null));
    }

    @Override // X.InterfaceC885120Ynu
    public final void LJFF() {
        LJII(new C08Z4(null));
    }

    @Override // X.InterfaceC885120Ynu
    public final AnonymousClass0956 LJI(Function2 function2) {
        return C23250099c.LIZLLL((InterfaceC497601wk) this.LIZLLL.getValue(), null, null, function2, 3);
    }

    @Override // X.InterfaceC885120Ynu
    public final AnonymousClass0956 LJII(Function2 function2) {
        return C23250099c.LIZLLL((InterfaceC497601wk) this.LJ.getValue(), null, null, function2, 3);
    }

    @Override // X.InterfaceC885120Ynu
    public final void LJIIIIZZ(AwS558S0100000_14 awS558S0100000_14) {
        if (a0.LJJIIZI(C786410Ut5.u3().getName(), "SessionRefactor-Actor", false)) {
            awS558S0100000_14.invoke();
        } else {
            LJI(new C01N3(awS558S0100000_14, null));
        }
    }
}
