package X;

import Y.ACListenerS122S0200000_19;
import android.view.View;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.user.UserStore;
import kotlin.jvm.internal.AwS18S2000000_19;

/* JADX INFO: renamed from: X.0iZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("OrgAccountProfilePopupTask")
public final class C1247860iZs extends AbstractC20660115st<View> {
    public final C20515215Pi LL;
    public final int LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        UserStore userStore = UserStore.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        userStore.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UserStore.LIZLLL());
        sbLIZ.append("_org_profile_bottom_banner_show_time");
        UserStore.LJ.putLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis).apply();
        String strLJIIL = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJIIL();
        String strLJIIJJI = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJIIJJI();
        C20515215Pi c20515215Pi = this.LL;
        c20515215Pi.LIZ(2131839036);
        c20515215Pi.LIZJ(2131839037);
        c20515215Pi.LJII(2131839038);
        c20515215Pi.LIZ.LJIILIIL = new ACListenerS122S0200000_19(c688120Qyw, this, 24);
        c20515215Pi.LIZ.LJIILJJIL = new AwS18S2000000_19(strLJIIL, strLJIIJJI, 2);
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "personal_homepage");
        c0xgr.LIZLLL("tt_account_type", strLJIIL);
        c0xgr.LIZLLL("business_platform_name", strLJIIJJI);
        C20684815ws.LJIILLIIL("c2b_trial_alert_banner_show", c0xgr.LIZ);
        C20515215Pi c20515215Pi2 = this.LL;
        c20515215Pi2.LJ();
        return c20515215Pi2.LJ;
    }

    public C1247860iZs(C0TGX c0tgx, C20515215Pi c20515215Pi) {
        super(c0tgx);
        this.LL = c20515215Pi;
        this.LLILLJJLI = 447;
    }
}
