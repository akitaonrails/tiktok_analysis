package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.strategies.CompileStrategyJsonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.settings.VideoInvisibleWatermarkSettings;
import java.util.List;
import kotlin.jvm.internal.AwS601S0100000_22;
import lth.o;

/* JADX INFO: renamed from: X.0nUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437030nUz {
    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        long speed;
        if (!LJFF(videoPublishEditModel) || !(videoPublishEditModel instanceof VideoPublishEditModel)) {
            return false;
        }
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = -6;
        }
        if (!C1441320nbu.LIZJ(speed) || !C1433000nOU.LIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        int iMin;
        if (videoPublishEditModel == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublisherMobHelper: isHighQualityVideo -> enable_photo_to_1080p = ");
        sbLIZ.append(C573200Mdy.LIZ());
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (videoPublishEditModel.isPhotoMvMode() && C573200Mdy.LIZ()) {
            return true;
        }
        AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
        int iLIZ = abstractC1437870nWLLIZ.LIZ(false);
        int iLIZIZ = abstractC1437870nWLLIZ.LIZIZ(false);
        Math.max(iLIZ, iLIZIZ);
        int iMin2 = Math.min(iLIZ, iLIZIZ);
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        int[] compileVideoSize = AVSettingsWrapper.getCompileVideoSize(C1442320ndW.LIZIZ(z));
        if (compileVideoSize != null) {
            Math.max(compileVideoSize[0], compileVideoSize[1]);
            iMin = Math.min(compileVideoSize[0], compileVideoSize[1]);
        } else {
            iMin = 720;
        }
        if (iMin2 <= iMin && C1404710mer.LIZ(videoPublishEditModel.videoPath()) <= C1442550ndt.LIZ()) {
            return false;
        }
        return true;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        CompileProbeResult compileProbeResult = videoPublishEditModel.getCompileProbeResult();
        if (compileProbeResult != null) {
            c0lab.LIZ(compileProbeResult.getStatus().getVeCode(), "pre_code");
            c0lab.LIZ(compileProbeResult.getStatus().getToolsCode(), "pre_tools_code");
            CompileProbeResult.ResultData data = compileProbeResult.getData();
            if (data != null) {
                c0lab.LIZ(data.getCrf(), "pre_crf");
                c0lab.LIZJ(Float.valueOf(data.getVideoBitrate()), "pre_bitrate");
                c0lab.LIZ(data.getDurationMs(), "pre_duration");
                c0lab.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrate()), "min_optBitrate");
                c0lab.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getOptBitrate()), "optBitrate");
                c0lab.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrateHD()), "min_optBitrate_HD");
                c0lab.LIZJ(Float.valueOf(data.getOptBitrateFromVE().getOptBitrateHD()), "optBitrate_HD");
            }
        }
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        long speed;
        int usedCompilerSettingGroup;
        if (videoPublishEditModel.getUploadSpeedInfo() != null) {
            if (videoPublishEditModel.getCompileProbeResult() == null || videoPublishEditModel.getCompileProbeResult().getStatus().getState() != CompileProbeResult.State.SUCCESS) {
                C1420140n3k.LIZIZ(videoPublishEditModel.getUploadSpeedInfo());
            }
            UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
            if (uploadSpeedInfo != null) {
                speed = uploadSpeedInfo.getSpeed();
            } else {
                speed = -6;
            }
            c0lab.LIZIZ(speed, "upload_probe_speed");
            UploadSpeedInfo uploadSpeedInfo2 = videoPublishEditModel.getUploadSpeedInfo();
            if (uploadSpeedInfo2 != null) {
                usedCompilerSettingGroup = uploadSpeedInfo2.getUsedCompilerSettingGroup();
            } else {
                usedCompilerSettingGroup = -1;
            }
            c0lab.LIZ(usedCompilerSettingGroup, "used_compiler_setting_group");
        }
    }

    public static final VEVideoEncodeSettings LIZJ(VideoPublishEditModel videoPublishEditModel, VEWatermarkParam vEWatermarkParam, InterfaceC1452170ntP interfaceC1452170ntP, String str, AbstractC1435110nRt abstractC1435110nRt, boolean z, boolean z2, boolean z3) {
        long speed;
        boolean zLIZJ;
        AbstractC1439850nZX abstractC1439850nZX;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        List<AbstractC1439960nZi> listLIZIZ;
        boolean zLJIIIIZZ;
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = -6;
        }
        C1437400nVa strategiesResult = videoPublishEditModel.getStrategiesResult();
        if (z3 && ((Boolean) C0BL8.LIZ.getValue()).booleanValue()) {
            zLIZJ = false;
        } else {
            zLIZJ = C1441320nbu.LIZJ(speed);
        }
        C1154760g9i c1154760g9i = new C1154760g9i(zLIZJ);
        InterfaceC1420020n3Y interfaceC1420020n3Y = o.LJFF;
        C1437050nV1 c1437050nV1 = new C1437050nV1(videoPublishEditModel, strategiesResult, c1154760g9i, interfaceC1452170ntP, vEWatermarkParam, C1437040nV0.LL, new C1437200nVG(C20186013yc.LIZ(), o.LJIILJJIL.LJIIIZ()), abstractC1435110nRt, z, z2);
        if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            abstractC1439850nZX = new AbstractC1439850nZX(c1437050nV1) { // from class: X.0nZv
                @Override // X.AbstractC1439850nZX
                public final void LIZIZ(C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0) {
                    c1440760nb0.LIZ(C1440160na2.LIZ, new AwS601S0100000_22(this, 775));
                    c1440760nb0.LIZ(C1440150na1.LIZ, new AwS601S0100000_22(this, 776));
                }
            };
        } else if (videoPublishEditModel.isPhotoMvMode()) {
            abstractC1439850nZX = new AbstractC1439850nZX(c1437050nV1) { // from class: X.0nZx
                @Override // X.AbstractC1439850nZX
                public final void LIZIZ(C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0) {
                    c1440760nb0.LIZ(C1440150na1.LIZ, new AwS601S0100000_22(this, 785));
                }
            };
        } else if (videoPublishEditModel.isMvThemeVideoType()) {
            abstractC1439850nZX = new AbstractC1439850nZX(c1437050nV1) { // from class: X.0nZz
                @Override // X.AbstractC1439850nZX
                public final void LIZIZ(C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0) {
                    c1440760nb0.LIZ(C1440150na1.LIZ, new AwS601S0100000_22(this, 787));
                }
            };
        } else if (videoPublishEditModel.isUploadVideo()) {
            abstractC1439850nZX = new AbstractC1439850nZX(c1437050nV1) { // from class: X.0nZw
                @Override // X.AbstractC1439850nZX
                public final void LIZIZ(C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0) {
                    c1440760nb0.LIZ(C1440150na1.LIZ, new AwS601S0100000_22(this, 777));
                }
            };
        } else {
            abstractC1439850nZX = new AbstractC1439850nZX(c1437050nV1) { // from class: X.0nZy
                @Override // X.AbstractC1439850nZX
                public final void LIZIZ(C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0) {
                    c1440760nb0.LIZ(C1440150na1.LIZ, new AwS601S0100000_22(this, 786));
                }
            };
        }
        C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0LIZIZ = C1440630nan.LIZIZ();
        c1440760nb0LIZIZ.LIZ(C1437140nVA.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 764));
        c1440760nb0LIZIZ.LIZ(C1437120nV8.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 765));
        c1440760nb0LIZIZ.LIZ(C1437130nV9.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 766));
        c1440760nb0LIZIZ.LIZ(new CompileStrategyJsonStruct() { // from class: X.0nV7
        }, new AwS601S0100000_22(abstractC1439850nZX, 767));
        c1440760nb0LIZIZ.LIZ(C1437190nVF.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 768));
        c1440760nb0LIZIZ.LIZ(C1437160nVC.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 769));
        c1440760nb0LIZIZ.LIZ(C1437080nV4.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 770));
        c1440760nb0LIZIZ.LIZ(C1437150nVB.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 771));
        c1440760nb0LIZIZ.LIZ(C1437100nV6.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 772));
        c1440760nb0LIZIZ.LIZ(C1437090nV5.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 761));
        c1440760nb0LIZIZ.LIZ(C1437180nVE.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 762));
        c1440760nb0LIZIZ.LIZ(C1437170nVD.LIZ, new AwS601S0100000_22(abstractC1439850nZX, 763));
        abstractC1439850nZX.LIZIZ(c1440760nb0LIZIZ);
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZ = abstractC1439850nZX.LIZ(c1440760nb0LIZIZ);
        abstractC1439850nZX.LIZ.LIZ.setSyntheticHardEncode(vEVideoEncodeSettingsLIZ.getVideoCompileEncodeSetting().useHWEncoder);
        List<AbstractC1439960nZi> listLIZIZ2 = abstractC1439850nZX.LIZ.LIZIZ.LIZIZ();
        if (listLIZIZ2 != null && !listLIZIZ2.isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4 && (C13LP.LJJJJZI(listLIZIZ2) instanceof C1439980nZk) && !abstractC1439850nZX.LIZ.LJI.Uf(vEVideoEncodeSettingsLIZ) && listLIZIZ2.size() >= 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && listLIZIZ2 != null) {
            ListProtector.remove(listLIZIZ2, 0);
            C564000MAc.LIZJ("reset smart external settings");
            vEVideoEncodeSettingsLIZ = abstractC1439850nZX.LIZ(c1440760nb0LIZIZ);
        }
        interfaceC1452170ntP.setSmartRecodeParam(c1437050nV1.LIZ(), (int) speed);
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fingerprint_opt_v2_kill_switch", true, false)) {
            if (C1429580nIy.LIZ()) {
                NLEModel nleModel = videoPublishEditModel.getNleModel();
                if (nleModel != null) {
                    zLJIIIIZZ = C1429320nIY.LJIIIIZZ(nleModel);
                } else {
                    zLJIIIIZZ = false;
                }
                C1435570nSd.LIZ.getClass();
                if (C1435570nSd.LIZLLL(videoPublishEditModel, zLJIIIIZZ) && ((C290500Ba4.LIZ() || C290490Ba3.LIZ()) && !z2 && C290490Ba3.LIZ())) {
                    vEVideoEncodeSettingsLIZ.setVideoInvisibleWatermarkSettings(C1435570nSd.LIZ(videoPublishEditModel));
                }
            }
        } else {
            if (videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean zLJI = C1436990nUv.LJI(videoPublishEditModel);
            if (!z6 && !zLJI) {
                z7 = false;
            } else {
                z7 = true;
            }
            C1435570nSd.LIZ.getClass();
            boolean zLIZJ2 = C2286708xd.LIZJ(C1435570nSd.LIZIZ);
            if (videoPublishEditModel.getCreationMode() == 1 && C1171720gb4.LIZ() && z7 && zLIZJ2) {
                VideoInvisibleWatermarkSettings videoInvisibleWatermarkSettings = new VideoInvisibleWatermarkSettings();
                String str2 = C1435570nSd.LIZIZ;
                String strLIZJ = C1435570nSd.LIZJ();
                videoPublishEditModel.creativeModel.privacySettingModel.fingerprintId = strLIZJ;
                videoInvisibleWatermarkSettings.watermarkStr = strLIZJ;
                videoInvisibleWatermarkSettings.algorithmName = C1435830nT3.LIZ().algorithmName;
                videoInvisibleWatermarkSettings.watermarkInterval = C306480Bzq.LIZ();
                videoInvisibleWatermarkSettings.algoVersion = C1435830nT3.LIZ().algoVersion;
                videoInvisibleWatermarkSettings.modelPath = str2;
                videoInvisibleWatermarkSettings.pFlag = C1435830nT3.LIZ().pFlag;
                videoInvisibleWatermarkSettings.enableDelayInit = C1435830nT3.LIZ().enableDelayInit;
                vEVideoEncodeSettingsLIZ.setVideoInvisibleWatermarkSettings(videoInvisibleWatermarkSettings);
                C1421580n64 c1421580n64 = C1421580n64.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("model path is: ");
                sbLIZ.append(str2);
                sbLIZ.append(", watermark str is: ");
                sbLIZ.append(strLIZJ);
                sbLIZ.append(". param set");
                C201955140j.LIZLLL(c1421580n64, "invisible_watermark", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C1437400nVa strategiesResult2 = videoPublishEditModel.getStrategiesResult();
        if (strategiesResult2 != null && (listLIZIZ = strategiesResult2.LIZIZ()) != null && !listLIZIZ.isEmpty()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("publish_id", str);
            c0lab.LJ("compile_label", ((AbstractC1439960nZi) ListProtector.get(listLIZIZ, 0)).getLabel());
            C20684815ws.LJIILLIIL("smart_compile_result", c0lab.LIZ);
        }
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        return vEVideoEncodeSettingsLIZ;
    }
}
