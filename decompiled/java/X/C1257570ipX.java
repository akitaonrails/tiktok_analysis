package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0ipX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257570ipX extends LinearLayout {
    public TuxIconView LL;
    public boolean LLILLJJLI;
    public final ValueAnimator LLILLL;
    public final ValueAnimator LLILZ;
    public boolean LLILZIL;

    public final TuxIconView getJustWatchedIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m1j);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void LIZ() {
        TuxIconView justWatchedIconFromXml = getJustWatchedIconFromXml();
        C786410Ut5.Fb(justWatchedIconFromXml, 0.0f);
        justWatchedIconFromXml.setIconRes(R.raw.icon_spinner_normal);
        justWatchedIconFromXml.setIconHeight(C1216270hkv.LIZIZ(16));
        justWatchedIconFromXml.setIconWidth(C1216270hkv.LIZIZ(16));
        float f = 8;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 1080.0f, C1216270hkv.LIZ(f), C1216270hkv.LIZ(f));
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setDuration(3000L);
        rotateAnimation.setAnimationListener(new AnimationAnimationListenerC1265820j2q(this, 0));
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        getJustWatchedIconFromXml().startAnimation(rotateAnimation);
    }

    public final void LIZIZ() {
        if (C299890BpD.LIZ()) {
            this.LLILLL.cancel();
        }
        getJustWatchedIconFromXml().clearAnimation();
        this.LLILLJJLI = false;
        this.LLILZ.start();
    }

    public final void LIZJ(boolean z) {
        if (C299890BpD.LIZ()) {
            if (this.LLILLJJLI) {
                LIZ();
                return;
            }
            this.LLILZ.cancel();
        }
        TuxIconView justWatchedIconFromXml = getJustWatchedIconFromXml();
        C786410Ut5.Fb(justWatchedIconFromXml, 0.0f);
        justWatchedIconFromXml.setIconRes(R.raw.icon_chevron_down_double_fill);
        justWatchedIconFromXml.setIconHeight(C1216270hkv.LIZIZ(12));
        justWatchedIconFromXml.setIconWidth(C1216270hkv.LIZIZ(12));
        this.LLILZIL = z;
        if (z) {
            C786410Ut5.Fb(getJustWatchedIconFromXml(), 180.0f);
            this.LLILZIL = z;
        }
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        if (!this.LLILLL.isRunning() && !this.LLILLL.isStarted()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(3, "opt_platform_view_exp_value");
            C20684815ws.LJIILLIIL("profile_just_watched_animation", c2344009Gk.LIZ);
            this.LLILLL.start();
        }
    }

    public final void setJustWatchedIconFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public C1257570ipX(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.ei_, C786410Ut5.ne(context), this);
        C427690Gpr.LJ(this, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0mHE
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (this.LL.getLayoutParams() instanceof C1CRC) {
                    C1CRC c1crc = (C1CRC) this.LL.getLayoutParams();
                    String strK4 = C786410Ut5.k4(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(50 * fFloatValue)}, 1));
                    Context context2 = context;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("100% - ");
                    sbLIZ.append(strK4);
                    sbLIZ.append("dp");
                    c1crc.LIZLLL = C2230281CQw.LIZ(context2, C2188811AlT.LIZIZ(sbLIZ), "bottom");
                    C1257570ipX c1257570ipX = this.LL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1257570ipX);
                    c1257570ipX.setLayoutParams(c1crc);
                }
                C1257570ipX c1257570ipX2 = this.LL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1257570ipX2);
                c1257570ipX2.setAlpha(fFloatValue);
            }
        });
        this.LLILLL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(500L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0mHD
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (this.LL.getLayoutParams() instanceof C1CRC) {
                    C1CRC c1crc = (C1CRC) this.LL.getLayoutParams();
                    String strK4 = C786410Ut5.k4(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(50 * fFloatValue)}, 1));
                    Context context2 = context;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("100% - ");
                    sbLIZ.append(strK4);
                    sbLIZ.append("dp");
                    c1crc.LIZLLL = C2230281CQw.LIZ(context2, C2188811AlT.LIZIZ(sbLIZ), "bottom");
                    C1257570ipX c1257570ipX = this.LL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1257570ipX);
                    c1257570ipX.setLayoutParams(c1crc);
                }
                C1257570ipX c1257570ipX2 = this.LL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1257570ipX2);
                c1257570ipX2.setAlpha(fFloatValue);
            }
        });
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: X.0ipq
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1257570ipX c1257570ipX = this.LL;
                int visibility = c1257570ipX.getVisibility();
                c1257570ipX.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1257570ipX);
            }
        });
        this.LLILZ = valueAnimatorOfFloat2;
    }
}
