package X;

/* JADX INFO: renamed from: X.0zdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903740zdk {
    public final boolean LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final AbstractC1623806Xk<?> LIZLLL;
    public final boolean LJ;

    public C1903740zdk() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxShareState(isLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastRefreshMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastRefreshState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1903740zdk(int i) {
        this(false, 0, -1L, C491101vh.LIZ);
    }

    public C1903740zdk(boolean z, int i, long j, AbstractC1623806Xk<?> abstractC1623806Xk) {
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

    public static C1903740zdk LIZ(C1903740zdk c1903740zdk, boolean z, int i, long j, AbstractC1623806Xk abstractC1623806Xk, int i2) {
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        long j2 = j;
        int i3 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            z2 = c1903740zdk.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1903740zdk.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            j2 = c1903740zdk.LIZJ;
        }
        if ((i2 & 8) != 0) {
            abstractC1623806Xk2 = c1903740zdk.LIZLLL;
        }
        c1903740zdk.getClass();
        return new C1903740zdk(z2, i3, j2, abstractC1623806Xk2);
    }
}
