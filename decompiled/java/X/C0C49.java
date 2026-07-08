package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C49, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C49 implements Runnable {
    public final boolean LL;
    public final Function0<Unit> LLILLJJLI;
    public volatile boolean LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DispatchRunnable@8ea3.run");
        try {
            this.LLILLL = true;
            this.LLILLJJLI.invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DispatchRunnable@8ea3.run");
    }

    public C0C49(Function0 function0, boolean z) {
        this.LL = z;
        this.LLILLJJLI = function0;
    }
}
