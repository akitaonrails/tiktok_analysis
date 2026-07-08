package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0L3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536890L3v {
    public static final C536890L3v LIZ = new C536890L3v();

    public static C0LAB LIZ(C536880L3u c536880L3u) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(c536880L3u.LIZ, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(c536880L3u.LIZIZ, "error_code");
        String str = c536880L3u.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(c536880L3u.LIZLLL, "duration");
        String str3 = c536880L3u.LJ;
        if (str3 == null) {
            str3 = "";
        }
        c0lab.LJ("creation_id", str3);
        String str4 = c536880L3u.LJFF;
        if (str4 == null) {
            str4 = "";
        }
        c0lab.LJ("shoot_way", str4);
        String str5 = c536880L3u.LJI;
        if (str5 != null) {
            str2 = str5;
        }
        c0lab.LJ("template_id", str2);
        return c0lab;
    }

    public static void LIZJ(C536880L3u c536880L3u, String str, String str2) {
        C0LAB c0labLIZ = LIZ(c536880L3u);
        c0labLIZ.LJ("from", "loki");
        c0labLIZ.LJ("resource_type", "cc_template");
        c0labLIZ.LJ("template_url", str);
        c0labLIZ.LJ("template_md5", str2);
        C20684815ws.LJIILLIIL("tool_performance_resource_download", c0labLIZ.LIZ);
    }

    public static void LIZIZ(C536880L3u c536880L3u, String str, String str2, String str3) {
        C0LAB c0labLIZ = LIZ(c536880L3u);
        c0labLIZ.LJ("from", "loki");
        c0labLIZ.LJ("resource_type", str3);
        c0labLIZ.LJ("template_url", str);
        c0labLIZ.LJ("template_md5", str2);
        C20684815ws.LJIILLIIL("tool_performance_mv_process_resource", c0labLIZ.LIZ);
    }
}
