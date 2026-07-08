package Y;

import X.C0SZ8;
import X.C1480420ocy;
import X.C1540620qC4;
import X.C1C7U;
import X.C679540Ql6;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS94S1200000_9;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS6S0300100_9 implements Runnable {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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

    public static final void run$0(ARunnableS6S0300100_9 aRunnableS6S0300100_9) throws JSONException {
        PlayerController playerController = (PlayerController) aRunnableS6S0300100_9.l0;
        C1480420ocy c1480420ocy = (C1480420ocy) aRunnableS6S0300100_9.l1;
        C0SZ8 c0sz8 = (C0SZ8) aRunnableS6S0300100_9.l2;
        long j = aRunnableS6S0300100_9.j3;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrameDelayOpt$1L");
        playerController.LLLZZIL(c1480420ocy, c0sz8, j);
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrameDelayOpt$1L");
    }

    public static final void run$1(ARunnableS6S0300100_9 aRunnableS6S0300100_9) throws JSONException {
        PlayerController playerController = (PlayerController) aRunnableS6S0300100_9.l0;
        C1480420ocy c1480420ocy = (C1480420ocy) aRunnableS6S0300100_9.l1;
        C0SZ8 c0sz8 = (C0SZ8) aRunnableS6S0300100_9.l2;
        long j = aRunnableS6S0300100_9.j3;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrameDelayOpt$2L");
        playerController.LLLZZIL(c1480420ocy, c0sz8, j);
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrameDelayOpt$2L");
    }

    public static final void run$2(ARunnableS6S0300100_9 aRunnableS6S0300100_9) {
        boolean zLIZ;
        C1C7U.LIZ("SparkMultiViewsManager@2f75.getOrCreateLynxKitViewAsync$4");
        try {
            ((Function1) aRunnableS6S0300100_9.l2).invoke(((C1540620qC4) aRunnableS6S0300100_9.l0).LJFF((C679540Ql6) aRunnableS6S0300100_9.l1, aRunnableS6S0300100_9.j3));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkMultiViewsManager@2f75.getOrCreateLynxKitViewAsync$4");
    }

    public ARunnableS6S0300100_9(C1540620qC4 c1540620qC4, C679540Ql6 c679540Ql6, long j, AwS94S1200000_9 awS94S1200000_9, int i) {
        this.$t = i;
        this.l0 = c1540620qC4;
        this.l1 = c679540Ql6;
        this.j3 = j;
        this.l2 = awS94S1200000_9;
    }

    public ARunnableS6S0300100_9(PlayerController playerController, C1480420ocy c1480420ocy, C0SZ8 c0sz8, long j, long j2, int i) {
        this.$t = i;
        this.l0 = playerController;
        this.l1 = c1480420ocy;
        this.l2 = c0sz8;
        this.j3 = j;
    }
}
