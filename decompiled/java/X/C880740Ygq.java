package X;

/* JADX INFO: renamed from: X.0Ygq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880740Ygq {
    public CharSequence LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C880740Ygq() {
        this(null, 127);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public /* synthetic */ C880740Ygq(CharSequence charSequence, int i) {
        this((i & 1) != 0 ? "" : charSequence, null, false, false, false, false, false);
    }

    public C880740Ygq(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LIZ = charSequence;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
    }
}
