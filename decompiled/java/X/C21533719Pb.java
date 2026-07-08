package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21533719Pb extends AbstractC21533919Pd<C19PJ> {
    public static final /* synthetic */ int LLJILJILJ = 0;

    public int getIndeterminateAnimationType() {
        return ((C19PJ) this.LL).LJI;
    }

    public int getIndicatorDirection() {
        return ((C19PJ) this.LL).LJII;
    }

    public void setIndeterminateAnimationType(int i) {
        if (((C19PJ) this.LL).LJI == i) {
            return;
        }
        if (LIZJ() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.LL;
        ((C19PJ) s).LJI = i;
        s.LIZ();
        if (i == 0) {
            C21534619Pk<C19PJ> indeterminateDrawable = getIndeterminateDrawable();
            C21535619Pu c21535619Pu = new C21535619Pu((C19PJ) this.LL);
            indeterminateDrawable.LLJILJILJ = c21535619Pu;
            c21535619Pu.LIZ = indeterminateDrawable;
        } else {
            C21534619Pk<C19PJ> indeterminateDrawable2 = getIndeterminateDrawable();
            C21535719Pv c21535719Pv = new C21535719Pv(getContext(), (C19PJ) this.LL);
            indeterminateDrawable2.LLJILJILJ = c21535719Pv;
            c21535719Pv.LIZ = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // X.AbstractC21533919Pd
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.LL.LIZ();
    }

    public void setIndicatorDirection(int i) {
        S s = this.LL;
        ((C19PJ) s).LJII = i;
        C19PJ c19pj = (C19PJ) s;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((C19PJ) this.LL).LJII != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        c19pj.LJIIIIZZ = z;
        invalidate();
    }

    @Override // X.AbstractC21533919Pd
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.LL.LIZ();
        invalidate();
    }

    public C21533719Pb(Context context, AttributeSet attributeSet) {
        AbstractC21534519Pj c21535719Pv;
        super(context, attributeSet, R.attr.c53, R.style.a51);
        Context context2 = getContext();
        final C19PJ c19pj = (C19PJ) this.LL;
        AbstractC21534019Pe<C19PJ> abstractC21534019Pe = new AbstractC21534019Pe<C19PJ>(c19pj) { // from class: X.19PR
            public float LIZJ = 300.0f;
            public float LIZLLL;
            public float LJ;

            @Override // X.AbstractC21534019Pe
            public final int LJ() {
                return -1;
            }

            @Override // X.AbstractC21534019Pe
            public final int LIZLLL() {
                return this.LIZ.LIZ;
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZ(float f, Canvas canvas) {
                Rect clipBounds = canvas.getClipBounds();
                this.LIZJ = clipBounds.width();
                float f2 = this.LIZ.LIZ;
                canvas.translate(clipBounds.width() / 2.0f, (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - this.LIZ.LIZ) / 2.0f));
                if (((C19PJ) this.LIZ).LJIIIIZZ) {
                    canvas.scale(-1.0f, 1.0f);
                }
                if ((this.LIZIZ.LIZLLL() && this.LIZ.LJ == 1) || (this.LIZIZ.LIZJ() && this.LIZ.LJFF == 2)) {
                    canvas.scale(1.0f, -1.0f);
                }
                if (this.LIZIZ.LIZLLL() || this.LIZIZ.LIZJ()) {
                    canvas.translate(0.0f, (this.LIZ.LIZ * (f - 1.0f)) / 2.0f);
                }
                float f3 = this.LIZJ;
                canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
                S s = this.LIZ;
                this.LIZLLL = s.LIZ * f;
                this.LJ = s.LIZIZ * f;
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZJ(Canvas canvas, Paint paint) {
                int iLIZ = C19PM.LIZ(this.LIZ.LIZLLL, this.LIZIZ.LLJI);
                float f = ((-this.LIZJ) / 2.0f) + this.LJ;
                float f2 = -f;
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(iLIZ);
                float f3 = this.LIZLLL;
                canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
                float f4 = this.LJ;
                RectF rectF = new RectF(-f4, -f4, f4, f4);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f, true, rectF);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f2, false, rectF);
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZIZ(Canvas canvas, Paint paint, float f, float f2, int i) {
                if (f == f2) {
                    return;
                }
                float f3 = this.LIZJ;
                float f4 = this.LJ;
                float f5 = ((-f3) / 2.0f) + f4;
                float f6 = f3 - (f4 * 2.0f);
                float f7 = (f * f6) + f5;
                float f8 = f5 + (f6 * f2);
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(i);
                float f9 = this.LIZLLL;
                canvas.drawRect(f7, (-f9) / 2.0f, f8, f9 / 2.0f, paint);
                float f10 = this.LJ;
                float f11 = -f10;
                RectF rectF = new RectF(f11, f11, f10, f10);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f7, true, rectF);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f8, false, rectF);
            }

            public static void LJFF(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
                canvas.save();
                canvas.translate(f3, 0.0f);
                if (!z) {
                    canvas.rotate(180.0f);
                }
                float f4 = ((-f) / 2.0f) + f2;
                float f5 = (f / 2.0f) - f2;
                canvas.drawRect(-f2, f4, 0.0f, f5, paint);
                canvas.save();
                canvas.translate(0.0f, f4);
                canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
                canvas.restore();
                canvas.translate(0.0f, f5);
                canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
                canvas.restore();
            }
        };
        if (c19pj.LJI == 0) {
            c21535719Pv = new C21535619Pu(c19pj);
        } else {
            c21535719Pv = new C21535719Pv(context2, c19pj);
        }
        setIndeterminateDrawable(new C21534619Pk(context2, c19pj, abstractC21534019Pe, c21535719Pv));
        Context context3 = getContext();
        final C19PJ c19pj2 = (C19PJ) this.LL;
        setProgressDrawable(new C21534719Pl(context3, c19pj2, new AbstractC21534019Pe<C19PJ>(c19pj2) { // from class: X.19PR
            public float LIZJ = 300.0f;
            public float LIZLLL;
            public float LJ;

            @Override // X.AbstractC21534019Pe
            public final int LJ() {
                return -1;
            }

            @Override // X.AbstractC21534019Pe
            public final int LIZLLL() {
                return this.LIZ.LIZ;
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZ(float f, Canvas canvas) {
                Rect clipBounds = canvas.getClipBounds();
                this.LIZJ = clipBounds.width();
                float f2 = this.LIZ.LIZ;
                canvas.translate(clipBounds.width() / 2.0f, (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - this.LIZ.LIZ) / 2.0f));
                if (((C19PJ) this.LIZ).LJIIIIZZ) {
                    canvas.scale(-1.0f, 1.0f);
                }
                if ((this.LIZIZ.LIZLLL() && this.LIZ.LJ == 1) || (this.LIZIZ.LIZJ() && this.LIZ.LJFF == 2)) {
                    canvas.scale(1.0f, -1.0f);
                }
                if (this.LIZIZ.LIZLLL() || this.LIZIZ.LIZJ()) {
                    canvas.translate(0.0f, (this.LIZ.LIZ * (f - 1.0f)) / 2.0f);
                }
                float f3 = this.LIZJ;
                canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
                S s = this.LIZ;
                this.LIZLLL = s.LIZ * f;
                this.LJ = s.LIZIZ * f;
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZJ(Canvas canvas, Paint paint) {
                int iLIZ = C19PM.LIZ(this.LIZ.LIZLLL, this.LIZIZ.LLJI);
                float f = ((-this.LIZJ) / 2.0f) + this.LJ;
                float f2 = -f;
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(iLIZ);
                float f3 = this.LIZLLL;
                canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
                float f4 = this.LJ;
                RectF rectF = new RectF(-f4, -f4, f4, f4);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f, true, rectF);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f2, false, rectF);
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZIZ(Canvas canvas, Paint paint, float f, float f2, int i) {
                if (f == f2) {
                    return;
                }
                float f3 = this.LIZJ;
                float f4 = this.LJ;
                float f5 = ((-f3) / 2.0f) + f4;
                float f6 = f3 - (f4 * 2.0f);
                float f7 = (f * f6) + f5;
                float f8 = f5 + (f6 * f2);
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(i);
                float f9 = this.LIZLLL;
                canvas.drawRect(f7, (-f9) / 2.0f, f8, f9 / 2.0f, paint);
                float f10 = this.LJ;
                float f11 = -f10;
                RectF rectF = new RectF(f11, f11, f10, f10);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f7, true, rectF);
                LJFF(canvas, paint, this.LIZLLL, this.LJ, f8, false, rectF);
            }

            public static void LJFF(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
                canvas.save();
                canvas.translate(f3, 0.0f);
                if (!z) {
                    canvas.rotate(180.0f);
                }
                float f4 = ((-f) / 2.0f) + f2;
                float f5 = (f / 2.0f) - f2;
                canvas.drawRect(-f2, f4, 0.0f, f5, paint);
                canvas.save();
                canvas.translate(0.0f, f4);
                canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
                canvas.restore();
                canvas.translate(0.0f, f5);
                canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
                canvas.restore();
            }
        }));
    }

    @Override // X.AbstractC21533919Pd
    public final C19PH LIZ(Context context, AttributeSet attributeSet) {
        return new C19PJ(context, attributeSet);
    }

    @Override // X.AbstractC21533919Pd
    public final void LIZIZ(int i, boolean z) {
        S s = this.LL;
        if (s != 0 && ((C19PJ) s).LJI == 0 && isIndeterminate()) {
            return;
        }
        super.LIZIZ(i, z);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C21534619Pk<C19PJ> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C21534719Pl<C19PJ> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.LL;
        C19PJ c19pj = (C19PJ) s;
        boolean z2 = true;
        if (((C19PJ) s).LJII != 1 && ((getLayoutDirection() != 1 || ((C19PJ) this.LL).LJII != 2) && (getLayoutDirection() != 0 || ((C19PJ) this.LL).LJII != 3))) {
            z2 = false;
        }
        c19pj.LJIIIIZZ = z2;
    }
}
