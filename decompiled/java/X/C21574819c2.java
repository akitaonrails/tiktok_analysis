package X;

/* JADX INFO: renamed from: X.19c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21574819c2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(float f, float f2) {
        if (Math.abs(f - f2) < 1.0f) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(float f, float f2) {
        if (f > f2 && !LIZ(f, f2)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(float f, float f2) {
        if (f <= f2 && !LIZ(f, f2)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(float f, float f2) {
        if (f < f2 && !LIZ(f, f2)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(float f, float f2) {
        if (f >= f2 && !LIZ(f, f2)) {
            return false;
        }
        return true;
    }
}
