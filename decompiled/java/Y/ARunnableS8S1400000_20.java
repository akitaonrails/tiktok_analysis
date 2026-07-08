package Y;

import X.C1275970jJD;
import X.C1276000jJG;
import X.C1276550jK9;
import X.C1276560jKA;
import X.C1276580jKC;
import X.C1C7U;
import X.C969430bKn;
import X.EnumC1275390jIH;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS8S1400000_20 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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
        C1275970jJD c1275970jJD = ((C1276550jK9) this.l4).LJIIIZ;
        if (c1275970jJD != null) {
            C969430bKn c969430bKn = (C969430bKn) this.l1;
            List<C1276580jKC> list = c969430bKn.LIZJ;
            String str = this.s0;
            c969430bKn.getClass();
            ((C969430bKn) this.l1).getClass();
            ((C969430bKn) this.l1).getClass();
            c1275970jJD.LIZJ(list, str, true, false, true, null, (C1276000jJG) this.l2, (C969430bKn) this.l1, (EnumC1275390jIH) this.l3);
        }
    }

    public final void LIZ$1() {
        C1275970jJD c1275970jJD = ((C1276560jKA) this.l4).LJIIIIZZ;
        if (c1275970jJD != null) {
            C969430bKn c969430bKn = (C969430bKn) this.l1;
            List<C1276580jKC> list = c969430bKn.LIZJ;
            String str = this.s0;
            c969430bKn.getClass();
            ((C969430bKn) this.l1).getClass();
            ((C969430bKn) this.l1).getClass();
            c1275970jJD.LIZJ(list, str, true, false, true, null, (C1276000jJG) this.l2, (C969430bKn) this.l1, (EnumC1275390jIH) this.l3);
        }
    }

    public static final void run$0(ARunnableS8S1400000_20 aRunnableS8S1400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("StreamMixManager@3191.updateMixStream$1");
        try {
            aRunnableS8S1400000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StreamMixManager@3191.updateMixStream$1");
    }

    public static final void run$1(ARunnableS8S1400000_20 aRunnableS8S1400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("StreamMixManagerNewArch@16a7.updateMixStream$1");
        try {
            aRunnableS8S1400000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StreamMixManagerNewArch@16a7.updateMixStream$1");
    }

    public ARunnableS8S1400000_20(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
