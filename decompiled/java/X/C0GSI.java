package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GSI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSI extends View implements InterfaceC496390JdN {
    public final Paint LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZ = false;
    }

    @Override // X.InterfaceC496390JdN
    public final void LIZJ(boolean z) {
        if (this.LLILZ != z) {
            this.LLILZ = z;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILZ) {
            canvas.save();
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LL);
        }
    }

    public C0GSI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint(1);
        this.LLILLJJLI = C497740JfY.LJFF(R.color.a_1);
    }

    @Override // X.InterfaceC496390JdN
    public final void LIZ(C21578619ce c21578619ce, int i) {
        boolean zCanScrollVertically = c21578619ce.canScrollVertically(1);
        if (this.LLILZ != zCanScrollVertically) {
            this.LLILZ = zCanScrollVertically;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL = getHeight();
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILLL, 0, this.LLILLJJLI, Shader.TileMode.CLAMP));
    }
}
