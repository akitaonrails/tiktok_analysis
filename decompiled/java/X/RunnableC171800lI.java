package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00lI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC171800lI implements Runnable {
    public final /* synthetic */ Function0<Unit> LL;

    public RunnableC171800lI(Function0<Unit> function0) {
        this.LL = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Worker@68e.postMain$1");
        try {
            this.LL.invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Worker@68e.postMain$1");
    }
}
