package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0Eae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367300Eae extends View {
    public int[] LL;
    public float[] LLILLJJLI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LL.length != 0 && this.LLILLJJLI.length != 0) {
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredHeight(), this.LL, this.LLILLJJLI, Shader.TileMode.CLAMP));
            canvas.drawRect(new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight()), paint);
        }
    }

    public C367300Eae(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new int[0];
        this.LLILLJJLI = new float[0];
    }
}
