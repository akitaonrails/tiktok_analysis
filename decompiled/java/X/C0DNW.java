package X;

/* JADX INFO: renamed from: X.0DNW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DNW extends RuntimeException {
    public static final int $stable = 8;
    public final Throwable LL;
    public final String LLILLJJLI;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public C0DNW(Throwable th, String str) {
        this.LL = th;
        this.LLILLJJLI = str;
    }
}
