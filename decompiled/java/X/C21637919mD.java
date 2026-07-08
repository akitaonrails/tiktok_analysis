package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19mD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21637919mD extends View {
    public C1664690tQB<C21638019mE> LL;
    public LifecycleOwner LLILLJJLI;
    public Paint LLILLL;
    public DashPathEffect LLILZ;

    public C21637919mD(Context context) {
        super(context, null, 0);
    }

    private final void setLinePaintShadowRadius(float f) {
        Paint paint = this.LLILLL;
        if (paint == null) {
            paint = null;
        }
        paint.setShadowLayer(10 * f, 0.0f, 0.0f, -7829368);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1664690tQB<C21638019mE> c1664690tQB;
        C1664690tQB<C21638019mE> c1664690tQB2;
        C1664690tQB<C21638019mE> c1664690tQB3;
        C1664690tQB<C21638019mE> c1664690tQB4;
        C1664690tQB<C21638019mE> c1664690tQB5;
        super.onDraw(canvas);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("left line visible ");
        C1664690tQB<C21638019mE> c1664690tQB6 = this.LL;
        if (c1664690tQB6 == null) {
            c1664690tQB6 = null;
        }
        sbLIZ.append(c1664690tQB6.LIZ.LJIIIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        Paint paint = this.LLILLL;
        if (paint == null) {
            paint = null;
        }
        paint.setPathEffect(null);
        Boolean[] boolArr = new Boolean[6];
        C1664690tQB<C21638019mE> c1664690tQB7 = this.LL;
        if (c1664690tQB7 == null) {
            c1664690tQB7 = null;
        }
        boolArr[0] = Boolean.valueOf(c1664690tQB7.LIZ.LJIIIZ);
        C1664690tQB<C21638019mE> c1664690tQB8 = this.LL;
        if (c1664690tQB8 == null) {
            c1664690tQB8 = null;
        }
        boolArr[1] = Boolean.valueOf(c1664690tQB8.LIZ.LJII);
        C1664690tQB<C21638019mE> c1664690tQB9 = this.LL;
        if (c1664690tQB9 == null) {
            c1664690tQB9 = null;
        }
        boolArr[2] = Boolean.valueOf(c1664690tQB9.LIZ.LJIIJ);
        C1664690tQB<C21638019mE> c1664690tQB10 = this.LL;
        if (c1664690tQB10 == null) {
            c1664690tQB10 = null;
        }
        boolArr[3] = Boolean.valueOf(c1664690tQB10.LIZ.LJIIIIZZ);
        C1664690tQB<C21638019mE> c1664690tQB11 = this.LL;
        if (c1664690tQB11 == null) {
            c1664690tQB11 = null;
        }
        boolArr[4] = Boolean.valueOf(c1664690tQB11.LIZ.LJIIL);
        C1664690tQB<C21638019mE> c1664690tQB12 = this.LL;
        if (c1664690tQB12 == null) {
            c1664690tQB12 = null;
        }
        boolArr[5] = Boolean.valueOf(c1664690tQB12.LIZ.LJIIJJI);
        ArrayList arrayListLJ = C1697810uHb.LJ(boolArr);
        RectF[] rectFArr = new RectF[6];
        C1664690tQB<C21638019mE> c1664690tQB13 = this.LL;
        if (c1664690tQB13 == null) {
            c1664690tQB = null;
        } else {
            c1664690tQB = c1664690tQB13;
        }
        rectFArr[0] = c1664690tQB.LIZ.LIZJ;
        if (c1664690tQB13 == null) {
            c1664690tQB2 = null;
        } else {
            c1664690tQB2 = c1664690tQB13;
        }
        rectFArr[1] = c1664690tQB2.LIZ.LIZ;
        if (c1664690tQB13 == null) {
            c1664690tQB3 = null;
        } else {
            c1664690tQB3 = c1664690tQB13;
        }
        rectFArr[2] = c1664690tQB3.LIZ.LIZLLL;
        if (c1664690tQB13 == null) {
            c1664690tQB4 = null;
        } else {
            c1664690tQB4 = c1664690tQB13;
        }
        rectFArr[3] = c1664690tQB4.LIZ.LIZIZ;
        if (c1664690tQB13 == null) {
            c1664690tQB5 = null;
        } else {
            c1664690tQB5 = c1664690tQB13;
        }
        rectFArr[4] = c1664690tQB5.LIZ.LJFF;
        if (c1664690tQB13 == null) {
            c1664690tQB13 = null;
        }
        rectFArr[5] = c1664690tQB13.LIZ.LJ;
        ArrayList arrayListLJ2 = C1697810uHb.LJ(rectFArr);
        Float[] fArr = new Float[6];
        C1664690tQB<C21638019mE> c1664690tQB14 = this.LL;
        if (c1664690tQB14 == null) {
            c1664690tQB14 = null;
        }
        fArr[0] = Float.valueOf(c1664690tQB14.LIZ.LJIILLIIL);
        C1664690tQB<C21638019mE> c1664690tQB15 = this.LL;
        if (c1664690tQB15 == null) {
            c1664690tQB15 = null;
        }
        fArr[1] = Float.valueOf(c1664690tQB15.LIZ.LJIILJJIL);
        C1664690tQB<C21638019mE> c1664690tQB16 = this.LL;
        if (c1664690tQB16 == null) {
            c1664690tQB16 = null;
        }
        fArr[2] = Float.valueOf(c1664690tQB16.LIZ.LJIIZILJ);
        C1664690tQB<C21638019mE> c1664690tQB17 = this.LL;
        if (c1664690tQB17 == null) {
            c1664690tQB17 = null;
        }
        fArr[3] = Float.valueOf(c1664690tQB17.LIZ.LJIILL);
        C1664690tQB<C21638019mE> c1664690tQB18 = this.LL;
        if (c1664690tQB18 == null) {
            c1664690tQB18 = null;
        }
        fArr[4] = Float.valueOf(c1664690tQB18.LIZ.LJIJI);
        C1664690tQB<C21638019mE> c1664690tQB19 = this.LL;
        if (c1664690tQB19 == null) {
            c1664690tQB19 = null;
        }
        fArr[5] = Float.valueOf(c1664690tQB19.LIZ.LJIJ);
        ArrayList arrayListLJ3 = C1697810uHb.LJ(fArr);
        int size = arrayListLJ.size();
        for (int i = 0; i < size; i++) {
            boolean zBooleanValue = ((Boolean) ListProtector.get(arrayListLJ, i)).booleanValue();
            RectF rectF = (RectF) ListProtector.get(arrayListLJ2, i);
            float fFloatValue = ((Number) ListProtector.get(arrayListLJ3, i)).floatValue();
            if (zBooleanValue) {
                Paint paint2 = this.LLILLL;
                if (paint2 == null) {
                    paint2 = null;
                }
                paint2.setAlpha((int) (255 * fFloatValue));
                if (fFloatValue <= 0.5d) {
                    fFloatValue = 0.0f;
                }
                setLinePaintShadowRadius(fFloatValue);
                float f = rectF.left;
                float f2 = rectF.top;
                float f3 = rectF.right;
                float f4 = rectF.bottom;
                Paint paint3 = this.LLILLL;
                if (paint3 == null) {
                    paint3 = null;
                }
                canvas.drawLine(f, f2, f3, f4, paint3);
            }
        }
        Paint paint4 = this.LLILLL;
        if (paint4 == null) {
            paint4 = null;
        }
        DashPathEffect dashPathEffect = this.LLILZ;
        if (dashPathEffect == null) {
            dashPathEffect = null;
        }
        paint4.setPathEffect(dashPathEffect);
        Paint paint5 = this.LLILLL;
        if (paint5 == null) {
            paint5 = null;
        }
        paint5.setAlpha(255);
        Boolean[] boolArr2 = new Boolean[1];
        C1664690tQB<C21638019mE> c1664690tQB20 = this.LL;
        if (c1664690tQB20 == null) {
            c1664690tQB20 = null;
        }
        boolArr2[0] = Boolean.valueOf(c1664690tQB20.LIZ.LJIILIIL);
        ArrayList arrayListLJ4 = C1697810uHb.LJ(boolArr2);
        RectF[] rectFArr2 = new RectF[1];
        C1664690tQB<C21638019mE> c1664690tQB21 = this.LL;
        if (c1664690tQB21 == null) {
            c1664690tQB21 = null;
        }
        rectFArr2[0] = c1664690tQB21.LIZ.LJI;
        ArrayList arrayListLJ5 = C1697810uHb.LJ(rectFArr2);
        int size2 = arrayListLJ5.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((Boolean) ListProtector.get(arrayListLJ4, i2)).booleanValue()) {
                float f5 = ((RectF) ListProtector.get(arrayListLJ5, i2)).left;
                float f6 = ((RectF) ListProtector.get(arrayListLJ5, i2)).top;
                float f7 = ((RectF) ListProtector.get(arrayListLJ5, i2)).right;
                float f8 = ((RectF) ListProtector.get(arrayListLJ5, i2)).bottom;
                Paint paint6 = this.LLILLL;
                if (paint6 == null) {
                    paint6 = null;
                }
                canvas.drawLine(f5, f6, f7, f8, paint6);
            }
        }
    }
}
