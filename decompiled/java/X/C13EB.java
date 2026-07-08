package X;

/* JADX INFO: renamed from: X.13EB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EB {
    public static final int[] LIZ;
    public static final long[] LIZIZ;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        LIZ = iArr;
        for (int i3 = 0; i3 < 256; i3++) {
            "0123456789ABCDEF".charAt(i3 >> 4);
            "0123456789ABCDEF".charAt(i3 & 15);
        }
        int i4 = 0;
        do {
            i4++;
        } while (i4 < 256);
        for (int i5 = 0; i5 < "0123456789abcdef".length(); i5++) {
            "0123456789abcdef".charAt(i5);
        }
        for (int i6 = 0; i6 < "0123456789ABCDEF".length(); i6++) {
            "0123456789ABCDEF".charAt(i6);
        }
        long[] jArr = new long[256];
        int i7 = 0;
        do {
            jArr[i7] = -1;
            i7++;
        } while (i7 < 256);
        int i8 = 0;
        int i9 = 0;
        while (i8 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i8)] = i9;
            i8++;
            i9++;
        }
        int i10 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i10;
            i++;
            i10++;
        }
        LIZIZ = jArr;
    }

    public static final void LIZ(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 >= 1) {
            if (i3 > 16) {
                int i4 = (i3 + i) - 16;
                while (i < i4) {
                    if (str.charAt(i) == '0') {
                        i++;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Expected the hexadecimal digit '0' at index ");
                        sbLIZ.append(i);
                        sbLIZ.append(", but was '");
                        sbLIZ.append(str.charAt(i));
                        sbLIZ.append("'.\nThe result won't fit the type being parsed.");
                        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                return;
            }
            return;
        }
        String strSubstring = str.substring(i, i2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Expected ");
        sbLIZ2.append("at least");
        sbLIZ2.append(' ');
        sbLIZ2.append(1);
        sbLIZ2.append(" hexadecimal digits at index ");
        sbLIZ2.append(i);
        sbLIZ2.append(", but was \"");
        sbLIZ2.append(strSubstring);
        sbLIZ2.append("\" of length ");
        sbLIZ2.append(i3);
        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static long LIZIZ(String str, int i, int i2) {
        C13EG c13eg = C13EG.LIZLLL;
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int length = str.length();
        c19973713Db.getClass();
        C19973713Db.LIZ(i, i2, length);
        if (c13eg.LIZJ.LIZ) {
            LIZ(i, i2, str);
            return LIZJ(i, i2, str);
        }
        if (i2 - i > 0) {
            LIZ(i, i2, str);
            return LIZJ(i, i2, str);
        }
        String strSubstring = str.substring(i, i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected a hexadecimal number with prefix \"");
        sbLIZ.append("");
        sbLIZ.append("\" and suffix \"");
        sbLIZ.append("");
        sbLIZ.append("\", but was ");
        sbLIZ.append(strSubstring);
        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final long LIZJ(int i, int i2, String str) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = LIZIZ[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected a hexadecimal digit at index ");
            sbLIZ.append(i);
            sbLIZ.append(", but was ");
            sbLIZ.append(str.charAt(i));
            throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return j;
    }
}
