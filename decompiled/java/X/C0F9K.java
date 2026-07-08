package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0F9K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F9K extends SmartImageView {
    public final Path LLIZLLLIL;
    public final Path LLJ;
    public final Paint LLJI;

    public C0F9K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            canvas.save();
            canvas.clipPath(this.LLJ);
            canvas.drawColor(-1);
            super.onDraw(canvas);
            canvas.restore();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C0F9K(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = new Path();
        this.LLJ = new Path();
        Paint paint = new Paint(1);
        paint.setPathEffect(new CornerPathEffect(C418440Gaw.LIZIZ(4)));
        this.LLJI = paint;
    }

    public /* synthetic */ C0F9K(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = i2;
        this.LLIZLLLIL.reset();
        float fMin = Math.min(f, f2) / 2.0f;
        float fSqrt = (float) ((Math.sqrt(3.0d) * ((double) fMin)) / ((double) 2));
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        this.LLIZLLLIL.moveTo(f3, f4 + fMin);
        float f5 = f3 - fSqrt;
        float f6 = fMin / 2;
        float f7 = f4 + f6;
        this.LLIZLLLIL.lineTo(f5, f7);
        float f8 = f4 - f6;
        this.LLIZLLLIL.lineTo(f5, f8);
        this.LLIZLLLIL.lineTo(f3, f4 - fMin);
        float f9 = f3 + fSqrt;
        this.LLIZLLLIL.lineTo(f9, f8);
        this.LLIZLLLIL.lineTo(f9, f7);
        this.LLIZLLLIL.close();
        this.LLJ.reset();
        this.LLJI.getFillPath(this.LLIZLLLIL, this.LLJ);
    }
}
