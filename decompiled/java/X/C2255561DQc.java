package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AwS0S0700002_35;
import kotlin.jvm.internal.AwS1S0700002_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255561DQc extends Drawable {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final Paint LJIIIZ;
    public final Paint LJIIJ;

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
    /* JADX WARN: Type inference failed for: r0v22, types: [T, X.1DQX] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.1D3e] */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, X.1DQZ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, X.1DQa] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Integer num = this.LJ;
        int i = 1;
        if (num != null) {
            this.LJIIJ.setColor(num.intValue());
            Path path = new Path();
            float f = this.LJFF;
            float f2 = this.LJI;
            float f3 = this.LJIIIIZZ;
            float f4 = this.LJII;
            path.addRoundRect(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, this.LJIIJ);
        }
        Paint paint = this.LJIIIZ;
        paint.setColor(this.LIZLLL);
        paint.setStrokeWidth(this.LIZJ);
        float fWidth = (getBounds().width() * 2) + (getBounds().height() * 2);
        float f5 = this.LJFF;
        float f6 = this.LJIIIIZZ;
        float f7 = this.LJI;
        float f8 = this.LJII;
        float f9 = 2;
        float f10 = ((fWidth - ((((f5 + f6) + f7) + f8) * f9)) + (((((f5 + f6) + f7) + f8) * 3.1415927f) / 2.0f)) - (8 * (this.LIZJ / f9));
        float f11 = this.LIZ + this.LIZIZ;
        C118300cf c118300cf = new C118300cf();
        int i2 = (int) (f10 / f11);
        if (i2 >= 1) {
            i = i2;
        }
        c118300cf.element = i;
        float f12 = this.LIZ;
        float f13 = f12 / (this.LIZIZ + f12);
        float f14 = (f10 / i) * f13;
        float f15 = (f10 / i) * (1.0f - f13);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C1DQX.LL;
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = EnumC2249601D3e.LL;
        C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = f14;
        C259800zU c259800zU3 = new C259800zU();
        float f16 = this.LIZJ;
        c259800zU3.element = new C2255541DQa((f16 / f9) + this.LJFF, f16 / f9);
        C259800zU c259800zU4 = new C259800zU();
        float fWidth2 = getBounds().width();
        float f18 = this.LIZJ;
        float f19 = this.LJI;
        c259800zU4.element = new C1DQZ((fWidth2 - (f18 / f9)) - f19, (f18 / f9) + f19, f19, 4.712389f);
        AwS1S0700002_35 awS1S0700002_35 = new AwS1S0700002_35(f15, f14, canvas, this, c817403Hg, c118300cf, c259800zU3, c259800zU, c259800zU2, 1);
        AwS0S0700002_35 awS0S0700002_35 = new AwS0S0700002_35(f15, f14, canvas, this, c817403Hg, c118300cf, c259800zU4, c259800zU2, c259800zU, 1);
        while (c118300cf.element > 0) {
            switch (((C1DQX) c259800zU.element).ordinal()) {
                case 0:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 179), new AwS614S0100000_35(this, 180), new AwS436S0200000_35(c259800zU4, (C259800zU<C2255541DQa>) this, (C2255561DQc) 67));
                    break;
                case 1:
                    awS0S0700002_35.invoke(Float.valueOf(6.2831855f), new AwS436S0200000_35(c259800zU3, (C259800zU<C2255541DQa>) this, (C2255561DQc) 68));
                    break;
                case 2:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 181), new AwS614S0100000_35(this, 182), new AwS436S0200000_35(c259800zU4, (C259800zU<C2255541DQa>) this, (C2255561DQc) 69));
                    break;
                case 3:
                    awS0S0700002_35.invoke(Float.valueOf(1.5707964f), new AwS436S0200000_35(c259800zU3, (C259800zU<C2255541DQa>) this, (C2255561DQc) 62));
                    break;
                case 4:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 175), new AwS614S0100000_35(this, 176), new AwS436S0200000_35(c259800zU4, (C259800zU<C2255541DQa>) this, (C2255561DQc) 63));
                    break;
                case 5:
                    awS0S0700002_35.invoke(Float.valueOf(3.1415927f), new AwS436S0200000_35(c259800zU3, (C259800zU<C2255541DQa>) this, (C2255561DQc) 64));
                    break;
                case 6:
                    awS1S0700002_35.invoke(new AwS614S0100000_35(this, 177), new AwS614S0100000_35(this, 178), new AwS436S0200000_35(c259800zU4, (C259800zU<C2255541DQa>) this, (C2255561DQc) 65));
                    break;
                case 7:
                    awS0S0700002_35.invoke(Float.valueOf(4.712389f), new AwS436S0200000_35(c259800zU3, (C259800zU<C2255541DQa>) this, (C2255561DQc) 66));
                    break;
                default:
                    throw new C1954807lC();
            }
        }
    }

    public final void LIZ(Canvas canvas, C1DQZ c1dqz, C1DQZ c1dqz2) {
        float f = c1dqz.LIZ;
        float f2 = c1dqz.LIZJ;
        float f3 = c1dqz.LIZIZ;
        float f4 = c1dqz.LIZLLL;
        float f5 = 180;
        canvas.drawArc(f - f2, f3 - f2, f + f2, f3 + f2, (f4 * f5) / 3.1415927f, ((c1dqz2.LIZLLL - f4) * f5) / 3.1415927f, false, this.LJIIIZ);
    }

    public /* synthetic */ C2255561DQc(float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, int i2) {
        this((i2 & 1) != 0 ? 30.0f : f, (i2 & 2) != 0 ? 60.0f : f2, (i2 & 4) != 0 ? 25.0f : f3, (i2 & 8) != 0 ? -3355444 : i, (Integer) null, (i2 & 32) != 0 ? 70.0f : f4, (i2 & 64) != 0 ? 70.0f : f5, (i2 & 128) != 0 ? 70.0f : f6, (i2 & 256) != 0 ? 70.0f : f7);
    }

    public C2255561DQc(float f, float f2, float f3, int i, Integer num, float f4, float f5, float f6, float f7) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = i;
        this.LJ = num;
        this.LJFF = f4;
        this.LJI = f5;
        this.LJII = f6;
        this.LJIIIIZZ = f7;
        Paint paint = new Paint();
        paint.setStrokeWidth(30.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.LJIIIZ = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.LJIIJ = paint2;
    }
}
