package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2107508Nl {
    public static final C2238608ps LIZ;

    static {
        Handler bPEAHandler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            bPEAHandler = HandlerHook.createAsync(mainLooper);
        } else {
            try {
                bPEAHandler = (Handler) AnonymousClass0851.LIZ(Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE), mainLooper, null, Boolean.TRUE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                bPEAHandler = new BPEAHandler(mainLooper);
            }
        }
        LIZ = C2151808bs.LIZJ("fast-main", bPEAHandler);
    }
}
