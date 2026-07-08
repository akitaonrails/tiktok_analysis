package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ihT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252570ihT {
    public static final C1252570ihT LIZ = new C1252570ihT();
    public static boolean LIZIZ;

    public static void LJ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1252550ihR.LIZ.getClass();
        c2344009Gk.LIZJ(C1252550ihR.LJ ? 1 : 0, "click_upload_video_show");
        c2344009Gk.LIZJ(!C1252550ihR.LJIIJ() ? 1 : 0, "add_photo_icon");
        c2344009Gk.LIZJ(!C1252550ihR.LJIIIIZZ() ? 1 : 0, "add_name_icon");
        c2344009Gk.LIZJ((C1252550ihR.LIZ() || !C1252550ihR.LJII) ? 0 : 1, "add_bio_icon");
        if (C1252550ihR.LJ) {
            c2344009Gk.LJFF("wording", C1252550ihR.LJFF);
        }
        C20684815ws.LJIILLIIL("personal_homepage_interface_show", c2344009Gk.LIZ);
    }

    public static void LJI() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("shoot_bubble_show", c2344009Gk.LIZ);
    }

    public static void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("bind_phone_num_bar", c2344009Gk.LIZ);
    }

    public static void LJFF(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        if (z == LIZIZ) {
            return;
        }
        LIZIZ = z;
        C1252550ihR.LIZ.getClass();
        ArrayList arrayListLIZJ = C1252550ihR.LIZJ();
        if (((C1248170iaN) ListProtector.get(arrayListLIZJ, 0)).LJ && C1252550ihR.LIZLLL) {
            Iterator it2 = arrayListLIZJ.iterator();
            int i5 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            while (it2.hasNext()) {
                int i6 = i5 + 1;
                int i7 = ((C1248170iaN) it2.next()).LIZIZ;
                if (i7 == 2131836166) {
                    i = i5;
                } else if (i7 == 2131836162) {
                    i2 = i5;
                } else if (i7 == 2131827390) {
                    i4 = i5;
                } else if (i7 == 2131836158) {
                    i3 = i5;
                }
                i5 = i6;
            }
        } else {
            i = -1;
            i2 = -1;
            i3 = -1;
            i4 = -1;
        }
        if (!C20684815ws.LJI("personal_homepage_profile_status")) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1252550ihR.LIZ.getClass();
        if (C1252550ihR.LJIILL()) {
            str = "set_up_profile";
        } else {
            str = "edit_profile";
        }
        c2344009Gk.LJIIIIZZ("edit_profile_icon", str);
        c2344009Gk.LIZJ(C1252550ihR.LJ ? 1 : 0, "create_video_show");
        c2344009Gk.LIZJ(0, "personal_videos_cnt");
        c2344009Gk.LIZJ(i, "photo_card_order");
        c2344009Gk.LIZJ(C1252550ihR.LJIIJ() ? 1 : 0, "photo_card_edited");
        c2344009Gk.LIZJ(i2, "name_card_order");
        c2344009Gk.LIZJ(C1252550ihR.LJIIIIZZ() ? 1 : 0, "name_card_edited");
        c2344009Gk.LIZJ(i3, "bio_card_order");
        c2344009Gk.LIZJ(C1252550ihR.LIZ() ? 1 : 0, "bio_card_edited");
        if (z) {
            str2 = "enter";
        } else {
            str2 = "leave";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LIZJ(C1252550ihR.LJII() ? 1 : 0, "fans_1K");
        if (C1252550ihR.LJIIL()) {
            c2344009Gk.LIZJ(C1252550ihR.LJIIIZ() ? 1 : 0, "phone_num_card_added");
            c2344009Gk.LIZJ(i4, "phone_num_card_order");
        }
        C20684815ws.LJIILLIIL("personal_homepage_profile_status", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        String str3;
        String str4;
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("enter_method", "click_create_video");
        c2344009Gk.LJIIIIZZ("shoot_way", "upload_anchor");
        c2344009Gk.LJIIIIZZ("creation_id", str);
        C1252550ihR.LIZ.getClass();
        if (C1252550ihR.LIZ()) {
            str3 = "set_up_profile";
        } else {
            str3 = "edit_profile";
        }
        c2344009Gk.LJIIIIZZ("btn_name", str3);
        c2344009Gk.LIZJ(C1252550ihR.LJ ? 1 : 0, "with_guidence");
        c2344009Gk.LJIIIIZZ("tab_name", C1252550ihR.LIZJ);
        c2344009Gk.LJIIIIZZ("group_id", C1398110mUD.LIZIZ);
        String str6 = "1";
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_login", str4);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_camera_permission", str5);
        if (!C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_microphone_permission", str6);
        C523280Kfe.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("has_upload_permission", C523280Kfe.LIZIZ());
        if (str2 != null && str2.length() != 0) {
            c2344009Gk.LJFF("wording", str2);
        }
        C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", str);
        c2344009Gk.LJIIIIZZ("enter_method", "click_card");
        if (z) {
            str2 = "add";
        } else {
            str2 = "edit";
        }
        c2344009Gk.LJIIIIZZ("btn_name", str2);
        C20684815ws.LJIILLIIL("enter_personal_homepage_click_add", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.CharSequence, kotlin.jvm.functions.Function1] */
    public static void LIZJ(String str, List list, List list2, List list3) {
        String strLJJLIIIJ;
        Object objValueOf;
        String strLJJLIIIJ2;
        Object objValueOf2;
        String strLJJLIIIJ3;
        ?? r6;
        String str2 = "click_set_up_profile";
        if (C1EDI.LJFF()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(C10EU.LJIIIIZZ() ? 1 : 0, "is_child_mode");
            C1252550ihR.LIZ.getClass();
            if (!C1252550ihR.LJIILL()) {
                str2 = "click_edit_profile";
            }
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LIZJ(C1252550ihR.LJII() ? 1 : 0, "fans_1K");
            c2344009Gk.LJIIIIZZ("previous_page", str);
            String str3 = null;
            if (list != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            c2344009Gk.LJIIIIZZ("entrance_list", strLJJLIIIJ);
            if (list != null) {
                objValueOf = Integer.valueOf(list.size());
            } else {
                objValueOf = null;
            }
            c2344009Gk.LJ(objValueOf, "entrance_cnt");
            if (list2 != null) {
                str3 = null;
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ2 = null;
            }
            c2344009Gk.LJIIIIZZ("full_entrance_list", strLJJLIIIJ2);
            if (list2 != null) {
                objValueOf2 = Integer.valueOf(list2.size());
            } else {
                objValueOf2 = str3;
            }
            c2344009Gk.LJ(objValueOf2, "full_entrance_cnt");
            if (list3 != null) {
                ?? r62 = str3;
                strLJJLIIIJ3 = C13LP.LJJLIIIJ(list3, ",", r62, r62, 0, r62, r62, 62);
                r6 = r62;
            } else {
                strLJJLIIIJ3 = str3;
                r6 = str3;
            }
            c2344009Gk.LJIIIIZZ("secondary_entrance_list", strLJJLIIIJ3);
            Object objValueOf3 = r6;
            if (list3 != null) {
                objValueOf3 = Integer.valueOf(list3.size());
            }
            c2344009Gk.LJ(objValueOf3, "secondary_entrance_cnt");
            C20684815ws.LJIILLIIL("edit_profile", c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZJ(C10EU.LJIIIIZZ() ? 1 : 0, "is_child_mode");
        C1252550ihR.LIZ.getClass();
        if (!C1252550ihR.LJIILL()) {
            str2 = "click_edit_profile";
        }
        c2344009Gk2.LJIIIIZZ("enter_method", str2);
        c2344009Gk2.LIZJ(C1252550ihR.LJII() ? 1 : 0, "fans_1K");
        C20684815ws.LJIILLIIL("edit_profile", c2344009Gk2.LIZ);
    }
}
