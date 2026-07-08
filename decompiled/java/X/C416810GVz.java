package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416810GVz extends View {
    public final Paint LL;
    public Bitmap LLILLJJLI;
    public Bitmap LLILLL;
    public Bitmap LLILZ;
    public Bitmap LLILZIL;
    public Bitmap LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.LLILZ;
        if (bitmap != null) {
            LIZ(canvas, bitmap, 163.0f, 65.0f, -10.0f, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108))));
        }
        Bitmap bitmap2 = this.LLILLL;
        if (bitmap2 != null) {
            LIZ(canvas, bitmap2, 210.0f, 129.0f, 11.0f, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))));
        }
        Bitmap bitmap3 = this.LLILLJJLI;
        if (bitmap3 != null) {
            LIZ(canvas, bitmap3, 132.0f, 155.0f, -3.0f, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140))));
        }
        Bitmap bitmap4 = this.LLILZLL;
        if (bitmap4 != null) {
            LIZ(canvas, bitmap4, 171.5f, 120.0f, 0.0f, null, null);
        }
        Bitmap bitmap5 = this.LLILZIL;
        if (bitmap5 != null) {
            LIZ(canvas, bitmap5, 259.0f, 183.0f, 0.0f, null, null);
        }
    }

    public C416810GVz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Float fValueOf = Float.valueOf(343.0f);
        if (size > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf))) {
            size = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        }
        setMeasuredDimension(size, (int) (size / 1.4291667f));
    }

    public final void LIZ(Canvas canvas, Bitmap bitmap, float f, float f2, float f3, Integer num, Integer num2) {
        int width;
        int height;
        float width2 = getWidth() / C418440Gaw.LIZIZ(Float.valueOf(343.0f));
        if (num != null) {
            width = num.intValue();
        } else {
            width = bitmap.getWidth();
        }
        float width3 = (width * width2) / bitmap.getWidth();
        if (num2 != null) {
            height = num2.intValue();
        } else {
            height = bitmap.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.postScale(width3, (height * width2) / bitmap.getHeight(), bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postRotate(f3, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postTranslate((C418440Gaw.LIZIZ(Float.valueOf(f)) * width2) - (bitmap.getWidth() / 2.0f), (C418440Gaw.LIZIZ(Float.valueOf(f2)) * width2) - (bitmap.getHeight() / 2.0f));
        canvas.drawBitmap(bitmap, matrix, this.LL);
    }
}
