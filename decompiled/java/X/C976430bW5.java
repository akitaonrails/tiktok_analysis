package X;

/* JADX INFO: renamed from: X.0bW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976430bW5 {
    public static String LIZ(EnumC976390bW1 enumC976390bW1) {
        int i = C976570bWJ.LIZ[enumC976390bW1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "time_out";
                }
                throw new C1954807lC();
            }
            if (C915980Zwa.LJI().LIZ().LJJIJLIJ()) {
                return "live_end";
            }
            return "cohost_end";
        }
        return "active";
    }
}
