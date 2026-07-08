package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416260GTw extends View {
    public final RectF LL;
    public EnumC429080Gs6 LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;

    public final RectF getCutoutRect() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLL);
        canvas.drawRoundRect(this.LL, getResources().getDisplayMetrics().density * 16.0f, getResources().getDisplayMetrics().density * 16.0f, this.LLILZ);
        canvas.restoreToCount(iSaveLayer);
    }

    public final void setCutoutMode(EnumC429080Gs6 enumC429080Gs6) {
        this.LLILLJJLI = enumC429080Gs6;
        LIZ(getWidth(), getHeight());
        invalidate();
    }

    public C416260GTw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new RectF();
        this.LLILLJJLI = EnumC429080Gs6.RECTANGLE_374X234;
        Paint paint = new Paint();
        paint.setColor(-1291845632);
        this.LLILLL = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAntiAlias(true);
        this.LLILZ = paint2;
        setLayerType(2, null);
    }

    public final void LIZ(int i, int i2) {
        float f;
        float f2 = getResources().getDisplayMetrics().density * 8.0f;
        float f3 = i - (2 * f2);
        int i3 = C416270GTx.LIZ[this.LLILLJJLI.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                f = f3;
            } else {
                throw new C1954807lC();
            }
        } else {
            f = 0.62566847f * f3;
        }
        float f4 = (i2 - f) / 2.0f;
        this.LL.set(f2, f4, f3 + f2, f + f4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        LIZ(i, i2);
    }
}
