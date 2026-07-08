package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369690EeV extends View {
    public Bitmap LL;
    public final Paint LLILLJJLI;
    public final Rect LLILLL;
    public final Path LLILZ;
    public final RectF LLILZIL;
    public final Path LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final Paint LLJ;

    public final void LIZ() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float f = this.LLIZ;
        boolean z = getLayoutDirection() == 1;
        float[] fArr = z ? new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f} : new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        this.LLILZIL.set(0.0f, 0.0f, getWidth(), getHeight());
        this.LLILZ.reset();
        this.LLILZ.addRoundRect(this.LLILZIL, fArr, Path.Direction.CW);
        float f2 = this.LLIZLLLIL / 2.0f;
        float f3 = this.LLIZ - f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float height = getHeight() - f2;
        this.LLILZLL.reset();
        if (z) {
            this.LLILZLL.moveTo(getWidth(), f2);
            this.LLILZLL.lineTo(f2 + f3, f2);
            float f4 = 2 * f3;
            float f5 = f2 + f4;
            this.LLILZLL.arcTo(new RectF(f2, f2, f5, f5), 270.0f, -90.0f);
            this.LLILZLL.lineTo(f2, height - f3);
            this.LLILZLL.arcTo(new RectF(f2, height - f4, f5, height), 180.0f, -90.0f);
            this.LLILZLL.lineTo(getWidth(), height);
        } else {
            float width = getWidth() - f2;
            this.LLILZLL.moveTo(0.0f, f2);
            this.LLILZLL.lineTo(width - f3, f2);
            float f6 = 2 * f3;
            float f7 = width - f6;
            this.LLILZLL.arcTo(new RectF(f7, f2, width, f2 + f6), 270.0f, 90.0f);
            this.LLILZLL.lineTo(width, height - f3);
            this.LLILZLL.arcTo(new RectF(f7, height - f6, width, height), 0.0f, 90.0f);
            this.LLILZLL.lineTo(0.0f, height);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.LLILZ;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            Bitmap bitmap = this.LL;
            if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int iCeil = (int) Math.ceil(((double) canvas.getWidth()) / ((double) width));
                for (int i = 0; i < iCeil; i++) {
                    int i2 = i * width;
                    Rect rect = this.LLILLL;
                    int i3 = i2 + width;
                    int height2 = canvas.getHeight();
                    if (height <= height2) {
                        height2 = height;
                    }
                    rect.set(i2, 0, i3, height2);
                    canvas.drawBitmap(bitmap, (Rect) null, this.LLILLL, this.LLILLJJLI);
                }
            } else {
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.LLILLJJLI);
            }
            canvas.restoreToCount(iSave);
            canvas.drawPath(this.LLILZLL, this.LLJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        LIZ();
    }

    public final void setFrameBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            this.LL = bitmap;
        }
        invalidate();
    }

    public C369690EeV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setAlpha(51);
        this.LLILLJJLI = paint;
        this.LLILLL = new Rect();
        this.LLILZ = new Path();
        this.LLILZIL = new RectF();
        this.LLILZLL = new Path();
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        this.LLIZLLLIL = fLIZIZ;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fLIZIZ);
        paint2.setPathEffect(new DashPathEffect(new float[]{C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))}, 0.0f));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
        if (numLIZJ != null) {
            paint2.setColor(numLIZJ.intValue());
        }
        this.LLJ = paint2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
