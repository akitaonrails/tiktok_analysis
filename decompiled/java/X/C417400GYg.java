package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417400GYg extends C417410GYh {
    public final Path LL;
    public final RectF LLILLJJLI;
    public final float[] LLILLL;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C417410GYh, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            for (float f : this.LLILLL) {
                if (f != 0.0f) {
                    int iSave = canvas.save();
                    canvas.clipPath(this.LL);
                    super.onDraw(canvas);
                    canvas.restoreToCount(iSave);
                    return;
                }
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C417400GYg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, int i2) {
        this.LL.reset();
        if (i > 0 && i2 > 0) {
            this.LLILLJJLI.set(0.0f, 0.0f, i, i2);
            this.LL.addRoundRect(this.LLILLJJLI, this.LLILLL, Path.Direction.CW);
            this.LL.close();
        }
    }

    public C417400GYg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new Path();
        this.LLILLJJLI = new RectF();
        this.LLILLL = new float[8];
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        float[] fArr = this.LLILLL;
        float f = i;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = i3;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = i4;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = i2;
        fArr[6] = f4;
        fArr[7] = f4;
        LIZ(getWidth(), getHeight());
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ(i, i2);
    }
}
