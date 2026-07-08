package Y;

import X.C0CBW;
import X.C1702430uP3;
import X.C1913340ztE;
import X.C19211310Dv;
import X.C19276210bA;
import X.C1C7U;
import X.C2187451AjH;
import X.C786410Ut5;
import X.C799570VYd;
import X.RunnableC1913330ztD;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.account.experiment.SwitchAccountGestureGuardSettings;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS101S0000000_28 implements Runnable {
    public final int $t;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS101S0000000_28(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS101S0000000_28 aRunnableS101S0000000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SwitchAccountLoadingHud@d0e3.dismiss$$inlined$runOnMain$1");
        try {
            C1913340ztE.LIZ.getClass();
            C1913340ztE.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SwitchAccountLoadingHud@d0e3.dismiss$$inlined$runOnMain$1");
    }

    public static final void run$1(ARunnableS101S0000000_28 aRunnableS101S0000000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SwitchAccountLoadingHud@d0e3.onSwitchSucceeded$$inlined$runOnMain$1");
        try {
            if (C1913340ztE.LIZJ != null) {
                C1913340ztE c1913340ztE = C1913340ztE.LIZ;
                long j = SwitchAccountGestureGuardSettings.LIZ().guardWindowMs;
                if (j < 0) {
                    j = 0;
                }
                c1913340ztE.getClass();
                BPEAHandler bPEAHandler = C1913340ztE.LIZIZ;
                RunnableC1913330ztD runnableC1913330ztD = C1913340ztE.LJ;
                bPEAHandler.removeCallbacks(runnableC1913330ztD);
                C786410Ut5.LJLIIL(j, bPEAHandler, runnableC1913330ztD);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SwitchAccountLoadingHud@d0e3.onSwitchSucceeded$$inlined$runOnMain$1");
    }

    public static final void run$2(ARunnableS101S0000000_28 aRunnableS101S0000000_28) {
        long j;
        C1C7U.LIZ("LoginUtils@3018.afterLogIn$1L$1L");
        if (C19276210bA.LIZ()) {
            if (C1702430uP3.LJ) {
                C2187451AjH.LJFF(Mp4ScreenVideoLoadTimeout.CONTROL);
            }
            C2187451AjH.LJII(Mp4ScreenVideoLoadTimeout.CONTROL, true);
        } else if (C19276210bA.LIZIZ()) {
            C0CBW c0cbw = C0CBW.LIZ;
            if (C0CBW.LIZIZ()) {
                j = 6000;
            } else {
                j = 3000;
            }
            DoFrameController.LIZIZ = 3;
            C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new Runnable() { // from class: X.08Ia
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LoginSceneOpt@2e54.optDoFrame$1");
                    try {
                        DoFrameController.LIZIZ = 0;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LoginSceneOpt@2e54.optDoFrame$1");
                }
            });
        }
        C1C7U.LIZIZ("LoginUtils@3018.afterLogIn$1L$1L");
    }

    public static final void run$3(ARunnableS101S0000000_28 aRunnableS101S0000000_28) {
        C1C7U.LIZ("FeedStatusModel@5e19.<init>$1L");
        C19211310Dv.LJIIJ();
        C1C7U.LIZIZ("FeedStatusModel@5e19.<init>$1L");
    }
}
