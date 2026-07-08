package X;

import android.os.Process;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePowerInflaterOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.18JT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18JT extends BPEAThread {
    public static final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public static final C18JT LLILZLL = new C18JT();
    public static int LLIZ = Integer.MIN_VALUE;
    public static int LLIZLLLIL = Integer.MIN_VALUE;
    public static long LLJ = Long.MIN_VALUE;
    public BlockingQueue<C0J40> LL;
    public BlockingDeque<C0J40> LLILLJJLI;
    public final C1085640eME<C0J40> LLILLL;
    public boolean LLILZ;

    public C18JT() {
        super("live_async_inflater");
        this.LL = new ArrayBlockingQueue(50);
        this.LLILLJJLI = null;
        this.LLILLL = new C1085640eME<>(50);
        this.LLILZ = false;
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("LiveAsyncLayoutInflater$InflateThread@d5e.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            try {
                int i = LLIZ;
                if (i >= -20 && i <= 19) {
                    Process.setThreadPriority(i);
                }
                LLJ = Process.myTid();
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("LiveAsyncLayoutInflater$InflateThread@d5e.run");
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    throw th2;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        while (true) {
            runInner();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r6 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void runInner() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18JT.runInner():void");
    }

    public static void LJFF(int i) {
        try {
            long j = LLJ;
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (i >= -20 && i <= 19) {
                Process.setThreadPriority((int) j, i);
            } else {
                Process.setThreadPriority((int) j, 0);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(C0J40 c0j40) {
        try {
            if (this.LLILZ) {
                BlockingDeque<C0J40> blockingDeque = this.LLILLJJLI;
                if (blockingDeque != null) {
                    if (c0j40.LJIIJJI) {
                        ((LinkedBlockingDeque) blockingDeque).offerFirst(c0j40);
                        return;
                    } else {
                        ((LinkedBlockingDeque) blockingDeque).offer(c0j40);
                        return;
                    }
                }
                this.LL.offer(c0j40);
                return;
            }
            BlockingDeque<C0J40> blockingDeque2 = this.LLILLJJLI;
            if (blockingDeque2 != null) {
                if (c0j40.LJIIJJI) {
                    ((LinkedBlockingDeque) blockingDeque2).putFirst(c0j40);
                    return;
                } else {
                    ((LinkedBlockingDeque) blockingDeque2).put(c0j40);
                    return;
                }
            }
            this.LL.put(c0j40);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }

    public final void LJ(C0J40 c0j40) {
        c0j40.LJI = null;
        c0j40.LJII = null;
        c0j40.LIZ = null;
        c0j40.LIZIZ = null;
        c0j40.LIZJ = 0;
        c0j40.LIZLLL = 0;
        c0j40.LJ = null;
        c0j40.LJIIIIZZ = null;
        c0j40.LJFF = null;
        c0j40.LJIIJ = false;
        c0j40.LJIIJJI = false;
        this.LLILLL.LIZ(c0j40);
    }

    public static C18JT LIZLLL(int i, boolean z, boolean z2) {
        if (LLILZIL.compareAndSet(false, true)) {
            if (C773150UUn.LIZJ && C773150UUn.LIZ) {
                LLIZ = C773150UUn.LIZIZ;
            } else {
                LLIZ = i;
            }
            LLIZLLLIL = i;
            if (z2) {
                C18JT c18jt = LLILZLL;
                c18jt.LLILLJJLI = new LinkedBlockingDeque();
                c18jt.LL = null;
            } else if (z) {
                LLILZLL.LL = new LinkedBlockingQueue();
            } else if (LivePowerInflaterOptSetting.enlargeCapacity()) {
                C18JT c18jt2 = LLILZLL;
                if (c18jt2.LL.remainingCapacity() != Integer.MAX_VALUE) {
                    c18jt2.LL.isEmpty();
                    c18jt2.LL = new LinkedBlockingQueue();
                }
            }
            LLILZLL.start();
        } else if (C773150UUn.LIZJ && C773150UUn.LIZ) {
            if (LLIZ != C773150UUn.LIZIZ) {
                LLIZ = C773150UUn.LIZIZ;
                LJFF(C773150UUn.LIZIZ);
            }
        } else {
            int i2 = LLIZ;
            int i3 = LLIZLLLIL;
            if (i2 != i3) {
                LLIZ = i3;
                LJFF(i3);
            }
        }
        return LLILZLL;
    }
}
