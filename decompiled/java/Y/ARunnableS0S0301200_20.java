package Y;

import X.C1274700jHA;
import X.C1C7U;
import X.InterfaceC1276380jJs;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0301200_20 implements Runnable {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void run$0(ARunnableS0S0301200_20 aRunnableS0S0301200_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.<field>$5$onInfo$1");
        try {
            ((C1274700jHA) aRunnableS0S0301200_20.l2).LIZ((InterfaceC1276380jJs) aRunnableS0S0301200_20.l0, aRunnableS0S0301200_20.i3, aRunnableS0S0301200_20.j4, aRunnableS0S0301200_20.j5, (Object[]) aRunnableS0S0301200_20.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.<field>$5$onInfo$1");
    }

    public static final void run$1(ARunnableS0S0301200_20 aRunnableS0S0301200_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.<field>$5$onError$1");
        try {
            ((C1274700jHA) aRunnableS0S0301200_20.l2).LIZIZ((InterfaceC1276380jJs) aRunnableS0S0301200_20.l0, aRunnableS0S0301200_20.i3, aRunnableS0S0301200_20.j4, aRunnableS0S0301200_20.j5, (Exception) aRunnableS0S0301200_20.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.<field>$5$onError$1");
    }

    public ARunnableS0S0301200_20(Object obj, Object obj2, int i, long j, long j2, Object obj3, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.l0 = obj2;
        this.i3 = i;
        this.j4 = j;
        this.j5 = j2;
        this.l1 = obj3;
    }
}
