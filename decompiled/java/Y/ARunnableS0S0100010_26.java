package Y;

import X.C1775290wIZ;
import X.C1775300wIa;
import X.C1C7U;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS0S0100010_26 implements Runnable {
    public final int $t;
    public double d1;
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

    public static final void run$0(ARunnableS0S0100010_26 aRunnableS0S0100010_26) {
        boolean zLIZ;
        C1C7U.LIZ("MMKSingleVideoView@a724.onPropsUpdateOnce$1$1");
        try {
            ((C1775300wIa) aRunnableS0S0100010_26.l0).LJJIFFI((long) aRunnableS0S0100010_26.d1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MMKSingleVideoView@a724.onPropsUpdateOnce$1$1");
    }

    public static final void run$1(ARunnableS0S0100010_26 aRunnableS0S0100010_26) {
        boolean zLIZ;
        C1C7U.LIZ("EcVideoView@8143.onPropsUpdateOnce$1$1");
        try {
            ((C1775290wIZ) aRunnableS0S0100010_26.l0).LJIL((long) aRunnableS0S0100010_26.d1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcVideoView@8143.onPropsUpdateOnce$1$1");
    }

    public ARunnableS0S0100010_26(Object obj, double d, int i) {
        this.$t = i;
        this.l0 = obj;
        this.d1 = d;
    }
}
