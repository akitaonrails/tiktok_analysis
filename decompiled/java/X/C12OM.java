package X;

import Y.AAListenerS276S0200000_29;
import Y.AAListenerS339S0100000_29;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS262S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.growth.LiveCenterGrowthDisplayTimeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.12OM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12OM extends C12O8 {
    public final View LJ;
    public View LJFF;
    public View LJI;
    public C19728712Gv LJII;
    public final View LJIIIIZZ;
    public View LJIIIZ;
    public final C01GW LJIIJ;
    public final ARunnableS129S0100000_29 LJIIJJI;

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 1;
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        long j = LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 150L;
        View view = this.LJFF;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 50));
        valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 18));
        valueAnimatorOfFloat.start();
        C473410IhP.LIZJ(this.LJIIJJI, LiveCenterGrowthDisplayTimeSetting.INSTANCE.getValue());
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
        C473410IhP.LIZ().removeCallbacks(this.LJIIJJI);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJFF;
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        C19728712Gv c19728712Gv = this.LJII;
        if (c19728712Gv != null) {
            c19728712Gv.LIZJ();
        }
        C473410IhP.LIZ().removeCallbacks(new ARunnableS112S0100000_12(this, 395));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 49));
        valueAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(c12ob, this, 5));
        valueAnimatorOfFloat.start();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator((InterpolatorC2268801DrC) this.LJIIJ.getValue());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setInterpolator((InterpolatorC2268801DrC) this.LJIIJ.getValue());
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        animatorSet.start();
    }

    @Override // X.C12O8
    public void LJIILLIIL(C19MB c19mb) {
        super.LJIILLIIL(c19mb);
        C1143680frq.LJI(this.LJI, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_5", "ttlive_arrow_turn_up_right_fill.png"), null, true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator((InterpolatorC2268801DrC) this.LJIIJ.getValue());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setInterpolator((InterpolatorC2268801DrC) this.LJIIJ.getValue());
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        animatorSet.start();
    }

    public C12OM(View view, C12OE c12oe, int i) {
        super(c12oe, i);
        this.LJ = view;
        this.LJIIJ = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(405));
        this.LJIIJJI = new ARunnableS129S0100000_29(this, 184);
        this.LJIIIIZZ = view.findViewById(R.id.bnu);
    }
}
