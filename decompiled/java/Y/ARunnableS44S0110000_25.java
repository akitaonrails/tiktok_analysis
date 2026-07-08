package Y;

import X.C1644920suI;
import X.C1646700sxA;
import X.C1C7U;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS44S0110000_25 implements Runnable {
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

    public static final void run$0(ARunnableS44S0110000_25 aRunnableS44S0110000_25) {
        boolean zLIZ;
        C1C7U.LIZ("FilterIndicatorLogicComponent@fd9d.onCreate$1");
        try {
            ((C1644920suI) aRunnableS44S0110000_25.l0).G2(aRunnableS44S0110000_25.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterIndicatorLogicComponent@fd9d.onCreate$1");
    }

    public static final void run$1(ARunnableS44S0110000_25 aRunnableS44S0110000_25) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("ComplexLighteningTabScene@240c.showOrHide$1");
        try {
            TabHost tabHost = ((C1646700sxA) aRunnableS44S0110000_25.l0).LLJJIII;
            if (tabHost == null) {
                tabHost = null;
            }
            if (aRunnableS44S0110000_25.z1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.P0(tabHost, i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComplexLighteningTabScene@240c.showOrHide$1");
    }

    public ARunnableS44S0110000_25(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
