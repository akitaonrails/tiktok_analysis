package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0j5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267350j5J {
    public static final String LJIIIZ = C1267350j5J.class.getSimpleName();
    public final WeakReference<C1266350j3h> LIZ;
    public final Handler LIZIZ;
    public final ARunnableS120S0100000_20 LJFF;
    public final PushBase LJI;
    public int LJII;
    public final ArrayList<Double> LIZJ = new ArrayList<>();
    public final ArrayList<C1267360j5K> LIZLLL = new ArrayList<>();
    public final ArrayList<InterfaceC1267340j5I> LJ = new ArrayList<>();
    public final StringBuilder LJIIIIZZ = new StringBuilder();

    public final void LIZ(InterfaceC1267340j5I interfaceC1267340j5I) {
        synchronized (this.LJ) {
            try {
                Iterator<InterfaceC1267340j5I> it2 = this.LJ.iterator();
                while (it2.hasNext()) {
                    if (it2.next() == interfaceC1267340j5I) {
                        return;
                    }
                }
                this.LJ.add(interfaceC1267340j5I);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(InterfaceC1267340j5I interfaceC1267340j5I) {
        synchronized (this.LJ) {
            try {
                for (InterfaceC1267340j5I interfaceC1267340j5I2 : this.LJ) {
                    if (interfaceC1267340j5I2 == interfaceC1267340j5I) {
                        this.LJ.remove(interfaceC1267340j5I2);
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1267350j5J(C1266350j3h c1266350j3h, Handler handler) {
        this.LIZ = new WeakReference<>(c1266350j3h);
        this.LJI = c1266350j3h.LLILZLL.LIZ.mPushBase;
        this.LIZIZ = handler;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 323);
        this.LJFF = aRunnableS120S0100000_20;
        C786410Ut5.LJLIIL(10000L, handler, aRunnableS120S0100000_20);
    }
}
