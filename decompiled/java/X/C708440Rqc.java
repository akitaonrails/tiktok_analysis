package X;

import android.text.TextUtils;
import java.lang.Character;

/* JADX INFO: renamed from: X.0Rqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708440Rqc {
    public static final String LIZ = "&";

    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(int r5, java.lang.String r6) {
        /*
            char r1 = r6.charAt(r5)
            r4 = 2
            r2 = 1
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r1) goto L32
            r0 = 56319(0xdbff, float:7.892E-41)
            if (r1 > r0) goto L77
            int r2 = r5 + 1
            int r0 = r6.length()
            if (r2 >= r0) goto L88
            char r2 = r6.charAt(r2)
            int r1 = r1 - r3
            int r1 = r1 * 1024
            r0 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 - r0
            int r1 = r1 + r2
            r0 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 + r0
            r0 = 118784(0x1d000, float:1.66452E-40)
            if (r0 > r1) goto L88
            r0 = 128895(0x1f77f, float:1.8062E-40)
            if (r1 > r0) goto L88
            return r4
        L32:
            r0 = 8448(0x2100, float:1.1838E-41)
            if (r0 > r1) goto L56
            r0 = 10239(0x27ff, float:1.4348E-41)
            if (r1 > r0) goto L3b
            return r2
        L3b:
            r0 = 11013(0x2b05, float:1.5432E-41)
            if (r0 > r1) goto L44
            r0 = 11015(0x2b07, float:1.5435E-41)
            if (r1 > r0) goto L4d
            return r2
        L44:
            r0 = 10548(0x2934, float:1.4781E-41)
            if (r0 > r1) goto L56
            r0 = 10549(0x2935, float:1.4782E-41)
            if (r1 > r0) goto L4d
            return r2
        L4d:
            r0 = 12951(0x3297, float:1.8148E-41)
            if (r0 > r1) goto L56
            r0 = 12953(0x3299, float:1.8151E-41)
            if (r1 > r0) goto L77
            return r2
        L56:
            r0 = 169(0xa9, float:2.37E-43)
            if (r1 == r0) goto L76
            r0 = 174(0xae, float:2.44E-43)
            if (r1 == r0) goto L76
            r0 = 12349(0x303d, float:1.7305E-41)
            if (r1 == r0) goto L76
            r0 = 12336(0x3030, float:1.7286E-41)
            if (r1 == r0) goto L76
            r0 = 11093(0x2b55, float:1.5545E-41)
            if (r1 == r0) goto L76
            r0 = 11036(0x2b1c, float:1.5465E-41)
            if (r1 == r0) goto L76
            r0 = 11035(0x2b1b, float:1.5463E-41)
            if (r1 == r0) goto L76
            r0 = 11088(0x2b50, float:1.5538E-41)
            if (r1 != r0) goto L77
        L76:
            return r2
        L77:
            int r1 = r5 + 1
            int r0 = r6.length()
            if (r1 >= r0) goto L88
            char r1 = r6.charAt(r1)
            r0 = 8419(0x20e3, float:1.1798E-41)
            if (r1 != r0) goto L88
            return r4
        L88:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C708440Rqc.LIZIZ(int, java.lang.String):int");
    }

    public static boolean LIZJ(int i, String str) {
        if (i >= str.length()) {
            return false;
        }
        char cCharAt = str.charAt(i);
        if (!Character.isDigit(cCharAt)) {
            if (!Character.isLowerCase(cCharAt)) {
                return false;
            }
            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(cCharAt);
            if (unicodeBlockOf != Character.UnicodeBlock.BASIC_LATIN && unicodeBlockOf != Character.UnicodeBlock.LATIN_1_SUPPLEMENT && unicodeBlockOf != Character.UnicodeBlock.LATIN_EXTENDED_A && unicodeBlockOf != Character.UnicodeBlock.LATIN_EXTENDED_B && unicodeBlockOf != Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) {
                return false;
            }
        }
        return true;
    }

    public static String LIZ(int i, String str, String str2) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i <= 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        int i3 = -1;
        float f = 0.0f;
        do {
            i2 = i3 + 1;
            if (i2 >= str.length()) {
                break;
            }
            int i4 = 2;
            float f2 = 1.0f;
            if (LIZIZ(i2, str) != 2) {
                i4 = 1;
                if (LIZJ(i2, str)) {
                    f2 = 0.5f;
                }
            }
            i3 += i4;
            if (i3 >= str.length()) {
                break;
            }
            f += f2;
        } while (f <= i + 0.01f);
        if (i2 >= str.length()) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.substring(0, i2));
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
