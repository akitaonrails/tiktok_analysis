package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.16Cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20737716Cx extends BPEAThread {
    public final BlockingQueue<C16D0> LL = new LinkedBlockingQueue();
    public final /* synthetic */ AbstractRunnableC20737316Ct LLILLJJLI;

    public final void LIZLLL() {
        C16D0 c16d0;
        while (true) {
            try {
                try {
                    c16d0 = (C16D0) ((LinkedBlockingQueue) this.LL).take();
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C786410Ut5.u3().interrupt();
                    return;
                }
            } catch (LinkageError e2) {
                e = e2;
                c16d0 = null;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLJ.error("Got fatal error in worker thread {}", getName());
                this.LLILLJJLI.LJJIIJZLJL(c16d0, new Exception(e));
                return;
            } catch (ThreadDeath e3) {
                e = e3;
                c16d0 = null;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLJ.error("Got fatal error in worker thread {}", getName());
                this.LLILLJJLI.LJJIIJZLJL(c16d0, new Exception(e));
                return;
            } catch (VirtualMachineError e4) {
                e = e4;
                c16d0 = null;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLJ.error("Got fatal error in worker thread {}", getName());
                this.LLILLJJLI.LJJIIJZLJL(c16d0, new Exception(e));
                return;
            } catch (Throwable th) {
                th = th;
                c16d0 = null;
            }
            try {
                LIZJ(c16d0, (ByteBuffer) ((LinkedBlockingQueue) c16d0.LLILLL).poll());
            } catch (LinkageError e5) {
                e = e5;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLJ.error("Got fatal error in worker thread {}", getName());
                this.LLILLJJLI.LJJIIJZLJL(c16d0, new Exception(e));
                return;
            } catch (ThreadDeath e6) {
                e = e6;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLJ.error("Got fatal error in worker thread {}", getName());
                this.LLILLJJLI.LJJIIJZLJL(c16d0, new Exception(e));
                return;
            } catch (VirtualMachineError e7) {
                e = e7;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLJ.error("Got fatal error in worker thread {}", getName());
                this.LLILLJJLI.LJJIIJZLJL(c16d0, new Exception(e));
                return;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                this.LLILLJJLI.LLJ.error("Uncaught exception in thread {}: {}", getName(), th);
                if (c16d0 != null) {
                    this.LLILLJJLI.LJJIJ(new Exception(th));
                    c16d0.close();
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZLLL();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
    }

    public C20737716Cx(AbstractRunnableC20737316Ct abstractRunnableC20737316Ct) {
        this.LLILLJJLI = abstractRunnableC20737316Ct;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WebSocketWorker-");
        sbLIZ.append(getId());
        setName(C2188811AlT.LIZIZ(sbLIZ));
        setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.16Cy
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.LIZ.LLILLJJLI.LLJ.error("Uncaught exception in thread {}: {}", thread.getName(), th);
            }
        });
    }

    public final void LIZJ(C16D0 c16d0, ByteBuffer byteBuffer) {
        try {
            try {
                c16d0.LJI(byteBuffer);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLJ.error("Error while reading from remote connection", (Throwable) e);
            }
            this.LLILLJJLI.LJJIJLIJ(byteBuffer);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJJIJLIJ(byteBuffer);
            throw th;
        }
    }
}
