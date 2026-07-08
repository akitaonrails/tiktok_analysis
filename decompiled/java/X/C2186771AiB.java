package X;

import Y.ARunnableS133S0100000_33;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1AiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186771AiB {
    public final C1701370uNL LIZ;
    public C2186941AiS LIZIZ;
    public final C2186791AiD LIZJ;
    public BPEAHandler LIZLLL;
    public C2186951AiT LJ;
    public volatile boolean LJFF;
    public final BPEAHandler LJII;
    public boolean LJI = true;
    public C2186981AiW LJIIIIZZ = new C2186981AiW();
    public final ARunnableS133S0100000_33 LJIIIZ = new ARunnableS133S0100000_33(this, 88);
    public final ARunnableS133S0100000_33 LJIIJ = new ARunnableS133S0100000_33(this, 89);
    public final ARunnableS133S0100000_33 LJIIJJI = new ARunnableS133S0100000_33(this, 90);
    public final ARunnableS133S0100000_33 LJIIL = new ARunnableS133S0100000_33(this, 91);
    public final RunnableC2186811AiF LJIILIIL = new RunnableC2186811AiF(this);
    public final ARunnableS133S0100000_33 LJIILJJIL = new ARunnableS133S0100000_33(this, 92);

    public C2186771AiB() {
        C21147817pM.LIZ();
        if (C1701370uNL.LJ == null) {
            C1701370uNL.LJ = new C1701370uNL();
        }
        this.LIZ = C1701370uNL.LJ;
        C2186791AiD c2186791AiD = new C2186791AiD();
        this.LIZJ = c2186791AiD;
        c2186791AiD.LJFF = this.LJIIIIZZ;
        this.LJII = new BPEAHandler();
    }

    public final void LIZ(Exception exc) {
        BPEAHandler bPEAHandler = this.LIZLLL;
        if (bPEAHandler != null) {
            bPEAHandler.obtainMessage(R.id.zxing_camera_error, exc).sendToTarget();
        }
    }
}
