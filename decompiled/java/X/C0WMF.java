package X;

/* JADX INFO: renamed from: X.0WMF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WMF {
    public final String LIZ;
    public final C0WN8 LIZIZ;
    public final C0WNE LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(name: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priority: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sortWeight: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dynamic: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WMF(String str, C0WN8 c0wn8, C0WNE c0wne, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = c0wn8;
        this.LIZJ = c0wne;
        this.LIZLLL = i;
        this.LJ = z;
    }

    public /* synthetic */ C0WMF(String str, C0WN8 c0wn8, C0WNE c0wne, int i, int i2) {
        this(str, c0wn8, c0wne, (i2 & 8) != 0 ? 0 : i, false);
    }
}
