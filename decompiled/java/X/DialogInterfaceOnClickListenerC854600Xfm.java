package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ShowDialogActivity;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity;
import java.util.Set;

/* JADX INFO: renamed from: X.0Xfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class DialogInterfaceOnClickListenerC854600Xfm implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC854600Xfm(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC854600Xfm dialogInterfaceOnClickListenerC854600Xfm, DialogInterface dialogInterface, int i) {
        boolean z;
        int value;
        ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZIZ("create_account");
        int value2 = 0;
        if (TextUtils.isEmpty(((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZJ)) {
            C852010Xbb c852010Xbb = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
            c852010Xbb.LIZIZ.pn(0, c852010Xbb.LIZ.getString(2131837962));
            return;
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", "login");
        C20684815ws.LJIILLIIL("click_sign_up", c0xgr.LIZ);
        Bundle arguments = ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZ.getArguments();
        if (arguments != null && arguments.getBoolean("age_gate_block")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C852010Xbb c852010Xbb2 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
            C0XYD c0xyd = c852010Xbb2.LIZIZ;
            Bundle arguments2 = c852010Xbb2.LIZ.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            arguments2.putInt("next_page", EnumC852910Xd3.FTC_CREATE_ACCOUNT.getValue());
            c0xyd.fo(arguments2);
            return;
        }
        EnumC191814102i enumC191814102iLIZ = ComplianceServiceProvider.LIZLLL().LIZ();
        ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).getClass();
        C852810Xct c852810Xct = C852810Xct.LIZ;
        c852810Xct.getClass();
        if ((!C852810Xct.LIZIZ) && ComplianceServiceProvider.LIZLLL().LJI()) {
            C0XGR c0xgr2 = new C0XGR();
            if (enumC191814102iLIZ != null) {
                value2 = enumC191814102iLIZ.getValue();
            }
            c0xgr2.LIZ(value2, "register_age_gate_action");
            c0xgr2.LIZ(1, "show");
            C20684815ws.LJIILLIIL("tns_phone_not_registered_age_gate_action", c0xgr2.LIZ);
            C852010Xbb c852010Xbb3 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
            C0XYD c0xyd2 = c852010Xbb3.LIZIZ;
            Bundle arguments3 = c852010Xbb3.LIZ.getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            C852010Xbb c852010Xbb4 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
            arguments3.putInt("next_page", EnumC852910Xd3.AGE_GATE_LOGIN.getValue());
            C786410Ut5.LJJJI("sms_code_key", c852010Xbb4.LIZJ, arguments3);
            c0xyd2.fo(arguments3);
            return;
        }
        C0XGR c0xgr3 = new C0XGR();
        if (enumC191814102iLIZ != null) {
            value = enumC191814102iLIZ.getValue();
        } else {
            value = 0;
        }
        c0xgr3.LIZ(value, "register_age_gate_action");
        c0xgr3.LIZ(0, "show");
        C20684815ws.LJIILLIIL("tns_phone_not_registered_age_gate_action", c0xgr3.LIZ);
        if (ComplianceServiceProvider.LJJII().LIZJ()) {
            C852010Xbb c852010Xbb5 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
            C0XYD c0xyd3 = c852010Xbb5.LIZIZ;
            Bundle arguments4 = c852010Xbb5.LIZ.getArguments();
            if (arguments4 == null) {
                arguments4 = new Bundle();
            }
            C852010Xbb c852010Xbb6 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
            arguments4.putInt("next_page", EnumC852910Xd3.TERMS_CONSENT_NEW_PHONE_USER.getValue());
            C786410Ut5.LJJJI("sms_code_key", c852010Xbb6.LIZJ, arguments4);
            c0xyd3.fo(arguments4);
            return;
        }
        Fragment fragment = ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZ;
        c852810Xct.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJI = C852810Xct.LJI(fragment);
        Bundle extras = ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZIZ.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        C852010Xbb c852010Xbb7 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
        extras.putBoolean("phone_signup", true);
        c852010Xbb7.getClass();
        c852810Xct.getClass();
        if (C852810Xct.LIZIZ) {
            extras.putBoolean("finish_activity_after_signup_login", true);
        }
        Set<String> set = C1260730iud.LIZ;
        if (C851730Xb9.LIZIZ()) {
            C0XYD c0xyd4 = ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZIZ;
            Bundle extras2 = c0xyd4.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            C852010Xbb c852010Xbb8 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
            extras2.putInt("next_page", EnumC852910Xd3.AGE_GATE_SIGN_UP.getValue());
            C786410Ut5.LJJJI("sms_code_key", c852010Xbb8.LIZJ, extras2);
            c0xyd4.fo(extras2);
            return;
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        C852010Xbb c852010Xbb9 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
        Fragment fragment2 = c852010Xbb9.LIZ;
        C0XYD c0xyd5 = c852010Xbb9.LIZIZ;
        String strLIZ = PhoneNumberUtil.LIZ(phoneNumberLJI);
        C852010Xbb c852010Xbb10 = (C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0;
        String str = c852010Xbb10.LIZJ;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c852010Xbb10.LIZIZ.LLJJLIIIJLLLLLLLZ();
        c0xz4.getClass();
        C0XZ4.LJIJI(fragment2, c0xyd5, strLIZ, str, enumC852910Xd3LLJJLIIIJLLLLLLLZ, true).LJIILL();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC854600Xfm dialogInterfaceOnClickListenerC854600Xfm, DialogInterface dialogInterface, int i) {
        ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZIZ("go_back");
        C19EG activity = ((C852010Xbb) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZ.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC854600Xfm dialogInterfaceOnClickListenerC854600Xfm, DialogInterface dialogInterface, int i) {
        Bundle extras;
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        try {
            extras = ((LogoutDialogActivity) dialogInterfaceOnClickListenerC854600Xfm.l0).getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        iLoginServiceLIZJ.logout("expired_logout", "sdk_expired_logout", extras, new C0XU7() { // from class: X.0XKI
            @Override // X.C0XU7
            public final void LIZIZ() {
                C01GW<C0XA3> c01gw = C0XA3.LIZIZ;
                C842840X4o.LIZ().LIZ.set(false);
            }
        });
        dialogInterface.dismiss();
        ((LogoutDialogActivity) dialogInterfaceOnClickListenerC854600Xfm.l0).finish();
        LogoutDialogActivity logoutDialogActivity = (LogoutDialogActivity) dialogInterfaceOnClickListenerC854600Xfm.l0;
        try {
            C1389600mGU.LIZIZ(logoutDialogActivity);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        logoutDialogActivity.overridePendingTransition(0, 0);
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC854600Xfm dialogInterfaceOnClickListenerC854600Xfm, DialogInterface dialogInterface, int i) {
        ((ShowDialogActivity) dialogInterfaceOnClickListenerC854600Xfm.l0).finish();
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC854600Xfm dialogInterfaceOnClickListenerC854600Xfm, DialogInterface dialogInterface, int i) {
        C0XQ7.LIZJ().logout("expired_logout", "sdk_expired_logout");
        ((C0XK9) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZJ.set(false);
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC854600Xfm dialogInterfaceOnClickListenerC854600Xfm, DialogInterface dialogInterface, int i) {
        ((C0XK9) dialogInterfaceOnClickListenerC854600Xfm.l0).LIZJ.set(false);
    }
}
