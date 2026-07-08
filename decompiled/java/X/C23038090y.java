package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.090y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23038090y extends CancellationException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C23038090y() {
        super("Child of the scoped flow was cancelled");
    }
}
