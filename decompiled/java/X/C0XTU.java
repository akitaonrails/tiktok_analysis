package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivityWithNoAnimation;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XTU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XTU {
    public static boolean LIZ(String str) {
        IDeepLinkService iDeepLinkService;
        if (!Intrinsics.LJFF(str, "deeplink") || (iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null)) == null || !iDeepLinkService.LJJJLL()) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Activity activity, Bundle bundle, boolean z, boolean z2, boolean z3, String str) {
        Intent intent;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        if (z3) {
            intent = new Intent(activity, (Class<?>) I18nSignUpActivityWithNoAnimation.class);
        } else {
            intent = new Intent(activity, (Class<?>) I18nSignUpActivity.class);
        }
        if (bundle != null) {
            bundle.putLong("login_panel_open_time", SystemClock.elapsedRealtime());
        }
        intent.putExtra("sign_up_data", bundle);
        if (z || (bundle != null && bundle.getBoolean("show_login_page_first"))) {
            z4 = true;
        } else {
            z4 = false;
        }
        intent.putExtra("show_login_page_first", z4);
        intent.putExtra("has_callBack", z2);
        if (bundle != null && bundle.getBoolean("prevent_multiple_panels")) {
            intent.addFlags(536870912);
        }
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null && iDeepLinkService.LJJJLL()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (!Intrinsics.LJFF(str, "deeplink") && !Intrinsics.LJFF(str, "cold_launch")) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (LIZ(str)) {
                intent.putExtra("login_enter_from", str);
            }
            if (!z6 || !I18nSignUpActivity.LLJLLL) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owskw7ZzjtEfQP+8838kWj8dAZ1sXXIF4+o=", null));
                if (z6) {
                    I18nSignUpActivity.LLJLLL = true;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("I18nSignUpActivity after startActivity enterFrom ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owskw7ZzjtEfQP+8838kWj8dAZ1sXXIF4+o=", null));
        }
        if (z3) {
            i = 0;
        } else {
            i = R.anim.ac;
        }
        C786410Ut5.ae(i, activity, 0);
    }
}
