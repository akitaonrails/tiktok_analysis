package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: X.18GO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GO extends BPEAThread {
    public static volatile boolean LLILZ;
    public static final C18GO LL = new C18GO();
    public static final ArrayBlockingQueue<InterfaceC21258218Hc> LLILLJJLI = new ArrayBlockingQueue<>(20);
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C18GN());
    public static final Object LLILZIL = new Object();

    public C18GO() {
        super("BtmSDK-Event-Checker");
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("EventCheckerManager@7cc4.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZJ();
            throw null;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("EventCheckerManager@7cc4.run");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th2;
            }
        }
    }

    public final void LIZJ() {
        super.run();
        try {
            Thread.sleep(C18CS.LIZ.LIZLLL().LJIIJJI());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18CE.LIZ.LJFF(1498, "EventCheckerManager#onLooperPrepared", null, e, false);
        }
        synchronized (LLILZIL) {
            try {
                LLILZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        while (true) {
            try {
                Iterator<InterfaceC21258218Hc> it2 = ((C21257018Gq) ((LinkedBlockingDeque) LLILLL.getValue()).take()).LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().check();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C18CE.LIZ.LJFF(1498, "EventCheckerManager#run", null, e2, false);
            }
        }
    }
}
