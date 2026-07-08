package X;

import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439880nZa {
    public static final C1439880nZa LIZ = new C1439880nZa();

    public static int[] LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int[] iArrLJI = LJI(videoPublishEditModel);
        C0L9T.LIZ(videoPublishEditModel, new Integer[]{Integer.valueOf(iArrLJI[0]), Integer.valueOf(iArrLJI[1])}, null);
        return new int[]{videoPublishEditModel.getWatermarkVideoResolution().width, videoPublishEditModel.getWatermarkVideoResolution().height};
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        if (videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean zBooleanValue = ((Boolean) C281060Azw.LIZ.getValue()).booleanValue();
        if (z && zBooleanValue && !C1428470nHB.LJJJJJL(videoPublishEditModel.creativeModel)) {
            return true;
        }
        return false;
    }

    public static int LJ(VideoPublishEditModel videoPublishEditModel) {
        AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
        if (abstractC1437870nWLLIZ.LIZJ() == 0 || abstractC1437870nWLLIZ.LJFF() == 0) {
            return 0;
        }
        float outVideoWidth = videoPublishEditModel.getOutVideoWidth() / abstractC1437870nWLLIZ.LJFF();
        float outVideoHeight = videoPublishEditModel.getOutVideoHeight() / abstractC1437870nWLLIZ.LIZJ();
        if (outVideoWidth != 1.0f && outVideoHeight != 1.0f && outVideoWidth == outVideoHeight) {
            return 1;
        }
        if ((abstractC1437870nWLLIZ.LJI() == abstractC1437870nWLLIZ.LIZJ() && abstractC1437870nWLLIZ.LIZLLL() == abstractC1437870nWLLIZ.LJFF()) || videoPublishEditModel.getOutVideoWidth() == abstractC1437870nWLLIZ.LJFF()) {
            return 0;
        }
        return 2;
    }

    public static final int[] LJFF(VideoPublishEditModel videoPublishEditModel) {
        long speed;
        C1437400nVa c1437400nVa = new C1437400nVa();
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = -6;
        }
        return new C1437700nW4(new C1437060nV2(videoPublishEditModel, c1437400nVa, new C1154760g9i(C1441320nbu.LIZJ(speed)))).LIZ();
    }

    public static final int[] LJI(VideoPublishEditModel videoPublishEditModel) {
        int[] iArrLJFF = LJFF(videoPublishEditModel);
        if (iArrLJFF[0] <= 0 || iArrLJFF[1] <= 0) {
            return new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
        }
        return iArrLJFF;
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        long speed;
        C1437400nVa c1437400nVa = new C1437400nVa();
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = -6;
        }
        return new C1437690nW3(new C1437060nV2(videoPublishEditModel, c1437400nVa, new C1154760g9i(C1441320nbu.LIZJ(speed)))).LIZ().booleanValue();
    }

    public static final VEVideoEncodeSettings LIZ(int i, int i2) {
        VEVideoEncodeSettings.ENCODE_PRESET encode_preset;
        C1780100wQK c1780100wQK = new C1780100wQK(3);
        SettingsManager.LIZLLL().getClass();
        c1780100wQK.LIZIZ.gopSize = SettingsManager.LJ("synthetic_video_gop", 35);
        c1780100wQK.LJIIJ(i, i2);
        boolean zEnableHardEncodeForSynthetic = AVSettingsWrapper.enableHardEncodeForSynthetic();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEWatermarkParamBuilder VEVideoEncodeSettings hardEncode:");
        sbLIZ.append(zEnableHardEncodeForSynthetic);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (zEnableHardEncodeForSynthetic) {
            c1780100wQK.LIZIZ.isSupportHWEncoder = true;
            c1780100wQK.LJIIIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, (int) (C1442480ndm.LIZ() * 4.0f * 1000.0f * 1000.0f));
        } else {
            c1780100wQK.LIZIZ.isSupportHWEncoder = false;
            c1780100wQK.LJIIIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, C1439870nZZ.LIZ());
        }
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("synthetic_video_preset", 0);
        VEVideoEncodeSettings.ENCODE_PRESET[] encode_presetArrValues = VEVideoEncodeSettings.ENCODE_PRESET.values();
        if (iLJ >= 0 && iLJ < encode_presetArrValues.length && (encode_preset = encode_presetArrValues[iLJ]) != null) {
            c1780100wQK.LIZIZ.swPreset = encode_preset.ordinal();
        }
        SettingsManager.LIZLLL().getClass();
        long jLJFF = SettingsManager.LJFF("synthetic_video_maxrate", 15000000L);
        VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
        vEVideoEncodeSettings.swMaxrate = jLJFF;
        vEVideoEncodeSettings.enableRemuxVideo = false;
        vEVideoEncodeSettings.resizeMode = 1;
        return c1780100wQK.LIZ();
    }

    public static boolean LJII(VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (z) {
            return true;
        }
        AVUploadSaveModel saveModel = videoPublishEditModel.getSaveModel();
        if (saveModel == null) {
            return false;
        }
        if ((videoPublishEditModel.isSaveLocal() || videoPublishEditModel.isSilentShare()) && saveModel.isWaterMark()) {
            return true;
        }
        return false;
    }

    public static final C1441830ncj LIZJ(VideoPublishEditModel videoPublishEditModel, LifecycleOwner lifecycleOwner, SurfaceView surfaceView) {
        boolean needExpandCompiledSize;
        InfoStickerModel infoStickerModel;
        String str;
        C348100Dkm c348100DkmLIZIZ;
        C348440DlK c348440DlKLJJIIJZLJL;
        List<StickerItemModel> list;
        float outVideoWidth;
        AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel != null) {
            needExpandCompiledSize = coverPublishModel.getNeedExpandCompiledSize();
        } else {
            needExpandCompiledSize = false;
        }
        abstractC1437870nWLLIZ.LJ(needExpandCompiledSize, false);
        VEPreviewParams vEPreviewParamsLJI = C571500MbE.LJI(videoPublishEditModel, 3, -1, -1);
        int iLIZLLL = abstractC1437870nWLLIZ.LIZLLL();
        int iLJI = abstractC1437870nWLLIZ.LJI();
        if (videoPublishEditModel.isPhotoMvMode() && C1442670ne5.LIZ()) {
            int[] iArrLJFF = LJFF(videoPublishEditModel);
            iLIZLLL = iArrLJFF[0];
            iLJI = iArrLJFF[1];
        }
        vEPreviewParamsLJI.mCanvasWidth = iLIZLLL;
        vEPreviewParamsLJI.mCanvasHeight = iLJI;
        String[] strArr = vEPreviewParamsLJI.mVideoPaths;
        if (strArr != null) {
            C089E c089e = new C089E(strArr);
            while (c089e.hasNext()) {
                String str2 = (String) c089e.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[createFromVideoPublishEditModel]: segment.videoPath = ");
                sbLIZ.append(str2);
                C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        String[] strArr2 = vEPreviewParamsLJI.mAudioPaths;
        if (strArr2 != null) {
            C089E c089e2 = new C089E(strArr2);
            while (c089e2.hasNext()) {
                String str3 = (String) c089e2.next();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[createFromVideoPublishEditModel]: segment.audioPath = ");
                sbLIZ2.append(str3);
                C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (videoPublishEditModel.getVeAudioEffectParam() != null) {
            vEPreviewParamsLJI.setVeAudioEffectParam(videoPublishEditModel.getVeAudioEffectParam());
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(vEPreviewParamsLJI);
        MutableLiveData<InfoStickerModel> mutableLiveData2 = new MutableLiveData<>();
        InfoStickerModel infoStickerModel2 = videoPublishEditModel.getInfoStickerModel();
        if (surfaceView == null && infoStickerModel2 != null && C0IKQ.LIZIZ(infoStickerModel2.stickers) && C1428470nHB.LLIILZL(videoPublishEditModel)) {
            infoStickerModel = infoStickerModel2.m186clone();
            boolean zLIZ = C537820L7k.LIZ(videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight());
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (!stickerItemModel.isImageStickerLayer) {
                    float[] fArrLIZ = C1429750nJF.LIZ(stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY, videoPublishEditModel.getVideoCanvasWidth(), videoPublishEditModel.getVideoCanvasHeight(), videoPublishEditModel.getOutVideoWidth(), videoPublishEditModel.getOutVideoHeight());
                    stickerItemModel.currentOffsetX = fArrLIZ[0];
                    stickerItemModel.currentOffsetY = fArrLIZ[1];
                    if (zLIZ && C301490Brn.LIZ() && ((Boolean) C272170Alb.LIZ.getValue()).booleanValue() && videoPublishEditModel.getVideoCanvasWidth() > videoPublishEditModel.getOutVideoWidth()) {
                        float videoCanvasWidth = 0.0f;
                        if (videoPublishEditModel.getOutVideoHeight() != 0) {
                            outVideoWidth = videoPublishEditModel.getOutVideoWidth() / videoPublishEditModel.getOutVideoHeight();
                        } else {
                            outVideoWidth = 0.0f;
                        }
                        if (videoPublishEditModel.getVideoCanvasWidth() != 0) {
                            videoCanvasWidth = videoPublishEditModel.getVideoCanvasWidth() / videoPublishEditModel.getVideoCanvasHeight();
                        }
                        if (videoCanvasWidth > outVideoWidth) {
                            stickerItemModel.scale *= videoPublishEditModel.getVideoCanvasWidth() / videoPublishEditModel.getOutVideoWidth();
                        }
                    }
                }
            }
        } else {
            infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        }
        mutableLiveData2.setValue(infoStickerModel);
        if (videoPublishEditModel.getMvCreateVideoData() != null && videoPublishEditModel.creativeModel.editSaveLocalModel.forceSaveToVideo) {
            str = "MvSaveLocalCompile";
        } else {
            str = "compile";
        }
        C1441830ncj c1441830ncj = new C1441830ncj(videoPublishEditModel.getVideoEditorType(), C1428520nHG.LJJZZIII(videoPublishEditModel).getValue(), C1428520nHG.LJJZZI(videoPublishEditModel).getValue(), str, C338630DPh.LIZ());
        if (TextUtils.isEmpty(videoPublishEditModel.getNleData())) {
            NLEEditor nLEEditor = C1449720npS.LIZLLL(videoPublishEditModel, null, 6).LIZLLL().LIZ;
            nLEEditor.done();
            videoPublishEditModel.setNleData(nLEEditor.store());
            c1441830ncj.LJIJI = nLEEditor.getModel();
        } else {
            c1441830ncj.LJIJJ = videoPublishEditModel.getNleData();
        }
        c1441830ncj.LJIILL = 1;
        AbstractC1452680nuE abstractC1452680nuE = c1441830ncj.LJIILJJIL;
        if (abstractC1452680nuE != null) {
            abstractC1452680nuE.LJIIZILJ = 1;
        }
        LIZ.getClass();
        int iLJ = LJ(videoPublishEditModel);
        c1441830ncj.LJIILLIIL = iLJ;
        if (iLJ == 0) {
            c1441830ncj.LJIILLIIL = 1;
        }
        c1441830ncj.LJIILJJIL.getClass();
        c1441830ncj.LJI = mutableLiveData2;
        c1441830ncj.LJII = new MutableLiveData<>(videoPublishEditModel.creativeModel.stickerModel);
        c1441830ncj.LIZLLL = mutableLiveData;
        c1441830ncj.LIZIZ(null, lifecycleOwner, surfaceView, videoPublishEditModel);
        if (((Number) C261680ANi.LIZ.getValue()).intValue() != 0 || !C1428470nHB.LJJZZI(videoPublishEditModel)) {
            InfoStickerModel value = mutableLiveData2.getValue();
            if (C1428470nHB.LLIILZL(videoPublishEditModel) && (c348100DkmLIZIZ = C352130DrH.LIZIZ(c1441830ncj.LJIIIZ)) != null) {
                if (value != null && (list = value.stickers) != null && (!list.isEmpty())) {
                    ArrayList<StickerItemModel> arrayList = new ArrayList();
                    for (StickerItemModel stickerItemModel2 : list) {
                        if (!stickerItemModel2.isImageStickerLayer) {
                            arrayList.add(stickerItemModel2);
                        }
                    }
                    for (StickerItemModel stickerItemModel3 : arrayList) {
                        C348440DlK c348440DlKLJJIIJZLJL2 = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(stickerItemModel3.uuid);
                        if (c348440DlKLJJIIJZLJL2 != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("before transform, scale: ");
                            sbLIZ3.append(c348440DlKLJJIIJZLJL2.LJIIJ);
                            sbLIZ3.append(", x: ");
                            sbLIZ3.append(c348440DlKLJJIIJZLJL2.LJFF);
                            sbLIZ3.append(", y: ");
                            sbLIZ3.append(c348440DlKLJJIIJZLJL2.LJI);
                            sbLIZ3.append(", transformX: ");
                            float f = 2;
                            sbLIZ3.append((c348440DlKLJJIIJZLJL2.LJFF - 0.5f) * f);
                            sbLIZ3.append(", transformY: ");
                            sbLIZ3.append((0.5f - c348440DlKLJJIIJZLJL2.LJI) * f);
                            C201955140j.LIZIZ("ltc_canvas", C2188811AlT.LIZIZ(sbLIZ3));
                            c348440DlKLJJIIJZLJL2.LJFF = stickerItemModel3.currentOffsetX;
                            c348440DlKLJJIIJZLJL2.LJI = stickerItemModel3.currentOffsetY;
                            c348440DlKLJJIIJZLJL2.LJIIJ = stickerItemModel3.scale;
                            c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL2);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("after transform, scale: ");
                            sbLIZ4.append(c348440DlKLJJIIJZLJL2.LJIIJ);
                            sbLIZ4.append(", x: ");
                            sbLIZ4.append(c348440DlKLJJIIJZLJL2.LJFF);
                            sbLIZ4.append(", y: ");
                            sbLIZ4.append(c348440DlKLJJIIJZLJL2.LJI);
                            sbLIZ4.append(", transformX: ");
                            sbLIZ4.append((c348440DlKLJJIIJZLJL2.LJFF - 0.5f) * f);
                            sbLIZ4.append(", transformY: ");
                            sbLIZ4.append((0.5f - c348440DlKLJJIIJZLJL2.LJI) * f);
                            C201955140j.LIZIZ("ltc_canvas", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                }
                List<TextStickerModel> list2 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
                ArrayList<TextStickerModel> arrayList2 = new ArrayList();
                for (TextStickerModel textStickerModel : list2) {
                    if (textStickerModel.isVERenderSticker()) {
                        arrayList2.add(textStickerModel);
                    }
                }
                for (TextStickerModel textStickerModel2 : arrayList2) {
                    String uuid = textStickerModel2.getUuid();
                    if (C123100dR.LIZ(uuid) && uuid != null && (c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(uuid)) != null) {
                        c348440DlKLJJIIJZLJL.LJFF = (textStickerModel2.getBaseStickerModel().getTranslateX() / textStickerModel2.getBaseStickerModel().getMediaWidth()) + 0.5f;
                        c348440DlKLJJIIJZLJL.LJI = (textStickerModel2.getBaseStickerModel().getTranslateY() / textStickerModel2.getBaseStickerModel().getMediaHeight()) + 0.5f;
                        c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    }
                }
            }
        }
        return c1441830ncj;
    }
}
