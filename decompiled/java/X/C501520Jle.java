package X;

/* JADX INFO: renamed from: X.0Jle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C501520Jle extends Exception {
    public final int LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" TYPE = ApiException, errorCode = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" ");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getErrorCode() {
        return this.LL;
    }

    public C501520Jle(int i) {
        this.LL = i;
    }

    public C501520Jle(int i, Throwable th) {
        super(th);
        this.LL = i;
    }
}
