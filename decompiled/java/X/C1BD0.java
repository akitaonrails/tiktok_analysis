package X;

import Y.ARunnableS134S0100000_34;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.1BD0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BD0 implements InterfaceC20533415Wi {
    public C1BD9 LIZJ;
    public volatile boolean LIZLLL;
    public long LJ;
    public boolean LJFF;
    public C1514210pVT LIZ = new C1514210pVT();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS134S0100000_34 LJI = new ARunnableS134S0100000_34(this, 54);
    public final ARunnableS134S0100000_34 LJII = new ARunnableS134S0100000_34(this, 55);

    @Override // X.InterfaceC20533415Wi
    public final void LIZIZ() {
        this.LJFF = true;
        this.LIZIZ.removeCallbacks(this.LJI);
        this.LIZIZ.removeCallbacks(this.LJII);
    }

    @Override // X.InterfaceC20533415Wi
    public final void LIZJ() {
        this.LJFF = false;
        LIZ();
    }

    public final void LIZ() {
        this.LIZIZ.removeCallbacks(this.LJI);
        this.LJ = System.currentTimeMillis();
        if (!this.LIZLLL) {
            this.LIZIZ.removeCallbacks(this.LJII);
            BPEAHandler bPEAHandler = this.LIZIZ;
            ARunnableS134S0100000_34 aRunnableS134S0100000_34 = this.LJII;
            C2200821BBo.LIZ.getClass();
            C2200821BBo.LJIIL.getClass();
            C786410Ut5.LJLIIL(2500 / ((long) 2), bPEAHandler, aRunnableS134S0100000_34);
        }
        BPEAHandler bPEAHandler2 = this.LIZIZ;
        ARunnableS134S0100000_34 aRunnableS134S0100000_342 = this.LJI;
        C2200821BBo.LIZ.getClass();
        C2200821BBo.LJIIL.getClass();
        C786410Ut5.LJLIIL(2500L, bPEAHandler2, aRunnableS134S0100000_342);
    }

    public final void LIZLLL(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update mainThread idle state: ");
        sbLIZ.append(z);
        sbLIZ.append(", source: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ.LIZ == z) {
            return;
        }
        C1514210pVT c1514210pVT = new C1514210pVT();
        c1514210pVT.LIZ = z;
        this.LIZ = c1514210pVT;
        C1BD9 c1bd9 = this.LIZJ;
        if (c1bd9 != null) {
            c1bd9.LIZ(c1514210pVT);
        }
    }
}
