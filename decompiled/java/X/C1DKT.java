package X;

import android.os.Build;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1DKT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DKT {
    public static final VEPreviewSettings LIZ(C1DKV c1dkv) {
        VEDisplaySettings vEDisplaySettingsLJIIJJI;
        VEPreviewSettings.Builder builder = new VEPreviewSettings.Builder();
        builder.enableAudioRecord(c1dkv.LJIILJJIL());
        builder.enableReducePerFrameCallbackOptimization(c1dkv.LJIILIIL());
        if (c1dkv.LJIILL()) {
            builder.optFirstFrame(false);
        } else {
            builder.optFirstFrame(true);
        }
        if (c1dkv.LJJI() != 0) {
            builder.enablePreloadEffectRes(true);
            builder.disableEffectInternalSetting(false);
            builder.setEffectAlgorithmRequirement(c1dkv.LJJI());
        } else {
            builder.disableEffectInternalSetting(true);
        }
        builder.blockRenderExit(true);
        if (!c1dkv.LJ()) {
            builder.setAsyncDetection(true);
        }
        int[] iArrLJIIIIZZ = c1dkv.LJIIZILJ().LJIIIIZZ();
        if (iArrLJIIIIZZ.length == 2) {
            builder.setRenderSize(new VESize(iArrLJIIIIZZ[0], iArrLJIIIIZZ[1]));
        }
        if (c1dkv.LJI() && (vEDisplaySettingsLJIIJJI = c1dkv.LJIIZILJ().LJIIJJI()) != null) {
            builder.setDisplaySettings(vEDisplaySettingsLJIIJJI);
        }
        builder.enable3buffer(c1dkv.LIZ());
        if (c1dkv.LJIILL()) {
            builder.optFirstFrame(false);
        } else {
            builder.optFirstFrame(!c1dkv.LJJIII().LIZ());
        }
        builder.enableCheckStatusWhenStopPreview(true);
        builder.enableDestroyEffectInStopPreview(true);
        builder.enableEffectAmazingEngine(false);
        builder.enable2DEngineEffect(false);
        builder.setGraphMode(EnumC1153060g6y.QR_CODE_GRAPH);
        builder.firstNFrameIntervalsAverageCnt(c1dkv.LJIIIIZZ());
        builder.setDisEnableEffectWhenNoUsed(c1dkv.LJJIIJ().invoke().booleanValue());
        List<C2185991Agv> listInvoke = c1dkv.LJFF().invoke();
        if (!listInvoke.isEmpty()) {
            builder.setExternalCapturePipelines(listInvoke);
            builder.setOutPutMode(VEPreviewSettings.CAMERA_OUTPUT_MODE.EXTERNAL_SURFACE);
        }
        if (Build.VERSION.SDK_INT >= 33 && c1dkv.LJIJI()) {
            builder.enableHDR10BitProcessingPipeline(true, false);
        }
        return builder.build();
    }

    public static final VEVideoEncodeSettings LIZIZ(C1DKV c1dkv) {
        C1780100wQK c1780100wQK = new C1780100wQK(1);
        String strLJ = c1dkv.LJJIII().LJ();
        String strLIZLLL = c1dkv.LJJIII().LIZLLL();
        if (strLJ.length() > 0) {
            strLIZLLL.length();
        }
        c1780100wQK.LIZIZ.isSupportHWEncoder = c1dkv.LJIILLIIL().LIZJ();
        c1780100wQK.LIZIZ.rotate = c1dkv.getRotation();
        Pair<Integer, Integer> pairLJJIIJZLJL = c1dkv.LJJIIJZLJL();
        float f = 1024;
        c1780100wQK.LJ((int) (c1dkv.LJIILLIIL().LIZIZ() * f * f));
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downgrade_sticker_preview_resolution_tag -> setBps: bitrate = ");
        sbLIZ.append(c1dkv.LJIILLIIL().LIZIZ());
        c2216241Boc.uu(C2188811AlT.LIZIZ(sbLIZ));
        c1780100wQK.LJFF(C1778450wNf.LIZ(c1dkv.LJIILLIIL().LJ()));
        int iLJI = c1dkv.LJIILLIIL().LJI();
        VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
        vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        vEVideoEncodeSettings.swQP = iLJI;
        int iIntValue = pairLJJIIJZLJL.getFirst().intValue();
        int iIntValue2 = pairLJJIIJZLJL.getSecond().intValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setVideoRes:  width = ");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append("  height = ");
        sbLIZ2.append(iIntValue2);
        sbLIZ2.append(' ');
        c2216241Boc.uu(C2188811AlT.LIZIZ(sbLIZ2));
        c1780100wQK.LJIIJ(iIntValue, iIntValue2);
        c1780100wQK.LIZIZ.mOptRemuxWithCopy = c1dkv.LJIILLIIL().LIZLLL();
        c1780100wQK.LIZIZ.mDescription = c1dkv.LJIILLIIL().LJII();
        c1780100wQK.LIZIZ.mRecordingMp4 = c1dkv.LIZLLL();
        return c1780100wQK.LIZ();
    }
}
