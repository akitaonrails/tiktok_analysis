package X;

/* JADX INFO: renamed from: X.0D2N, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D2N extends Exception {
    public final Exception LL;
    public final int LLILLJJLI;

    public final Exception getException() {
        return this.LL;
    }

    public final int getNetworkAttemptCount() {
        return this.LLILLJJLI;
    }

    public C0D2N(Exception exc, int i) {
        this.LL = exc;
        this.LLILLJJLI = i;
    }
}
