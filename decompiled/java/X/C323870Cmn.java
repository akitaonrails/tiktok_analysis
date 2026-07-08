package X;

/* JADX INFO: renamed from: X.0Cmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323870Cmn extends Exception {
    public static final int $stable = 8;
    public final long LL;
    public final long LLILLJJLI;
    public final String LLILLL;

    public final long getFragmentId() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLL;
    }

    public final long getMusicId() {
        return this.LLILLJJLI;
    }

    public C323870Cmn(long j, long j2, String str, Throwable th) {
        super(str, th);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = str;
    }
}
