package X;

/* JADX INFO: renamed from: X.0VQD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQD {
    public static final C0VQD LIZ = new C0VQD();

    public static void LIZ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "publish_status");
        c2344009Gk.LJ(Boolean.valueOf(C0VPX.LIZ), "cubes_enabled");
        c2344009Gk.LIZJ(C0VPW.LIZ, "update_frequency");
        C20684815ws.LJIILLIIL("google_cubes_publish_sign_in_card", c2344009Gk.LIZ);
    }

    public static void LIZIZ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "publish_status");
        c2344009Gk.LJ(Boolean.valueOf(C0VPX.LIZ), "cubes_enabled");
        c2344009Gk.LIZJ(C0VPW.LIZ, "update_frequency");
        C20684815ws.LJIILLIIL("google_cubes_publish_videos", c2344009Gk.LIZ);
    }

    public static void LIZJ(int i, int i2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "service_error");
        if (str != null) {
            c2344009Gk.LJFF("service_error_msg", str);
        }
        c2344009Gk.LIZJ(i2, "is_login");
        C20684815ws.LJIILLIIL("google_cubes_service_status", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, int i, EnumC1483805rQ enumC1483805rQ) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("code", str);
        c2344009Gk.LJFF("message", str2);
        c2344009Gk.LIZJ(i, "video_count");
        c2344009Gk.LJFF("update_type", enumC1483805rQ.name());
        C20684815ws.LJIILLIIL("google_cubes_videos_request_status", c2344009Gk.LIZ);
    }
}
