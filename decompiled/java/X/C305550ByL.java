package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ByL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305550ByL {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C299040Bnq());

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZJ() {
        return LIZ() == 1 || LIZ() == 2 || LIZ() == 3 || LIZ() == 4 || LIZ() == 5;
    }

    public static final boolean LIZLLL() {
        return LIZ() == 5 || LIZ() == 3;
    }

    public static final boolean LIZIZ(String str) {
        if (str == null || !Intrinsics.LJFF(str, "homepage_hot")) {
            return false;
        }
        if (LIZ() != 4 && LIZ() != 5 && LIZ() != 2 && LIZ() != 3) {
            return false;
        }
        return true;
    }
}
