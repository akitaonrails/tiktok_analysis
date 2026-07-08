package X;

/* JADX INFO: renamed from: X.0HKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439330HKp extends RuntimeException {
    public static final int $stable = 8;
    public final EnumC439340HKq LL;
    public final Throwable LLILLJJLI;

    public final EnumC439340HKq getReason() {
        return this.LL;
    }

    public final Throwable getServerException() {
        return this.LLILLJJLI;
    }

    public C439330HKp(EnumC439340HKq enumC439340HKq, Throwable th) {
        this.LL = enumC439340HKq;
        this.LLILLJJLI = th;
    }
}
