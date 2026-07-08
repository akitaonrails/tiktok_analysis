package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.profile.business.ur.ui.I18nHeaderDetailActivity;

/* JADX INFO: renamed from: X.0ikd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254530ikd {
    public static void LIZ(Activity activity, Bundle bundle) {
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) I18nHeaderDetailActivity.class);
            intent.putExtras(bundle);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt6eICQ7ySlhHiINAkGYxLDblI8xU=", null));
            C786410Ut5.ae(0, activity, 0);
        }
    }

    public static void LIZIZ(Activity activity, View view, float f, User user, boolean z, Challenge challenge, String... strArr) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "extra_zoom_info", ZoomAnimationUtils.LIZ(view));
        bundle.putStringArray("uri", strArr);
        bundle.putFloat("wh_ratio", f);
        bundle.putBoolean("enable_download_img", z);
        if (user != null) {
            C786410Ut5.LJJIZ(bundle, "share_info", user);
        }
        if (challenge != null) {
            C786410Ut5.LJJIZ(bundle, "challenge_info", challenge);
        }
        LIZ(activity, bundle);
    }
}
