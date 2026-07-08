package X;

/* JADX INFO: renamed from: X.0HHE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHE extends RuntimeException {
    public final Throwable LL;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LL;
    }

    public C0HHE(Throwable th) {
        this.LL = th;
    }
}
