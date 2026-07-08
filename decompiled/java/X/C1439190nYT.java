package X;

import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;

/* JADX INFO: renamed from: X.0nYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439190nYT {
    public static int LIZ() {
        return C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").getInt("checkpoint_scene", 3);
    }

    public static RecordScene LIZIZ() {
        RecordScene recordScene = new RecordScene();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish");
        Keva repo = Keva.getRepo("publish");
        recordScene.musicPath = sharedPreferencesLIZJ.getString("music_path", "");
        recordScene.musicStart = sharedPreferencesLIZJ.getInt("music_start", 0);
        recordScene.videoSegments = CameraComponentModel.LJIIIIZZ(sharedPreferencesLIZJ.getString("segment_video", ""));
        recordScene.faceBeauty = sharedPreferencesLIZJ.getInt("face_beauty", 0);
        recordScene.hardEncode = sharedPreferencesLIZJ.getInt("hard_encode", 0);
        recordScene.mp4Path = sharedPreferencesLIZJ.getString("mp4_path", "");
        recordScene.maxDuration = sharedPreferencesLIZJ.getLong("max_duration", 15000L);
        recordScene.duetAudioPath = sharedPreferencesLIZJ.getString("duet_audio_path", "");
        recordScene.duetVideoPath = sharedPreferencesLIZJ.getString("duet_video_path", "");
        recordScene.shootMode = sharedPreferencesLIZJ.getInt("shoot_mode", 0);
        recordScene.shootWay = sharedPreferencesLIZJ.getString("shoot_way", "");
        recordScene.shootedShootMode = sharedPreferencesLIZJ.getInt("shooted_shoot_mode", -1);
        recordScene.fromItemId = sharedPreferencesLIZJ.getString("from_item_id", "");
        recordScene.followUpFirstItemId = sharedPreferencesLIZJ.getString("follow_up_first_item_id", "");
        recordScene.followUpItemIdGroups = sharedPreferencesLIZJ.getString("follow_up_item_id_groups", "");
        recordScene.enterRecordFromFeed = sharedPreferencesLIZJ.getBoolean("enter_record_from_feed", false);
        recordScene.isAigcCountdownRecord = repo.getBoolean("aigc_countdown_record", false);
        recordScene.recordOriginalSoundWithBGM = sharedPreferencesLIZJ.getBoolean("record_original_sound_with_bgm", false);
        String string = sharedPreferencesLIZJ.getString("creation_id", "");
        if (string == null || string.length() == 0) {
            string = C0DMI.LIZ();
        }
        recordScene.creativeInfo = new CreativeInfo(string, sharedPreferencesLIZJ.getInt("creative_version", 0), sharedPreferencesLIZJ.getString("session_id", null));
        recordScene.recordBGMDelay = sharedPreferencesLIZJ.getInt("record_bgm_delay", 0);
        LoudnessBalanceParam loudnessBalanceParam = recordScene.loudnessBalanceParam;
        if (loudnessBalanceParam != null) {
            loudnessBalanceParam.setBgmLoudness(sharedPreferencesLIZJ.getFloat("edit_bgm_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setPeakLoudness(sharedPreferencesLIZJ.getFloat("edit_peak_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setAvgLoudness(sharedPreferencesLIZJ.getFloat("edit_avg_loudness", 0.0f));
        }
        recordScene.recordMode = sharedPreferencesLIZJ.getInt("record_mode", 0);
        recordScene.filterLabels = sharedPreferencesLIZJ.getString("filter_labels", "");
        recordScene.filterIds = sharedPreferencesLIZJ.getString("filter_ids", "");
        recordScene.filterValues = sharedPreferencesLIZJ.getString("filter_values", "");
        recordScene.challengeStr = sharedPreferencesLIZJ.getString("challenge", "");
        if (C1837707Hr.LIZ()) {
            recordScene.csiChallengeJsonStr = sharedPreferencesLIZJ.getStringSet("csi_challenge_ids", null);
        }
        recordScene.sharedARModel = RecordScene.string2SharedARModel(sharedPreferencesLIZJ.getString("shared_ar", ""));
        recordScene.commentVideoModel = RecordScene.string2CommentVideoModel(sharedPreferencesLIZJ.getString("comment_video_moodel", ""));
        recordScene.stitchParams = RecordScene.string2StitchParams(sharedPreferencesLIZJ.getString("stitch_params", ""));
        recordScene.extractFramesModel = ExtractFramesModelExtKt.string2Model(sharedPreferencesLIZJ.getString("shot_extract_frame", ""));
        recordScene.cherEffectParam = RecordScene.getCherEffectParam(sharedPreferencesLIZJ.getString("ve_cher_effect_param", ""));
        recordScene.videoRecordMetadata = C178100mJ.LIZ(sharedPreferencesLIZJ.getString("video_record_metadata", ""));
        try {
            recordScene.mobileEffectsModel = (MobileEffectsModel2) C0CHQ.LIZ().getGson().LJII(repo.getString("ame_drafts_2", ""), MobileEffectsModel2.class);
            recordScene.musicModel = C1403010mc7.LIZ.getMusicService().transformFromAVMusic(sharedPreferencesLIZJ.getString("music_model", ""));
            recordScene.followUpPromoId = repo.getString("follow_up_promo_id", "");
            return recordScene;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return recordScene;
        }
    }

    public static void LIZJ() {
        C201955140j.LIZJ(C830690WiJ.LIZIZ, "PublishSharedPref reset");
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putString("music_path", "");
        editorEdit.putString("music_model", "");
        editorEdit.putInt("music_start", 0);
        editorEdit.putInt("face_beauty", 0);
        editorEdit.putString("segment_video", "");
        editorEdit.putInt("hard_encode", 0);
        editorEdit.putString("mp4_path", "");
        editorEdit.putString("duet_video_path", "");
        editorEdit.putString("duet_audio_path", "");
        editorEdit.putString("creation_id", "");
        editorEdit.putInt("creative_version", 0);
        editorEdit.putInt("record_mode", 0);
        editorEdit.putString("challenge", "");
        if (C1837707Hr.LIZ()) {
            editorEdit.putStringSet("csi_challenge_ids", null);
        }
        editorEdit.putString("comment_video_moodel", "");
        editorEdit.putString("from_item_id", "");
        editorEdit.putString("follow_up_first_item_id", "");
        editorEdit.putString("follow_up_item_id_groups", "");
        editorEdit.putBoolean("enter_record_from_feed", false);
        editorEdit.putString("shoot_way", "");
        editorEdit.putBoolean("record_original_sound_with_bgm", false);
        editorEdit.putInt("checkpoint_scene", 3);
        C1499900p8O.LIZ(editorEdit);
        Keva repo = Keva.getRepo("publish");
        repo.storeString("checkpoint_editing_draft_id", "");
        repo.storeString("follow_up_promo_id", "");
        repo.storeBoolean("aigc_countdown_record", false);
        C863370Xtv.LIZ("normal").LJII();
    }

    public static void LIZLLL(int i) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putInt("checkpoint_scene", i);
        C1499900p8O.LIZ(editorEdit);
    }

    public static void LJ(CommentVideoModel commentVideoModel) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        if (commentVideoModel != null) {
            editorEdit.putString("comment_video_moodel", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), commentVideoModel));
        } else {
            editorEdit.remove("comment_video_moodel");
        }
        C1499900p8O.LIZ(editorEdit);
    }

    public static void LJFF(CreativeInfo creativeInfo) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        String creationId = creativeInfo.getCreationId();
        int version = creativeInfo.getVersion();
        String sessionId = creativeInfo.getSessionId();
        if (creationId.length() <= 0) {
            creationId = C0DMI.LIZ();
        }
        editorEdit.putString("creation_id", creationId);
        editorEdit.putInt("creative_version", version);
        editorEdit.putString("session_id", sessionId);
        C1499900p8O.LIZ(editorEdit);
    }

    public static void LJI(Boolean bool) {
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putBoolean("enter_record_from_feed", bool.booleanValue());
        C1499900p8O.LIZ(editorEdit);
    }

    public static void LJIIIIZZ(int i) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putInt("shoot_mode", i);
        C1499900p8O.LIZ(editorEdit);
    }

    public static void LJIIIZ(int i) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putInt("shooted_shoot_mode", i);
        C1499900p8O.LIZ(editorEdit);
    }

    public static void LJII(String str, AVMusic aVMusic, int i) {
        String strLIZJ;
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putString("music_path", str);
        if (aVMusic != null) {
            try {
                strLIZJ = C2292508yZ.LIZJ(aVMusic);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sb = new StringBuilder();
                if (aVMusic.getMusicWaveData() != null) {
                    for (float f : aVMusic.getMusicWaveData()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(f);
                        sbLIZ.append(",");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("music id:");
                sbLIZ2.append(aVMusic.getMusicId());
                sbLIZ2.append("; music name:");
                sbLIZ2.append(aVMusic.getName());
                sbLIZ2.append("; music wave data:");
                sbLIZ2.append(sb.toString());
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ2));
                throw e;
            }
        } else {
            strLIZJ = "";
        }
        editorEdit.putString("music_model", strLIZJ);
        editorEdit.putInt("music_start", i);
        C1499900p8O.LIZ(editorEdit);
    }
}
