package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376320EpC extends AppCompatImageView {
    public int LL;
    public int LLILLJJLI;
    public InterfaceC371150Egr LLILLL;
    public final C01GW LLILZ;
    public ViewGroup.MarginLayoutParams LLILZIL;
    public float LLILZLL;

    public final ViewGroup.MarginLayoutParams getParams() {
        if (this.LLILZIL == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            this.LLILZIL = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        }
        return this.LLILZIL;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final int getMaxStartMargin() {
        return this.LLILLJJLI;
    }

    public final int getMinStartMargin() {
        return this.LL;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        float rawX;
        float rawX2;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILZLL = motionEvent.getRawX();
                ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
                viewPropertyAnimatorAnimate.scaleX(1.1f);
                viewPropertyAnimatorAnimate.scaleY(1.1f);
                viewPropertyAnimatorAnimate.setDuration(50L);
                viewPropertyAnimatorAnimate.start();
            } else if (numValueOf.intValue() == 2) {
                ViewGroup.MarginLayoutParams params = getParams();
                if (params == null) {
                    return true;
                }
                int marginStart = params.getMarginStart();
                if (((Boolean) this.LLILZ.getValue()).booleanValue()) {
                    rawX = this.LLILZLL;
                    rawX2 = motionEvent.getRawX();
                } else {
                    rawX = motionEvent.getRawX();
                    rawX2 = this.LLILZLL;
                }
                params.setMarginStart(marginStart + ((int) (rawX - rawX2)));
                params.setMarginStart(Math.max(this.LL, params.getMarginStart()));
                params.setMarginStart(Math.min(this.LLILLJJLI, params.getMarginStart()));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(params);
                this.LLILZLL = motionEvent.getRawX();
                InterfaceC371150Egr interfaceC371150Egr = this.LLILLL;
                if (interfaceC371150Egr != null) {
                    int marginStart2 = params.getMarginStart();
                    int i = this.LL;
                    interfaceC371150Egr.LIZJ((marginStart2 - i) / (this.LLILLJJLI - i));
                    return true;
                }
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = animate();
                viewPropertyAnimatorAnimate2.scaleX(1.0f);
                viewPropertyAnimatorAnimate2.scaleY(1.0f);
                viewPropertyAnimatorAnimate2.setDuration(50L);
                viewPropertyAnimatorAnimate2.start();
                return true;
            }
        }
        return true;
    }

    public final void setMaxStartMargin(int i) {
        this.LLILLJJLI = i;
    }

    public final void setMinStartMargin(int i) {
        this.LL = i;
    }

    public final void setOnProgressChangedListener(InterfaceC371150Egr interfaceC371150Egr) {
        this.LLILLL = interfaceC371150Egr;
    }

    public final void setProgress(final float f) {
        if (getParams() == null) {
            HandlerHook.viewPost(this, new Runnable() { // from class: X.0EpE
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TrackCursorView@fcd6.setProgress$1");
                    try {
                        ViewGroup.MarginLayoutParams params = this.LL.getParams();
                        if (params != null) {
                            params.setMarginStart(this.LL.getMinStartMargin() + ((int) ((this.LL.getMaxStartMargin() - this.LL.getMinStartMargin()) * f)));
                        }
                        C376320EpC c376320EpC = this.LL;
                        ViewGroup.MarginLayoutParams params2 = c376320EpC.getParams();
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376320EpC);
                        c376320EpC.setLayoutParams(params2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TrackCursorView@fcd6.setProgress$1");
                }
            });
            return;
        }
        ViewGroup.MarginLayoutParams params = getParams();
        if (params != null) {
            params.setMarginStart(this.LL + ((int) ((this.LLILLJJLI - r1) * f)));
        }
        ViewGroup.MarginLayoutParams params2 = getParams();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(params2);
    }

    public C376320EpC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C376320EpC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = Integer.MIN_VALUE;
        this.LLILLJJLI = Integer.MAX_VALUE;
        this.LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 716));
    }
}
