package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HAB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TuxSheet tuxSheet, final int i, final long j, long j2) {
        final C21578619ce c21578619ce;
        View view = tuxSheet.getView();
        if (view != null && (c21578619ce = (C21578619ce) view.findViewById(R.id.v4b)) != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, j);
            valueAnimatorOfFloat.setStartDelay(j2);
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0HAC
                public final /* synthetic */ int LLILZ = 0;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c21578619ce.scrollTo(this.LLILZ, (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() / j) * i));
                }
            });
            valueAnimatorOfFloat.start();
        }
    }
}
