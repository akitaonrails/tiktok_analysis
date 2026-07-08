package X;

import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MC4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MC4 {
    public static final void LIZ(PromptRequestState promptRequestState, Function0<Unit> function0, Function1<? super List<PromptModel>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        PromptRequestStateType promptRequestStateType = promptRequestState.state;
        if (promptRequestStateType == PromptRequestStateType.LOADING) {
            function0.invoke();
        } else if (promptRequestStateType == PromptRequestStateType.SUCCESS) {
            function1.invoke(promptRequestState.prompts);
        } else {
            if (promptRequestStateType != PromptRequestStateType.FAIL) {
                return;
            }
            function12.invoke(promptRequestState.error);
        }
    }
}
