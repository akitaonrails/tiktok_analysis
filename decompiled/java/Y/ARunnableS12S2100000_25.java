package Y;

import X.C1645730svb;
import X.C1C7U;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS12S2100000_25 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final void run$0(ARunnableS12S2100000_25 aRunnableS12S2100000_25) {
        boolean zLIZ;
        C1C7U.LIZ("RecordBackgroundVideoProcessor@43c3.setDefaultBgv$2$1");
        try {
            C1645730svb c1645730svb = (C1645730svb) aRunnableS12S2100000_25.l2;
            c1645730svb.LJIILL = true;
            c1645730svb.LJIILIIL(aRunnableS12S2100000_25.s0, aRunnableS12S2100000_25.s1, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordBackgroundVideoProcessor@43c3.setDefaultBgv$2$1");
    }

    public static final void run$1(ARunnableS12S2100000_25 aRunnableS12S2100000_25) {
        boolean zLIZ;
        C1C7U.LIZ("RecordBackgroundVideoProcessor@43c3.setDefaultBgv$4$1");
        try {
            C1645730svb c1645730svb = (C1645730svb) aRunnableS12S2100000_25.l2;
            c1645730svb.LJIILL = true;
            c1645730svb.LJIILIIL(aRunnableS12S2100000_25.s0, aRunnableS12S2100000_25.s1, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordBackgroundVideoProcessor@43c3.setDefaultBgv$4$1");
    }

    public ARunnableS12S2100000_25(C1645730svb c1645730svb, String str, String str2, int i) {
        this.$t = i;
        this.l2 = c1645730svb;
        this.s0 = str;
        this.s1 = str2;
    }
}
