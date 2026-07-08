package X;

import Y.AObjectS392S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ei6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099200ei6 {
    public final Handler LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public boolean LIZLLL;
    public boolean LJI;
    public final LinkedList<Pair<Function0<Unit>, Long>> LJ = new LinkedList<>();
    public final ARunnableS117S0100000_17 LJFF = new ARunnableS117S0100000_17(this, 214);
    public boolean LJII = true;

    public final void LIZ() {
        this.LIZ.removeCallbacks(this.LJFF);
        this.LIZLLL = false;
        Pair<Function0<Unit>, Long> pairPeek = this.LJ.peek();
        if (pairPeek == null || this.LJI) {
            LIZIZ(true);
            return;
        }
        this.LJ.pop();
        LIZJ(pairPeek.getSecond(), pairPeek.getFirst());
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            if (!this.LJII && !this.LJI) {
                this.LJII = true;
                this.LIZJ.invoke();
                return;
            }
            return;
        }
        if (!this.LJII) {
            return;
        }
        this.LJII = false;
        this.LIZIZ.invoke();
    }

    public final void LIZJ(Long l, Function0 function0) {
        LIZIZ(false);
        if (!this.LIZLLL && !this.LJI) {
            this.LIZLLL = true;
            if (l != null) {
                C786410Ut5.LJLIIL(l.longValue(), this.LIZ, this.LJFF);
            }
            function0.invoke();
            return;
        }
        this.LJ.offer(new Pair<>(function0, l));
    }

    public C1099200ei6(BPEAHandler bPEAHandler, AObjectS392S0100000_17 aObjectS392S0100000_17, AObjectS392S0100000_17 aObjectS392S0100000_172) {
        this.LIZ = bPEAHandler;
        this.LIZIZ = aObjectS392S0100000_17;
        this.LIZJ = aObjectS392S0100000_172;
    }
}
