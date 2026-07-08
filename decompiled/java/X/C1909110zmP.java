package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0zmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909110zmP extends AbstractC1909290zmh {
    @Override // X.AbstractC1909290zmh
    public final void LIZJ() {
        C0XI4 c0xi4;
        String strT2;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        Locale localeLJIIZILJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "praise_dialog");
        Map<String, String> map = c2344009Gk.LIZ;
        C20684815ws.LJIILLIIL("FAQ", map);
        C20684815ws.LJIILLIIL("click_feedback_entrance", map);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "aweme://webview");
        if (C10EU.LJIILIIL()) {
            c0xi4 = new C0XI4("https://www.tiktok.com/aweme/inapp/v2/c_feedback");
        } else {
            try {
                if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                    C19724912Fj.LIZLLL().LJII(C0CLW.LIZIZ.LIZ.getFeedbackConf().getNormalEntry());
                    return;
                } else {
                    C19724912Fj.LIZLLL().LJII(C0CLW.LIZIZ.LIZ.getFeedbackConf().getNotLoggedIn());
                    return;
                }
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                c0xi4 = new C0XI4("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
                I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (localeLJIIZILJ = i18nManagerServiceApiLIZ.LJIIZILJ(this.LIZ)) == null || (strT2 = C786410Ut5.t2(localeLJIIZILJ)) == null) {
                    strT2 = "";
                }
                c0xi4.LJ("locale", strT2);
            }
        }
        c0xi4.LJ("enter_from", "praise_dialog");
        smartRouteBuildRoute.withParam(UriProtector.parse(c0xi4.LJFF()));
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        smartRouteBuildRoute.open();
    }

    @Override // X.AbstractC1909290zmh
    public final C1909380zmq LIZLLL() {
        InterfaceC1875070ytV interfaceC1875070ytV = this.LIZJ;
        if (interfaceC1875070ytV != null) {
            interfaceC1875070ytV.getImage();
        }
        InterfaceC1875070ytV interfaceC1875070ytV2 = this.LIZJ;
        if (interfaceC1875070ytV2 != null) {
            interfaceC1875070ytV2.getType();
        }
        InterfaceC1875070ytV interfaceC1875070ytV3 = this.LIZJ;
        if (interfaceC1875070ytV3 != null) {
            interfaceC1875070ytV3.getIgnoreFrequencyControl();
        }
        String string = this.LIZ.getString(2131845777);
        String string2 = this.LIZ.getString(2131845774);
        try {
            AppStoreMessage appStoreScore = C0CLW.LIZIZ.LIZ.getAppStoreScore();
            if (appStoreScore.getTitle().length() > 0) {
                string = appStoreScore.getTitle();
            }
            if (appStoreScore.getText().length() > 0) {
                string2 = appStoreScore.getText();
            }
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1875070ytV interfaceC1875070ytV4 = this.LIZJ;
        if (interfaceC1875070ytV4 != null && C123100dR.LIZ(interfaceC1875070ytV4.getTitle()) && (string = this.LIZJ.getTitle()) == null) {
            string = this.LIZ.getString(2131845777);
        }
        InterfaceC1875070ytV interfaceC1875070ytV5 = this.LIZJ;
        if (interfaceC1875070ytV5 != null && C123100dR.LIZ(interfaceC1875070ytV5.getContent()) && (string2 = this.LIZJ.getContent()) == null) {
            string2 = this.LIZ.getString(2131845774);
        }
        return new C1909380zmq(string, string2, this.LIZ.getString(2131837676), this.LIZ.getString(2131845776), this.LIZ.getString(2131845775), this.LIZ.getPackageName());
    }

    public C1909110zmP(Activity activity, EnumC1909250zmd enumC1909250zmd) {
        super(activity, enumC1909250zmd, null);
    }

    public C1909110zmP(Activity activity, EnumC1909250zmd enumC1909250zmd, InterfaceC1875070ytV interfaceC1875070ytV) {
        super(activity, enumC1909250zmd, interfaceC1875070ytV);
    }
}
