package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417200GXm extends C16F5 {
    public final Paint LLJJ;
    public final Rect LLJJI;
    public float LLJJIII;
    public final Matrix LLJJIJI;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fWidth = this.LLJJI.width() + (((float) Math.tan(Math.toRadians(20.0d))) * this.LLJJI.height());
        float f = (-fWidth) + (2 * fWidth * this.LLJJIII);
        Shader shader = this.LLJJ.getShader();
        Matrix matrix = this.LLJJIJI;
        matrix.reset();
        matrix.setRotate(20.0f, this.LLJJI.width() / 2.0f, this.LLJJI.height() / 2.0f);
        matrix.preTranslate(f, 0.0f);
        shader.setLocalMatrix(matrix);
        canvas.drawRect(this.LLJJI, this.LLJJ);
    }

    public final void setProgress(float f) {
        this.LLJJIII = f;
        invalidate();
    }

    public C417200GXm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LLJJ = paint;
        this.LLJJI = new Rect();
        this.LLJJIII = 0.5f;
        this.LLJJIJI = new Matrix();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJJI.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.LLJJ.setShader(new LinearGradient(0.0f, 0.0f, this.LLJJI.width(), 0.0f, new int[]{-1, 1828716543, -1, -1, 1291845631}, new float[]{0.0f, 0.2f, 0.5f, 0.8f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
