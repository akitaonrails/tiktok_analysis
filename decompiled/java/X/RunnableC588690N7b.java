package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.0N7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC588690N7b implements Runnable {
    public final Function0<Unit> LL;
    public boolean LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CancelableRunnable@d34c.run");
        try {
            if (!this.LLILLJJLI) {
                this.LL.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CancelableRunnable@d34c.run");
    }

    public RunnableC588690N7b(AwS575S0100000_31 awS575S0100000_31) {
        this.LL = awS575S0100000_31;
    }
}
