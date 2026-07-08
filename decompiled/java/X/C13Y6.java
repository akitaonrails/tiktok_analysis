package X;

/* JADX INFO: renamed from: X.13Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Y6 extends IllegalStateException {
    public static final int $stable = 0;
    public final String LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C13Y6(String str) {
        this.LL = str;
    }
}
