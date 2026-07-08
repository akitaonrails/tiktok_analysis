package X;

import android.app.Activity;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator.ThresholdAdaptionResultOperator;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15dH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20563315dH extends AbstractC20562115d5 {
    public static C20563315dH LLILZ;
    public final C20566215dk LLILLJJLI;
    public final String LLILLL = "threshold_handler";

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILLL;
    }

    public C20563315dH(C20566215dk c20566215dk) {
        this.LLILLJJLI = c20566215dk;
    }

    @Override // X.AbstractC20562115d5
    public final VideoAdaptionResult LIZ(VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult) {
        float widthThreshold;
        float heightThreshold;
        InterfaceC20566915dr interfaceC20566915dr;
        boolean z;
        float f;
        EnumC20563615dK enumC20563615dK;
        EnumC20564215dQ enumC20564215dQ;
        EnumC20563615dK forceScaleType;
        VideoAdaptionResult videoAdaptionResult2;
        Activity activityLIZIZ;
        int iLIZJ;
        Integer numValueOf;
        C1030980cw4 c1030980cw4LIZ;
        InterfaceC20566915dr interfaceC20566915dr2;
        EnumC20563615dK forceScaleType2;
        Float fValueOf;
        Activity activityLIZIZ2 = null;
        if (!C20559315cd.LIZ(videoAdaptionParams)) {
            Lj(null, null, null, AFwS221S0000000_31.get$arr$(346));
            return null;
        }
        InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
        if ((paramsOperator instanceof InterfaceC20566915dr) && (interfaceC20566915dr2 = (InterfaceC20566915dr) paramsOperator) != null && (forceScaleType2 = interfaceC20566915dr2.getForceScaleType()) != null && (fValueOf = Float.valueOf(forceScaleType2.getThreshold())) != null) {
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
        InterfaceC589490NAd paramsOperator2 = videoAdaptionParams.getParamsOperator();
        if (paramsOperator2 instanceof InterfaceC20566915dr) {
            interfaceC20566915dr = (InterfaceC20566915dr) paramsOperator2;
        } else {
            interfaceC20566915dr = null;
        }
        int i = containerHeight * videoWidth;
        int i2 = videoHeight * containerWidth;
        int iIntValue = 0;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 1.0f - (i2 / i);
            if (f > widthThreshold) {
                enumC20563615dK = EnumC20563615dK.FIT;
                enumC20564215dQ = EnumC20564215dQ.WIDTH;
            } else {
                enumC20563615dK = EnumC20563615dK.CROP;
                enumC20564215dQ = EnumC20564215dQ.HEIGHT;
            }
        } else {
            f = 1.0f - (i / i2);
            if (f > heightThreshold) {
                enumC20563615dK = EnumC20563615dK.FIT;
                enumC20564215dQ = EnumC20564215dQ.HEIGHT;
            } else {
                enumC20563615dK = EnumC20563615dK.CROP;
                enumC20564215dQ = EnumC20564215dQ.WIDTH;
            }
        }
        ThresholdAdaptionResultOperator thresholdAdaptionResultOperator = new ThresholdAdaptionResultOperator(enumC20563615dK, enumC20564215dQ, f);
        if (interfaceC20566915dr != null) {
            forceScaleType = interfaceC20566915dr.getForceScaleType();
        } else {
            forceScaleType = null;
        }
        if (forceScaleType == EnumC20563615dK.CENTER_SPOTLIGHT && interfaceC20566915dr.getScaleInfo() != null) {
            C20556215c8 scaleInfo = interfaceC20566915dr.getScaleInfo();
            Float fValueOf2 = Float.valueOf(0.0f);
            if (videoHeight > 0 && videoWidth > 0) {
                if (scaleInfo != null) {
                    int iLJFF = C418440Gaw.LJFF(containerWidth, C20642515q3.LIZ());
                    containerWidth += (int) (((scaleInfo.LIZ / 3) - iLJFF) * C20642515q3.LIZ().getResources().getDisplayMetrics().density);
                    containerHeight = (videoHeight * containerWidth) / videoWidth;
                }
                C1046940dLo.LIZ.getClass();
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null) {
                    activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                } else {
                    activityLIZIZ = null;
                }
                if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                    iLIZJ = C14KI.LIZJ(activityLIZIZ);
                } else {
                    iLIZJ = 0;
                }
                AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ2 != null) {
                    activityLIZIZ2 = abstractC1387200mCcLJ2.LIZIZ();
                }
                if ((activityLIZIZ2 instanceof Activity) && activityLIZIZ2 != null) {
                    if (C2077408Bw.LIZIZ(activityLIZIZ2) && !C521230KcL.LIZ(activityLIZIZ2)) {
                        ISplashAdOutService iSplashAdOutService = (ISplashAdOutService) PluggableExtentionKt.pluggableSpi$default(ISplashAdOutService.class, false, false, false, 14, null);
                        if (iSplashAdOutService != null && (c1030980cw4LIZ = iSplashAdOutService.LIZ()) != null) {
                            numValueOf = Integer.valueOf(c1030980cw4LIZ.LJJIIZ());
                        }
                    } else {
                        numValueOf = 0;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                videoAdaptionResult2 = new VideoAdaptionResult(containerWidth, containerHeight, fValueOf2, Float.valueOf((((iIntValue * 0.5f) + (iLIZJ * 0.5f)) - (86 * C20642515q3.LIZ().getResources().getDisplayMetrics().density)) + (containerHeight * 0.1f)), thresholdAdaptionResultOperator);
            } else {
                videoAdaptionResult2 = new VideoAdaptionResult(containerWidth, containerHeight, fValueOf2, fValueOf2, thresholdAdaptionResultOperator);
            }
        } else {
            Float fValueOf3 = Float.valueOf(0.0f);
            if (videoHeight > 0 && videoWidth > 0) {
                int i3 = C20564115dP.LIZ[thresholdAdaptionResultOperator.getAlignType().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new C1954807lC();
                        }
                    } else {
                        containerWidth = i / videoHeight;
                    }
                } else {
                    containerHeight = i2 / videoWidth;
                }
                videoAdaptionResult2 = new VideoAdaptionResult(containerWidth, containerHeight, fValueOf3, fValueOf3, thresholdAdaptionResultOperator);
            } else {
                videoAdaptionResult2 = new VideoAdaptionResult(containerWidth, containerHeight, fValueOf3, fValueOf3, thresholdAdaptionResultOperator);
            }
        }
        if (videoAdaptionResult != null) {
            VideoAdaptionResult videoAdaptionResultCopy = videoAdaptionResult.copy(videoAdaptionResult2.getWidth(), videoAdaptionResult2.getHeight(), videoAdaptionResult.translateX, videoAdaptionResult.translateY, videoAdaptionResult2.getResultOperator());
            if (videoAdaptionResultCopy != null) {
                return videoAdaptionResultCopy;
            }
        }
        return videoAdaptionResult2;
    }
}
