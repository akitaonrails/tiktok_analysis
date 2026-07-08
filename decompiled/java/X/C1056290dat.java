package X;

/* JADX INFO: renamed from: X.0dat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056290dat {
    public final long LIZ;
    public final int LIZIZ;
    public final EnumC1056240dao LIZJ;
    public final boolean LIZLLL;

    public /* synthetic */ C1056290dat() {
        this(-1L, 0, EnumC1056240dao.NONE, false);
    }

    public C1056290dat(long j, int i, EnumC1056240dao enumC1056240dao, boolean z) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = enumC1056240dao;
        this.LIZLLL = z;
    }

    public static C1056290dat LIZ(C1056290dat c1056290dat, long j, EnumC1056240dao enumC1056240dao, int i) {
        int i2;
        boolean z;
        EnumC1056240dao enumC1056240dao2 = enumC1056240dao;
        long j2 = j;
        if ((i & 1) != 0) {
            j2 = c1056290dat.LIZ;
        }
        if ((i & 2) != 0) {
            i2 = c1056290dat.LIZIZ;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            enumC1056240dao2 = c1056290dat.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c1056290dat.LIZLLL;
        } else {
            z = false;
        }
        c1056290dat.getClass();
        return new C1056290dat(j2, i2, enumC1056240dao2, z);
    }
}
