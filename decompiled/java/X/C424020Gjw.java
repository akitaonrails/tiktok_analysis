package X;

import Y.AUListenerS256S0100000_6;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.animation.PathInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424020Gjw extends StateListDrawable {
    public static final /* synthetic */ int LLILZLL = 0;
    public boolean LL;
    public final boolean LLILLJJLI = true;
    public final Drawable LLILLL;
    public final ValueAnimator LLILZ;
    public final ValueAnimator LLILZIL;

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (C13LQ.LJJIJ(R.attr.state_pressed, iArr) >= 0 && !this.LL) {
            if (this.LLILLJJLI) {
                ValueAnimator valueAnimator = this.LLILZIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.LLILZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
            this.LL = true;
        } else if (this.LL) {
            if (this.LLILLJJLI) {
                ValueAnimator valueAnimator3 = this.LLILZ;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimator4 = this.LLILZIL;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
            this.LL = false;
        }
        return super.onStateChange(iArr);
    }

    public C424020Gjw(Drawable drawable, Drawable drawable2) {
        Drawable drawable3;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(this, 113));
        this.LLILZ = valueAnimatorOfInt;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.setDuration(220L);
        valueAnimatorOfInt2.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS256S0100000_6(this, 114));
        this.LLILZIL = valueAnimatorOfInt2;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        addState(StateSet.WILD_CARD, layerDrawable);
        try {
            drawable3 = layerDrawable.getDrawable(1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            drawable3 = null;
        }
        this.LLILLL = drawable3;
        if (drawable3 != null) {
            drawable3.mutate();
            drawable3.setAlpha(0);
        }
    }
}
