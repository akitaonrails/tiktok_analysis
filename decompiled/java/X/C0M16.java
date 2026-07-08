package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M16, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M16 {
    public static final C0M16 LIZ = new C0M16();

    public static String LIZ(Map map) {
        Object obj = map.get("filter_type_effect");
        Boolean bool = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(obj, bool);
        boolean zLJFF2 = Intrinsics.LJFF(map.get("filter_type_template"), bool);
        if (zLJFF) {
            if (zLJFF2) {
                return "with_effect,with_template";
            }
            return "with_effect";
        }
        if (zLJFF2) {
            return "with_template";
        }
        return "no_filter";
    }

    public static String LIZIZ(Map map) {
        if (Intrinsics.LJFF(map.get("filter_type_file_size"), Boolean.TRUE)) {
            return "size_desc";
        }
        return "creation_date_desc";
    }

    public static boolean LIZJ(Map map) {
        Object obj = map.get("filter_type_effect");
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(obj, bool) && !Intrinsics.LJFF(map.get("filter_type_template"), bool)) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(long j, long j2, String str, int i, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "draft_cnt");
        c2344009Gk.LIZLLL(j, "draft_size");
        c2344009Gk.LIZLLL(j2, "available_storage_size");
        c2344009Gk.LJIIIIZZ("enter_method", "title");
        c2344009Gk.LJIIIIZZ("action_type", str2);
        C20684815ws.LJIILLIIL("draft_storage_alert", c2344009Gk.LIZ);
    }

    public static void LJFF(int i, String str, String str2, String str3, Map map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("draft_select_page_type", "page");
        c0lab.LJ("action_type", str);
        c0lab.LJ("enter_from", str2);
        c0lab.LIZ(i, "select_count");
        c0lab.LJ("is_first_selection", str3);
        c0lab.LJ("filter_by", LIZ(map));
        c0lab.LJ("sort_by", LIZIZ(map));
        c0lab.LIZ(Intrinsics.LJFF(str2, "shoot_page_edit_tab") ? 1 : 0, "is_from_edit_tab");
        C20684815ws.LJIILLIIL("select_draft", c0lab.LIZ);
    }

    public static void LJ(C0M16 c0m16, String str, Map map, boolean z, String str2, String str3, String str4, String str5, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = "page";
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        c0m16.getClass();
        if (str2 == null) {
            if (z) {
                str2 = "long_press";
            } else {
                str2 = "click_select";
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("draft_select_page_type", str3);
        c0lab.LJ("action_type", str2);
        c0lab.LJ("enter_from", str);
        if (str5 == null) {
            str5 = LIZ(map);
        }
        c0lab.LJ("filter_by", str5);
        if (str4 == null) {
            str4 = LIZIZ(map);
        }
        c0lab.LJ("sort_by", str4);
        C20684815ws.LJIILLIIL("enter_draft_selection", c0lab.LIZ);
    }
}
