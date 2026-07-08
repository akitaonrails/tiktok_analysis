package X;

/* JADX INFO: renamed from: X.0zdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903760zdm {
    public final boolean LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final AbstractC1623806Xk<?> LIZLLL;
    public final boolean LJ;

    public C1903760zdm() {
        this(0);
    }

    public /* synthetic */ C1903760zdm(int i) {
        this(false, 0, -1L, C491101vh.LIZ);
    }

    public C1903760zdm(boolean z, int i, long j, AbstractC1623806Xk<?> abstractC1623806Xk) {
        boolean z2;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = abstractC1623806Xk;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJ = z2;
    }

    public static C1903760zdm LIZ(C1903760zdm c1903760zdm, boolean z, int i, long j, AbstractC1623806Xk abstractC1623806Xk, int i2) {
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        long j2 = j;
        int i3 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            z2 = c1903760zdm.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1903760zdm.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            j2 = c1903760zdm.LIZJ;
        }
        if ((i2 & 8) != 0) {
            abstractC1623806Xk2 = c1903760zdm.LIZLLL;
        }
        c1903760zdm.getClass();
        return new C1903760zdm(z2, i3, j2, abstractC1623806Xk2);
    }
}
