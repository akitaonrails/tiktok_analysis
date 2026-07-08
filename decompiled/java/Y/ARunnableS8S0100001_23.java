package Y;

import X.C1479490obT;
import X.C1479500obU;
import X.C1479870oc5;
import X.C1480620odI;
import X.C1484850ok7;
import X.C1C7U;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS8S0100001_23 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

    public static final void run$3(ARunnableS8S0100001_23 aRunnableS8S0100001_23) {
        C1480620odI.LJLLI((C1480620odI) aRunnableS8S0100001_23.l0, aRunnableS8S0100001_23.f1);
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

    public static final void run$0(ARunnableS8S0100001_23 aRunnableS8S0100001_23) {
        C1479500obU c1479500obU = (C1479500obU) aRunnableS8S0100001_23.l0;
        float f = aRunnableS8S0100001_23.f1;
        c1479500obU.getClass();
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBrightnessChanged$1L");
        C1479490obT c1479490obT = c1479500obU.LIZ;
        OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        String str = c1479490obT.LJIIIIZZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBrightnessChanged(str, f);
        } else {
            ((ArrayList) c1479490obT.LJJJLZIJ).add(new C1479870oc5(str, f));
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBrightnessChanged$1L");
    }

    public static final void run$1(ARunnableS8S0100001_23 aRunnableS8S0100001_23) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerMsgProxy@fae.seek$1");
        try {
            ((C1484850ok7) aRunnableS8S0100001_23.l0).LIZ.seek(aRunnableS8S0100001_23.f1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerMsgProxy@fae.seek$1");
    }

    public static final void run$2(ARunnableS8S0100001_23 aRunnableS8S0100001_23) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerMsgProxy@fae.setSpeed$1");
        try {
            ((C1484850ok7) aRunnableS8S0100001_23.l0).LIZ.setSpeed(aRunnableS8S0100001_23.f1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerMsgProxy@fae.setSpeed$1");
    }

    public ARunnableS8S0100001_23(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
