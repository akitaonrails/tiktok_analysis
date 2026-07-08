package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19uW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21689419uW extends Drawable {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final RectF LIZLLL;
    public final RectF LJ;
    public final float LJFF;
    public final float LJI;
    public final RectF LJII;
    public final float LJIIIIZZ;
    public final C21689519uX LJIIIZ;
    public final C21689519uX LJIIJ;
    public final C21689519uX LJIIJJI;
    public final int LJIIL;
    public final float LJIILIIL;
    public final float LJIILJJIL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LIZ != null) {
            LIZ(canvas, getBounds(), this.LJIIJJI, new AwS612S0100000_33(this, 229));
        }
        LIZ(canvas, getBounds(), this.LJIIIZ, new AwS612S0100000_33(this, 231));
        LIZ(canvas, getBounds(), this.LJIIJ, new AwS612S0100000_33(this, 230));
    }

    public final void LIZ(Canvas canvas, Rect rect, C21689519uX c21689519uX, Function1<? super Canvas, Unit> function1) {
        int i = c21689519uX.LIZ;
        if (i <= 0) {
            return;
        }
        int iSave = canvas.save();
        if (i < 255) {
            this.LJII.set(rect);
            canvas.saveLayerAlpha(this.LJII, i);
        }
        canvas.translate(c21689519uX.LIZLLL, c21689519uX.LJ);
        canvas.scale(c21689519uX.LIZIZ, c21689519uX.LIZJ);
        function1.invoke(canvas);
        canvas.restoreToCount(iSave);
    }

    public C21689419uW(RectF rectF, RectF rectF2, RectF rectF3, View view, View view2, View view3) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        RectF rectF4 = new RectF(rectF);
        this.LIZLLL = rectF4;
        RectF rectF5 = new RectF(rectF3);
        this.LJ = rectF5;
        float f = rectF2.top;
        this.LJFF = f - rectF.top;
        this.LJI = f - rectF3.top;
        this.LJII = new RectF();
        float f2 = rectF2.left;
        float f3 = rectF.left;
        this.LJIIIIZZ = f2 - f3;
        C21689519uX c21689519uX = new C21689519uX();
        this.LJIIIZ = c21689519uX;
        C21689519uX c21689519uX2 = new C21689519uX();
        this.LJIIJ = c21689519uX2;
        C21689519uX c21689519uX3 = new C21689519uX();
        this.LJIIJJI = c21689519uX3;
        float f4 = rectF.right - f3;
        float f5 = rectF.bottom - rectF.top;
        int right = view3.getRight() - view3.getLeft();
        this.LJIIL = right;
        int bottom = view3.getBottom() - view3.getTop();
        this.LJIILIIL = right / f4;
        this.LJIILJJIL = bottom / f5;
        new Paint().setColor(-256);
        float f6 = rectF4.left;
        c21689519uX.LIZLLL = f6;
        float f7 = rectF4.top;
        c21689519uX.LJ = f7;
        c21689519uX2.LIZLLL = f6;
        c21689519uX2.LJ = f7;
        c21689519uX3.LIZLLL = rectF5.left;
        c21689519uX3.LJ = rectF5.top;
    }
}
