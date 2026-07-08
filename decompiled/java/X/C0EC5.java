package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EC5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EC5 {
    public static final void LIZ(int i, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        String str;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_create_template", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("is_add_or_delete", String.valueOf(i));
        C20684815ws.LJIILLIIL("auto_beats_click", c0labLJFF.LIZ);
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        String str2;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (z) {
            str2 = "undo";
        } else {
            str2 = "redo";
        }
        c0labLJFF.LJ("type", str2);
        c0labLJFF.LJ("is_from_create_template", str);
        c0labLJFF.LJ("is_editorpro_beats", "1");
        C20684815ws.LJIILLIIL("click_edit_recall", c0labLJFF.LIZ);
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        String str2;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_create_template", str2);
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("type", str);
        C20684815ws.LJIILLIIL("click_last_next_beats", c0labLJFF.LIZ);
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("click_sound_tab", c0labLJFF.LIZ);
    }

    public static final void LJIIJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("sound_panel_show", c0labLJFF.LIZ);
    }

    public static final void LJIIJJI(int i, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        String str;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_create_template", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("type", String.valueOf(i));
        C20684815ws.LJIILLIIL("update_sound_sync_click", c0labLJFF.LIZ);
    }

    public static final void LJIIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("sticker_panel_show", c0labLJFF.LIZ);
    }

    public static final void LJIILIIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LIZ(u4.LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLJFF);
        C0MJO.LIZ(c0labLJFF, videoPublishEditModel);
        c0labLJFF.LIZ(u4.LJJIZ(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab_captions");
        c0labLJFF.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("text_panel_show", c0labLJFF.LIZ);
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, String str2) {
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LIZ(1, "is_editor_pro");
        c0labLJFF.LJ("from_location", str);
        c0labLJFF.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        c0labLJFF.LJ("enter_from", "video_edit_page");
        c0labLJFF.LJ("type", str2);
        C20684815ws.LJIILLIIL("change_music", c0labLJFF.LIZ);
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z) {
        String str2;
        String str3;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        if (str == null) {
            str = "";
        }
        c0labLJFF.LJ(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        c0labLJFF.LJ("sound_type", str3);
        C20684815ws.LJIILLIIL("click_sound_delete", c0labLJFF.LIZ);
    }

    public static final void LJI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z) {
        String str2;
        String str3;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        if (str == null) {
            str = "";
        }
        c0labLJFF.LJ(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        c0labLJFF.LJ("sound_type", str3);
        C20684815ws.LJIILLIIL("click_sound_volume_tab", c0labLJFF.LIZ);
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z) {
        String str2;
        String str3;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        if (str == null) {
            str = "";
        }
        c0labLJFF.LJ(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        c0labLJFF.LJ("sound_type", str3);
        c0labLJFF.LJ("music_edited_from", "editor_pro");
        c0labLJFF.LIZ(C361680EFy.LJJII(c0e48) ? 1 : 0, "is_editorpro_keyframe");
        c0labLJFF.LIZ(1, "is_editor_pro");
        C20684815ws.LJIILLIIL("click_editing_music_progress_bar", c0labLJFF.LIZ);
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z) {
        String str2;
        String str3;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str2 = "music_id";
        } else {
            str2 = "sound_effect_id";
        }
        c0labLJFF.LJ(str2, str);
        if (z) {
            str3 = "common_sound";
        } else {
            str3 = "sound_effect";
        }
        c0labLJFF.LJ("sound_type", str3);
        C20684815ws.LJIILLIIL("long_press_sound", c0labLJFF.LIZ);
    }

    public static final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, String str2, boolean z) {
        String str3;
        String str4;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str3 = "music_id";
        } else {
            str3 = "sound_effect_id";
        }
        if (str2 == null) {
            str2 = "";
        }
        c0labLJFF.LJ(str3, str2);
        if (z) {
            str4 = "common_sound";
        } else {
            str4 = "sound_effect";
        }
        c0labLJFF.LJ("sound_type", str4);
        c0labLJFF.LJ("track_type", "sound");
        c0labLJFF.LJ("action_type", str);
        C20684815ws.LJIILLIIL("move_sound", c0labLJFF.LIZ);
    }
}
