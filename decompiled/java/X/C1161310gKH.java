package X;

/* JADX INFO: renamed from: X.0gKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1161310gKH extends RuntimeException {
    public final int LL;

    public int getErrorCode() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1161310gKH(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        sbLIZ.append(i);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1161310gKH(int i, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        sbLIZ.append(i);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
        this.LL = i;
    }
}
