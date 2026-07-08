package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: X.0XGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845860XGe extends BPEAThread {
    public final BlockingQueue<InterfaceC845920XGk> LL;
    public final BlockingQueue<InterfaceC845920XGk> LLILLJJLI;
    public volatile boolean LLILLL;

    public final void LIZJ() {
        AbstractRunnableC845900XGi abstractRunnableC845900XGi;
        Process.setThreadPriority(10);
        while (true) {
            try {
                InterfaceC845920XGk interfaceC845920XGkTake = this.LL.take();
                if ((interfaceC845920XGkTake instanceof AbstractRunnableC845900XGi) && (abstractRunnableC845900XGi = (AbstractRunnableC845900XGi) interfaceC845920XGkTake) != null) {
                    String name = C786410Ut5.u3().getName();
                    String str = abstractRunnableC845900XGi.LLILZIL;
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C0XFF.LIZLLL(6, "ApiLocalDispatcher", "run: ", th);
                    }
                    if (!abstractRunnableC845900XGi.LLILLJJLI.get()) {
                        if (!C2093608Ic.LJ(str) && !C2093608Ic.LJ(name)) {
                            Thread threadU3 = C786410Ut5.u3();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ApiLocalDispatcher-");
                            sbLIZ.append(str);
                            ThreadMethodProxy.setName(threadU3, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        TTAccountInit.LIZ().getClass();
                        if (abstractRunnableC845900XGi.LLILZLL == EnumC845870XGf.IMMEDIATE) {
                            RunnableC823120WQs.LIZIZ(abstractRunnableC845900XGi);
                        } else {
                            abstractRunnableC845900XGi.LLILLL.removeMessages(0);
                            abstractRunnableC845900XGi.LLILLL.sendEmptyMessageDelayed(0, 1000L);
                            this.LLILLJJLI.add(abstractRunnableC845900XGi);
                        }
                        if (!C2093608Ic.LJ(str) && !C2093608Ic.LJ(name)) {
                            ThreadMethodProxy.setName(C786410Ut5.u3(), name);
                        }
                    }
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LLILLL) {
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("ApiLocalDispatcher@ebc3.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZJ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("ApiLocalDispatcher@ebc3.run");
    }

    public C845860XGe(BlockingQueue<InterfaceC845920XGk> blockingQueue, BlockingQueue<InterfaceC845920XGk> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.LL = blockingQueue;
        this.LLILLJJLI = blockingQueue2;
    }
}
