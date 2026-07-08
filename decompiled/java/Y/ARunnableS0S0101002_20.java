package Y;

import X.C1272090jCx;
import X.C1272260jDE;
import X.C1C7U;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0101002_20 implements Runnable {
    public final int $t;
    public float f2;
    public float f3;
    public int i1;
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
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0101002_20 aRunnableS0S0101002_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processTouchDownEvent$1");
        try {
            if (((C1272090jCx) aRunnableS0S0101002_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS0S0101002_20.l0).LLJJIJIIJIL.processTouchDownEvent(aRunnableS0S0101002_20.f2, aRunnableS0S0101002_20.f3, aRunnableS0S0101002_20.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processTouchDownEvent$1");
    }

    public static final void run$1(ARunnableS0S0101002_20 aRunnableS0S0101002_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processTouchUpEvent$1");
        try {
            if (((C1272090jCx) aRunnableS0S0101002_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS0S0101002_20.l0).LLJJIJIIJIL.processTouchUpEvent(aRunnableS0S0101002_20.f2, aRunnableS0S0101002_20.f3, aRunnableS0S0101002_20.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processTouchUpEvent$1");
    }

    public static final void run$2(ARunnableS0S0101002_20 aRunnableS0S0101002_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS0S0101002_20.l0;
        float f = aRunnableS0S0101002_20.f2;
        float f2 = aRunnableS0S0101002_20.f3;
        int i = aRunnableS0S0101002_20.i1;
        C1C7U.LIZ("EffectManager@a3e3.processTouchDownEvent$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.processTouchDownEvent(f, f2, i);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processTouchDownEvent$1L");
    }

    public static final void run$3(ARunnableS0S0101002_20 aRunnableS0S0101002_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS0S0101002_20.l0;
        float f = aRunnableS0S0101002_20.f2;
        float f2 = aRunnableS0S0101002_20.f3;
        int i = aRunnableS0S0101002_20.i1;
        C1C7U.LIZ("EffectManager@a3e3.processTouchUpEvent$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.processTouchUpEvent(f, f2, i);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processTouchUpEvent$1L");
    }

    public static final void run$4(ARunnableS0S0101002_20 aRunnableS0S0101002_20) {
        PaintingContext paintingContext = (PaintingContext) aRunnableS0S0101002_20.l0;
        int i = aRunnableS0S0101002_20.i1;
        float f = aRunnableS0S0101002_20.f2;
        float f2 = aRunnableS0S0101002_20.f3;
        paintingContext.getClass();
        C1C7U.LIZ("PaintingContext@8cd7.scrollBy$1L");
        LynxBaseUI lynxBaseUILJIIZILJ = paintingContext.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ != null) {
            lynxBaseUILJIIZILJ.scrollBy(f, f2);
        }
        C1C7U.LIZIZ("PaintingContext@8cd7.scrollBy$1L");
    }

    public ARunnableS0S0101002_20(Object obj, int i, float f, float f2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
        this.f2 = f;
        this.f3 = f2;
    }
}
