package Y;

import X.C1472090oPX;
import X.C1477160oXi;
import X.C1479490obT;
import X.C1479510obV;
import X.C1480430ocz;
import X.C1C7U;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.impl.SimplifyAsyncPlayer;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S0300200_23 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1479510obV c1479510obV;
        OnUIPlayListener onUIPlayListener = ((SimplifyAsyncPlayer) this.l2).LIZIZ;
        if (onUIPlayListener == null || (c1479510obV = (C1479510obV) this.l0) == null) {
            return;
        }
        onUIPlayListener.onPreparePlay(c1479510obV.LJIIIZ);
        C1480430ocz c1480430ocz = (C1480430ocz) this.l1;
        long j = this.j3;
        c1480430ocz.LIZLLL = j;
        c1480430ocz.LJFF = j;
        c1480430ocz.LJ = this.j4;
        c1480430ocz.LJIIJ = 3;
        C1479510obV c1479510obV2 = (C1479510obV) this.l0;
        c1480430ocz.LJI = c1479510obV2.LLIIL;
        c1480430ocz.LJIILJJIL = c1479510obV2.LLJILLL;
        c1480430ocz.LJIIIIZZ = c1479510obV2.LJJJJLI;
        try {
            ((SimplifyAsyncPlayer) this.l2).LIZIZ.onPreparePlay(c1479510obV2.LJIIIZ, c1480430ocz);
        } catch (AbstractMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        }
    }

    public static final void run$0(ARunnableS0S0300200_23 aRunnableS0S0300200_23) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyAsyncPlayer@b8af.prepare$1");
        try {
            aRunnableS0S0300200_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyAsyncPlayer@b8af.prepare$1");
    }

    public static final void run$1(ARunnableS0S0300200_23 aRunnableS0S0300200_23) {
        C1479490obT c1479490obT = (C1479490obT) aRunnableS0S0300200_23.l0;
        C1480430ocz c1480430ocz = (C1480430ocz) aRunnableS0S0300200_23.l1;
        long j = aRunnableS0S0300200_23.j3;
        long j2 = aRunnableS0S0300200_23.j4;
        C1479510obV c1479510obV = (C1479510obV) aRunnableS0S0300200_23.l2;
        c1479490obT.getClass();
        C1C7U.LIZ("SimplifyPlayerImpl@37de.notifyOnPreparePlay$1L");
        if (c1479490obT.LJJIIJ != null) {
            c1480430ocz.LIZLLL = j;
            c1480430ocz.LJFF = j;
            c1480430ocz.LJ = j2;
            c1480430ocz.LJIIJ = 3;
            c1480430ocz.LJI = c1479510obV.LLIIL;
            c1480430ocz.LJIILJJIL = c1479510obV.LLJILLL;
            c1480430ocz.LJIIIIZZ = c1479510obV.LJJJJLI;
            C1477160oXi c1477160oXiLJ = c1479510obV.LJ();
            if (c1477160oXiLJ != null) {
                Object obj = c1477160oXiLJ.LIZ;
                if (obj instanceof String) {
                    c1480430ocz.LJIIIZ = Math.max(C1472090oPX.LIZ((String) obj), -1);
                }
            }
            c1479490obT.LJJIIJ.onPreparePlay(c1479510obV.LJIIIZ);
            c1479490obT.LJJIIJ.onPreparePlay(c1479510obV.LJIIIZ, c1480430ocz);
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.notifyOnPreparePlay$1L");
    }

    public ARunnableS0S0300200_23(Object obj, Object obj2, Object obj3, long j, long j2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.j3 = j;
        this.j4 = j2;
    }
}
