package X;

import Y.AAListenerS133S0300000_6;
import Y.AAListenerS259S0200000_4;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS253S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428130GqZ extends FrameLayout {
    public FrameLayout LL;
    public TuxIconView LLILLJJLI;
    public C427660Gpo LLILLL;
    public TuxTextView LLILZ;
    public RelativeLayout LLILZIL;
    public final C428160Gqc LLILZLL;
    public final C428140Gqa LLIZ;
    public final InterfaceC665370Q7z LLIZLLLIL;

    public final void LIZ() {
        C428140Gqa c428140Gqa = this.LLIZ;
        if (c428140Gqa != null) {
            AnimatorSet animatorSet = c428140Gqa.LIZIZ;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = c428140Gqa.LIZJ;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = c428140Gqa.LIZLLL;
            if (animatorSet3 == null || !animatorSet3.isRunning()) {
                return;
            }
            animatorSet3.cancel();
        }
    }

    public final RelativeLayout getClEntranceContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dw0);
            this.LLILZIL = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final FrameLayout getFlIconContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i6d);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C427660Gpo getIvAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l9h);
            this.LLILLL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxIconView getIvFootprintFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lhh);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvNumberFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_number);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getAnchorPoint() {
        return getFlIconContainerFromXml();
    }

    public final void LIZIZ(AnimatorSet animatorSet) {
        C428160Gqc c428160Gqc;
        C428140Gqa c428140Gqa;
        if (getClEntranceContainerFromXml() != null && (c428160Gqc = this.LLILZLL) != null && (c428140Gqa = this.LLIZ) != null) {
            RelativeLayout clEntranceContainerFromXml = getClEntranceContainerFromXml();
            AnimatorSet animatorSet2 = c428140Gqa.LIZIZ;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                return;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428160Gqc);
            c428160Gqc.setAlpha(0.0f);
            int visibility = c428160Gqc.getVisibility();
            c428160Gqc.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c428160Gqc);
            c428160Gqc.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            View capsuleInnerView = c428160Gqc.getCapsuleInnerView();
            int i = -capsuleInnerView.getMeasuredWidth();
            int iLIZIZ = (i + 146) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) capsuleInnerView.getLayoutParams();
            marginLayoutParams.setMarginEnd(i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            C786410Ut5.W5(capsuleInnerView, marginLayoutParams);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iLIZIZ, 0);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(capsuleInnerView, 42));
            valueAnimatorOfInt.setDuration(400L);
            valueAnimatorOfInt.setStartDelay(700L);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c428160Gqc, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.setStartDelay(700L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c428160Gqc, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setStartDelay(4100L);
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, iLIZIZ);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS253S0100000_2(capsuleInnerView, 43));
            valueAnimatorOfInt2.setDuration(300L);
            valueAnimatorOfInt2.setStartDelay(4100L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfInt2);
            animatorSet3.addListener(new AAListenerS317S0100000_6(c428140Gqa, 77));
            animatorSet3.addListener(new AAListenerS259S0200000_4(capsuleInnerView, c428160Gqc, 1));
            animatorSet3.addListener(new AAListenerS133S0300000_6(c428160Gqc, capsuleInnerView, c428140Gqa, 9));
            c428140Gqa.LIZIZ = animatorSet3;
            if (animatorSet != null) {
                c428140Gqa.LIZJ = animatorSet;
            }
            C786410Ut5.LJLLLLLL(0, clEntranceContainerFromXml);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(clEntranceContainerFromXml, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(400L);
            objectAnimatorOfFloat3.setStartDelay(700L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(clEntranceContainerFromXml, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat4.setDuration(200L);
            objectAnimatorOfFloat4.setStartDelay(4200L);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(clEntranceContainerFromXml, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.4f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.4f, 1.0f));
            objectAnimatorOfPropertyValuesHolder.setDuration(200L);
            objectAnimatorOfPropertyValuesHolder.setStartDelay(4200L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LJIIIIZZ());
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfPropertyValuesHolder);
            animatorSet4.addListener(new AAListenerS317S0100000_6(clEntranceContainerFromXml, 75));
            animatorSet4.addListener(new AAListenerS317S0100000_6(clEntranceContainerFromXml, 76));
            c428140Gqa.LIZLLL = animatorSet4;
            AnimatorSet animatorSet5 = new AnimatorSet();
            AnimatorSet animatorSet6 = c428140Gqa.LIZJ;
            if (animatorSet6 == null) {
                animatorSet5.playTogether(c428140Gqa.LIZLLL, c428140Gqa.LIZIZ);
            } else {
                animatorSet5.playTogether(animatorSet6, c428140Gqa.LIZLLL, c428140Gqa.LIZIZ);
            }
            animatorSet5.start();
        }
    }

    public final void setClEntranceContainerFromXml(RelativeLayout relativeLayout) {
        this.LLILZIL = relativeLayout;
    }

    public final void setContentDescription(String str) {
        FrameLayout flIconContainerFromXml = getFlIconContainerFromXml();
        if (flIconContainerFromXml != null) {
            flIconContainerFromXml.setContentDescription(str);
        }
    }

    public final void setFlIconContainerFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setIconAvatarSize(int i) {
        C427660Gpo ivAvatarFromXml = getIvAvatarFromXml();
        if (ivAvatarFromXml.getLayoutParams().width != i || ivAvatarFromXml.getLayoutParams().height != i) {
            ViewGroup.LayoutParams layoutParams = ivAvatarFromXml.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.H6(ivAvatarFromXml, layoutParams);
        }
    }

    public final void setIconAvatarUrl(UrlModel urlModel) {
        if (urlModel == null) {
            C786410Ut5.LLLLLLZZ(getIvFootprintFromXml(), 0);
            C786410Ut5.LLLLLJIL(getIvAvatarFromXml(), 8);
        } else {
            C427660Gpo.LJIIJJI(getIvAvatarFromXml(), C438710HIf.LIZ(urlModel), false, C422830Gi1.LIZ(100), null, false, false, null, null, false, null, 1018);
            C786410Ut5.LLLLLLZZ(getIvFootprintFromXml(), 8);
            C786410Ut5.LLLLLJIL(getIvAvatarFromXml(), 0);
        }
    }

    public final void setIvAvatarFromXml(C427660Gpo c427660Gpo) {
        this.LLILLL = c427660Gpo;
    }

    public final void setIvFootprintFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setTvNumberFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setUnReadNum(int i) {
        int i2;
        RelativeLayout.LayoutParams layoutParams;
        TuxTextView tvNumberFromXml = getTvNumberFromXml();
        if (i > 0) {
            tvNumberFromXml.setText(String.valueOf(Math.min(i, 99)));
            i2 = 0;
            if (((Boolean) C267120AdS.LIZ.getValue()).booleanValue()) {
                ViewGroup.LayoutParams layoutParams2 = tvNumberFromXml.getLayoutParams();
                if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.removeRule(17);
                    layoutParams.removeRule(1);
                    layoutParams.addRule(21, -1);
                    layoutParams.addRule(11, -1);
                    if (layoutParams.getMarginStart() != 0) {
                        layoutParams.setMarginStart(0);
                    }
                    C786410Ut5.R6(tvNumberFromXml, layoutParams);
                }
            }
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(tvNumberFromXml, i2);
    }

    public C428130GqZ(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.ejp, this);
        this.LLIZLLLIL = interfaceC665370Q7z;
        this.LLIZ = new C428140Gqa(interfaceC665370Q7z);
        this.LLILZLL = (C428160Gqc) findViewById(R.id.s7o);
        C428150Gqb.LIZ(this, EnumC428940Grs.ALPHA, 0.0f);
    }
}
