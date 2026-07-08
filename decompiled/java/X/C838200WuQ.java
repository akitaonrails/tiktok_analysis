package X;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838200WuQ {
    public static final C838200WuQ LIZLLL;
    public final ExecutorService LIZ;
    public final ScheduledExecutorService LIZIZ;
    public final ExecutorC838210WuR LIZJ;

    static {
        new Object() { // from class: X.0WuV
        };
        LIZLLL = new C838200WuQ();
    }

    public C838200WuQ() {
        ExecutorService executorServiceLIZ;
        String property = System.getProperty("java.runtime.name");
        if (property == null || !a0.LJJIIZI(property.toLowerCase(Locale.US), "android", false)) {
            executorServiceLIZ = C807400Vlq.LIZ();
        } else {
            C822650WOx c822650WOx = new C822650WOx(C305360By2.LIZJ, C305360By2.LIZLLL, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            c822650WOx.allowCoreThreadTimeOut(true);
            executorServiceLIZ = c822650WOx;
        }
        this.LIZ = executorServiceLIZ;
        this.LIZIZ = C807400Vlq.LJ();
        this.LIZJ = new ExecutorC838210WuR();
    }
}
