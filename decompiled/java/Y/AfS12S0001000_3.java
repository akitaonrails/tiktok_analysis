package Y;

import X.C087E;
import X.C09JN;
import X.C1C7U;
import X.C2416709dV;
import X.C606810Nr5;
import X.C786410Ut5;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes4.dex */
public class AfS12S0001000_3 implements C09JN {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f292i0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS12S0001000_3(int i, int i2) {
        this.$t = i2;
        if (i2 != 0) {
            this.f292i0 = i;
        } else {
            this.f292i0 = i;
        }
    }

    public static final void accept$0(AfS12S0001000_3 afS12S0001000_3, Object obj) {
        int i = afS12S0001000_3.f292i0;
        C1C7U.LIZ("ProcessSelfKiller@7b19.init$1L");
        if (!((C606810Nr5) obj).LIZIZ) {
            C2416709dV.LIZ = true;
            C2416709dV.LIZIZ.removeCallbacks(C2416709dV.LIZJ);
            C1C7U.LIZIZ("ProcessSelfKiller@7b19.init$1L");
        } else {
            if (C2416709dV.LIZ) {
                C1C7U.LIZIZ("ProcessSelfKiller@7b19.init$1L");
                return;
            }
            long j = ((long) i) * 60000;
            BPEAHandler bPEAHandler = C2416709dV.LIZIZ;
            ARunnableS83S0000000_3 aRunnableS83S0000000_3 = C2416709dV.LIZJ;
            bPEAHandler.removeCallbacks(aRunnableS83S0000000_3);
            C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS83S0000000_3);
            C1C7U.LIZIZ("ProcessSelfKiller@7b19.init$1L");
        }
    }

    public static final void accept$1(AfS12S0001000_3 afS12S0001000_3, Object obj) {
        C1C7U.LIZ("LocalNotifyTasksPublisher@ef0c.updateNUGuideLocalNotifyTasks$2");
        ((Keva) C087E.LIZ.getValue()).storeInt("nu_local_notify_wm_status", afS12S0001000_3.f292i0);
        C1C7U.LIZIZ("LocalNotifyTasksPublisher@ef0c.updateNUGuideLocalNotifyTasks$2");
    }
}
