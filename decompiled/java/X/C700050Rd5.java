package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700050Rd5 extends C09AY implements Function2<InterfaceC700010Rd1, Boolean, Unit> {
    public final /* synthetic */ C701040Reg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700050Rd5(C701040Reg c701040Reg) {
        super(2);
        this.LL = c701040Reg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC700010Rd1 interfaceC700010Rd1, Boolean bool) {
        InterfaceC700010Rd1 interfaceC700010Rd12 = interfaceC700010Rd1;
        boolean zBooleanValue = bool.booleanValue();
        interfaceC700010Rd12.LIZLLL(zBooleanValue, this.LL);
        InterfaceC700000Rd0 interfaceC700000Rd0Wb1 = interfaceC700010Rd12.LIZJ().wb1();
        if (interfaceC700000Rd0Wb1 != null) {
            interfaceC700000Rd0Wb1.l0(zBooleanValue);
            return Unit.LIZ;
        }
        return null;
    }
}
