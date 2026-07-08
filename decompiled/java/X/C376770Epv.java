package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Epv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376770Epv extends View {
    public final Paint LL;
    public int LLILLJJLI;
    public final float[] LLILLL;
    public final Path LLILZ;

    public static float LIZ() {
        return (int) C497740JfY.LIZIZ(16.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        int i = this.LLILLJJLI;
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (height / 3) * 2, new int[]{16777215 & i, i, i}, new float[]{0.0f, 1.0f, 1.0f}, Shader.TileMode.CLAMP));
        this.LLILZ.reset();
        this.LLILZ.addRoundRect(0.0f, 0.0f, width, height, this.LLILLL, Path.Direction.CW);
        canvas.drawPath(this.LLILZ, this.LL);
    }

    public final void setTargetColor(int i) {
        this.LLILLJJLI = i;
        invalidate();
    }

    public C376770Epv(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        this.LL = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey_, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        this.LLILLJJLI = iIntValue;
        this.LLILLL = new float[]{LIZ(), LIZ(), LIZ(), LIZ(), LIZ(), LIZ(), LIZ(), LIZ()};
        this.LLILZ = new Path();
    }
}
