package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Beb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293310Beb {
    public static volatile boolean LIZ;

    public static final int LIZ() {
        if (LIZ) {
            return 6;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 9, "bulletin_emoji_interaction_latest_num_setting", true);
    }

    public static final int LIZIZ() {
        if (LIZ) {
            return 6;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 3, "bulletin_emoji_interaction_num_setting", true);
    }

    public static final boolean LIZJ() {
        return ((Number) C261070AKz.LIZ.getValue()).intValue() >= 1 || LIZ;
    }

    public static final boolean LIZLLL() {
        return ((Number) C261070AKz.LIZ.getValue()).intValue() >= 2 || LIZ;
    }

    public static boolean LJ(boolean z, Boolean bool) {
        boolean z2;
        boolean z3 = LIZ;
        if (z && ((Number) C261070AKz.LIZ.getValue()).intValue() == 0 && Intrinsics.LJFF(bool, Boolean.TRUE)) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ = z2;
        if (!z3 && LIZ) {
            return true;
        }
        return false;
    }
}
