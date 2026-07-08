package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978670bZh implements InterfaceC978740bZo {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final Function1<EnumC919170a1j, Unit> LIZJ;

    @Override // X.InterfaceC978740bZo
    public final void LIZ() {
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.S4;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
    }

    @Override // X.InterfaceC978740bZo
    public final C978700bZk LIZIZ() {
        return new C978700bZk(C497740JfY.LJIJI(2131851549), LivePlazaPanelSimplifiedInfo.INSTANCE.isEnable() ? C497740JfY.LJIJI(2131851756) : C497740JfY.LJIJI(2131851565), "ttlive_icon_competition_choose_mode_catch_beans.png", C497740JfY.LJIJI(2131853331), EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, false, false, 0L, null, new AwS559S0100000_15(this, 583), 4064);
    }

    @Override // X.InterfaceC978740bZo
    public final boolean LIZJ() {
        return InterfaceC1106030et7.S4.LIZIZ().intValue() < 3;
    }

    @Override // X.InterfaceC978740bZo
    public final boolean LIZLLL() {
        return LiveMatchBeansSettings.INSTANCE.isAnchorEnabled() && C915980Zwa.LJII().LLILZLL(true).size() == 3;
    }

    @Override // X.InterfaceC978740bZo
    public final boolean shouldShow() {
        return this.LIZ && LiveMatchBeansSettings.INSTANCE.isAnchorEnabled() && C915980Zwa.LJII().LLILZLL(true).size() == 2 && !this.LIZIZ;
    }

    @Override // X.InterfaceC978740bZo
    public final EnumC919170a1j LJIIIZ() {
        return EnumC919170a1j.MATCH_TYPE_CATCH_BEANS;
    }

    public C978670bZh(AwS594S0100000_15 awS594S0100000_15, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = awS594S0100000_15;
    }
}
