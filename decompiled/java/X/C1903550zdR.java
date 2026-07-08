package X;

/* JADX INFO: renamed from: X.0zdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903550zdR {
    public static boolean LIZ(EnumC1903600zdW enumC1903600zdW) {
        int i = C1903560zdS.LIZ[enumC1903600zdW.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
                return false;
            }
            C1903610zdX.LIZ.getClass();
            if (C1903610zdX.LIZIZ().inboxBottomCloseBtnVisible && C1903610zdX.LIZIZ().useNewFrequencyControl) {
                return true;
            }
            return false;
        }
        C1903610zdX.LIZ.getClass();
        if (C1903610zdX.LIZIZ().inboxTopCloseBtnVisible && C1903610zdX.LIZIZ().useNewFrequencyControl) {
            return true;
        }
        return false;
    }
}
