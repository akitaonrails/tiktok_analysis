package X;

import Y.ALAdapterS23S0200000_29;
import Y.ALAdapterS24S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

/* JADX INFO: renamed from: X.11FU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11FU extends RemoteImageView {
    public C11FV LLILLJJLI;

    public C11FU() {
        throw null;
    }

    public final void LIZLLL() {
        clearAnimation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.08f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.08f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat2.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 1.08f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 1.08f, 0.0f);
        objectAnimatorOfFloat3.setDuration(100L);
        objectAnimatorOfFloat4.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(100L);
        objectAnimatorOfFloat5.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat6).after(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this, "scaleX", 0.0f, 1.08f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, "scaleY", 0.0f, 1.08f);
        objectAnimatorOfFloat7.setDuration(100L);
        objectAnimatorOfFloat8.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, "scaleX", 1.08f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this, "scaleY", 1.08f, 1.0f);
        objectAnimatorOfFloat9.setDuration(100L);
        objectAnimatorOfFloat9.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat5);
        animatorSet2.play(objectAnimatorOfFloat9).with(objectAnimatorOfFloat10).after(objectAnimatorOfFloat7);
        animatorSet.addListener(new ALAdapterS23S0200000_29(animatorSet2, this, 6));
        animatorSet2.addListener(new ALAdapterS24S0100000_29(this, 5));
        animatorSet.start();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setOnStateChangeListener(C11FV c11fv) {
        this.LLILLJJLI = c11fv;
    }

    public C11FU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
