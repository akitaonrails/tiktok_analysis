package X;

/* JADX INFO: renamed from: X.12np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19864312np {
    public static void LJ(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void LJIILJJIL(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void LIZLLL(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LJFF(int i, int i2) {
        String strLIZ;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                strLIZ = C08KM.LIZ("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            strLIZ = C08KM.LIZ("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(strLIZ);
    }

    public static void LJI(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void LJIIIIZZ(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(LIZ(i, i2, "index"));
        }
    }

    public static void LJIILIIL(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String LIZ(int i, int i2, String str) {
        if (i < 0) {
            return C08KM.LIZ("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C08KM.LIZ("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void LIZJ(Object obj, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(C08KM.LIZ(str, obj));
        }
    }

    public static void LJII(String str, Object obj, Object... objArr) {
        if (obj != null) {
        } else {
            throw new NullPointerException(C08KM.LIZ(str, objArr));
        }
    }

    public static void LJIIIZ(int i, int i2, int i3) {
        String strLIZ;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                strLIZ = C08KM.LIZ("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                strLIZ = LIZ(i2, i3, "end index");
            }
        } else {
            strLIZ = LIZ(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(strLIZ);
    }

    public static void LJIIJ(int i, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(C08KM.LIZ(str, Integer.valueOf(i)));
        }
    }

    public static void LJIIJJI(long j, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(C08KM.LIZ(str, Long.valueOf(j)));
        }
    }

    public static void LJIIL(Object obj, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(C08KM.LIZ(str, obj));
        }
    }

    public static void LIZIZ(Object obj, Object obj2, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(C08KM.LIZ(str, obj, obj2));
        }
    }
}
