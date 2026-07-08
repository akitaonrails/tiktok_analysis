package X;

import android.os.Bundle;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.10fZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19303510fZ {
    public InterfaceC19304010fe LIZ;

    public final void LIZ(C19EG c19eg, AuthResult authResult, C19303810fc c19303810fc, Boolean bool, String str, Bundle bundle) {
        this.LIZ = c19303810fc;
        if (C19293810e0.LJIIJ() && !"click_sign_up".equals(str)) {
            Object value = C1915420zwa.LIZ.getValue();
            C1913910zu9 c1913910zu9 = new C1913910zu9();
            C19303710fb c19303710fb = new C19303710fb(this);
            value.getClass();
            C1914170zuZ.LIZJ(c1913910zu9, c19eg, c19303710fb);
            return;
        }
        if (bool.booleanValue()) {
            SmartRoute smartRouteLIZIZ = C852680Xcg.LIZIZ(c19eg);
            smartRouteLIZIZ.withParam(bundle);
            smartRouteLIZIZ.open();
            c19eg.finish();
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//account/login/signup_or_login");
        smartRouteBuildRoute.withParam("enter_type", str);
        smartRouteBuildRoute.withParam("key_auth_result", authResult);
        smartRouteBuildRoute.withParam("platform", authResult.mProviderId);
        smartRouteBuildRoute.withParam("is_existing_user", false);
        smartRouteBuildRoute.withParam("enter_from", "3rd_party_auth");
        smartRouteBuildRoute.withParam("enter_method", "3rd_party_verified");
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.THIRD_PARTY_AGE_GATE.getValue());
        smartRouteBuildRoute.open(998, new C19334010kU(this, 5));
    }
}
