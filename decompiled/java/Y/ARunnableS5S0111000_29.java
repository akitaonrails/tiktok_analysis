package Y;

import X.C12G1;
import X.C12GK;
import X.C19372210qe;
import X.C19372310qf;
import X.C1C7U;
import X.C497820Jfg;
import X.C786410Ut5;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS5S0111000_29 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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
        if (this.z1) {
            RecyclerView recyclerView = ((C12G1) this.l0).LLJJJIL;
            (recyclerView != null ? recyclerView : null).smoothScrollToPosition(this.i2);
            return;
        }
        int iLIZIZ = C497820Jfg.LIZIZ(((C12G1) this.l0).requireSceneContext());
        int i = C12GK.LLJILJIL;
        int i2 = (iLIZIZ - C12GK.LLJILLL) / 2;
        RecyclerView recyclerView2 = ((C12G1) this.l0).LLJJJIL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.scrollToPosition(this.i2);
        RecyclerView recyclerView3 = ((C12G1) this.l0).LLJJJIL;
        ((LinearLayoutManager) (recyclerView3 != null ? recyclerView3 : null).getLayoutManager()).scrollToPositionWithOffset(this.i2, i2);
    }

    public final void LIZ$1() {
        C19372310qf c19372310qf = (C19372310qf) this.l0;
        boolean z = this.z1;
        int i = this.i2;
        boolean z2 = z && i >= c19372310qf.LIZ.triggerLevel;
        C19372210qe c19372210qe = c19372310qf.LJFF;
        if (c19372210qe != null) {
            if (!z2) {
                c19372310qf.LIZ();
                return;
            }
            c19372210qe.LIZIZ = i;
            if (i > c19372210qe.LIZJ) {
                c19372210qe.LIZJ = i;
                return;
            }
            return;
        }
        if (z2) {
            c19372310qf.LJFF = new C19372210qe(SystemClock.elapsedRealtime(), i, i);
            C786410Ut5.LJJZZIII(c19372310qf.LIZJ, c19372310qf.LJI);
            long j = c19372310qf.LIZ.timeoutMs;
            if (j > 0) {
                C786410Ut5.LJLIIL(j, c19372310qf.LIZJ, c19372310qf.LJII);
            }
        }
    }

    public static final void run$0(ARunnableS5S0111000_29 aRunnableS5S0111000_29) {
        boolean zLIZ;
        C1C7U.LIZ("ImageEditThumbnailScene@6a71.scrollToPosition$1");
        try {
            aRunnableS5S0111000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageEditThumbnailScene@6a71.scrollToPosition$1");
    }

    public static final void run$1(ARunnableS5S0111000_29 aRunnableS5S0111000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AnrLevelSamplingManager@b94c.start$1$onAnrChange$1");
        try {
            aRunnableS5S0111000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnrLevelSamplingManager@b94c.start$1$onAnrChange$1");
    }

    public ARunnableS5S0111000_29(Object obj, boolean z, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.z1 = z;
        this.i2 = i;
    }
}
