package X;

import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LiveModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580250MpL {
    public static void LIZ(Intent intent, VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        Object objValueOf;
        C0MUK.LJIIIZ(intent, videoPublishEditModel.creativeModel);
        intent.putExtra("upload_next_method", videoPublishEditModel.getAlbumPreviewNextMethod());
        intent.putExtra("workspace", C1436370nTv.LIZ(videoPublishEditModel));
        C537520L6g.LIZLLL(intent, videoPublishEditModel.getCreativeInfo());
        intent.putExtra("camera", videoPublishEditModel.getCameraPosition());
        intent.putExtra("extra_av_camera_ids", videoPublishEditModel.getCameraIds());
        intent.putExtra("music_start", videoPublishEditModel.getMMusicStart());
        intent.putExtra("extra_music_end", videoPublishEditModel.getMMusicEnd());
        LiveModel liveModel = videoPublishEditModel.creativeModel.liveModel;
        if (liveModel != null) {
            if (Intrinsics.LJFF(liveModel.startSaaWithSingleTop, Boolean.TRUE)) {
                intent.putExtra("start_saa_with_single_top", liveModel.startSaaWithSingleTop);
            }
            if (Intrinsics.LJFF(liveModel.startFromLive, Boolean.TRUE)) {
                intent.putExtra("start_saa_from_live", liveModel.startFromLive);
            }
        }
        intent.putExtra("video_segment", videoPublishEditModel.getVideoSegmentsDesc());
        intent.putExtra("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        if (!videoPublishEditModel.getFromCut() && !videoPublishEditModel.getFromMultiCut() && !videoPublishEditModel.isMvThemeVideoType()) {
            str = "shoot";
        } else {
            str = "upload";
        }
        intent.putExtra("content_source", str);
        intent.putExtra("hard_encode", videoPublishEditModel.getHardEncode());
        intent.putExtra("isFromDraft", z);
        intent.putExtra("is_default_prop", videoPublishEditModel.isDefaultProp);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect list from publish : ");
        if (videoPublishEditModel.getEffectList() != null) {
            objValueOf = Integer.valueOf(videoPublishEditModel.getEffectList().size());
        } else {
            objValueOf = "null";
        }
        sbLIZ.append(objValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        intent.putExtra("extra_video_canvas_width", videoPublishEditModel.getVideoCanvasWidth());
        intent.putExtra("extra_video_canvas_height", videoPublishEditModel.getVideoCanvasHeight());
        intent.putExtra("origin", videoPublishEditModel.getOrigin());
        intent.putExtra("challenge", (Serializable) videoPublishEditModel.challenges);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        intent.putExtra("video_title", videoPublishEditModel.getTitle());
        intent.putExtra("video_title_chain", videoPublishEditModel.getChain());
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.isDisableDeleteChain());
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.getStructList());
        intent.putExtra("is_private", videoPublishEditModel.isPrivate);
        if (!C2401009ay.LIZ(videoPublishEditModel.geofencingSetting)) {
            intent.putExtra("geo_fencing", (Serializable) videoPublishEditModel.geofencingSetting);
        }
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("duet_setting", videoPublishEditModel.reactDuetSetting);
        intent.putExtra("stitch_setting", videoPublishEditModel.stitchSetting);
        intent.putExtra("allow_sticker", videoPublishEditModel.creativeModel.privacySettingModel.allowCreateSticker);
        intent.putExtra("share_to_story", videoPublishEditModel.creativeModel.privacySettingModel.allowShareToStory);
        intent.putExtra("content_reuse_permission", videoPublishEditModel.creativeModel.privacySettingModel.contentReusePermission);
        intent.putExtra("music_volume", videoPublishEditModel.getMusicVolume());
        intent.putExtra("open_platform_extra", videoPublishEditModel.getOpenPlatformExtra());
        intent.putExtra("music_origin", videoPublishEditModel.getMusicOriginWithCheck());
        intent.putExtra("voice_volume", videoPublishEditModel.getVoiceVolume());
        if (videoPublishEditModel.getVeCherEffectParam() != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel.getVeCherEffectParam());
        }
        if (videoPublishEditModel.getVeAudioRecorderParam() != null) {
            intent.putExtra("audio_record_param", (Parcelable) videoPublishEditModel.getVeAudioRecorderParam());
        }
        C569390MUv.LIZIZ(intent, C1438710nXh.LIZIZ(videoPublishEditModel), EnumC569430MUz.PUBLISH, EnumC569430MUz.EDIT);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        intent.putExtra("cutsame_data", videoPublishEditModel.cutSameEditData);
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
        intent.putExtra("extra_is_sound_loop", videoPublishEditModel.getIsSoundLoop().booleanValue());
        intent.putExtra("draft_music_legal_param", videoPublishEditModel.isDraftMusicIllegal());
        intent.putExtra("enter_edit_page_method", "click_back_button");
        intent.putExtra("audio_enhance_param", (Parcelable) videoPublishEditModel.getAudioEnhanceParam());
        intent.putExtra("sound_sync_from_anchor", videoPublishEditModel.getSoundSyncFromAnchor());
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (!(imageAlbumData instanceof Parcelable)) {
                imageAlbumData = null;
            }
            intent.putExtra("image_album_data", (Parcelable) imageAlbumData);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("buildIntentFromVideoPublishEditModel ");
        sbLIZ2.append(C1428470nHB.LJJZZI(videoPublishEditModel));
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
