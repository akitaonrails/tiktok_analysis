package Y;

import X.C0OBG;
import X.C0WZX;
import X.C0XQ7;
import X.C0XTR;
import X.C1050610dRj;
import X.C11JH;
import X.C11S5;
import X.C1390410mHn;
import X.C1701940uOG;
import X.C197039127h;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C786410Ut5;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ProAccountService;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.setting.api.EmailRequestBody;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.ui.beta.BetaEmailRegisterPage;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS23S0500000_12 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS23S0500000_12 aCListenerS23S0500000_12, View view) {
        String string;
        BetaEmailRegisterPage betaEmailRegisterPage = (BetaEmailRegisterPage) aCListenerS23S0500000_12.l0;
        String string2 = C2204961BRm.LLJILLL((EditText) aCListenerS23S0500000_12.l1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94hmuGsvKcFGU90tY/3YvFIkHrtCI0+oMp8nQcwY=", null)).toString();
        if (betaEmailRegisterPage.LLJ.matches(string2) && string2.length() != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Bundle arguments = ((BetaEmailRegisterPage) aCListenerS23S0500000_12.l0).getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                string = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", string);
            c2344009Gk.LJIIIIZZ("clicked_content", "submit");
            c2344009Gk.LIZJ(BetaAppExperiment.LJIIIIZZ ? 1 : 0, "has_join_beta");
            C20684815ws.LJIILLIIL("tiktok_beta_page_gp_email_click", c2344009Gk.LIZ);
            C11JH c11jhLJJIJIL = ((BetaEmailRegisterPage) aCListenerS23S0500000_12.l0).LLJI.LIZIZ(new EmailRequestBody(C2204961BRm.LLJILLL((EditText) aCListenerS23S0500000_12.l1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94hmuGsvKcFGU90tY/3YvFIkHrtCI0+oMp8nQcwY=", null)).toString(), 0, null, null, null, 30, null)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIL(new AfS181S0100000_12((C1390410mHn) aCListenerS23S0500000_12.l4, 137));
            C1390410mHn c1390410mHn = (C1390410mHn) aCListenerS23S0500000_12.l4;
            c11jhLJJIJIL.LJJLL(new AfS148S0200000_12(c1390410mHn, (BetaEmailRegisterPage) aCListenerS23S0500000_12.l0, 46), new AfS181S0100000_12(c1390410mHn, 138));
            return;
        }
        C786410Ut5.LJLLLLLL(0, (View) aCListenerS23S0500000_12.l2);
        ((EditText) aCListenerS23S0500000_12.l1).setBackground((GradientDrawable) aCListenerS23S0500000_12.l3);
    }

    public static final void onClick$1(ACListenerS23S0500000_12 aCListenerS23S0500000_12, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        new C1050610dRj().LJIIJ(1);
        ((C197039127h) aCListenerS23S0500000_12.l0).setEnabled(false);
        C0XQ7.LJ();
        ProAccountService proAccountServiceLIZLLL = C0XQ7.LIZ.LIZLLL();
        final Function0 function0 = (Function0) aCListenerS23S0500000_12.l1;
        final BASwitchToPAorBAServiceImpl bASwitchToPAorBAServiceImpl = (BASwitchToPAorBAServiceImpl) aCListenerS23S0500000_12.l2;
        final TuxSheet tuxSheet = (TuxSheet) aCListenerS23S0500000_12.l3;
        final Activity activity = (Activity) aCListenerS23S0500000_12.l4;
        proAccountServiceLIZLLL.quitBusinessAccount(new C0XTR() { // from class: X.0TRp
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                if (i == 14 && i2 == 1) {
                    ((AbstractC848400XPy) C0XQ7.LJFF()).LJI();
                    IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
                    if (iPrivacyServiceLJIJJ.LJJIFFI()) {
                        iPrivacyServiceLJIJJ.LJJIIJ("switch_pro_account");
                    } else {
                        iPrivacyServiceLJIJJ.LJJIIJZLJL("switch_pro_account");
                        iPrivacyServiceLJIJJ.LJIILJJIL();
                    }
                    function0.invoke();
                    ((ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class)).LIZIZ(1);
                    new C1050610dRj().LJII("ttelite_switch_to_PA_success", new String[0]);
                    tuxSheet.dismiss();
                    int i3 = bASwitchToPAorBAServiceImpl.LIZ.getInt("feelgood_show", 0);
                    SettingsManager.LIZLLL().getClass();
                    String str = "";
                    String strLJI = SettingsManager.LJI("ba_to_pa_feelgood_survey", "");
                    new C686150Qvl(strLJI).LIZ(C14KQ.LIZLLL(bASwitchToPAorBAServiceImpl.LIZIZ), "min_margin_top");
                    if ((i3 < 1 || (!C0C59.LJ().LIZIZ("enable_ba_to_pa_feelgood_survey_show", true, true))) && C123100dR.LIZ(strLJI)) {
                        BASwitchToPAorBAServiceImpl bASwitchToPAorBAServiceImpl2 = bASwitchToPAorBAServiceImpl;
                        Activity activity2 = activity;
                        bASwitchToPAorBAServiceImpl2.getClass();
                        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                        new Object() { // from class: X.0TRq
                        }.getClass();
                        String strLJJIFFI = u.LJJIFFI(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage(), "-", "_", false);
                        if (TextUtils.equals(strLJJIFFI, "zh_Hant_TW")) {
                            strLJJIFFI = "zh_HK";
                        }
                        if (TextUtils.equals(strLJJIFFI, "zh_Hans")) {
                            strLJJIFFI = "zh_CN";
                        }
                        if (TextUtils.equals(strLJJIFFI, "en")) {
                            strLJJIFFI = "en_US";
                        }
                        if (TextUtils.equals(strLJJIFFI, "es")) {
                            strLJJIFFI = "es_ES";
                        }
                        if (TextUtils.equals(strLJJIFFI, "fr")) {
                            strLJJIFFI = "fr_FR";
                        }
                        if (TextUtils.equals(strLJJIFFI, "fr_CA")) {
                            strLJJIFFI = "fr-CA";
                        }
                        if (TextUtils.equals(strLJJIFFI, "in")) {
                            strLJJIFFI = "id_ID";
                        }
                        String strLJJIFFI2 = u.LJJIFFI(u.LJJIFFI(strLJI, "((language))", strLJJIFFI, false), "((user_id))", curUser.getUid(), false);
                        String nickname = curUser.getNickname();
                        if (nickname != null) {
                            str = nickname;
                        }
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity2, u.LJJIFFI(strLJJIFFI2, "((user_name))", str, false));
                        smartRouteBuildRoute.withParam("transition_animation", "none");
                        smartRouteBuildRoute.open();
                        new C1050610dRj().LJII("ttelite_switch_survey_show", new String[0]);
                        bASwitchToPAorBAServiceImpl.LIZ.storeInt("feelgood_show", i3 + 1);
                        bASwitchToPAorBAServiceImpl.LIZ.storeLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), System.currentTimeMillis());
                        return;
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIJ(C20642515q3.LJI(2131849427));
                    c1389890mGx.LJIIJJI();
                    return;
                }
                BASwitchToPAorBAServiceImpl bASwitchToPAorBAServiceImpl3 = bASwitchToPAorBAServiceImpl;
                Activity activity3 = activity;
                bASwitchToPAorBAServiceImpl3.getClass();
                C1389890mGx c1389890mGx2 = new C1389890mGx(activity3);
                c1389890mGx2.LJIIIZ(2131837963);
                c1389890mGx2.LJIIJJI();
                tuxSheet.dismiss();
            }
        });
    }

    public ACListenerS23S0500000_12(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
