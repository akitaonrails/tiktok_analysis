package X;

/* JADX INFO: renamed from: X.0fWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1130270fWD extends Exception {
    public static final int $stable = 8;
    public final int LL;
    public final String LLILLJJLI;

    public final int getErrorCode() {
        return this.LL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public C1130270fWD(int i, String str, Throwable th) {
        super(str, th);
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
