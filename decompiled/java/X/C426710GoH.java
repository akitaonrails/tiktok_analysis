package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426710GoH extends AppCompatImageView {
    public Drawable LL;

    public final void LIZ() {
        Drawable drawable = this.LL;
        if (!(drawable == null && (drawable = getDrawable()) == null) && drawable.getIntrinsicWidth() > 0 && getWidth() > 0) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            float width = getWidth();
            float height = getHeight();
            float f = width / intrinsicWidth;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            matrix.postTranslate(0.0f, height - (intrinsicHeight * f));
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
            if (drawable != getDrawable()) {
                setImageDrawable(drawable);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final Drawable getFixedDrawable() {
        return this.LL;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setFixedDrawable(Drawable drawable) {
        this.LL = drawable;
        LIZ();
    }

    public C426710GoH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (C0OSP.LIZIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_image_bg_resize_setting", true, true)) {
            LIZ();
        }
    }
}
