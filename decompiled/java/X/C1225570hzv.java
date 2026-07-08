package X;

/* JADX INFO: renamed from: X.0hzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225570hzv extends Exception {
    public static final int $stable = 8;
    public final String LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C1225570hzv(String str) {
        super(str);
        this.LL = str;
    }
}
