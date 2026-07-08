package Y;

import X.C1272090jCx;
import X.C1272260jDE;
import X.C1C7U;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0102104_20 implements Runnable {
    public final int $t;
    public float f4;
    public float f5;
    public float f6;
    public float f7;
    public int i1;
    public int i2;
    public long j3;
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

    public static final void run$0(ARunnableS0S0102104_20 aRunnableS0S0102104_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processTouchEventWithTouchType$1");
        try {
            if (((C1272090jCx) aRunnableS0S0102104_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS0S0102104_20.l0).LLJJIJIIJIL.processTouchEventWithTouchType(aRunnableS0S0102104_20.j3, aRunnableS0S0102104_20.f4, aRunnableS0S0102104_20.f5, aRunnableS0S0102104_20.f6, aRunnableS0S0102104_20.f7, aRunnableS0S0102104_20.i1, aRunnableS0S0102104_20.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processTouchEventWithTouchType$1");
    }

    public static final void run$1(ARunnableS0S0102104_20 aRunnableS0S0102104_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS0S0102104_20.l0;
        long j = aRunnableS0S0102104_20.j3;
        float f = aRunnableS0S0102104_20.f4;
        float f2 = aRunnableS0S0102104_20.f5;
        float f3 = aRunnableS0S0102104_20.f6;
        float f4 = aRunnableS0S0102104_20.f7;
        int i = aRunnableS0S0102104_20.i1;
        int i2 = aRunnableS0S0102104_20.i2;
        C1C7U.LIZ("EffectManager@a3e3.processTouchEventWithTouchType$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.processTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processTouchEventWithTouchType$1L");
    }

    public ARunnableS0S0102104_20(Object obj, long j, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.j3 = j;
        this.f4 = f;
        this.f5 = f2;
        this.f6 = f3;
        this.f7 = f4;
        this.i1 = i;
        this.i2 = i2;
    }
}
