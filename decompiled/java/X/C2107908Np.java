package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.08Np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2107908Np {
    public static final C2238608ps LIZ;

    static {
        Handler bPEAHandler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            bPEAHandler = (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
        } else {
            try {
                bPEAHandler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                bPEAHandler = new BPEAHandler(mainLooper);
            }
        }
        LIZ = C2151808bs.LIZJ("fast-main", bPEAHandler);
        new AbstractC2252651DEx() { // from class: X.08Nq
            @Override // X.AbstractC2252651DEx
            public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
                return false;
            }

            @Override // X.AbstractC2252651DEx
            public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
                runnable.run();
            }
        };
    }
}
