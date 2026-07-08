package X;

import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Xec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853880Xec extends AbstractC854370XfP {
    public static final int $stable = 0;
    public final String LL = "pii_bind_phone";

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public HashMap<String, HashMap<String, String>> getFlowGraph() {
        Pair[] pairArr = new Pair[6];
        String firstStepId = getFirstStepId();
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair(PIIBindPromptFragment.PIIBindPromptActions.PrimaryButtonClickAction.class.getSimpleName(), "pii_verify_phone_for_bind");
        String simpleName = PIIBindPromptFragment.PIIBindPromptActions.SecondaryButtonClickAction.class.getSimpleName();
        ThirdPartyDeprecationExperiment5.LIZ.getClass();
        pairArr2[1] = new Pair(simpleName, ThirdPartyDeprecationExperiment5.LJ() ? "pii_input_email_for_bind" : "enter_phone_for_bind");
        pairArr2[2] = new Pair(PIIBindPromptFragment.PIIBindPromptActions.ChangeButtonClickAction.class.getSimpleName(), "enter_phone_for_bind");
        pairArr[0] = new Pair(firstStepId, C2097608Jq.LJI(pairArr2));
        pairArr[1] = new Pair("enter_phone_for_bind", C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickSendCodeAction.class.getSimpleName(), "pii_verify_phone_for_change")));
        pairArr[2] = new Pair("pii_input_email_for_bind", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "pii_verify_email_code_for_bind")));
        pairArr[3] = new Pair("pii_verify_phone_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password")));
        pairArr[4] = new Pair("pii_verify_phone_for_change", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password")));
        pairArr[5] = new Pair("pii_verify_email_code_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password")));
        return C2097608Jq.LJI(pairArr);
    }

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public String getFirstStepId() {
        return this.LL;
    }
}
