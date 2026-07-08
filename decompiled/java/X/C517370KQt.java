package X;

import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0KQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517370KQt {
    public static final /* synthetic */ int LIZ = 0;

    public static C517360KQs LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new C517360KQs("", "", false);
        }
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            IntRange intRange = new IntRange(0, 9);
            Integer numLIZ = C1244080iTm.LIZ(cCharAt);
            if (numLIZ != null && intRange.LJLJL(numLIZ.intValue())) {
                if (i != -1) {
                    int length2 = str.length() - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i3 = length2 - 1;
                            char cCharAt2 = str.charAt(length2);
                            IntRange intRange2 = new IntRange(0, 9);
                            Integer numLIZ2 = C1244080iTm.LIZ(cCharAt2);
                            if (numLIZ2 != null && intRange2.LJLJL(numLIZ2.intValue())) {
                                i2 = length2;
                                break;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            length2 = i3;
                        }
                    }
                    int i4 = i2 + 1;
                    String strSubstring = str.substring(i, i4);
                    if (i == 0) {
                        return new C517360KQs(str.substring(i4), strSubstring, true);
                    }
                    return new C517360KQs(str.substring(0, i), strSubstring, false);
                }
            } else {
                i++;
            }
        }
        return new C517360KQs("", "", false);
    }
}
