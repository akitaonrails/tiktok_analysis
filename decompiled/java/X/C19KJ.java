package X;

import Y.ALAdapterS5S0210000_32;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.19KJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19KJ extends FrameLayout {
    public C1664680tQA<C390640FTi> LL;
    public LifecycleOwner LLILLJJLI;
    public ImageView LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public final AnimatorSet LLIZLLLIL;
    public final AnimatorSet LLJ;
    public final AnimatorSet LLJI;

    public C19KJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = new AnimatorSet();
        this.LLJ = new AnimatorSet();
        this.LLJI = new AnimatorSet();
    }

    public final void LIZ(final View view, final boolean z, final AnimatorSet animatorSet) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet.Builder builderWith;
        animatorSet.end();
        if (z) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            float[] fArr = new float[2];
            float f6 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            fArr[0] = f;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[1] = f2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            float[] fArr2 = new float[2];
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            fArr2[0] = f3;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr2[1] = f4;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
            float[] fArr3 = new float[2];
            if (z) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            fArr3[0] = f5;
            if (z) {
                f6 = 1.0f;
            }
            fArr3[1] = f6;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
            animatorSet.setDuration(300L);
            AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
            if (builderPlay != null && (builderWith = builderPlay.with(objectAnimatorOfFloat2)) != null) {
                builderWith.with(objectAnimatorOfFloat3);
            }
            animatorSet.removeAllListeners();
            animatorSet.addListener(new ALAdapterS5S0210000_32(this, view, z, 1));
            animatorSet.start();
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.19KI
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                float f7;
                float f8;
                float f9;
                float f10;
                float f11;
                AnimatorSet.Builder builderWith2;
                view2.removeOnLayoutChangeListener(this);
                View view3 = view;
                float[] fArr4 = new float[2];
                boolean z2 = z;
                float f12 = 0.0f;
                if (z2) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                fArr4[0] = f7;
                if (z2) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr4[1] = f8;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view3, "alpha", fArr4);
                View view4 = view;
                float[] fArr5 = new float[2];
                boolean z3 = z;
                if (z3) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                fArr5[0] = f9;
                if (z3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr5[1] = f10;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view4, "scaleX", fArr5);
                View view5 = view;
                float[] fArr6 = new float[2];
                boolean z4 = z;
                if (z4) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                fArr6[0] = f11;
                if (z4) {
                    f12 = 1.0f;
                }
                fArr6[1] = f12;
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view5, "scaleY", fArr6);
                animatorSet.setDuration(300L);
                AnimatorSet.Builder builderPlay2 = animatorSet.play(objectAnimatorOfFloat4);
                if (builderPlay2 != null && (builderWith2 = builderPlay2.with(objectAnimatorOfFloat5)) != null) {
                    builderWith2.with(objectAnimatorOfFloat6);
                }
                animatorSet.removeAllListeners();
                animatorSet.addListener(new ALAdapterS5S0210000_32(this, view, z, 1));
                animatorSet.start();
            }
        });
    }
}
