package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.084z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20595084z {
    public final Handler LIZ;

    public C20595084z() {
        Handler bPEAHandler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            bPEAHandler = HandlerHook.createAsync(mainLooper);
        } else {
            try {
                bPEAHandler = (Handler) AnonymousClass0851.LIZ(Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE), mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                bPEAHandler = new BPEAHandler(mainLooper);
            } catch (InstantiationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                bPEAHandler = new BPEAHandler(mainLooper);
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                bPEAHandler = new BPEAHandler(mainLooper);
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                bPEAHandler = new BPEAHandler(mainLooper);
            }
        }
        this.LIZ = bPEAHandler;
    }
}
