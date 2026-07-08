package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959360b4Y extends AbstractC959270b4P implements InterfaceC959940b5U {
    @Override // X.InterfaceC959940b5U
    public final void LIZIZ(C954630awv c954630awv, Function0<Unit> function0, Function0<Unit> function02) {
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZLLL(List list, AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC959940b5U
    public final void LJI(AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.INVITED, EnumC958900b3o.RECEIVED, EnumC958900b3o.NONE});
    }

    public C959360b4Y(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZJ(AwS559S0100000_15 awS559S0100000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCoHostFinish, started group channelid = ");
        sbLIZ.append(this.LIZ.c0().LJFF);
        C20441214yg.LIZIZ("TeamPairWaitedCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        awS559S0100000_15.invoke();
    }
}
