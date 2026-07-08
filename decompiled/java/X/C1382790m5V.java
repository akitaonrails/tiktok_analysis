package X;

/* JADX INFO: renamed from: X.0m5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382790m5V {
    public static final C1382790m5V LIZ = new C1382790m5V();

    public static void LIZ(int i, int i2, int i3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "download_video");
        c2344009Gk.LIZJ(i3, "aweme_type");
        c2344009Gk.LIZJ(i, "pic_cnt");
        c2344009Gk.LIZJ(i2, "type");
        C20684815ws.LJIILLIIL("add_watermark", c2344009Gk.LIZ);
    }

    public static void LIZIZ(int i, int i2, int i3, String str, long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "end_watermark");
        c2344009Gk.LJIIIIZZ("watermark_id", str);
        c2344009Gk.LIZJ(0, "watermark_sdk");
        c2344009Gk.LIZJ(1, "is_self_video");
        c2344009Gk.LIZJ(i3, "aweme_type");
        c2344009Gk.LIZJ(i, "pic_cnt");
        c2344009Gk.LIZJ(i2, "type");
        C20684815ws.LJIILLIIL("client_watermark_end", c2344009Gk.LIZ);
    }

    public static void LIZJ(int i, int i2, int i3, String str, long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "start_watermark");
        c2344009Gk.LJIIIIZZ("watermark_id", str);
        c2344009Gk.LIZJ(0, "watermark_sdk");
        c2344009Gk.LIZJ(1, "is_self_video");
        c2344009Gk.LIZJ(i3, "aweme_type");
        c2344009Gk.LIZJ(i, "pic_cnt");
        c2344009Gk.LIZJ(i2, "type");
        C20684815ws.LJIILLIIL("client_watermark_start", c2344009Gk.LIZ);
    }
}
