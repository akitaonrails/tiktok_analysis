package X;

/* JADX INFO: renamed from: X.12qO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19880212qO {
    public static Object LIZ(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int LIZJ(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void LIZLLL(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int LIZIZ(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iLIZIZ = C19876812pq.LIZIZ(obj);
        int i4 = iLIZIZ & i;
        int iLIZJ = LIZJ(i4, obj3);
        if (iLIZJ == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = iLIZIZ & i5;
        int i7 = -1;
        while (true) {
            i2 = iLIZJ - 1;
            i3 = iArr[i2];
            if ((i3 & i5) == i6 && C19837412jU.LIZ(obj, objArr[i2]) && (objArr2 == null || C19837412jU.LIZ(obj2, objArr2[i2]))) {
                break;
            }
            iLIZJ = i3 & i;
            if (iLIZJ == 0) {
                return -1;
            }
            i7 = i2;
        }
        int i8 = i3 & i;
        if (i7 == -1) {
            LIZLLL(i4, i8, obj3);
            return i2;
        }
        iArr[i7] = (i8 & i) | (iArr[i7] & i5);
        return i2;
    }
}
