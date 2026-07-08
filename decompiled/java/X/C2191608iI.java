package X;

/* JADX INFO: renamed from: X.08iI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2191608iI {
    public final long LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public AnonymousClass0956 LJ;
    public long LJFF;
    public long LJI;
    public boolean LJII;

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJ = null;
        this.LIZJ.setValue(0);
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = false;
    }

    public final void LIZJ() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LJFF = System.currentTimeMillis();
            this.LIZJ.setValue(0);
            this.LJ = C23250099c.LIZLLL(this.LIZIZ, null, null, new C2191508iH(this, null), 3);
        }
    }

    public final int LIZ(long j) {
        long j2 = this.LIZ;
        long j3 = (long) (j2 * 0.05f);
        long j4 = (long) (j2 * 0.7f);
        long j5 = (long) (j2 * 0.25f);
        if (j < j3) {
            return (int) ((j / j3) * 35);
        }
        long j6 = j3 + j4;
        if (j < j6) {
            return ((int) (((j - j3) / j4) * 50)) + 35;
        }
        if (j < j6 + j5) {
            return ((int) ((((j - j3) - j4) / j5) * 10)) + 85;
        }
        return 95;
    }

    public C2191608iI(long j, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = j;
        this.LIZIZ = interfaceC497601wk;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0);
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ);
    }
}
