package X;

/* JADX INFO: renamed from: X.0uS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704290uS3 extends Exception {
    public final int LL;
    public final String LLILLJJLI;

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public C1704290uS3(int i, String str) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
