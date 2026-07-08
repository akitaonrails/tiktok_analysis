package X;

/* JADX INFO: renamed from: X.0Hqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453870Hqz extends RuntimeException {
    public static final int $stable = 8;
    public final String LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C453870Hqz(String str) {
        super(str);
        this.LL = str;
    }
}
