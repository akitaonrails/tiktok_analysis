package X;

import Y.AfS108S0300000_13;
import Y.AfS16S1400000_13;
import Y.AfS182S0100000_13;
import Y.AfS36S1300000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;

/* JADX INFO: renamed from: X.0Xav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851590Xav {
    public static void LIZ(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        String str;
        int i = C851600Xaw.LIZ[enumC852910Xd3.ordinal()];
        String str2 = "";
        if (i != 1) {
            if (i != 2) {
                c851660Xb2.LIZJ(c851660Xb2.getCurrentFragment(), enumC852910Xd3);
                return;
            }
            if (bundle.getBoolean("phone_signup", false)) {
                C851990XbZ c851990XbZ = C851990XbZ.LIZ;
                EnumC852910Xd3 enumC852910Xd32 = EnumC852910Xd3.AGE_GATE_SIGN_UP;
                EnumC851960XbW enumC851960XbW = EnumC851960XbW.QUICK_LOGIN_CONTINUE_FOR_SIGNUP;
                c851990XbZ.getClass();
                C851990XbZ.LIZ(enumC852910Xd32, enumC851960XbW);
                bundle.putBoolean("need_show_gsma_text", false);
                String string = bundle.getString("sms_code_key", "");
                C852810Xct.LIZ.getClass();
                String strLIZ = PhoneNumberUtil.LIZ(C852810Xct.LJII(bundle));
                if (bundle.getBoolean("is_gsma")) {
                    str = "gsma";
                } else {
                    str = "sms_verification";
                }
                BaseAccountFlowFragment currentFragment = c851660Xb2.getCurrentFragment();
                if (currentFragment == null) {
                    return;
                }
                Bundle arguments = currentFragment.getArguments();
                if (arguments != null) {
                    arguments.putBoolean("from_sms_login_continue", true);
                }
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                EnumC852910Xd3 enumC852910Xd33 = EnumC852910Xd3.PHONE_SMS_SIGN_UP;
                c0xz4.getClass();
                C1239250iLz.LIZIZ(currentFragment, currentFragment, C0XZ4.LJIJI(currentFragment, currentFragment, strLIZ, string, enumC852910Xd33, false).LJIIIIZZ(new AfS16S1400000_13(bundle, str, currentFragment, c851660Xb2, enumC852910Xd3, 0)).LJII(new AfS36S1300000_13(enumC852910Xd3, currentFragment, c851660Xb2, str, 0))).LJIILL();
                return;
            }
            c851660Xb2.LIZJ(c851660Xb2.getCurrentFragment(), enumC852910Xd3);
            return;
        }
        C851990XbZ c851990XbZ2 = C851990XbZ.LIZ;
        EnumC851960XbW enumC851960XbW2 = EnumC851960XbW.QUICK_LOGIN_CONTINUE_FOR_SIGNUP;
        c851990XbZ2.getClass();
        C851990XbZ.LIZ(enumC852910Xd3, enumC851960XbW2);
        String string2 = bundle.getString("sms_code_key");
        if (string2 != null) {
            str2 = string2;
        }
        BaseAccountFlowFragment currentFragment2 = c851660Xb2.getCurrentFragment();
        if (currentFragment2 == null) {
            return;
        }
        Bundle arguments2 = currentFragment2.getArguments();
        if (arguments2 != null) {
            arguments2.putInt("previous_page", EnumC852910Xd3.AGE_GATE_LOGIN.getValue());
            arguments2.putBoolean("age_gate_login", true);
            arguments2.putBoolean("phone_signup", true);
        }
        C852810Xct.LIZ.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJII = C852810Xct.LJII(currentFragment2.getArguments());
        if (phoneNumberLJII == null) {
            phoneNumberLJII = C852810Xct.LJII(bundle);
        }
        C0XZ4 c0xz42 = C0XZ4.LIZ;
        String strLIZ2 = PhoneNumberUtil.LIZ(phoneNumberLJII);
        c0xz42.getClass();
        C0XZ4.LJIJI(currentFragment2, currentFragment2, strLIZ2, str2, enumC852910Xd3, true).LJIIIIZZ(new AfS108S0300000_13(enumC852910Xd3, currentFragment2, c851660Xb2, 0)).LJII(new AfS182S0100000_13(c851660Xb2, 0)).LJIILL();
    }
}
