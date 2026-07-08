package X;

/* JADX INFO: renamed from: X.0nOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433230nOr {
    public final String LIZ;
    public final boolean LIZIZ;
    public final C1434650nR9 LIZJ;

    public C1433230nOr() {
        this(null, null, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelCause(cause=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", removeTask=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1433230nOr(String str, C1434650nR9 c1434650nR9, int i) {
        str = (i & 1) != 0 ? "" : str;
        c1434650nR9 = (i & 4) != 0 ? null : c1434650nR9;
        this.LIZ = str;
        this.LIZIZ = false;
        this.LIZJ = c1434650nR9;
    }
}
