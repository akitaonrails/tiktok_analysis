package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425750Gmj extends C427660Gpo {
    public final Region LLJL;
    public final Region LLJLIL;
    public final Region LLJLILLLLZIIL;
    public final Path LLJLL;
    public final Path LLJLLIL;
    public Path LLJLLL;
    public final int LLJZ;
    public boolean LLJZIJLIL;
    public final Paint LLL;
    public float LLLF;

    public final Path LJIILJJIL() {
        this.LLJLL.reset();
        this.LLJLLIL.reset();
        this.LLJL.setEmpty();
        this.LLJLIL.setEmpty();
        this.LLJLILLLLZIIL.setEmpty();
        if (this.LLJZIJLIL) {
            float width = getWidth() * 0.5f;
            this.LLJLL.addCircle(width, width, width, Path.Direction.CW);
            if (C426750GoL.LIZLLL(getContext())) {
                Path path = this.LLJLLIL;
                float f = this.LLLF + this.LLJZ;
                float height = getHeight();
                float f2 = this.LLLF;
                path.addCircle(f, height - f2, f2 + this.LLJZ, Path.Direction.CW);
            } else {
                Path path2 = this.LLJLLIL;
                float width2 = getWidth() - this.LLLF;
                float height2 = getHeight();
                float f3 = this.LLLF;
                path2.addCircle(width2, height2 - f3, f3 + this.LLJZ, Path.Direction.CW);
            }
            this.LLJLILLLLZIIL.set(0, 0, getWidth(), getHeight());
            this.LLJLIL.setPath(this.LLJLLIL, this.LLJLILLLLZIIL);
            this.LLJL.setPath(this.LLJLL, this.LLJLILLLLZIIL);
            this.LLJL.op(this.LLJLIL, Region.Op.DIFFERENCE);
        } else {
            float width3 = getWidth() * 0.5f;
            this.LLJLL.addCircle(width3, width3, width3, Path.Direction.CW);
            this.LLJLILLLLZIIL.set(0, 0, getWidth(), getHeight());
            this.LLJL.setPath(this.LLJLL, this.LLJLILLLLZIIL);
        }
        return this.LLJL.getBoundaryPath();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final float getIconRadius() {
        return this.LLLF;
    }

    @Override // X.C427660Gpo, X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            try {
                canvas.clipPath(this.LLJLLL);
                super.onDraw(canvas);
                canvas.drawPath(this.LLJLLL, this.LLL);
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

    public final void setHollow(boolean z) {
        this.LLJZIJLIL = z;
        invalidate();
    }

    public final void setIconRadius(float f) {
        this.LLLF = f;
        LJIILJJIL();
        invalidate();
    }

    public C425750Gmj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C425750Gmj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJL = new Region();
        this.LLJLIL = new Region();
        this.LLJLILLLLZIIL = new Region();
        this.LLJLL = new Path();
        this.LLJLLIL = new Path();
        this.LLJLLL = new Path();
        this.LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJZIJLIL = true;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setAntiAlias(true);
        this.LLL = paint;
        this.LLLF = C418440Gaw.LIZIZ(9);
    }

    @Override // X.C427870Gq9, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJLLL = LJIILJJIL();
    }
}
