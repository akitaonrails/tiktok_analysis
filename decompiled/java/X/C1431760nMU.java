package X;

/* JADX INFO: renamed from: X.0nMU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431760nMU {
    public static boolean LIZ(float f, float f2, float f3) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f2 - f) < f3) {
                return true;
            }
            return false;
        }
        if (Float.isNaN(f) && Float.isNaN(f2)) {
            return true;
        }
        return false;
    }
}
