package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19R5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19R5 {
    public final C19RA LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final RectF LJFF = new RectF();
    public final float[] LJI = new float[8];
    public final Path LJII = new Path();
    public final Paint LJIIIIZZ = new Paint(1);
    public final PorterDuffXfermode LJIIIZ = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    public final boolean LIZLLL() {
        float[] fArr = this.LJI;
        float f = fArr[0];
        if (f <= 0.0f) {
            return false;
        }
        float f2 = fArr[1];
        if (f != f2) {
            return false;
        }
        float f3 = fArr[2];
        if (f2 != f3) {
            return false;
        }
        float f4 = fArr[3];
        if (f3 != f4) {
            return false;
        }
        float f5 = fArr[4];
        if (f4 != f5) {
            return false;
        }
        float f6 = fArr[5];
        if (f5 != f6) {
            return false;
        }
        float f7 = fArr[6];
        return f6 == f7 && f7 == fArr[7];
    }

    public C19R5(C19RA c19ra) {
        this.LIZ = c19ra;
    }

    public final void LIZ(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (this.LIZIZ == 0 && this.LIZLLL == 0 && this.LIZJ == 0 && this.LJ == 0) {
            this.LIZ.LJJJJ(canvas);
            return;
        }
        if (LIZLLL()) {
            this.LIZ.LJJJJ(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(this.LJFF, this.LJIIIIZZ);
        this.LJII.reset();
        this.LJII.addRoundRect(this.LJFF, this.LJI, Path.Direction.CW);
        canvas.drawPath(this.LJII, this.LJIIIIZZ);
        this.LJIIIIZZ.setXfermode(this.LJIIIZ);
        canvas.saveLayer(this.LJFF, this.LJIIIIZZ);
        this.LIZ.LJJJJ(canvas);
        this.LJIIIIZZ.setXfermode(null);
        this.LJIIIIZZ.setColorFilter(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public final void LIZJ(int i, int i2) {
        if ((this.LIZIZ != 0 || this.LIZLLL != 0 || this.LJ != 0 || this.LIZJ != 0) && i != 0 && i2 != 0) {
            this.LJFF.set(0.0f, 0.0f, i, i2);
        }
    }

    public final void LIZIZ(Context context, AttributeSet attributeSet, int i) {
        View view;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_RoundCornerView, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_allRadius, 0);
        this.LIZIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_leftTopRadius, dimensionPixelSize);
        this.LIZJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_leftBottomRadius, dimensionPixelSize);
        this.LIZLLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_rightTopRadius, dimensionPixelSize);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_rightBottomRadius, dimensionPixelSize);
        this.LJ = dimensionPixelSize2;
        float[] fArr = this.LJI;
        float f = this.LIZIZ;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = this.LIZLLL;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = dimensionPixelSize2;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = this.LIZJ;
        fArr[6] = f4;
        fArr[7] = f4;
        typedArrayObtainStyledAttributes.recycle();
        if (this.LIZJ > 0 || this.LIZIZ > 0 || this.LIZLLL > 0 || this.LJ > 0) {
            Object obj = this.LIZ;
            if ((obj instanceof ViewGroup) && (view = (View) obj) != null) {
                view.setWillNotDraw(false);
            }
        }
        if (LIZLLL()) {
            this.LIZ.LJJJ(new C19RB(this.LJI[0]));
        }
    }
}
