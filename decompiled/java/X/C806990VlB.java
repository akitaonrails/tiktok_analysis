package X;

import Y.ARunnableS0S2100200_13;
import com.bytedance.android.alog.Alog;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0VlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C806990VlB {
    public static ExecutorService LIZIZ;
    public final Alog LIZ;

    public C806990VlB(Alog alog, final String str) {
        this.LIZ = alog;
        LIZIZ = C807400Vlq.LIZLLL(new ThreadFactory() { // from class: X.0Vbd
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                BPEAThread bPEAThread = new BPEAThread(runnable);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Alog_instance-");
                sbLIZ.append(str);
                ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
                if (((Boolean) C296490Bjj.LIZIZ.getValue()).booleanValue()) {
                    ThreadMethodProxy.setPriority(bPEAThread, 1);
                }
                return bPEAThread;
            }
        });
    }

    public final void LIZ(String str, String str2) {
        long threadId = ALog.getThreadId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ALog.checkPrioAndTag(3, str)) {
            LIZIZ.submit(new ARunnableS0S2100200_13(this, str, str2, threadId, jCurrentTimeMillis, 0));
        }
    }
}
