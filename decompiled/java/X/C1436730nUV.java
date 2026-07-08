package X;

/* JADX INFO: renamed from: X.0nUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436730nUV {
    public static final C1436730nUV LIZ = new C1436730nUV();

    public static void LIZIZ(long j, String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(z ? 1 : 0, "success");
        C20684815ws.LJIILLIIL("tools_performance_save_local_watermark_frame_upload", c2344009Gk.LIZ);
    }

    public static void LIZ(C1436790nUb c1436790nUb, boolean z, int i, int i2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", c1436790nUb.LIZ);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - c1436790nUb.LIZJ, "duration");
        c2344009Gk.LIZJ(i, "pass");
        c2344009Gk.LIZJ(i2, "loop_interval");
        c2344009Gk.LIZJ(c1436790nUb.LIZIZ, "loop_count");
        c2344009Gk.LIZJ(z ? 1 : 0, "from_loop_request");
        C20684815ws.LJIILLIIL("tools_performance_save_local_watermark_moderation_end", c2344009Gk.LIZ);
    }
}
