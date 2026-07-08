package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: X.12jT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19837312jT extends BPEAThread {
    public final Object LL;
    public final BlockingQueue<C19837212jS<?>> LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ C19837112jR LLILZ;

    public final void LIZJ() {
        while (true) {
            try {
                this.LLILZ.LJIIIZ.acquire();
                try {
                    break;
                } catch (Throwable th) {
                    LJFF();
                    throw th;
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                LIZLLL(e);
            }
        }
        int threadPriority = Process.getThreadPriority(Process.myTid());
        while (true) {
            C19837212jS<?> c19837212jSPoll = this.LLILLJJLI.poll();
            if (c19837212jSPoll != null) {
                Process.setThreadPriority(c19837212jSPoll.LLILLJJLI ? threadPriority : 10);
                c19837212jSPoll.run();
            } else {
                synchronized (this.LL) {
                    try {
                        if (this.LLILLJJLI.peek() == null) {
                            this.LLILZ.getClass();
                            try {
                                this.LL.wait(30000L);
                            } catch (InterruptedException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                LIZLLL(e2);
                            }
                        }
                    } finally {
                    }
                }
                synchronized (this.LLILZ.LJIIIIZZ) {
                    try {
                        if (this.LLILLJJLI.peek() == null) {
                            LJFF();
                            LJFF();
                            return;
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void LJ() {
        synchronized (this.LL) {
            try {
                this.LL.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        synchronized (this.LLILZ.LJIIIIZZ) {
            try {
                if (!this.LLILLL) {
                    this.LLILZ.LJIIIZ.release();
                    this.LLILZ.LJIIIIZZ.notifyAll();
                    C19837112jR c19837112jR = this.LLILZ;
                    if (this == c19837112jR.LIZJ) {
                        c19837112jR.LIZJ = null;
                    } else if (this == c19837112jR.LIZLLL) {
                        c19837112jR.LIZLLL = null;
                    } else {
                        c19837112jR.LJIILJJIL().LJFF.LIZJ("Current scheduler thread is neither worker nor network");
                    }
                    this.LLILLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("zzhk@3904.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZJ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("zzhk@3904.run");
    }

    public final void LIZLLL(InterruptedException interruptedException) {
        C19811612fK c19811612fK = this.LLILZ.LJIILJJIL().LJIIIIZZ;
        String name = getName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name);
        sbLIZ.append(" was interrupted");
        c19811612fK.LIZ(interruptedException, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19837312jT(C19837112jR c19837112jR, String str, BlockingQueue<C19837212jS<?>> blockingQueue) {
        this.LLILZ = c19837112jR;
        C0W3J.LJIIIIZZ(blockingQueue);
        this.LL = new Object();
        this.LLILLJJLI = blockingQueue;
        setName(str);
    }
}
