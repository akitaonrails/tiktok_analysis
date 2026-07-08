package X;

/* JADX INFO: renamed from: X.0ZgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906040ZgY extends Exception {
    public final int LL;
    public final String LLILLJJLI;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C906040ZgY(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Streaming error [");
        sbLIZ.append(i);
        sbLIZ.append("]: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
