package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.services.interceptor.ConditionalBindLoginParam;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationManager;

/* JADX INFO: renamed from: X.0XaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851220XaK {
    public static boolean LIZ(C0XYD c0xyd, Activity activity, Bundle bundle) {
        EnumC852660Xce enumC852660Xce;
        ForcePhoneVerificationManager forcePhoneVerificationManager = ForcePhoneVerificationManager.INSTANCE;
        if (forcePhoneVerificationManager.getConditionalBindLoginParam() == null) {
            return false;
        }
        ConditionalBindLoginParam conditionalBindLoginParam = forcePhoneVerificationManager.getConditionalBindLoginParam();
        if (conditionalBindLoginParam != null && conditionalBindLoginParam.isRegister()) {
            enumC852660Xce = EnumC852660Xce.SIGN_UP;
        } else {
            enumC852660Xce = EnumC852660Xce.LOGIN;
        }
        if (c0xyd != null) {
            bundle.putInt("next_page", EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE.getValue());
            c0xyd.fo(bundle);
            return true;
        }
        String str = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE, enumC852660Xce, bundle, new C854720Xfy(activity, 0), null);
        return true;
    }
}
