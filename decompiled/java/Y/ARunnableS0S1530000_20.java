package Y;

import X.C1275970jJD;
import X.C1276000jJG;
import X.C1276550jK9;
import X.C1276560jKA;
import X.C1C7U;
import X.EnumC1275390jIH;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S1530000_20 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public boolean z6;
    public boolean z7;
    public boolean z8;

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

    public static final void run$0(ARunnableS0S1530000_20 aRunnableS0S1530000_20) {
        boolean zLIZ;
        C1C7U.LIZ("StreamMixManager@3191.updateMixStream$2");
        try {
            C1275970jJD c1275970jJD = ((C1276550jK9) aRunnableS0S1530000_20.l5).LJIIIZ;
            if (c1275970jJD != null) {
                c1275970jJD.LIZJ((List) aRunnableS0S1530000_20.l1, aRunnableS0S1530000_20.s0, aRunnableS0S1530000_20.z6, aRunnableS0S1530000_20.z7, aRunnableS0S1530000_20.z8, (Map) aRunnableS0S1530000_20.l2, (C1276000jJG) aRunnableS0S1530000_20.l3, null, (EnumC1275390jIH) aRunnableS0S1530000_20.l4);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StreamMixManager@3191.updateMixStream$2");
    }

    public static final void run$1(ARunnableS0S1530000_20 aRunnableS0S1530000_20) {
        boolean zLIZ;
        C1C7U.LIZ("StreamMixManagerNewArch@16a7.updateMixStream$2");
        try {
            C1275970jJD c1275970jJD = ((C1276560jKA) aRunnableS0S1530000_20.l5).LJIIIIZZ;
            if (c1275970jJD != null) {
                c1275970jJD.LIZJ((List) aRunnableS0S1530000_20.l1, aRunnableS0S1530000_20.s0, aRunnableS0S1530000_20.z6, aRunnableS0S1530000_20.z7, aRunnableS0S1530000_20.z8, (Map) aRunnableS0S1530000_20.l2, (C1276000jJG) aRunnableS0S1530000_20.l3, null, (EnumC1275390jIH) aRunnableS0S1530000_20.l4);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StreamMixManagerNewArch@16a7.updateMixStream$2");
    }

    public ARunnableS0S1530000_20(C1276560jKA c1276560jKA, List list, String str, boolean z, boolean z2, Map map, C1276000jJG c1276000jJG, EnumC1275390jIH enumC1275390jIH, int i) {
        this.$t = i;
        this.l5 = c1276560jKA;
        this.l1 = list;
        this.s0 = str;
        this.z6 = z;
        this.z7 = false;
        this.z8 = z2;
        this.l2 = map;
        this.l3 = c1276000jJG;
        this.l4 = enumC1275390jIH;
    }

    public ARunnableS0S1530000_20(C1276550jK9 c1276550jK9, List list, String str, boolean z, boolean z2, boolean z3, Map map, C1276000jJG c1276000jJG, EnumC1275390jIH enumC1275390jIH, int i) {
        this.$t = i;
        this.l5 = c1276550jK9;
        this.l1 = list;
        this.s0 = str;
        this.z6 = z;
        this.z7 = z2;
        this.z8 = z3;
        this.l2 = map;
        this.l3 = c1276000jJG;
        this.l4 = enumC1275390jIH;
    }
}
