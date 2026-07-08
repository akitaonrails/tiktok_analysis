package X;

import Y.ALAdapterS16S0200000_21;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.0lw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376950lw5 {
    public final View LIZ;
    public Drawable LIZIZ;

    public final void LIZ() {
        Drawable drawable = this.LIZIZ;
        if (drawable == null) {
            return;
        }
        this.LIZIZ = null;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, "alpha", drawable.getAlpha(), 0);
        objectAnimatorOfInt.setDuration(200L);
        objectAnimatorOfInt.addListener(new ALAdapterS16S0200000_21(this, drawable, 3));
        C786410Ut5.Pd(objectAnimatorOfInt);
    }

    public C1376950lw5(View view) {
        this.LIZ = view;
    }
}
