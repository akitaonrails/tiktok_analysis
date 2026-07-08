package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BN9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BN9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2675));

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZ(boolean z) {
        if (z) {
            if (LIZIZ() != 1 && LIZIZ() != 3) {
                return false;
            }
        } else {
            if (LIZIZ() == 2 || LIZIZ() == 3) {
                return true;
            }
            return false;
        }
        return true;
    }
}
