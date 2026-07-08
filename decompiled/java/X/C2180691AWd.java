package X;

import Y.ARunnableS133S0100000_33;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180691AWd {
    public long LIZ;
    public final long LIZIZ;
    public final InterfaceC2180701AWe LIZJ;
    public final String LIZLLL;
    public long LJ;
    public long LJFF;
    public BPEAHandler LJII;
    public HandlerThread LJIIIZ;
    public volatile EnumC2180681AWc LJI = EnumC2180681AWc.INIT;
    public final ARunnableS133S0100000_33 LJIIIIZZ = new ARunnableS133S0100000_33(this, 117);

    public final void LIZ() {
        this.LJI = EnumC2180681AWc.STOP;
        Handler handlerLIZIZ = LIZIZ();
        if (handlerLIZIZ != null) {
            ARunnableS133S0100000_33 aRunnableS133S0100000_33 = this.LJIIIIZZ;
            if (aRunnableS133S0100000_33 == null) {
                aRunnableS133S0100000_33 = null;
            }
            handlerLIZIZ.removeCallbacks(aRunnableS133S0100000_33);
        }
        HandlerThread handlerThread = this.LJIIIZ;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.LJIIIZ = null;
        this.LJII = null;
    }

    public final Handler LIZIZ() {
        Looper looperW2;
        if (this.LJIIIZ == null) {
            HandlerThread handlerThread = new HandlerThread(this.LIZLLL);
            this.LJIIIZ = handlerThread;
            try {
                handlerThread.start();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (this.LJII == null) {
            HandlerThread handlerThread2 = this.LJIIIZ;
            this.LJII = (handlerThread2 == null || (looperW2 = C786410Ut5.W2(handlerThread2)) == null) ? null : new BPEAHandler(looperW2);
        }
        return this.LJII;
    }

    public final void LIZJ() {
        if (this.LJI != EnumC2180681AWc.RUNNING) {
            return;
        }
        this.LJI = EnumC2180681AWc.PAUSE;
        Handler handlerLIZIZ = LIZIZ();
        if (handlerLIZIZ != null) {
            ARunnableS133S0100000_33 aRunnableS133S0100000_33 = this.LJIIIIZZ;
            if (aRunnableS133S0100000_33 == null) {
                aRunnableS133S0100000_33 = null;
            }
            handlerLIZIZ.removeCallbacks(aRunnableS133S0100000_33);
        }
        this.LJFF = this.LJ - SystemClock.elapsedRealtime();
    }

    public final void LIZLLL() {
        if (this.LJI != EnumC2180681AWc.PAUSE) {
            return;
        }
        this.LJI = EnumC2180681AWc.RUNNING;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LJFF;
        this.LJ = jElapsedRealtime + j;
        long j2 = this.LIZ - j;
        long j3 = this.LIZIZ;
        long j4 = j3 - (j2 % j3);
        Handler handlerLIZIZ = LIZIZ();
        if (handlerLIZIZ != null) {
            ARunnableS133S0100000_33 aRunnableS133S0100000_33 = this.LJIIIIZZ;
            if (aRunnableS133S0100000_33 == null) {
                aRunnableS133S0100000_33 = null;
            }
            C786410Ut5.LJLIIL(j4, handlerLIZIZ, aRunnableS133S0100000_33);
        }
    }

    public final void LJ() {
        this.LJI = EnumC2180681AWc.RUNNING;
        InterfaceC2180701AWe interfaceC2180701AWe = this.LIZJ;
        if (interfaceC2180701AWe != null) {
            interfaceC2180701AWe.onStart();
        }
        if (this.LIZ <= 0) {
            this.LJI = EnumC2180681AWc.FINISH;
            InterfaceC2180701AWe interfaceC2180701AWe2 = this.LIZJ;
            if (interfaceC2180701AWe2 != null) {
                interfaceC2180701AWe2.LIZLLL();
                return;
            }
            return;
        }
        this.LJ = SystemClock.elapsedRealtime() + this.LIZ;
        Handler handlerLIZIZ = LIZIZ();
        if (handlerLIZIZ != null) {
            ARunnableS133S0100000_33 aRunnableS133S0100000_33 = this.LJIIIIZZ;
            if (aRunnableS133S0100000_33 == null) {
                aRunnableS133S0100000_33 = null;
            }
            C786410Ut5.LJJZZIII(handlerLIZIZ, aRunnableS133S0100000_33);
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("countDownAction handler: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(" isMainLooper: ");
        sbLIZ.append(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
    }

    public C2180691AWd(long j, long j2, InterfaceC2180701AWe interfaceC2180701AWe, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = interfaceC2180701AWe;
        this.LIZLLL = str;
    }
}
