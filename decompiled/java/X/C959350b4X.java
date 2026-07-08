package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostAllowFriendManualActivityInQuickCohostSetting;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959350b4X extends AbstractC959270b4P implements InterfaceC959940b5U {
    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.PREPARED, EnumC958900b3o.NONE});
    }

    public C959350b4X(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZJ(AwS559S0100000_15 awS559S0100000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCoHostFinish, started group channelid = ");
        sbLIZ.append(this.LIZ.c0().LJFF);
        C20441214yg.LJ("QuickInvite4CoHostWaitedCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        awS559S0100000_15.invoke();
    }

    @Override // X.InterfaceC959940b5U
    public final void LJI(AwS559S0100000_15 awS559S0100000_15) {
        C20441214yg.LJ("QuickInvite4CoHostWaitedCoordinator", "onGroupChannelIdChanged, fallback for quick invite during co-host");
        awS559S0100000_15.invoke();
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZLLL(List list, AwS559S0100000_15 awS559S0100000_15) {
        if (C950220apo.LJIJ(list.size(), 0)) {
            C20441214yg.LIZIZ("QuickInvite4CoHostWaitedCoordinator", "cohost linked full, quit quick cohost");
            awS559S0100000_15.invoke();
        } else if (LiveCohostAllowFriendManualActivityInQuickCohostSetting.INSTANCE.isEnable() && list.size() > this.LIZ.c0().LJIIJ) {
            C20441214yg.LIZIZ("QuickInvite4CoHostWaitedCoordinator", "friend joined during quick cohost, quit quick cohost");
            awS559S0100000_15.invoke();
        }
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZIZ(C954630awv c954630awv, Function0<Unit> function0, Function0<Unit> function02) {
        if (c954630awv.LIZIZ == 1) {
            this.LIZ.c0().LJIILLIIL = c954630awv.LIZJ;
            function0.invoke();
        } else {
            if (function02 == null) {
                return;
            }
            function02.invoke();
        }
    }
}
