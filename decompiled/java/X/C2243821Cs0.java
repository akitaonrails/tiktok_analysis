package X;

/* JADX INFO: renamed from: X.1Cs0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243821Cs0 {
    public static EnumC2243731Crr LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return EnumC2243731Crr.SEND;
            }
            if (num.intValue() == 2) {
                return EnumC2243731Crr.FAVOURITE;
            }
            if (num.intValue() == 3) {
                return EnumC2243731Crr.REPORT;
            }
        }
        return EnumC2243731Crr.UNKNOWN;
    }
}
