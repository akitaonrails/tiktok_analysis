package Y;

import X.C0I7D;
import X.C0WZX;
import X.C0XGR;
import X.C0XGX;
import X.C1251190ifF;
import X.C19EG;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2451909jB;
import X.C786410Ut5;
import X.C853660XeG;
import X.EnumC1153490g7f;
import X.EnumC1237640iJO;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLoginFragment;
import com.ss.android.ugc.profile.business.commerce.OrderCenterGuidanceDialog;
import org.json.JSONException;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS87S1100000_19 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS87S1100000_19 aCListenerS87S1100000_19, View view) throws Throwable {
        SignUpOrLoginActivity signUpOrLoginActivity;
        EmailLoginFragment emailLoginFragment = (EmailLoginFragment) aCListenerS87S1100000_19.l1;
        String str = aCListenerS87S1100000_19.s0;
        emailLoginFragment.getClass();
        C853660XeG c853660XeG = C853660XeG.LIZ;
        String enterFrom = emailLoginFragment.getEnterFrom();
        String enterMethod = emailLoginFragment.getEnterMethod();
        String panelType = EnumC1237640iJO.LOGIN.getPanelType();
        EnumC1153490g7f enumC1153490g7f = EnumC1153490g7f.STYLE_V1;
        c853660XeG.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", enterFrom);
        c0xgr.LIZLLL("enter_method", enterMethod);
        c0xgr.LIZLLL("login_panel_type", panelType);
        c0xgr.LIZLLL("platform", str);
        c0xgr.LIZLLL("button_design", enumC1153490g7f.getValue());
        C20684815ws.LJIILLIIL("create_account_message_click", c0xgr.LIZ);
        C0I7D c0i7d = emailLoginFragment.LLLILZLLLI;
        if (c0i7d == null) {
            c0i7d = null;
        }
        String string = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWPT2yRWBWGmlof9q9iQ==", null)).toString();
        if (C2451909jB.LIZ(string)) {
            Bundle arguments = emailLoginFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C786410Ut5.LJJJI("args_email", string, arguments);
            arguments.putInt("next_page", EnumC852910Xd3.PHONE_EMAIL_SIGN_UP.getValue());
            arguments.putInt("child_page", EnumC852910Xd3.INPUT_EMAIL_SIGN_UP.getValue());
            arguments.putInt("current_scene", EnumC852660Xce.SIGN_UP.getValue());
            arguments.putInt("current_page", EnumC852910Xd3.NONE.getValue());
            emailLoginFragment.fo(arguments);
            return;
        }
        C19EG activity = emailLoginFragment.getActivity();
        if (!(activity instanceof SignUpOrLoginActivity) || (signUpOrLoginActivity = (SignUpOrLoginActivity) activity) == null) {
            return;
        }
        if (C0XGX.LIZ()) {
            C2204961BRm.LLLZI(signUpOrLoginActivity, -1, new Intent().putExtra("extra_jump_to_signup", true), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4Iq61PkrgeguijgM2BS9OvPBzL4ZQ", null));
        } else {
            String str2 = I18nSignUpActivity._pnsPageId;
            I18nSignUpActivity.LLJLLIL = Boolean.TRUE;
        }
        signUpOrLoginActivity.finish();
    }

    public static final void onClick$1(ACListenerS87S1100000_19 aCListenerS87S1100000_19, View view) throws JSONException {
        TuxSheet tuxSheet = ((OrderCenterGuidanceDialog) aCListenerS87S1100000_19.l1).LIZLLL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        C1251190ifF c1251190ifF = C1251190ifF.LIZ;
        String str = aCListenerS87S1100000_19.s0;
        c1251190ifF.getClass();
        C1251190ifF.LIZIZ("close", str);
    }

    public ACListenerS87S1100000_19(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
