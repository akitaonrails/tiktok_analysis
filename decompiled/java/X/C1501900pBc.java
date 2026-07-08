package X;

/* JADX INFO: renamed from: X.0pBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501900pBc {
    public final int LIZ;
    public final String LIZIZ;
    public final C1501870pBZ LIZJ;
    public final Exception LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KMPNetworkResponse(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', body=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1501900pBc(String str) {
        this(-1, str, null, null);
    }

    public C1501900pBc(int i, String str, C1501870pBZ c1501870pBZ, Exception exc) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = c1501870pBZ;
        this.LIZLLL = exc;
    }
}
