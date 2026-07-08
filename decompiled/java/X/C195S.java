package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS6S0600000_32;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.195S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C195S extends AbstractC214793194d {
    public final ARunnableS132S0100000_32 LJ = new ARunnableS132S0100000_32(this, 79);
    public final ArrayList<C195T> LJFF;
    public final BPEAHandler LJI;
    public boolean LJII;
    public ARunnableS6S0600000_32 LJIIIIZZ;

    public abstract void LJIIL(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY);

    public abstract void LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY);

    public C195S() {
        new ARunnableS128S0100000_28(this, 99);
        this.LJFF = new ArrayList<>();
        new ArrayList();
        this.LJI = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.AbstractC214793194d
    public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        LJIIL(c214795194f, c214795194f2, runnable, c1447920nmY);
    }

    @Override // X.AbstractC214793194d
    public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        if (this.LJII) {
            ARunnableS101S0200000_32 aRunnableS101S0200000_32 = new ARunnableS101S0200000_32(this, runnable, 51);
            View view = c214795194f2.LIZIZ;
            C786410Ut5.LJLLLLLL(4, view);
            this.LJIIIIZZ = new ARunnableS6S0600000_32(view, c214795194f, c214795194f2, c1447920nmY, this, aRunnableS101S0200000_32, 1);
            return;
        }
        LJIILIIL(c214795194f, c214795194f2, runnable, c1447920nmY);
    }
}
