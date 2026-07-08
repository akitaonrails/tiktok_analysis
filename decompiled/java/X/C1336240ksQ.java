package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* JADX INFO: renamed from: X.0ksQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336240ksQ {
    public C1324720kZq LIZ;
    public C1336260ksS LIZIZ;
    public String LIZJ;
    public long LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public AnimatedDrawable2 LJIIJ;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LIZLLL = true;
    public int LJ = 1;
    public final BPEAHandler LJIIJJI = new BPEAHandler(Looper.getMainLooper());

    public final void LIZJ() {
        this.LJIIIZ = 0;
        this.LJIIL = false;
        long j = this.LJI;
        if (j > 0) {
            C786410Ut5.LJLIIL(j, this.LJIIJJI, new ARunnableS120S0100000_20(this, 267));
        }
        this.LJIILIIL = true;
    }

    public final void LIZ() {
        if (this.LJIILIIL) {
            this.LJIIL = true;
            AnimatedDrawable2 animatedDrawable2 = this.LJIIJ;
            if (C500260Jjc.LJJJI(animatedDrawable2 != null ? Boolean.valueOf(animatedDrawable2.isRunning()) : null)) {
                AnimatedDrawable2 animatedDrawable22 = this.LJIIJ;
                if (animatedDrawable22 != null) {
                    animatedDrawable22.stop();
                }
            } else {
                C1336260ksS c1336260ksS = this.LIZIZ;
                if (c1336260ksS != null) {
                    c1336260ksS.LIZ(this.LJIIIZ);
                }
            }
            AnimatedDrawable2 animatedDrawable23 = this.LJIIJ;
            if (animatedDrawable23 != null) {
                animatedDrawable23.LJ(1);
            }
            this.LJIIJJI.removeCallbacksAndMessages(null);
        }
        this.LJIILIIL = false;
    }

    public final void LIZIZ() {
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(this.LIZJ);
        c1320810kTXLIZJ.LJIIJJI = this.LIZLLL;
        c1320810kTXLIZJ.LJIIIIZZ = new C1339410kxX(this, 6);
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1324720kZq c1324720kZq = this.LIZ;
        if (c1324720kZq != null) {
            c1324720kZq.setController(abstractC1320710kTNLIZ);
            if (this.LJIIIIZZ) {
                c1324720kZq.getHierarchy().LJIJI(0);
            }
        }
    }
}
