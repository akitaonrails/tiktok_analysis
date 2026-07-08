package X;

/* JADX INFO: renamed from: X.07HE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07HE {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C07HD());

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZ() {
        if (LIZIZ()) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pip_feed_pad", false) <= 0) {
                return false;
            }
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pip_feed", false) <= 0) {
            return false;
        }
        return true;
    }
}
