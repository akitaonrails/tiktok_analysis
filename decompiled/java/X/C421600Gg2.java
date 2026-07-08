package X;

import Y.ALAdapterS3S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421600Gg2 extends C1295960jpS {
    public final C01GW LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public final void LJFF() {
        this.LLILLJJLI = false;
        cancelAnimation();
        getBreathAnimator().cancel();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(1.0f);
        setProgress(0.0f);
    }

    private final Animator.AnimatorListener getAnimatorListener() {
        return (Animator.AnimatorListener) this.LL.getValue();
    }

    private final Animator getBreathAnimator() {
        return (Animator) this.LLILZ.getValue();
    }

    public final Interpolator getEase() {
        return (Interpolator) this.LLILLL.getValue();
    }

    public final void LJ() {
        if (!getBreathAnimator().isRunning()) {
            pause();
            getBreathAnimator().start();
        }
        this.LLILLJJLI = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
        C20597815iq.LIZ(this);
    }

    public final void pause() {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            LJFF();
        } else {
            C1481605r4.LIZIZ(new ARunnableS106S0100000_6((Object) this, 161));
        }
    }

    private final void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C421600Gg2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageFolder("images");
        addAnimatorListener(new ALAdapterS3S0100000_6(this, 33));
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1100));
        this.LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(430));
        this.LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1101));
        setAnimation("story_breathing_ring_lottie.json");
        addAnimatorListener(getAnimatorListener());
    }
}
