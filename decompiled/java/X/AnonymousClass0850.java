package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0850, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0850 {
    public static final Handler LIZ(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                return HandlerHook.createAsync(looper);
            }
            try {
                return (Handler) AnonymousClass0851.LIZ(Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE), looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                return new BPEAHandler(looper);
            }
        }
        return new BPEAHandler(looper);
    }
}
