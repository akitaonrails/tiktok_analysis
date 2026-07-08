package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0Ehe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371640Ehe extends View {
    public final Paint LL;
    public int LLILLJJLI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fMin = Math.min(width, height);
        int i = this.LLILLJJLI;
        this.LL.setShader(new RadialGradient(width, height, fMin, new int[]{(-16777216) | i, i & 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawCircle(width, height, fMin, this.LL);
    }

    public final void setColor(int i) {
        this.LLILLJJLI = i;
        invalidate();
    }

    public C371640Ehe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint(1);
        this.LLILLJJLI = -1;
    }
}
