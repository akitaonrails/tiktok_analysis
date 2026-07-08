package X;

import java.text.BreakIterator;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0f05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110350f05 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        return C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, 100)) == 100;
    }

    public static int LIZ(int i, String str) {
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        if (str.length() != 0 && a0.LJLIIIL(str).toString().length() != 0) {
            int length = str.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                int iCodePointAt = Character.codePointAt(str, i4);
                if (8304 <= iCodePointAt && (iCodePointAt < 11264 || (12288 <= iCodePointAt && (iCodePointAt < 12544 || (12800 <= iCodePointAt && (iCodePointAt < 13056 || (126976 <= iCodePointAt && iCodePointAt < 129648))))))) {
                    i3++;
                }
            }
            if (i3 <= 0) {
                return 1;
            }
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
        if (i == 1) {
            return 0;
        }
        return 4;
    }
}
