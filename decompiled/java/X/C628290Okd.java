package X;

/* JADX INFO: renamed from: X.0Okd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628290Okd {
    public static final void LIZ(int i, long j, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tt_template_id", str);
        c2344009Gk.LIZJ(i, "tt_template_type");
        c2344009Gk.LIZLLL(j, "loading_cost");
        c2344009Gk.LIZJ(1, "is_full_request_done");
        C20684815ws.LJIILLIIL("template_tdp_click_item", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(long j, String str, int i, String str2, boolean z, Boolean bool, String str3) {
        C628280Okc c628280Okc = new C628280Okc(i, bool, str, str2, str3, z);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "cost");
        c628280Okc.invoke(c2344009Gk);
        C20684815ws.LJIILLIIL("template_tdp_request", c2344009Gk.LIZ);
    }
}
