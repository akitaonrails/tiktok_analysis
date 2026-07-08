package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;

/* JADX INFO: renamed from: X.15cI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20557215cI {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(float f, float f2, float f3, float f4, int i, int i2) {
        if (i == 0 || i2 == 0 || f == 0.0f || f2 == 0.0f || f3 == 0.0f || f4 == 0.0f) {
            return false;
        }
        float f5 = i2;
        float f6 = i;
        return i2 > 0 && f2 > 0.0f && (f * (f5 / f6)) / f2 >= 0.75f && f4 * f6 > f5 * f3;
    }

    public static float LIZ(C20558915cZ c20558915cZ, int i, int i2, float f) {
        float fLIZIZ;
        float f2 = c20558915cZ.LIZLLL;
        float f3 = c20558915cZ.LIZIZ;
        float f4 = i2;
        float f5 = (i - i2) / 2.0f;
        float f6 = ((f2 / f3) * f4) + f5;
        float f7 = ((c20558915cZ.LJFF / f3) * f4) + f5;
        float f8 = 0.0f;
        if (f6 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + f) {
            fLIZIZ = (f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) - f6;
        } else {
            fLIZIZ = 0.0f;
        }
        if (fLIZIZ > f5) {
            fLIZIZ = f5;
        }
        if (fLIZIZ > 0.0f) {
            return fLIZIZ;
        }
        if (f7 > i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78))) {
            f8 = -(f7 - (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78))));
        }
        float f9 = -f5;
        if (f8 < f9) {
            return f9;
        }
        return f8;
    }

    public static boolean LIZIZ(VideoAdaptionParams videoAdaptionParams, int i, int i2, float f) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean ocrCheckEnable = videoAdaptionParams.getOcrCheckEnable();
        C20558915cZ ocrCheckInfo = videoAdaptionParams.getOcrCheckInfo();
        int videoHeight = videoAdaptionParams.getVideoHeight();
        int videoWidth = videoAdaptionParams.getVideoWidth();
        boolean z4 = false;
        if (!ocrCheckEnable || ocrCheckInfo == null || (i3 = i2 * videoWidth) <= (i4 = videoHeight * i) || 1.0f - (i4 / i3) >= videoAdaptionParams.getOcrCropThreshold()) {
            return false;
        }
        if (!C20559015ca.LIZ(ocrCheckInfo)) {
            return true;
        }
        float f2 = i2;
        int i5 = (int) ((videoWidth * f2) / videoHeight);
        boolean zIsRTL = videoAdaptionParams.isRTL();
        float f3 = ocrCheckInfo.LIZJ;
        float f4 = ocrCheckInfo.LIZ;
        float f5 = i5;
        float f6 = (f3 / f4) * f5;
        float f7 = (i5 - i) / 2.0f;
        float f8 = (ocrCheckInfo.LJ / f4) * f5;
        float f9 = i + f7;
        if (f6 > f7 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) && f8 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) + f9) {
            z = false;
        } else {
            z = true;
        }
        float f10 = ocrCheckInfo.LIZLLL;
        float f11 = ocrCheckInfo.LIZIZ;
        float f12 = (ocrCheckInfo.LJFF / f11) * f2;
        if ((f10 / f11) * f2 >= f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) && f12 <= i2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (f8 > f9 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!zIsRTL ? z || z2 || z3 : z || z2 || f6 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)) + f7) {
            z4 = true;
        }
        videoAdaptionParams.setOcrEffective(z4);
        return !videoAdaptionParams.isOcrEffective();
    }

    public static boolean LIZLLL(VideoAdaptionParams videoAdaptionParams, float f, float f2, float f3, float f4) {
        if (videoAdaptionParams.getBlurMode() != EnumC584530MwF.NONE && LIZJ(f, f2, f3, f4, videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight())) {
            return true;
        }
        return false;
    }
}
