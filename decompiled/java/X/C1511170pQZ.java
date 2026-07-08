package X;

import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;

/* JADX INFO: renamed from: X.0pQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511170pQZ {
    public static int LIZ() {
        CommerceSmartUITasks predictTaskIndex;
        SmartFeedAdUIService.Companion.getClass();
        ISmartFeedAdUIService iSmartFeedAdUIService = C1511140pQW.LIZ;
        if (iSmartFeedAdUIService.getSmartAdUIExperimentValue() == null || LIZIZ() == null || (predictTaskIndex = iSmartFeedAdUIService.getPredictTaskIndex()) == null) {
            return -100;
        }
        return predictTaskIndex.getAdCardDelay();
    }

    public static String LIZIZ() {
        SmartFeedAdUIService.Companion.getClass();
        String predictLabelResult = C1511140pQW.LIZ.getPredictLabelResult();
        if (predictLabelResult == null) {
            return null;
        }
        return predictLabelResult;
    }
}
