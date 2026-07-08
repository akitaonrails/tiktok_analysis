package X;

/* JADX INFO: renamed from: X.0WuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838130WuJ extends Exception {
    public final int LL;
    public final String LLILLJJLI;

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public C838130WuJ(int i, String str) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
