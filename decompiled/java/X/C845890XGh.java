package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0XGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845890XGh {
    public static volatile C845890XGh LJIILJJIL;
    public volatile boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final PriorityBlockingQueue<InterfaceC845920XGk> LIZLLL;
    public final PriorityBlockingQueue<InterfaceC845920XGk> LJ;
    public final PriorityBlockingQueue<InterfaceC845920XGk> LJFF;
    public final C845880XGg[] LJI;
    public final C845910XGj[] LJII;
    public C845860XGe LJIIIIZZ;
    public volatile long LJIIIZ;
    public volatile long LJIIJ;
    public volatile long LJIIJJI;
    public volatile long LJIIL;
    public static final AtomicInteger LJIILIIL = new AtomicInteger();
    public static volatile boolean LJIILL = true;

    public C845890XGh() {
        this(4, true);
    }

    public final synchronized void LIZIZ() {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (LJIILL) {
            C0XFF.LIZ("RequestQueue", "handleExpandDownloadRequestQueueSize");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LJIIJ > jCurrentTimeMillis) {
                this.LJIIJ = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - this.LJIIJ <= 1000) {
                C0XFF.LIZ("RequestQueue", "handleExpandDownloadRequestQueueSize (now - mLastExpandDownloadRequestQueueTime) <= ApiThread.ENQUEUE_EXPIRE");
                return;
            }
            this.LJIIJ = jCurrentTimeMillis;
            if (this.LJII == null) {
                return;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                C845910XGj[] c845910XGjArr = this.LJII;
                if (i >= c845910XGjArr.length) {
                    break;
                }
                if (c845910XGjArr[i] == null) {
                    i2++;
                    if (i2 > this.LIZJ) {
                        break;
                    }
                    C845910XGj c845910XGj = new C845910XGj(this.LJFF);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("downloadDispatcher : ");
                    sbLIZ.append(c845910XGj.toString());
                    sbLIZ.append(" create");
                    C0XFF.LIZ("RequestQueue", C2188811AlT.LIZIZ(sbLIZ));
                    this.LJII[i] = c845910XGj;
                    c845910XGj.start();
                }
                i++;
            }
        }
    }

    public final synchronized void LIZJ() {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (LJIILL) {
            C0XFF.LIZ("RequestQueue", "handleExpandRequestQueueSize");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LJIIIZ > jCurrentTimeMillis) {
                this.LJIIIZ = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - this.LJIIIZ <= 1000) {
                C0XFF.LIZ("RequestQueue", "handleExpandRequestQueueSize (now - mLastExpandRequestQueueTime) <= ApiThread.ENQUEUE_EXPIRE");
                return;
            }
            this.LJIIIZ = jCurrentTimeMillis;
            int i = 0;
            int i2 = 0;
            while (true) {
                C845880XGg[] c845880XGgArr = this.LJI;
                if (i >= c845880XGgArr.length) {
                    break;
                }
                if (c845880XGgArr[i] == null) {
                    i2++;
                    if (i2 > this.LIZIZ) {
                        break;
                    }
                    C845880XGg c845880XGg = new C845880XGg(this.LJ, "Account-ApiDispatcher-Thread", "ApiDispatcher");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("apiDispatcher : ");
                    sbLIZ.append(c845880XGg.toString());
                    sbLIZ.append(" create");
                    C0XFF.LIZ("RequestQueue", C2188811AlT.LIZIZ(sbLIZ));
                    this.LJI[i] = c845880XGg;
                    c845880XGg.start();
                }
                i++;
            }
        }
    }

    public final synchronized void LIZLLL() {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (LJIILL) {
            C0XFF.LIZ("RequestQueue", "handleShrinkDownloadRequestQueueSize");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LJIIL > jCurrentTimeMillis) {
                this.LJIIL = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - this.LJIIL <= 2000) {
                C0XFF.LIZ("RequestQueue", "handleShrinkDownloadRequestQueueSize (now - mLastShrinkDownloadRequestQueueTime) <= ApiDispatcher.SHRINK_EXPIRE");
                return;
            }
            C845910XGj[] c845910XGjArr = this.LJII;
            if (c845910XGjArr == null) {
                return;
            }
            boolean z = true;
            boolean z2 = true;
            for (int length = c845910XGjArr.length - 1; length >= this.LIZJ; length--) {
                C845910XGj c845910XGj = this.LJII[length];
                if (c845910XGj != null) {
                    if (c845910XGj.LLILZ) {
                        z = false;
                    }
                    z2 = false;
                }
            }
            this.LJIIL = jCurrentTimeMillis;
            if (!z || z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleShrinkDownloadRequestQueueSize shouldShrink ");
                sbLIZ.append(z);
                sbLIZ.append(" allNull = ");
                sbLIZ.append(z2);
                C0XFF.LIZ("RequestQueue", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            for (int length2 = this.LJII.length - 1; length2 >= this.LIZJ; length2--) {
                try {
                    C845910XGj c845910XGj2 = this.LJII[length2];
                    if (c845910XGj2 != null && c845910XGj2.getState() != Thread.State.RUNNABLE && !c845910XGj2.LLILZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("apiDispatcher : ");
                        sbLIZ2.append(c845910XGj2.toString());
                        sbLIZ2.append(" quit");
                        C0XFF.LIZ("RequestQueue", C2188811AlT.LIZIZ(sbLIZ2));
                        c845910XGj2.LLILLL = true;
                        c845910XGj2.interrupt();
                        this.LJII[length2] = null;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    public final synchronized void LJ() {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (LJIILL) {
            C0XFF.LIZ("RequestQueue", "handleShrinkRequestQueueSize");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LJIIJJI > jCurrentTimeMillis) {
                this.LJIIJJI = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - this.LJIIJJI <= 2000) {
                C0XFF.LIZ("RequestQueue", "handleShrinkRequestQueueSize (now - mLastShrinkRequestQueueTime) <= ApiDispatcher.SHRINK_EXPIRE");
                return;
            }
            boolean z = true;
            boolean z2 = true;
            for (int length = this.LJI.length - 1; length >= this.LIZIZ; length--) {
                C845880XGg c845880XGg = this.LJI[length];
                if (c845880XGg != null) {
                    if (c845880XGg.LLILZ) {
                        z = false;
                    }
                    z2 = false;
                }
            }
            this.LJIIJJI = jCurrentTimeMillis;
            if (!z || z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleShrinkRequestQueueSize shouldShrink = ");
                sbLIZ.append(z);
                sbLIZ.append(" allNull = ");
                sbLIZ.append(z2);
                C0XFF.LIZ("RequestQueue", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            for (int length2 = this.LJI.length - 1; length2 >= this.LIZIZ; length2--) {
                try {
                    C845880XGg c845880XGg2 = this.LJI[length2];
                    if (c845880XGg2 != null && c845880XGg2.getState() != Thread.State.RUNNABLE && !c845880XGg2.LLILZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("apiDispatcher : ");
                        sbLIZ2.append(c845880XGg2.toString());
                        sbLIZ2.append(" quit");
                        C0XFF.LIZ("RequestQueue", C2188811AlT.LIZIZ(sbLIZ2));
                        c845880XGg2.LLILLL = true;
                        c845880XGg2.interrupt();
                        this.LJI[length2] = null;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    public final synchronized void LJFF() {
        LJI();
        C845860XGe c845860XGe = new C845860XGe(this.LIZLLL, this.LJ);
        this.LJIIIIZZ = c845860XGe;
        c845860XGe.start();
        for (int i = 0; i < this.LIZIZ; i++) {
            C845880XGg c845880XGg = new C845880XGg(this.LJ, "Account-ApiDispatcher-Thread", "ApiDispatcher");
            this.LJI[i] = c845880XGg;
            c845880XGg.start();
        }
        if (this.LJII != null) {
            for (int i2 = 0; i2 < this.LIZJ; i2++) {
                C845910XGj c845910XGj = new C845910XGj(this.LJFF);
                this.LJII[i2] = c845910XGj;
                c845910XGj.start();
            }
        }
        this.LIZ = true;
    }

    public final synchronized void LJI() {
        int i = 0;
        this.LIZ = false;
        C845860XGe c845860XGe = this.LJIIIIZZ;
        if (c845860XGe != null) {
            c845860XGe.LLILLL = true;
            c845860XGe.interrupt();
        }
        int i2 = 0;
        while (true) {
            C845880XGg[] c845880XGgArr = this.LJI;
            if (i2 >= c845880XGgArr.length) {
                break;
            }
            C845880XGg c845880XGg = c845880XGgArr[i2];
            if (c845880XGg != null) {
                c845880XGg.LLILLL = true;
                c845880XGg.interrupt();
                this.LJI[i2] = null;
            }
            i2++;
        }
        if (this.LJII != null) {
            while (true) {
                C845910XGj[] c845910XGjArr = this.LJII;
                if (i >= c845910XGjArr.length) {
                    break;
                }
                C845910XGj c845910XGj = c845910XGjArr[i];
                if (c845910XGj != null) {
                    c845910XGj.LLILLL = true;
                    c845910XGj.interrupt();
                    this.LJII[i] = null;
                }
                i++;
            }
        }
    }

    public static C845890XGh LIZ() {
        if (LJIILJJIL == null) {
            synchronized (C845890XGh.class) {
                try {
                    if (LJIILJJIL == null) {
                        LJIILJJIL = new C845890XGh(0, false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILJJIL;
    }

    public C845890XGh(int i, boolean z) {
        this.LIZLLL = new PriorityBlockingQueue<>();
        this.LJ = new PriorityBlockingQueue<>();
        this.LJFF = new PriorityBlockingQueue<>();
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LIZIZ = 4;
        this.LJI = new C845880XGg[16];
        if (z) {
            this.LIZJ = i;
            this.LJII = new C845910XGj[i * 4];
        }
    }
}
