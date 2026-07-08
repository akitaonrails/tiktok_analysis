package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;

/* JADX INFO: renamed from: X.0MAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563980MAa {
    public static final void LIZ(C19EG c19eg, String str, String str2) {
        C563770M9f c563770M9fLIZLLL;
        SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
        if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
            c563770M9fLIZLLL.startStoryPublish(c19eg, new EnterStoryParam(null, str, str2, null, null, null, null, null, null, false, false, false, 0, 0.0f, 0, null, null, null, null, null, null, false, null, false, null, null, 67108857, null), c563770M9fLIZLLL.chooseBPEAToken("bpea-story_guide_upload_card_target34", "bpea-story_guide_upload_card_target33", "bpea-story_guide_upload_card"));
        }
    }
}
