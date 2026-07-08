package Y;

import X.C112W;
import X.C112X;
import X.C12Y9;
import X.C1388190mED;
import X.C1390380mHk;
import X.C1401730ma3;
import X.C19419410yG;
import X.C194355112b;
import X.C19724112Fb;
import X.C19724512Ff;
import X.C426750GoL;
import X.InterfaceC19724212Fc;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ATListenerS348S0200000_29 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS348S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS348S0200000_29 aTListenerS348S0200000_29, View view, MotionEvent motionEvent) {
        InterfaceC19724212Fc onSliderListener;
        float f;
        int min;
        C19724112Fb c19724112Fb = (C19724112Fb) aTListenerS348S0200000_29.l0;
        boolean z = false;
        if (c19724112Fb.LLJLIL > 0) {
            int max = c19724112Fb.getMax() - ((((C19724112Fb) aTListenerS348S0200000_29.l0).getMax() - ((C19724112Fb) aTListenerS348S0200000_29.l0).getMin()) % ((C19724112Fb) aTListenerS348S0200000_29.l0).getStep());
            C19724112Fb c19724112Fb2 = (C19724112Fb) aTListenerS348S0200000_29.l0;
            c19724112Fb2.LLJJIII = true;
            if (C426750GoL.LJ(c19724112Fb2)) {
                float x = ((C19724112Fb) aTListenerS348S0200000_29.l0).LLJL - motionEvent.getX();
                float min2 = max - ((C19724112Fb) aTListenerS348S0200000_29.l0).getMin();
                f = min2 * (x / r1.LLJLIL);
                min = ((C19724112Fb) aTListenerS348S0200000_29.l0).getMin();
            } else {
                float x2 = motionEvent.getX();
                float f2 = x2 - r1.LLJJLIIIJLLLLLLLZ;
                float min3 = max - ((C19724112Fb) aTListenerS348S0200000_29.l0).getMin();
                f = min3 * (f2 / r1.LLJLIL);
                min = ((C19724112Fb) aTListenerS348S0200000_29.l0).getMin();
            }
            c19724112Fb2.setIndicator((int) (((double) (f + min)) + 0.5d));
            ((C19724112Fb) aTListenerS348S0200000_29.l0).LLJJIII = false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (onSliderListener = ((C19724112Fb) aTListenerS348S0200000_29.l0).getOnSliderListener()) != null) {
                onSliderListener.LIZ((C19724112Fb) aTListenerS348S0200000_29.l0);
            }
        } else {
            InterfaceC19724212Fc onSliderListener2 = ((C19724112Fb) aTListenerS348S0200000_29.l0).getOnSliderListener();
            if (onSliderListener2 != null) {
                onSliderListener2.LIZIZ((C19724112Fb) aTListenerS348S0200000_29.l0);
            }
        }
        View.OnTouchListener onTouchListener = (View.OnTouchListener) aTListenerS348S0200000_29.l1;
        if (onTouchListener != null && !onTouchListener.onTouch(view, motionEvent)) {
            z = true;
        }
        return !z;
    }

    public static final boolean onTouch$1(ATListenerS348S0200000_29 aTListenerS348S0200000_29, View view, MotionEvent motionEvent) {
        C194355112b c194355112b;
        C112X c112x = (C112X) aTListenerS348S0200000_29.l0;
        View view2 = (View) aTListenerS348S0200000_29.l1;
        int adapterPosition = c112x.getAdapterPosition();
        if (-1 == adapterPosition || ((EffectModel) ListProtector.get(c112x.LLIZ.LLILLJJLI, adapterPosition)).isGoToCapCutEffect) {
            return false;
        }
        int action = motionEvent.getAction();
        C112W c112w = c112x.LLIZ;
        if (!c112w.LLILZIL && (action == 5 || action == 0)) {
            Activity activityLIZ = C1388190mED.LIZ(view2.getContext());
            if (activityLIZ != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131837605);
                C1390380mHk.LIZ(activityLIZ, 1010, creativeToastBuilder);
            }
        } else if (action != 0) {
            if ((action == 1 || action == 3) && ((c194355112b = c112w.LLILZ) == null || c194355112b.LIZ(1, adapterPosition, (EffectModel) ListProtector.get(c112w.LLILLJJLI, adapterPosition)))) {
                c112x.LLILLL.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
        } else {
            C194355112b c194355112b2 = c112w.LLILZ;
            if (c194355112b2 == null || c194355112b2.LIZ(0, adapterPosition, (EffectModel) ListProtector.get(c112w.LLILLJJLI, adapterPosition))) {
                c112x.LLILLL.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100L).start();
            }
        }
        return true;
    }

    public static final boolean onTouch$2(ATListenerS348S0200000_29 aTListenerS348S0200000_29, View view, MotionEvent motionEvent) {
        float f;
        C19724512Ff c19724512Ff = (C19724512Ff) aTListenerS348S0200000_29.l0;
        if (c19724512Ff.LLJJJJLIIL > 0) {
            int i = c19724512Ff.LLJJIJI;
            c19724512Ff.getClass();
            C19724512Ff c19724512Ff2 = (C19724512Ff) aTListenerS348S0200000_29.l0;
            int i2 = i - (i % c19724512Ff2.LLJJIJIIJIL);
            if (C426750GoL.LJ(c19724512Ff2)) {
                float x = ((C19724512Ff) aTListenerS348S0200000_29.l0).LLJJJJJIL - motionEvent.getX();
                ((C19724512Ff) aTListenerS348S0200000_29.l0).getClass();
                f = i2 * (x / r1.LLJJJJLIIL);
                ((C19724512Ff) aTListenerS348S0200000_29.l0).getClass();
            } else {
                float x2 = motionEvent.getX();
                float f2 = x2 - r1.LLJJJJ;
                ((C19724512Ff) aTListenerS348S0200000_29.l0).getClass();
                f = i2 * (f2 / r1.LLJJJJLIIL);
                ((C19724512Ff) aTListenerS348S0200000_29.l0).getClass();
            }
            c19724512Ff2.setIndicator((int) (((double) (f + 0)) + 0.5d));
        }
        View.OnTouchListener onTouchListener = (View.OnTouchListener) aTListenerS348S0200000_29.l1;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return true;
    }

    public static final boolean onTouch$3(ATListenerS348S0200000_29 aTListenerS348S0200000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                C1401730ma3 c1401730ma3 = (C1401730ma3) aTListenerS348S0200000_29.l0;
                ViewGroup viewGroup = (ViewGroup) aTListenerS348S0200000_29.l1;
                c1401730ma3.getClass();
                viewGroup.clearAnimation();
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(c1401730ma3.LIZ, R.anim.bt);
                animationLoadAnimation.setAnimationListener(new C12Y9(c1401730ma3, 0));
                viewGroup.startAnimation(animationLoadAnimation);
                return false;
            }
            return false;
        }
        C1401730ma3 c1401730ma32 = (C1401730ma3) aTListenerS348S0200000_29.l0;
        ViewGroup viewGroup2 = (ViewGroup) aTListenerS348S0200000_29.l1;
        C19419410yG c19419410yG = c1401730ma32.LIZLLL;
        viewGroup2.clearAnimation();
        if (c19419410yG != null) {
            c19419410yG.LIZ(AFwS218S0000000_29.get$arr$(403));
        }
        viewGroup2.startAnimation(AnimationUtils.loadAnimation(c1401730ma32.LIZ, R.anim.bs));
        return false;
    }

    public static final boolean onTouch$4(ATListenerS348S0200000_29 aTListenerS348S0200000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                C1401730ma3 c1401730ma3 = (C1401730ma3) aTListenerS348S0200000_29.l0;
                ViewGroup viewGroup = (ViewGroup) aTListenerS348S0200000_29.l1;
                c1401730ma3.getClass();
                viewGroup.clearAnimation();
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(c1401730ma3.LIZ, R.anim.bt);
                animationLoadAnimation.setAnimationListener(new C12Y9(c1401730ma3, 0));
                viewGroup.startAnimation(animationLoadAnimation);
                return false;
            }
            return false;
        }
        C1401730ma3 c1401730ma32 = (C1401730ma3) aTListenerS348S0200000_29.l0;
        ViewGroup viewGroup2 = (ViewGroup) aTListenerS348S0200000_29.l1;
        C19419410yG c19419410yG = c1401730ma32.LJ;
        viewGroup2.clearAnimation();
        if (c19419410yG != null) {
            c19419410yG.LIZ(AFwS218S0000000_29.get$arr$(403));
        }
        viewGroup2.startAnimation(AnimationUtils.loadAnimation(c1401730ma32.LIZ, R.anim.bs));
        return false;
    }
}
