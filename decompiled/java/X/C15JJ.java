package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15JJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JJ implements C15JM {
    public static final C15JJ LIZ = new C15JJ();

    public static void LJI(C15JK c15jk) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, c15jk);
        c2344009Gk.LJIIIIZZ("content_source", c15jk.LIZLLL);
        c2344009Gk.LJIIIIZZ("content_type", c15jk.LJ);
        c2344009Gk.LJIIIIZZ("enter_from", c15jk.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c15jk.LJIILIIL);
        c2344009Gk.LJIIIIZZ("shoot_way", c15jk.LIZIZ);
        c2344009Gk.LJIIIIZZ("creation_id", c15jk.LIZJ);
        c2344009Gk.LJIIIIZZ("music_id", c15jk.LJFF);
        c2344009Gk.LJIIIIZZ("is_multi_content", c15jk.LJIIZILJ);
        c2344009Gk.LJ(c15jk.LJIJJLI, "trim_type");
        C20684815ws.LJIILLIIL("smart_trim_point_click", c2344009Gk.LIZ);
    }

    public static final void LJII(C15JK c15jk) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, c15jk);
        c2344009Gk.LJIIIIZZ("content_source", c15jk.LIZLLL);
        c2344009Gk.LJIIIIZZ("content_type", c15jk.LJ);
        c2344009Gk.LJIIIIZZ("enter_from", c15jk.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c15jk.LJIILIIL);
        c2344009Gk.LJIIIIZZ("shoot_way", c15jk.LIZIZ);
        c2344009Gk.LJIIIIZZ("creation_id", c15jk.LIZJ);
        c2344009Gk.LJIIIIZZ("music_id", c15jk.LJFF);
        c2344009Gk.LJIIIIZZ("is_multi_content", c15jk.LJIIZILJ);
        c2344009Gk.LJ(c15jk.LJIJJLI, "trim_type");
        C20684815ws.LJIILLIIL("smart_trim_point_show", c2344009Gk.LIZ);
    }

    public static void LIZ(C2344009Gk c2344009Gk, C15JK c15jk) {
        c2344009Gk.LJIIIIZZ("enter_from", c15jk.LIZ);
        c2344009Gk.LJIIIIZZ("shoot_way", c15jk.LIZIZ);
        c2344009Gk.LJIIIIZZ("creation_id", c15jk.LIZJ);
        c2344009Gk.LJIIIIZZ("content_source", c15jk.LIZLLL);
        c2344009Gk.LJIIIIZZ("content_type", c15jk.LJ);
        c2344009Gk.LJIIIIZZ("music_edited_from", c15jk.LJI);
        c2344009Gk.LJIIIIZZ("enter_method", c15jk.LJIILIIL);
        if (c15jk.LJII) {
            c2344009Gk.LJFF("fake_music_id", c15jk.LJFF);
        } else {
            c2344009Gk.LJFF("music_id", c15jk.LJFF);
        }
        LIZIZ(c2344009Gk, "search_id", c15jk.LJIIIIZZ);
        LIZIZ(c2344009Gk, "search_result_id", c15jk.LJIIIZ);
        LIZIZ(c2344009Gk, "list_item_id", c15jk.LJIIJ);
        LIZIZ(c2344009Gk, "token_type", c15jk.LJIIL);
        LIZIZ(c2344009Gk, "search_rank", c15jk.LJIIJJI);
        LIZIZ(c2344009Gk, "tab_name", c15jk.LJIILL);
    }

    public static final void LJ(C15JK c15jk, Integer num) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, c15jk);
        if (num != null && Intrinsics.LJFF(c15jk.LIZ, "search_music")) {
            c2344009Gk.LIZJ(num.intValue(), "original_music_duration");
        }
        String str = c15jk.LJIILLIIL;
        if (str != null) {
            c2344009Gk.LJFF("music_recent_type", str);
        }
        if (c15jk.LJJI) {
            c2344009Gk.LIZJ(1, "is_smart_extend");
            c2344009Gk.LJFF("stitched_clip_id", c15jk.LJJIFFI);
        }
        C20684815ws.LJIILLIIL("edit_music_cancel", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(C2344009Gk c2344009Gk, String str, String str2) {
        if (C123100dR.LIZ(str2)) {
            c2344009Gk.LJFF(str, str2);
        }
    }

    public static void LIZLLL(C15JK c15jk, String str, String str2) {
        boolean z;
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, c15jk);
        Integer num = c15jk.LJIILJJIL;
        if (num != null && num.equals(0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2344009Gk.LJFF("category_name", "device_upload");
        } else {
            Integer num2 = c15jk.LJIILJJIL;
            if (num2 != null && num2.equals(3)) {
                c2344009Gk.LJFF("category_name", "video_upload");
            }
        }
        if (c15jk.LJII) {
            c2344009Gk.LJFF("tab_name", "your_sounds");
        }
        c2344009Gk.LIZJ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIIZ(), "music_rec_type");
        c2344009Gk.LJFF("enter_method", c15jk.LJIILIIL);
        c2344009Gk.LIZJ(0, "is_editor_pro");
        String str3 = c15jk.LJIILLIIL;
        if (str3 != null) {
            c2344009Gk.LJFF("music_recent_type", str3);
        }
        c2344009Gk.LIZJ(c15jk.LJIJ, "has_smart_trim_point");
        c2344009Gk.LJ(Boolean.valueOf(c15jk.LJIJI), "is_pgc");
        c2344009Gk.LJFF("meta_song_id", c15jk.LJIJJ);
        c2344009Gk.LJFF("is_multi_content", c15jk.LJIIZILJ);
        c2344009Gk.LJFF("music_edited_from", c15jk.LJI);
        c2344009Gk.LJFF("content_source", str);
        c2344009Gk.LJFF("content_type", str2);
        c2344009Gk.LJFF("music_selected_from", c15jk.LJJII);
        c2344009Gk.LJFF("music_log_id", c15jk.LJJIII);
        C20684815ws.LJIILLIIL("edit_music", c2344009Gk.LIZ);
    }

    public static final void LIZJ(C15JK c15jk, int i, int i2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, c15jk);
        c2344009Gk.LIZJ(i2, "starting_point");
        c2344009Gk.LIZJ(i, "original_music_duration");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LIZJ(0, "is_editor_pro");
        C20684815ws.LJIILLIIL("click_editing_music_progress_bar", c2344009Gk.LIZ);
    }

    public static final void LJFF(C15JK c15jk, int i, int i2, float f, boolean z, boolean z2, long j) {
        String str;
        C15JK c15jkLIZ = c15jk;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z2) {
            c15jkLIZ = C15JK.LIZ(c15jk, "video_edit_page", "change_ban_music", null, "replace_music", "replace_music", null, null, null, false, null, null, false, null, null, null, 268435428);
        }
        LIZ(c2344009Gk, c15jkLIZ);
        c2344009Gk.LIZJ(i, "original_music_duration");
        c2344009Gk.LIZJ(i2, "new_music_duration");
        c2344009Gk.LIZIZ(f, "sound_speed_mode");
        c2344009Gk.LJIIIIZZ("sound_filter_id", null);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_change_pitch");
        c2344009Gk.LJIIIIZZ("enter_method", c15jk.LJIILIIL);
        c2344009Gk.LIZJ(0, "is_editor_pro");
        String str2 = c15jk.LJIILLIIL;
        if (str2 != null) {
            c2344009Gk.LJFF("music_recent_type", str2);
        }
        c2344009Gk.LJFF("is_multi_content", c15jk.LJIIZILJ);
        c2344009Gk.LIZJ(c15jk.LJIJ, "has_smart_trim_point");
        c2344009Gk.LIZLLL(j, "edit_duration");
        c2344009Gk.LJ(Boolean.valueOf(c15jk.LJIJI), "is_pgc");
        c2344009Gk.LJFF("meta_song_id", c15jk.LJIJJ);
        if (c15jk.LJIL) {
            c2344009Gk.LIZJ(c15jk.LJJ, "used_full_song");
        }
        if (c15jk.LJJI) {
            c2344009Gk.LIZJ(1, "is_smart_extend");
            c2344009Gk.LJFF("stitched_clip_id", c15jk.LJJIFFI);
        }
        c2344009Gk.LJFF("music_selected_from", c15jk.LJJII);
        c2344009Gk.LJFF("music_log_id", c15jk.LJJIII);
        if (z2) {
            str = "edit_music_complete_replace";
        } else {
            str = "edit_music_complete";
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
