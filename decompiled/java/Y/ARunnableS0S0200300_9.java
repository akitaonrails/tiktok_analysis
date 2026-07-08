package Y;

import X.C1480420ocy;
import X.C1C7U;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS0S0200300_9 implements Runnable {
    public final int $t;
    public long j2;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0200300_9 aRunnableS0S0200300_9) throws JSONException {
        PlayerController playerController = (PlayerController) aRunnableS0S0200300_9.l0;
        C1480420ocy c1480420ocy = (C1480420ocy) aRunnableS0S0200300_9.l1;
        long j = aRunnableS0S0200300_9.j2;
        long j2 = aRunnableS0S0200300_9.j3;
        long j3 = aRunnableS0S0200300_9.j4;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFramePostOpt$1L");
        playerController.LLZ(c1480420ocy, j, j2, j3);
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFramePostOpt$1L");
    }

    public static final void run$1(ARunnableS0S0200300_9 aRunnableS0S0200300_9) throws JSONException {
        PlayerController playerController = (PlayerController) aRunnableS0S0200300_9.l0;
        C1480420ocy c1480420ocy = (C1480420ocy) aRunnableS0S0200300_9.l1;
        long j = aRunnableS0S0200300_9.j2;
        long j2 = aRunnableS0S0200300_9.j3;
        long j3 = aRunnableS0S0200300_9.j4;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrame$1L$2L");
        playerController.LLZILL(c1480420ocy, j, j2, j3);
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrame$1L$2L");
    }

    public static final void run$2(ARunnableS0S0200300_9 aRunnableS0S0200300_9) throws JSONException {
        PlayerController playerController = (PlayerController) aRunnableS0S0200300_9.l0;
        C1480420ocy c1480420ocy = (C1480420ocy) aRunnableS0S0200300_9.l1;
        long j = aRunnableS0S0200300_9.j2;
        long j2 = aRunnableS0S0200300_9.j3;
        long j3 = aRunnableS0S0200300_9.j4;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrame$1L$3L");
        playerController.LLZILL(c1480420ocy, j, j2, j3);
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrame$1L$3L");
    }

    public static final void run$3(ARunnableS0S0200300_9 aRunnableS0S0200300_9) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrame$1L$3");
        try {
            ((PlayerController) aRunnableS0S0200300_9.l1).LLZILL((C1480420ocy) aRunnableS0S0200300_9.l0, aRunnableS0S0200300_9.j2, aRunnableS0S0200300_9.j3, aRunnableS0S0200300_9.j4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrame$1L$3");
    }

    public ARunnableS0S0200300_9(PlayerController playerController, C1480420ocy c1480420ocy, long j, long j2, long j3, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.l0 = playerController;
                this.l1 = c1480420ocy;
                this.j2 = j;
                this.j3 = j2;
                this.j4 = j3;
                break;
            default:
                this.l1 = playerController;
                this.l0 = c1480420ocy;
                this.j2 = j;
                this.j3 = j2;
                this.j4 = j3;
                break;
        }
    }
}
