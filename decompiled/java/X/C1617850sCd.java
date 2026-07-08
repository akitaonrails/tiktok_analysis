package X;

import Y.AAListenerS273S0200000_24;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;

/* JADX INFO: renamed from: X.0sCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617850sCd extends C1617830sCb {
    public float LJIILL;
    public AnimatorSet LJIILLIIL;

    @Override // X.C1617830sCb
    public final void LIZJ() {
        this.LJIILL = 1.0f;
        AnimatorSet animatorSet = this.LJIILLIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public C1617850sCd(boolean z) {
        super(z);
        this.LJIILL = 1.0f;
    }

    @Override // X.C1617830sCb
    public final void LIZ(C1600650rkt c1600650rkt, Canvas canvas) {
        boolean z;
        float width;
        float width2;
        int width3;
        Bitmap bitmap = this.LJIIIZ;
        boolean z2 = true;
        int width4 = 0;
        if (bitmap != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIIJ == null) {
            z2 = false;
        }
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.LJFF = bitmapShader;
            this.LIZLLL.setShader(bitmapShader);
        }
        Bitmap bitmap2 = this.LJIIJ;
        if (bitmap2 != null) {
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
            this.LJI = bitmapShader2;
            this.LJ.setShader(bitmapShader2);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, c1600650rkt.getWidth(), c1600650rkt.getHeight(), null);
        if (this.LIZ) {
            width = (c1600650rkt.getWidth() / 2.0f) - (this.LJIILIIL / 2);
        } else {
            width = (c1600650rkt.getWidth() / 2.0f) + (this.LJIILIIL / 2);
        }
        if (!z2) {
            width = c1600650rkt.getWidth() / 2.0f;
        }
        if (this.LIZ) {
            width2 = (c1600650rkt.getWidth() / 2.0f) + (this.LJIILIIL / 2);
        } else {
            width2 = (c1600650rkt.getWidth() / 2.0f) - (this.LJIILIIL / 2);
        }
        if (!z) {
            width2 = c1600650rkt.getWidth() / 2.0f;
        }
        float height = c1600650rkt.getHeight() / 2.0f;
        float f = this.LJIIJJI / 2.0f;
        float f2 = f - this.LIZIZ;
        float f3 = this.LJIILL;
        float f4 = f2 * f3;
        float f5 = (f - (this.LIZJ / 2)) * f3;
        float f6 = f3 * f;
        BitmapShader bitmapShader3 = this.LJFF;
        Bitmap bitmap3 = this.LJIIIZ;
        if (bitmap3 != null) {
            width3 = bitmap3.getWidth();
        } else {
            width3 = 0;
        }
        LIZIZ(bitmapShader3, width3, width, height);
        BitmapShader bitmapShader4 = this.LJI;
        Bitmap bitmap4 = this.LJIIJ;
        if (bitmap4 != null) {
            width4 = bitmap4.getWidth();
        }
        LIZIZ(bitmapShader4, width4, width2, height);
        if (z) {
            canvas.drawCircle(width, height, f, this.LIZLLL);
        }
        if (z2) {
            canvas.drawCircle(width2, height, f6, this.LJIIL);
            canvas.drawCircle(width2, height, f4, this.LJ);
            canvas.drawCircle(width2, height, f5, this.LJIIIIZZ);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // X.C1617830sCb
    public final void LIZLLL(C1600650rkt c1600650rkt, Bitmap bitmap, long j) {
        LIZJ();
        ValueAnimator valueAnimatorLJ = LJ(j, this, c1600650rkt, false);
        ValueAnimator valueAnimatorLJ2 = LJ(j, this, c1600650rkt, true);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJIILLIIL = animatorSet;
        animatorSet.playSequentially(valueAnimatorLJ, valueAnimatorLJ2);
        valueAnimatorLJ.addListener(new AAListenerS273S0200000_24(bitmap, this, 6));
        AnimatorSet animatorSet2 = this.LJIILLIIL;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final ValueAnimator LJ(long j, final C1617850sCd c1617850sCd, final C1600650rkt c1600650rkt, boolean z) {
        ValueAnimator valueAnimatorOfInt;
        if (z) {
            valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(100, 0);
        }
        valueAnimatorOfInt.setDuration(j / ((long) 2));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0sCf
            public final /* synthetic */ float LLILLJJLI = 100.0f;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.LL.LJIILL = ((Integer) valueAnimator.getAnimatedValue()).intValue() / this.LLILLJJLI;
                c1600650rkt.invalidate();
            }
        });
        return valueAnimatorOfInt;
    }
}
