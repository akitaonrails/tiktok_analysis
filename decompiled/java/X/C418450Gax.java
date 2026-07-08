package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418450Gax extends SmartImageView {
    public final Paint LLIZLLLIL;
    public final float LLJ;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            float strokeWidth = this.LLIZLLLIL.getStrokeWidth() / 2;
            float f = 1;
            float f2 = strokeWidth - f;
            float f3 = this.LLJ;
            canvas.drawRoundRect(f2, f2, (getWidth() - strokeWidth) + f, getHeight() + f, f3, f3, this.LLIZLLLIL);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C418450Gax(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C418450Gax(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.a00, typedValue, true);
        paint.setColor(typedValue.data);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.LLIZLLLIL = paint;
        this.LLJ = C339190DRl.LIZ(6);
        setClipToOutline(true);
        setOutlineProvider(new C0IDB(this, 1));
    }
}
