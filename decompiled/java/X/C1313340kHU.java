package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kHU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313340kHU {
    public EnumC1313350kHV LIZ = EnumC1313350kHV.NONE;
    public Integer LIZIZ = -16777216;
    public float LIZJ;
    public Rect LIZLLL;
    public Paint LJ;
    public Path LJFF;

    public final void LIZIZ(Canvas canvas) {
        Rect rect;
        int iRound;
        int iIntValue;
        EnumC1313350kHV enumC1313350kHV = this.LIZ;
        if (enumC1313350kHV != null && !enumC1313350kHV.equals(EnumC1313350kHV.NONE) && !this.LIZ.equals(EnumC1313350kHV.HIDDEN) && this.LIZJ >= 0.001d && (rect = this.LIZLLL) != null && rect.width() >= 1 && this.LIZLLL.height() >= 1) {
            int iSave = canvas.save();
            Rect rect2 = this.LIZLLL;
            int i = rect2.left;
            int i2 = rect2.top;
            int iWidth = rect2.width();
            int iHeight = rect2.height();
            float f = this.LIZJ;
            if (f < 1.0f) {
                iRound = 1;
            } else {
                iRound = Math.round(f);
            }
            Paint paint = new Paint();
            this.LJ = paint;
            paint.setAntiAlias(false);
            this.LJ.setStyle(Paint.Style.STROKE);
            Integer num = this.LIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -16777216;
            }
            float f2 = i;
            float f3 = i2;
            float f4 = i - iRound;
            float f5 = i2 - iRound;
            int i3 = i + iWidth;
            float f6 = i3 + iRound;
            float f7 = i3;
            float f8 = iRound;
            float f9 = f8 * 0.5f;
            float f10 = f3 - f9;
            canvas.save();
            LIZ(canvas, f2, f3, f4, f5, f6, f5, f7, f3);
            int i4 = iRound * 2;
            float f11 = iWidth + i4;
            this.LIZ.strokeBorderLine(canvas, this.LJ, 1, this.LIZJ, iIntValue, f4, f10, f6, f10, f11, f8);
            canvas.restore();
            int i5 = i2 + iHeight;
            float f12 = i5;
            float f13 = i5 + iRound;
            float f14 = f7 + f9;
            canvas.save();
            LIZ(canvas, f7, f3, f7, f12, f6, f13, f6, f5);
            float f15 = iHeight + i4;
            int i6 = iIntValue;
            this.LIZ.strokeBorderLine(canvas, this.LJ, 2, this.LIZJ, i6, f14, f5, f14, f13, f15, f8);
            canvas.restore();
            float f16 = f12 + f9;
            canvas.save();
            LIZ(canvas, f2, f12, f7, f12, f6, f13, f4, f13);
            this.LIZ.strokeBorderLine(canvas, this.LJ, 3, this.LIZJ, i6, f6, f16, f4, f16, f11, f8);
            canvas.restore();
            float f18 = f2 - f9;
            canvas.save();
            LIZ(canvas, f2, f3, f4, f5, f4, f13, f2, f12);
            this.LIZ.strokeBorderLine(canvas, this.LJ, 0, this.LIZJ, i6, f18, f13, f18, f5, f15, f8);
            canvas.restore();
            this.LJ.setAntiAlias(true);
            canvas.restoreToCount(iSave);
        }
    }

    public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (this.LJFF == null) {
            this.LJFF = new Path();
        }
        this.LJFF.reset();
        this.LJFF.moveTo(f, f2);
        this.LJFF.lineTo(f3, f4);
        this.LJFF.lineTo(f5, f6);
        this.LJFF.lineTo(f7, f8);
        this.LJFF.lineTo(f, f2);
        canvas.clipPath(this.LJFF);
    }
}
