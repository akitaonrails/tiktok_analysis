package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15dG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20563215dG extends AbstractC20562115d5 {
    public static C20563215dG LLILZ;
    public final C20566215dk LLILLJJLI;
    public final String LLILLL = "threshold_handler";

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILLL;
    }

    public C20563215dG(C20566215dk c20566215dk) {
        this.LLILLJJLI = c20566215dk;
    }

    @Override // X.AbstractC20562115d5
    public final VideoAdaptionResult LIZ(VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult) {
        float widthThreshold;
        float heightThreshold;
        InterfaceC20566915dr interfaceC20566915dr;
        EnumC20563615dK forceScaleType;
        Float fValueOf;
        if (!C20559315cd.LIZ(videoAdaptionParams)) {
            Lj(null, null, null, AFwS221S0000000_31.get$arr$(347));
            return null;
        }
        InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
        if ((paramsOperator instanceof InterfaceC20566915dr) && (interfaceC20566915dr = (InterfaceC20566915dr) paramsOperator) != null && (forceScaleType = interfaceC20566915dr.getForceScaleType()) != null && (fValueOf = Float.valueOf(forceScaleType.getThreshold())) != null) {
            widthThreshold = fValueOf.floatValue();
            heightThreshold = fValueOf.floatValue();
        } else {
            widthThreshold = this.LLILLJJLI.getWidthThreshold();
            heightThreshold = this.LLILLJJLI.getHeightThreshold();
        }
        int containerWidth = videoAdaptionParams.getContainerWidth();
        int containerHeight = videoAdaptionParams.getContainerHeight();
        int videoWidth = videoAdaptionParams.getVideoWidth();
        int videoHeight = videoAdaptionParams.getVideoHeight();
        VideoAdaptionResult videoAdaptionResultLIZIZ = C20563515dJ.LIZIZ(containerWidth, containerHeight, videoWidth, videoHeight, C20563515dJ.LIZ(widthThreshold, heightThreshold, containerWidth, containerHeight, videoWidth, videoHeight));
        if (videoAdaptionResult != null) {
            VideoAdaptionResult videoAdaptionResultCopy = videoAdaptionResult.copy(videoAdaptionResultLIZIZ.getWidth(), videoAdaptionResultLIZIZ.getHeight(), videoAdaptionResult.translateX, videoAdaptionResult.translateY, videoAdaptionResultLIZIZ.getResultOperator());
            if (videoAdaptionResultCopy != null) {
                return videoAdaptionResultCopy;
            }
        }
        return videoAdaptionResultLIZIZ;
    }
}
