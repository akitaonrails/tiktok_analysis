package X;

/* JADX INFO: renamed from: X.0axu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955240axu {
    public static final EnumC918810a19 LIZ(EnumC955290axz enumC955290axz) {
        int i = C955280axy.LIZ[enumC955290axz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC918810a19.StateLinked;
                }
                throw new C1954807lC();
            }
            return EnumC918810a19.StatePreparing;
        }
        return EnumC918810a19.StateInit;
    }
}
