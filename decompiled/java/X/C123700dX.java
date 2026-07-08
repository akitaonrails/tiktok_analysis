package X;

/* JADX INFO: renamed from: X.00dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C123700dX {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMEOpenProjectResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C123700dX(boolean z, int i, String str) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
