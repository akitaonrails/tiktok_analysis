package X;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808510Vnd implements WeakHandler.IHandler {
    public static C808510Vnd LLILLJJLI;
    public static HandlerThread LLILLL;
    public final WeakHandler LL;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static C808510Vnd LIZ() {
        if (LLILLJJLI == null) {
            synchronized (C808510Vnd.class) {
                try {
                    if (LLILLJJLI == null) {
                        LLILLJJLI = new C808510Vnd();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLJJLI;
    }

    public C808510Vnd() {
        if (LLILLL == null) {
            HandlerThread handlerThread = new HandlerThread("PushThreadHandler");
            LLILLL = handlerThread;
            handlerThread.start();
        }
        this.LL = new WeakHandler(C786410Ut5.W2(LLILLL), this);
    }

    public final void LIZJ(Runnable runnable) {
        LIZIZ(0L, runnable);
    }

    public final void LIZIZ(long j, Runnable runnable) {
        if (j <= 0) {
            this.LL.post(runnable);
        } else {
            this.LL.postDelayed(runnable, j);
        }
    }
}
