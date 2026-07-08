package Y;

import X.C1C7U;
import X.C2188811AlT;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0002000_20 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f278i0;
    public int i1;

    public static final void run$0(ARunnableS0S0002000_20 aRunnableS0S0002000_20) {
        LynxEventReporter.lambda$moveExtraParams$6(aRunnableS0S0002000_20.f278i0, aRunnableS0S0002000_20.i1);
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

    public static final void run$1(ARunnableS0S0002000_20 aRunnableS0S0002000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.<field>$7$onConnectionStateChanged$1");
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onConnectionStateChanged state:");
            sbLIZ.append(aRunnableS0S0002000_20.f278i0);
            sbLIZ.append(" reason:");
            sbLIZ.append(aRunnableS0S0002000_20.i1);
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.<field>$7$onConnectionStateChanged$1");
    }

    public ARunnableS0S0002000_20(int i, int i2, int i3) {
        this.$t = i3;
        if (i3 != 0) {
            this.f278i0 = i;
            this.i1 = i2;
        } else {
            this.f278i0 = i;
            this.i1 = i2;
        }
    }
}
