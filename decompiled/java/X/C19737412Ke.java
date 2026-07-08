package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.12Ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19737412Ke extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public float LLILLL;
    public int LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.LL;
        if (paint != null) {
            paint.setAlpha(this.LLILZ);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LLILLL, paint);
        }
        Paint paint2 = this.LLILLJJLI;
        if (paint2 != null) {
            canvas.drawCircle(0.0f, 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250)), paint2);
        }
    }

    public C19737412Ke(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = 100;
        this.LL = new Paint();
        LinearGradient linearGradient = new LinearGradient(C497740JfY.LJIIZILJ(), 0.0f, 0.0f, C497740JfY.LJIILLIIL(), C15CY.LIZ, C15CY.LIZIZ, Shader.TileMode.CLAMP);
        Paint paint = this.LL;
        if (paint != null) {
            paint.setShader(linearGradient);
        }
        Paint paint2 = this.LL;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        this.LLILLL = 0.0f;
        float[] fArr = new float[3];
        Color.colorToHSV(C15CY.LIZIZ, fArr);
        fArr[2] = fArr[2] + 0.1f;
        int iHSVToColor = Color.HSVToColor(fArr);
        this.LLILLJJLI = new Paint();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250)), iHSVToColor, 0, Shader.TileMode.CLAMP);
        Paint paint3 = this.LLILLJJLI;
        if (paint3 != null) {
            paint3.setShader(radialGradient);
        }
    }
}
