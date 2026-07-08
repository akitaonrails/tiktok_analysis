package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0Eek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369840Eek extends View {
    public final Paint LL;
    public final C01GW LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;

    private final PorterDuffXfermode getModeDstOut() {
        return (PorterDuffXfermode) this.LLILLJJLI.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LL.setXfermode(getModeDstOut());
        canvas.drawCircle(this.LLILLL, this.LLILZ, this.LLILZIL, this.LL);
        this.LL.setXfermode(null);
    }

    public C369840Eek(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(3));
        paint.setAntiAlias(true);
        this.LL = paint;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(413));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.LLILLL = f;
        this.LLILZ = f;
        this.LLILZIL = f - (this.LL.getStrokeWidth() / 2);
    }
}
