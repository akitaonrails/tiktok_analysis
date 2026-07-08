package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AwS0S0700002_35;
import kotlin.jvm.internal.AwS1S0700002_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255551DQb extends Drawable {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final Paint LJIIIIZZ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, X.1DQW] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.1D3d] */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, X.1DQY] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, X.1DQV] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.LJIIIIZZ;
        paint.setColor(this.LIZLLL);
        paint.setStrokeWidth(this.LIZJ);
        float fWidth = (getBounds().width() * 2) + (getBounds().height() * 2);
        float f = this.LJ;
        float f2 = this.LJII;
        float f3 = this.LJFF;
        float f4 = this.LJI;
        float f5 = 2;
        float f6 = ((fWidth - ((((f + f2) + f3) + f4) * f5)) + (((((f + f2) + f3) + f4) * 3.1415927f) / 2.0f)) - (8 * (this.LIZJ / f5));
        float f7 = this.LIZ + this.LIZIZ;
        C118300cf c118300cf = new C118300cf();
        int i = (int) (f6 / f7);
        if (i < 1) {
            i = 1;
        }
        c118300cf.element = i;
        float f8 = this.LIZ;
        float f9 = f8 / (this.LIZIZ + f8);
        float f10 = (f6 / i) * f9;
        float f11 = (f6 / i) * (1.0f - f9);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C1DQW.LL;
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = EnumC2249591D3d.LL;
        C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = f10;
        C259800zU c259800zU3 = new C259800zU();
        float f12 = this.LIZJ;
        c259800zU3.element = new C1DQV((f12 / f5) + this.LJ, f12 / f5);
        C259800zU c259800zU4 = new C259800zU();
        float fWidth2 = getBounds().width();
        float f13 = this.LIZJ;
        float f14 = this.LJFF;
        c259800zU4.element = new C1DQY((fWidth2 - (f13 / f5)) - f14, (f13 / f5) + f14, f14, 4.712389f);
        AwS1S0700002_35 awS1S0700002_35 = new AwS1S0700002_35(f11, f10, canvas, this, c817403Hg, c118300cf, c259800zU3, c259800zU, c259800zU2, 0);
        AwS0S0700002_35 awS0S0700002_35 = new AwS0S0700002_35(f11, f10, canvas, this, c817403Hg, c118300cf, c259800zU4, c259800zU2, c259800zU, 0);
        while (c118300cf.element > 0) {
            switch (((C1DQW) c259800zU.element).ordinal()) {
                case 0:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 135), new AwS614S0100000_35(this, 136), new AwS436S0200000_35(c259800zU4, (C259800zU<C1DQY>) this, (C2255551DQb) 57));
                    break;
                case 1:
                    awS0S0700002_35.invoke(Float.valueOf(6.2831855f), new AwS436S0200000_35(c259800zU3, (C259800zU<C1DQY>) this, (C2255551DQb) 58));
                    break;
                case 2:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 137), new AwS614S0100000_35(this, 138), new AwS436S0200000_35(c259800zU4, (C259800zU<C1DQY>) this, (C2255551DQb) 59));
                    break;
                case 3:
                    awS0S0700002_35.invoke(Float.valueOf(1.5707964f), new AwS436S0200000_35(c259800zU3, (C259800zU<C1DQY>) this, (C2255551DQb) 60));
                    break;
                case 4:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 131), new AwS614S0100000_35(this, 132), new AwS436S0200000_35(c259800zU4, (C259800zU<C1DQY>) this, (C2255551DQb) 53));
                    break;
                case 5:
                    awS0S0700002_35.invoke(Float.valueOf(3.1415927f), new AwS436S0200000_35(c259800zU3, (C259800zU<C1DQY>) this, (C2255551DQb) 54));
                    break;
                case 6:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 133), new AwS614S0100000_35(this, 134), new AwS436S0200000_35(c259800zU4, (C259800zU<C1DQY>) this, (C2255551DQb) 55));
                    break;
                case 7:
                    awS0S0700002_35.invoke(Float.valueOf(4.712389f), new AwS436S0200000_35(c259800zU3, (C259800zU<C1DQY>) this, (C2255551DQb) 56));
                    break;
                default:
                    throw new C1954807lC();
            }
        }
    }

    public final void LIZ(Canvas canvas, C1DQY c1dqy, C1DQY c1dqy2) {
        float f = c1dqy.LIZ;
        float f2 = c1dqy.LIZJ;
        float f3 = c1dqy.LIZIZ;
        float f4 = c1dqy.LIZLLL;
        float f5 = 180;
        canvas.drawArc(f - f2, f3 - f2, f + f2, f3 + f2, (f4 * f5) / 3.1415927f, ((c1dqy2.LIZLLL - f4) * f5) / 3.1415927f, false, this.LJIIIIZZ);
    }

    public C2255551DQb(float f, float f2, float f3, int i, float f4, float f5, float f6, float f7) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = i;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
        this.LJII = f7;
        Paint paint = new Paint();
        paint.setStrokeWidth(30.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.LJIIIIZZ = paint;
    }
}
