package X;

import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;

/* JADX INFO: renamed from: X.0MD9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MD9 {
    public static PromptModel LIZ(String str, PromptType promptType, boolean z, int i) {
        String strLIZ;
        boolean z2 = z;
        PromptType promptType2 = promptType;
        String str2 = str;
        String str3 = "";
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            promptType2 = PromptType.NO_PROMPT;
        }
        if ((i & 4) != 0) {
            strLIZ = C274160Aoo.LIZ();
        } else {
            strLIZ = null;
        }
        if ((i & 8) == 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return new PromptModel(str2, str2, promptType2, promptType2.getMobTag(), strLIZ, str3, z2);
    }
}
