package X;

import android.util.Pair;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundSchemaModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AiPlaygroundCameraModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorTabAlbumAICreate;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VERecordData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365910EWf extends AbstractC371450EhL<C351780Dqi> {
    public final VideoPublishEditModel LIZLLL;
    public final NLEModel LJ;
    public final String LJFF;
    public final C0ELI LJI;
    public VideoPublishEditModel LJII;

    public final NLEModel LJI() {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEModel nLEModel = this.LJ;
        if (nLEModel == null) {
            return null;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModel.deepClone());
        if (C307450C3j.LIZ() && C1428470nHB.LJFF(this.LIZLLL) && nLEModelDynamicCast != null && (mainTrack = nLEModelDynamicCast.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                if (nLETrackSlot.hasExtra("has_origin_audio_slot") && Boolean.parseBoolean(nLETrackSlot.getExtra("has_origin_audio_slot")) && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                    NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
                    if (aVFile != null) {
                        aVFile.setHasAudio(true);
                    }
                    nLESegmentVideoDynamicCast.setVolume(this.LIZLLL.getVoiceVolume());
                }
            }
        }
        return nLEModelDynamicCast;
    }

    public static NLEModel LJFF(VideoPublishEditModel videoPublishEditModel) {
        float canvasRatio;
        NLEEditor nLEEditor;
        NLEModel model;
        MultiEditVideoRecordData multiEditVideoRecordData;
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null) {
            Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(multiEditVideoRecordData);
            vERecordDataLIZJ.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
            C574120MfS.LIZIZ(vERecordDataLIZJ, nLEEditorLIZ, false, 1.0f);
        }
        if (videoPublishEditModel.getVideoCanvasWidth() > 0 && videoPublishEditModel.getVideoCanvasHeight() > 0) {
            float videoCanvasWidth = videoPublishEditModel.getVideoCanvasWidth() / videoPublishEditModel.getVideoCanvasHeight();
            NLEModel model2 = nLEEditorLIZ.getModel();
            if (model2 != null) {
                model2.setCanvasRatio(videoCanvasWidth);
            }
        } else {
            NLEModel model3 = nLEEditorLIZ.getModel();
            if (model3 != null) {
                C363500EMy.LIZ.getClass();
                C348100Dkm c348100Dkm = C363500EMy.LIZJ;
                if (c348100Dkm != null && (nLEEditor = c348100Dkm.LIZ) != null && (model = nLEEditor.getModel()) != null) {
                    canvasRatio = model.getCanvasRatio();
                } else {
                    AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
                    int iLJFF = abstractC1437870nWLLIZ.LJFF();
                    int iLIZJ = abstractC1437870nWLLIZ.LIZJ();
                    if (iLJFF > 0 && iLIZJ > 0) {
                        canvasRatio = iLJFF / iLIZJ;
                    } else {
                        canvasRatio = 0.5625f;
                    }
                }
                model3.setCanvasRatio(canvasRatio);
            }
        }
        NLEModel model4 = nLEEditorLIZ.getModel();
        if (model4 != null) {
            return model4;
        }
        "EditorProDataCopyTask: tempNLEEditor.model null after initWithoutConcatFile / canvasRatio".toString();
        throw new IllegalArgumentException("EditorProDataCopyTask: tempNLEEditor.model null after initWithoutConcatFile / canvasRatio");
    }

    public static NLEModel LJII(String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(str);
            NLEModel model = nLEEditorLIZ.getModel();
            if (model != null) {
                c098200Yq = NLEModel.dynamicCast((NLENode) model);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (NLEModel) obj;
    }

    @Override // X.AbstractC371450EhL
    public final Object LIZJ(InterfaceC1364105Vn<? super C351780Dqi> interfaceC1364105Vn) {
        NLEModel nLEModelLJFF;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        String str;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        MagicCombineEffectModel magicCombineEffectModel;
        boolean zLIZLLL = C365940EWi.LIZLLL(this.LIZLLL);
        VideoPublishEditModel videoPublishEditModelMakeCopy = VideoPublishEditModel.makeCopy(this.LIZLLL);
        if (zLIZLLL) {
            if (videoPublishEditModelMakeCopy.getInfoStickerModel() == null) {
                videoPublishEditModelMakeCopy.setInfoStickerModel(new InfoStickerModel(videoPublishEditModelMakeCopy.draftDir()));
            }
            if (this.LJI.LJ) {
                videoPublishEditModelMakeCopy.setNleData(this.LIZLLL.getEditorProDraftModel().nleData);
                CreativeModel creativeModel = videoPublishEditModelMakeCopy.creativeModel;
                EditorProAIGCInfoModel editorProAIGCInfoModel2 = this.LIZLLL.getEditorProDraftModel().editorProAIGCInfoForRestore;
                if (editorProAIGCInfoModel2 != null) {
                    editorProAIGCInfoModel = EditorProAIGCInfoModel.LIZ(editorProAIGCInfoModel2);
                } else {
                    editorProAIGCInfoModel = new EditorProAIGCInfoModel(new ArrayList(), new TaskInfoInCreativeModel(false, true, 0), new HashMap(), new HashMap(), new EditorTabAlbumAICreate("", "", ""), new AiPlaygroundCameraModel("", "", false, false, false, false, false, false, false, new AIPlaygroundSchemaModel(0, 0, ""), false));
                }
                creativeModel.editorProAIGCInfoModel = editorProAIGCInfoModel;
                CreativeModel creativeModel2 = videoPublishEditModelMakeCopy.creativeModel;
                MagicCombineEffectModel magicCombineEffectModel2 = this.LIZLLL.getEditorProDraftModel().editorProMagicInfoForRestore;
                if (magicCombineEffectModel2 != null) {
                    magicCombineEffectModel = new MagicCombineEffectModel(magicCombineEffectModel2.magicCombineEffectModelList, magicCombineEffectModel2.taskInfoInCreativeModel);
                } else {
                    magicCombineEffectModel = new MagicCombineEffectModel(new ArrayList(), new TaskInfoInCreativeModel(false, true, 0));
                }
                creativeModel2.magicCombineEffectModel = magicCombineEffectModel;
            }
        }
        if (C295990Biv.LIZ() && (str = this.LJFF) != null && !a0.LJJJIL(str) && this.LIZLLL.getEditorProModel().isAdvancedEditDraft()) {
            nLEModelLJFF = LJII(this.LJFF);
            if (nLEModelLJFF == null && (nLEModelLJFF = LJI()) == null) {
                nLEModelLJFF = LJFF(videoPublishEditModelMakeCopy);
            }
        } else if (this.LJ != null) {
            nLEModelLJFF = LJI();
            if (nLEModelLJFF == null) {
                nLEModelLJFF = LJFF(videoPublishEditModelMakeCopy);
            }
        } else {
            String str2 = this.LJFF;
            if (str2 != null) {
                nLEModelLJFF = LJII(str2);
                if (nLEModelLJFF == null && (nLEModelLJFF = LJI()) == null) {
                    nLEModelLJFF = LJFF(videoPublishEditModelMakeCopy);
                }
            } else {
                nLEModelLJFF = LJFF(videoPublishEditModelMakeCopy);
            }
        }
        if (C0C1O.LIZ()) {
            C357540E0a.LIZLLL(nLEModelLJFF);
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModelLJFF.deepClone());
        c363500EMy.getClass();
        C363500EMy.LJ = nLEModelDynamicCast;
        C365930EWh c365930EWh = this.LJI.LJIIIIZZ;
        if (c365930EWh != null && c365930EWh.LIZ && (mainTrack = nLEModelLJFF.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                C351220Dpo.LLLLLL(it2.next().getMainSegment(), 1.0f);
            }
        }
        C365920EWg c365920EWg = this.LJI.LJII;
        if (c365920EWg != null) {
            C359780E8q.LIZ("mobEvent", new AwS134S0400000_5(this, c365920EWg, nLEModelLJFF, videoPublishEditModelMakeCopy, 9));
        }
        if (C301680Bs6.LIZ()) {
            this.LJII = videoPublishEditModelMakeCopy;
        }
        return new C351780Dqi(videoPublishEditModelMakeCopy, nLEModelLJFF);
    }

    @Override // X.AbstractC371450EhL
    public final void LJ(VideoPublishEditModel videoPublishEditModel) {
        VideoPublishEditModel videoPublishEditModel2 = this.LJII;
        if (videoPublishEditModel2 == null) {
            return;
        }
        videoPublishEditModel.setNleData(videoPublishEditModel2.getNleData());
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "bugfix_info_sticker_sync_decouple", true, true) || videoPublishEditModel.getInfoStickerModel() == null) {
            videoPublishEditModel.setInfoStickerModel(videoPublishEditModel2.getInfoStickerModel());
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        CreativeModel creativeModel2 = videoPublishEditModel2.creativeModel;
        creativeModel.editorProAIGCInfoModel = creativeModel2.editorProAIGCInfoModel;
        creativeModel.magicCombineEffectModel = creativeModel2.magicCombineEffectModel;
        videoPublishEditModel.getEditorProModel().setClickFrom(videoPublishEditModel2.getEditorProModel().getClickFrom());
        videoPublishEditModel.getEditorProModel().setFromEditType(videoPublishEditModel2.getEditorProModel().getFromEditType());
        videoPublishEditModel.setEnterFrom(videoPublishEditModel2.getEnterFrom());
    }

    public C365910EWf(C0EI6 c0ei6, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, String str) {
        this.LIZLLL = videoPublishEditModel;
        this.LJ = nLEModel;
        this.LJFF = str;
        this.LJI = (C0ELI) c0ei6.LIZ(C0ELI.class);
    }
}
