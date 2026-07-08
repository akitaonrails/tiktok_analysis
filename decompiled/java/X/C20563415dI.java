package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator.MultiContainerThresholdResultOperator;

/* JADX INFO: renamed from: X.15dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20563415dI {
    public static VideoAdaptionResult LIZ(VideoAdaptionResult videoAdaptionResult, boolean z) {
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperatorCopy = null;
        InterfaceC1869707Tz resultOperator = videoAdaptionResult.getResultOperator();
        if ((resultOperator instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator = (MultiContainerThresholdResultOperator) resultOperator) != null) {
            multiContainerThresholdResultOperatorCopy = multiContainerThresholdResultOperator.copy(multiContainerThresholdResultOperator.topType, multiContainerThresholdResultOperator.bottomType, multiContainerThresholdResultOperator.topHeight, multiContainerThresholdResultOperator.bottomHeight, multiContainerThresholdResultOperator.adjustContainerHeight, multiContainerThresholdResultOperator.adjustContainerWidth, multiContainerThresholdResultOperator.adaptionScaleType, multiContainerThresholdResultOperator.alignType, multiContainerThresholdResultOperator.areaDiff, multiContainerThresholdResultOperator.videoAdaptionParams, Boolean.valueOf(z));
        }
        return videoAdaptionResult.copy(videoAdaptionResult.width, videoAdaptionResult.height, videoAdaptionResult.translateX, videoAdaptionResult.translateY, multiContainerThresholdResultOperatorCopy);
    }
}
