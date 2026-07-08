package X;

/* JADX INFO: renamed from: X.1BuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219841BuQ {
    public final C1524970pmp LIZ;
    public C1304330k2x LIZIZ;
    public C1304330k2x LIZJ;
    public final C21346018gE LIZLLL;

    public C2219841BuQ(C1524970pmp c1524970pmp) {
        this.LIZ = c1524970pmp;
        this.LIZLLL = c1524970pmp.LIZJ;
    }

    public static String LIZ(EnumC2219711BuD enumC2219711BuD) {
        switch (C2219741BuG.LIZ[enumC2219711BuD.ordinal()]) {
            case 1:
                return "none";
            case 2:
            case 3:
                return "unknown";
            case 4:
                return "wifi";
            case 5:
                return "2g";
            case 6:
                return "3g";
            case 7:
                return "4g";
            case 8:
                return "5g";
            default:
                throw new C1954807lC();
        }
    }
}
