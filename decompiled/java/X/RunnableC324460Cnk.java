package X;

import kotlin.jvm.internal.AwS133S0400000_4;

/* JADX INFO: renamed from: X.0Cnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC324460Cnk implements Runnable {
    public static final RunnableC324460Cnk LL = new RunnableC324460Cnk();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TabStabilityReporter@8aab.notifyTabAttached$1");
        try {
            AwS133S0400000_4 awS133S0400000_4 = C343520DdO.LJIIJ;
            if (awS133S0400000_4 != null) {
                awS133S0400000_4.invoke();
            }
            C343520DdO c343520DdO = C343520DdO.LIZ;
            C343520DdO.LJIIJ = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabStabilityReporter@8aab.notifyTabAttached$1");
    }
}
