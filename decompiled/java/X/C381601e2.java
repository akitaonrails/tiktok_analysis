package X;

/* JADX INFO: renamed from: X.01e2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C381601e2 {
    public final int LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final Object LIZLLL;
    public C381601e2 LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", executeTime: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", unique: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextMsg: {nextType: ");
        C381601e2 c381601e2 = this.LJ;
        sbLIZ.append(c381601e2 != null ? Integer.valueOf(c381601e2.LIZ) : null);
        sbLIZ.append(", nextTime: ");
        C381601e2 c381601e22 = this.LJ;
        sbLIZ.append(c381601e22 != null ? Long.valueOf(c381601e22.LIZIZ) : null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C381601e2(int i, long j, boolean z, Object obj, int i2) {
        j = (i2 & 2) != 0 ? 0L : j;
        z = (i2 & 4) != 0 ? false : z;
        obj = (i2 & 8) != 0 ? null : obj;
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = obj;
        this.LJ = null;
    }
}
