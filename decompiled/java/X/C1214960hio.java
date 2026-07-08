package X;

import Y.AUListenerS268S0100000_19;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214960hio implements InterfaceC1215010hit {
    public static final AFwS257S0000000_19 LJIIIZ = AFwS257S0000000_19.get$arr$(738);
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final TuxIconView LIZJ;
    public final TextView LIZLLL;
    public ValueAnimator LJ;
    public final C1213690hgl LJFF;
    public final C1215000his LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    @Override // X.InterfaceC1215010hit
    public final void LIZ(Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.LJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
        function0.invoke();
    }

    @Override // X.InterfaceC1215010hit
    public final void LIZIZ(Function0<Unit> function0) {
        LIZJ(1.0f, function0);
    }

    public C1214960hio(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = viewGroup.findViewById(R.id.vz_);
        TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.vzf);
        this.LIZJ = tuxIconView;
        this.LIZLLL = (TextView) viewGroup.findViewById(R.id.vze);
        if (C302080Bsk.LIZ()) {
            tuxIconView.setIconRes(R.raw.icon_camera_fill);
            tuxIconView.setTintColorRes(R.attr.ee);
        }
        this.LJFF = new C1213690hgl();
        this.LJI = new C1215000his(context.getResources());
        this.LJII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3152));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3151));
    }

    public final void LIZJ(final float f, final Function0<Unit> function0) {
        float f2 = this.LJFF.LIZIZ;
        if (f2 == f) {
            return;
        }
        ValueAnimator valueAnimator = this.LJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        this.LJII.getValue();
        this.LJIIIIZZ.getValue();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.LJ = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setRepeatCount(0);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS268S0100000_19(this, 21));
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0hin
                public TextUtils.TruncateAt LL = TextUtils.TruncateAt.END;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LIZLLL.setEllipsize(this.LL);
                    valueAnimatorOfFloat.removeAllUpdateListeners();
                    valueAnimatorOfFloat.removeListener(this);
                    function0.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (f == 1.0f) {
                        C426750GoL.LJIIIZ(this.LIZJ, 0, 0, 0, 0, false, 16);
                    }
                    this.LIZLLL.setEllipsize(this.LL);
                    valueAnimatorOfFloat.removeAllUpdateListeners();
                    valueAnimatorOfFloat.removeListener(this);
                    this.LJFF.LIZ(f);
                    function0.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    if (f == 0.0f) {
                        C426750GoL.LJIIIZ(this.LIZJ, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), 0, false, 16);
                    }
                    this.LL = this.LIZLLL.getEllipsize();
                    this.LIZLLL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                }
            });
            valueAnimatorOfFloat.start();
        }
    }
}
