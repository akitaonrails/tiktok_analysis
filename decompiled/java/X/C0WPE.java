package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0WPE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPE {
    public static InterfaceExecutorServiceC702790RhV LIZ(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC702790RhV) {
            return (InterfaceExecutorServiceC702790RhV) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new C0WPD((ScheduledExecutorService) executorService);
        }
        return new C822450WOd(executorService);
    }
}
