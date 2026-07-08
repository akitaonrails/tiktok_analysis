package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.05bI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1383805bI extends CancellationException {
    public static final int $stable = 0;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C1383805bI() {
        super("Anchored drag finished");
    }
}
