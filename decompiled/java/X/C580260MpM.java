package X;

import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.FilterModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580260MpM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        FilterModel filterModel = C0MUK.LIZIZ(intent).filterModel;
        filterModel.selectedFilterId = videoPublishEditModel.getSelectedFilterId();
        filterModel.selectedFilterLabel = videoPublishEditModel.getSelectedFilterLabel();
        filterModel.selectedFilterResId = videoPublishEditModel.getSelectedFilterResId();
        filterModel.selectedFilterIntensity = videoPublishEditModel.getSelectedFilterIntensity();
        EditorProModel editorProModel = C0MUK.LIZIZ(intent).creativeFlowData.getEditorProModel();
        if (editorProModel != null) {
            editorProModel.setVideoSegmentEffects(videoPublishEditModel.getEditorProModel().getVideoSegmentEffects());
            editorProModel.setMaskEffects(videoPublishEditModel.getEditorProModel().getMaskEffects());
            editorProModel.setCutoutStrokeEffects(videoPublishEditModel.getEditorProModel().getCutoutStrokeEffects());
            editorProModel.setChromaEffects(videoPublishEditModel.getEditorProModel().getChromaEffects());
            editorProModel.setBlendCutoutEffect(videoPublishEditModel.getEditorProModel().getBlendCutoutEffect());
            editorProModel.setBlendMaskEffect(videoPublishEditModel.getEditorProModel().getBlendMaskEffect());
        }
        intent.putExtra("camera", videoPublishEditModel.getCameraPosition());
        intent.putExtra("extra_av_camera_ids", videoPublishEditModel.getCameraIds());
        intent.putExtra("video_segment", videoPublishEditModel.getVideoSegmentsDesc());
        intent.putExtra("hard_encode", videoPublishEditModel.getHardEncode());
        intent.putExtra("extra_video_canvas_width", videoPublishEditModel.getVideoCanvasWidth());
        intent.putExtra("extra_video_canvas_height", videoPublishEditModel.getVideoCanvasHeight());
        intent.putExtra("video_title_chain", videoPublishEditModel.getChain());
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.isDisableDeleteChain());
        if (!C2401009ay.LIZ(videoPublishEditModel.geofencingSetting)) {
            intent.putExtra("geo_fencing", (Serializable) videoPublishEditModel.geofencingSetting);
        }
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("duet_setting", videoPublishEditModel.reactDuetSetting);
        intent.putExtra("stitch_setting", videoPublishEditModel.stitchSetting);
        intent.putExtra("allow_sticker", videoPublishEditModel.creativeModel.privacySettingModel.allowCreateSticker);
        intent.putExtra("share_to_story", videoPublishEditModel.creativeModel.privacySettingModel.allowShareToStory);
        intent.putExtra("music_volume", videoPublishEditModel.getMusicVolume());
        intent.putExtra("voice_volume", videoPublishEditModel.getVoiceVolume());
        if (videoPublishEditModel.getVeCherEffectParam() != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel.getVeCherEffectParam());
        }
        if (videoPublishEditModel.getVeAudioEffectParam() != null) {
            C0MUK.LIZIZ(intent).veAudioEffectParam = videoPublishEditModel.getVeAudioEffectParam();
        }
        if (videoPublishEditModel.getVeAudioRecorderParam() != null) {
            intent.putExtra("audio_record_param", (Parcelable) videoPublishEditModel.getVeAudioRecorderParam());
        }
        C569390MUv.LIZIZ(intent, C1438710nXh.LIZIZ(videoPublishEditModel), EnumC569430MUz.PUBLISH, EnumC569430MUz.EDIT);
        C0MUK.LIZIZ(intent).infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        DraftEditTransferModel draftEditTransferModel = videoPublishEditModel.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        if (!C2401009ay.LIZ(videoPublishEditModel.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", videoPublishEditModel.messageBubbleTexts);
        }
        intent.putExtra("use_music_before_edit", videoPublishEditModel.isUseMusicBeforeEdit());
        C1459710o5Z.LJIIJJI = false;
        intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
        intent.putExtra("enter_edit_page_method", "click_back_button");
        intent.putExtra("audio_enhance_param", (Parcelable) videoPublishEditModel.getAudioEnhanceParam());
        C0MUK.LIZIZ(intent).nleInfoModel.nleData = videoPublishEditModel.getNleData();
        if (C298990Bnl.LIZ() && videoPublishEditModel.getVideoCoverStartTm() > 0.0f) {
            C0MUK.LIZIZ(intent).postPageModel.videoCoverStartTm = videoPublishEditModel.getVideoCoverStartTm();
        }
        if (((Boolean) C0BO2.LIZ.getValue()).booleanValue() && C123100dR.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.templateTitle)) {
            C0MUK.LIZIZ(intent).pugcTemplateData.templateTitle = videoPublishEditModel.creativeModel.pugcTemplateData.templateTitle;
        }
        intent.putExtra("ugc_template_from_anchor", true);
    }

    public static void LIZIZ(NLETemplateModel nLETemplateModel, CreativeInfo creativeInfo) {
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment2;
        NLEResourceNode resource2;
        NLESegment mainSegment3;
        NLEResourceNode resource3;
        for (NLETrack nLETrack : nLETemplateModel.getTracks()) {
            String extra = nLETrack.getExtra("biz_extra_type");
            if (Intrinsics.LJFF(extra, "dub")) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
                if (nLETrackSlot2 != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                    String resourceFile = resource.getResourceFile();
                    InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
                    EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.AUDIO_RECORD;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append(".wav");
                    String strLIZLLL = C2298208zU.LIZLLL(pathService, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false, 8);
                    if (C2471909mP.LIZJ(resourceFile, strLIZLLL)) {
                        resource.setResourceFile(strLIZLLL);
                    }
                    if (nLETrack.getTrackType() != NLETrackType.FILTER && !Intrinsics.LJFF(nLETrack.getExtra("biz_extra_type"), "normal_effect") && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null && (mainSegment2 = nLETrackSlot.getMainSegment()) != null && (resource2 = mainSegment2.getResource()) != null) {
                        C0LE8.LIZ.getClass();
                        Effect effectLIZ = C347840DkM.LIZ(nLETrack, C0LE8.LJFF);
                        if (effectLIZ != null) {
                            String strLIZIZ = C0CHQ.LIZ().LJJIL().LIZ().LIZIZ(effectLIZ.getEffectId());
                            if (!C2354709Kn.LIZIZ(strLIZIZ)) {
                                C2354709Kn.LIZJ(resource2.getResourceFile(), strLIZIZ);
                            }
                            resource2.setResourceFile(strLIZIZ);
                        }
                    }
                }
            } else {
                if (Intrinsics.LJFF(extra, "text_read")) {
                    NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
                    if (nLETrackSlot3 != null && (mainSegment3 = nLETrackSlot3.getMainSegment()) != null && (resource3 = mainSegment3.getResource()) != null) {
                        String resourceFile2 = resource3.getResourceFile();
                        InterfaceC570310MYj pathService2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
                        EnumC20228214Cy enumC20228214Cy2 = EnumC20228214Cy.TEXT_STICKER;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(System.currentTimeMillis());
                        sbLIZ2.append(".mp3");
                        String strLIZLLL2 = C2298208zU.LIZLLL(pathService2, creativeInfo, enumC20228214Cy2, C2188811AlT.LIZIZ(sbLIZ2), false, 8);
                        if (C2471909mP.LIZJ(resourceFile2, strLIZLLL2)) {
                            resource3.setResourceFile(strLIZLLL2);
                        }
                    }
                }
                if (nLETrack.getTrackType() != NLETrackType.FILTER) {
                }
            }
        }
    }
}
