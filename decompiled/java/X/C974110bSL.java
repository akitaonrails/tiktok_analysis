package X;

/* JADX INFO: renamed from: X.0bSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974110bSL {
    public static final void LIZ(int i, String str, String str2) {
        C955440ayE c955440ayE = new C955440ayE();
        c955440ayE.LJIIL("invite", "source", true);
        c955440ayE.LJIIL(Integer.valueOf(i), "second_verify_status", true);
        if (i == 0) {
            c955440ayE.LJIIL(str, "block_reason", true);
            c955440ayE.LJIIL(str2, "block_detail", true);
        }
        c955440ayE.LJIJJLI("match_refresh_user_list");
    }
}
