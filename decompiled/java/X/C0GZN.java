package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GZN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZN extends SmartImageView {
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public Paint LLJIJIL;
    public final Path LLJILJIL;
    public final Path LLJILJILJ;
    public final Path LLJILLL;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIIIIZZ(Canvas canvas) {
        if (getWidth() > 0 && getHeight() > 0) {
            if (this.LLJI) {
                this.LLJILJILJ.reset();
                if (this.LLIZLLLIL > 0) {
                    Path path = this.LLJILJILJ;
                    float width = getWidth() / 2.0f;
                    float height = getHeight() / 2.0f;
                    int i = this.LLIZLLLIL;
                    int height2 = getHeight();
                    if (i > height2) {
                        i = height2;
                    }
                    path.addCircle(width, height, i / 2.0f, Path.Direction.CW);
                }
                this.LLJILJIL.reset();
                if (this.LLJ > 0) {
                    Path path2 = this.LLJILJIL;
                    float width2 = getWidth();
                    int i2 = this.LLJ;
                    int height3 = getHeight();
                    if (i2 > height3) {
                        i2 = height3;
                    }
                    path2.addRect(0.0f, 0.0f, width2, i2, Path.Direction.CW);
                }
                this.LLJILLL.reset();
                this.LLJILLL.op(this.LLJILJILJ, this.LLJILJIL, Path.Op.UNION);
                this.LLJI = false;
            }
            Paint paint = this.LLJIJIL;
            if (paint != null) {
                canvas.drawPath(this.LLJILJILJ, paint);
            }
            canvas.clipPath(this.LLJILLL);
            super.onDraw(canvas);
        }
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIIIZZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBackgroundColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            Paint paint = new Paint();
            paint.setColor(iIntValue);
            paint.setStyle(Paint.Style.FILL);
            this.LLJIJIL = paint;
        }
        invalidate();
    }

    public final void setBackgroundSize(int i) {
        this.LLIZLLLIL = i;
        this.LLJI = true;
        invalidate();
    }

    public final void setTopHeight(int i) {
        this.LLJ = i;
        this.LLJI = true;
        invalidate();
    }

    public C0GZN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = true;
        this.LLJILJIL = new Path();
        this.LLJILJILJ = new Path();
        this.LLJILLL = new Path();
    }
}
