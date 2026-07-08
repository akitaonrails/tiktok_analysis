package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GSN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSN extends FrameLayout {
    public boolean LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public LinearGradient LLILZ;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final LinearGradient getLinearGradient() {
        return this.LLILZ;
    }

    public final boolean getNeedLinearBackground() {
        return this.LL;
    }

    public final Paint getPaint() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.LLILLL);
    }

    public final void setLinearGradient(LinearGradient linearGradient) {
        this.LLILZ = linearGradient;
    }

    public final void setNeedLinearBackground(boolean z) {
        this.LL = z;
    }

    public C0GSN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = true;
        this.LLILLJJLI = -1560281088;
        this.LLILLL = new Paint();
        setWillNotDraw(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LL) {
            this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredHeight(), new int[]{-871659881, -865100902, -863274902}, (float[]) null, Shader.TileMode.CLAMP));
        } else {
            this.LLILLL.setShader(null);
            this.LLILLL.setColor(this.LLILLJJLI);
        }
    }
}
