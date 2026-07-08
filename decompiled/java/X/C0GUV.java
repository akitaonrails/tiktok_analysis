package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GUV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUV extends View {
    public Drawable LL;
    public final Path LLILLJJLI;
    public final Path LLILLL;
    public final Path LLILZ;
    public final Matrix LLILZIL;
    public final RectF LLILZLL;
    public boolean LLIZ;

    public final void LIZ() {
        this.LLILZ.reset();
        this.LLILZ.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, Path.Direction.CW);
        this.LLILLL.set(this.LLILZ);
        this.LLILLJJLI.set(this.LLILLL);
        this.LLIZ = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZ && getWidth() > 0 && getHeight() > 0) {
            this.LLILLJJLI.reset();
            this.LLILLL.reset();
            this.LLILZ.reset();
            try {
                Path pathLIZLLL = C21518819Ji.LIZLLL("M17.4866 76.1565C28.3727 49.5158 49.5158 28.3727 76.1565 17.4866C131.818 -5.25831 194.182 -5.25832 249.843 17.4865C276.484 28.3727 297.627 49.5158 308.513 76.1566C331.258 131.818 331.258 194.182 308.513 249.843C297.627 276.484 276.484 297.627 249.843 308.513C194.182 331.258 131.818 331.258 76.1566 308.513C49.5158 297.627 28.3727 276.484 17.4865 249.843C-5.25832 194.182 -5.25831 131.818 17.4866 76.1565Z");
                pathLIZLLL.computeBounds(this.LLILZLL, true);
                float fWidth = this.LLILZLL.width();
                RectF rectF = this.LLILZLL;
                float f = 2;
                float f2 = fWidth + (rectF.left * f);
                float fHeight = rectF.height() + (this.LLILZLL.top * f);
                if (f2 > 0.0f && fHeight > 0.0f) {
                    float fMax = Math.max(getWidth() / f2, getHeight() / fHeight);
                    this.LLILZIL.reset();
                    this.LLILZIL.postScale(fMax, fMax);
                    pathLIZLLL.transform(this.LLILZIL, this.LLILZ);
                    this.LLILLL.set(this.LLILZ);
                    this.LLILLJJLI.set(this.LLILLL);
                    this.LLIZ = false;
                } else {
                    LIZ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ();
            }
        }
        int iSave = canvas.save();
        try {
            canvas.clipPath(this.LLILLJJLI);
            Drawable drawable = this.LL;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                drawable.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    public final void setCoverDrawable(Drawable drawable) {
        this.LL = drawable;
        invalidate();
    }

    public C0GUV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new Path();
        this.LLILLL = new Path();
        this.LLILZ = new Path();
        this.LLILZIL = new Matrix();
        this.LLILZLL = new RectF();
        this.LLIZ = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZ = true;
    }
}
