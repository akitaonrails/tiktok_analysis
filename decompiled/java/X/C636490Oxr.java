package X;

import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Oxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636490Oxr {
    public final View LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1828));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1827));
    public final ARunnableS109S0100000_9 LJIILIIL = new ARunnableS109S0100000_9(this, 220);

    public final RunnableC636480Oxq LIZ() {
        return (RunnableC636480Oxq) this.LJIIL.getValue();
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.LJII.removeCallbacks(this.LJIILIIL);
                        return;
                    }
                    return;
                } else {
                    if (this.LJIIJ) {
                        return;
                    }
                    float x = motionEvent.getX() - this.LJIIIIZZ;
                    float y = motionEvent.getY() - this.LJIIIZ;
                    if ((x * x) + (y * y) <= ((Number) this.LJIIJJI.getValue()).intValue() * ((Number) this.LJIIJJI.getValue()).intValue()) {
                        return;
                    }
                    this.LJIIJ = true;
                    this.LJII.removeCallbacks(this.LJIILIIL);
                    this.LJII.removeCallbacks(LIZ());
                    return;
                }
            }
            if (this.LJIIJ) {
                this.LJ = 0L;
                return;
            }
            if (System.currentTimeMillis() - this.LJ < 250) {
                this.LJII.removeCallbacks(this.LJIILIIL);
                if (System.currentTimeMillis() - this.LJFF < 250) {
                    this.LJII.removeCallbacks(LIZ());
                    this.LJI = System.currentTimeMillis();
                    this.LIZJ.invoke();
                } else if (System.currentTimeMillis() - this.LJI > 250) {
                    BPEAHandler bPEAHandler = this.LJII;
                    RunnableC636480Oxq runnableC636480OxqLIZ = LIZ();
                    runnableC636480OxqLIZ.LLILZ = MotionEvent.obtain(motionEvent);
                    C786410Ut5.LJLIIL(250L, bPEAHandler, runnableC636480OxqLIZ);
                    this.LJFF = System.currentTimeMillis();
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.LJ;
                if (jCurrentTimeMillis - j < 500 || j == 0) {
                    this.LJII.removeCallbacks(this.LJIILIIL);
                    BPEAHandler bPEAHandler2 = this.LJII;
                    RunnableC636480Oxq runnableC636480OxqLIZ2 = LIZ();
                    runnableC636480OxqLIZ2.LLILZ = MotionEvent.obtain(motionEvent);
                    C786410Ut5.LJLIIL(250L, bPEAHandler2, runnableC636480OxqLIZ2);
                    this.LJFF = System.currentTimeMillis();
                }
            }
            this.LJ = 0L;
            return;
        }
        this.LJ = System.currentTimeMillis();
        LIZ().LLILLL = MotionEvent.obtain(motionEvent);
        this.LJIIIIZZ = motionEvent.getX();
        this.LJIIIZ = motionEvent.getY();
        this.LJIIJ = false;
        C786410Ut5.LJLIIL(500L, this.LJII, this.LJIILIIL);
    }

    public C636490Oxr(View view, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03) {
        this.LIZ = view;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
    }
}
