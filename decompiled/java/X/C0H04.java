package X;

/* JADX INFO: renamed from: X.0H04, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H04 extends RuntimeException {
    public static final int $stable = 8;
    public final String LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C0H04(String str) {
        this.LL = str;
    }
}
