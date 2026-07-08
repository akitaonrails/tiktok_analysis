package X;

import Y.ARunnableS124S0100000_24;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593440rZG implements InterfaceC1593160rYo {
    public final int LIZ;
    public final long LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public float LJFF;
    public float LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS124S0100000_24 LJIIJJI = new ARunnableS124S0100000_24(this, 102);

    @Override // X.InterfaceC1593160rYo
    public final void LIZIZ() {
        this.LJIIIIZZ = true;
        this.LJ.removeCallbacks(this.LJIIJJI);
        this.LJIIJ = false;
        LJ();
    }

    @Override // X.InterfaceC1593160rYo
    public final void LIZ() {
        if (!this.LJIIIIZZ && !this.LJIIIZ && this.LJIIJ) {
            this.LIZJ.invoke();
            this.LJIIIZ = true;
        }
        this.LIZLLL.invoke();
        LJ();
    }

    public final void LJ() {
        this.LJ.removeCallbacks(this.LJIIJJI);
        this.LJIIJ = false;
        this.LJFF = 0.0f;
        this.LJI = 0.0f;
        this.LJII = 0L;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
    }

    @Override // X.InterfaceC1593160rYo
    public final void LIZLLL(MotionEvent motionEvent) {
        float f;
        if (!this.LJIIIIZZ && !this.LJIIIZ && this.LJIIJ) {
            float fAbs = Math.abs(motionEvent.getRawX() - this.LJFF);
            if (fAbs <= Math.abs(motionEvent.getRawY() - this.LJI)) {
                return;
            }
            long eventTime = motionEvent.getEventTime() - this.LJII;
            if (eventTime < 0) {
                eventTime = 0;
            }
            long j = this.LIZIZ;
            if (eventTime >= j) {
                f = 0.0f;
            } else {
                f = (this.LIZ * (j - eventTime)) / j;
            }
            if (fAbs > f) {
                this.LJIIIIZZ = true;
                this.LJ.removeCallbacks(this.LJIIJJI);
                this.LJIIJ = false;
            }
        }
    }

    @Override // X.InterfaceC1593160rYo
    public final void LIZJ(int i, int i2, MotionEvent motionEvent) {
        LJ();
        this.LJFF = motionEvent.getRawX();
        this.LJI = motionEvent.getRawY();
        this.LJII = motionEvent.getEventTime();
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIIJ = true;
        C786410Ut5.LJLIIL(this.LIZIZ, this.LJ, this.LJIIJJI);
    }

    public C1593440rZG(int i, long j, AwS568S0100000_24 awS568S0100000_24, AwS568S0100000_24 awS568S0100000_242) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = awS568S0100000_24;
        this.LIZLLL = awS568S0100000_242;
    }
}
