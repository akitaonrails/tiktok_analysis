package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0EhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371520EhS extends FrameLayout {
    public final int[] LL;
    public final float[] LLILLJJLI;
    public Paint LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void setPaintAlpha(int i) {
        Paint paint = this.LLILLL;
        if (paint == null || paint.getAlpha() == i) {
            return;
        }
        paint.setAlpha(i);
        invalidate();
    }

    public final void setPosition(int i) {
        if (i == this.LLILZ) {
            return;
        }
        this.LLILZ = i;
        invalidate();
    }

    public C371520EhS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new int[]{-1, 0};
        this.LLILLJJLI = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EdgeTransparentView);
        this.LLILZ = typedArrayObtainStyledAttributes.getInt(R$styleable.EdgeTransparentView_position_edge, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.EdgeTransparentView_width_edge, C11VU.LIZIZ(20.0f, getContext()));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.LLILZ;
        if (i == 0 || (i & 1) != 0) {
            canvas.drawRect(0.0f, -3.0f, this.LLILZLL, this.LLILZIL, this.LLILLL);
        }
        int i2 = this.LLILZ;
        if (i2 == 0 || (i2 & 2) != 0) {
            int iSave = canvas.save();
            float f = 2;
            canvas.rotate(180.0f, this.LLILZLL / f, this.LLIZ / f);
            canvas.drawRect(0.0f, -3.0f, this.LLILZLL, this.LLILZIL, this.LLILLL);
            canvas.restoreToCount(iSave);
        }
        int i3 = (this.LLIZ - this.LLILZLL) / 2;
        int i4 = this.LLILZ;
        if (i4 == 0 || (i4 & 4) != 0) {
            int iSave2 = canvas.save();
            float f2 = 2;
            canvas.rotate(90.0f, this.LLILZLL / f2, this.LLIZ / f2);
            float f3 = i3;
            canvas.translate(0.0f, f3);
            canvas.drawRect(-f3, -3.0f, this.LLILZLL + f3, this.LLILZIL, this.LLILLL);
            canvas.restoreToCount(iSave2);
        }
        int i5 = this.LLILZ;
        if (i5 == 0 || (i5 & 8) != 0) {
            int iSave3 = canvas.save();
            float f4 = 2;
            canvas.rotate(270.0f, this.LLILZLL / f4, this.LLIZ / f4);
            float f5 = i3;
            canvas.translate(0.0f, f5);
            canvas.drawRect(-f5, -3.0f, this.LLILZLL + f5, this.LLILZIL, this.LLILLL);
            canvas.restoreToCount(iSave3);
        }
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILZIL, this.LL, this.LLILLJJLI, Shader.TileMode.CLAMP));
        this.LLILZLL = getWidth();
        this.LLIZ = getHeight();
    }
}
