package X;

import Y.ARunnableS128S0100000_28;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0ziQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class RunnableC1906640ziQ implements MessageQueue.IdleHandler, Runnable {
    public final Handler LL;
    public final Runnable LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.LLILLL = false;
        this.LL.removeCallbacks(this);
        this.LLILZ = false;
        this.LLILLJJLI.run();
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("IdleRunnable@a7f2.run");
        try {
            this.LLILZ = false;
            Looper.myQueue().removeIdleHandler(this);
            this.LLILLL = false;
            this.LLILLJJLI.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IdleRunnable@a7f2.run");
    }

    public RunnableC1906640ziQ(BPEAHandler bPEAHandler, RunnableC21497119Az runnableC21497119Az, long j) {
        new ARunnableS128S0100000_28(this, 114);
        this.LL = bPEAHandler;
        this.LLILLJJLI = runnableC21497119Az;
        if (j > 0) {
        } else {
            throw new IllegalArgumentException("timeOutMillis should >0");
        }
    }
}
