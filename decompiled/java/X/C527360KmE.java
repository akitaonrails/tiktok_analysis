package X;

import Y.ARunnableS108S0100000_8;
import Y.AUListenerS258S0100000_8;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0KmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527360KmE extends LinearLayout {
    public C1295960jpS LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public String LLILZIL;
    public final BPEAHandler LLILZLL;
    public C0L98 LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public float LLJI;

    public final void LIZJ() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(1.0f, 0.7f);
        valueAnimatorOfFloat.setDuration(250L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.7f, 1.1f);
        valueAnimatorOfFloat2.setDuration(300L);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.1f, 0.98f);
        valueAnimatorOfFloat3.setDuration(200L);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.98f, 1.0f);
        valueAnimatorOfFloat4.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(C1619980sG4.LIZLLL());
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        for (Animator animator : animatorSet.getChildAnimations()) {
            if ((animator instanceof ValueAnimator) && (valueAnimator = (ValueAnimator) animator) != null) {
                valueAnimator.addUpdateListener(new AUListenerS258S0100000_8(this, 1));
            }
        }
        animatorSet.start();
    }

    private final ObjectAnimator getHideAnim() {
        return (ObjectAnimator) this.LLJ.getValue();
    }

    public final C1295960jpS getLottieAnimationViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nr9);
            this.LL = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public final ObjectAnimator getShowAnim() {
        return (ObjectAnimator) this.LLIZLLLIL.getValue();
    }

    public final void LIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLILZLL.removeCallbacksAndMessages(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZLL.removeCallbacksAndMessages(null);
    }

    public final void LIZIZ(String str) {
        TuxIconView tuxIconView;
        int i;
        this.LLILZIL = str;
        this.LLILLJJLI = C786410Ut5.Sd(R.layout.bzl, C786410Ut5.ne(getContext()), this);
        C1295960jpS lottieAnimationViewFromXml = getLottieAnimationViewFromXml();
        if (lottieAnimationViewFromXml != null) {
            lottieAnimationViewFromXml.setAnimation(R.raw.tux_lottie_common_creation_toolicon_guide_red);
        }
        View view = this.LLILLJJLI;
        TuxTextView tuxTextView = null;
        if (view != null) {
            tuxIconView = (TuxIconView) view.findViewById(R.id.h_4);
        } else {
            tuxIconView = null;
        }
        this.LLILZ = tuxIconView;
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            tuxTextView = (TuxTextView) view2.findViewById(R.id.cvr);
        }
        this.LLILLL = tuxTextView;
        if (tuxTextView != null) {
            Context context = getContext();
            C527340KmC.LIZ.getClass();
            if (((Boolean) C272870Amj.LIZ.getValue()).booleanValue()) {
                i = 2131833364;
            } else {
                i = 2131833437;
            }
            tuxTextView.setText(context.getString(i));
        }
    }

    public final void setContentAlpha(float f) {
        this.LLJI = f;
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    public final void setLottieAnimationViewFromXml(C1295960jpS c1295960jpS) {
        this.LL = c1295960jpS;
    }

    public final void setTextColor(int i) {
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public C527360KmE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = "";
        this.LLILZLL = new BPEAHandler(Looper.getMainLooper());
        this.LLIZ = C0L98.NONE;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 183));
        this.LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 182));
        this.LLJI = 1.0f;
    }

    public final void LIZLLL(ShortVideoContext shortVideoContext, String str) {
        String str2;
        if (this.LLIZ == C0L98.HIDING) {
            getHideAnim().cancel();
        } else if (getVisibility() == 0) {
            return;
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C786410Ut5.LJLIIL(100L, this.LLILZLL, new ARunnableS108S0100000_8(this, 18));
        this.LLIZ = C0L98.SHOWING;
        if (TextUtils.equals(str, this.LLILZIL)) {
            String creationId = null;
            if (shortVideoContext != null) {
                str2 = shortVideoContext.shootWay;
                creationId = shortVideoContext.getCreationId();
            } else {
                str2 = null;
            }
            C527340KmC.LIZLLL(str, str2, creationId);
        }
    }
}
