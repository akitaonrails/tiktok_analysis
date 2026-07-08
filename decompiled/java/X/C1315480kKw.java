package X;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315480kKw extends Canvas {
    public boolean LIZ;

    public final boolean LIZ(View view) {
        boolean z;
        C1315570kL5 c1315570kL5 = new C1315570kL5(view);
        synchronized (this) {
            try {
                c1315570kL5.LIZ(this);
                z = this.LIZ;
                this.LIZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        if (picture.getWidth() > 0 && picture.getHeight() > 0) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        if (picture.getWidth() > 0 && picture.getHeight() > 0) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        if (!rect.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        if (picture.getWidth() > 0 && picture.getHeight() > 0) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        if (!rectF.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        if (TextUtils.isEmpty(str)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        if (!rectF.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (!rectF.isEmpty() || !rectF2.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        if (TextUtils.isEmpty(new String(cArr))) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        if (!new RectF(f, f2, f3, f4).isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        if (!TextUtils.isEmpty(new String(cArr))) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        if (!rectF.isEmpty() || !rectF2.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        if (!new RectF(f, f2, f3, f4).isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        if (!TextUtils.isEmpty(new String(cArr))) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        this.LIZ = true;
    }
}
