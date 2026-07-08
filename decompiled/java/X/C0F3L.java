package X;

import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F3L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F3L implements InterfaceC379610EuV, InterfaceC350220DoC, C0EMV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664740tQG LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0F3L.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0F3L.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0F3L.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0F3L.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0F3L.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0F3L.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0F3L.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0F3L.class, "editProAdapterApi", "getEditProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0F3L(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456910o13.class, null);
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453760nvy.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1413540mt6.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455500nym.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, C0EYP.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        NLEModel nLEModelLIZ;
        C1DRG c1drgLJIIIZ;
        VideoPublishEditModel videoPublishEditModel = c0emo.LIZJ;
        if (videoPublishEditModel == null || (nLEModelLIZ = c0emo.LIZ()) == null) {
            return;
        }
        C1462070o9N c1462070o9NLb2 = ((C0EYP) this.LLJ.getValue(this, LLJI[7])).lb2();
        InterfaceC379580EuS interfaceC379580EuS = null;
        if (c1462070o9NLb2 != null && (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1462070o9NLb2)) != null) {
            interfaceC379580EuS = (InterfaceC379580EuS) c1drgLJIIIZ.LJIIL(null, InterfaceC379580EuS.class);
        }
        C366310EXt c366310EXt = c0emo.LIZLLL;
        if (c366310EXt != null) {
            LJI(nLEModelLIZ, videoPublishEditModel, c366310EXt.LIZJ, C0EYG.LIZ(videoPublishEditModel), interfaceC379580EuS);
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        C366310EXt c366310EXt;
        C383310F1d subtitleMusicChangeChecker;
        VideoPublishEditModel videoPublishEditModel = c0emn.LIZJ;
        if (videoPublishEditModel != null && (c366310EXt = c0emn.LIZLLL) != null) {
            boolean z = c366310EXt.LIZJ;
            C383310F1d subtitleMusicChangeChecker2 = videoPublishEditModel.getSubtitleMusicChangeChecker();
            if (subtitleMusicChangeChecker2 != null) {
                subtitleMusicChangeChecker2.setHasAudioChangeInEditorPro(z);
            }
            if (C0EYG.LIZ(videoPublishEditModel) && !z && (subtitleMusicChangeChecker = videoPublishEditModel.getSubtitleMusicChangeChecker()) != null) {
                subtitleMusicChangeChecker.getData(videoPublishEditModel);
            }
        }
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    public final void LJI(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, InterfaceC379580EuS interfaceC379580EuS) {
        boolean z3;
        C1455260nyO c1455260nyO;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEResourceAV aVFile;
        String resourceFile;
        CanvasVideoData canvasVideoData;
        List<String> list;
        Object objLJJJLZIJ;
        CropData cropData;
        NLEStyCrop crop;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        int iOrdinal;
        float fFloatValue6;
        float fFloatValue7;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        if (z2 && z) {
            C201955140j.LIZ("EditRootScene -> change audio track in editor pro and extract audio");
            C1664740tQG c1664740tQG = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
            InterfaceC1456910o13 interfaceC1456910o13 = (InterfaceC1456910o13) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
            if (interfaceC1456910o13 != null) {
                interfaceC1456910o13.n80();
            }
            InterfaceC1456910o13 interfaceC1456910o132 = (InterfaceC1456910o13) this.LLILLJJLI.getValue(this, interfaceC2217461BqaArr[0]);
            if (interfaceC1456910o132 != null) {
                interfaceC1456910o132.Dt1(nLEModel);
            }
        }
        C1664740tQG c1664740tQG2 = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJI;
        InterfaceC1418580n1E interfaceC1418580n1E = (InterfaceC1418580n1E) c1664740tQG2.getValue(this, interfaceC2217461BqaArr2[1]);
        if (interfaceC1418580n1E != null) {
            interfaceC1418580n1E.ap2();
        }
        if (z || videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectResults() == null) {
            InterfaceC1453760nvy interfaceC1453760nvy = (InterfaceC1453760nvy) this.LLILZ.getValue(this, interfaceC2217461BqaArr2[2]);
            if (interfaceC1453760nvy != null) {
                interfaceC1453760nvy.a31();
            }
            InterfaceC1413540mt6 interfaceC1413540mt6 = (InterfaceC1413540mt6) this.LLILZIL.getValue(this, interfaceC2217461BqaArr2[3]);
            if (interfaceC1413540mt6 != null) {
                interfaceC1413540mt6.lz(null);
            }
        }
        C363500EMy.LIZ.getClass();
        if (C389790FQb.LIZIZ && C0F3M.LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zLJIIIIZZ = C363500EMy.LJIIIIZZ(videoPublishEditModel);
        if (z3) {
            C389790FQb.LIZ.getClass();
            C389790FQb.LIZ(videoPublishEditModel, true);
            C389790FQb.LIZIZ = false;
            videoPublishEditModel.setVideoEditorType(10);
            AVUploadMiscInfoStruct uploadMiscInfoStruct = videoPublishEditModel.getUploadMiscInfoStruct();
            if (uploadMiscInfoStruct != null) {
                uploadMiscInfoStruct.mvInfo = null;
            }
            AVUploadMiscInfoStruct uploadMiscInfoStruct2 = videoPublishEditModel.getUploadMiscInfoStruct();
            if (uploadMiscInfoStruct2 != null) {
                uploadMiscInfoStruct2.mvThemeId = null;
            }
            C1428640nHS.LIZ.getClass();
            C1428500nHE.LIZIZ(videoPublishEditModel, Boolean.valueOf(!C1428640nHS.LIZJ(videoPublishEditModel)));
            ((InterfaceC1446740nke) this.LLILZLL.getValue(this, interfaceC2217461BqaArr2[4])).Vc2();
            InterfaceC1452130ntL interfaceC1452130ntLLIZJ = ((InterfaceC1455850nzL) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr2[6])).x52().LIZJ();
            if (interfaceC1452130ntLLIZJ != null) {
                interfaceC1452130ntLLIZJ.JI0();
            }
            InterfaceC1455500nym interfaceC1455500nym = (InterfaceC1455500nym) this.LLIZ.getValue(this, interfaceC2217461BqaArr2[5]);
            if (interfaceC1455500nym != null) {
                interfaceC1455500nym.mR0();
            }
            this.LL.LJIIJ(InterfaceC1459560o5K.class);
            this.LL.LJIIJ(InterfaceC1415210mvn.class);
            if (interfaceC379580EuS != null) {
                interfaceC379580EuS.jh1();
            }
        }
        if (zLJIIIIZZ) {
            if (videoPublishEditModel.getPhotoCount() == 1 && videoPublishEditModel.getVideoCount() == 0 && !videoPublishEditModel.getEditorProModel().isPipUsed()) {
                if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && (list = canvasVideoData.sourceInfo) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list)) != null) {
                    if (!Intrinsics.LJFF(resourceFile, objLJJJLZIJ)) {
                        C0MOZ c0moz = new C0MOZ();
                        c0moz.LIZ = resourceFile;
                        CanvasVideoData canvasVideoDataLIZLLL = C0MOA.LIZLLL(c0moz, Collections.singletonList(resourceFile));
                        C0EP3 c0ep3 = AIGCInfo.Companion;
                        String extra = nLETrackSlot.getExtra("aigc_info");
                        c0ep3.getClass();
                        canvasVideoDataLIZLLL.setAigcInfo(C0EP3.LIZ(extra));
                        videoPublishEditModel.setCanvasVideoData(canvasVideoDataLIZLLL);
                    }
                    CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
                    if (canvasVideoData2 != null) {
                        CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
                        canvasFilterParam.setScaleFactor(nLETrackSlot.getScale());
                        float f = 360;
                        canvasFilterParam.setDegree(f - (nLETrackSlot.getRotation() % f));
                        canvasFilterParam.setTransX(nLETrackSlot.getTransformX());
                        canvasFilterParam.setTransY(nLETrackSlot.getTransformY());
                        canvasFilterParam.setClipIndex(0);
                        canvasVideoData2.updateTransform(0, canvasFilterParam);
                    }
                    CanvasVideoData canvasVideoData3 = videoPublishEditModel.getCanvasVideoData();
                    if (canvasVideoData3 != null) {
                        NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast2 != null && (crop = nLESegmentVideoDynamicCast2.getCrop()) != null) {
                            float xLeft = crop.getXLeft();
                            float yUpper = crop.getYUpper();
                            float xRightUpper = crop.getXRightUpper();
                            float yRightUpper = crop.getYRightUpper();
                            float xLeftLower = crop.getXLeftLower();
                            float yLeftLower = crop.getYLeftLower();
                            float xRight = crop.getXRight();
                            float yLower = crop.getYLower();
                            Float fLJJJJJL = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_scale", null);
                            if (fLJJJJJL != null) {
                                fFloatValue = fLJJJJJL.floatValue();
                            } else {
                                fFloatValue = 0.0f;
                            }
                            Float fLJJJJJL2 = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_transX", null);
                            if (fLJJJJJL2 != null) {
                                fFloatValue2 = fLJJJJJL2.floatValue();
                            } else {
                                fFloatValue2 = 0.0f;
                            }
                            Float fLJJJJJL3 = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_transY", null);
                            if (fLJJJJJL3 != null) {
                                fFloatValue3 = fLJJJJJL3.floatValue();
                            } else {
                                fFloatValue3 = 0.0f;
                            }
                            Float fLJJJJJL4 = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_degree", null);
                            if (fLJJJJJL4 != null) {
                                fFloatValue4 = fLJJJJJL4.floatValue();
                            } else {
                                fFloatValue4 = 0.0f;
                            }
                            Float fLJJJJJL5 = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_ratio", null);
                            if (fLJJJJJL5 != null) {
                                fFloatValue5 = fLJJJJJL5.floatValue();
                            } else {
                                fFloatValue5 = 0.0f;
                            }
                            Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "ep_crop_mode", null);
                            if (numLJJJLZIJ != null) {
                                iOrdinal = numLJJJLZIJ.intValue();
                            } else {
                                iOrdinal = EnumC375190EnN.FREE.ordinal();
                            }
                            String extra2 = nLETrackSlot.getExtra("crop_matrix");
                            Float fLJJJJJL6 = C351220Dpo.LJJJJJL(nLETrackSlot, "crop_slider_rotation", null);
                            if (fLJJJJJL6 != null) {
                                fFloatValue6 = fLJJJJJL6.floatValue();
                            } else {
                                fFloatValue6 = 0.0f;
                            }
                            Float fLJJJJJL7 = C351220Dpo.LJJJJJL(nLETrackSlot, "crop_button_rotation", null);
                            if (fLJJJJJL7 != null) {
                                fFloatValue7 = fLJJJJJL7.floatValue();
                            } else {
                                fFloatValue7 = 0.0f;
                            }
                            Boolean boolLJJII = C351220Dpo.LJJII(nLETrackSlot, "crop_is_photo_cropped", null);
                            if (boolLJJII != null) {
                                zBooleanValue = boolLJJII.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            Boolean boolLJJII2 = C351220Dpo.LJJII(nLETrackSlot, "crop_mirror_x", null);
                            if (boolLJJII2 != null) {
                                zBooleanValue2 = boolLJJII2.booleanValue();
                            } else {
                                zBooleanValue2 = false;
                            }
                            cropData = new CropData(xLeft, yUpper, xRightUpper, yRightUpper, xLeftLower, yLeftLower, xRight, yLower, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, iOrdinal, extra2, fFloatValue6, fFloatValue7, zBooleanValue, zBooleanValue2);
                        } else {
                            cropData = null;
                        }
                        canvasVideoData3.setCropData(cropData);
                    }
                    videoPublishEditModel.setMultiEditVideoRecordData(null);
                }
            } else {
                videoPublishEditModel.setCanvasVideoData(null);
                videoPublishEditModel.getAvetParameter().setContentType("video");
                videoPublishEditModel.creativeModel.imagePublishModel.isCanvasVideoRemoved = true;
            }
            C0E50.LIZ = false;
            ((InterfaceC1446740nke) this.LLILZLL.getValue(this, interfaceC2217461BqaArr2[4])).Qb1(true);
        }
        if ((z3 || zLJIIIIZZ) && (c1455260nyO = (C1455260nyO) this.LL.LJIIL(null, C1455260nyO.class)) != null && c1455260nyO.LLLLIL == null) {
            C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c1455260nyO)).LLJJI;
            if (c1drg != null) {
                c1455260nyO.LLLLIL = (InterfaceC1419190n2D) c1drg.LJIIL(null, InterfaceC1419190n2D.class);
                InterfaceC1454950nxt interfaceC1454950nxt = (InterfaceC1454950nxt) c1455260nyO.LLLLIILLL.getValue();
                if (interfaceC1454950nxt != null) {
                    interfaceC1454950nxt.gs();
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
