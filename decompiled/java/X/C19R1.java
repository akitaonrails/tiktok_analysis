package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19R1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19R1 extends ConstraintLayout implements C19R3 {
    public final C19R4 LL;

    @Override // X.C19R3
    public final void K() {
        invalidate();
    }

    @Override // X.C19R3
    public final void LJJJ(C19RB c19rb) {
        setOutlineProvider(c19rb);
        setClipToOutline(true);
    }

    @Override // X.C19R3
    public final void LJJJJ(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C19R2 c19r2 = this.LL.LIZ;
        if (canvas == null) {
            c19r2.getClass();
            return;
        }
        if (c19r2.LIZIZ == 0 && c19r2.LIZLLL == 0 && c19r2.LIZJ == 0 && c19r2.LJ == 0) {
            c19r2.LIZ.LJJJJ(canvas);
            return;
        }
        if (c19r2.LIZ()) {
            c19r2.LIZ.LJJJJ(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(c19r2.LJFF, c19r2.LJIIIIZZ);
        c19r2.LJII.reset();
        c19r2.LJII.addRoundRect(c19r2.LJFF, c19r2.LJI, Path.Direction.CW);
        canvas.drawPath(c19r2.LJII, c19r2.LJIIIIZZ);
        c19r2.LJIIIIZZ.setXfermode(c19r2.LJIIIZ);
        canvas.saveLayer(c19r2.LJFF, c19r2.LJIIIIZZ);
        c19r2.LIZ.LJJJJ(canvas);
        c19r2.LJIIIIZZ.setXfermode(null);
        c19r2.LJIIIIZZ.setColorFilter(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public C19R1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19R1(Context context, AttributeSet attributeSet, int i) {
        View view;
        super(context, attributeSet, i);
        C19R4 c19r4 = new C19R4(this);
        this.LL = c19r4;
        C19R2 c19r2 = c19r4.LIZ;
        c19r2.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_RoundCornerView, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_allRadius, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_leftTopRadius, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_leftBottomRadius, dimensionPixelSize);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_rightTopRadius, dimensionPixelSize);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ttlive_RoundCornerView_ttlive_rightBottomRadius, dimensionPixelSize);
        c19r2.LIZIZ = dimensionPixelSize2;
        c19r2.LIZJ = dimensionPixelSize3;
        c19r2.LIZLLL = dimensionPixelSize4;
        c19r2.LJ = dimensionPixelSize5;
        float[] fArr = c19r2.LJI;
        float f = dimensionPixelSize2;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = dimensionPixelSize4;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = dimensionPixelSize5;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = dimensionPixelSize3;
        fArr[6] = f4;
        fArr[7] = f4;
        if (dimensionPixelSize3 > 0 || dimensionPixelSize2 > 0 || dimensionPixelSize4 > 0 || dimensionPixelSize5 > 0) {
            Object obj = c19r2.LIZ;
            if ((obj instanceof ViewGroup) && (view = (View) obj) != null) {
                view.setWillNotDraw(false);
            }
        }
        if (c19r2.LIZ()) {
            c19r2.LIZ.LJJJ(new C19RB(c19r2.LJI[0]));
        }
        c19r2.LIZ.K();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C19R4 c19r4 = this.LL;
        int width = getWidth();
        int height = getHeight();
        C19R2 c19r2 = c19r4.LIZ;
        if ((c19r2.LIZIZ != 0 || c19r2.LIZLLL != 0 || c19r2.LJ != 0 || c19r2.LIZJ != 0) && width != 0 && height != 0) {
            c19r2.LJFF.set(0.0f, 0.0f, width, height);
        }
    }
}
