package X;

import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xeb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853870Xeb extends AbstractC854370XfP {
    public static final int $stable = 0;
    public final String LL;
    public final String LLILLJJLI;

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public HashMap<String, HashMap<String, String>> getFlowGraph() {
        Pair[] pairArr = new Pair[7];
        String firstStepId = getFirstStepId();
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair(PIIBindPromptFragment.PIIBindPromptActions.PrimaryButtonClickAction.class.getSimpleName(), Intrinsics.LJFF(this.LL, "unverified_1p") ? "pii_verify_email_for_bind" : "verify_email_code_for_bind");
        String simpleName = PIIBindPromptFragment.PIIBindPromptActions.SecondaryButtonClickAction.class.getSimpleName();
        ThirdPartyDeprecationExperiment5.LIZ.getClass();
        pairArr2[1] = new Pair(simpleName, ThirdPartyDeprecationExperiment5.LJ() ? "enter_phone_for_bind" : "pii_input_email_for_change");
        pairArr2[2] = new Pair(PIIBindPromptFragment.PIIBindPromptActions.ChangeButtonClickAction.class.getSimpleName(), "pii_input_email_for_change");
        pairArr[0] = new Pair(firstStepId, C2097608Jq.LJI(pairArr2));
        pairArr[1] = new Pair("pii_input_email_for_change", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "pii_verify_email_code_for_change")));
        pairArr[2] = new Pair("enter_phone_for_bind", C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickSendCodeAction.class.getSimpleName(), "pii_verify_phone_for_change")));
        pairArr[3] = new Pair("pii_verify_email_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password")));
        pairArr[4] = new Pair("verify_email_code_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password")));
        pairArr[5] = new Pair("pii_verify_email_code_for_change", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password")));
        pairArr[6] = new Pair("pii_verify_phone_for_change", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password")));
        return C2097608Jq.LJI(pairArr);
    }

    public C853870Xeb() {
        this("");
    }

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public String getFirstStepId() {
        return this.LLILLJJLI;
    }

    public final String getSource() {
        return this.LL;
    }

    public C853870Xeb(String str) {
        this.LL = str;
        this.LLILLJJLI = "pii_bind_email";
    }
}
