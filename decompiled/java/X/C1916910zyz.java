package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;

/* JADX INFO: renamed from: X.0zyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916910zyz {
    public static final C1916910zyz LIZ = new C1916910zyz();
    public static final C19633311rf LIZIZ;

    static {
        C844470XAv.LIZ.getClass();
        LIZIZ = new C19633311rf(C844470XAv.LIZ(), "gradient_punish_warning");
    }

    public static final GradientPunishWarning LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return (GradientPunishWarning) SettingsManager.LJII("gradient_punish_warning", GradientPunishWarning.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final void LIZIZ(Context context, String str) {
        String str2;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        GradientPunishWarning gradientPunishWarningLIZ = LIZ();
        if (gradientPunishWarningLIZ != null) {
            str2 = gradientPunishWarningLIZ.detailUrl;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append("&enter_from=");
        sbLIZ.append(str);
        smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        smartRouteBuildRoute.open();
    }
}
