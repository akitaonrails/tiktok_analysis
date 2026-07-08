package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0GTN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTN extends View {
    public final Paint LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final RectF[] LLJ;

    public final boolean getEnableCropOpt() {
        return this.LLILZLL;
    }

    public final boolean getShouldDrawDot() {
        return this.LLILZIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0GTN(Context context) {
        super(context, null, 0);
        int i = 0;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        this.LLILZIL = true;
        float f = context.getResources().getDisplayMetrics().density;
        this.LLIZ = f;
        this.LLIZLLLIL = f * 12;
        RectF[] rectFArr = new RectF[6];
        do {
            rectFArr[i] = new RectF();
            i++;
        } while (i < 6);
        this.LLJ = rectFArr;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iArgb;
        int iArgb2;
        super.onDraw(canvas);
        boolean z = this.LLILZLL;
        int i = 128;
        int i2 = 0;
        int i3 = 255;
        Float fValueOf = Float.valueOf(1.5f);
        if (z) {
            RectF[] rectFArr = this.LLJ;
            int length = rectFArr.length;
            int i4 = 0;
            while (i2 < length) {
                RectF rectF = rectFArr[i2];
                int i5 = i4 + 1;
                Paint paint = this.LL;
                if (i4 == 0 || i4 == 5 || (i4 == this.LLJ.length - 1 && this.LLILLJJLI)) {
                    iArgb2 = -1;
                } else {
                    iArgb2 = Color.argb(i, 255, 255, 255);
                }
                paint.setColor(iArgb2);
                if (this.LLILZ && i4 == 0) {
                    if (this.LLILZIL) {
                        canvas.drawCircle(rectF.left, rectF.top - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(11.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), this.LL);
                    }
                } else if (i4 == 5 && this.LLILLL && this.LLILZIL) {
                    RectF rectF2 = new RectF(rectF);
                    canvas.drawCircle(rectF2.left, rectF2.top - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(11.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), this.LL);
                }
                canvas.drawRect(rectF, this.LL);
                i2++;
                i4 = i5;
                i = 128;
            }
            return;
        }
        RectF[] rectFArr2 = this.LLJ;
        int length2 = rectFArr2.length;
        int i6 = 0;
        while (i2 < length2) {
            RectF rectF3 = rectFArr2[i2];
            int i7 = i6 + 1;
            Paint paint2 = this.LL;
            if (i6 == 0 || i6 == 5 || (i6 == this.LLJ.length - 1 && this.LLILLJJLI)) {
                iArgb = -1;
            } else {
                iArgb = Color.argb(128, i3, i3, i3);
            }
            paint2.setColor(iArgb);
            if (this.LLILZ && i6 == 0) {
                canvas.drawCircle(rectF3.left, rectF3.top - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), this.LL);
            } else {
                if (i6 == 5 && this.LLILLL) {
                    RectF rectF4 = new RectF(rectF3);
                    float f = rectF4.left;
                    float f2 = this.LLIZ;
                    rectF4.left = f - (f2 * 1.5f);
                    rectF4.right -= f2 * 1.5f;
                    canvas.drawRect(rectF4, this.LL);
                    canvas.drawCircle(rectF4.left + (this.LLIZ * 1.5f), rectF4.top - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), this.LL);
                }
                i2++;
                i6 = i7;
                i3 = 255;
            }
            canvas.drawRect(rectF3, this.LL);
            i2++;
            i6 = i7;
            i3 = 255;
        }
    }

    public final void setBeforeZero(boolean z) {
        this.LLILLL = z;
    }

    public final void setEnableCropOpt(boolean z) {
        this.LLILZLL = z;
    }

    public final void setLastOne(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setShouldDrawDot(boolean z) {
        this.LLILZIL = z;
    }

    public final void setZero(boolean z) {
        this.LLILZ = z;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.LLILZLL) {
            i3 = 32;
        } else {
            i3 = 24;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSizeChanged(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            super.onSizeChanged(r9, r10, r11, r12)
            float r6 = (float) r9
            r0 = 1084227584(0x40a00000, float:5.0)
            float r6 = r6 / r0
            float r7 = (float) r10
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            float r7 = r7 - r0
            float r0 = r8.LLIZLLLIL
            float r5 = r7 - r0
            android.graphics.RectF[] r0 = r8.LLJ
            int r4 = r0.length
            r3 = 0
        L1a:
            if (r3 >= r4) goto L3c
            float r2 = r8.LLIZ
            boolean r0 = r8.LLILZLL
            if (r0 != 0) goto L28
            if (r3 != 0) goto L35
            boolean r0 = r8.LLILZ
            if (r0 != 0) goto L38
        L28:
            android.graphics.RectF[] r0 = r8.LLJ
            r1 = r0[r3]
            float r0 = (float) r3
            float r0 = r0 * r6
            float r2 = r2 + r0
            r1.set(r0, r5, r2, r7)
            int r3 = r3 + 1
            goto L1a
        L35:
            r0 = 5
            if (r3 != r0) goto L28
        L38:
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r0
            goto L28
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0GTN.onSizeChanged(int, int, int, int):void");
    }
}
