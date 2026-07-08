package X;

/* JADX INFO: renamed from: X.01es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C386801es extends Exception {
    public static final C386901et Companion = new Object() { // from class: X.01et
    };
    public static final int DEFAULT = -1000;
    public final int LL;
    public final String LLILLJJLI;

    public final String getErrMsg() {
        return this.LLILLJJLI;
    }

    public final int getErrorCode() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C386801es(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
