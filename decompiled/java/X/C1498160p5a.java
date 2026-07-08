package X;

import Y.ARunnableS123S0100000_23;
import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0p5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498160p5a extends AbstractC1498210p5f<C1498230p5h> {
    public InterfaceC1498290p5n LIZIZ;
    public Handler LIZJ;
    public final AtomicBoolean LIZLLL;
    public final ARunnableS123S0100000_23 LJ;
    public final ARunnableS123S0100000_23 LJFF;

    public final void LIZIZ() {
        this.LIZJ.removeCallbacks(this.LJ);
        this.LIZJ.removeCallbacks(this.LJFF);
        this.LIZLLL.set(false);
    }

    public final void LIZJ() {
        this.LIZLLL.set(true);
        this.LIZJ.removeCallbacks(this.LJ);
        C786410Ut5.LJLIIL(((C1498230p5h) this.LIZ).LIZIZ, this.LIZJ, this.LJ);
    }

    public C1498160p5a(C1498260p5k c1498260p5k) {
        super(c1498260p5k);
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new ARunnableS123S0100000_23(this, 190);
        this.LJFF = new ARunnableS123S0100000_23(this, 191);
    }

    @Override // X.AbstractC1498210p5f
    public final void LIZ(C1498240p5i c1498240p5i, WeakHandler weakHandler) {
        this.LIZIZ = c1498240p5i;
        this.LIZJ = weakHandler;
    }
}
