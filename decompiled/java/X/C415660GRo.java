package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415660GRo extends View {
    public EnumC428980Grw LL;
    public final Paint LLILLJJLI;
    public final int LLILLL;

    public final void LIZ() {
        int[] iArr;
        float[] fArr;
        int width = getWidth();
        if (width <= 0) {
            return;
        }
        int i = C416090GTf.LIZ[this.LL.ordinal()];
        if (i == 1) {
            int i2 = this.LLILLL;
            iArr = new int[]{i2, i2, 0};
            fArr = new float[]{0.0f, 0.7692308f, 1.0f};
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            int i3 = this.LLILLL;
            iArr = new int[]{0, i3, i3};
            fArr = new float[]{0.0f, 0.23076922f, 1.0f};
        }
        this.LLILLJJLI.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
        invalidate();
    }

    public final EnumC428980Grw getDirection() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLJJLI);
    }

    public final void setDirection(EnumC428980Grw enumC428980Grw) {
        this.LL = enumC428980Grw;
        LIZ();
    }

    public C415660GRo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = EnumC428980Grw.START;
        this.LLILLJJLI = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        this.LLILLL = numLIZJ != null ? numLIZJ.intValue() : 0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
