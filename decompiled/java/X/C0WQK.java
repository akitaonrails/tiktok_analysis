package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0WQK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQK {
    public static final C0WQL LIZ;

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0WQL] */
    static {
        Handler bPEAHandler;
        final C0WQH c0wqh = C0WQJ.LIZIZ;
        new AbstractC2252651DEx(c0wqh) { // from class: X.0WQL
            public final ExecutorService LL;

            {
                this.LL = c0wqh;
            }

            @Override // X.AbstractC23273099z, kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                return super.plus(coroutineContext);
            }

            @Override // X.AbstractC2252651DEx
            public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
                this.LL.execute(runnable);
            }
        };
        final C0WQH c0wqh2 = C0WQJ.LIZJ;
        new AbstractC2252651DEx(c0wqh2) { // from class: X.0WQL
            public final ExecutorService LL;

            {
                this.LL = c0wqh2;
            }

            @Override // X.AbstractC23273099z, kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                return super.plus(coroutineContext);
            }

            @Override // X.AbstractC2252651DEx
            public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
                this.LL.execute(runnable);
            }
        };
        final C0WQH c0wqh3 = C0WQJ.LIZ;
        LIZ = new AbstractC2252651DEx(c0wqh3) { // from class: X.0WQL
            public final ExecutorService LL;

            {
                this.LL = c0wqh3;
            }

            @Override // X.AbstractC23273099z, kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                return super.plus(coroutineContext);
            }

            @Override // X.AbstractC2252651DEx
            public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
                this.LL.execute(runnable);
            }
        };
        final C0WQH c0wqh4 = C0WQJ.LIZLLL;
        new AbstractC2252651DEx(c0wqh4) { // from class: X.0WQL
            public final ExecutorService LL;

            {
                this.LL = c0wqh4;
            }

            @Override // X.AbstractC23273099z, kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                return super.plus(coroutineContext);
            }

            @Override // X.AbstractC2252651DEx
            public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
                this.LL.execute(runnable);
            }
        };
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            bPEAHandler = HandlerHook.createAsync(mainLooper);
        } else {
            try {
                bPEAHandler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                bPEAHandler = new BPEAHandler(mainLooper);
            }
        }
        C2151808bs.LIZJ("fast-main-account", bPEAHandler);
    }
}
