package X;

import Y.AUListenerS148S0300000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC422350GhF extends Drawable {
    public Animator LIZIZ;
    public boolean LIZJ;
    public C422360GhG LIZ = new C422360GhG(0);
    public final Path LIZLLL = new Path();
    public float LJ = 1.0f;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final float LIZ() {
        if (this.LIZJ) {
            return C418440Gaw.LIZIZ(4);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC422350GhF.LIZJ():void");
    }

    public final float LIZLLL(float f) {
        return LIZ() - ((LIZ() - f) * this.LJ);
    }

    public final float LJ(float f) {
        float fLIZIZ;
        float fHeight = getBounds().height();
        if (this.LIZJ) {
            fLIZIZ = C418440Gaw.LIZIZ(9);
        } else {
            fLIZIZ = 0.0f;
        }
        return (fHeight - fLIZIZ) + f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        LIZJ();
        invalidateSelf();
    }

    public final void LIZIZ(C422360GhG c422360GhG, boolean z, boolean z2) {
        this.LIZJ = z2;
        Animator animator = this.LIZIZ;
        if (animator != null) {
            animator.cancel();
        }
        if (!z) {
            this.LIZ = c422360GhG;
            LIZJ();
            invalidateSelf();
        } else {
            C422360GhG c422360GhG2 = this.LIZ;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS148S0300000_6(this, c422360GhG2, c422360GhG, 0));
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
            this.LIZIZ = valueAnimatorOfFloat;
        }
    }
}
