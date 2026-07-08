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
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GU3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GU3 extends LinearLayout {
    public Paint LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public final int[] LLILZLL;
    public final float[] LLIZ;

    public C0GU3() {
        throw null;
    }

    public C0GU3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = new int[]{-1, 0};
        this.LLIZ = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.LL = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.LL;
        if (paint2 != null) {
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.LLILLJJLI = 16;
        this.LLILLL = C418440Gaw.LIZIZ(20);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.LLILLJJLI;
        if (i == 0 || (i & 1) != 0) {
            int iSave = canvas.save();
            canvas.drawRect(0.0f, 0.0f, this.LLILZ, this.LLILLL, this.LL);
            canvas.restoreToCount(iSave);
        }
        int i2 = this.LLILLJJLI;
        if (i2 == 0 || (i2 & 2) != 0) {
            int iSave2 = canvas.save();
            float f = 2;
            canvas.rotate(180.0f, this.LLILZ / f, this.LLILZIL / f);
            canvas.drawRect(0.0f, 0.0f, this.LLILZ, this.LLILLL, this.LL);
            canvas.restoreToCount(iSave2);
        }
        float f2 = 2;
        float f3 = (this.LLILZIL - this.LLILZ) / f2;
        int i3 = this.LLILLJJLI;
        if (i3 == 0 || (i3 & 4) != 0) {
            int iSave3 = canvas.save();
            canvas.rotate(90.0f, this.LLILZ / f2, this.LLILZIL / f2);
            canvas.translate(0.0f, f3);
            canvas.drawRect(0 - f3, 0.0f, this.LLILZ + f3, this.LLILLL, this.LL);
            canvas.restoreToCount(iSave3);
        }
        int i4 = this.LLILLJJLI;
        if (i4 == 0 || (i4 & 8) != 0) {
            int iSave4 = canvas.save();
            canvas.rotate(270.0f, this.LLILZ / f2, this.LLILZIL / f2);
            canvas.translate(0.0f, f3);
            canvas.drawRect(0 - f3, 0.0f, this.LLILZ + f3, this.LLILLL, this.LL);
            canvas.restoreToCount(iSave4);
        }
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.LL;
        if (paint != null) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILLL, this.LLILZLL, this.LLIZ, Shader.TileMode.CLAMP));
        }
        this.LLILZ = getWidth();
        this.LLILZIL = getHeight();
    }
}
