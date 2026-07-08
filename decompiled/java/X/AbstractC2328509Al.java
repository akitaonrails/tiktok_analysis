package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.09Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2328509Al extends CancellationException {
    public static final int $stable = 0;

    public AbstractC2328509Al() {
        this(null);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AbstractC2328509Al(String str) {
        super(str);
    }
}
