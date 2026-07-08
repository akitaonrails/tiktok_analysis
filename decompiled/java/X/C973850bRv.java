package X;

/* JADX INFO: renamed from: X.0bRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973850bRv {
    public static int LIZ() {
        if (C915980Zwa.LIZIZ().Dn0() != EnumC962960bAM.TAKE_THE_STAGE) {
            int i = C973860bRw.LIZ[C915980Zwa.LIZIZ().JV1(false).ordinal()];
            if (i == 1 || i == 2) {
                return 1;
            }
            return (i == 3 || i == 4) ? 3 : 0;
        }
        EnumC973870bRx enumC973870bRxLIZJ = C973930bS3.LIZJ();
        if (enumC973870bRxLIZJ == null) {
            return 0;
        }
        int i2 = C973860bRw.LIZIZ[enumC973870bRxLIZJ.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 3;
        }
        return 4;
    }
}
