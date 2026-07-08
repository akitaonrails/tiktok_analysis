package Y;

import X.C1C7U;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS3S0100001_13 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

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

    public static final void run$0(ARunnableS3S0100001_13 aRunnableS3S0100001_13) {
        boolean zLIZ;
        C1C7U.LIZ("PdpActivity@3b12.setTransition$1$1$1$1");
        try {
            C786410Ut5.U4(((PdpActivity) aRunnableS3S0100001_13.l0).LLLLZLLIL(), (float) ((((double) aRunnableS3S0100001_13.f1) * 0.5d) + 0.5d));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpActivity@3b12.setTransition$1$1$1$1");
    }

    public static final void run$1(ARunnableS3S0100001_13 aRunnableS3S0100001_13) {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpActivity@34b4.setTransition$1$1$1$1");
        try {
            C786410Ut5.U4(((SeaPdpActivity) aRunnableS3S0100001_13.l0).LLLLZLLIL(), (float) ((((double) aRunnableS3S0100001_13.f1) * 0.5d) + 0.5d));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpActivity@34b4.setTransition$1$1$1$1");
    }

    public ARunnableS3S0100001_13(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
