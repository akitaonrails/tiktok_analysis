package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TTZ {
    public static final C0TTZ LIZ = new C0TTZ();

    public static boolean LIZ() {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LIZIZ(Activity activity) {
        if (!LIZ()) {
            C1233040iBy c1233040iBy = new C1233040iBy(activity);
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
            return;
        }
        String appLanguage = ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://www.tiktok.com/privacy/overview/");
        sbLIZ.append(appLanguage);
        C0XI4 c0xi4 = new C0XI4(C2188811AlT.LIZIZ(sbLIZ));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "aweme://webview");
        smartRouteBuildRoute.withParam("url", c0xi4.LJFF());
        smartRouteBuildRoute.withParam("title", activity.getString(2131845049));
        smartRouteBuildRoute.withParam("show_separate_line", true);
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open();
        C20684815ws.LJIILLIIL("click_global_privacy_center", C2097908Jt.LIZJ(new Pair("enter_from", "settings_page")));
    }

    public static void LIZJ(Activity activity) {
        if (!LIZ()) {
            C1233040iBy c1233040iBy = new C1233040iBy(activity);
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
        } else {
            C2174441A8c.LIZIZ.LJI();
            ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
            if (iCompliancePolicyServiceLJIIIIZZ != null) {
                iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.SETTINGS_PRIVACY_PAGE.getValue(), "terms-of-service", false, true, true, null, false, 100), new InterfaceC1913620ztg() { // from class: X.0TTa
                    @Override // X.InterfaceC1913620ztg
                    public final void onComplete() {
                    }
                });
            }
        }
    }

    public static C19319810iC LIZLLL(C19292910dr c19292910dr, C19319810iC c19319810iC, boolean z) {
        C19319810iC c19319810iCLJJIJL = C19319810iC.LJJIJL(c19319810iC, z, null, null, false, null, false, false, false, false, null, false, 126974);
        c19292910dr.LJI(new AwS591S0100000_12(c19319810iCLJJIJL, 49));
        return c19319810iCLJJIJL;
    }

    public static C19319810iC LJ(C19292910dr c19292910dr, C19319810iC c19319810iC, boolean z, boolean z2, boolean z3) {
        C19319810iC c19319810iCLJJIJL = C19319810iC.LJJIJL(c19319810iC, false, null, null, false, null, false, z, z2, z3, null, false, 102399);
        c19292910dr.LJI(new AwS591S0100000_12(c19319810iCLJJIJL, 50));
        return c19319810iCLJJIJL;
    }
}
