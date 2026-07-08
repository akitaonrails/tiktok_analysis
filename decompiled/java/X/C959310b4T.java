package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959310b4T extends AbstractC959270b4P implements InterfaceC959940b5U {
    @Override // X.InterfaceC959940b5U
    public final void LIZJ(AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZLLL(List list, AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC959940b5U
    public final void LJI(AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.PREPARED, EnumC958900b3o.NONE});
    }

    public C959310b4T(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZIZ(C954630awv c954630awv, Function0<Unit> function0, Function0<Unit> function02) {
        if (c954630awv.LIZIZ != 1) {
            C20441214yg.LJ("QuickBattleWaitedCoordinator", "onReceiveReplyMessage, replyStatus is not agree");
            return;
        }
        this.LIZ.c0().LJIILLIIL = c954630awv.LIZJ;
        InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
        EnumC955660aya enumC955660aya = EnumC955660aya.INVITER;
        interfaceC955420ayCLIZ.LLIILZL(enumC955660aya);
        C915980Zwa.LJI().LIZ().LJLJL(enumC955660aya, false);
        function0.invoke();
    }
}
