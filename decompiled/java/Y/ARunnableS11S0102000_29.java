package Y;

import X.AbstractC19563811gS;
import X.C19557511fR;
import X.C19557811fU;
import X.C19561611g6;
import X.C19564111gV;
import X.C19564311gX;
import X.C1C7U;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS11S0102000_29 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
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
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS11S0102000_29 aRunnableS11S0102000_29) {
        C19557811fU c19557811fU = (C19557811fU) aRunnableS11S0102000_29.l0;
        int i = aRunnableS11S0102000_29.i1;
        int i2 = aRunnableS11S0102000_29.i2;
        c19557811fU.getClass();
        C1C7U.LIZ("FTCVEEffectHelper@5fc7.restoreLastEditTimeState$1L");
        c19557811fU.LJIJJLI.LJJJ(i, i2, false);
        C1C7U.LIZIZ("FTCVEEffectHelper@5fc7.restoreLastEditTimeState$1L");
    }

    public static final void run$1(ARunnableS11S0102000_29 aRunnableS11S0102000_29) {
        C19557511fR c19557511fR = (C19557511fR) aRunnableS11S0102000_29.l0;
        int i = aRunnableS11S0102000_29.i1;
        int i2 = aRunnableS11S0102000_29.i2;
        c19557511fR.getClass();
        C1C7U.LIZ("VEEffectHelper@574b.restoreLastEditTimeState$1L");
        c19557511fR.LJJI.LJJJ(i, i2, false);
        C1C7U.LIZIZ("VEEffectHelper@574b.restoreLastEditTimeState$1L");
    }

    public static final void run$2(ARunnableS11S0102000_29 aRunnableS11S0102000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BaseResourcePagerScene@f77a.scrollToSelectedItem$1");
        try {
            C19561611g6 c19561611g6 = ((AbstractC19563811gS) aRunnableS11S0102000_29.l0).LLJL;
            if (c19561611g6 != null && c19561611g6.getParent() != null) {
                ((AbstractC19563811gS) aRunnableS11S0102000_29.l0).LLLLLLLLL(aRunnableS11S0102000_29.i1);
                C19564111gV<RESOURCE_ITEM_VIEW_HOLDER> c19564111gV = ((AbstractC19563811gS) aRunnableS11S0102000_29.l0).LLJZIJLIL;
                if (c19564111gV != 0) {
                    int i = aRunnableS11S0102000_29.i1;
                    int i2 = aRunnableS11S0102000_29.i2;
                    C19564311gX c19564311gX = (C19564311gX) c19564111gV.LLJI.get(i);
                    if (c19564311gX != null) {
                        c19564311gX.LIZJ(i2);
                    }
                }
                AbstractC19563811gS abstractC19563811gS = (AbstractC19563811gS) aRunnableS11S0102000_29.l0;
                if (!abstractC19563811gS.LLJLLIL) {
                    abstractC19563811gS.LLLLLLL();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseResourcePagerScene@f77a.scrollToSelectedItem$1");
    }

    public ARunnableS11S0102000_29(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
