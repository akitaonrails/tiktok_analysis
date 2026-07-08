package Y;

import X.C1480420ocy;
import X.C1C7U;
import X.EnumC2281141EQm;
import X.InterfaceC585610Mxz;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS2S1201000_9 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    public static final void run$0(ARunnableS2S1201000_9 aRunnableS2S1201000_9) {
        PlayerController.LLIIIJ((PlayerController) aRunnableS2S1201000_9.l1, aRunnableS2S1201000_9.i3, aRunnableS2S1201000_9.s0, (C1480420ocy) aRunnableS2S1201000_9.l2);
    }

    public static final void run$1(ARunnableS2S1201000_9 aRunnableS2S1201000_9) {
        PlayerController.LLIIII((PlayerController) aRunnableS2S1201000_9.l1, aRunnableS2S1201000_9.s0, aRunnableS2S1201000_9.i3, (JSONObject) aRunnableS2S1201000_9.l2);
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

    public static final void run$2(ARunnableS2S1201000_9 aRunnableS2S1201000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onVideoStreamBitrateChanged$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS2S1201000_9.l1;
            if (onUIPlayListener instanceof InterfaceC585610Mxz) {
                ((InterfaceC585610Mxz) onUIPlayListener).sB0();
            }
            OnUIPlayListener onUIPlayListener2 = (OnUIPlayListener) aRunnableS2S1201000_9.l1;
            if (onUIPlayListener2 != null) {
                onUIPlayListener2.onVideoBitrateChanged(aRunnableS2S1201000_9.s0, (EnumC2281141EQm) aRunnableS2S1201000_9.l2, aRunnableS2S1201000_9.i3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onVideoStreamBitrateChanged$1");
    }

    public static final void run$3(ARunnableS2S1201000_9 aRunnableS2S1201000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlayerInternalEvent$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS2S1201000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayerInternalEvent(aRunnableS2S1201000_9.s0, aRunnableS2S1201000_9.i3, (JSONObject) aRunnableS2S1201000_9.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlayerInternalEvent$1");
    }

    public ARunnableS2S1201000_9(Object obj, int i, String str, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i3 = i;
        this.s0 = str;
        this.l2 = obj2;
    }
}
