package X;

/* JADX INFO: renamed from: X.0r4C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574180r4C extends Exception {
    public final Throwable LL;
    public final int LLILLJJLI;

    public final int getRetryTimes() {
        return this.LLILLJJLI;
    }

    public final Throwable getRootCause() {
        return this.LL;
    }

    public C1574180r4C(Throwable th, int i) {
        super(th);
        this.LL = th;
        this.LLILLJJLI = i;
    }
}
