package X;

import Y.AUListenerS235S0200000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19v7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21693119v7 {
    public final View LIZ;
    public final ImageView LIZIZ;
    public final ImageView LIZJ;
    public final C426320Gne LIZLLL;
    public final Context LJ;
    public ValueAnimator LJFF;
    public final boolean LJI = C04WY.LIZ();
    public float LJII = 10.0f;

    public final void LIZ() {
        if (!this.LJI) {
            C339190DRl.LIZIZ(this.LIZJ);
            return;
        }
        this.LIZLLL.LIZ(100.0f, false);
        C438910HIz.LIZIZ(this.LIZLLL, 75L, 2);
        ValueAnimator valueAnimator = this.LJFF;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.LJFF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public C21693119v7(View view) {
        this.LIZ = view;
        this.LIZIZ = (ImageView) view.findViewById(R.id.kd_);
        this.LIZJ = (ImageView) view.findViewById(R.id.nnp);
        this.LIZLLL = (C426320Gne) view.findViewById(R.id.nnr);
        this.LJ = view.getContext();
    }

    public final void LIZIZ(C426320Gne c426320Gne) {
        float f = this.LJII;
        if (f == 10.0f) {
            C786410Ut5.E5(c426320Gne, 1.0f);
            ValueAnimator valueAnimator = this.LJFF;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = this.LJFF;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LJII, Math.max(f, 65.0f));
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS235S0200000_33(this, c426320Gne, 3));
            valueAnimatorOfFloat.start();
            this.LJFF = valueAnimatorOfFloat;
        }
    }
}
