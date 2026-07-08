package X;

import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS266S0300000_22;

/* JADX INFO: renamed from: X.0mjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407440mjG {
    public static final Map<String, LoudnessDetectResult> LIZ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, int[] r6, kotlin.jvm.functions.Function0 r7) {
        /*
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r5.getCanvasVideoData()
            com.ss.android.vesdk.LoudnessDetectResult r4 = X.C1444940nhk.LIZ(r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel r0 = r0.loudnessBalanceModel
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult> r1 = r0.loudnessMap
            java.lang.String r0 = r5.getWavFile()
            java.lang.Object r3 = r1.get(r0)
            r2 = 0
            if (r4 != 0) goto L2f
            boolean r1 = r5.isDuet()
            com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableLoudNormAndAlignInDuetConfig r0 = X.C1660880tK2.LIZ()
            boolean r0 = r0.enableLoudnessNorm
            if (r0 == 0) goto L3c
            if (r1 == 0) goto L3c
            boolean r0 = r5.isMuted()
            if (r0 != 0) goto L3c
            if (r3 == 0) goto L3c
        L2f:
            r1 = 1
        L30:
            int r0 = X.C13LQ.LJJIJ(r2, r6)
            if (r0 < 0) goto L3b
            if (r1 == 0) goto L3b
            r7.invoke()
        L3b:
            return
        L3c:
            r1 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407440mjG.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int[], kotlin.jvm.functions.Function0):void");
    }

    public static final void LIZ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel, int[] iArr, C1408120mkM c1408120mkM) {
        if (interfaceC1452170ntP == null) {
            return;
        }
        C1407420mjE c1407420mjE = new C1407420mjE();
        LIZIZ(videoPublishEditModel, iArr, new AwS266S0300000_22(c1407420mjE, interfaceC1452170ntP, videoPublishEditModel, 18));
        for (C1407400mjC c1407400mjC : (ArrayList) c1407420mjE.LIZ()) {
            if (!videoPublishEditModel.creativeModel.loudnessBalanceModel.balanceTypes.contains(Integer.valueOf(c1407400mjC.LJI))) {
                videoPublishEditModel.creativeModel.loudnessBalanceModel.balanceTypes.add(Integer.valueOf(c1407400mjC.LJI));
            }
        }
        C1444940nhk.LIZ(videoPublishEditModel.getCanvasVideoData());
        c1407420mjE.LIZIZ(videoPublishEditModel, interfaceC1452170ntP, c1408120mkM);
    }
}
