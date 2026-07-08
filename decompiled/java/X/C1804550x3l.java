package X;

/* JADX INFO: renamed from: X.0x3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804550x3l extends Exception {
    public final String LL;
    public int LLILLJJLI;

    public final int getErrorCode() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public final void setErrorCode(int i) {
        this.LLILLJJLI = i;
    }

    public C1804550x3l(String str, int i) {
        super(str);
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
