package X;

/* JADX INFO: renamed from: X.0CUY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CUY {
    public static final C0CUY LIZ = new C0CUY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0CUX());
    public static volatile int LIZJ;
    public static volatile int LIZLLL;

    public static int LIZ() {
        if (C343780Ddo.LIZIZ()) {
            C1585070rLl c1585070rLl = C1585070rLl.LIZ;
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.MALL;
            c1585070rLl.getClass();
            if (C1585070rLl.LJFF(enumC1584360rKc, null)) {
                return 2;
            }
            if (!C1585070rLl.LIZLLL(c1585070rLl, enumC1584360rKc)) {
                return 0;
            }
        } else {
            C01GW c01gw = LIZIZ;
            if (((Number) c01gw.getValue()).intValue() != 1 && LIZLLL != 1 && LIZJ != 1) {
                return (((Number) c01gw.getValue()).intValue() == 2 || LIZLLL == 2 || LIZJ == 2) ? 2 : 0;
            }
        }
        return 1;
    }
}
