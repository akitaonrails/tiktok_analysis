package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;

/* JADX INFO: renamed from: X.0zz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("global_gradient_punish_warning")
public final class C1916960zz4 extends AbstractC20660015ss<Dialog> {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final C0X54 LLILLL;
    public final int LLILZ = 150;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return C1916910zyz.LIZ() != null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        GradientPunishWarning gradientPunishWarningLIZ;
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ != null && (gradientPunishWarningLIZ = C1916910zyz.LIZ()) != null) {
            String str = gradientPunishWarningLIZ.dialogMessage;
            String str2 = gradientPunishWarningLIZ.dialogButton;
            C21566919al c21566919al = new C21566919al(c19egLIZIZ);
            c21566919al.LIZJ = str;
            c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC19332310kD(c19egLIZIZ, this, 0), str2, false);
            c21566919al.LJII = false;
            C21566519ah c21566519ah = new C21566519ah(c21566919al);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
            C20684815ws.LJIILLIIL("violation_dialog_show", c2344009Gk.LIZ);
            return c21566519ah.LJ();
        }
        return null;
    }

    @Override // X.AbstractC20656215sG
    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        C0X54 c0x54;
        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
            C0X54 c0x542 = this.LLILLL;
            if (c0x542 != null) {
                c0x542.LIZIZ();
                return;
            }
            return;
        }
        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLL) == null) {
            return;
        }
        c0x54.LIZ();
    }

    public C1916960zz4(C19EG c19eg, String str, C0NR0 c0nr0) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = c0nr0;
    }
}
