package X;

import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0XfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C854350XfN extends AbstractC854370XfP {
    public static final int $stable = 0;
    public final VerificationMethodType LL;

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public HashMap<String, HashMap<String, String>> getFlowGraph() {
        return C2097608Jq.LJI(new Pair("verify_email_before_change", C2097608Jq.LJI(new Pair(InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction.class.getSimpleName(), "input_email_for_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_change"))), new Pair("verify_phone_for_change", C2097608Jq.LJI(new Pair(InputCodeFragment.InputCodeActions.VerifyPhoneCodeActionV1.class.getSimpleName(), "input_email_for_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_before_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_change"))), new Pair("verify_password_for_change", C2097608Jq.LJI(new Pair(VerifyPasswordFragment.VerifyPasswordActions.ClickNextAction.class.getSimpleName(), "input_email_for_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_before_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_change"))), new Pair("input_email_for_change", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "verify_email_code_for_change"))));
    }

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public String getFirstStepId() {
        int i = C1235370iFj.LIZ[this.LL.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : "verify_password_for_change" : "verify_phone_for_change" : "verify_email_before_change";
    }

    public final VerificationMethodType getVerifyMethod() {
        return this.LL;
    }

    public C854350XfN(VerificationMethodType verificationMethodType) {
        this.LL = verificationMethodType;
    }
}
