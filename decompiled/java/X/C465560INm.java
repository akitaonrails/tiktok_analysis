package X;

import Y.ALAdapterS2S0300000_7;
import Y.AUListenerS0S0300001_7;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.widget.LiveSlideUpGuideWidget;

/* JADX INFO: renamed from: X.0INm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465560INm {
    public final InterfaceC465570INn LIZ;
    public ValueAnimator LIZIZ;
    public ValueAnimator LIZJ;
    public boolean LIZLLL;
    public Float LJ;
    public boolean LJFF;

    public C465560INm(C0IQV c0iqv) {
        this.LIZ = c0iqv;
    }

    public static Float LIZ(LivePlayFragment livePlayFragment) {
        View view;
        if (livePlayFragment != null && (view = livePlayFragment.getView()) != null) {
            return Float.valueOf(view.getTranslationY());
        }
        return null;
    }

    public final void LIZIZ(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2) {
        Float fLIZ = LIZ(livePlayFragment);
        if (fLIZ != null || (fLIZ = LIZ(livePlayFragment2)) != null) {
            float fFloatValue = fLIZ.floatValue();
            if (fFloatValue != 0.0f && livePlayFragment != null && livePlayFragment2 != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, 0.0f);
                this.LIZJ = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setDuration(Math.abs((long) fFloatValue));
                }
                ValueAnimator valueAnimator = this.LIZJ;
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new AUListenerS0S0300001_7(fFloatValue, this, livePlayFragment, livePlayFragment2, 0));
                }
                ValueAnimator valueAnimator2 = this.LIZJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.addListener(new ALAdapterS2S0300000_7(this, livePlayFragment2, livePlayFragment, 0));
                }
                this.LJFF = false;
                ValueAnimator valueAnimator3 = this.LIZJ;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
        }
    }

    public final void LIZJ(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2) {
        Float fLIZ = LIZ(livePlayFragment);
        if (livePlayFragment != null && livePlayFragment2 != null && fLIZ != null) {
            this.LIZLLL = false;
            livePlayFragment2.QV(C497740JfY.LJIJI(2131844517));
            float f = -C418440Gaw.LIZIZ(90);
            float fAbs = Math.abs(f - fLIZ.floatValue());
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fLIZ.floatValue(), f);
            this.LIZIZ = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(500L);
            }
            ValueAnimator valueAnimator = this.LIZIZ;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new AUListenerS0S0300001_7(fAbs, this, livePlayFragment, livePlayFragment2, 1));
            }
            ValueAnimator valueAnimator2 = this.LIZIZ;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new ALAdapterS2S0300000_7(this, livePlayFragment, livePlayFragment2, 1));
            }
            this.LJFF = true;
            ValueAnimator valueAnimator3 = this.LIZIZ;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("draw_guide_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(C466640IRq.LIZJ().LIZLLL(), "request_page");
            c474500IjALIZ.LJJII("low", "strength");
            c474500IjALIZ.LJJII("new", "type");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZLLL(float f, float f2, LivePlayFragment livePlayFragment) {
        View view = livePlayFragment.getView();
        if (view != null) {
            C786410Ut5.ed(view, f);
        }
        LiveSlideUpGuideWidget liveSlideUpGuideWidget = livePlayFragment.M;
        if (liveSlideUpGuideWidget != null) {
            liveSlideUpGuideWidget.x1(f2);
        }
    }
}
