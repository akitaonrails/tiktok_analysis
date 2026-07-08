package Y;

import X.C1142950fqf;
import X.C1C7U;
import X.InterfaceC1685420txc;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS0S0101202_17 implements Runnable {
    public final int $t;
    public float f4;
    public float f5;
    public int i1;
    public long j2;
    public long j3;
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

    public static final void run$0(ARunnableS0S0101202_17 aRunnableS0S0101202_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchProgressBar@da79.calculatePositionImmediate$1");
        try {
            InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc = ((C1142950fqf) aRunnableS0S0101202_17.l0).LLILLJJLI;
            if (interfaceC1685420txc != null) {
                interfaceC1685420txc.invoke(Float.valueOf(aRunnableS0S0101202_17.f4), Float.valueOf(aRunnableS0S0101202_17.f5), Integer.valueOf(aRunnableS0S0101202_17.i1), Long.valueOf(aRunnableS0S0101202_17.j2), Long.valueOf(aRunnableS0S0101202_17.j3));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchProgressBar@da79.calculatePositionImmediate$1");
    }

    public static final void run$1(ARunnableS0S0101202_17 aRunnableS0S0101202_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchProgressBar@da79.calculatePositionInternal$5");
        try {
            InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc = ((C1142950fqf) aRunnableS0S0101202_17.l0).LLILLJJLI;
            if (interfaceC1685420txc != null) {
                interfaceC1685420txc.invoke(Float.valueOf(aRunnableS0S0101202_17.f4), Float.valueOf(aRunnableS0S0101202_17.f5), Integer.valueOf(aRunnableS0S0101202_17.i1), Long.valueOf(aRunnableS0S0101202_17.j2), Long.valueOf(aRunnableS0S0101202_17.j3));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchProgressBar@da79.calculatePositionInternal$5");
    }

    public ARunnableS0S0101202_17(C1142950fqf c1142950fqf, float f, float f2, int i, long j, long j2, int i2) {
        this.$t = i2;
        this.l0 = c1142950fqf;
        this.f4 = f;
        this.f5 = f2;
        this.i1 = i;
        this.j2 = j;
        this.j3 = j2;
    }
}
