package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Efq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C370520Efq extends FrameLayout {
    public Paint LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final int[] LLIZLLLIL;
    public final float[] LLJ;

    public C370520Efq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = 1;
        this.LLILLL = 2;
        this.LLILZ = 4;
        this.LLILZIL = 8;
        this.LLIZLLLIL = new int[]{-1, 0};
        this.LLJ = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.LL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas2, view, j);
        if (0 != 0) {
            canvas2 = canvas2;
            canvas2.drawRect(0.0f, 0.0f, this.LLILZLL, 0.0f, this.LL);
        }
        if (0 != 0) {
            int iSave = canvas2.save();
            canvas2.rotate(180.0f, this.LLILZLL / 2.0f, this.LLIZ / 2.0f);
            canvas2.drawRect(0.0f, 0.0f, this.LLILZLL, 0.0f, this.LL);
            canvas2.restoreToCount(iSave);
        }
        float f = (this.LLIZ - this.LLILZLL) / 2.0f;
        if (0 != 0) {
            int iSave2 = canvas2.save();
            canvas2.rotate(270.0f, this.LLILZLL / 2.0f, this.LLIZ / 2.0f);
            canvas2.translate(0.0f, f);
            canvas2.drawRect(0.0f - f, 0.0f, this.LLILZLL + f, 0.0f, this.LL);
            canvas2.restoreToCount(iSave2);
        }
        if (0 != 0) {
            int iSave3 = canvas2.save();
            canvas2.rotate(90.0f, this.LLILZLL / 2.0f, this.LLIZ / 2.0f);
            canvas2.translate(0.0f, f);
            canvas2.drawRect(0.0f - f, 0.0f, this.LLILZLL + f, 0.0f, this.LL);
            canvas2.restoreToCount(iSave3);
        }
        canvas2.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, this.LLIZLLLIL, this.LLJ, Shader.TileMode.CLAMP));
        this.LLILZLL = getWidth();
        this.LLIZ = getHeight();
    }
}
