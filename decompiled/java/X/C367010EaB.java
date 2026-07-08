package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367010EaB extends View {
    public final Paint LL;
    public final int[] LLILLJJLI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LL);
    }

    public C367010EaB(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        this.LL = new Paint();
        int[] iArr = new int[3];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iArr[1] = iIntValue2;
        iArr[2] = 0;
        this.LLILLJJLI = iArr;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float width;
        float width2;
        super.onSizeChanged(i, i2, i3, i4);
        if (C426750GoL.LIZLLL(getContext())) {
            width2 = getWidth();
            width = 0.0f;
        } else {
            width = getWidth();
            width2 = 0.0f;
        }
        this.LL.setShader(new LinearGradient(width, 0.0f, width2, 0.0f, this.LLILLJJLI, new float[]{0.0f, 0.76f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
