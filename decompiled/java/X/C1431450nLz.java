package X;

/* JADX INFO: renamed from: X.0nLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431450nLz extends RuntimeException {
    public long LL;
    public String LLILLJJLI;

    public final long getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public final void setErrorCode(long j) {
        this.LL = j;
    }

    public final void setErrorMsg(String str) {
        this.LLILLJJLI = str;
    }

    public C1431450nLz(long j, String str) {
        super(str);
        this.LL = j;
        this.LLILLJJLI = str;
    }
}
