package Y;

import X.C1468940oKS;
import X.C1482330og3;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS8S0100002_23 implements Runnable {
    public final int $t;
    public float f1;
    public float f2;
    public Object l0;

    public static final void run$0(ARunnableS8S0100002_23 aRunnableS8S0100002_23) {
        C1468940oKS.LLZIL((C1468940oKS) aRunnableS8S0100002_23.l0, aRunnableS8S0100002_23.f1, aRunnableS8S0100002_23.f2);
    }

    public static final void run$1(ARunnableS8S0100002_23 aRunnableS8S0100002_23) {
        C1482330og3.LJIIIZ((C1482330og3) aRunnableS8S0100002_23.l0, aRunnableS8S0100002_23.f1, aRunnableS8S0100002_23.f2);
    }

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

    public ARunnableS8S0100002_23(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
