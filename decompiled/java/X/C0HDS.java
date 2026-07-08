package X;

/* JADX INFO: renamed from: X.0HDS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HDS {
    public static final C0HDS LIZ = new C0HDS();

    public static void LIZ(String str, String str2, Boolean bool, boolean z, boolean z2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("extra_message", str);
        c2344009Gk.LJ(Boolean.valueOf(z2), "is_first_avatar");
        c2344009Gk.LJIIIIZZ("fetch_success", String.valueOf(bool));
        c2344009Gk.LJ(Boolean.valueOf(z), "is_exit_clicked");
        c2344009Gk.LJIIIIZZ("log_id", str2);
        C20684815ws.LJIILLIIL("social_avatar_save_error", c2344009Gk.LIZ);
    }
}
