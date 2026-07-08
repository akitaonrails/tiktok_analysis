package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsConfig;

/* JADX INFO: renamed from: X.0gVC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168080gVC implements InterfaceC1168100gVE {
    public static final boolean LIZIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        return iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin() && C0C64.LJIILLIIL().LJIIIZ(31744, "manage_topics_enable", true, false);
    }

    public static final String LIZJ(Context context) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ManageTopicsConfig.ManageTopicsTitleModel manageTopicsTitleModel = ManageTopicsConfig.LIZ;
        ManageTopicsConfig.ManageTopicsTitleModel manageTopicsTitleModel2 = (ManageTopicsConfig.ManageTopicsTitleModel) settingsManagerLIZLLL.LJIIIIZZ("manage_topics_config", ManageTopicsConfig.ManageTopicsTitleModel.class, manageTopicsTitleModel);
        if (manageTopicsTitleModel2 == null) {
            if (manageTopicsTitleModel != null) {
            }
            return context.getString(2131834523);
        }
        manageTopicsTitleModel = manageTopicsTitleModel2;
        String str = manageTopicsTitleModel.title;
        if (str != null) {
            return str;
        }
        return context.getString(2131834523);
    }

    @Override // X.InterfaceC1168100gVE
    public final void LIZ(C1168090gVD c1168090gVD) {
        String string;
        Context context = c1168090gVD.LIZ;
        if (context == null) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "manage_topics_redesign", true) != 0) {
            Bundle bundle = c1168090gVD.LIZIZ;
            if (bundle == null || (string = bundle.getString("enter_from")) == null) {
                string = "";
            }
            SmartRouter.buildRoute(context, UriProtector.parse("aweme://roma_redirect/?spark_page=pns_manage_topics").buildUpon().appendQueryParameter("enter_from", string).build().toString()).open();
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//content_preferences/manage_topics");
        smartRouteBuildRoute.withParam(c1168090gVD.LIZIZ);
        smartRouteBuildRoute.open();
    }
}
