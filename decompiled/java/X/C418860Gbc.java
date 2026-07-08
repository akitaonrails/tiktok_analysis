package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418860Gbc extends ImageView {
    public float LL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final float getShowScale() {
        return this.LL;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            canvas.clipRect(new Rect(0, 0, getWidth(), (int) (getHeight() * this.LL)));
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setIconDrawable(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public final void setScale(float f) {
        setShowScale(f);
        invalidate();
    }

    public final void setShowScale(float f) {
        this.LL = f;
        invalidate();
    }

    public C418860Gbc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 1.0f;
    }
}
