package X;

import Y.AUListenerS229S0200000_24;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: X.0sCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617840sCc extends C1617830sCb {
    public final Paint LJIILL;
    public BitmapShader LJIILLIIL;
    public Bitmap LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public ValueAnimator LJIJJLI;

    @Override // X.C1617830sCb
    public final void LIZJ() {
        ValueAnimator valueAnimator = this.LJIJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJIIZILJ = null;
        this.LJIJI = 0.0f;
        this.LJIJ = 1.0f;
        this.LJIJJ = 0.0f;
    }

    public C1617840sCc(boolean z) {
        super(z);
        this.LJIILL = new Paint(1);
        this.LJIJ = 1.0f;
    }

    @Override // X.C1617830sCb
    public final void LIZ(C1600650rkt c1600650rkt, Canvas canvas) {
        boolean z;
        boolean z2;
        float width;
        float width2;
        float f;
        float f2;
        int width3;
        int width4;
        Bitmap bitmap = this.LJIIIZ;
        if (bitmap != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIIJ != null) {
            z2 = true;
        } else {
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
        Bitmap bitmap3 = this.LJIIZILJ;
        if (bitmap3 != null) {
            Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader3 = new BitmapShader(bitmap3, tileMode3, tileMode3);
            this.LJIILLIIL = bitmapShader3;
            this.LJIILL.setShader(bitmapShader3);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, c1600650rkt.getWidth(), c1600650rkt.getHeight(), null);
        float height = c1600650rkt.getHeight() / 2.0f;
        float f3 = this.LJIIJJI / 2.0f;
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
        if (this.LIZ) {
            f = this.LJIJI + width2;
            f2 = (width2 - f3) + this.LJIJI;
        } else {
            f = width2 - this.LJIJI;
            f2 = (width2 + f3) - this.LJIJI;
        }
        float f4 = (f3 - this.LIZIZ) * this.LJIJ;
        float f5 = this.LIZJ;
        float f6 = f3 - (f5 / 2);
        float fLIZIZ = (f3 - f5) + C418440Gaw.LIZIZ(1);
        BitmapShader bitmapShader4 = this.LJFF;
        Bitmap bitmap4 = this.LJIIIZ;
        if (bitmap4 != null) {
            width3 = bitmap4.getWidth();
        } else {
            width3 = 0;
        }
        LIZIZ(bitmapShader4, width3, width, height);
        BitmapShader bitmapShader5 = this.LJI;
        Bitmap bitmap5 = this.LJIIJ;
        if (bitmap5 != null) {
            width4 = bitmap5.getWidth();
        } else {
            width4 = 0;
        }
        LIZIZ(bitmapShader5, width4, f, height);
        Bitmap bitmap6 = this.LJIIZILJ;
        if (bitmap6 != null) {
            LIZIZ(this.LJIILLIIL, bitmap6.getWidth(), f2, height);
        }
        if (z) {
            canvas.drawCircle(width, height, f3, this.LIZLLL);
        }
        if (z2) {
            canvas.drawCircle(width2, height, fLIZIZ, this.LJIIL);
            canvas.drawCircle(f, height, f4, this.LJ);
            canvas.drawCircle(width2, height, f6, this.LJIIIIZZ);
            if (this.LJIIZILJ != null) {
                canvas.drawCircle(f2, height, this.LJIJJ, this.LJIILL);
            }
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // X.C1617830sCb
    public final void LIZLLL(final C1600650rkt c1600650rkt, final Bitmap bitmap, long j) {
        LIZJ();
        this.LJIIZILJ = bitmap;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJIJJLI = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(j);
        }
        ValueAnimator valueAnimator = this.LJIJJLI;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new AUListenerS229S0200000_24(this, c1600650rkt, 1));
        }
        ValueAnimator valueAnimator2 = this.LJIJJLI;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: X.0sCe
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C1617840sCc c1617840sCc = this.LL;
                    c1617840sCc.LJIIJ = bitmap;
                    c1617840sCc.LJIIZILJ = null;
                    c1617840sCc.LJIJI = 0.0f;
                    c1617840sCc.LJIJ = 1.0f;
                    c1617840sCc.LJIJJ = 0.0f;
                    c1600650rkt.invalidate();
                }
            });
        }
        ValueAnimator valueAnimator3 = this.LJIJJLI;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }
}
