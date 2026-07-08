package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852500XcO {
    public static final C852500XcO LIZ = new C852500XcO();

    public static void LIZ(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        String str3 = "phone";
        if (!Intrinsics.LJFF(str, "phone")) {
            str3 = "email";
        }
        c0xgr.LIZLLL("platform", str3);
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", baseAccountFlowFragment.getEnterMethod());
        C20684815ws.LJIILLIIL("click_forget_password", c0xgr.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(BaseAccountFlowFragment baseAccountFlowFragment, String str, boolean z, boolean z2) {
        int value;
        C852510XcP c852510XcP;
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        if (Intrinsics.LJFF(str, "email")) {
            value = EnumC852910Xd3.INPUT_EMAIL_FIND_PASSWORD.getValue();
        } else {
            value = EnumC852910Xd3.INPUT_PHONE_FIND_PASSWORD.getValue();
        }
        arguments.putInt("next_page", value);
        C786410Ut5.LJJJI("page", "login_force_reset_password", arguments);
        C852810Xct.LIZ.getClass();
        arguments.putBoolean("reset_pwd_from_login", z2);
        boolean z3 = true;
        if (z) {
            Bundle arguments2 = baseAccountFlowFragment.getArguments();
            Serializable serializable = null;
            if (arguments2 != null) {
                serializable = arguments2.getSerializable("recover_account_data");
            }
            if ((serializable instanceof C852510XcP) && (c852510XcP = (C852510XcP) serializable) != null) {
                c852510XcP.setNeedStoreLastMethod(true);
                z3 = !c852510XcP.safe;
            }
            arguments.putInt("current_scene", EnumC852660Xce.RECOVER_ACCOUNT.getValue());
        } else {
            arguments.putInt("current_scene", EnumC852660Xce.SET_OR_RESET_PASSWORD.getValue());
        }
        if ((baseAccountFlowFragment instanceof InterfaceC852520XcQ) && z3) {
            C852810Xct.LJIIZILJ(baseAccountFlowFragment, ((InterfaceC852520XcQ) baseAccountFlowFragment).getEmail());
        }
        baseAccountFlowFragment.fo(arguments);
    }
}
