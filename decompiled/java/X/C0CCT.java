package X;

/* JADX INFO: renamed from: X.0CCT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CCT {
    public static final boolean LIZ() {
        if (!C070Q.LIZ()) {
            return (C0C64.LJIILLIIL().LJIJ(31744, 0, "ui_down_grade_strategy", true) & 2) == 0 && C2251971DCh.LIZ();
        }
        if (!C104100aN.LIZ().isNewUser()) {
            C0CBW c0cbw = C0CBW.LIZ;
            return (C0CBW.LIZIZ() && C070Q.LIZ()) ? false : true;
        }
        if (C104100aN.LIZ().LJJIIZI()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ() {
        if (C070Q.LIZ()) {
            if (!C104100aN.LIZ().isNewUser()) {
                C0CBW c0cbw = C0CBW.LIZ;
                if (C0CBW.LIZIZ() && C070Q.LIZ()) {
                    return false;
                }
            } else if (C104100aN.LIZ().LJJIIZI()) {
                return false;
            }
        } else if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "ui_down_grade_strategy", true) & 1) != 0 || !C2251971DCh.LIZ()) {
            return false;
        }
        return true;
    }
}
