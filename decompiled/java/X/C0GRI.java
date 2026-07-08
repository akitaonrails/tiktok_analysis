package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRI extends View {
    public final int LL;
    public final int LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        if (!C497740JfY.LJJ()) {
            this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, measuredWidth * 0.4f, getMeasuredHeight(), new int[]{this.LL, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
            f = 0.0f;
            this.LLILZ.setShader(new LinearGradient(getMeasuredWidth(), getMeasuredHeight(), measuredWidth * 1.6f, 0.0f, new int[]{this.LLILLJJLI, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
        } else {
            this.LLILLL.setShader(new LinearGradient(getMeasuredWidth(), 0.0f, measuredWidth * 1.6f, getMeasuredHeight(), new int[]{this.LL, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
            f = 0.0f;
            this.LLILZ.setShader(new LinearGradient(0.0f, getMeasuredHeight(), measuredWidth * 0.4f, 0.0f, new int[]{this.LLILLJJLI, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
        }
        canvas.drawRect(f, f, getMeasuredWidth(), getMeasuredHeight(), this.LLILLL);
        canvas.drawRect(f, f, getMeasuredWidth(), getMeasuredHeight(), this.LLILZ);
    }

    public C0GRI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C497740JfY.LJFF(R.color.a42);
        this.LLILLJJLI = C497740JfY.LJFF(R.color.a41);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        this.LLILZ = new Paint();
    }
}
