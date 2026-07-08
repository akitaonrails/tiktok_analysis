package X;

import Y.AObjectS73S0000000_23;
import Y.ARunnableS98S0000000_23;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476410oWV {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static C1476420oWW LIZLLL;
    public static final BPEAHandler LJFF;
    public static final C1476410oWV LIZ = new C1476410oWV();
    public static final C01GW LJ = C452501pT.LIZIZ(new AObjectS73S0000000_23(1));

    public final synchronized void LIZIZ() {
        if (LIZIZ) {
            return;
        }
        BPEAHandler bPEAHandler = LJFF;
        bPEAHandler.removeCallbacks((Runnable) LJ.getValue());
        if (Intrinsics.LJFF(bPEAHandler.getLooper().getThread(), C786410Ut5.u3())) {
            C805420Vie.LIZ.LJJJLZIJ(true);
            C0NBW.LIZIZ().getClass();
            C0NBW.LIZJ();
        } else {
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS98S0000000_23(2));
        }
        bPEAHandler.getLooper().quitSafely();
        LIZIZ = true;
    }

    static {
        BPEAHandler bPEAHandler;
        try {
            HandlerThread handlerThread = new HandlerThread("NativeStrategyCenterLibsLoad");
            handlerThread.start();
            bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        }
        LJFF = bPEAHandler;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oWW] */
    public static final void LIZ() {
        if (LIZJ) {
            return;
        }
        LIZLLL = new InterfaceC583260MuC() { // from class: X.0oWW
            @Override // X.InterfaceC583260MuC
            public final List<String> LIZ() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("live_first_render");
                arrayList.add("PlayerCallback_FIRST_FRAME");
                return arrayList;
            }

            @Override // X.InterfaceC583260MuC
            public final void LIZIZ(Object obj, String str) {
                if (Intrinsics.LJFF(str, "live_first_render") || Intrinsics.LJFF(str, "PlayerCallback_FIRST_FRAME")) {
                    C1476410oWV.LIZ.LIZIZ();
                }
            }
        };
        C589720NBa.LIZ = true;
        C0NBW.LIZIZ().LIZLLL(LIZLLL);
        C786410Ut5.LJLIIL(((Number) C1474810oTv.g4.getValue()).longValue(), LJFF, new ARunnableS98S0000000_23(1));
        LIZJ = true;
    }
}
