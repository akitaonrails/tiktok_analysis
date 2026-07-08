package X;

import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21149817pg {
    public final float LIZIZ;
    public final Function1<MotionEvent, Unit> LIZJ;
    public ARunnableS132S0100000_32 LJ;
    public MotionEvent LJFF;
    public boolean LJI;
    public long LJII;
    public float LJIIIIZZ;
    public final long LIZ = 300;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());

    public final void LIZ() {
        ARunnableS132S0100000_32 aRunnableS132S0100000_32 = this.LJ;
        if (aRunnableS132S0100000_32 != null) {
            this.LIZLLL.removeCallbacks(aRunnableS132S0100000_32);
        }
        this.LJ = null;
        MotionEvent motionEvent = this.LJFF;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.LJFF = null;
        this.LJI = false;
    }

    public C21149817pg(float f, Function1 function1) {
        this.LIZIZ = f;
        this.LIZJ = function1;
    }
}
