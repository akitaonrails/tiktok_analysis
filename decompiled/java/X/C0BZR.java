package X;

/* JADX INFO: renamed from: X.0BZR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BZR {
    public static boolean LIZ() {
        if (C0BZQ.LIZ() || (!C0C64.LJIILLIIL().LJIIIZ(31744, "is_under_18", true, false) && C0C64.LJIILLIIL().LJIJ(31744, 0, "offline_push_strategy_2_enabled", true) == 1)) {
            return true;
        }
        return !C0C64.LJIILLIIL().LJIIIZ(31744, "is_under_18", true, false) && C0C64.LJIILLIIL().LJIJ(31744, 0, "offline_push_strategy_3_enabled", true) == 1;
    }

    public static boolean LIZIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !C0C64.LJIILLIIL().LJIIIZ(31744, "is_under_18", true, false) && C0C64.LJIILLIIL().LJIJ(31744, 0, "offline_push_strategy_3_enabled", true) == 1) {
                    return true;
                }
                return false;
            }
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "is_under_18", true, false) && C0C64.LJIILLIIL().LJIJ(31744, 0, "offline_push_strategy_2_enabled", true) == 1) {
                return true;
            }
            return false;
        }
        return C0BZQ.LIZ();
    }
}
