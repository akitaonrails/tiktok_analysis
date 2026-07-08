package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;

/* JADX INFO: renamed from: X.0Xao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851520Xao {
    public static void LIZ(EnumC852910Xd3 enumC852910Xd3, C0XZJ c0xzj, BaseAccountFlowFragment baseAccountFlowFragment, InterfaceC851540Xaq interfaceC851540Xaq) {
        int errorCode = c0xzj.getErrorCode();
        if (!SignUpOrLoginActivity.LLJJJJ.contains(Integer.valueOf(errorCode)) && errorCode != 1704) {
            String string = null;
            if (SignUpOrLoginActivity.LLJJJJJIL.contains(Integer.valueOf(errorCode))) {
                String message = c0xzj.getMessage();
                if (message == null) {
                    Context context = baseAccountFlowFragment.getContext();
                    if (context != null) {
                        string = context.getString(2131834217);
                    }
                } else {
                    string = message;
                }
                interfaceC851540Xaq.LIZIZ(1, string);
                return;
            }
            String message2 = c0xzj.getMessage();
            if (message2 == null) {
                Context context2 = baseAccountFlowFragment.getContext();
                if (context2 != null) {
                    string = context2.getString(2131834217);
                }
            } else {
                string = message2;
            }
            interfaceC851540Xaq.LIZIZ(0, string);
            return;
        }
        interfaceC851540Xaq.LIZJ(baseAccountFlowFragment, enumC852910Xd3);
    }

    public static void LIZIZ(EnumC852910Xd3 enumC852910Xd3, BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle, C0XO3 c0xo3, InterfaceC851540Xaq interfaceC851540Xaq) {
        C786410Ut5.LJJJI("platform_profile", "email", bundle);
        bundle.putInt("previous_page", EnumC852910Xd3.AGE_GATE_POST_EMAIL_SIGNUP.getValue());
        C0XYO c0xyo = C0XYO.LIZ;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = baseAccountFlowFragment.LLJJLIIIJLLLLLLLZ();
        c0xyo.getClass();
        C0XYO.LIZJ(baseAccountFlowFragment, baseAccountFlowFragment, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo3);
        if (C0XX7.LIZ()) {
            C0XX7.LIZ = null;
        }
        if (!C19285410ce.LIZ() && !bundle.getBoolean("is_need_verify_email", false)) {
            interfaceC851540Xaq.LIZ(bundle);
        }
        interfaceC851540Xaq.LIZJ(baseAccountFlowFragment, enumC852910Xd3);
    }
}
