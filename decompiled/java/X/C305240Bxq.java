package X;

/* JADX INFO: renamed from: X.0Bxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305240Bxq implements C0RLH {
    public static final C305240Bxq LIZ = new C305240Bxq();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C283990BBd());

    public static int LJ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    @Override // X.C0RLH
    public final boolean LIZIZ() {
        return (C19252910Tv.LIZIZ.LIZLLL().block().LJIIIZ() || LJ() == 0) ? false : true;
    }

    @Override // X.C0RLH
    public final boolean LIZ() {
        return LJ() == 2 || LJ() == 1;
    }

    @Override // X.C0RLH
    public final boolean LIZJ() {
        return LJ() == 3 || LJ() == 4;
    }

    @Override // X.C0RLH
    public final boolean LIZLLL() {
        return LJ() == 4;
    }
}
