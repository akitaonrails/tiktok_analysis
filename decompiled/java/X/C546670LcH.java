package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;

/* JADX INFO: renamed from: X.0LcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546670LcH {
    public static final boolean LIZ(AIGCGenerationModel aIGCGenerationModel) {
        if (aIGCGenerationModel.getStatus() == UsageStatus.FAIL) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(AIGCGenerationModel aIGCGenerationModel) {
        if (aIGCGenerationModel.getStatus() == UsageStatus.LOADING) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(AIGCGenerationModel aIGCGenerationModel) {
        if (aIGCGenerationModel.getStatus() == UsageStatus.SUCCESS_APPLY) {
            return true;
        }
        return false;
    }
}
