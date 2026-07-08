package X;

/* JADX INFO: renamed from: X.0nUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436910nUn extends RuntimeException {
    public final String LL;
    public final String LLILLJJLI;
    public final Throwable LLILLL;

    public final String getCode() {
        return this.LLILLJJLI;
    }

    public final String getMsg() {
        return this.LL;
    }

    public final Throwable getT() {
        return this.LLILLL;
    }

    public C1436910nUn(String str, String str2, Throwable th) {
        super(str);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = th;
    }
}
