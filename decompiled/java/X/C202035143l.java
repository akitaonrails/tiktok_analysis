package X;

/* JADX INFO: renamed from: X.143l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202035143l extends Exception {
    public int LL;
    public String LLILLJJLI;
    public String LLILLL;

    public C202035143l() {
    }

    public int getErrorCode() {
        return this.LL;
    }

    public String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public String getErrorUrl() {
        return this.LLILLL;
    }

    public void setErrorCode(int i) {
        this.LL = i;
    }

    public void setErrorMsg(String str) {
        this.LLILLJJLI = str;
    }

    public void setErrorUrl(String str) {
        this.LLILLL = str;
    }

    public C202035143l(int i, String str) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
    }

    public C202035143l(int i, String str, String str2) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
