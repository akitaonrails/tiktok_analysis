package X;

/* JADX INFO: renamed from: X.0hQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203570hQR {
    public static final C1203570hQR LIZ = new C1203570hQR();

    public static C1160030gID LIZ(int i, int i2, int i3, int i4, EnumC1338240kve enumC1338240kve) {
        String str;
        int iMax;
        int iMax2;
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            if (enumC1338240kve != EnumC1338240kve.FIT_CENTER) {
                return new C1160030gID(0.0f, i, i2, "none", true);
            }
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            float f4 = i3 / i4;
            if (f4 > f3) {
                iMax2 = Math.max(1, (int) (f / f4));
                str = "top_bottom";
                iMax = i;
            } else {
                if (f4 < f3) {
                    iMax = Math.max(1, (int) (f2 * f4));
                    str = "left_right";
                } else {
                    str = "none";
                    iMax = i;
                }
                iMax2 = i2;
            }
            long j = ((long) i) * ((long) i2);
            long j2 = ((long) iMax) * ((long) iMax2);
            long j3 = 0;
            if (j <= 0) {
                return new C1160030gID(-1.0f, iMax, iMax2, "unknown", false);
            }
            long j4 = j - j2;
            if (j4 >= 0) {
                j3 = j4;
            }
            return new C1160030gID(j3 / j, iMax, iMax2, str, true);
        }
        return new C1160030gID(-1.0f, 0, 0, "unknown", false);
    }
}
