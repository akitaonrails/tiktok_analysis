package Y;

import X.C1C7U;
import X.C418440Gaw;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS21S0110000_2 implements Runnable {
    public final int $t;
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

    public static final void run$0(ARunnableS21S0110000_2 aRunnableS21S0110000_2) {
        boolean zLIZ;
        C1C7U.LIZ("FullScreenScene@1492.showSaveBtn$4$1");
        try {
            if (aRunnableS21S0110000_2.z1) {
                ((TuxIconView) aRunnableS21S0110000_2.l0).animate().translationY(C418440Gaw.LIZIZ(40)).setDuration(250L).start();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullScreenScene@1492.showSaveBtn$4$1");
    }

    public static final void run$1(ARunnableS21S0110000_2 aRunnableS21S0110000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ViewKTXKt@ddfb.fadeTo$2");
        try {
            ((View) aRunnableS21S0110000_2.l0).setTag(-1282133481, null);
            if (((View) aRunnableS21S0110000_2.l0).isAttachedToWindow() && !aRunnableS21S0110000_2.z1) {
                C786410Ut5.LJLLLLLL(8, (View) aRunnableS21S0110000_2.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewKTXKt@ddfb.fadeTo$2");
    }

    public ARunnableS21S0110000_2(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
