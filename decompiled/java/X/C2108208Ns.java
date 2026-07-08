package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.08Ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2108208Ns {
    public static final C2238608ps LIZ = C2151808bs.LIZJ("fast-main", LIZ(Looper.getMainLooper()));
    public static final C2108308Nt LIZIZ = new AbstractC2252651DEx() { // from class: X.08Nt
        @Override // X.AbstractC2252651DEx
        public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
            return false;
        }

        @Override // X.AbstractC2252651DEx
        public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
            runnable.run();
        }
    };

    public static final Handler LIZ(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return new BPEAHandler(looper);
        }
    }
}
