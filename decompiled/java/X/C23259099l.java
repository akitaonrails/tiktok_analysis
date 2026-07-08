package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.099l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23259099l extends CompletedExceptionally {
    public static final AtomicIntegerFieldUpdater LIZ = AtomicIntegerFieldUpdater.newUpdater(C23259099l.class, "_resumed");
    public volatile int _resumed;

    public C23259099l(InterfaceC1364105Vn<?> interfaceC1364105Vn, Throwable th, boolean z) {
        if (th == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Continuation ");
            sbLIZ.append(interfaceC1364105Vn);
            sbLIZ.append(" was cancelled normally");
            th = new CancellationException(C2188811AlT.LIZIZ(sbLIZ));
        }
        super(th, z);
        this._resumed = 0;
    }
}
