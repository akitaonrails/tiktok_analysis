package X;

import Y.ARunnableS123S0100000_23;
import android.os.MessageQueue;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ps1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1528190ps1 implements MessageQueue.IdleHandler, Runnable {
    public final float LL;
    public final Function0<Unit> LLILLJJLI;
    public long LLILZ;
    public long LLILZLL;
    public final PthreadTimer LLILLL = new PthreadTimer("IdleTaskTimer");
    public long LLILZIL = 1000;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        C2126308Ur.LIZLLL.LL.execute(new ARunnableS123S0100000_23(this, 24));
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("IdleTask@1e4b.run");
        try {
            queueIdle();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IdleTask@1e4b.run");
    }

    public RunnableC1528190ps1(float f, Function0<Unit> function0) {
        this.LL = f;
        this.LLILLJJLI = function0;
    }
}
