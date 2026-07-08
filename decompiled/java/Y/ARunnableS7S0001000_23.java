package Y;

import X.C1471340oOK;
import X.C1471350oOL;
import X.C1C7U;
import X.C2187451AjH;
import X.C786410Ut5;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS7S0001000_23 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f287i0;

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

    public static final void run$0(ARunnableS7S0001000_23 aRunnableS7S0001000_23) {
        int i;
        int i2 = aRunnableS7S0001000_23.f287i0;
        C1C7U.LIZ("MultiNetworkSelector@9cf8.applyToWifi$1L");
        C1471350oOL c1471350oOL = C1471340oOK.LIZ;
        synchronized (c1471350oOL) {
            i = c1471350oOL.LIZIZ;
        }
        int i3 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("[NetStrategy]", C786410Ut5.j4("applyToWifiTimeOut operateIndex:[%d], index:[%d].", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        if (i == i2) {
            c1471350oOL.LJFF();
        }
        C1C7U.LIZIZ("MultiNetworkSelector@9cf8.applyToWifi$1L");
    }

    public static final void run$1(ARunnableS7S0001000_23 aRunnableS7S0001000_23) {
        int i;
        int i2 = aRunnableS7S0001000_23.f287i0;
        C1C7U.LIZ("MultiNetworkSelector@9cf8.applyToCellular$1L");
        C1471350oOL c1471350oOL = C1471340oOK.LIZ;
        synchronized (c1471350oOL) {
            i = c1471350oOL.LIZIZ;
        }
        int i3 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("[NetStrategy]", C786410Ut5.j4("applyToCellularTimeOut operateIndex:[%d], index:[%d].", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        if (i == i2) {
            c1471350oOL.LJI();
        }
        C1C7U.LIZIZ("MultiNetworkSelector@9cf8.applyToCellular$1L");
    }

    public ARunnableS7S0001000_23(int i, int i2) {
        this.$t = i2;
        this.f287i0 = i;
    }
}
