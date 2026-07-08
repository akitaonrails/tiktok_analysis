package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryPublishNativeAnimConfig;

/* JADX INFO: renamed from: X.0GZD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZD extends Drawable implements Animatable {
    public final int[] LL = {Color.rgb(0, 148, 255), Color.rgb(16, 180, 246), Color.rgb(32, 213, 236), Color.rgb(16, 234, 200), Color.rgb(0, 255, 163)};
    public final float[] LLILLJJLI = {0.0f, 0.239f, 0.478f, 0.739f, 1.0f};
    public final Paint LLILLL;
    public final RectF LLILZ;
    public float LLILZIL;
    public ValueAnimator LLILZLL;
    public Animator.AnimatorListener LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final Interpolator LLJI;
    public final Interpolator LLJIJIL;
    public final Interpolator LLJILJIL;
    public final Interpolator LLJILJILJ;
    public final Interpolator LLJILLL;
    public final Interpolator LLJJ;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 92;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 92;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator = this.LLILZLL;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZLL = null;
    }

    public C0GZD() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LLILLL = paint;
        this.LLILZ = new RectF();
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJI = C0GY9.LIZIZ(0.4f, 0.0f, 0.68f, -0.061f);
        this.LLJIJIL = C0GY9.LIZIZ(0.4f, 0.0f, 0.68f, -0.081f);
        this.LLJILJIL = C0GY9.LIZIZ(0.32f, 1.058f, 0.6f, 1.0f);
        this.LLJILJILJ = C0GY9.LIZIZ(0.32f, 1.036f, 0.6f, 1.0f);
        this.LLJILLL = C0GY9.LIZIZ(0.4f, 0.8f, 0.74f, 1.0f);
        this.LLJJ = C0GY9.LIZIZ(0.48f, 0.04f, 0.45f, 0.965f);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (isRunning()) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 91.0f);
        long j = ((StoryPublishNativeAnimConfig) C0CAE.LIZIZ.getValue()).durationMs;
        if (j <= 0) {
            j = 1516;
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 122));
        Animator.AnimatorListener animatorListener = this.LLIZ;
        if (animatorListener != null) {
            valueAnimatorOfFloat.addListener(animatorListener);
        }
        this.LLILZLL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[PHI: r4
      0x00ca: PHI (r4v4 float) = (r4v3 float), (r4v6 float) binds: [B:23:0x00ac, B:27:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0GZD.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LLILLL.setColorFilter(colorFilter);
    }
}
