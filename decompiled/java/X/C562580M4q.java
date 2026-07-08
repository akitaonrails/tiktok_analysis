package X;

import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562580M4q {
    public static final boolean LIZ(PromptModel promptModel) {
        if (!Intrinsics.LJFF(promptModel.promptTypeMob, "lora") && promptModel.promptType != PromptType.RECOMMEND_FROM_LORA) {
            return false;
        }
        return true;
    }
}
