package Y;

import X.C0IJT;
import X.C0UBZ;
import X.C1161920gLG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C772780UTc;
import X.C786410Ut5;
import X.InterfaceC768210UBn;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestExperiment;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS12S0000100_12 implements Runnable {
    public final int $t;
    public long j0;

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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        long j = 0;
        while (!C786410Ut5.u3().isInterrupted()) {
            if (j >= Long.MAX_VALUE) {
                j = 0;
            }
            j++;
            if (jElapsedRealtime2 - jElapsedRealtime < NegativeTestExperiment.INSTANCE.getCyclePeriod() - this.j0) {
                jElapsedRealtime2 = SystemClock.elapsedRealtime();
            } else {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sleep ");
                    sbLIZ.append(this.j0);
                    sbLIZ.append("ms then set preTime and curTime");
                    C20441214yg.LJIIIZ("negative_test", C2188811AlT.LIZIZ(sbLIZ));
                    Thread.sleep(this.j0);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("sleep ");
                    sbLIZ2.append(this.j0);
                    sbLIZ2.append("ms end");
                    C20441214yg.LJIIIZ("negative_test", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIIIZ("negative_test", "interceptor!!---> exit dead loop");
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJIIIZ("negative_test", e2.toString());
                    return;
                }
            }
        }
    }

    public final void LIZ$1() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_pre_card_save_time");
        c474500IjALIZ.LJJII(Long.valueOf(this.j0), "save_time");
        c474500IjALIZ.LJJII(Boolean.valueOf(((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).u61("tiktok_live_interaction_gamepad_watch_live")), "exist");
        c474500IjALIZ.LIZ();
    }

    public static final void run$0(ARunnableS12S0000100_12 aRunnableS12S0000100_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBroadcastFragment@d956.onCaptureFirstFrame$1");
        try {
            C772780UTc.LJ = aRunnableS12S0000100_12.j0;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.onCaptureFirstFrame$1");
    }

    public static final void run$1(ARunnableS12S0000100_12 aRunnableS12S0000100_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBroadcastFragment@d956.onStreamStart$2");
        try {
            C772780UTc.LJIIIIZZ(aRunnableS12S0000100_12.j0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.onStreamStart$2");
    }

    public static final void run$2(ARunnableS12S0000100_12 aRunnableS12S0000100_12) {
        boolean zLIZ;
        C1C7U.LIZ("NegativeTestImpl@d2d8.startNegativeTest$1");
        try {
            aRunnableS12S0000100_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NegativeTestImpl@d2d8.startNegativeTest$1");
    }

    public static final void run$3(ARunnableS12S0000100_12 aRunnableS12S0000100_12) {
        boolean zLIZ;
        C1C7U.LIZ("TryModeGoLiveHelper@fcc2.jumpToLive$1");
        try {
            C772780UTc.LIZJ = aRunnableS12S0000100_12.j0;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TryModeGoLiveHelper@fcc2.jumpToLive$1");
    }

    public static final void run$4(ARunnableS12S0000100_12 aRunnableS12S0000100_12) {
        boolean zLIZ;
        C1C7U.LIZ("TryModeGoLiveHelper@fcc2.startGoLive$2$1$2");
        try {
            C772780UTc.LIZIZ = aRunnableS12S0000100_12.j0;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TryModeGoLiveHelper@fcc2.startGoLive$2$1$2");
    }

    public static final void run$5(ARunnableS12S0000100_12 aRunnableS12S0000100_12) {
        boolean zLIZ;
        C1C7U.LIZ("AccompanimentManager@5ec3.handleMessage$2");
        try {
            C0UBZ c0ubz = C0UBZ.LL;
            Set setLJFF = C0UBZ.LJFF();
            long j = aRunnableS12S0000100_12.j0;
            Iterator it2 = setLJFF.iterator();
            while (it2.hasNext()) {
                ((InterfaceC768210UBn) it2.next()).Mc(j);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AccompanimentManager@5ec3.handleMessage$2");
    }

    public static final void run$6(ARunnableS12S0000100_12 aRunnableS12S0000100_12) {
        boolean zLIZ;
        C1C7U.LIZ("GamePartnershipPerfHelper@4037.reportGameCardLoadSaveTime$1");
        try {
            aRunnableS12S0000100_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GamePartnershipPerfHelper@4037.reportGameCardLoadSaveTime$1");
    }

    public ARunnableS12S0000100_12(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
