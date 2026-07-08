package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852830Xcv {
    public static final void LIZ(Context context, String str, Bundle bundle) {
        SmartRoute smartRouteLIZJ;
        if (ComplianceServiceProvider.LIZLLL().LJFF()) {
            SmartRoute smartRouteLIZIZ = C852680Xcg.LIZIZ(context);
            if (bundle != null) {
                bundle.putBoolean("age_gate_block", true);
                smartRouteLIZIZ.withParam(bundle);
            }
            smartRouteLIZIZ.open();
            return;
        }
        if (Intrinsics.LJFF(str, "email_signup_show")) {
            smartRouteLIZJ = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
            smartRouteLIZJ.withParam("current_scene", EnumC852660Xce.SIGN_UP.getValue());
            smartRouteLIZJ.withParam("next_page", EnumC852910Xd3.EMAIL_SIGNUP.getValue());
            smartRouteLIZJ.withParam("login_panel_type", "signup");
        } else {
            smartRouteLIZJ = C852680Xcg.LIZJ(context);
        }
        if (bundle != null) {
            smartRouteLIZJ.withParam(bundle);
        }
        smartRouteLIZJ.open();
    }
}
