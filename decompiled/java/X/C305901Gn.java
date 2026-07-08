package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GuestShowdownEntityConfig;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C305901Gn implements InterfaceC1141530foN {
    public AwS381S0200000_15 LL;
    public AwS559S0100000_15 LLILLJJLI;
    public final String LLILLL = "guest_showdown_playbook_setting_show";
    public final String LLILZ = "guest_showdown_playbook_setting_dismiss";

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        GuestShowdownEntityConfig guestShowdownEntityConfig;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            string = interfaceC1107590evd.getString("action");
        } else {
            string = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent, actionName: ");
        sbLIZ.append(string);
        C20441214yg.LJIIIZ("GuestShowdownEntity", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(string, this.LLILLL)) {
            AwS559S0100000_15 awS559S0100000_15 = this.LLILLJJLI;
            if (awS559S0100000_15 != null) {
                awS559S0100000_15.invoke();
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(string, this.LLILZ)) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null && (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd2, "params")) != null) {
                MultiGuestGuestShowdownConfigSetting multiGuestGuestShowdownConfigSetting = MultiGuestGuestShowdownConfigSetting.INSTANCE;
                guestShowdownEntityConfig = new GuestShowdownEntityConfig(C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "guest_showdown_duration", (int) multiGuestGuestShowdownConfigSetting.getSettingValue().defaultDuration), C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "guest_showdown_loser_num", multiGuestGuestShowdownConfigSetting.getSettingValue().defaultLoserNum), C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "guest_showdown_winner_num", multiGuestGuestShowdownConfigSetting.getSettingValue().defaultWinnerNum));
            } else {
                guestShowdownEntityConfig = null;
            }
            AwS381S0200000_15 awS381S0200000_15 = this.LL;
            if (awS381S0200000_15 != null) {
                awS381S0200000_15.invoke(guestShowdownEntityConfig);
            }
            C1548820qPI.LJIIIIZZ("multi_guest_lynx_panel_status_change", this);
            this.LL = null;
            this.LLILLJJLI = null;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onReceiveJsEvent, can't handle this actionName: ");
        sbLIZ2.append(string);
        C20441214yg.LJ("GuestShowdownEntity", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
