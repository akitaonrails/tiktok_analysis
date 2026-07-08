package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1822907Bz {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ() {
        return 1 == ((Number) C079L.LIZ.getValue()).intValue();
    }

    public static final boolean LIZIZ() {
        return 1 == ((Number) C079N.LIZ.getValue()).intValue();
    }

    public static final boolean LIZJ(String str) {
        if (Intrinsics.LJFF(str, EnumC1999307sN.CLICK.getValue())) {
            return LIZIZ();
        }
        if (Intrinsics.LJFF(str, EnumC1999307sN.AUTO_PLAY.getValue())) {
            return LIZ();
        }
        return false;
    }

    public static final int LIZLLL(String str) {
        if (LIZJ(str)) {
            return 10;
        }
        return ((Number) C079M.LIZ.getValue()).intValue();
    }

    public static final boolean LJ(int i, String str) {
        if (LIZJ(str)) {
            if (i >= 3) {
                return true;
            }
            return false;
        }
        if (((Number) C1822807By.LIZ.getValue()).intValue() == 1) {
            if (i >= 2) {
                return true;
            }
            return false;
        }
        if (i == LIZLLL(str)) {
            return true;
        }
        return false;
    }
}
