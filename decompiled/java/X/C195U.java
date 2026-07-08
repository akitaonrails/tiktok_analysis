package X;

import Y.ALAdapterS26S0100000_32;
import Y.AUListenerS75S0101000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.195U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195U extends C195L {
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public boolean LJI = true;
    public final int LJII = 200;
    public final int LJIIIIZZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    public C195U(AwS575S0100000_31 awS575S0100000_31, AwS575S0100000_31 awS575S0100000_312) {
        this.LJ = awS575S0100000_31;
        this.LJFF = awS575S0100000_312;
    }

    @Override // X.C195L
    public final Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
        final float measuredHeight = c214795194f.LIZIZ.getMeasuredHeight();
        final View view = c214795194f.LIZIZ;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.LJIIIIZZ);
        C337100DJk.LIZ(valueAnimatorOfFloat, "music_panel_hide", false);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.195V
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (C297890Blz.LIZ()) {
                    float translationY = view.getTranslationY();
                    C786410Ut5.ed(view, translationY + ((measuredHeight - translationY) * valueAnimator.getAnimatedFraction()));
                } else {
                    C786410Ut5.ed(view, measuredHeight * valueAnimator.getAnimatedFraction());
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS26S0100000_32(this, 7));
        return valueAnimatorOfFloat;
    }

    @Override // X.C195L
    public final Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2) {
        View view = c214795194f2.LIZIZ;
        int measuredHeight = view.getMeasuredHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.LJII);
        C337100DJk.LIZ(valueAnimatorOfFloat, "music_panel_enter", this.LJI);
        this.LJI = false;
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS75S0101000_32(measuredHeight, view, 5));
        valueAnimatorOfFloat.addListener(new ALAdapterS26S0100000_32(this, 8));
        return valueAnimatorOfFloat;
    }
}
