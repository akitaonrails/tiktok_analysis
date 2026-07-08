package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421350Gfd extends C1324720kZq {
    public final Paint LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C1324720kZq, android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLJILJILJ) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLJILJIL);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override // X.C1324720kZq, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setGray(boolean z) {
        this.LLJILJILJ = z;
    }

    public C421350Gfd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C421350Gfd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.LLJILJIL = paint;
    }
}
