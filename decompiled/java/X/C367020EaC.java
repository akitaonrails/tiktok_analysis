package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0EaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367020EaC extends View {
    public final Paint LL;

    public final void LIZ() {
        float width = getWidth() / 2.0f;
        this.LL.setShader(new LinearGradient(width, 0.0f, width, getHeight(), new int[]{0, Integer.MIN_VALUE, -436207616, -16777216, -16777216}, new float[]{0.0f, 0.1f, 0.25f, 0.8f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LL);
    }

    public C367020EaC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint(1);
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            LIZ();
        }
    }
}
