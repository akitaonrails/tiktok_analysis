package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import v7.o;

/* JADX INFO: renamed from: X.0nTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class RunnableC1435990nTJ implements Runnable {
    public final Function0<Unit> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(529));

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SerialAction@444b.run");
        try {
            this.LL.invoke();
            ((o) this.LLILLJJLI.getValue()).LIZ.LJIJJLI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SerialAction@444b.run");
    }

    public RunnableC1435990nTJ(Function0<Unit> function0) {
        this.LL = function0;
    }
}
