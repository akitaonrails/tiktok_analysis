package X;

/* JADX INFO: renamed from: X.0s0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610140s0C {
    public static Boolean LIZ;

    public static boolean LIZ() {
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C299150Bo1.LIZ()) {
            return C2174741A9g.LIZIZ.LJIILJJIL();
        }
        return false;
    }

    public static void LIZIZ(boolean z) {
        LIZ = Boolean.valueOf(z);
        if (!z && C299150Bo1.LIZ()) {
            C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
            if (c2174741A9g.LJIILJJIL()) {
                c2174741A9g.LJIILL("create_tab", EnumC655500PnQ.CLICK_UNMUTE_BUTTON, C0SVP.STYLE_NO_BUTTON);
            }
        }
    }
}
