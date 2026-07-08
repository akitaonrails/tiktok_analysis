package X;

/* JADX INFO: renamed from: X.0uPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702900uPo {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public /* synthetic */ C1702900uPo() {
        this(false, 0, 0, 0L);
    }

    public C1702900uPo(boolean z, int i, int i2, long j) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
    }

    public static C1702900uPo LIZ(C1702900uPo c1702900uPo, int i, int i2, long j, int i3) {
        boolean z;
        long j2 = j;
        int i4 = i2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            z = c1702900uPo.LIZ;
        } else {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i5 = c1702900uPo.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i4 = c1702900uPo.LIZJ;
        }
        if ((i3 & 8) != 0) {
            j2 = c1702900uPo.LIZLLL;
        }
        c1702900uPo.getClass();
        return new C1702900uPo(z, i5, i4, j2);
    }
}
