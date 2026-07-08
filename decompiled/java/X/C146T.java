package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: renamed from: X.146T, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C146T {
    public static InterfaceC202116146o LIZJ;
    public static File LJ;
    public static volatile BPEAHandler LJFF;
    public static final C146T LIZ = new C146T();
    public static C146W LIZIZ = new C146W(0, 30000, false, false, 0);
    public static final HashSet<String> LIZLLL = new HashSet<>();

    public final Handler LIZ() {
        if (LJFF == null) {
            synchronized (this) {
                try {
                    if (LJFF == null) {
                        HandlerThread handlerThread = new HandlerThread("Attribution");
                        handlerThread.start();
                        LJFF = new BPEAHandler(C786410Ut5.W2(handlerThread));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }
}
