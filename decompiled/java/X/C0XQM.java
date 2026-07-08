package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0XQM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQM {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C0XQJ c0xqj) {
        C0XQ5.LJIIL(c0xqj.LIZ, "login");
        Bundle bundle = new Bundle();
        bundle.putBoolean("block_bind_phone", true);
        C0XVM.LIZIZ(bundle, null, false, false).LIZLLL(new C854740Xg0(bundle, 3));
        IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class);
        String str = (String) iPrevLoginPlatformService.getPlatform().getValue();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", "sms_verification");
        c0xgr.LIZLLL("enter_type", "find_account_back");
        C852170Xbr.LIZ(c0xgr);
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZLLL("platform", "sms_verification");
        c0xgr2.LIZLLL("enter_type", "find_account_back");
        c0xgr2.LIZLLL("prev_login_platform", str);
        c0xgr2.LIZ(iPrevLoginPlatformService.LIZIZ(), "encouraged_platform");
        C20684815ws.LJIILLIIL("login_submit", c0xgr2.LIZ);
        C0XGR c0xgr3 = new C0XGR();
        c0xgr3.LIZLLL("enter_type", "find_account_back");
        c0xgr3.LIZLLL("platform", "sms_verification");
        c0xgr3.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0xgr3.LIZLLL("prev_login_platform", str);
        c0xgr3.LIZ(0, "is_register");
        c0xgr3.LIZ(iPrevLoginPlatformService.LIZIZ(), "encouraged_platform");
        C852170Xbr.LIZ(c0xgr);
        C20684815ws.LJIILLIIL("login_success", c0xgr3.LIZ);
        C2211631BhB.LJIILL("b9242", null);
        C852210Xbv.LIZ();
    }
}
