package X;

import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.b;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0jd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288320jd8 extends b {
    public Choreographer LIZ;
    public List<InterfaceC1285170jY3> LIZIZ;
    public List<InterfaceC1285170jY3> LIZJ;
    public ChoreographerFrameCallbackC1339260kxI LIZLLL;
    public long LJFF;
    public boolean LJII;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public long LJ = 16666666;
    public final long LJI = 100;
    public final Object LJIIIIZZ = new Object();

    @Override // a17.a0
    public final void onDestroy() {
        Choreographer choreographer = this.LIZ;
        if (choreographer == null) {
            choreographer = null;
        }
        ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI = this.LIZLLL;
        if (choreographerFrameCallbackC1339260kxI == null) {
            choreographerFrameCallbackC1339260kxI = null;
        }
        choreographer.removeFrameCallback(choreographerFrameCallbackC1339260kxI);
        List<InterfaceC1285170jY3> list = this.LIZIZ;
        (list != null ? list : null).clear();
    }

    @Override // a17.a0
    public final void onPause() {
        synchronized (this.LJIIIIZZ) {
            try {
                if (this.LJII) {
                    return;
                }
                this.LJII = true;
                Choreographer choreographer = this.LIZ;
                if (choreographer == null) {
                    choreographer = null;
                }
                ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI = this.LIZLLL;
                choreographer.removeFrameCallback(choreographerFrameCallbackC1339260kxI != null ? choreographerFrameCallbackC1339260kxI : null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // a17.a0
    public final void onResume() {
        synchronized (this.LJIIIIZZ) {
            try {
                if (this.LJII) {
                    this.LJII = false;
                    Choreographer choreographer = this.LIZ;
                    if (choreographer == null) {
                        choreographer = null;
                    }
                    ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI = this.LIZLLL;
                    choreographer.postFrameCallback(choreographerFrameCallbackC1339260kxI != null ? choreographerFrameCallbackC1339260kxI : null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.lynx.canvas.b
    public final void LIZ(C1288360jdC c1288360jdC) {
        List<InterfaceC1285170jY3> list = this.LIZJ;
        if (list == null) {
            list = null;
        }
        list.add(c1288360jdC);
    }

    @Override // com.lynx.canvas.b
    public final void LIZIZ(InterfaceC1285170jY3 interfaceC1285170jY3) {
        List<InterfaceC1285170jY3> list = this.LIZIZ;
        if (list == null) {
            list = null;
        }
        list.add(interfaceC1285170jY3);
    }

    @Override // com.lynx.canvas.b
    public final void LIZJ(long j) {
        this.LJIIIZ = true;
        this.LJ = 1000000000 / j;
        this.LJFF = 0L;
    }

    @Override // a17.a0
    public final void onBootstrap(KryptonApp kryptonApp) {
        super.onBootstrap(kryptonApp);
        this.LIZLLL = new ChoreographerFrameCallbackC1339260kxI(this, 0);
        this.LIZ = C786410Ut5.v2();
        this.LIZIZ = new LinkedList();
        this.LIZJ = new LinkedList();
        Choreographer choreographer = this.LIZ;
        ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI = null;
        if (choreographer == null) {
            choreographer = null;
        }
        ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI2 = this.LIZLLL;
        if (choreographerFrameCallbackC1339260kxI2 != null) {
            choreographerFrameCallbackC1339260kxI = choreographerFrameCallbackC1339260kxI2;
        }
        choreographer.postFrameCallback(choreographerFrameCallbackC1339260kxI);
    }
}
