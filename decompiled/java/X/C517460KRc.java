package X;

/* JADX INFO: renamed from: X.0KRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517460KRc extends Exception {
    public final int LL;
    public final String LLILLJJLI;

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public C517460KRc(int i, String str) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
