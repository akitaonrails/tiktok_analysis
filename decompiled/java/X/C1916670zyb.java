package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS143S1200000_28;

/* JADX INFO: renamed from: X.0zyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916670zyb implements C0NR1 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(594));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(593));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(595));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(596));

    @Override // X.C0NR1
    public final void LIZ() {
    }

    @Override // X.C0NR1
    public final int LIZJ() {
        return 1;
    }

    @Override // X.C0NR1
    public final Map<String, String> LIZLLL() {
        return null;
    }

    @Override // X.C0NR1
    public final String getTaskKey() {
        return "UserLoginGatekeeperTask";
    }

    public final ILoginService LJFF() {
        return (ILoginService) this.LIZJ.getValue();
    }

    @Override // X.C0NR1
    public final C0NRC category() {
        return C0NRC.BLOCKING;
    }

    @Override // X.C0NR1
    public final void LIZIZ(Bundle bundle, C0NR0 c0nr0) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C20684815ws.LJIILLIIL("user_login_enforce_execute", new C2344009Gk().LIZ);
        if (!((Boolean) C282740B6i.LIZ.getValue()).booleanValue() || LJFF() == null) {
            return;
        }
        String string = bundle.getString("pnsPageId");
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C2493909px.LIZ(activityLIZIZ)) != null) {
            C0CNO.LIZLLL(0L, new AwS143S1200000_28(this, activityLIZ, string, 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    @Override // X.C0NR1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.os.Bundle r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1916670zyb.LJ(android.os.Bundle, java.lang.String):boolean");
    }

    public final void LJI(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(bool, "should_mandatory_login");
        c2344009Gk.LJIIIIZZ("mandatory_login_reason", str3);
        if (str == null) {
            str = EnumC1915260zwK.PNS_NULL.getValue();
        }
        c2344009Gk.LJIIIIZZ("handle_result", str);
        c2344009Gk.LJIIIIZZ("handle_result_reason", str2);
        c2344009Gk.LJIIIIZZ("current_page_name", str4);
        c2344009Gk.LJIIIIZZ("current_web_page_url", str5);
        c2344009Gk.LJIIIIZZ("store_region", ((IAccountService) this.LIZIZ.getValue()).getStoreRegionUpperCase());
        c2344009Gk.LJ(Boolean.valueOf(((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode()), "guest_mode");
        c2344009Gk.LJ(Boolean.valueOf(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()), "is_login");
        C20684815ws.LJIILLIIL("user_login_enforce_check", c2344009Gk.LIZ);
    }
}
