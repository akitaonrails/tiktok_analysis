package X;

/* JADX INFO: renamed from: X.0q0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533670q0r extends Exception {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLL;
    }

    public final int getHttpCode() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1533670q0r(int i, int i2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
    }
}
