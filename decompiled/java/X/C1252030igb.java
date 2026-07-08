package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0igb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("user_detail_notification_setting_guide")
public final class C1252030igb extends AbstractC20660815t0 {
    public final View LL;
    public final User LLILLJJLI;
    public final int LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C450720Hlu c450720Hlu = new C450720Hlu(this.LL.getContext());
        c450720Hlu.LLILLJJLI.LIZIZ = this.LL;
        c450720Hlu.LJIIJ(2131849280);
        c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
        c450720Hlu.LIZJ(new AwS598S0100000_19(c20656615sK, 851));
        c450720Hlu.LJ(new AwS563S0100000_19(this, 3297));
        c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        C1391850mK7.LIZIZ(c0p0tLIZIZ, "100008");
        c0p0tLIZIZ.show();
    }

    public C1252030igb(TuxIconView tuxIconView, User user, InterfaceC20660615sy interfaceC20660615sy) {
        super(interfaceC20660615sy);
        this.LL = tuxIconView;
        this.LLILLJJLI = user;
        this.LLILLL = 100;
    }
}
