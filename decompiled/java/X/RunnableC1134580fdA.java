package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class RunnableC1134580fdA implements Runnable {
    public static final RunnableC1134580fdA LL = new RunnableC1134580fdA();

    public static void LIZ() {
        C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
        C20441214yg.LIZIZ("DateSwitchManager", "onDateSwitch");
        Iterator<T> it2 = C1134560fd8.LIZIZ.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Long.valueOf(C1134560fd8.LIZJ));
        }
        C0JT7.LIZ.getClass();
        C0JT7.LIZJ(0, "continue_tomorrow_task_remind");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DateSwitchManager@2b9b.countDownRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DateSwitchManager@2b9b.countDownRunnable$1");
    }
}
