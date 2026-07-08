package X;

/* JADX INFO: renamed from: X.0Bz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C306040Bz8 {
    public static final boolean LIZ() {
        return C281010Azr.LIZ() ? ((Boolean) C306050Bz9.LIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "enable_shoot_page_svc", true, false);
    }

    public static boolean LIZIZ() {
        return (!LIZ() || LIZLLL() || LIZJ()) ? false : true;
    }

    public static boolean LIZJ() {
        if (LIZ()) {
            return C281010Azr.LIZ() ? ((Boolean) C306060BzA.LIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "enable_shoot_page_svc_sample", true, false);
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZ()) {
            return C281010Azr.LIZ() ? ((Boolean) C306030Bz7.LIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "enable_shoot_page_svc_vad", true, false);
        }
        return false;
    }
}
