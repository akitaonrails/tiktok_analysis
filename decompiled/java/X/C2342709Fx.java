package X;

/* JADX INFO: renamed from: X.09Fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2342709Fx {
    public static final String[] LIZ;
    public static final byte[] LIZIZ;

    public static final char LIZIZ(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }

    static {
        String[] strArr = new String[93];
        int i = 0;
        int i2 = 0;
        do {
            char cLIZIZ = LIZIZ(i2 >> 12);
            char cLIZIZ2 = LIZIZ(i2 >> 8);
            char cLIZIZ3 = LIZIZ(i2 >> 4);
            char cLIZIZ4 = LIZIZ(i2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\\u");
            sbLIZ.append(cLIZIZ);
            sbLIZ.append(cLIZIZ2);
            sbLIZ.append(cLIZIZ3);
            sbLIZ.append(cLIZIZ4);
            strArr[i2] = C2188811AlT.LIZIZ(sbLIZ);
            i2++;
        } while (i2 < 32);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        LIZ = strArr;
        byte[] bArr = new byte[93];
        do {
            bArr[i] = 1;
            i++;
        } while (i < 32);
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        LIZIZ = bArr;
    }

    public static final void LIZ(String str, StringBuilder sb) {
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = LIZ;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }
}
