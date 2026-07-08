package X;

/* JADX INFO: renamed from: X.12nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19863812nk {
    public static void LIZ(int i, int i2) {
        String strLIZ;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            strLIZ = C08KP.LIZ("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            strLIZ = C08KP.LIZ("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(strLIZ);
    }

    public static void LIZIZ(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(LJ(i, i2, "index"));
        }
    }

    public static void LIZJ(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void LIZLLL(int i, int i2, int i3) {
        String strLJ;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                strLJ = C08KP.LIZ("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                strLJ = LJ(i2, i3, "end index");
            }
        } else {
            strLJ = LJ(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(strLJ);
    }

    public static String LJ(int i, int i2, String str) {
        if (i < 0) {
            return C08KP.LIZ("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C08KP.LIZ("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
