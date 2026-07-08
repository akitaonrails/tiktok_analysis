package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21533619Pa extends AbstractC21533919Pd<C19PI> {
    public static final /* synthetic */ int LLJILJILJ = 0;

    public int getIndicatorDirection() {
        return ((C19PI) this.LL).LJIIIIZZ;
    }

    public int getIndicatorInset() {
        return ((C19PI) this.LL).LJII;
    }

    public int getIndicatorSize() {
        return ((C19PI) this.LL).LJI;
    }

    public void setIndicatorDirection(int i) {
        ((C19PI) this.LL).LJIIIIZZ = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.LL;
        if (((C19PI) s).LJII != i) {
            ((C19PI) s).LJII = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        S s = this.LL;
        if (((C19PI) s).LJI != i) {
            ((C19PI) s).LJI = i;
            s.LIZ();
            invalidate();
        }
    }

    @Override // X.AbstractC21533919Pd
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.LL.LIZ();
    }

    public C21533619Pa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f534bha, R.style.a4p);
        Context context2 = getContext();
        final C19PI c19pi = (C19PI) this.LL;
        setIndeterminateDrawable(new C21534619Pk(context2, c19pi, new AbstractC21534019Pe<C19PI>(c19pi) { // from class: X.19PQ
            public int LIZJ = 1;
            public float LIZLLL;
            public float LJ;
            public float LJFF;

            @Override // X.AbstractC21534019Pe
            public final int LIZLLL() {
                C19PI c19pi2 = (C19PI) this.LIZ;
                return c19pi2.LJI + (c19pi2.LJII * 2);
            }

            @Override // X.AbstractC21534019Pe
            public final int LJ() {
                C19PI c19pi2 = (C19PI) this.LIZ;
                return c19pi2.LJI + (c19pi2.LJII * 2);
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZ(float f, Canvas canvas) {
                int i;
                S s = this.LIZ;
                float f2 = (((C19PI) s).LJI / 2.0f) + ((C19PI) s).LJII;
                canvas.translate(f2, f2);
                canvas.rotate(-90.0f);
                float f3 = -f2;
                canvas.clipRect(f3, f3, f2, f2);
                if (((C19PI) this.LIZ).LJIIIIZZ == 0) {
                    i = 1;
                } else {
                    i = -1;
                }
                this.LIZJ = i;
                this.LIZLLL = r2.LIZ * f;
                this.LJ = r2.LIZIZ * f;
                this.LJFF = (((C19PI) r2).LJI - r2.LIZ) / 2.0f;
                if ((this.LIZIZ.LIZLLL() && this.LIZ.LJ == 2) || (this.LIZIZ.LIZJ() && this.LIZ.LJFF == 1)) {
                    this.LJFF += ((1.0f - f) * this.LIZ.LIZ) / 2.0f;
                } else {
                    if ((!this.LIZIZ.LIZLLL() || this.LIZ.LJ != 1) && (!this.LIZIZ.LIZJ() || this.LIZ.LJFF != 2)) {
                        return;
                    }
                    this.LJFF -= ((1.0f - f) * this.LIZ.LIZ) / 2.0f;
                }
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZJ(Canvas canvas, Paint paint) {
                int iLIZ = C19PM.LIZ(this.LIZ.LIZLLL, this.LIZIZ.LLJI);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setAntiAlias(true);
                paint.setColor(iLIZ);
                paint.setStrokeWidth(this.LIZLLL);
                float f = this.LJFF;
                canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZIZ(Canvas canvas, Paint paint, float f, float f2, int i) {
                float f3 = f2;
                if (f == f3) {
                    return;
                }
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setAntiAlias(true);
                paint.setColor(i);
                paint.setStrokeWidth(this.LIZLLL);
                float f4 = this.LIZJ;
                float f5 = f * 360.0f * f4;
                if (f3 < f) {
                    f3 += 1.0f;
                }
                float f6 = (f3 - f) * 360.0f * f4;
                float f7 = this.LJFF;
                float f8 = -f7;
                canvas.drawArc(new RectF(f8, f8, f7, f7), f5, f6, false, paint);
                if (this.LJ > 0.0f && Math.abs(f6) < 360.0f) {
                    paint.setStyle(Paint.Style.FILL);
                    float f9 = this.LJ;
                    float f10 = -f9;
                    RectF rectF = new RectF(f10, f10, f9, f9);
                    LJFF(canvas, paint, this.LIZLLL, this.LJ, f5, true, rectF);
                    LJFF(canvas, paint, this.LIZLLL, this.LJ, f5 + f6, false, rectF);
                }
            }

            public final void LJFF(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
                float f4;
                if (z) {
                    f4 = -1.0f;
                } else {
                    f4 = 1.0f;
                }
                canvas.save();
                canvas.rotate(f3);
                float f5 = f / 2.0f;
                float f6 = f4 * f2;
                canvas.drawRect((this.LJFF - f5) + f2, Math.min(0.0f, this.LIZJ * f6), (this.LJFF + f5) - f2, Math.max(0.0f, f6 * this.LIZJ), paint);
                canvas.translate((this.LJFF - f5) + f2, 0.0f);
                canvas.drawArc(rectF, 180.0f, (-f4) * 90.0f * this.LIZJ, true, paint);
                canvas.translate(f - (f2 * 2.0f), 0.0f);
                canvas.drawArc(rectF, 0.0f, f4 * 90.0f * this.LIZJ, true, paint);
                canvas.restore();
            }
        }, new C21535419Ps(c19pi)));
        Context context3 = getContext();
        final C19PI c19pi2 = (C19PI) this.LL;
        setProgressDrawable(new C21534719Pl(context3, c19pi2, new AbstractC21534019Pe<C19PI>(c19pi2) { // from class: X.19PQ
            public int LIZJ = 1;
            public float LIZLLL;
            public float LJ;
            public float LJFF;

            @Override // X.AbstractC21534019Pe
            public final int LIZLLL() {
                C19PI c19pi22 = (C19PI) this.LIZ;
                return c19pi22.LJI + (c19pi22.LJII * 2);
            }

            @Override // X.AbstractC21534019Pe
            public final int LJ() {
                C19PI c19pi22 = (C19PI) this.LIZ;
                return c19pi22.LJI + (c19pi22.LJII * 2);
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZ(float f, Canvas canvas) {
                int i;
                S s = this.LIZ;
                float f2 = (((C19PI) s).LJI / 2.0f) + ((C19PI) s).LJII;
                canvas.translate(f2, f2);
                canvas.rotate(-90.0f);
                float f3 = -f2;
                canvas.clipRect(f3, f3, f2, f2);
                if (((C19PI) this.LIZ).LJIIIIZZ == 0) {
                    i = 1;
                } else {
                    i = -1;
                }
                this.LIZJ = i;
                this.LIZLLL = r2.LIZ * f;
                this.LJ = r2.LIZIZ * f;
                this.LJFF = (((C19PI) r2).LJI - r2.LIZ) / 2.0f;
                if ((this.LIZIZ.LIZLLL() && this.LIZ.LJ == 2) || (this.LIZIZ.LIZJ() && this.LIZ.LJFF == 1)) {
                    this.LJFF += ((1.0f - f) * this.LIZ.LIZ) / 2.0f;
                } else {
                    if ((!this.LIZIZ.LIZLLL() || this.LIZ.LJ != 1) && (!this.LIZIZ.LIZJ() || this.LIZ.LJFF != 2)) {
                        return;
                    }
                    this.LJFF -= ((1.0f - f) * this.LIZ.LIZ) / 2.0f;
                }
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZJ(Canvas canvas, Paint paint) {
                int iLIZ = C19PM.LIZ(this.LIZ.LIZLLL, this.LIZIZ.LLJI);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setAntiAlias(true);
                paint.setColor(iLIZ);
                paint.setStrokeWidth(this.LIZLLL);
                float f = this.LJFF;
                canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
            }

            @Override // X.AbstractC21534019Pe
            public final void LIZIZ(Canvas canvas, Paint paint, float f, float f2, int i) {
                float f3 = f2;
                if (f == f3) {
                    return;
                }
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setAntiAlias(true);
                paint.setColor(i);
                paint.setStrokeWidth(this.LIZLLL);
                float f4 = this.LIZJ;
                float f5 = f * 360.0f * f4;
                if (f3 < f) {
                    f3 += 1.0f;
                }
                float f6 = (f3 - f) * 360.0f * f4;
                float f7 = this.LJFF;
                float f8 = -f7;
                canvas.drawArc(new RectF(f8, f8, f7, f7), f5, f6, false, paint);
                if (this.LJ > 0.0f && Math.abs(f6) < 360.0f) {
                    paint.setStyle(Paint.Style.FILL);
                    float f9 = this.LJ;
                    float f10 = -f9;
                    RectF rectF = new RectF(f10, f10, f9, f9);
                    LJFF(canvas, paint, this.LIZLLL, this.LJ, f5, true, rectF);
                    LJFF(canvas, paint, this.LIZLLL, this.LJ, f5 + f6, false, rectF);
                }
            }

            public final void LJFF(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
                float f4;
                if (z) {
                    f4 = -1.0f;
                } else {
                    f4 = 1.0f;
                }
                canvas.save();
                canvas.rotate(f3);
                float f5 = f / 2.0f;
                float f6 = f4 * f2;
                canvas.drawRect((this.LJFF - f5) + f2, Math.min(0.0f, this.LIZJ * f6), (this.LJFF + f5) - f2, Math.max(0.0f, f6 * this.LIZJ), paint);
                canvas.translate((this.LJFF - f5) + f2, 0.0f);
                canvas.drawArc(rectF, 180.0f, (-f4) * 90.0f * this.LIZJ, true, paint);
                canvas.translate(f - (f2 * 2.0f), 0.0f);
                canvas.drawArc(rectF, 0.0f, f4 * 90.0f * this.LIZJ, true, paint);
                canvas.restore();
            }
        }));
    }

    @Override // X.AbstractC21533919Pd
    public final C19PH LIZ(Context context, AttributeSet attributeSet) {
        return new C19PI(context, attributeSet);
    }
}
