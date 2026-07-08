package X;

/* JADX INFO: renamed from: X.12ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19863612ni {
    public static void LIZ(int i, int i2) {
        String strLIZ;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            strLIZ = C08KO.LIZ("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            strLIZ = C08KO.LIZ("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(strLIZ);
    }

    public static void LIZIZ(int i, int i2, int i3) {
        String strLIZJ;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                strLIZJ = C08KO.LIZ("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                strLIZJ = LIZJ(i2, i3, "end index");
            }
        } else {
            strLIZJ = LIZJ(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(strLIZJ);
    }

    public static String LIZJ(int i, int i2, String str) {
        if (i < 0) {
            return C08KO.LIZ("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C08KO.LIZ("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
