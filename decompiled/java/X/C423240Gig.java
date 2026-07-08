package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423240Gig extends View {
    public long LL;
    public final Paint LLILLJJLI;
    public final Rect LLILLL;
    public final Rect LLILZ;
    public final Rect LLILZIL;
    public final C01GW LLILZLL;
    public int LLIZ;

    private final Bitmap getSrcBitmap() {
        return (Bitmap) this.LLILZLL.getValue();
    }

    public final float getEndPosition() {
        return this.LLILZ.right;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILZ.width() > 0 && !getSrcBitmap().isRecycled()) {
            C786410Ut5.LJJJJ(getSrcBitmap());
        }
    }

    public final long getDuraion() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILZ.width() <= 0) {
            return;
        }
        this.LLILLL.right = (getMeasuredHeight() * getSrcBitmap().getWidth()) / getSrcBitmap().getHeight();
        this.LLILLL.bottom = getMeasuredHeight();
        this.LLILZ.bottom = getMeasuredHeight();
        canvas.save();
        canvas.translate(this.LLIZ, 0.0f);
        canvas.clipRect(this.LLILZ);
        canvas.drawBitmap(getSrcBitmap(), this.LLILZIL, this.LLILLL, this.LLILLJJLI);
        canvas.restore();
    }

    public final void setDuraion(long j) {
        this.LL = j;
    }

    public C423240Gig(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new Paint();
        this.LLILLL = new Rect();
        this.LLILZ = new Rect(0, 0, 0, 0);
        this.LLILZIL = new Rect(0, 0, 0, 0);
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1624));
    }
}
