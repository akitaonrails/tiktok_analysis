package Y;

import X.C1123280fKw;
import X.C1C7U;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS4S0202000_17 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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

    public static final void run$0(ARunnableS4S0202000_17 aRunnableS4S0202000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftMultiFastGiftsView@7bcc.updateRoseComboPosition$1");
        try {
            C1123280fKw c1123280fKw = (C1123280fKw) aRunnableS4S0202000_17.l0;
            c1123280fKw.LLJ = false;
            c1123280fKw.LLIZLLLIL++;
            ((C1123280fKw) aRunnableS4S0202000_17.l0).LJIIIZ(aRunnableS4S0202000_17.i2, aRunnableS4S0202000_17.i3, (int[]) aRunnableS4S0202000_17.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftMultiFastGiftsView@7bcc.updateRoseComboPosition$1");
    }

    public static final void run$1(ARunnableS4S0202000_17 aRunnableS4S0202000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftMultiFastGiftsView@7bcc.updateRoseComboPosition$2");
        try {
            C1123280fKw c1123280fKw = (C1123280fKw) aRunnableS4S0202000_17.l0;
            c1123280fKw.LLJ = false;
            c1123280fKw.LLIZLLLIL++;
            ((C1123280fKw) aRunnableS4S0202000_17.l0).LJIIIZ(aRunnableS4S0202000_17.i2, aRunnableS4S0202000_17.i3, (int[]) aRunnableS4S0202000_17.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftMultiFastGiftsView@7bcc.updateRoseComboPosition$2");
    }

    public ARunnableS4S0202000_17(C1123280fKw c1123280fKw, int[] iArr, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = c1123280fKw;
        this.l1 = iArr;
        this.i2 = i;
        this.i3 = i2;
    }
}
