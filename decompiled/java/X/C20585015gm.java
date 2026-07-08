package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20585015gm {
    public final Context LIZ;
    public Paint LIZLLL;
    public int LJFF;
    public int LJI;
    public Drawable LJII;
    public boolean LJIIIIZZ;
    public final Path LIZIZ = new Path();
    public final Paint LIZJ = new Paint(1);
    public EnumC1257160ios LJ = EnumC1257160ios.NORMAL;

    public C20585015gm(Context context) {
        this.LIZ = context;
    }

    public final void LIZJ(Canvas canvas) {
        int iSave;
        boolean z = false;
        if (this.LIZ.getResources().getConfiguration().getLayoutDirection() == 1 && this.LJFF > 0) {
            z = true;
        }
        if (z) {
            iSave = canvas.save();
            canvas.scale(-1.0f, 1.0f, this.LJFF / 2.0f, 0.0f);
        } else {
            iSave = -1;
        }
        canvas.drawPath(this.LIZIZ, this.LIZJ);
        Paint paint = this.LIZLLL;
        if (paint != null) {
            canvas.drawPath(this.LIZIZ, paint);
        }
        if (iSave != -1) {
            canvas.restoreToCount(iSave);
        }
        Drawable drawable = this.LJII;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final void LIZLLL(EnumC1257160ios enumC1257160ios) {
        boolean z;
        float fLIZIZ;
        Paint paint;
        this.LJ = enumC1257160ios;
        int i = this.LJFF;
        int i2 = this.LJI;
        int iIntValue = 0;
        if (this.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ(enumC1257160ios, i, i2, z);
        LIZIZ(enumC1257160ios, this.LJII, this.LJFF, this.LJI);
        Float shadowRadiusDp = enumC1257160ios.getShadowRadiusDp();
        if (shadowRadiusDp != null) {
            fLIZIZ = C418440Gaw.LIZIZ(shadowRadiusDp);
        } else {
            fLIZIZ = 12.0f;
        }
        this.LIZJ.setShadowLayer(fLIZIZ, C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(2.0f)), enumC1257160ios.getPaintShadowColor());
        Integer strokePaintColorAttrRes = enumC1257160ios.getStrokePaintColorAttrRes();
        if (strokePaintColorAttrRes != null) {
            int iIntValue2 = strokePaintColorAttrRes.intValue();
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(0.5f)));
            Integer numLIZJ = C1308910kAL.LIZJ(iIntValue2, this.LIZ);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            paint.setColor(iIntValue);
        } else {
            paint = null;
        }
        this.LIZLLL = paint;
    }

    public final void LJ(boolean z) {
        int i;
        Integer numLIZJ;
        this.LJIIIIZZ = z;
        int iIntValue = -1;
        if (z && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, this.LIZ)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        this.LIZJ.setColor(iIntValue);
        if (this.LJII != null) {
            if (z && C960203pA.LIZIZ(this.LIZ)) {
                i = R.drawable.acg;
            } else {
                i = R.drawable.acf;
            }
            this.LJII = C800330VaR.LIZIZ(this.LIZ, i);
        }
    }

    public final void LIZ(EnumC1257160ios enumC1257160ios, int i, int i2, boolean z) {
        float starStickerMarginTopDp;
        float starStickerMarginRightDp;
        if (i > 0 && i2 > 0) {
            Path path = this.LIZIZ;
            float f = i / this.LIZ.getResources().getDisplayMetrics().density;
            float f2 = i2 / this.LIZ.getResources().getDisplayMetrics().density;
            if (z) {
                starStickerMarginTopDp = enumC1257160ios.getStarStickerMarginTopDp();
                starStickerMarginRightDp = enumC1257160ios.getStarStickerMarginRightDp();
            } else {
                starStickerMarginTopDp = 0.0f;
                starStickerMarginRightDp = 0.0f;
            }
            float rectCornerRadius = enumC1257160ios.getRectCornerRadius();
            float tailLeftToRectRight = enumC1257160ios.getTailLeftToRectRight();
            Pair<Float, Float>[] tailPoints1 = enumC1257160ios.getTailPoints1();
            Pair<Float, Float>[] tailPoints2 = enumC1257160ios.getTailPoints2();
            float bubblePaddingBottomDp = enumC1257160ios.getBubblePaddingBottomDp();
            float dotDiameter = enumC1257160ios.getDotDiameter();
            path.reset();
            float f3 = f - starStickerMarginRightDp;
            float f4 = (f2 - 0.0f) - bubblePaddingBottomDp;
            float f5 = 0.0f + rectCornerRadius;
            float f6 = starStickerMarginTopDp + rectCornerRadius;
            float f7 = f3 - rectCornerRadius;
            float f8 = f4 - rectCornerRadius;
            float f9 = f3 - tailLeftToRectRight;
            float f10 = (bubblePaddingBottomDp + f4) - dotDiameter;
            path.moveTo(C418440Gaw.LIZIZ(Float.valueOf(f5)), C418440Gaw.LIZIZ(Float.valueOf(starStickerMarginTopDp)));
            path.quadTo(C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(starStickerMarginTopDp)), C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(f6)));
            path.lineTo(C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(f8)));
            path.quadTo(C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(f4)), C418440Gaw.LIZIZ(Float.valueOf(f5)), C418440Gaw.LIZIZ(Float.valueOf(f4)));
            path.lineTo(C418440Gaw.LIZIZ(Float.valueOf(f9)), C418440Gaw.LIZIZ(Float.valueOf(f4)));
            path.cubicTo(C418440Gaw.LIZIZ(Float.valueOf(tailPoints1[0].getFirst().floatValue() + f9)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints1[0].getSecond().floatValue() + f4)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints1[1].getFirst().floatValue() + f9)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints1[1].getSecond().floatValue() + f4)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints1[2].getFirst().floatValue() + f9)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints1[2].getSecond().floatValue() + f4)));
            path.cubicTo(C418440Gaw.LIZIZ(Float.valueOf(tailPoints2[0].getFirst().floatValue() + f9)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints2[0].getSecond().floatValue() + f4)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints2[1].getFirst().floatValue() + f9)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints2[1].getSecond().floatValue() + f4)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints2[2].getFirst().floatValue() + f9)), C418440Gaw.LIZIZ(Float.valueOf(tailPoints2[2].getSecond().floatValue() + f4)));
            path.lineTo(C418440Gaw.LIZIZ(Float.valueOf(f7)), C418440Gaw.LIZIZ(Float.valueOf(f4)));
            path.quadTo(C418440Gaw.LIZIZ(Float.valueOf(f3)), C418440Gaw.LIZIZ(Float.valueOf(f4)), C418440Gaw.LIZIZ(Float.valueOf(f3)), C418440Gaw.LIZIZ(Float.valueOf(f8)));
            path.lineTo(C418440Gaw.LIZIZ(Float.valueOf(f3)), C418440Gaw.LIZIZ(Float.valueOf(f6)));
            path.quadTo(C418440Gaw.LIZIZ(Float.valueOf(f3)), C418440Gaw.LIZIZ(Float.valueOf(starStickerMarginTopDp)), C418440Gaw.LIZIZ(Float.valueOf(f7)), C418440Gaw.LIZIZ(Float.valueOf(starStickerMarginTopDp)));
            path.close();
            path.addOval(C418440Gaw.LIZIZ(Float.valueOf(f9)), C418440Gaw.LIZIZ(Float.valueOf(f10)), C418440Gaw.LIZIZ(Float.valueOf(f9 + dotDiameter)), C418440Gaw.LIZIZ(Float.valueOf(dotDiameter + f10)), Path.Direction.CW);
        }
    }

    public final void LIZIZ(EnumC1257160ios enumC1257160ios, Drawable drawable, int i, int i2) {
        int i3;
        if (i > 0 && i2 > 0) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getStarStickerSizeDp())));
            if (this.LIZ.getResources().getConfiguration().getLayoutDirection() == 1) {
                i3 = 0;
            } else {
                i3 = i - iLIZIZ;
            }
            if (drawable != null) {
                drawable.setBounds(i3, 0, i3 + iLIZIZ, iLIZIZ);
            }
        }
    }
}
