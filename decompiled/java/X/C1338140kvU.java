package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: renamed from: X.0kvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338140kvU {
    public List<C1285820jZ6> LIZ;
    public final EnumC1338170kvX LIZIZ = EnumC1338170kvX.Linear;
    public final C1338150kvV LIZJ = new C1338150kvV(0.25d, 0.37d, 0.96d);
    public final EnumC1338180kvY LIZLLL = EnumC1338180kvY.Shorter;
    public final EnumC0316009a LJ = EnumC0316009a.OKLAB;
    public final C1338190kvZ LJFF = new C1338190kvZ(0);
    public Integer LJI;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0kvT] */
    public final C1338130kvT LIZ() {
        final List<C1285820jZ6> list = this.LIZ;
        final EnumC1338180kvY enumC1338180kvY = this.LIZLLL;
        final EnumC0316009a enumC0316009a = this.LJ;
        final C1338190kvZ c1338190kvZ = this.LJFF;
        final EnumC1338170kvX enumC1338170kvX = this.LIZIZ;
        final C1338150kvV c1338150kvV = this.LIZJ;
        final Integer num = this.LJI;
        return new Drawable(list, enumC1338180kvY, enumC0316009a, c1338190kvZ, enumC1338170kvX, c1338150kvV, num) { // from class: X.0kvT
            public final List<C1285820jZ6> LIZ;
            public final EnumC1338180kvY LIZIZ;
            public final EnumC0316009a LIZJ;
            public final AbstractC1338210kvb LIZLLL;
            public final EnumC1338170kvX LJ;
            public C1338150kvV LJFF;
            public final Integer LJI;
            public final Float LJII = null;
            public final Paint LJIIIIZZ;
            public Shader LJIIIZ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            public static C443120HZe LIZLLL(C443120HZe c443120HZe) {
                double d = 255;
                double dLJII = LJII(((double) ((Number) c443120HZe.getFirst()).intValue()) / d);
                double dLJII2 = LJII(((double) ((Number) c443120HZe.getSecond()).intValue()) / d);
                double dLJII3 = LJII(((double) ((Number) c443120HZe.getThird()).intValue()) / d);
                double d2 = (((double) 0.2119035f) * dLJII) + (((double) 0.6806995f) * dLJII2) + (((double) 0.10739696f) * dLJII3);
                double d3 = (((double) 0.08830246f) * dLJII) + (((double) 0.28171465f) * dLJII2) + (((double) 0.62997866f) * dLJII3);
                double dCbrt = Math.cbrt((((double) 0.41222146f) * dLJII) + (((double) 0.53633255f) * dLJII2) + (((double) 0.051445995f) * dLJII3));
                double dCbrt2 = Math.cbrt(d2);
                double dCbrt3 = Math.cbrt(d3);
                return new C443120HZe(Double.valueOf(((((double) 0.21045426f) * dCbrt) + (((double) 0.7936178f) * dCbrt2)) - (((double) 0.004072047f) * dCbrt3)), Double.valueOf(((((double) 1.9779985f) * dCbrt) - (((double) 2.4285922f) * dCbrt2)) + (((double) 0.4505937f) * dCbrt3)), Double.valueOf(((((double) 0.025904037f) * dCbrt) + (((double) 0.78277177f) * dCbrt2)) - (((double) 0.80867577f) * dCbrt3)));
            }

            public static C443120HZe LJ(C443120HZe c443120HZe) {
                C443120HZe c443120HZeLIZLLL = LIZLLL(c443120HZe);
                double dDoubleValue = ((Number) c443120HZeLIZLLL.getFirst()).doubleValue();
                double dDoubleValue2 = ((Number) c443120HZeLIZLLL.getSecond()).doubleValue();
                double dDoubleValue3 = ((Number) c443120HZeLIZLLL.getThird()).doubleValue();
                double dSqrt = Math.sqrt((dDoubleValue2 * dDoubleValue2) + (dDoubleValue3 * dDoubleValue3));
                double dAtan2 = (Math.atan2(dDoubleValue3, dDoubleValue2) * ((double) 180)) / 3.141592653589793d;
                if (dAtan2 < 0.0d) {
                    dAtan2 += (double) 360;
                }
                return new C443120HZe(Double.valueOf(dDoubleValue), Double.valueOf(dSqrt), Double.valueOf(dAtan2));
            }

            public static double LJII(double d) {
                if (d <= 0.04045d) {
                    return d / 12.92d;
                }
                return Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }

            public static double LJIIIIZZ(double d) {
                if (d <= 0.0031308d) {
                    return d * 12.92d;
                }
                return (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:128:0x06b8  */
            /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v11, types: [T] */
            /* JADX WARN: Type inference failed for: r12v12 */
            /* JADX WARN: Type inference failed for: r12v13 */
            /* JADX WARN: Type inference failed for: r12v14 */
            /* JADX WARN: Type inference failed for: r12v22 */
            /* JADX WARN: Type inference failed for: r18v0, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r18v4, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r2v124, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r6v4 */
            /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(android.graphics.Rect r33) {
                /*
                    Method dump skipped, instruction units count: 2102
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1338130kvT.LIZJ(android.graphics.Rect):void");
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                if (this.LJIIIZ == null) {
                    LIZJ(getBounds());
                }
                this.LJIIIIZZ.setShader(this.LJIIIZ);
                canvas.drawRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.LJIIIIZZ);
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                super.onBoundsChange(rect);
                LIZJ(rect);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.LJIIIIZZ.setAlpha(i);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJIIIIZZ.setColorFilter(colorFilter);
                invalidateSelf();
            }

            public static C443120HZe LIZ(double d, double d2, double d3) {
                double d4 = d + (((double) 0.39633778f) * d2) + (((double) 0.21580376f) * d3);
                double d5 = (d - (((double) 0.105561346f) * d2)) - (((double) 0.06385417f) * d3);
                double d6 = (d - (((double) 0.08948418f) * d2)) - (((double) 1.2914855f) * d3);
                double d7 = d4 * d4 * d4;
                double d8 = d5 * d5 * d5;
                double d9 = d6 * d6 * d6;
                double d10 = 255;
                return new C443120HZe(Double.valueOf(C13LZ.LIZJ(LJIIIIZZ(((((double) 4.0767245f) * d7) - (((double) 3.307217f) * d8)) + (((double) 0.23075905f) * d9)), 0.0d, 1.0d) * d10), Double.valueOf(C13LZ.LIZJ(LJIIIIZZ(((((double) (-1.2681438f)) * d7) + (((double) 2.6093323f) * d8)) - (((double) 0.34113443f) * d9)), 0.0d, 1.0d) * d10), Double.valueOf(C13LZ.LIZJ(LJIIIIZZ(((((double) 0.0041119885f) * d7) - (((double) 0.7034767f) * d8)) + (((double) 1.7068626f) * d9)), 0.0d, 1.0d) * d10));
            }

            public static C443120HZe LIZIZ(double d, double d2, double d3) {
                double d4 = (d3 * 3.141592653589793d) / ((double) 180);
                return LIZ(d, d2 * Math.cos(d4), d2 * Math.sin(d4));
            }

            public static double LJFF(double d, double d2, double d3) {
                double d4 = 3;
                double d5 = ((double) 1) - d;
                return (Math.pow(d5, 2.0d) * d4 * d * d2) + (d4 * d5 * Math.pow(d, 2.0d) * d3) + Math.pow(d, 3.0d);
            }

            public static double LJI(double d, double d2, double d3) {
                double d4 = 3;
                double d5 = 1;
                double d6 = d5 - d;
                return (Math.pow(d6, 2.0d) * d4 * d2) + (((double) 6) * d6 * d * (d3 - d2)) + (d4 * Math.pow(d, 2.0d) * (d5 - d3));
            }

            {
                this.LIZ = list;
                this.LIZIZ = enumC1338180kvY;
                this.LIZJ = enumC0316009a;
                this.LIZLLL = c1338190kvZ;
                this.LJ = enumC1338170kvX;
                this.LJFF = c1338150kvV;
                this.LJI = num;
                Paint paint = new Paint(1);
                this.LJIIIIZZ = paint;
                paint.setDither(true);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1EOI r17) {
        /*
            Method dump skipped, instruction units count: 3246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338140kvU.LIZIZ(X.1EOI):void");
    }
}
