package X;

/* JADX INFO: renamed from: X.0hPS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202960hPS {
    public static final C1202960hPS LIZ = new C1202960hPS();

    public static void LIZ(C1202960hPS c1202960hPS, String str, int i, String str2) {
        c1202960hPS.getClass();
        if (C15536066k.LIZ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("business", "breathing_exercise");
            c2344009Gk.LJIIIIZZ("activity_detail", str);
            c2344009Gk.LIZJ(i, "cycles_completed");
            c2344009Gk.LJIIIIZZ("reason", str2);
            c2344009Gk.LJIIIIZZ("error", "none");
            C20684815ws.LJIILLIIL("DWL_animation_complete", c2344009Gk.LIZ);
        }
    }

    public static void LIZIZ(int i, String str, long j, String str2) {
        if (!C15536066k.LIZ()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("business", "breathing_exercise");
        c2344009Gk.LJIIIIZZ("activity_detail", str);
        c2344009Gk.LJIIIIZZ("stage_name", str2);
        c2344009Gk.LIZLLL(j, "stage_duration_ms");
        c2344009Gk.LIZJ(i, "cycle_number");
        C20684815ws.LJIILLIIL("DWL_animation_stage_complete", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5) {
        if (!C15536066k.LIZ()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("business", str);
        c2344009Gk.LJIIIIZZ("activity_detail", str2);
        c2344009Gk.LJIIIIZZ("media_type", str3);
        c2344009Gk.LJIIIIZZ("status_type", str4);
        c2344009Gk.LJIIIIZZ("start_stage", str5);
        C20684815ws.LJIILLIIL("DWL_media_status", c2344009Gk.LIZ);
    }

    public static void LIZJ(long j, String str, String str2, String str3, String str4, String str5) {
        if (!C15536066k.LIZ()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("business", str);
        c2344009Gk.LJIIIIZZ("activity_detail", str2);
        c2344009Gk.LJIIIIZZ("media_type", str3);
        c2344009Gk.LJIIIIZZ("fetch_status", str4);
        c2344009Gk.LIZLLL(j, "load_duration_ms");
        c2344009Gk.LJIIIIZZ("error", str5);
        C20684815ws.LJIILLIIL("DWL_media_fetch", c2344009Gk.LIZ);
    }
}
