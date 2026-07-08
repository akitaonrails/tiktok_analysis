package X;

/* JADX INFO: renamed from: X.0e7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076800e7y {
    public static final C1076800e7y LIZ = new C1076800e7y();

    public static void LIZ(String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("account_type", str);
        if (z) {
            str2 = "ok";
        } else {
            str2 = "cancel";
        }
        c2344009Gk.LJIIIIZZ("result", str2);
        C20684815ws.LJIILLIIL("account_auth_pop_up_confirm", c2344009Gk.LIZ);
    }
}
