package X;

/* JADX INFO: renamed from: X.0p9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500760p9m extends RuntimeException {
    public final int LL;
    public final String LLILLJJLI;
    public final transient C1500770p9n<?> LLILLL;

    public int code() {
        return this.LL;
    }

    public String message() {
        return this.LLILLJJLI;
    }

    public C1500770p9n<?> response() {
        return this.LLILLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1500760p9m(C1500770p9n<?> c1500770p9n) {
        C1502190pC5.LIZ(c1500770p9n, "response == null");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HTTP ");
        sbLIZ.append(c1500770p9n.LIZ.LLILLL);
        sbLIZ.append(" ");
        sbLIZ.append(c1500770p9n.LIZ.LLILZ);
        super(C2188811AlT.LIZIZ(sbLIZ));
        C0XLY c0xly = c1500770p9n.LIZ;
        this.LL = c0xly.LLILLL;
        this.LLILLJJLI = c0xly.LLILZ;
        this.LLILLL = c1500770p9n;
    }
}
