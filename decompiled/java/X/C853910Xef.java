package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Xef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853910Xef extends AbstractC854370XfP {
    public static final int $stable = 0;
    public final String LL = "pii_input_phone";

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public HashMap<String, HashMap<String, String>> getFlowGraph() {
        return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(PIIBindPromptFragment.PIIBindPromptActions.ClickSendCodeAction.class.getSimpleName(), "verify_phone_for_bind"), new Pair(PIIBindPromptFragment.PIIBindPromptActions.SecondaryButtonClickAction.class.getSimpleName(), "input_email_for_bind"), new Pair(PIIBindPromptFragment.PIIBindPromptActions.ChangeButtonClickAction.class.getSimpleName(), "input_email_for_bind"))), new Pair("input_email_for_bind", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "verify_email_code_for_bind"))), new Pair("verify_phone_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password"))), new Pair("verify_email_code_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password"))));
    }

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public String getFirstStepId() {
        return this.LL;
    }
}
