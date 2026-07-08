package X;

/* JADX INFO: renamed from: X.093u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C23112093u extends RuntimeException {
    public final int LL;

    public int getErrorCode() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23112093u(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        sbLIZ.append(i);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23112093u(int i, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        sbLIZ.append(i);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
        this.LL = i;
    }
}
