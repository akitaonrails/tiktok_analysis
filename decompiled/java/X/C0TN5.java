package X;

/* JADX INFO: renamed from: X.0TN5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TN5 {
    public static final C0TN5 LIZ = new C0TN5();

    public static void LIZ(C0TVK c0tvk, String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", c0tvk.getValue());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_risk");
        C20684815ws.LJIILLIIL("security_checkup_click", c2344009Gk.LIZ);
    }

    public static void LIZIZ(C0TVK c0tvk, String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", c0tvk.getValue());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(!z ? 1 : 0, "is_success");
        c2344009Gk.LJ(Boolean.valueOf(z), "is_risk");
        C20684815ws.LJIILLIIL("checkup_update_result", c2344009Gk.LIZ);
    }
}
