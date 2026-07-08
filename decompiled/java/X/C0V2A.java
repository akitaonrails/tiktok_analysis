package X;

import Y.ARunnableS82S0200000_13;
import android.os.SystemClock;
import android.view.Window;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V2A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2A {
    public static boolean LJIILJJIL;
    public final String LIZ;
    public volatile boolean LIZIZ;
    public C0V22 LIZJ;
    public InterfaceC791210V1z LIZLLL;
    public C0V2B LJ;
    public final C0V29 LJFF;
    public ChoreographerFrameCallbackC854650Xfr LJI;
    public LinkedList<Integer> LJII;
    public final boolean LJIIIZ;
    public final HashMap<String, String> LJIIIIZZ = new HashMap<>();
    public long LJIIJJI = -1;
    public long LJIIL = -1;
    public int LJIILIIL = 0;
    public final JSONObject LJIIJ = null;

    public final synchronized void LJI() {
        C0V29 c0v29 = this.LJFF;
        if (c0v29 != null) {
            c0v29.LIZLLL();
        } else {
            LIZ();
            C314640CVa.LIZLLL(this.LIZ);
        }
    }

    public final void LIZ() {
        int i;
        if (this.LIZIZ) {
            long j = this.LJIIL - this.LJIIJJI;
            if (j > 0 && (i = this.LJIILIIL) > 1) {
                long j2 = (((((long) (i - 1)) * 1000) * 1000) * 1000) / j;
                C0V22 c0v22 = this.LIZJ;
                if (c0v22 != null) {
                    c0v22.LIZIZ(j2);
                }
                C790990V1d c790990V1d = C791020V1g.LIZ;
                HashMap<String, String> map = this.LJIIIIZZ;
                c790990V1d.getClass();
                C787900UvU.LIZ.LIZJ(new RunnableC791000V1e(c790990V1d, this.LIZ, map, j2));
            }
            if (this.LJI != null) {
                C786410Ut5.v2().removeFrameCallback(this.LJI);
            }
            synchronized (this) {
                try {
                    if (!this.LJII.isEmpty()) {
                        LinkedList<Integer> linkedList = this.LJII;
                        this.LJII = new LinkedList<>();
                        C787900UvU.LIZ.LIZJ(new ARunnableS82S0200000_13(this, linkedList, 78));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZIZ = false;
        }
    }

    public final boolean LIZIZ() {
        if (C792400V6o.LJIJI) {
            return C790620Uzs.LIZIZ("fps_drop", this.LIZ) || C790620Uzs.LIZIZ("fps", this.LIZ);
        }
        return false;
    }

    public final void LJFF() {
        final C0V29 c0v29 = this.LJFF;
        if (c0v29 != null) {
            if (c0v29.LIZIZ) {
                return;
            }
            if (c0v29.LJIIJJI || c0v29.LIZJ()) {
                C791390V2r c791390V2r = C791390V2r.LJJIII;
                if (!c791390V2r.LJIJ) {
                    c791390V2r.LJ(C0V29.LJIILJJIL);
                }
                if (C0V29.LJIILJJIL != null) {
                    c0v29.LIZIZ = true;
                    final C0V23 c0v23 = C0V29.LJIILJJIL;
                    c0v23.getClass();
                    c791390V2r.LJIILIIL.LIZ(new Runnable() { // from class: X.0V27
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FrameTracer@3850.addFpsTracer$1");
                            try {
                                c0v23.LLILLJJLI.add(c0v29);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FrameTracer@3850.addFpsTracer$1");
                        }
                    });
                }
                C314640CVa.LIZ(c0v29.LIZ);
                SystemClock.uptimeMillis();
                c0v29.LIZIZ = true;
                return;
            }
            return;
        }
        if (this.LIZIZ) {
            return;
        }
        if (this.LJIIIZ || LIZIZ()) {
            synchronized (this) {
                try {
                    this.LJII.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LJIIJJI = -1L;
            this.LJIIL = -1L;
            this.LJIILIIL = 0;
            this.LJI = new ChoreographerFrameCallbackC854650Xfr(this, 2);
            try {
                C786410Ut5.v2().postFrameCallback(this.LJI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ = false;
                this.LJIIJJI = -1L;
                this.LJIIL = -1L;
                this.LJIILIIL = 0;
                this.LJI = null;
            }
            C314640CVa.LIZ(this.LIZ);
            this.LIZIZ = true;
        }
    }

    public final void LIZJ(InterfaceC791210V1z interfaceC791210V1z) {
        C0V29 c0v29 = this.LJFF;
        if (c0v29 != null) {
            c0v29.LJ = interfaceC791210V1z;
        }
        this.LIZLLL = interfaceC791210V1z;
    }

    public final void LIZLLL(C0V22 c0v22) {
        C0V29 c0v29 = this.LJFF;
        if (c0v29 != null) {
            c0v29.LIZLLL = c0v22;
        }
        this.LIZJ = c0v22;
    }

    public final void LJ(Window window) {
        C0V29 c0v29 = this.LJFF;
        if (c0v29 != null) {
            c0v29.LJIIJ = window;
            if (window != null) {
                C791390V2r c791390V2r = C791390V2r.LJJIII;
                if (!c791390V2r.LJIILLIIL.containsKey(window)) {
                    Window window2 = c0v29.LJIIJ;
                    try {
                        window2.setCallback(new C791420V2u(c791390V2r, window2.getCallback(), window2));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    c791390V2r.LIZJ(c0v29.LJIIJ, ActivityLifeObserver.getInstance().getTopActivityClassName());
                    c791390V2r.LJFF();
                }
            }
        }
    }

    public C0V2A(String str, boolean z) {
        if (LJIILJJIL) {
            this.LJFF = new C0V29(str, z);
            return;
        }
        this.LIZ = str;
        this.LJIIIZ = z;
        this.LJII = new LinkedList<>();
    }
}
