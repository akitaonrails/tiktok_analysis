package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042250dEF {
    public final C822650WOx LIZ;
    public final AtomicInteger LIZIZ;

    public C1042250dEF() {
        C822650WOx c822650WOx = new C822650WOx(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        c822650WOx.allowCoreThreadTimeOut(true);
        this.LIZ = c822650WOx;
        this.LIZIZ = new AtomicInteger(0);
    }

    public final void LIZ(Runnable runnable) {
        if (runnable instanceof AbstractRunnableC1042190dE9) {
            this.LIZIZ.incrementAndGet();
            ((AbstractRunnableC1042190dE9) runnable).LL = new AwS560S0100000_16(this, 886);
        }
        this.LIZ.submit(runnable);
    }
}
