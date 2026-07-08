package X;

/* JADX INFO: renamed from: X.0kW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322350kW1 {
    public static void LIZIZ(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void LJFF(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void LIZ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LIZJ(int i, int i2) {
        String strLJI;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                strLJI = LJI("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("negative size: ");
                sbLIZ.append(i2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            strLJI = LJI("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(strLJI);
    }

    public static void LIZLLL(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void LJ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String LJI(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
