package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.watermark.WatermarkResSettingData;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0L9T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9T {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, Integer[] numArr, Function2 function2) {
        boolean z;
        boolean z2 = true;
        if (videoPublishEditModel.getWatermarkVideoResolution().width > 0 && videoPublishEditModel.getWatermarkVideoResolution().height > 0 && videoPublishEditModel.getWatermarkVideoResolution().width == numArr[0].intValue() && videoPublishEditModel.getWatermarkVideoResolution().height == numArr[1].intValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UploadWatermark; exist ; width : ");
            sbLIZ.append(videoPublishEditModel.getWatermarkVideoResolution().width);
            sbLIZ.append("; height : ");
            sbLIZ.append(videoPublishEditModel.getWatermarkVideoResolution().height);
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            if (function2 != null) {
                function2.invoke(Integer.valueOf(videoPublishEditModel.getWatermarkVideoResolution().width), Integer.valueOf(videoPublishEditModel.getWatermarkVideoResolution().height));
                return;
            }
            return;
        }
        videoPublishEditModel.setWatermarkVideoResolution(new C0L9R(numArr[0].intValue(), numArr[1].intValue()));
        int[] iArrLJJLIIIJLLLLLLLZ = C13LQ.LJJLIIIJLLLLLLLZ(numArr);
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "watermark_res_setting", "", true);
        if (strLJJ != null && strLJJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object objLJII = null;
        if (!z) {
            try {
                objLJII = C0CHQ.LIZ().getGson().LJII(strLJJ, WatermarkResSettingData.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Json AB ConfigError， Config:");
                sbLIZ2.append(strLJJ);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        WatermarkResSettingData watermarkResSettingData = (WatermarkResSettingData) objLJII;
        if (watermarkResSettingData != null) {
            C0L9R c0l9r = new C0L9R(iArrLJJLIIIJLLLLLLLZ[0], iArrLJJLIIIJLLLLLLLZ[1]);
            C0L9R c0l9r2 = new C0L9R(watermarkResSettingData.getWidth(), watermarkResSettingData.getHeight());
            if (c0l9r.isLargeOrEqualThan(c0l9r2, C0L9P.ALL_DIMENSION)) {
                C0L9R c0l9rScaleTo = new C0L9R(videoPublishEditModel.getWatermarkVideoResolution().width, videoPublishEditModel.getWatermarkVideoResolution().height).scaleTo(c0l9r2, C0L9S.FIT_CENTER);
                videoPublishEditModel.setWatermarkVideoResolution(new C0L9R(c0l9rScaleTo.width, c0l9rScaleTo.height));
            } else {
                z2 = false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("UploadWatermark AutoScale useWatermarkSetting:");
            sbLIZ3.append(z2);
            sbLIZ3.append(" sourceWidth:");
            sbLIZ3.append(c0l9r.width);
            sbLIZ3.append(" sourceHeight:");
            sbLIZ3.append(c0l9r.height);
            sbLIZ3.append(" targetWidth:");
            sbLIZ3.append(c0l9r2.width);
            sbLIZ3.append(" targetHeight:");
            sbLIZ3.append(c0l9r2.height);
            sbLIZ3.append(' ');
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("UploadWatermark width:");
        sbLIZ4.append(videoPublishEditModel.getWatermarkVideoResolution().width);
        sbLIZ4.append(" height:");
        sbLIZ4.append(videoPublishEditModel.getWatermarkVideoResolution().height);
        sbLIZ4.append(' ');
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
        if (function2 != null) {
            function2.invoke(Integer.valueOf(videoPublishEditModel.getWatermarkVideoResolution().width), Integer.valueOf(videoPublishEditModel.getWatermarkVideoResolution().height));
        }
    }
}
