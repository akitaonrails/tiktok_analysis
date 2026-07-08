package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574750MgT {
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJI;
    public static Integer LJIIJ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static String LJIILIIL;
    public static String LJIILJJIL;
    public static String LJIILL;
    public static String LJIILLIIL;
    public static String LJIIZILJ;
    public static String LJIJ;
    public static String LJIJI;
    public static String LJIJJ;
    public static String LJIJJLI;
    public static String LJIL;
    public static String LJJ;
    public static final C574750MgT LIZ = new C574750MgT();
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static String LJIIIZ = "";

    public static String LIZIZ(boolean z) {
        return z ? "sound_sync" : "video";
    }

    public static C0LAB LIZ() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", LIZIZ);
        c0lab.LJ("creation_id", LIZJ);
        c0lab.LJ("enter_from", "video_sync_page");
        return c0lab;
    }

    public static C0LAB LJI() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", LIZIZ);
        c0lab.LJ("creation_id", LIZJ);
        c0lab.LJ("content_source", "upload");
        c0lab.LJ("content_type", LIZIZ(false));
        return c0lab;
    }

    public static void LIZJ(List list) {
        int i;
        if (C580130Mp9.LIZ(list)) {
            return;
        }
        Iterator it2 = list.iterator();
        long j = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it2.next();
            j += videoSegment.duration;
            if (videoSegment.isImageType) {
                i2++;
            }
        }
        String str = "";
        if (!Intrinsics.LJFF("comment_reply", LIZIZ)) {
            LJ = "";
            LJFF = "";
        }
        C0LAB c0labLIZ = LIZ();
        c0labLIZ.LJ("content_type", LIZIZ(false));
        c0labLIZ.LJ("content_source", "upload");
        c0labLIZ.LIZIZ(j, "content_duration_ms");
        c0labLIZ.LJ("reply_comment_id", LJ);
        c0labLIZ.LJ("creation_id", LIZJ);
        c0labLIZ.LJ("reply_user_id", LJFF);
        c0labLIZ.LIZ(list.size() - i2, "video_cnt");
        c0labLIZ.LIZ(i2, "pic_cnt");
        if (list.size() > 1) {
            i = 1;
        } else {
            i = 0;
        }
        c0labLIZ.LIZ(i, "is_multi_content");
        c0labLIZ.LJ("mix_type", C560460LyW.LIZ(list.size() - i2, i2));
        c0labLIZ.LJ("upload_next_method", LJI);
        c0labLIZ.LJ("enter_from", "clip_edit_page");
        c0labLIZ.LJ("channel", LJII);
        c0labLIZ.LJ("share_panel_option", LJIIIIZZ);
        c0labLIZ.LJ("effect_resource_id", LJIIIZ);
        c0labLIZ.LIZLLL(LJIIJ, "share_media_type");
        c0labLIZ.LJ("prop_id", LJIIJJI);
        c0labLIZ.LJ("prop_resource_id", LJIIL);
        c0labLIZ.LJ("effect_source", LJIILIIL);
        c0labLIZ.LJ("is_ai_prop", LJIILJJIL);
        c0labLIZ.LJ("ai_prop_type", LJIILL);
        c0labLIZ.LJ("is_async", LJIILLIIL);
        c0labLIZ.LJ("sub_ai_prop_type", LJIIZILJ);
        c0labLIZ.LJ("ai_prop_model_name", LJIJ);
        c0labLIZ.LJ("tab_key", LJIJI);
        c0labLIZ.LJ("is_default_prop", LJIJJLI);
        c0labLIZ.LJ("prop_trigger_type", LJIL);
        String str2 = LJJ;
        if (str2 != null) {
            str = str2;
        }
        c0labLIZ.LJ("shoot_tab_name", str);
        c0labLIZ.LJ("prop_selected_from", LJIJJ);
        String str3 = LIZLLL;
        if (str3 != null && str3.length() != 0) {
            c0labLIZ.LJ("enter_method", LIZLLL);
        }
        C1411580mpw.LIZ("enter_clip_edit_page");
        C20684815ws.LJIILLIIL("enter_clip_edit_page", c0labLIZ.LIZ);
    }

    public static void LIZLLL(String str, List list) {
        if (C580130Mp9.LIZ(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it2.next();
            if (!videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        Iterator it3 = arrayList.iterator();
        long j = 0;
        while (it3.hasNext()) {
            j += ((VideoSegment) it3.next()).duration;
        }
        C0LAB c0labLIZ = LIZ();
        c0labLIZ.LJ("content_type", LIZIZ(false));
        c0labLIZ.LJ("content_source", "upload");
        c0labLIZ.LIZIZ(j, "content_duration_ms");
        C20684815ws.LJIILLIIL(str, c0labLIZ.LIZ);
    }

    public static void LJFF(int i, String str, boolean z) {
        int i2;
        C0LAB c0lab = new C0LAB();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "fast_import");
        c0lab.LIZ(i, "clip_mode");
        c0lab.LJ("fast_import_fail", str);
        C20684815ws.LJIILLIIL("single_fast_import_cover_rate", c0lab.LIZ);
    }

    public static void LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z) {
            C0LAB c0labLJI = LJI();
            c0labLJI.LJ("edit_way", "click");
            C20684815ws.LJIILLIIL("edit_clip", c0labLJI.LIZ);
        } else {
            if (z4) {
                C20684815ws.LJIILLIIL("edit_clip_delete", LJI().LIZ);
                return;
            }
            if (z2) {
                C20684815ws.LJIILLIIL("edit_clip_complete", LJI().LIZ);
                return;
            }
            if (z3) {
                C20684815ws.LJIILLIIL("edit_clip_cancel", LJI().LIZ);
            } else if (z5) {
                C0LAB c0labLJI2 = LJI();
                c0labLJI2.LJ("edit_way", "press");
                C20684815ws.LJIILLIIL("edit_clips_order", c0labLJI2.LIZ);
            }
        }
    }
}
