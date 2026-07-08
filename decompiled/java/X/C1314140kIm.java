package X;

/* JADX INFO: renamed from: X.0kIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1314140kIm {
    public static float LIZIZ(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid float property value: ");
        sbLIZ.append(f);
        C2188811AlT.LIZIZ(sbLIZ);
        return 0.0f;
    }

    public static boolean LIZ(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f2 - f) < 1.0E-5f) {
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
