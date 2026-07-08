package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319910kS5 extends C1331050kk3 {
    public InterfaceC1320380kSq LLILZIL;
    public Object LLILZLL;
    public PointF LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public Matrix LLJI;
    public final Matrix LLJIJIL;

    public final void LJIILJJIL() {
        float f;
        float f2;
        Drawable drawable = this.LL;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.LLIZLLLIL = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.LLJ = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.LLJI = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.LLJI = null;
            return;
        }
        if (this.LLILZIL == InterfaceC1320380kSq.LIZ) {
            drawable.setBounds(bounds);
            this.LLJI = null;
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        InterfaceC1320380kSq interfaceC1320380kSq = this.LLILZIL;
        Matrix matrix = this.LLJIJIL;
        PointF pointF = this.LLIZ;
        if (pointF != null) {
            f = pointF.x;
            f2 = pointF.y;
        } else {
            f = 0.5f;
            f2 = 0.5f;
        }
        interfaceC1320380kSq.LIZ(f, f2, intrinsicWidth, intrinsicHeight, bounds, matrix);
        this.LLJI = this.LLJIJIL;
    }

    public final void LJIIZILJ() {
        boolean z;
        InterfaceC1320380kSq interfaceC1320380kSq = this.LLILZIL;
        if (interfaceC1320380kSq instanceof C0SV6) {
            Object state = ((C0SV6) interfaceC1320380kSq).getState();
            z = state == null || !state.equals(this.LLILZLL);
            this.LLILZLL = state;
        } else {
            z = false;
        }
        if (this.LLIZLLLIL == this.LL.getIntrinsicWidth() && this.LLJ == this.LL.getIntrinsicHeight() && !z) {
            return;
        }
        LJIILJJIL();
    }

    @Override // X.C1331050kk3, X.InterfaceC1331140kkC
    public final void LJFF(Matrix matrix) {
        LJIIL(matrix);
        LJIIZILJ();
        Matrix matrix2 = this.LLJI;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // X.C1331050kk3
    public final Drawable LJIILIIL(Drawable drawable) {
        Drawable drawableLJIILIIL = super.LJIILIIL(drawable);
        LJIILJJIL();
        return drawableLJIILIIL;
    }

    public final void LJIJ(PointF pointF) {
        if (C1320090kSN.LIZ(this.LLIZ, pointF)) {
            return;
        }
        if (this.LLIZ == null) {
            this.LLIZ = new PointF();
        }
        this.LLIZ.set(pointF);
        LJIILJJIL();
        invalidateSelf();
    }

    public final void LJIJI(InterfaceC1320380kSq interfaceC1320380kSq) {
        if (C1320090kSN.LIZ(this.LLILZIL, interfaceC1320380kSq)) {
            return;
        }
        this.LLILZIL = interfaceC1320380kSq;
        this.LLILZLL = null;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        LJIIZILJ();
        if (this.LLJI != null) {
            int iSave = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.LLJI);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        super.draw(canvas);
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        LJIILJJIL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319910kS5(Drawable drawable, InterfaceC1320380kSq interfaceC1320380kSq) {
        super(drawable);
        drawable.getClass();
        this.LLIZ = null;
        this.LLIZLLLIL = 0;
        this.LLJ = 0;
        this.LLJIJIL = new Matrix();
        this.LLILZIL = interfaceC1320380kSq;
    }
}
