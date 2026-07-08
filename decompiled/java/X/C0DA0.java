package X;

/* JADX INFO: renamed from: X.0DA0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA0 {
    public static final /* synthetic */ int LIZ = 0;

    public static C0DAN LIZ(C0DAR c0dar) {
        EnumC334490D9j enumC334490D9j;
        int i = C0DAQ.LIZ[c0dar.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c0dar.LIZIZ == null) {
                        enumC334490D9j = EnumC334490D9j.MISSING_ADDRESS;
                    } else {
                        enumC334490D9j = EnumC334490D9j.PAGE_BUSY;
                    }
                    return new C0DAN(enumC334490D9j);
                }
                throw new C1954807lC();
            }
            return new C0DAN(EnumC334490D9j.MISSING_ADDRESS);
        }
        return new C0DAN(EnumC334490D9j.PAGE_BUSY);
    }
}
