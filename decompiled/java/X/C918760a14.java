package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0a14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918760a14 implements InterfaceC918590a0n {
    public final Function2<String, Function1<? super String, Unit>, Boolean> LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC918590a0n
    public final C918610a0p LIZ(C918580a0m c918580a0m) {
        C942210act.LIZ.getClass();
        int iLJ = C942210act.LJ();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (iLJ >= C927600aFK.LJIIL()) {
            Function2<String, Function1<? super String, Unit>, Boolean> function2 = this.LIZ;
            if (function2 != null && function2.invoke(this.LIZIZ, new AwS594S0100000_15(c918580a0m, 984)).booleanValue()) {
                return C918580a0m.LIZIZ(EnumC918770a15.CHECKING_MAX_POSITION, null);
            }
            C766270U4b.LIZLLL(2131842763);
            C20441214yg.LIZIZ("IncreaseGuestMaxCountChecker", "increaseGuestMaxCount");
            C924630aAX.LJJIZ(true);
            return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.MAX_LINK_REACHED, "max_link_reached");
        }
        return new C918610a0p(EnumC918840a1C.PASSED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918760a14(Function2<? super String, ? super Function1<? super String, Unit>, Boolean> function2, String str) {
        this.LIZ = function2;
        this.LIZIZ = str;
    }
}
