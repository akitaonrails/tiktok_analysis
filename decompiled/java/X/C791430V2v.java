package X;

/* JADX INFO: renamed from: X.0V2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C791430V2v extends Throwable {
    public final String LL;
    public final StackTraceElement[] LLILLJJLI;

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public StackTraceElement[] getStackTrace() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.LL;
    }

    public C791430V2v(String str, StackTraceElement[] stackTraceElementArr) {
        this.LL = str;
        this.LLILLJJLI = stackTraceElementArr;
    }
}
