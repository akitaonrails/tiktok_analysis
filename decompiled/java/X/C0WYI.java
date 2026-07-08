package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0WYI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WYI {
    public long LIZ;
    public final List<RunnableC830100WhM> LIZIZ = Collections.synchronizedList(new ArrayList());

    public final void LIZ(RunnableC830100WhM runnableC830100WhM) {
        this.LIZIZ.remove(runnableC830100WhM);
    }

    public final void LIZIZ(RunnableC830100WhM runnableC830100WhM) {
        this.LIZ++;
        BPEAThread bPEAThread = new BPEAThread(runnableC830100WhM);
        bPEAThread.setDaemon(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NanoHttpd Request Processor (#");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(")");
        ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.add(runnableC830100WhM);
        bPEAThread.start();
    }
}
