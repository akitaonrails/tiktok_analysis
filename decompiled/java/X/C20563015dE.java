package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator.ThresholdAdaptionResultOperator;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20563015dE extends AbstractC20562115d5 {
    public static C20563015dE LLILZ;
    public final C1869410ykN LLILLJJLI;
    public final String LLILLL = "search_detail_handler";

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILLL;
    }

    public C20563015dE(C1869410ykN c1869410ykN) {
        this.LLILLJJLI = c1869410ykN;
    }

    public final VideoAdaptionResult LIZIZ(VideoAdaptionParams videoAdaptionParams) {
        return C20563515dJ.LIZIZ(videoAdaptionParams.getContainerWidth(), videoAdaptionParams.getContainerHeight(), videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight(), C20563515dJ.LIZ(this.LLILLJJLI.getWidthThreshold(), this.LLILLJJLI.getHeightThreshold(), videoAdaptionParams.getContainerWidth(), videoAdaptionParams.getContainerHeight(), videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight()));
    }

    @Override // X.AbstractC20562115d5
    public final VideoAdaptionResult LIZ(VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult) {
        InterfaceC582290Msd interfaceC582290Msd;
        InterfaceC1874070yrt feedScreenContext;
        EnumC20563715dL enumC20563715dL;
        int i;
        VideoAdaptionResult videoAdaptionResultLIZIZ;
        float height;
        if (!C20559315cd.LIZ(videoAdaptionParams)) {
            Lj(null, videoAdaptionParams, null, AFwS221S0000000_31.get$arr$(477));
            return null;
        }
        InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
        if ((paramsOperator instanceof InterfaceC582290Msd) && (interfaceC582290Msd = (InterfaceC582290Msd) paramsOperator) != null && (feedScreenContext = interfaceC582290Msd.getFeedScreenContext()) != null) {
            float fMax = Math.max(((((feedScreenContext.getScreenHeight() - feedScreenContext.getStatusBarHeight()) - feedScreenContext.getTopTabHeight()) - feedScreenContext.getBottomTabHeight()) - feedScreenContext.getBottomBannerHeight()) / feedScreenContext.getScreenWidth(), 1.0f);
            C20568715e9 c20568715e9 = EnumC20563715dL.Companion;
            int alignType = this.LLILLJJLI.getAlignType();
            c20568715e9.getClass();
            if (alignType != 1) {
                if (alignType != 2) {
                    if (alignType != 3) {
                        enumC20563715dL = EnumC20563715dL.CENTER;
                    } else {
                        enumC20563715dL = EnumC20563715dL.CROP;
                    }
                } else {
                    enumC20563715dL = EnumC20563715dL.TOP;
                }
            } else {
                enumC20563715dL = EnumC20563715dL.CENTER;
            }
            if (videoAdaptionParams.getVideoRatio() >= fMax && (i = C20563815dM.LIZ[enumC20563715dL.ordinal()]) != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int containerHeight = videoAdaptionParams.getContainerHeight() - (this.LLILLJJLI.getSpace() * 2);
                        videoAdaptionResultLIZIZ = C20563515dJ.LIZIZ(videoAdaptionParams.getContainerWidth(), containerHeight, videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight(), C20563515dJ.LIZ(0.15f, this.LLILLJJLI.getHeightThreshold(), videoAdaptionParams.getContainerWidth(), containerHeight, videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight()));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    int containerHeight2 = videoAdaptionParams.getContainerHeight() - (this.LLILLJJLI.getSpace() * 2);
                    ThresholdAdaptionResultOperator thresholdAdaptionResultOperatorLIZ = C20563515dJ.LIZ(this.LLILLJJLI.getWidthThreshold(), this.LLILLJJLI.getHeightThreshold(), videoAdaptionParams.getContainerWidth(), containerHeight2, videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight());
                    VideoAdaptionResult videoAdaptionResultLIZIZ2 = C20563515dJ.LIZIZ(videoAdaptionParams.getContainerWidth(), containerHeight2, videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight(), thresholdAdaptionResultOperatorLIZ);
                    if (thresholdAdaptionResultOperatorLIZ.getAlignType() == EnumC20564215dQ.WIDTH && thresholdAdaptionResultOperatorLIZ.getAdaptionScaleType() == EnumC20563615dK.FIT) {
                        height = (videoAdaptionResultLIZIZ2.getHeight() - containerHeight2) / 2.0f;
                    } else {
                        height = 0.0f;
                    }
                    videoAdaptionResultLIZIZ = videoAdaptionResultLIZIZ2.copy(videoAdaptionResultLIZIZ2.width, videoAdaptionResultLIZIZ2.height, Float.valueOf(0.0f), Float.valueOf(height), videoAdaptionResultLIZIZ2.resultOperator);
                }
            } else {
                videoAdaptionResultLIZIZ = LIZIZ(videoAdaptionParams);
            }
            C844470XAv.LIZ.getClass();
            Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
            return videoAdaptionResultLIZIZ;
        }
        Lj(this.LLILLJJLI, null, null, AFwS221S0000000_31.get$arr$(478));
        return null;
    }
}
