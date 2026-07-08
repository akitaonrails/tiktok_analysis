package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.08sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2257708sx {
    public static final C2257708sx LIZ = new C2257708sx();

    public static void LIZ(C2257808sy c2257808sy) {
        int iIntValue;
        long jLongValue;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("understanding_type", c2257808sy.LIZ);
        c0lab.LJ("network_state", c2257808sy.LIZIZ);
        c0lab.LJ("understanding_key", c2257808sy.LIZJ);
        c0lab.LJ("understanding_biz_type", c2257808sy.LIZLLL);
        c0lab.LIZLLL(c2257808sy.LJ, "is_story");
        c0lab.LJ("error_msg", c2257808sy.LJFF);
        Integer num = c2257808sy.LJI;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0lab.LIZ(iIntValue, "error_code");
        c0lab.LJ("shoot_way", c2257808sy.LJII);
        c0lab.LJ("content_type", c2257808sy.LJIIIIZZ);
        c0lab.LJ("content_source", c2257808sy.LJIIIZ);
        c0lab.LJ("enter_from", c2257808sy.LJIIJ);
        c0lab.LIZLLL(c2257808sy.LJIIJJI, "total_time");
        long jLongValue2 = 0;
        c0lab.LIZIZ(0L, "extraction_time");
        Long l = c2257808sy.LJIIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c0lab.LIZIZ(jLongValue, "compress_time");
        c0lab.LIZLLL(c2257808sy.LJIILIIL, "zip_time");
        Long l2 = c2257808sy.LJIILJJIL;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        c0lab.LIZIZ(jLongValue2, "wait_zip_time");
        c0lab.LIZLLL(c2257808sy.LJIILL, "cloud_understanding_time");
        c0lab.LIZLLL(c2257808sy.LJIILLIIL, "total_size");
        c0lab.LIZLLL(c2257808sy.LJIIZILJ, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(c2257808sy.LJIJ, "video_count");
        c0lab.LIZLLL(c2257808sy.LJIJI, "image_count");
        c0lab.LIZLLL(c2257808sy.LJIJJ, "capsule_has_music");
        c0lab.LIZLLL(c2257808sy.LJIJJLI, "music_server_cost_ms");
        c0lab.LIZLLL(c2257808sy.LJIL, "music_server_call_recommend_cost_ms");
        c0lab.LIZLLL(c2257808sy.LJJ, "recommend_understanding_cost_ms");
        c0lab.LIZLLL(c2257808sy.LJJI, "is_editor_pro");
        Integer num2 = c2257808sy.LJJIFFI;
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "is_async_understanding");
        }
        C20684815ws.LJIILLIIL("monitor_ies_frame_understanding_monitor", c0lab.LIZ);
    }
}
