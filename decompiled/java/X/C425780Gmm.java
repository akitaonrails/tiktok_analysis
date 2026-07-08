package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425780Gmm extends C427660Gpo {
    public float LLJL;
    public final Path LLJLIL;
    public final Path LLJLILLLLZIIL;
    public final Region LLJLL;
    public final Region LLJLLIL;
    public final Region LLJLLL;
    public Path LLJZ;
    public float LLJZIJLIL;
    public boolean LLL;
    public final Paint LLLF;

    public final Path LJIILJJIL() {
        this.LLJLIL.reset();
        this.LLJLILLLLZIIL.reset();
        this.LLJLL.setEmpty();
        this.LLJLLIL.setEmpty();
        this.LLJLLL.setEmpty();
        float sizePx = getSizePx() * 0.5f;
        this.LLJLIL.addCircle(C426750GoL.LIZLLL(getContext()) ? sizePx - this.LLJL : this.LLJL + sizePx, sizePx, this.LLJZIJLIL + sizePx, Path.Direction.CW);
        this.LLJLILLLLZIIL.addCircle(sizePx, sizePx, sizePx, Path.Direction.CW);
        this.LLJLLL.set(0, 0, getSizePx(), getSizePx());
        this.LLJLL.setPath(this.LLJLIL, this.LLJLLL);
        this.LLJLLIL.setPath(this.LLJLILLLLZIIL, this.LLJLLL);
        this.LLJLLIL.op(this.LLJLL, Region.Op.DIFFERENCE);
        return this.LLJLLIL.getBoundaryPath();
    }

    private final float getDefaultGapSize() {
        return C418440Gaw.LIZIZ(Integer.valueOf(getSizeVariant() >= 48 ? 3 : 2));
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C427660Gpo, X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            try {
                canvas.clipPath(this.LLJZ);
                super.onDraw(canvas);
                if (this.LLL) {
                    canvas.drawPath(this.LLJZ, this.LLLF);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setCutoutOffset(float f) {
        if (this.LLJL != f) {
            this.LLJL = f;
            if (getWidth() > 0 && getHeight() > 0) {
                this.LLJZ = LJIILJJIL();
                invalidate();
            }
        }
    }

    public final void setGapSize(float f) {
        if (this.LLJZIJLIL != f) {
            this.LLJZIJLIL = f;
            if (getWidth() > 0 && getHeight() > 0) {
                this.LLJZ = LJIILJJIL();
                invalidate();
            }
        }
    }

    public C425780Gmm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJLIL = new Path();
        this.LLJLILLLLZIIL = new Path();
        this.LLJLL = new Region();
        this.LLJLLIL = new Region();
        this.LLJLLL = new Region();
        this.LLJZ = new Path();
        this.LLL = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getAvatarBorderColor());
        paint.setStrokeWidth(getAvatarStrokeWidth());
        paint.setAntiAlias(true);
        this.LLLF = paint;
    }

    @Override // X.C427870Gq9, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJL == 0.0f) {
            this.LLJL = getSizePx() * 0.7f;
        }
        if (this.LLJZIJLIL == 0.0f) {
            this.LLJZIJLIL = getDefaultGapSize();
        }
        this.LLJZ = LJIILJJIL();
        this.LLLF.setStrokeWidth(getAvatarStrokeWidth());
    }
}
