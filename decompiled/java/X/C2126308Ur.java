package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2126308Ur {
    public static final C2126408Us LIZ;
    public static final C2126408Us LIZIZ;
    public static final C2126408Us LIZJ;
    public static final C2126408Us LIZLLL;
    public static final C2126408Us LJ;
    public static final C2238608ps LJFF;

    static {
        Handler bPEAHandler;
        C2125908Un c2125908Un = C2126208Uq.LIZ;
        LIZ = new C2126408Us(c2125908Un);
        LIZIZ = new C2126408Us(c2125908Un);
        LIZJ = new C2126408Us(C2126208Uq.LJ);
        new C2126408Us(C2126208Uq.LIZJ);
        LIZLLL = new C2126408Us(C2126208Uq.LIZIZ);
        LJ = new C2126408Us(C2126208Uq.LIZLLL);
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
        LJFF = C2151808bs.LIZJ("fast-main", bPEAHandler);
    }
}
