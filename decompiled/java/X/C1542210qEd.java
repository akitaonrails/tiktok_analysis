package X;

/* JADX INFO: renamed from: X.0qEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542210qEd {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Integer num) {
        if (num != null && (num.intValue() & 2) == 2) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Integer num) {
        if (num != null && (num.intValue() & 4) == 4) {
            return true;
        }
        return false;
    }

    public static String LIZJ(Integer num) {
        if (num != null && (num.intValue() & 1) == 1) {
            return "pre_create";
        }
        if (LIZ(num)) {
            return "pre_load";
        }
        if (LIZIZ(num)) {
            return "reuse";
        }
        return "none";
    }
}
