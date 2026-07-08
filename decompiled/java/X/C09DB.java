package X;

import java.util.TimeZone;

/* JADX INFO: renamed from: X.09DB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09DB {
    public static final TimeZone LIZ = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3 A[Catch: NumberFormatException -> 0x01bb, IndexOutOfBoundsException -> 0x01c0, IllegalArgumentException -> 0x01c5, TryCatch #2 {NumberFormatException -> 0x01bb, IllegalArgumentException -> 0x01c5, IndexOutOfBoundsException -> 0x01c0, blocks: (B:2:0x0000, B:4:0x0012, B:5:0x0014, B:7:0x0020, B:8:0x0022, B:10:0x0031, B:12:0x0037, B:16:0x004c, B:18:0x005c, B:19:0x005e, B:21:0x006a, B:22:0x006c, B:24:0x0072, B:28:0x007c, B:33:0x008c, B:35:0x0094, B:36:0x0098, B:38:0x009e, B:42:0x00aa, B:44:0x00b1, B:47:0x00c0, B:52:0x00cd, B:54:0x00d3, B:56:0x00da, B:57:0x00de, B:77:0x0198, B:78:0x01b2, B:63:0x0117, B:65:0x0121, B:66:0x0131, B:68:0x013e, B:70:0x0146, B:72:0x0164, B:74:0x0172, B:75:0x0193, B:76:0x0194, B:79:0x01b3, B:80:0x01ba, B:48:0x00c3, B:43:0x00ad), top: B:97:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3 A[Catch: NumberFormatException -> 0x01bb, IndexOutOfBoundsException -> 0x01c0, IllegalArgumentException -> 0x01c5, TryCatch #2 {NumberFormatException -> 0x01bb, IllegalArgumentException -> 0x01c5, IndexOutOfBoundsException -> 0x01c0, blocks: (B:2:0x0000, B:4:0x0012, B:5:0x0014, B:7:0x0020, B:8:0x0022, B:10:0x0031, B:12:0x0037, B:16:0x004c, B:18:0x005c, B:19:0x005e, B:21:0x006a, B:22:0x006c, B:24:0x0072, B:28:0x007c, B:33:0x008c, B:35:0x0094, B:36:0x0098, B:38:0x009e, B:42:0x00aa, B:44:0x00b1, B:47:0x00c0, B:52:0x00cd, B:54:0x00d3, B:56:0x00da, B:57:0x00de, B:77:0x0198, B:78:0x01b2, B:63:0x0117, B:65:0x0121, B:66:0x0131, B:68:0x013e, B:70:0x0146, B:72:0x0164, B:74:0x0172, B:75:0x0193, B:76:0x0194, B:79:0x01b3, B:80:0x01ba, B:48:0x00c3, B:43:0x00ad), top: B:97:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date LIZIZ(java.lang.String r14, java.text.ParsePosition r15) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09DB.LIZIZ(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static boolean LIZ(char c, int i, String str) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }

    public static int LIZJ(int i, int i2, String str) {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int iDigit = Character.digit(str.charAt(i), 10);
                if (iDigit >= 0) {
                    i3 = -iDigit;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid number: ");
                    sbLIZ.append(str.substring(i, i2));
                    throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int iDigit2 = Character.digit(str.charAt(i4), 10);
                if (iDigit2 >= 0) {
                    i3 = (i3 * 10) - iDigit2;
                    i4 = i5;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Invalid number: ");
                    sbLIZ2.append(str.substring(i, i2));
                    throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }
}
