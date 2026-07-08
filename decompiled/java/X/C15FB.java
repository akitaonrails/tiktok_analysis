package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.15FB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FB {
    public ImageView LIZ;
    public C1126540fQC LIZIZ;
    public C16F5 LIZJ;
    public ConstraintLayout LIZLLL;
    public AnimatorSet LJ;
    public AnimatorSet LJFF;
    public C1320810kTX LJI;
    public Drawable LJII;
    public Integer LJIIIIZZ;

    public final void LIZ() {
        AnimatorSet animatorSet = this.LJ;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.LJ;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        AnimatorSet animatorSet3 = this.LJ;
        if (animatorSet3 != null) {
            animatorSet3.end();
        }
        this.LJ = null;
    }

    public final AnimatorSet LIZIZ(float f, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.LIZJ, (Property<C16F5, Float>) View.ALPHA, f, 1.0f));
        animatorSet.setDuration(j);
        return animatorSet;
    }

    public final AnimatorSet LIZJ(float f, float f2, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.LIZJ, (Property<C16F5, Float>) View.SCALE_X, f, f2), ObjectAnimator.ofFloat(this.LIZJ, (Property<C16F5, Float>) View.SCALE_Y, f, f2));
        animatorSet.setDuration(j);
        return animatorSet;
    }
}
