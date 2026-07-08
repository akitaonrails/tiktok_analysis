package Y;

import X.C1272090jCx;
import X.C1272260jDE;
import X.C1292130jjH;
import X.C1292170jjL;
import X.C1318590kPx;
import X.C1C7U;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS7S0100002_20 implements Runnable {
    public final int $t;
    public float f1;
    public float f2;
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
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processTouchEvent$1");
        try {
            if (((C1272090jCx) aRunnableS7S0100002_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS7S0100002_20.l0).LLJJIJIIJIL.processTouchEvent(aRunnableS7S0100002_20.f1, aRunnableS7S0100002_20.f2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processTouchEvent$1");
    }

    public static final void run$1(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processLongPressEvent$1");
        try {
            if (((C1272090jCx) aRunnableS7S0100002_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS7S0100002_20.l0).LLJJIJIIJIL.processLongPressEvent(aRunnableS7S0100002_20.f1, aRunnableS7S0100002_20.f2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processLongPressEvent$1");
    }

    public static final void run$10(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        UIList uIList = (UIList) aRunnableS7S0100002_20.l0;
        float f = aRunnableS7S0100002_20.f1;
        float f2 = aRunnableS7S0100002_20.f2;
        int i = UIList.LLLL;
        uIList.getClass();
        C1C7U.LIZ("UIList@ec82.onGestureScrollBy$1L");
        T t = uIList.mView;
        if (t == 0) {
            C1C7U.LIZIZ("UIList@ec82.onGestureScrollBy$1L");
        } else {
            ((RecyclerView) t).scrollBy((int) f, (int) f2);
            C1C7U.LIZIZ("UIList@ec82.onGestureScrollBy$1L");
        }
    }

    public static final void run$11(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        UIListContainer uIListContainer = (UIListContainer) aRunnableS7S0100002_20.l0;
        float f = aRunnableS7S0100002_20.f1;
        float f2 = aRunnableS7S0100002_20.f2;
        int i = UIListContainer.LLJLLIL;
        uIListContainer.getClass();
        C1C7U.LIZ("UIListContainer@af5a.onGestureScrollBy$1L");
        T t = uIListContainer.mView;
        if (t == 0) {
            C1C7U.LIZIZ("UIListContainer@af5a.onGestureScrollBy$1L");
            return;
        }
        if (uIListContainer.LL) {
            t.scrollBy(0, (int) f);
        } else {
            t.scrollBy((int) f2, 0);
        }
        C1C7U.LIZIZ("UIListContainer@af5a.onGestureScrollBy$1L");
    }

    public static final void run$12(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        UIScrollView uIScrollView = (UIScrollView) aRunnableS7S0100002_20.l0;
        float f = aRunnableS7S0100002_20.f1;
        float f2 = aRunnableS7S0100002_20.f2;
        int i = UIScrollView.LLJZIJLIL;
        uIScrollView.getClass();
        C1C7U.LIZ("UIScrollView@cecf.onGestureScrollBy$1L");
        T t = uIScrollView.mView;
        if (t == 0) {
            C1C7U.LIZIZ("UIScrollView@cecf.onGestureScrollBy$1L");
            return;
        }
        C1318590kPx c1318590kPx = (C1318590kPx) t;
        if (c1318590kPx.LLJJJ && c1318590kPx.getHScrollView() != null) {
            ((C1318590kPx) uIScrollView.mView).getHScrollView().scrollBy((int) f, 0);
        } else {
            uIScrollView.mView.scrollBy(0, (int) f2);
        }
        C1C7U.LIZIZ("UIScrollView@cecf.onGestureScrollBy$1L");
    }

    public static final void run$2(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processScaleEvent$1");
        try {
            if (((C1272090jCx) aRunnableS7S0100002_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS7S0100002_20.l0).LLJJIJIIJIL.processScaleEvent(aRunnableS7S0100002_20.f1, aRunnableS7S0100002_20.f2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processScaleEvent$1");
    }

    public static final void run$3(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processRotationEvent$1");
        try {
            if (((C1272090jCx) aRunnableS7S0100002_20.l0).isValid()) {
                ((C1272090jCx) aRunnableS7S0100002_20.l0).LLJJIJIIJIL.processRotationEvent(aRunnableS7S0100002_20.f1, aRunnableS7S0100002_20.f2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processRotationEvent$1");
    }

    public static final void run$4(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS7S0100002_20.l0;
        float f = aRunnableS7S0100002_20.f1;
        float f2 = aRunnableS7S0100002_20.f2;
        C1C7U.LIZ("EffectManager@a3e3.processLongPressEvent$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.processLongPressEvent(f, f2);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processLongPressEvent$1L");
    }

    public static final void run$5(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS7S0100002_20.l0;
        float f = aRunnableS7S0100002_20.f1;
        float f2 = aRunnableS7S0100002_20.f2;
        C1C7U.LIZ("EffectManager@a3e3.processRotationEvent$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.processRotationEvent(f, f2);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processRotationEvent$1L");
    }

    public static final void run$6(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS7S0100002_20.l0;
        float f = aRunnableS7S0100002_20.f1;
        float f2 = aRunnableS7S0100002_20.f2;
        C1C7U.LIZ("EffectManager@a3e3.processScaleEvent$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null) {
            effectWrapper.processScaleEvent(f, f2);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processScaleEvent$1L");
    }

    public static final void run$7(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS7S0100002_20.l0;
        float f = aRunnableS7S0100002_20.f1;
        float f2 = aRunnableS7S0100002_20.f2;
        C1C7U.LIZ("EffectManager@a3e3.processTouchEvent$1L");
        if (c1272260jDE.isValid()) {
            c1272260jDE.LLIZLLLIL.processTouchEvent(f, f2);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.processTouchEvent$1L");
    }

    public static final void run$8(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        boolean zLIZ;
        C1C7U.LIZ("AlphaVideoSurfaceView@e51a.measureInternal$1");
        try {
            C1292170jjL c1292170jjL = (C1292170jjL) aRunnableS7S0100002_20.l0;
            c1292170jjL.LLILZIL.LIZJ(aRunnableS7S0100002_20.f1, aRunnableS7S0100002_20.f2, c1292170jjL.LLILLJJLI, c1292170jjL.LLILLL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AlphaVideoSurfaceView@e51a.measureInternal$1");
    }

    public static final void run$9(ARunnableS7S0100002_20 aRunnableS7S0100002_20) {
        boolean zLIZ;
        C1C7U.LIZ("AlphaVideoTextureView@9a56.measureInternal$1");
        try {
            C1292130jjH c1292130jjH = (C1292130jjH) aRunnableS7S0100002_20.l0;
            c1292130jjH.LLJJIII.LIZJ(aRunnableS7S0100002_20.f1, aRunnableS7S0100002_20.f2, c1292130jjH.LLJILLL, c1292130jjH.LLJJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AlphaVideoTextureView@9a56.measureInternal$1");
    }

    public ARunnableS7S0100002_20(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
