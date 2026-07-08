package X;

/* JADX INFO: renamed from: X.0YIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIZ extends Exception {
    public final int LL;
    public final Exception LLILLJJLI;

    public final int getErrorCode() {
        return this.LL;
    }

    public final Exception getOriginalException() {
        return this.LLILLJJLI;
    }

    public C0YIZ(String str, int i, Exception exc) {
        super(str, exc);
        this.LL = i;
        this.LLILLJJLI = exc;
    }
}
