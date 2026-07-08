package X;

/* JADX INFO: renamed from: X.0BxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304950BxN {
    public static final boolean LIZ() {
        if (!((Boolean) C263210ATf.LIZ.getValue()).booleanValue()) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_edit_page_pre_publish", true, false);
        }
        float fLIZLLL = C304960BxO.LIZLLL();
        float fLIZIZ = C304960BxO.LIZIZ();
        float fLJ = C1D7R.LIZ().LJ("publish_edit_rate");
        if ((fLIZLLL <= C2555509zt.LIZ || fLIZIZ >= C2555509zt.LIZIZ) && fLJ <= C2555509zt.LIZJ) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_edit_page_pre_publish", true, false);
        }
        return false;
    }
}
