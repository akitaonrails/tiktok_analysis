package X;

/* JADX INFO: renamed from: X.1129, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1129 extends RuntimeException {
    public long LL;
    public String LLILLJJLI;
    public static final C112A Companion = new Object() { // from class: X.112A
    };
    public static final int $stable = 8;

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

    public AnonymousClass1129(long j, String str) {
        super(str);
        this.LL = j;
        this.LLILLJJLI = str;
    }
}
