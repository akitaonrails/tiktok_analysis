package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0kfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328400kfm {
    public final Executor LIZ;
    public final InterfaceC1328440kfq LIZIZ;
    public final Runnable LIZJ;
    public final RunnableC1328410kfn LIZLLL;
    public final int LJ;
    public C1328480kfu LJFF;
    public int LJI;
    public EnumC1328420kfo LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZ() {
        C1328480kfu c1328480kfu;
        synchronized (this) {
            try {
                c1328480kfu = this.LJFF;
                this.LJFF = null;
                this.LJI = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1328480kfu.LIZIZ(c1328480kfu);
    }

    public final void LIZIZ() {
        C1328480kfu c1328480kfu;
        int i;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                c1328480kfu = this.LJFF;
                i = this.LJI;
                this.LJFF = null;
                this.LJI = 0;
                this.LJII = EnumC1328420kfo.RUNNING;
                this.LJIIIZ = jUptimeMillis;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            if (LJFF(c1328480kfu, i)) {
                this.LIZIZ.LIZ(c1328480kfu, i);
            }
            C1328480kfu.LIZIZ(c1328480kfu);
            LIZLLL();
        } catch (Throwable th) {
            C1328480kfu.LIZIZ(c1328480kfu);
            LIZLLL();
            throw th;
        }
    }

    public final void LIZLLL() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.LJII == EnumC1328420kfo.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.LJIIIZ + ((long) this.LJ), jUptimeMillis);
                    this.LJIIIIZZ = jUptimeMillis;
                    this.LJII = EnumC1328420kfo.QUEUED;
                    z = true;
                } else {
                    this.LJII = EnumC1328420kfo.IDLE;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LIZJ(jMax - jUptimeMillis);
        }
    }

    public final void LJ() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (LJFF(this.LJFF, this.LJI)) {
                    int iOrdinal = this.LJII.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 2) {
                            this.LJII = EnumC1328420kfo.RUNNING_AND_PENDING;
                        }
                        z = false;
                        jMax = 0;
                    } else {
                        jMax = Math.max(this.LJIIIZ + ((long) this.LJ), jUptimeMillis);
                        this.LJIIIIZZ = jUptimeMillis;
                        this.LJII = EnumC1328420kfo.QUEUED;
                        z = true;
                    }
                    if (z) {
                        LIZJ(jMax - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(long j) {
        if (j > 0) {
            if (C1328450kfr.LIZ == null) {
                C1328450kfr.LIZ = C807400Vlq.LJ();
            }
            C1328450kfr.LIZ.schedule(this.LIZLLL, j, TimeUnit.MILLISECONDS);
            return;
        }
        this.LIZLLL.run();
    }

    public static boolean LJFF(C1328480kfu c1328480kfu, int i) {
        if (!AbstractC1327820keq.LIZLLL(i) && !AbstractC1327820keq.LJIIJ(i, 4) && !C1328480kfu.LJIIZILJ(c1328480kfu)) {
            return false;
        }
        return true;
    }

    public final boolean LJI(C1328480kfu c1328480kfu, int i) {
        C1328480kfu c1328480kfu2;
        if (!LJFF(c1328480kfu, i)) {
            return false;
        }
        synchronized (this) {
            try {
                c1328480kfu2 = this.LJFF;
                this.LJFF = C1328480kfu.LIZ(c1328480kfu);
                this.LJI = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1328480kfu.LIZIZ(c1328480kfu2);
        return true;
    }

    public C1328400kfm(Executor executor, AbstractC1328430kfp abstractC1328430kfp, int i) {
        this.LIZ = executor;
        this.LIZIZ = abstractC1328430kfp;
        this.LJ = i;
        final int intPriorityValue = EnumC1331380kka.getIntPriorityValue(abstractC1328430kfp.LIZ);
        this.LIZJ = new AbstractRunnableC1328070kfF(intPriorityValue) { // from class: X.0kfl
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("JobScheduler@ce30.<init>$1");
                this.LL.LIZIZ();
                C1C7U.LIZIZ("JobScheduler@ce30.<init>$1");
            }
        };
        this.LIZLLL = new RunnableC1328410kfn(this);
        this.LJFF = null;
        this.LJI = 0;
        this.LJII = EnumC1328420kfo.IDLE;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
    }
}
