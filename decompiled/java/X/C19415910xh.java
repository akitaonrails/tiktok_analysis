package X;

import Y.AAListenerS339S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19415910xh extends C12O8 {
    public final View LJ;
    public final ImageView LJFF;
    public final TextView LJI;
    public final C16F5 LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final ConstraintLayout LJIIJ;
    public final C01GW LJIIJJI;

    @Override // X.C12O8
    public final int LJIIIZ() {
        return 74;
    }

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 1;
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
    }

    public final InterpolatorC2268801DrC LJIJJ() {
        return (InterpolatorC2268801DrC) this.LJIIJJI.getValue();
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        final long j = LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 120L;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJFF, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(LJIJJ());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.5f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(LJIJJ());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 58));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.5f, 1.6f);
        valueAnimatorOfFloat2.setDuration(j);
        valueAnimatorOfFloat2.setInterpolator(LJIJJ());
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(this, 59));
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.10xg
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                View view;
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                long j2 = j;
                C19415910xh c19415910xh = this.LL;
                valueAnimatorOfFloat3.setDuration(j2);
                valueAnimatorOfFloat3.setInterpolator(c19415910xh.LJIJJ());
                valueAnimatorOfFloat3.addUpdateListener(new AUListenerS277S0100000_29(c19415910xh, 56));
                valueAnimatorOfFloat3.start();
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.6f, 1.0f);
                long j3 = j;
                C19415910xh c19415910xh2 = this.LL;
                valueAnimatorOfFloat4.setDuration(j3);
                valueAnimatorOfFloat4.setInterpolator(c19415910xh2.LJIJJ());
                valueAnimatorOfFloat4.addUpdateListener(new AUListenerS277S0100000_29(c19415910xh2, 57));
                valueAnimatorOfFloat4.start();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("liveCenterWidget: ");
                LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = this.LL.LJI();
                if (liveCenterEntranceWidgetLJI != null) {
                    view = liveCenterEntranceWidgetLJI.getView();
                } else {
                    view = null;
                }
                sbLIZ.append(view);
                C20441214yg.LIZIZ("LiveCenterStateManager#BoostEnd", C2188811AlT.LIZIZ(sbLIZ));
                C473410IhP.LIZJ(new ARunnableS129S0100000_29(this.LL, 194), 2120L);
            }
        });
        animatorSet.start();
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJIIJ;
    }

    public C19415910xh(View view) {
        super(C12OE.BOOST_CARD, 2, 0);
        this.LJIIJJI = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(413));
        this.LJ = view.findViewById(R.id.bnu);
        this.LJIIIIZZ = view.findViewById(R.id.e8s);
        this.LJFF = (ImageView) view.findViewById(R.id.c90);
        this.LJI = (TextView) view.findViewById(R.id.c91);
        this.LJII = (C16F5) view.findViewById(R.id.c92);
        C16F5 c16f5 = this.LJII;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, C176600m4.LIZ()), 2);
        }
        this.LJIIIZ = view.findViewById(R.id.jsv);
        this.LJIIJ = (ConstraintLayout) view.findViewById(R.id.c8z);
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(LJIJJ());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 55));
        valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(c12ob, 21));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJ, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(280L);
        objectAnimatorOfFloat.setInterpolator(LJIJJ());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(280L);
        objectAnimatorOfFloat2.setInterpolator(LJIJJ());
        C786410Ut5.Pd(objectAnimatorOfFloat2);
    }
}
