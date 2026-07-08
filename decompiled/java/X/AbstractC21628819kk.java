package X;

/* JADX INFO: renamed from: X.19kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21628819kk extends Exception {
    public static final boolean LL;
    public static final StackTraceElement[] LLILLJJLI;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        LL = System.getProperty("surefire.test.class.path") != null;
        LLILLJJLI = new StackTraceElement[0];
    }

    public AbstractC21628819kk() {
    }

    public AbstractC21628819kk(Throwable th) {
        super(th);
    }
}
