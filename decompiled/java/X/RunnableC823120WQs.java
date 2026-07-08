package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC823120WQs implements Runnable {
    public static ExecutorService LLILLL;
    public static ExecutorService LLILZ;
    public final Runnable LL;
    public final boolean LLILLJJLI = false;

    static {
        ExecutorService executorService = C2126108Up.LIZ;
        LLILLL = executorService;
        LLILZ = executorService;
        new AtomicInteger();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zLIZ;
        C1C7U.LIZ("ThreadPlus@b547.run");
        try {
            Runnable runnable = this.LL;
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadPlus@b547.run");
    }

    public final void LIZ() {
        Runnable aRunnableS113S0100000_13 = Logger.debug() ? new ARunnableS113S0100000_13((Object) this, 173) : this;
        if (this.LLILLJJLI) {
            LLILZ.submit(aRunnableS113S0100000_13);
        } else {
            LLILLL.submit(aRunnableS113S0100000_13);
        }
    }

    public RunnableC823120WQs(Runnable runnable) {
        this.LL = runnable;
    }

    public static void LIZIZ(Runnable runnable) {
        LLILLL.submit(runnable);
    }

    public RunnableC823120WQs(Object obj) {
    }
}
