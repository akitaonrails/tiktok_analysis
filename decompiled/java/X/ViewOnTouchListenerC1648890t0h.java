package X;

import Y.AAListenerS335S0100000_25;
import Y.ACListenerS159S0100000_25;
import Y.AUListenerS273S0100000_25;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import avg.f;
import kotlin.Unit;
import mf.a;

/* JADX INFO: renamed from: X.0t0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnTouchListenerC1648890t0h extends FrameLayout implements View.OnTouchListener {
    public final ViewOnTouchListenerC1648690t0N LL;
    public final C2252331DDr LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;
    public final C2252331DDr LLILZIL;
    public final C2252331DDr LLILZLL;
    public final C2252331DDr LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final C2252321DDq LLJI;
    public boolean LLJIJIL;
    public final ObjectAnimator LLJILJIL;
    public final ValueAnimator LLJILJILJ;

    public final InterfaceC346201Wa<Unit> getOnRecordStartFlow() {
        return this.LLILZ;
    }

    public final InterfaceC346201Wa<Unit> getOnRecordStopFlow() {
        return this.LLILZLL;
    }

    public final InterfaceC346201Wa<Unit> getOnTakePhotoFlow() {
        return this.LLILLJJLI;
    }

    public final InterfaceC346201Wa<Float> getOnUIRadiusChangedFlow() {
        return this.LLIZLLLIL;
    }

    public final C05YD<Long> getTimerCountdownFlow() {
        return this.LLJI;
    }

    public ViewOnTouchListenerC1648890t0h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C09IR.LIZIZ(0, 1, null, 4);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 4);
        this.LLILLL = c2252331DDrLIZIZ;
        this.LLILZ = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, null, 4);
        this.LLILZIL = c2252331DDrLIZIZ2;
        this.LLILZLL = c2252331DDrLIZIZ2;
        C2252331DDr c2252331DDrLIZIZ3 = C09IR.LIZIZ(0, 1, null, 4);
        this.LLIZ = c2252331DDrLIZIZ3;
        this.LLIZLLLIL = c2252331DDrLIZIZ3;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0L);
        this.LLJ = c2252321DDqLIZ;
        this.LLJI = c2252321DDqLIZ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.LLJILJIL = objectAnimatorOfFloat;
        this.LLJILJILJ = ValueAnimator.ofFloat(0.0f, 1.0f);
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = new ViewOnTouchListenerC1648690t0N(context, attributeSet, 0);
        C786410Ut5.n7(viewOnTouchListenerC1648690t0N, new FrameLayout.LayoutParams(-1, -1));
        addView(viewOnTouchListenerC1648690t0N);
        this.LL = viewOnTouchListenerC1648690t0N;
        View.OnClickListener aCListenerS159S0100000_25 = new ACListenerS159S0100000_25(this, 58);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS159S0100000_25) : aCListenerS159S0100000_25);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        viewOnTouchListenerC1648690t0N.setCombineTakePhoto(true);
        viewOnTouchListenerC1648690t0N.setPhotoIdleStyle(EnumC1648530t07.PHOTO);
        viewOnTouchListenerC1648690t0N.LJIILJJIL(3, true, true, false);
        viewOnTouchListenerC1648690t0N.setEnablePressRecording(false);
        viewOnTouchListenerC1648690t0N.setRecordListener(new InterfaceC1648710t0P() { // from class: X.0t0i
            @Override // X.InterfaceC1648710t0P
            public final boolean O0() {
                return false;
            }

            @Override // X.InterfaceC1648710t0P
            public final void Q2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void R2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void S2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void U2(float f, float f2) {
            }

            @Override // X.InterfaceC1648710t0P
            public final void V2(boolean z) {
            }

            @Override // X.InterfaceC1648710t0P
            public final void W2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void p2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void y2(EnumC1448830no1 enumC1448830no1) {
            }

            @Override // X.InterfaceC1648710t0P
            public final void T2(boolean z) {
                ViewOnTouchListenerC1648890t0h viewOnTouchListenerC1648890t0h = this.LIZ;
                if (viewOnTouchListenerC1648890t0h.LLJIJIL) {
                    return;
                }
                viewOnTouchListenerC1648890t0h.LLJIJIL = true;
                viewOnTouchListenerC1648890t0h.LLILLL.LIZJ(Unit.LIZ);
                ViewOnTouchListenerC1648890t0h viewOnTouchListenerC1648890t0h2 = this.LIZ;
                ValueAnimator valueAnimator = viewOnTouchListenerC1648890t0h2.LLJILJILJ;
                valueAnimator.setDuration(2000L);
                valueAnimator.addUpdateListener(new AUListenerS273S0100000_25(viewOnTouchListenerC1648890t0h2, 7));
                valueAnimator.addListener(new AAListenerS335S0100000_25(viewOnTouchListenerC1648890t0h2, 4));
                valueAnimator.setInterpolator(C1619980sG4.LJIIIZ());
                this.LIZ.LLJILJILJ.start();
                C786410Ut5.Pd(this.LIZ.LLJILJIL);
            }
        });
        viewOnTouchListenerC1648690t0N.setRecordLayoutUIChangedListener(new InterfaceC1648720t0Q() { // from class: X.0t0k
            @Override // X.InterfaceC1648720t0Q
            public final void LIZ(float f) {
                this.LIZ.LLIZ.LIZJ(Float.valueOf(f));
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.LL.onTouch(view, motionEvent);
        return false;
    }
}
