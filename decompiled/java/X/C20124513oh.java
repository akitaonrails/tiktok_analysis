package X;

import Y.ARunnableS130S0100000_30;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.13oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20124513oh implements InterfaceC20124913ol {
    public static volatile C20124513oh LJIIIZ;
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final Executor LIZ;
    public final C13A0 LIZIZ;
    public final C20125113on LIZJ;
    public final AtomicLong LIZLLL = new AtomicLong(0);
    public final InterfaceC20124813ok LJ;
    public final InterfaceC1974907oR LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String[] LJIIIIZZ;

    public static C20124513oh LIZIZ() {
        if (LJIIIZ == null) {
            synchronized (C20124513oh.class) {
                try {
                    if (LJIIIZ == null) {
                        LJIIIZ = new C20124613oi().LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIZ;
    }

    @Override // X.InterfaceC20124913ol
    public final void LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZLLL.get();
        C20124713oj c20124713oj = (C20124713oj) this.LJ;
        if (jElapsedRealtime >= c20124713oj.LIZIZ) {
            Runtime runtime = Runtime.getRuntime();
            if (runtime.totalMemory() - runtime.freeMemory() >= runtime.maxMemory() * c20124713oj.LIZ) {
                this.LIZ.execute(new ARunnableS130S0100000_30(this, 53));
            }
        }
    }

    public C20124513oh(InterfaceC20124813ok interfaceC20124813ok, InterfaceC1974907oR interfaceC1974907oR, boolean z, boolean z2, Executor executor) {
        C13A0 c13a0;
        this.LJ = interfaceC20124813ok;
        this.LJFF = interfaceC1974907oR;
        this.LJI = z;
        this.LJII = z2;
        this.LIZ = executor;
        synchronized (C13A0.class) {
            if (C13A0.LIZLLL == null) {
                C13A0.LIZLLL = new C13A0();
            }
            c13a0 = C13A0.LIZLLL;
        }
        this.LIZIZ = c13a0;
        this.LIZJ = C20125113on.LIZIZ();
        this.LJIIIIZZ = null;
    }
}
