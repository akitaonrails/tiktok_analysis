package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.094L, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C094L extends CancellationException {
    public final transient InterfaceC346701Wf<?> owner;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C094L(InterfaceC346701Wf<?> interfaceC346701Wf) {
        super("Flow was aborted, no more elements needed");
        this.owner = interfaceC346701Wf;
    }
}
