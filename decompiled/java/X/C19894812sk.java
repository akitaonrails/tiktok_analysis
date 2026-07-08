package X;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: X.12sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19894812sk {
    public static final C823890WTr LIZ = new C823890WTr("");

    public static C19869812oi LIZIZ(CharSequence charSequence) {
        C19871112ov c19871112ovBuilder = AbstractC19870912ot.builder();
        int length = ((String) charSequence).length();
        int iLIZ = 0;
        while (iLIZ < length) {
            iLIZ += LIZ(new ArrayDeque(), charSequence, iLIZ, c19871112ovBuilder);
        }
        return c19871112ovBuilder.LIZ();
    }

    public static int LIZ(Deque<CharSequence> deque, CharSequence charSequence, int i, C19871112ov<String, EnumC19894912sl> c19871112ov) {
        String str = (String) charSequence;
        int length = str.length();
        int i2 = i;
        char cCharAt = 0;
        while (i2 < length && (cCharAt = str.charAt(i2)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.subSequence(i, i2));
        sb.reverse();
        ArrayDeque arrayDeque = (ArrayDeque) deque;
        arrayDeque.push(sb);
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strLIZIZ = LIZ.LIZIZ(deque);
            if (strLIZIZ.length() > 0) {
                for (EnumC19894912sl enumC19894912sl : EnumC19894912sl.values()) {
                    if (enumC19894912sl.innerNodeCode == cCharAt || enumC19894912sl.leafNodeCode == cCharAt) {
                        c19871112ov.LIZIZ(strLIZIZ, enumC19894912sl);
                    }
                }
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("No enum corresponding to given code: ");
                sb2.append(cCharAt);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        int iLIZ = i2 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iLIZ < length) {
                iLIZ += LIZ(deque, charSequence, iLIZ, c19871112ov);
                if (str.charAt(iLIZ) == '?' || str.charAt(iLIZ) == ',') {
                    iLIZ++;
                    break;
                }
            }
        }
        arrayDeque.pop();
        return iLIZ - i;
    }
}
