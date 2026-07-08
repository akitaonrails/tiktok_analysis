package X;

/* JADX INFO: renamed from: X.0Cmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323760Cmc {
    public static final C323760Cmc LIZ = new C323760Cmc();

    public static void LIZ(int i, String str, boolean z) {
        int i2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_success");
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LJIIIIZZ("error_message", str);
        C20684815ws.LJIILLIIL("did_vid_info_upload_result", c2344009Gk.LIZ);
    }
}
