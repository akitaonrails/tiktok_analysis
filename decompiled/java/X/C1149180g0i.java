package X;

/* JADX INFO: renamed from: X.0g0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149180g0i extends Exception {
    public static final C1149170g0h Companion = new C1149170g0h();
    public Integer LL;
    public Integer LLILLJJLI;
    public String LLILLL;

    public final Integer getDetailCode() {
        return this.LLILLJJLI;
    }

    public final Integer getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLL;
    }

    public C1149180g0i(String str) {
        this(-1, -1, str);
    }

    public final void setDetailCode(Integer num) {
        this.LLILLJJLI = num;
    }

    public final void setErrorCode(Integer num) {
        this.LL = num;
    }

    public final void setErrorMsg(String str) {
        this.LLILLL = str;
    }

    public C1149180g0i(Integer num, String str) {
        this(num, -1, str);
    }

    public C1149180g0i(Integer num, Integer num2, String str) {
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = str;
    }
}
