package X;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0XGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C845880XGg extends BPEAThread implements WeakHandler.IHandler {
    public static final C845890XGh LLILZLL = C845890XGh.LIZ();
    public static final AtomicInteger LLIZ = new AtomicInteger();
    public final WeakHandler LL;
    public final BlockingQueue<InterfaceC845920XGk> LLILLJJLI;
    public volatile boolean LLILLL;
    public volatile boolean LLILZ;
    public final String LLILZIL;

    public void LIZLLL() {
        this.LL.removeMessages(0);
    }

    public final void LJ() {
        String str;
        Process.setThreadPriority(10);
        while (true) {
            try {
                InterfaceC845920XGk interfaceC845920XGkTake = this.LLILLJJLI.take();
                LIZLLL();
                if (interfaceC845920XGkTake != null && (interfaceC845920XGkTake instanceof AbstractRunnableC845900XGi)) {
                    AbstractRunnableC845900XGi abstractRunnableC845900XGi = (AbstractRunnableC845900XGi) interfaceC845920XGkTake;
                    boolean zLJI = MethodIDManager.LJI(202477);
                    String str2 = null;
                    try {
                        this.LLILZ = true;
                        LIZJ(abstractRunnableC845900XGi);
                    } catch (Throwable th) {
                        th = th;
                        str = null;
                    }
                    if (abstractRunnableC845900XGi.LLILLJJLI.get()) {
                        this.LLILZ = false;
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    } else {
                        String name = C786410Ut5.u3().getName();
                        try {
                            str2 = abstractRunnableC845900XGi.LLILZIL;
                            if (!C2093608Ic.LJ(str2) && !C2093608Ic.LJ(name)) {
                                ThreadMethodProxy.setName(C786410Ut5.u3(), str2);
                            }
                            String str3 = this.LLILZIL;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("thread (inc) count: ");
                            sbLIZ.append(LLIZ.incrementAndGet());
                            C0XFF.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
                            abstractRunnableC845900XGi.run();
                            LJFF();
                        } catch (Throwable th2) {
                            th = th2;
                            str = str2;
                            str2 = name;
                            TryCatchGuardChecker.doCheck(th);
                            C0XFF.LIZLLL(6, this.LLILZIL, "processLegacyApiThread: ", th);
                            name = str2;
                            str2 = str;
                        }
                        this.LLILZ = false;
                        if (!C2093608Ic.LJ(str2) && !C2093608Ic.LJ(name)) {
                            ThreadMethodProxy.setName(C786410Ut5.u3(), name);
                        }
                        C0XFF.LIZ(this.LLILZIL, "thread (dec) count: " + LLIZ.decrementAndGet());
                        if (zLJI) {
                            MethodIDManager.LJ();
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
    public void run() {
        C1C7U.LIZ("ApiDispatcher@c4a7.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LJ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("ApiDispatcher@c4a7.run");
    }

    public void LJFF() {
        boolean zLJI = MethodIDManager.LJI(202227);
        LIZLLL();
        this.LL.sendEmptyMessageDelayed(0, 2000L);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void LIZJ(AbstractRunnableC845900XGi abstractRunnableC845900XGi) {
        abstractRunnableC845900XGi.LLILLL.removeMessages(0);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            if (message.what == 0) {
                LLILZLL.LJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C845880XGg(BlockingQueue<InterfaceC845920XGk> blockingQueue, String str, String str2) {
        super(TextUtils.isEmpty(str) ? "ApiDispatcher-Thread" : str);
        this.LL = new WeakHandler(Looper.getMainLooper(), this);
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = "ApiDispatcher";
        this.LLILLJJLI = blockingQueue;
        this.LLILZIL = str2;
    }
}
