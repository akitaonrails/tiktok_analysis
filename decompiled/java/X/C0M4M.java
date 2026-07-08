package X;

/* JADX INFO: renamed from: X.0M4M, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4M {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC562220M3g LIZJ;
    public final C562260M3k LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0M4M(EnumC562220M3g enumC562220M3g, C562260M3k c562260M3k) {
        boolean z = true;
        this(z, z, enumC562220M3g, c562260M3k, 16);
    }

    public /* synthetic */ C0M4M(boolean z, boolean z2, EnumC562220M3g enumC562220M3g, C562260M3k c562260M3k, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? EnumC562220M3g.ALL : enumC562220M3g, (i & 8) != 0 ? null : c562260M3k, false);
    }

    public C0M4M(boolean z, boolean z2, EnumC562220M3g enumC562220M3g, C562260M3k c562260M3k, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = enumC562220M3g;
        this.LIZLLL = c562260M3k;
        this.LJ = z3;
    }
}
