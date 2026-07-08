package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0n5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421430n5p {
    public static final C1421430n5p LIZ = new C1421430n5p();

    public static void LIZ(C1421440n5q c1421440n5q, HashMap map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(map);
        c0lab.LJ("type", c1421440n5q.LIZ);
        c0lab.LIZIZ(c1421440n5q.LIZIZ, "upload_duration");
        c0lab.LJFF("frame_hit_cache", c1421440n5q.LIZJ);
        c0lab.LIZIZ(c1421440n5q.LIZLLL, "total_duration");
        c0lab.LIZ(c1421440n5q.LJ, "pov_cnt");
        C20684815ws.LJIILLIIL("fetch_pov_list", c0lab.LIZ);
    }

    public static void LIZIZ(long j, boolean z, boolean z2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJFF("frame_hit_cache", z);
        c0lab.LJFF("pov_hit_cache", z2);
        c0lab.LIZIZ(j, "loading_duration");
        C20684815ws.LJIILLIIL("pov_panel_show", c0lab.LIZ);
    }
}
