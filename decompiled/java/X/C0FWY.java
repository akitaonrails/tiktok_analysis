package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.audio.TTSExtraModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FWY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FWY {
    public static final C0FWY LIZ = new C0FWY();

    public static void LJI(ShortVideoCommonParams shortVideoCommonParams) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        C20684815ws.LJIILLIIL("text_reading_bubble_show", c0lab.LIZ);
    }

    public static void LIZIZ(ShortVideoCommonParams shortVideoCommonParams, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        c0lab.LJ("text_add_type", str);
        C20684815ws.LJIILLIIL("click_change_voice", c0lab.LIZ);
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, Effect effect) {
        if (videoPublishEditModel != null && effect != null) {
            Map<String, TTSExtraModel> map = videoPublishEditModel.creativeModel.ttsModel.ttsExtraMap;
            C1446130njf c1446130njf = C1446130njf.LIZ;
            c1446130njf.getClass();
            String strLJFF = C1446130njf.LJFF(effect, "speakerID");
            String str = "";
            if (strLJFF == null) {
                strLJFF = "";
            }
            TTSExtraModel tTSExtraModel = new TTSExtraModel(null, null, null);
            LIZ.getClass();
            c1446130njf.getClass();
            String strLJFF2 = C1446130njf.LJFF(effect, "speakerID");
            if (strLJFF2 != null) {
                str = strLJFF2;
            }
            tTSExtraModel.speakerId = str;
            tTSExtraModel.effectId = effect.getEffectId();
            tTSExtraModel.extra = effect.getExtra();
            map.put(strLJFF, tTSExtraModel);
        }
    }

    public static void LJFF(C0FWY c0fwy, ShortVideoCommonParams shortVideoCommonParams, String str) {
        c0fwy.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        if (Intrinsics.LJFF(str, "text_edit_panel") && C11YF.LIZJ()) {
            str = "small_icon";
        }
        c0lab.LJ("enter_method", str);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        c0lab.LJ("is_editor_pro", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("tts_entrance_real_show", c0lab.LIZ);
    }

    public static void LIZ(C0FWY c0fwy, ShortVideoCommonParams shortVideoCommonParams, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        c0fwy.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        c0lab.LJ("enter_method", str2);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        c0lab.LJ("is_editor_pro", str);
        C20684815ws.LJIILLIIL("cancel_text_reading", c0lab.LIZ);
    }

    public static void LIZLLL(ShortVideoCommonParams shortVideoCommonParams, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        c0lab.LJ("enter_method", shortVideoCommonParams.enterMethod);
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        c0lab.LJ("tone_id", str5);
        if (str == null) {
            str = "";
        }
        c0lab.LJ("tone_list", str);
        if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("tone_name", str2);
        if (SpeakerCenter.LJFF()) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_open_apply", str6);
        c0lab.LJ("is_editor_pro", str3);
        c0lab.LJ("apply_status", str4);
        String str7 = shortVideoCommonParams.enterWay;
        if (str7 == null) {
            str7 = "edit_page_text_sidebar";
        }
        c0lab.LJ("enter_way", str7);
        c0lab.LJ("text_type", "text");
        C20684815ws.LJIILLIIL("text_reading_complete", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static void LIZJ(C0FWY c0fwy, ShortVideoCommonParams shortVideoCommonParams, String str, String str2, String str3, String str4, boolean z, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "user_click";
        }
        if ((i & 16) != 0) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        ?? r8 = z;
        if ((i & 32) != 0) {
            r8 = 0;
        }
        c0fwy.getClass();
        ?? c0lab = new C0LAB();
        c0lab.LIZ(r8, "is_from_create_template");
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        c0lab.LJ("tone_choice_method", str);
        if (Intrinsics.LJFF(str2, "text_edit_panel_force")) {
            str2 = "text_edit_panel";
        } else if (Intrinsics.LJFF(str2, "text_edit_panel") && C11YF.LIZJ()) {
            str2 = "small_icon";
        }
        c0lab.LJ("enter_method", str2);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        c0lab.LJ("is_editor_pro", str4);
        c0lab.LJ("text_add_type", str3);
        String str5 = shortVideoCommonParams.enterWay;
        if (str5 == null) {
            str5 = "edit_page_text_sidebar";
        }
        c0lab.LJ("enter_way", str5);
        c0lab.LJ("text_type", "text");
        C20684815ws.LJIILLIIL("click_text_reading", c0lab.LIZ);
    }

    public static void LJII(C0FWY c0fwy, VideoPublishEditModel videoPublishEditModel, String str, int i, String str2, String str3, int i2, String str4, String str5, String str6, int i3) {
        String str7;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        int i4 = i3 & 8;
        String str8 = CardStruct.IStatusCode.DEFAULT;
        if (i4 != 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String str9 = null;
        if ((i3 & 16) != 0) {
            str7 = "video_edit_page";
        } else {
            str7 = null;
        }
        if ((i3 & 32) != 0) {
            str3 = "";
        }
        if ((i3 & 64) != 0) {
            i2 = 0;
        }
        if ((i3 & 1024) != 0) {
            str9 = "speaking-voice";
        }
        c0fwy.getClass();
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate) {
            str8 = "1";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("tone_list", str);
        if (videoPublishEditModel != null) {
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        }
        c0lab.LJ("enter_from", str7);
        c0lab.LJ("is_editor_pro", str2);
        c0lab.LJ("tts_voice_origin", str3);
        c0lab.LIZ(i2, "is_self_tts_voice");
        c0lab.LIZ(i, "is_auto");
        c0lab.LJ("tab_id", str6);
        c0lab.LJ("tab_name", str5);
        c0lab.LJ("panel", str9);
        c0lab.LJ("voice_id", str4);
        c0lab.LJ("enter_method", "panel");
        c0lab.LJ("is_from_create_template", str8);
        C20684815ws.LJIILLIIL("text_reading_voice_click", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static void LJIIIIZZ(C0FWY c0fwy, String str, ShortVideoCommonParams shortVideoCommonParams, String str2, String str3, int i, String str4, String str5, String str6, String str7, boolean z, int i2) {
        String str8;
        String str9 = null;
        if ((i2 & 4) != 0) {
            str8 = "video_edit_page";
        } else {
            str8 = null;
        }
        if ((i2 & 8) != 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String str10 = "";
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        ?? r2 = 0;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        if ((i2 & 512) != 0) {
            str9 = "speaking-voice";
        }
        if ((i2 & 1024) == 0) {
            str10 = str7;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            r2 = z;
        }
        c0fwy.getClass();
        ?? c0lab = new C0LAB();
        c0lab.LJ("tone_list", str);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        c0lab.LJ("enter_from", str8);
        c0lab.LJ("is_editor_pro", str2);
        c0lab.LJ("tts_voice_origin", str3);
        c0lab.LIZ(i, "is_self_tts_voice");
        c0lab.LJ("tab_id", str6);
        c0lab.LJ("tab_name", str5);
        c0lab.LJ("panel", str9);
        c0lab.LJ("voice_id", str4);
        c0lab.LJ("effect_name", str10);
        c0lab.LIZ(r2, "is_from_create_template");
        C20684815ws.LJIILLIIL("text_reading_voice_show", c0lab.LIZ);
    }
}
