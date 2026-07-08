package X;

import java.text.BreakIterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0f06, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110360f06 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(char r2) {
        /*
            r1 = 1
            if (r2 == 0) goto L2a
            r0 = 9
            if (r2 == r0) goto L2a
            r0 = 10
            if (r2 == r0) goto L2a
            r0 = 13
            if (r2 == r0) goto L2a
            r0 = 32
            if (r0 > r2) goto L2b
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r0) goto L2a
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r0 > r2) goto L2c
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r2 < r0) goto L2a
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r2) goto L2c
            r0 = 1114112(0x110000, float:1.561203E-39)
            if (r2 >= r0) goto L2b
        L2a:
            r1 = 0
        L2b:
            return r1
        L2c:
            r0 = 55298(0xd802, float:7.7489E-41)
            if (r2 == r0) goto L2a
            r0 = 57193(0xdf69, float:8.0144E-41)
            if (r2 == r0) goto L2a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1110360f06.LIZIZ(char):boolean");
    }

    public static int LIZ(int i, String str) {
        int i2 = 0;
        if (str != null && str.length() != 0 && a0.LJLIIIL(str).toString().length() != 0) {
            int length = str.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                int iCodePointAt = Character.codePointAt(str, i4);
                if (8304 <= iCodePointAt && (iCodePointAt < 11264 || (12288 <= iCodePointAt && (iCodePointAt < 12544 || (12800 <= iCodePointAt && (iCodePointAt < 13056 || (126976 <= iCodePointAt && iCodePointAt < 129648))))))) {
                    i3++;
                }
            }
            if (i3 > 0) {
                if (i != 0) {
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(str);
                    for (int next = characterInstance.next(); next != -1; next = characterInstance.next()) {
                        i2++;
                    }
                    if (i3 == i2) {
                        return 3;
                    }
                    return 2;
                }
            } else if (i != 0) {
                return 1;
            }
            return -1;
        }
        if (i == 1) {
            return 0;
        }
        if (i <= 1) {
            return -1;
        }
        return 4;
    }
}
