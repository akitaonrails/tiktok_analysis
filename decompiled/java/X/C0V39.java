package X;

import Y.ARunnableS18S0100100_13;
import Y.ARunnableS82S0200000_13;
import android.os.Looper;
import com.bytedance.apm.thread.ThreadWithBlockingQueue;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V39, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V39 implements C0V3D {
    public volatile ThreadWithBlockingQueue LIZ;

    public final void LIZJ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        ThreadWithBlockingQueue threadWithBlockingQueue = new ThreadWithBlockingQueue("trace-log-task-v2");
                        threadWithBlockingQueue.LIZ.start();
                        this.LIZ = threadWithBlockingQueue;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C0V3D
    public final void LIZ() {
        LIZJ();
    }

    @Override // X.C0V3D
    public final void LIZIZ(long j, ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        BPEAThread bPEAThread;
        LIZJ();
        if (j > 0) {
            C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new ARunnableS82S0200000_13(aRunnableS18S0100100_13, this, 67));
            return;
        }
        Thread threadU3 = C786410Ut5.u3();
        ThreadWithBlockingQueue threadWithBlockingQueue = this.LIZ;
        if (threadWithBlockingQueue != null) {
            bPEAThread = threadWithBlockingQueue.LIZ;
        } else {
            bPEAThread = null;
        }
        if (threadU3 == bPEAThread) {
            aRunnableS18S0100100_13.run();
            return;
        }
        ThreadWithBlockingQueue threadWithBlockingQueue2 = this.LIZ;
        if (threadWithBlockingQueue2 == null) {
            return;
        }
        threadWithBlockingQueue2.LIZ(aRunnableS18S0100100_13);
    }
}
