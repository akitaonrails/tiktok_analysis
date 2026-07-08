package X;

import Y.ALAdapterS25S0100000_31;
import Y.ALAdapterS25S0200000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.15hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20588315hJ extends AppCompatImageView {
    public static boolean LLILLL;
    public InterfaceC20588415hK LL;
    public final AnimatorSet LLILLJJLI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setOnStateChangeListener(InterfaceC20588415hK interfaceC20588415hK) {
        this.LL = interfaceC20588415hK;
    }

    public C20588315hJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20588315hJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_X, 1.0f, 1.08f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_Y, 1.0f, 1.08f);
        long j = 100;
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat2.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_X, 1.08f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_Y, 1.08f, 0.0f);
        objectAnimatorOfFloat3.setDuration(j);
        objectAnimatorOfFloat4.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(j);
        objectAnimatorOfFloat5.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLILLJJLI = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat6).after(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_X, 0.0f, 1.08f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_Y, 0.0f, 1.08f);
        objectAnimatorOfFloat7.setDuration(j);
        objectAnimatorOfFloat8.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_X, 1.08f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this, (Property<C20588315hJ, Float>) View.SCALE_Y, 1.08f, 1.0f);
        objectAnimatorOfFloat9.setDuration(j);
        objectAnimatorOfFloat9.setDuration(j);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat5);
        animatorSet2.play(objectAnimatorOfFloat9).with(objectAnimatorOfFloat10).after(objectAnimatorOfFloat7);
        animatorSet.addListener(new ALAdapterS25S0200000_31(animatorSet2, this, 3));
        animatorSet2.addListener(new ALAdapterS25S0100000_31(this, 1));
    }
}
