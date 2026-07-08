package X;

/* JADX INFO: renamed from: X.0k1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303660k1s extends OutOfMemoryError {
    public int LL;
    public String LLILLJJLI;
    public Object context;
    public OutOfMemoryError outOfMemoryError;

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return this.outOfMemoryError.getCause();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.outOfMemoryError.getLocalizedMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.outOfMemoryError.getMessage();
    }

    @Override // java.lang.Throwable
    public StackTraceElement[] getStackTrace() {
        return this.outOfMemoryError.getStackTrace();
    }

    public int getErrorCode() {
        return this.LL;
    }

    public String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public C1303660k1s(OutOfMemoryError outOfMemoryError) {
        this.outOfMemoryError = outOfMemoryError;
    }

    public void setErrorCode(int i) {
        this.LL = i;
    }

    public void setErrorMessage(String str) {
        this.LLILLJJLI = str;
    }
}
