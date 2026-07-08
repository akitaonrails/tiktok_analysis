package Y;

import J.N;
import X.C08VH;
import X.C1C7U;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.TTCronetMpaService;
import com.ttnet.org.chromium.net.impl.TTCronetNetExpRequest;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS6S1110000_23 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public final void LIZ$0() {
        if (!this.z2) {
            synchronized (((TTCronetNetExpRequest) this.l1).LJIIJ) {
                try {
                    TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) this.l1;
                    if ((!tTCronetNetExpRequest.LJIIIZ || tTCronetNetExpRequest.LJIIIIZZ != 0) && tTCronetNetExpRequest.LJIIIIZZ != 0) {
                        N.M6$xRvea(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest);
                        tTCronetNetExpRequest.LJIIIIZZ = 0L;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        try {
            TTCronetNetExpRequest tTCronetNetExpRequest2 = (TTCronetNetExpRequest) this.l1;
            tTCronetNetExpRequest2.LJI.onNetDiagnosisRequestComplete(tTCronetNetExpRequest2, this.s0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C08VH.LIZ("Exception in callback: ", e);
        }
    }

    public static final void run$0(ARunnableS6S1110000_23 aRunnableS6S1110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTCronetMpaService@8037.onInitFinish$1");
        try {
            try {
                ((TTCronetMpaService) aRunnableS6S1110000_23.l1).LIZLLL.onFinish(aRunnableS6S1110000_23.z2, aRunnableS6S1110000_23.s0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C08VH.LIZ("Exception in callback: ", e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTCronetMpaService@8037.onInitFinish$1");
    }

    public static final void run$1(ARunnableS6S1110000_23 aRunnableS6S1110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTCronetMpaService@8037.onSetAccAddressFinish$1");
        try {
            try {
                ((TTCronetMpaService) aRunnableS6S1110000_23.l1).LJ.onFinish(aRunnableS6S1110000_23.z2, aRunnableS6S1110000_23.s0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C08VH.LIZ("Exception in callback: ", e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTCronetMpaService@8037.onSetAccAddressFinish$1");
    }

    public static final void run$2(ARunnableS6S1110000_23 aRunnableS6S1110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTCronetNetExpRequest@9ef4.onNetExpRequestComplete$1");
        try {
            aRunnableS6S1110000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTCronetNetExpRequest@9ef4.onNetExpRequestComplete$1");
    }

    public ARunnableS6S1110000_23(Object obj, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z2 = z;
        this.s0 = str;
    }
}
