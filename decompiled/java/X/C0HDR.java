package X;

/* JADX INFO: renamed from: X.0HDR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HDR extends RuntimeException {
    public final String LL;

    public C0HDR() {
        this(null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C0HDR(String str) {
        this.LL = str;
    }
}
