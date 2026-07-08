package X;

/* JADX INFO: renamed from: X.11bE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19531411bE {
    public final EnumC19531811bI LIZ;
    public final C19532111bL LIZIZ;

    public C19531411bE(EnumC19531811bI enumC19531811bI, C19532111bL c19532111bL) {
        this.LIZ = enumC19531811bI;
        this.LIZIZ = c19532111bL;
    }

    public static C19531411bE LIZ(C19531411bE c19531411bE, EnumC19531811bI enumC19531811bI, C19532111bL c19532111bL, int i) {
        if ((i & 1) != 0) {
            enumC19531811bI = c19531411bE.LIZ;
        }
        if ((i & 2) != 0) {
            c19532111bL = c19531411bE.LIZIZ;
        }
        c19531411bE.getClass();
        return new C19531411bE(enumC19531811bI, c19532111bL);
    }
}
