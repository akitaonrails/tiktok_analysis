package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.algorithm.VEAudioAlgorithmParam;
import com.ss.android.vesdk.algorithm.VEBachAlgorithmParam;
import com.ss.android.vesdk.algorithm.VEBaseAlgorithmParam;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.utils.TEArrayUtils;
import java.util.List;

/* JADX INFO: renamed from: X.1DLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254321DLi {
    public static final String LIZ = C2254321DLi.class.getSimpleName();

    public static TEBundle LIZ(VETrackParams vETrackParams) {
        boolean z;
        TEBundle tEBundleObtain = TEBundle.obtain();
        C1D40 c1d40 = vETrackParams.trackPriority;
        if (c1d40 != C1D40.DEFAULT) {
            if (c1d40 == C1D40.HOST) {
                z = true;
            } else {
                z = false;
            }
            tEBundleObtain.setBool("IsHostTrack", z);
        }
        int i = vETrackParams.layer;
        if (i > -1) {
            tEBundleObtain.setInt("Layer", i);
        }
        List<String> list = vETrackParams.paths;
        if (list != null) {
            tEBundleObtain.setStringArray("Paths", TEArrayUtils.toStringArray(list));
        }
        List<Integer> list2 = vETrackParams.trimIns;
        if (list2 != null) {
            tEBundleObtain.setIntArray("TrimIns", TEArrayUtils.toIntArray(list2));
        }
        List<Integer> list3 = vETrackParams.trimOuts;
        if (list3 != null) {
            tEBundleObtain.setIntArray("TrimOuts", TEArrayUtils.toIntArray(list3));
        }
        List<Integer> list4 = vETrackParams.seqIns;
        if (list4 != null) {
            tEBundleObtain.setIntArray("SequenceIns", TEArrayUtils.toIntArray(list4));
        }
        List<Integer> list5 = vETrackParams.seqOuts;
        if (list5 != null) {
            tEBundleObtain.setIntArray("SequenceOuts", TEArrayUtils.toIntArray(list5));
        }
        List<Double> list6 = vETrackParams.speeds;
        if (list6 != null) {
            tEBundleObtain.setDoubleArray("Speeds", TEArrayUtils.toDoubleArray(list6));
        }
        int i2 = vETrackParams.extFlag;
        if (i2 != 0) {
            tEBundleObtain.setInt("ExtFlag", i2);
        }
        List<VESize> list7 = vETrackParams.sizes;
        if (list7 != null) {
            int size = list7.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                VESize vESize = (VESize) ListProtector.get(vETrackParams.sizes, i3);
                iArr[i3] = vESize.height | (vESize.width << 15);
            }
            tEBundleObtain.setIntArray("Sizes", iArr);
        }
        return tEBundleObtain;
    }

    public static TEBundle LIZIZ(C2254401DLq c2254401DLq) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setString("RecordDir", c2254401DLq.LIZ);
        tEBundleObtain.setFloat("RecordSpeed", 1.0f);
        tEBundleObtain.setInt("RenderWidth", c2254401DLq.LJJIIJ.width);
        tEBundleObtain.setInt("RenderHeight", c2254401DLq.LJJIIJ.height);
        tEBundleObtain.setInt("RecordMicConfig", c2254401DLq.LJJIII.ordinal());
        tEBundleObtain.setInt("RecordContentType", c2254401DLq.LJI);
        tEBundleObtain.setBool("enableHDR10BitProcessingPipeline", c2254401DLq.LJIIIIZZ);
        tEBundleObtain.setBool("enablePureHDR10BitProcessingPipeline", c2254401DLq.LJIIIZ);
        tEBundleObtain.setBool("enableDynamicRecordContentType", c2254401DLq.LJII);
        tEBundleObtain.setBool("NeedPostProcess", c2254401DLq.LJIIJJI);
        tEBundleObtain.setString("VideoPath", c2254401DLq.LIZIZ);
        tEBundleObtain.setString("AudioPath", c2254401DLq.LIZJ);
        tEBundleObtain.setBool("enableRecordEffectContentHighSpeed", c2254401DLq.LJIIJ);
        tEBundleObtain.setBool("enableSmallWindowDoubleThreadOpt", false);
        tEBundleObtain.setBool("enableEncodeBinGLContextReuse", c2254401DLq.LJIIL);
        tEBundleObtain.setBool("enableEffectAmazingEngine", c2254401DLq.LJIILIIL);
        tEBundleObtain.setBool("enable2DEngineEffect", c2254401DLq.LJIILJJIL);
        tEBundleObtain.setBool("enableFollowShotIndependentThread", c2254401DLq.LJIILL);
        boolean zBooleanValue = true;
        tEBundleObtain.setBool("AudioGraphRefactor", true);
        tEBundleObtain.setBool("useAudioGraphOutput", c2254401DLq.LJIILLIIL);
        tEBundleObtain.setBool("EnableReleaseGPUResource", c2254401DLq.LJIIZILJ);
        tEBundleObtain.setBool("EnableAudioDecodeTimeOpt", c2254401DLq.LJIJ);
        tEBundleObtain.setBool("EnableModelHotUpdate", c2254401DLq.LJIJJ);
        tEBundleObtain.setBool("EnableRenderLayer", c2254401DLq.LJIJI);
        tEBundleObtain.setBool("EnablePassEffectWhenNoEffect", c2254401DLq.LJIJJLI);
        tEBundleObtain.setBool("VideoDecodeUseSetMultiTrackStatus", c2254401DLq.LJIL);
        if (!c2254401DLq.LJIJI || !c2254401DLq.LJIJJ) {
            zBooleanValue = VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue();
        }
        tEBundleObtain.setBool("EnableVideoDecodeOpt", zBooleanValue);
        tEBundleObtain.setInt("RenderThreadSelfDriveConfig", c2254401DLq.LJJ);
        tEBundleObtain.setBool("AudioOpt", c2254401DLq.LJJIFFI);
        tEBundleObtain.setBool("EnableRecordMattingOpt", c2254401DLq.LJJI);
        tEBundleObtain.setBool("EnablePlayAVSyncOpt", c2254401DLq.LJJII);
        return tEBundleObtain;
    }

    public static TEBundle LIZLLL(C2254411DLr c2254411DLr) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("GetFrameMode", c2254411DLr.LIZ.ordinal());
        tEBundleObtain.setInt("TargetWidth", c2254411DLr.LIZIZ.width);
        tEBundleObtain.setInt("TargetHeight", c2254411DLr.LIZIZ.height);
        tEBundleObtain.setInt("OriginTargetWidth", c2254411DLr.LIZJ.width);
        tEBundleObtain.setInt("OriginTargetHeight", c2254411DLr.LIZJ.height);
        tEBundleObtain.setBool("TwoFrameOpt", c2254411DLr.LIZLLL);
        tEBundleObtain.setInt("FitMode", c2254411DLr.LJI.ordinal());
        tEBundleObtain.setInt("EffectType", c2254411DLr.LJ.ordinal());
        tEBundleObtain.setBool("DrawToScreen", c2254411DLr.LJFF);
        tEBundleObtain.setInt("MirrorMode", c2254411DLr.LJIIIIZZ.ordinal());
        tEBundleObtain.setBool("NeedProcessAsCameraFrame", c2254411DLr.LJIIIZ);
        tEBundleObtain.setInt("EffectRotation", c2254411DLr.LJIIJ);
        tEBundleObtain.setInt("Rotate", 0);
        tEBundleObtain.setBool("NeedDelay", c2254411DLr.LJIIJJI);
        tEBundleObtain.setInt("FrameInterval", c2254411DLr.LJIIZILJ);
        tEBundleObtain.setString("FileCacheDir", c2254411DLr.LJIILLIIL);
        tEBundleObtain.setString("FileName", c2254411DLr.LJIIL);
        tEBundleObtain.setInt("ResultType", c2254411DLr.LJIILIIL.ordinal());
        tEBundleObtain.setInt("CameraFacing", c2254411DLr.LJIJI);
        tEBundleObtain.setBool("WithOrigin", c2254411DLr.LJIJJ);
        tEBundleObtain.setString("PathForGetFrameWithTexture", c2254411DLr.LJIILL);
        tEBundleObtain.setLong("RecordTimestamp", 0L);
        return tEBundleObtain;
    }

    public static TEBundle LJ(VESafeAreaParams vESafeAreaParams) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("SafeType", vESafeAreaParams.safeType);
        tEBundleObtain.setFloat("left", vESafeAreaParams.left);
        tEBundleObtain.setFloat("top", vESafeAreaParams.top);
        tEBundleObtain.setFloat("right", vESafeAreaParams.right);
        tEBundleObtain.setFloat("bottom", vESafeAreaParams.bottom);
        return tEBundleObtain;
    }

    public static TEBundle LJFF(VEVideoEncodeSettings vEVideoEncodeSettings) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("OutputWidth", vEVideoEncodeSettings.getVideoRes().width);
        tEBundleObtain.setInt("OutputHeight", vEVideoEncodeSettings.getVideoRes().height);
        tEBundleObtain.setInt("BitrateMode", vEVideoEncodeSettings.getBitrateMode().ordinal());
        tEBundleObtain.setInt("Bps", vEVideoEncodeSettings.getBps());
        tEBundleObtain.setInt("SwCRF", vEVideoEncodeSettings.getSwCRF());
        tEBundleObtain.setInt("SwQP", vEVideoEncodeSettings.getSwQP());
        tEBundleObtain.setInt("SwPreset", vEVideoEncodeSettings.getSwPreset());
        tEBundleObtain.setInt("Fps", vEVideoEncodeSettings.getFps());
        tEBundleObtain.setInt("FitMode", vEVideoEncodeSettings.getFitMode().ordinal());
        tEBundleObtain.setInt("MirrorMode", vEVideoEncodeSettings.getMirrorMode().ordinal());
        int encodeStandard = vEVideoEncodeSettings.getEncodeStandard();
        boolean zBooleanValue = VEConfigCenter.getInstance().getValue("enable_record_mpeg4", false).booleanValue();
        String str = LIZ;
        if (zBooleanValue) {
            encodeStandard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal();
            C2484209oO.LJI(str, "setCodecType MPEG4");
        } else if (VEConfigCenter.getInstance().getValue("ve_enable_record_hevc", false).booleanValue()) {
            encodeStandard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal();
            C2484209oO.LJI(str, "setCodecType ByteVC1");
        }
        tEBundleObtain.setInt("EncodeStandard", encodeStandard);
        tEBundleObtain.setBool("BanExtraDataLoop", vEVideoEncodeSettings.isBanExtraDataLoop());
        tEBundleObtain.setInt("EncodeProfile", vEVideoEncodeSettings.getEncodeProfile());
        tEBundleObtain.setBool("IsHw", vEVideoEncodeSettings.isSupportHwEnc());
        tEBundleObtain.setInt("Rotate", vEVideoEncodeSettings.getRotate());
        tEBundleObtain.setFloat("Speed", vEVideoEncodeSettings.getSpeed());
        tEBundleObtain.setInt("Gop", vEVideoEncodeSettings.getGopSize());
        tEBundleObtain.setBool("RecordingMp4", vEVideoEncodeSettings.isRecordingMp4());
        tEBundleObtain.setInt("ResolutionAlign", vEVideoEncodeSettings.getResolutionAlignment());
        tEBundleObtain.setInt("KeyFrameDuration", vEVideoEncodeSettings.getKeyFrameDuration());
        tEBundleObtain.setInt("MaxCacheDuration", vEVideoEncodeSettings.getMaxCacheDuration());
        tEBundleObtain.setDouble("HdrBitrateRatio", vEVideoEncodeSettings.getHdrBitrateRatio());
        return tEBundleObtain;
    }

    public static TEBundle LJI(VEBaseAlgorithmParam vEBaseAlgorithmParam) {
        int algorithmType = vEBaseAlgorithmParam.getAlgorithmType();
        if (algorithmType != 0) {
            if (algorithmType != 100) {
                if (algorithmType != 7) {
                    if (algorithmType != 8) {
                        return null;
                    }
                    VEBachAlgorithmParam vEBachAlgorithmParam = (VEBachAlgorithmParam) vEBaseAlgorithmParam;
                    TEBundle tEBundleObtain = TEBundle.obtain();
                    tEBundleObtain.setString("graphName", vEBachAlgorithmParam.graphName);
                    tEBundleObtain.setString("algorithmConfig", vEBachAlgorithmParam.algorithmConfig);
                    return tEBundleObtain;
                }
                C1DM3 c1dm3 = (C1DM3) vEBaseAlgorithmParam;
                TEBundle tEBundleObtain2 = TEBundle.obtain();
                tEBundleObtain2.setFloat("detectRectLeft", c1dm3.LIZ);
                tEBundleObtain2.setFloat("detectRectTop", c1dm3.LIZIZ);
                tEBundleObtain2.setFloat("detectRectWidth", c1dm3.LIZJ);
                tEBundleObtain2.setFloat("detectRectHeight", c1dm3.LIZLLL);
                tEBundleObtain2.setBool("enableDetectRect", c1dm3.LJ);
                tEBundleObtain2.setInt("scanMode", 0);
                tEBundleObtain2.setLong("detectRequirement", c1dm3.LJFF);
                tEBundleObtain2.setInt("codeType", 0);
                tEBundleObtain2.setBool("decodeMultiple", false);
                tEBundleObtain2.setBool("enhanceCamera", false);
                return tEBundleObtain2;
            }
            TEBundle tEBundleObtain3 = TEBundle.obtain();
            tEBundleObtain3.setString("Model", ((VEAudioAlgorithmParam) vEBaseAlgorithmParam).getModelPath());
            return tEBundleObtain3;
        }
        C1DMM c1dmm = (C1DMM) vEBaseAlgorithmParam;
        TEBundle tEBundleObtain4 = TEBundle.obtain();
        tEBundleObtain4.setInt("interval", c1dmm.LIZ);
        tEBundleObtain4.setBool("is image mode", false);
        tEBundleObtain4.setBool("is fast mode", false);
        tEBundleObtain4.setBool("for init", c1dmm.getForInit());
        return tEBundleObtain4;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ttve.nativePort.TEBundle LJII(com.ss.android.vesdk.filterparam.VEBaseFilterParam r9) {
        /*
            Method dump skipped, instruction units count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2254321DLi.LJII(com.ss.android.vesdk.filterparam.VEBaseFilterParam):com.ss.android.ttve.nativePort.TEBundle");
    }

    public static TEBundle LJIIIIZZ(VEPrePlayParams vEPrePlayParams) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("Duration", vEPrePlayParams.duration);
        tEBundleObtain.setBool("IsLoop", vEPrePlayParams.isLoop);
        tEBundleObtain.setInt("StopStrategy", vEPrePlayParams.stopStrategy);
        tEBundleObtain.setInt("TimeUnit", vEPrePlayParams.timeUnit);
        return tEBundleObtain;
    }

    public static TEBundle LIZJ(VEDisplaySettings vEDisplaySettings, VEPreviewSettings vEPreviewSettings) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("TranslateX", vEDisplaySettings.getTranslateX());
        tEBundleObtain.setInt("TranslateY", vEDisplaySettings.getTranslateY());
        tEBundleObtain.setBool("FlipX", vEDisplaySettings.getFlipX());
        tEBundleObtain.setBool("FlipY", vEDisplaySettings.getFlipY());
        tEBundleObtain.setInt("FitMode", vEDisplaySettings.getFitMode().ordinal());
        tEBundleObtain.setInt("Rotation", vEDisplaySettings.getRotation());
        tEBundleObtain.setFloat("DisplayRatio", vEDisplaySettings.getDisplayRatio());
        tEBundleObtain.setInt("CameraEffectRotation", vEDisplaySettings.getEffectRotation());
        tEBundleObtain.setInt("DisplayRotation", vEDisplaySettings.getDisplayRotation());
        tEBundleObtain.setBool("AdaptSurfaceSize", vEDisplaySettings.isForceAdaptSurfaceSize());
        if (vEDisplaySettings.getRenderSize() != null) {
            tEBundleObtain.setInt("RenderWidth", vEDisplaySettings.getRenderSize().width);
            tEBundleObtain.setInt("RenderHeight", vEDisplaySettings.getRenderSize().height);
        }
        if (vEDisplaySettings.getPreviewDowngradingRenderSize() != null) {
            tEBundleObtain.setInt("PreviewDowngradingRenderWidth", vEDisplaySettings.getPreviewDowngradingRenderSize().width);
            tEBundleObtain.setInt("PreviewDowngradingRenderHeight", vEDisplaySettings.getPreviewDowngradingRenderSize().height);
        }
        tEBundleObtain.setBool("EnablePreviewResolutionDowngrading", vEDisplaySettings.isPreviewResolutionDowngradingEnabled());
        if (vEDisplaySettings.getLayoutSize() != null) {
            tEBundleObtain.setInt("LayoutWidth", vEDisplaySettings.getLayoutSize().width);
            tEBundleObtain.setInt("LayoutHeight", vEDisplaySettings.getLayoutSize().height);
        }
        if (vEDisplaySettings.getCamOutSize() != null) {
            tEBundleObtain.setInt("CamOutWidth", vEDisplaySettings.getCamOutSize().width);
            tEBundleObtain.setInt("CamOutHeight", vEDisplaySettings.getCamOutSize().height);
        }
        if (vEDisplaySettings.getCanvasSize() != null && vEDisplaySettings.getCanvasSize().isValid()) {
            tEBundleObtain.setInt("CanvasWidth", vEDisplaySettings.getCanvasSize().width);
            tEBundleObtain.setInt("CanvasHeight", vEDisplaySettings.getCanvasSize().height);
        }
        tEBundleObtain.setLong("cameraHDR10BitDynamicRangeProfile", vEDisplaySettings.getCameraHDR10BitDynamicRangeProfile());
        tEBundleObtain.setLong("targetHDR10BitDynamicRangeProfile", vEDisplaySettings.getTargetHDR10BitDynamicRangeProfile());
        tEBundleObtain.setBool("enablePureHDR10Bit", vEPreviewSettings.isPureHDR10BitProcessingPipelineEnabled());
        tEBundleObtain.setBool("reducePerFrameCallbackOptimization", vEDisplaySettings.isReducePerFrameCallbackOptimizationEnabled());
        return tEBundleObtain;
    }
}
