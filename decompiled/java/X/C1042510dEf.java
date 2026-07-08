package X;

import Y.ARunnableS116S0100000_16;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0dEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042510dEf {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0btS] */
    public static C990920btS LIZ(int i, long j) {
        boolean z;
        final C822650WOx c822650WOx = new C822650WOx(i, i, j, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        c822650WOx.allowCoreThreadTimeOut(z);
        return new InterfaceExecutorC740550T3d(c822650WOx) { // from class: X.0btS
            public final ExecutorService LL;

            {
                this.LL = c822650WOx;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.LL.execute(new ARunnableS116S0100000_16(runnable, 138));
            }
        };
    }
}
