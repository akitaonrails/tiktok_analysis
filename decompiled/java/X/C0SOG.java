package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SOG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SOG implements Runnable {
    public Function0<Unit> LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LazyRun@f1dd.run");
        try {
            Function0<Unit> function0 = this.LL;
            if (function0 != null) {
                function0.invoke();
                this.LL = null;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LazyRun@f1dd.run");
    }

    public C0SOG(Function0<Unit> function0) {
        this.LL = function0;
    }
}
