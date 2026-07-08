package X;

/* JADX INFO: renamed from: X.0YIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIJ extends Exception {
    public final int LL;

    public int getErrorCode() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0YIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error: ");
        sbLIZ.append(i);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
    }
}
