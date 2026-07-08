package X;

import Y.ARunnableS123S0100000_23;
import android.os.Handler;
import com.bytedance.sync.v4.compensate.CompensatorImplV4;

/* JADX INFO: renamed from: X.0prT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1527850prT {
    public final InterfaceC1527580pr2 LIZ;
    public final AbstractC1526380pp6<Handler> LIZIZ;
    public final InterfaceC1525730po3 LIZJ;
    public C1527900prY LJ;
    public boolean LJFF = true;
    public final ARunnableS123S0100000_23 LJI = new ARunnableS123S0100000_23(this, 230);
    public final String LIZLLL = "[CompensatorV4] ";

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract int LIZJ();

    public abstract boolean LIZLLL(C1527060pqC c1527060pqC);

    public final void LJ() {
        boolean z = ((CompensatorImplV4) this.LIZ).LLIZ;
        long j = (z ? this.LJ.LIZ : this.LJ.LIZIZ) * 1000;
        this.LJFF = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("next time to request: ");
        sbLIZ.append(j / 1000);
        sbLIZ.append("s");
        C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (j < 0) {
            return;
        }
        C786410Ut5.LJLIIL(j, this.LIZIZ.LIZIZ(new Object[0]), this.LJI);
    }

    public final void LJFF(C1527060pqC c1527060pqC) {
        if (LIZLLL(c1527060pqC)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append("receive data, do reset rotate");
            C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZIZ.LIZIZ(new Object[0]).removeCallbacks(this.LJI);
            LJ();
        }
    }

    public AbstractC1527850prT(InterfaceC1527580pr2 interfaceC1527580pr2, InterfaceC1525730po3 interfaceC1525730po3, AbstractC1526380pp6 abstractC1526380pp6, C1527900prY c1527900prY) {
        this.LIZ = interfaceC1527580pr2;
        this.LIZJ = interfaceC1525730po3;
        this.LIZIZ = abstractC1526380pp6;
        this.LJ = c1527900prY;
    }
}
