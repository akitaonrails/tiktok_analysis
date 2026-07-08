package X;

/* JADX INFO: renamed from: X.0rJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583440rJ8 {
    public static final int LIZ;

    static {
        int iLLIL;
        int i = 0;
        if (C343780Ddo.LIZIZ()) {
            InterfaceC1583450rJ9 interfaceC1583450rJ9LJIIJJI = C19252910Tv.LIZIZ.LIZLLL().LJIIJJI();
            C1585070rLl c1585070rLl = C1585070rLl.LIZ;
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.EXPLORE;
            c1585070rLl.getClass();
            if (C1585070rLl.LJFF(enumC1584360rKc, null)) {
                i = 2;
            } else if (C1585070rLl.LIZLLL(c1585070rLl, enumC1584360rKc)) {
                i = 1;
            }
            iLLIL = interfaceC1583450rJ9LJIIJJI.LLIL(i);
        } else {
            iLLIL = C19252910Tv.LIZIZ.LIZLLL().LJIIJJI().LLIL(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_explore_feed", true));
        }
        LIZ = iLLIL;
    }

    public static boolean LIZ() {
        return C343780Ddo.LIZIZ() ? C1585070rLl.LIZLLL(C1585070rLl.LIZ, EnumC1584360rKc.EXPLORE) : LIZ == 1;
    }

    public static boolean LIZIZ() {
        if (!C343780Ddo.LIZIZ()) {
            return LIZ == 2;
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.EXPLORE;
        c1585070rLl.getClass();
        return C1585070rLl.LJFF(enumC1584360rKc, null);
    }
}
