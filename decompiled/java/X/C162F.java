package X;

/* JADX INFO: renamed from: X.162F, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162F {
    public final C016B LIZ;
    public final Boolean LIZIZ;
    public final Long LIZJ;
    public final Boolean LIZLLL;

    public static C162F LIZ(C162F c162f, Long l) {
        return new C162F(c162f.LIZ, c162f.LIZIZ, l, c162f.LIZLLL);
    }

    public C162F(C016B c016b, Boolean bool, Long l, Boolean bool2) {
        this.LIZ = c016b;
        this.LIZIZ = bool;
        this.LIZJ = l;
        this.LIZLLL = bool2;
    }

    public /* synthetic */ C162F(C016B c016b, Boolean bool, Long l, Boolean bool2, int i) {
        this(c016b, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? -1L : l, (i & 8) != 0 ? null : bool2);
    }
}
