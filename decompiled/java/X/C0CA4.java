package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CA4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CA4 {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, Function1<? super Integer, Unit> function1) {
        int iLIZ = C0C1C.LIZ();
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("enable_synthetic_fps_set", true);
        int iMaxFps4Videos = videoPublishEditModel.maxFps4Videos();
        int iVideoFps = videoPublishEditModel.videoFps(false);
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 16, "studio_vq_dynamic_element_low_video_fps_threshold", true);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_vq_enable_low_video_fps_opt", true, false)) {
            if (C1428470nHB.LJJIJL(videoPublishEditModel) && iMaxFps4Videos < iLJIJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UploadFps ; opt , video ; fpsLimit : ");
                sbLIZ.append(iLIZ);
                sbLIZ.append(" , dynamicElementLowVideoFpsThreshold : ");
                sbLIZ.append(iLJIJ);
                sbLIZ.append("; sourceFps : ");
                sbLIZ.append(iMaxFps4Videos);
                sbLIZ.append(" ; setFps : ");
                sbLIZ.append(iLJIJ);
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                function1.invoke(Integer.valueOf(iLJIJ));
                return;
            }
            if (!zLIZ || iVideoFps <= 0) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("UploadFps ; opt, video ; enableFpsSet : ");
            sbLIZ2.append(zLIZ);
            sbLIZ2.append(" ; setFps : ");
            sbLIZ2.append(iMaxFps4Videos);
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            function1.invoke(Integer.valueOf(iVideoFps));
            return;
        }
        if (C1428470nHB.LJJIJL(videoPublishEditModel) && iVideoFps < 10) {
            if (iLIZ > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("UploadFps ; video ; fpsLimit : ");
                sbLIZ3.append(iLIZ);
                sbLIZ3.append(" ; sourceFps : ");
                sbLIZ3.append(iVideoFps);
                sbLIZ3.append(" ; setFps : 30");
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                function1.invoke(30);
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("UploadFps ; video ; fpsLimit : ");
            sbLIZ4.append(iLIZ);
            sbLIZ4.append(" ; setFps : 30");
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
            function1.invoke(30);
            return;
        }
        if (!zLIZ || iVideoFps <= 0) {
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("UploadFps ; video ; enableFpsSet : ");
        sbLIZ5.append(zLIZ);
        sbLIZ5.append(" ; setFps : ");
        sbLIZ5.append(iVideoFps);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ5));
        function1.invoke(Integer.valueOf(iVideoFps));
    }
}
