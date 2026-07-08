package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;

/* JADX INFO: renamed from: X.0LeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548020LeS {
    public static final boolean LIZ(AwemeDraft awemeDraft) {
        IAIPortraitCreationService iAIPortraitCreationServiceLJFF;
        IAIPortraitFeatureService iAIPortraitFeatureService = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
        if (iAIPortraitFeatureService == null || (iAIPortraitCreationServiceLJFF = iAIPortraitFeatureService.LJFF()) == null || !iAIPortraitCreationServiceLJFF.LIZ(awemeDraft)) {
            return false;
        }
        return true;
    }
}
