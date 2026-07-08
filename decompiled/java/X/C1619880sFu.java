package X;

import X.C1619880sFu;
import X.C1C7U;
import Y.AAListenerS273S0200000_24;
import Y.AAListenerS317S0100000_6;
import Y.AAListenerS334S0100000_24;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS28S0110000_9;
import Y.ARunnableS93S0200000_24;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupGuideController$uiHandler$1;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619880sFu {
    public final View LIZ;
    public final EdgeSpeedupAbility LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C0GRU LJ;
    public final C0GRT LJFF;
    public final C21415018rM LJI;
    public final TuxIconView LJII;
    public final View LJIIIIZZ;
    public ValueAnimator LJIIIZ;
    public Animator LJIIJ;
    public Animator LJIIJJI;
    public boolean LJIIL;
    public Function0<Unit> LJIILIIL;
    public Layout LJIILJJIL;
    public final ARunnableS124S0100000_24 LJIILL;
    public boolean LJIILLIIL;
    public final EdgeSpeedupGuideController$uiHandler$1 LJIIZILJ;

    public final void LIZLLL() {
        View view = this.LJIIIIZZ;
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.addListener(new AAListenerS273S0200000_24(view, this, 1));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final void LJ() {
        View view = this.LJIIIIZZ;
        if (view != null) {
            ARunnableS93S0200000_24 aRunnableS93S0200000_24 = new ARunnableS93S0200000_24(view, this, 10);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.addListener(new AAListenerS334S0100000_24(aRunnableS93S0200000_24, 1));
            objectAnimatorOfFloat.addListener(new AAListenerS334S0100000_24(aRunnableS93S0200000_24, 0));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final void LJFF() {
        removeCallbacksAndMessages(null);
        ValueAnimator valueAnimator = this.LJIIIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Animator animator = this.LJIIJ;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJIIJJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
    }

    public final void LJI() {
        TextPaint paint;
        if (this.LJIILLIIL) {
            View view = this.LJIIIIZZ;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            ValueAnimator valueAnimator = this.LJIIIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            Layout layout = this.LJIILJJIL;
            if (layout != null && (paint = layout.getPaint()) != null) {
                paint.setShader(null);
            }
            C21415018rM c21415018rM = this.LJI;
            if (c21415018rM != null) {
                c21415018rM.invalidate();
            }
            this.LJIILLIIL = false;
        } else {
            View view2 = this.LJIIIIZZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                C786410Ut5.T4(view2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
        }
        C0GRT c0grt = this.LJFF;
        if (c0grt != null) {
            int visibility = c0grt.getVisibility();
            c0grt.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0grt);
        }
        C0GRU c0gru = this.LJ;
        if (c0gru != null) {
            int visibility2 = c0gru.getVisibility();
            c0gru.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, c0gru);
        }
        View view3 = this.LJIIIIZZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        this.LJIIL = true;
        LIZJ(this.LJFF);
        LIZJ(this.LJ);
        LJII();
        EdgeSpeedupGuideController$uiHandler$1 edgeSpeedupGuideController$uiHandler$1 = this.LJIIZILJ;
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        edgeSpeedupGuideController$uiHandler$1.sendMessageDelayed(messageObtain, 3000L);
        Keva keva = C0C2Y.LIZ;
        keva.storeInt("new_user_guide_shown_count", keva.getInt("new_user_guide_shown_count", 0) + 1);
        keva.storeLong("last_new_user_guide_shown_time", System.currentTimeMillis());
        C20684815ws.LJFF().execute(new ARunnableS28S0110000_9(this, false, 3));
    }

    public final void LJII() {
        Animator animator = this.LJIIJ;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJIIJJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.addListener(new AAListenerS334S0100000_24(this, 2));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final boolean LIZ() {
        if (C300710BqX.LIZ()) {
            return false;
        }
        return this.LIZIZ.aW1() || this.LJIIL;
    }

    public static Animator LIZIZ(TuxIconView tuxIconView) {
        float f;
        if (tuxIconView == null) {
            return null;
        }
        if (C426750GoL.LIZLLL(tuxIconView.getContext())) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.Ob(tuxIconView, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "alpha", 0.0f, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(tuxIconView, 61));
        return objectAnimatorOfFloat;
    }

    public static void LIZJ(View view) {
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(1500L);
            objectAnimatorOfFloat.setRepeatCount(1);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupGuideController$uiHandler$1] */
    public C1619880sFu(VideoSeekBarMaskView videoSeekBarMaskView, EdgeSpeedupAbility edgeSpeedupAbility, String str, String str2) {
        View viewLIZ;
        C21415018rM c21415018rM;
        View viewLIZ2;
        C0GRU c0gru;
        C0GRT c0grt;
        TuxIconView tuxIconView;
        Number numberValueOf;
        int iIntValue;
        this.LIZ = videoSeekBarMaskView;
        this.LIZIZ = edgeSpeedupAbility;
        this.LIZJ = str;
        this.LIZLLL = str2;
        float fLIZIZ = C418440Gaw.LIZIZ(18);
        this.LJIILL = new ARunnableS124S0100000_24(this, 147);
        ViewStub viewStub = (ViewStub) C520680KbS.LIZ(R.id.vs_edge_speedup_guide, videoSeekBarMaskView);
        if (viewStub != null) {
            viewLIZ = C786410Ut5.LJLLLL(viewStub);
        } else {
            viewLIZ = C520680KbS.LIZ(R.id.gna, videoSeekBarMaskView);
        }
        this.LJIIIIZZ = viewLIZ;
        if (viewLIZ != null) {
            c21415018rM = (C21415018rM) C520680KbS.LIZ(R.id.jdm, viewLIZ);
        } else {
            c21415018rM = null;
        }
        this.LJI = c21415018rM;
        if (viewLIZ != null) {
            viewLIZ2 = C520680KbS.LIZ(R.id.jdn, viewLIZ);
            c0gru = (C0GRU) C520680KbS.LIZ(R.id.mkr, viewLIZ);
        } else {
            viewLIZ2 = null;
            c0gru = null;
        }
        this.LJ = c0gru;
        if (viewLIZ != null) {
            c0grt = (C0GRT) C520680KbS.LIZ(R.id.tm3, viewLIZ);
        } else {
            c0grt = null;
        }
        this.LJFF = c0grt;
        if (viewLIZ != null) {
            tuxIconView = (TuxIconView) C520680KbS.LIZ(R.id.jde, viewLIZ);
        } else {
            tuxIconView = null;
        }
        this.LJII = tuxIconView;
        TuxIconView tuxIconView2 = viewLIZ != null ? (TuxIconView) C520680KbS.LIZ(R.id.jcc, viewLIZ) : null;
        this.LJIIJ = LIZIZ(tuxIconView);
        this.LJIIJJI = LIZIZ(tuxIconView2);
        int iLIZJ = C497820Jfg.LIZJ(videoSeekBarMaskView.getContext());
        float fLIZIZ2 = C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL));
        HomePageCommonService homePageCommonService = (HomePageCommonService) PluggableExtentionKt.pluggableSpi$default(HomePageCommonService.class, false, false, false, 14, null);
        if (homePageCommonService != null) {
            numberValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(homePageCommonService.LIZ())));
        } else {
            numberValueOf = Integer.valueOf((int) C418440Gaw.LIZIZ(58));
        }
        if (viewLIZ2 != null) {
            C426750GoL.LJIIIZ(viewLIZ2, null, Integer.valueOf(numberValueOf.intValue() + iLIZJ + ((int) C418440Gaw.LIZIZ(16))), null, null, false, 29);
        }
        if (c0gru != null) {
            C426750GoL.LJIIIZ(c0gru, null, null, null, Integer.valueOf((int) fLIZIZ2), false, 23);
        }
        if (c0grt != null) {
            C426750GoL.LJIIIZ(c0grt, null, null, null, Integer.valueOf((int) fLIZIZ2), false, 23);
        }
        float width = (videoSeekBarMaskView.getWidth() * 0.15f) + C418440Gaw.LIZIZ(24);
        if (viewLIZ2 != null) {
            int i = (int) width;
            C426750GoL.LJIIIZ(viewLIZ2, Integer.valueOf(i), null, Integer.valueOf(i), null, false, 26);
        }
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJ = (int) (((videoSeekBarMaskView.getWidth() * 0.7f) - C418440Gaw.LIZIZ(48)) - fLIZIZ);
        c444830HcP.LJIILIIL(videoSeekBarMaskView.getContext().getString(2131835517));
        c444830HcP.LJII(42);
        c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_CENTER;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, videoSeekBarMaskView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c444830HcP.LJIILJJIL(iIntValue);
        c444830HcP.LJIIIZ(2);
        boolean z = C444830HcP.LJIIJJI;
        Layout layoutLIZJ = C444830HcP.LIZJ(c444830HcP, 0.2f, true, C431830GwX.LIZ(c444830HcP, 15, 12), 24);
        this.LJIILJJIL = layoutLIZJ;
        if (layoutLIZJ.getLineCount() != 1) {
            if (tuxIconView != null) {
                C339190DRl.LIZIZ(tuxIconView);
            }
            if (tuxIconView2 != null) {
                C339190DRl.LIZIZ(tuxIconView2);
            }
            Animator animator = this.LJIIJ;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.LJIIJJI;
            if (animator2 != null) {
                animator2.cancel();
            }
            c444830HcP.LIZIZ.LJ = (int) ((videoSeekBarMaskView.getWidth() * 0.7f) - C418440Gaw.LIZIZ(48));
            this.LJIILJJIL = C444830HcP.LIZJ(c444830HcP, 0.2f, true, C431830GwX.LIZ(c444830HcP, 15, 12), 24);
        }
        if (c21415018rM != null) {
            c21415018rM.setTextLayout(this.LJIILJJIL);
        }
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIZILJ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupGuideController$uiHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                MotionEvent motionEvent;
                C1C7U.LIZ("EdgeSpeedupGuideController@e9dd.uiHandler$1");
                super.handleMessage(message);
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        C1619880sFu c1619880sFu = this.LL;
                        c1619880sFu.LJIIZILJ.removeMessages(1);
                        Function0<Unit> function0 = c1619880sFu.LJIILIIL;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        c1619880sFu.LJIIL = false;
                        c1619880sFu.LJIILIIL = null;
                        this.LL.LIZLLL();
                    }
                } else {
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    if ((messageObj instanceof MotionEvent) && (motionEvent = (MotionEvent) messageObj) != null) {
                        this.LL.LIZIZ.fs(motionEvent.getX(), motionEvent.getY());
                    }
                    this.LL.LJIIL = false;
                }
                C1C7U.LIZIZ("EdgeSpeedupGuideController@e9dd.uiHandler$1");
            }
        };
    }
}
