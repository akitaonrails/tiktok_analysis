package X;

/* JADX INFO: renamed from: X.0qC9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540670qC9 {
    public final int LIZ;
    public int LIZIZ;
    public Boolean LIZJ;

    public C1540670qC9() {
        this(0, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" expectationLoadTimes: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentLoadFinishTimes: ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1540670qC9(int i, int i2) {
        this.LIZ = (i2 & 1) != 0 ? 1 : i;
        this.LIZIZ = 0;
        this.LIZJ = null;
    }
}
