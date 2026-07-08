package Y;

import X.C1272090jCx;
import X.C1272260jDE;
import X.C1C7U;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0100005_20 implements Runnable {
    public final int $t;
    public float f1;
    public float f2;
    public float f3;
    public float f4;
    public float f5;
    public Object l0;

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

    public static final void run$0(ARunnableS0S0100005_20 aRunnableS0S0100005_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processPanEvent$1");
        try {
            if (((C1272090jCx) aRunnableS0S0100005_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS0S0100005_20.l0).LLJJIJIIJIL.processPanEvent(aRunnableS0S0100005_20.f1, aRunnableS0S0100005_20.f2, aRunnableS0S0100005_20.f3, aRunnableS0S0100005_20.f4, aRunnableS0S0100005_20.f5);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processPanEvent$1");
    }

    public static final void run$1(ARunnableS0S0100005_20 aRunnableS0S0100005_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS0S0100005_20.l0;
        float f = aRunnableS0S0100005_20.f1;
        float f2 = aRunnableS0S0100005_20.f2;
        float f3 = aRunnableS0S0100005_20.f3;
        float f4 = aRunnableS0S0100005_20.f4;
        float f5 = aRunnableS0S0100005_20.f5;
        C1C7U.LIZ("EffectManager@a3e3.processPanEvent$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.processPanEvent(f, f2, f3, f4, f5);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processPanEvent$1L");
    }

    public ARunnableS0S0100005_20(Object obj, float f, float f2, float f3, float f4, float f5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
    }
}
