package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.08kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2206308kf {
    public static final C2206308kf LIZJ = new C2206308kf();
    public final ExecutorService LIZ;
    public final C08LU LIZIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.08LU] */
    public C2206308kf() {
        ExecutorService executorServiceLIZ;
        String property = System.getProperty("java.runtime.name");
        if (property == null || !property.toLowerCase(Locale.US).contains("android")) {
            executorServiceLIZ = C807400Vlq.LIZ();
        } else {
            C822650WOx c822650WOx = new C822650WOx(C2206408kg.LIZJ, C2206408kg.LIZLLL, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            c822650WOx.allowCoreThreadTimeOut(true);
            executorServiceLIZ = c822650WOx;
        }
        this.LIZ = executorServiceLIZ;
        C807400Vlq.LJ();
        this.LIZIZ = new Executor() { // from class: X.08LU
            public final ThreadLocal<Integer> LL = new ThreadLocal<>();

            public final void LIZ() {
                Integer num = this.LL.get();
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue() - 1;
                if (iIntValue == 0) {
                    this.LL.remove();
                } else {
                    this.LL.set(Integer.valueOf(iIntValue));
                }
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Integer num = this.LL.get();
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue() + 1;
                this.LL.set(Integer.valueOf(iIntValue));
                try {
                    if (iIntValue <= 15) {
                        runnable.run();
                    } else {
                        C823050WQl.LIZJ().execute(runnable);
                    }
                    LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZ();
                    throw th;
                }
            }
        };
    }
}
