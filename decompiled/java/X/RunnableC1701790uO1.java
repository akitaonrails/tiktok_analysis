package X;

import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uO1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1701790uO1 implements Runnable, InterfaceC420801kM {
    public final Handler LL;
    public final Runnable LLILLJJLI;
    public volatile boolean LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LL.removeCallbacks(this);
        this.LLILLL = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILLJJLI.run();
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C19489211Ms.LIZIZ(th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (!C2179971ATj.LIZ(th2)) {
                    throw th2;
                }
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL;
    }

    public RunnableC1701790uO1(Handler handler, Runnable runnable) {
        this.LL = handler;
        this.LLILLJJLI = runnable;
    }
}
