package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802640VeA {
    public static volatile boolean LJJJI;
    public static final List<InterfaceC803550Vfd> LJJJIL = new ArrayList();
    public static int LJJJJ = 0;
    public static boolean LJJJJI = false;
    public static long LJJJJIZL = 0;
    public static long LJJJJJ = 0;
    public static long LJJJJJL = 0;
    public final File LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public boolean LJ;
    public boolean LJI;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJFF = -1;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public final AtomicBoolean LJIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILJJIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILLIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIIZILJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIJI = new AtomicBoolean(false);
    public final AtomicBoolean LJIJJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIJJLI = new AtomicBoolean(false);
    public final AtomicBoolean LJIL = new AtomicBoolean(false);
    public final AtomicBoolean LJJ = new AtomicBoolean(false);
    public final AtomicBoolean LJJI = new AtomicBoolean(false);
    public final AtomicBoolean LJJIFFI = new AtomicBoolean(false);
    public final AtomicBoolean LJJII = new AtomicBoolean(false);
    public final AtomicBoolean LJJIII = new AtomicBoolean(false);
    public final AtomicBoolean LJJIIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJJIIJZLJL = new AtomicBoolean(false);
    public final AtomicBoolean LJJIIZ = new AtomicBoolean(false);
    public final AtomicBoolean LJJIIZI = new AtomicBoolean(false);
    public final AtomicBoolean LJJIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJJIJIIJI = new AtomicBoolean(false);
    public final AtomicBoolean LJJIJIIJIL = new AtomicBoolean(false);
    public final AtomicBoolean LJJIJIL = new AtomicBoolean(false);
    public boolean LJJIJL = false;
    public final AtomicBoolean LJJIJLIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJJIL = new AtomicBoolean(false);
    public final AtomicBoolean LJJIZ = new AtomicBoolean(false);
    public final AtomicBoolean LJJJ = new AtomicBoolean(false);

    public final void finalize() {
        NativeBridge.LIZLLL(this.LIZLLL);
    }

    public final void LIZ(boolean z) {
        if (z) {
            C0VXF.post(new ARunnableS113S0100000_13(this, 23));
            return;
        }
        try {
            if (!this.LJIJJLI.compareAndSet(false, true)) {
                return;
            }
            MessageRecorder.LIZ(this.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZ("dumpLooperMessages", th);
        }
    }

    public C802640VeA(long j, C0VSJ c0vsj, boolean z) {
        this.LIZ = c0vsj;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = NativeBridge.LJI(c0vsj.getAbsolutePath());
    }
}
