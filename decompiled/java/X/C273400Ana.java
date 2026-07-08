package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Ana, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C273400Ana {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2173));

    public static final int LIZ(int i) {
        int iIntValue = i - ((Number) LIZ.getValue()).intValue();
        if (iIntValue < 0) {
            return 0;
        }
        return iIntValue;
    }

    public static final int LIZIZ(int i, int i2) {
        int iLIZ = LIZ(i2);
        if (iLIZ > 0 && i < iLIZ) {
            if (i >= iLIZ / 2) {
                return iLIZ;
            }
            return 0;
        }
        return i;
    }
}
