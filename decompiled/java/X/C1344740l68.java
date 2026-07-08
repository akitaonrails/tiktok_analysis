package X;

/* JADX INFO: renamed from: X.0l68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344740l68 {
    public static final C1344740l68 LIZ = new C1344740l68();

    public static final void LIZJ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "is_success");
        C20684815ws.LJIILLIIL("post_comment_result", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("load_scene", str);
        c2344009Gk.LIZJ(i, "is_success");
        C20684815ws.LJIILLIIL("comment_list_load", c2344009Gk.LIZ);
    }

    public static final void LIZ(int i, long j, long j2, String str, long j3, int i2, long j4, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "flag");
        c2344009Gk.LJFF("group_id", str);
        c2344009Gk.LIZJ(i2, "inconformity");
        c2344009Gk.LIZLLL(j, "statistics_count");
        c2344009Gk.LIZLLL(j2, "list_count");
        c2344009Gk.LJFF("interaction_type", str2);
        c2344009Gk.LIZLLL(j3, "video_create_time");
        c2344009Gk.LIZLLL(j4, "video_elapsed_time");
        c2344009Gk.LJFF("list_logid", str3);
        c2344009Gk.LJFF("video_logid", str4);
        c2344009Gk.LJFF("inconformity_scene", str5);
        C20684815ws.LJIILLIIL("check_count_inconformity", c2344009Gk.LIZ);
    }
}
