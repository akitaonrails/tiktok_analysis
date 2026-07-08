package X;

import Y.ARunnableS5S2200000_20;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttlivestreamer.core.engine.Transport;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0jBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1271480jBy extends Transport {
    public BPEAThread LL;
    public boolean LLILZ;
    public final /* synthetic */ C1271450jBv LLILZLL;
    public final ConcurrentLinkedQueue<Transport.c> LLILLJJLI = new ConcurrentLinkedQueue<>();
    public final Object LLILLL = new Object();
    public int LLILZIL = 0;

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public final void registerFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN) {
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public final void unRegisterFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN) {
    }

    public C1271480jBy(C1271450jBv c1271450jBv) {
        this.LLILZLL = c1271450jBv;
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public final void sendPacket(Transport.c cVar) {
        this.LLILLJJLI.offer(cVar);
        synchronized (this.LLILLL) {
            try {
                this.LLILLL.notify();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public final boolean setupUrl(String str) {
        BPEAThread bPEAThread = new BPEAThread(new ARunnableS5S2200000_20(this, str, 2));
        this.LL = bPEAThread;
        ThreadMethodProxy.setName(bPEAThread, "DumpH264Thread_");
        this.LL.start();
        return true;
    }
}
