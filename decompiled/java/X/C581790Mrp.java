package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581790Mrp {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final LinkedList<RunnableC581490MrL> LIZIZ = new LinkedList<>();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(true);
    public static final C581780Mro LIZLLL = new C581780Mro();
    public static final C01GW LJ = C452501pT.LIZIZ(new C582070MsH());

    public static final void LIZ(View view) {
        AtomicBoolean atomicBoolean = LIZJ;
        if (atomicBoolean.get()) {
            AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(view, 121);
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                awS553S0100000_9.invoke();
                return;
            } else {
                C786410Ut5.LJJZZIII(LIZ, new ARunnableS103S0100000_3((Object) awS553S0100000_9, 30));
                return;
            }
        }
        if (view == null) {
            return;
        }
        LinkedList<RunnableC581490MrL> linkedList = LIZIZ;
        synchronized (linkedList) {
            try {
                if (atomicBoolean.get()) {
                    LIZ(view);
                } else {
                    linkedList.add(new RunnableC581490MrL(view));
                    BPEAHandler bPEAHandler = LIZ;
                    C581780Mro c581780Mro = LIZLLL;
                    bPEAHandler.removeCallbacks(new ARunnableS109S0100000_9(c581780Mro, 38));
                    C786410Ut5.LJLIIL(10000L, bPEAHandler, new ARunnableS109S0100000_9(c581780Mro, 38));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
