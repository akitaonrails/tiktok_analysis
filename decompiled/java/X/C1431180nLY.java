package X;

/* JADX INFO: renamed from: X.0nLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1431180nLY extends RuntimeException {
    public final String LL;
    public final Throwable LLILLJJLI;
    public int LLILLL;

    public C1431180nLY() {
        this(null, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LLILLJJLI;
    }

    public final int getErrorCode() {
        return this.LLILLL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C1431180nLY(String str) {
        this(str, null);
    }

    public final String optMessage(String str) {
        String message = getMessage();
        if (message != null) {
            return message;
        }
        return str;
    }

    public final void setErrorCode(int i) {
        this.LLILLL = i;
    }

    public C1431180nLY(String str, Throwable th) {
        this.LL = str;
        this.LLILLJJLI = th;
        this.LLILLL = Integer.MIN_VALUE;
    }

    public static /* synthetic */ String optMessage$default(C1431180nLY c1431180nLY, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "";
            }
            return c1431180nLY.optMessage(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optMessage");
    }
}
