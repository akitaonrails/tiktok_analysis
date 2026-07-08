package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0E1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357970E1r {
    public static final C357970E1r LIZ = new C357970E1r();

    public static void LIZ(NLETrackSlot nLETrackSlot) {
        float width;
        float height;
        float xRight;
        float xLeft;
        float yLower;
        float f;
        float f2;
        float f3;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
            float yUpper = 0.0f;
            if (aVFile != null) {
                width = aVFile.getWidth();
            } else {
                width = 0.0f;
            }
            NLEResourceAV aVFile2 = nLESegmentVideoDynamicCast.getAVFile();
            if (aVFile2 != null) {
                height = aVFile2.getHeight();
            } else {
                height = 1.0f;
            }
            NLEStyCrop crop = nLESegmentVideoDynamicCast.getCrop();
            if (crop != null) {
                xRight = crop.getXRight();
            } else {
                xRight = 0.0f;
            }
            NLEStyCrop crop2 = nLESegmentVideoDynamicCast.getCrop();
            if (crop2 != null) {
                xLeft = crop2.getXLeft();
            } else {
                xLeft = 0.0f;
            }
            NLEStyCrop crop3 = nLESegmentVideoDynamicCast.getCrop();
            if (crop3 != null) {
                yLower = crop3.getYLower();
            } else {
                yLower = 0.0f;
            }
            NLEStyCrop crop4 = nLESegmentVideoDynamicCast.getCrop();
            if (crop4 != null) {
                yUpper = crop4.getYUpper();
            }
            float f4 = xRight - xLeft;
            float f5 = yLower - yUpper;
            float f6 = width / height;
            float f7 = (width * f4) / (height * f5);
            int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C0CHQ.LIZ);
            int iLIZIZ = C1415610mwR.LIZIZ();
            int iLIZ = (((((((C1415610mwR.LIZ() - iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            if (f6 >= 1.0f) {
                f = iLIZIZ;
            } else {
                f = iLIZ * f6;
            }
            float f8 = f / f6;
            if (f7 >= 1.0f) {
                f2 = iLIZIZ / f4;
                f3 = f2 / f;
            } else {
                f2 = (iLIZ / f5) * f6;
                f3 = (f2 / f6) / f8;
            }
            float f9 = 2;
            float f10 = iLIZIZ;
            nLETrackSlot.setExtra("ep_crop_scale", String.valueOf(f3));
            nLETrackSlot.setExtra("ep_crop_ratio", String.valueOf(f7));
            nLETrackSlot.setExtra("ep_crop_transX", String.valueOf(((((xRight + xLeft) / f9) - 0.5f) * f2) / f10));
            nLETrackSlot.setExtra("ep_crop_transY", String.valueOf(((((yLower + yUpper) / f9) - 0.5f) * f2) / f10));
        }
    }
}
