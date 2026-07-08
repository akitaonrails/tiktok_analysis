package X;

/* JADX INFO: renamed from: X.0itl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260190itl {
    public static final C1260190itl LIZ = new C1260190itl();
    public static C1260200itm LIZIZ;

    public static void LIZ(Long l, boolean z) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long l2;
        C1260200itm c1260200itm = LIZIZ;
        if (c1260200itm != null) {
            LIZIZ = C1260200itm.LIZ(c1260200itm, 0L, System.currentTimeMillis(), z, l, 11);
            if (!z) {
                LIZ.getClass();
                C1260200itm c1260200itm2 = LIZIZ;
                int i = 1;
                if (c1260200itm2 != null && c1260200itm2.LJ) {
                    long j = c1260200itm2.LIZ;
                    if (0 < j) {
                        long j2 = c1260200itm2.LIZIZ;
                        if (j < j2) {
                            long j3 = c1260200itm2.LIZJ;
                            if (j2 >= j3 || j3 >= c1260200itm2.LIZLLL) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1260200itm c1260200itm3 = LIZIZ;
                if (c1260200itm3 != null) {
                    lValueOf = Long.valueOf(c1260200itm3.LJI);
                } else {
                    lValueOf = null;
                }
                c2344009Gk.LJ(lValueOf, "click_to_request_duration");
                C1260200itm c1260200itm4 = LIZIZ;
                if (c1260200itm4 != null) {
                    lValueOf2 = Long.valueOf(c1260200itm4.LJII);
                } else {
                    lValueOf2 = null;
                }
                c2344009Gk.LJ(lValueOf2, "request_duration");
                C1260200itm c1260200itm5 = LIZIZ;
                if (c1260200itm5 != null) {
                    lValueOf3 = Long.valueOf(c1260200itm5.LJIIIIZZ);
                } else {
                    lValueOf3 = null;
                }
                c2344009Gk.LJ(lValueOf3, "request_to_show_duration");
                C1260200itm c1260200itm6 = LIZIZ;
                if (c1260200itm6 == null || !c1260200itm6.LJ) {
                    i = 0;
                }
                c2344009Gk.LIZJ(i, "is_success");
                C1260200itm c1260200itm7 = LIZIZ;
                if (c1260200itm7 != null && (l2 = c1260200itm7.LJFF) != null) {
                    c2344009Gk.LIZLLL(l2.longValue(), "list_count");
                }
                C20684815ws.LJIILLIIL("profile_liked_video_list_duration", c2344009Gk.LIZ);
                LIZIZ = null;
            }
        }
    }
}
