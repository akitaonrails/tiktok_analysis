package X;

/* JADX INFO: renamed from: X.0ndE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442140ndE {
    public static final C1442140ndE LIZ = new C1442140ndE();

    public static void LIZ(long j, String str, String str2, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "success");
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJIIIIZZ("sticker_type", str);
        if (!z) {
            c2344009Gk.LJFF("error_msg", str2);
        }
        C20684815ws.LJIILLIIL("new_engine_sticker_compile_result", c2344009Gk.LIZ);
    }
}
