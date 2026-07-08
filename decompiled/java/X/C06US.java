package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06US, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06US {
    public static final C06US LIZ = new C06US();

    public static void LIZIZ(String str, String str2, String str3) {
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("edit", "delete", "add_stories");
        if (!Intrinsics.LJFF(str2, "longpress_cover")) {
            listLJIILJJIL.add("remove");
        } else if (Intrinsics.LJFF(str, "personal_homepage")) {
            listLJIILJJIL.add("share");
        }
        if (Intrinsics.LJFF(str, "others_homepage")) {
            listLJIILJJIL = C1697810uHb.LJIILJJIL("share");
            C1615206Uc.LIZ.getClass();
            if (C1615206Uc.LIZ()) {
                listLJIILJJIL.add("report");
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", str2);
        c0lab.LJ("story_highlight_id", str3);
        c0lab.LJ("click_actions", C13LP.LJJLIIIJ(listLJIILJJIL, null, null, null, 0, null, null, 63));
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_menu_show", c0lab.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("enter_method", str);
        c0lab.LJ("story_highlight_id", str2);
        c0lab.LJ("result", str3);
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_delete_result", c0lab.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", str2);
        c0lab.LJ("story_highlight_id", str3);
        c0lab.LJ("click_type", str4);
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_menu_click", c0lab.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3, boolean z) {
        String str4;
        if (z) {
            C06UR.LIZ.getClass();
            C06UR.LIZJ();
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", str3);
        c0lab.LJ("story_highlight_id", str2);
        if (z) {
            str4 = "success";
        } else {
            str4 = "fail";
        }
        c0lab.LJ("result", str4);
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_create_result", c0lab.LIZ);
    }

    public static void LJ(int i, int i2, int i3, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(i, "video_cnt");
        c0lab.LIZ(i2, "rank_num");
        c0lab.LJ("story_highlight_id", str2);
        c0lab.LJ("entry_scene", str3);
        c0lab.LIZ(i3, "follow_status");
        C06UR.LIZ.getClass();
        c0lab.LIZ(C06UR.LIZ(), "consumed_others_hl_within");
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_click", c0lab.LIZ);
    }

    public static void LJFF(int i, int i2, int i3, String str, String str2, String str3) {
        C06UR.LIZ.getClass();
        C06UR.LIZJ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(i, "video_cnt");
        c0lab.LIZ(i2, "rank_num");
        c0lab.LJ("story_highlight_id", str2);
        c0lab.LJ("entry_scene", str3);
        c0lab.LIZ(i3, "follow_status");
        c0lab.LIZ(C06UR.LIZ(), "consumed_others_hl_within");
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_show", c0lab.LIZ);
    }
}
