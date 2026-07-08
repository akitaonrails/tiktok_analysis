package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0EK2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EK2 {
    public final VideoPublishEditModel LIZ;
    public long LIZIZ;
    public final C0EK5 LIZJ = new C0EK5();
    public final List<NLETrackType> LIZLLL = C1697810uHb.LJIIJJI(NLETrackType.AUDIO, NLETrackType.VIDEO, NLETrackType.STICKER, NLETrackType.EFFECT, NLETrackType.FILTER);
    public final List<String> LJ = C1697810uHb.LJIIJJI("bgm", "dub", "text_read", "text_caption", "normal_effect", "sound_effect", "color_filter", "video_anim");
    public final List<String> LJFF = Collections.singletonList(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER());
    public final List<String> LJI;
    public final VecString LJII;

    public C0EK2(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("audio_stick_points", "beats_auto_generate_enable", "beats_source", "sound_sync_beats_count");
        this.LJI = listLJIIJJI;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("biz_extra_type", "biz_data", "biz_res_id", "biz_inline_text_style", "biz_font_size_in_pt", "biz_font_size_in_adapt", "global_filter_type", "part_filter_type", "ep_magic_resource_id", "biz_limit_material_type", "ep_ai_generated", "biz_fl2v_holder_slot", "ep_async_param", "biz_template_biz_data", "is_from_ep_magic", "biz_magic_support_type", "ep_magic_effect_id", "slot_extra_origin_resource_file", "biz_ugc_template_cover_time", "biz_material_fill_mode", "is_ep_multi_music", "ep_curve_speed_resource_id", "ep_stick_point_switch", "feature_codes", "freeze_from_uuid", "freeze_timestamp", "freeze_from_resource_path", "freeze_ref_video_uuid", "freeze_group", "is_ep_reverse_video", "ep_origin_media_path", "editor_pro_effect_category", "ep_replaced_i2i_magic_by_render_proxy", "biz_combine_gameplay_type", "biz_magic_is_combine_gameplay_render_with_effect", "biz_ai_type", "ep_async_param", "StickerTrackName", "lyric_style_urs", "lyric_style_effect_id", "lyric_id", "music_id", "recommend_size", "StickerTrackType", "initial_trim_range", "fallback_fonts");
        listLJIILJJIL.addAll(listLJIIJJI);
        if (C289210BVf.LIZ(videoPublishEditModel)) {
            listLJIILJJIL.add("icon_url");
        }
        this.LJII = new VecString(listLJIILJJIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0329 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r29, com.bytedance.ies.nle.editor_jni.NLEModel r30) {
        /*
            Method dump skipped, instruction units count: 2430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EK2.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }
}
