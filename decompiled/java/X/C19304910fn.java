package X;

import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: renamed from: X.10fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19304910fn {
    public InterfaceC19305310fr LIZ;

    public final void LIZ(C19EG c19eg, AuthResult authResult, C19305010fo c19305010fo, String str) {
        this.LIZ = c19305010fo;
        if (!ComplianceServiceProvider.LJJII().LIZJ()) {
            InterfaceC19305310fr interfaceC19305310fr = this.LIZ;
            if (interfaceC19305310fr != null) {
                C19305010fo c19305010fo2 = (C19305010fo) interfaceC19305310fr;
                c19305010fo2.LIZIZ.LJLILLLLZI(-1, c19305010fo2.LIZ);
                return;
            }
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//account/login/signup_or_login");
        smartRouteBuildRoute.withParam("enter_type", str);
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
        smartRouteBuildRoute.withParam("key_auth_result", authResult);
        smartRouteBuildRoute.open(10086, new C19334010kU(this, 3));
    }
}
