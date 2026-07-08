package X;

import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.1Anu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190321Anu {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1789));

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final int LIZIZ(int i) {
        int i2;
        int iAbs = Math.abs(i);
        C2190331Anv.LIZ.getClass();
        if (iAbs >= C2190331Anv.LIZ().fastVelThreshold) {
            i2 = C2190331Anv.LIZ().fastRows;
        } else if (iAbs >= C2190331Anv.LIZ().medVelThreshold) {
            i2 = C2190331Anv.LIZ().medRows;
        } else {
            i2 = C2190331Anv.LIZ().slowRows;
        }
        int i3 = C2190331Anv.LIZ().maxRowsCap;
        if (i3 < 0) {
            i3 = 0;
        }
        return C13LZ.LJ(i2, 0, i3);
    }
}
