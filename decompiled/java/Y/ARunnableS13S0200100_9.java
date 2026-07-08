package Y;

import X.C0RHF;
import X.C1017070cZd;
import X.C1480430ocz;
import X.C1483410ohn;
import X.C1C7U;
import X.C581460MrI;
import X.C581740Mrk;
import X.C581940Ms4;
import X.C786410Ut5;
import X.InterfaceC582390Msn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS13S0200100_9 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
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
        if (((Aweme) this.l0) == ((C581460MrI) this.l1).LIZIZ) {
            C0RHF c0rhfLIZ = C581940Ms4.LIZ();
            InterfaceC582390Msn interfaceC582390MsnLIZ = C581740Mrk.LIZ();
            long currentPosition = (!C1017070cZd.LJLJLJ(((C581460MrI) this.l1).LIZIZ) || c0rhfLIZ == null) ? (!C1017070cZd.LLIIIZ(((C581460MrI) this.l1).LIZIZ) || interfaceC582390MsnLIZ == null) ? C1483410ohn.LJLJJI().getCurrentPosition() : interfaceC582390MsnLIZ.getCurrentPosition() : c0rhfLIZ.getCurrentPosition();
            if (currentPosition < 0) {
                currentPosition = 0;
            }
            C581460MrI c581460MrI = (C581460MrI) this.l1;
            c581460MrI.getClass();
            if (currentPosition < 0 && (currentPosition >= this.j2 || c581460MrI.LIZJ <= 0)) {
                this.j2 = currentPosition;
                C786410Ut5.LJLIIL(1000L, c581460MrI.LIZ, this);
                return;
            }
            Runnable runnable = c581460MrI.LIZLLL;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            ((C581460MrI) this.l1).LIZLLL = null;
        }
    }

    public static final void run$0(ARunnableS13S0200100_9 aRunnableS13S0200100_9) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerController@7763.onRenderReady$2");
        try {
            ((PlayerController) aRunnableS13S0200100_9.l1).LLZLLLL((C1480430ocz) aRunnableS13S0200100_9.l0, aRunnableS13S0200100_9.j2, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerController@7763.onRenderReady$2");
    }

    public static final void run$1(ARunnableS13S0200100_9 aRunnableS13S0200100_9) throws Throwable {
        PlayerController playerController = (PlayerController) aRunnableS13S0200100_9.l0;
        C1480430ocz c1480430ocz = (C1480430ocz) aRunnableS13S0200100_9.l1;
        long j = aRunnableS13S0200100_9.j2;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderReady$1L");
        playerController.LLZLLLL(c1480430ocz, j, true);
        C1C7U.LIZIZ("PlayerController@7763.onRenderReady$1L");
    }

    public static final void run$2(ARunnableS13S0200100_9 aRunnableS13S0200100_9) {
        boolean zLIZ;
        C1C7U.LIZ("PlayVideoHelper@dceb.tryRunCallback$1");
        try {
            aRunnableS13S0200100_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayVideoHelper@dceb.tryRunCallback$1");
    }

    public ARunnableS13S0200100_9(C581460MrI c581460MrI, int i) {
        this.$t = i;
        this.l1 = c581460MrI;
        this.l0 = c581460MrI.LIZIZ;
    }

    public ARunnableS13S0200100_9(PlayerController playerController, C1480430ocz c1480430ocz, long j, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = playerController;
            this.l1 = c1480430ocz;
            this.j2 = j;
        } else {
            this.l1 = playerController;
            this.l0 = c1480430ocz;
            this.j2 = j;
        }
    }
}
