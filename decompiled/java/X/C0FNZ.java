package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0FNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FNZ extends SmartImageView {
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final Path LLJILLL;
    public final Paint LLJJ;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final Paint getPaint() {
        return this.LLJJ;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        Path path;
        Path path2 = this.LLJILLL;
        path2.reset();
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            path2.moveTo(getWidth() - this.LLJIJIL, 0.0f);
            z2 = false;
            path2.arcTo(getWidth() - (this.LLJIJIL * 2.0f), 0.0f, getWidth(), this.LLJIJIL * 2.0f, 270.0f, 90.0f, false);
        } else {
            path2.moveTo((getWidth() - this.LLJILJIL) - this.LLJILJILJ, 0.0f);
            float width = getWidth();
            float f = this.LLJILJIL;
            path2.lineTo((width - f) - this.LLJILJILJ, f);
            z2 = false;
            path2.arcTo((getWidth() - this.LLJILJIL) - this.LLJILJILJ, 0.0f, getWidth(), this.LLJILJILJ + this.LLJILJIL, 180.0f, -90.0f, false);
            path2.lineTo(getWidth(), this.LLJILJIL + this.LLJILJILJ);
        }
        path2.lineTo(getWidth(), getHeight() - this.LLJI);
        float f2 = 2;
        path2.arcTo(getWidth() - (this.LLJI * 2.0f), getHeight() - (this.LLJI * f2), getWidth(), getHeight(), 0.0f, 90.0f, z2);
        path2.lineTo(this.LLIZLLLIL, getHeight());
        float height = getHeight();
        float f3 = f2 * this.LLIZLLLIL;
        path2.arcTo(0.0f, height - f3, f3, getHeight(), 90.0f, 90.0f, z2);
        if (getLayoutDirection() == 1) {
            path2.lineTo(0.0f, this.LLJILJIL + this.LLJILJILJ);
            float f4 = this.LLJILJIL;
            path2.lineTo(f4, this.LLJILJILJ + f4);
            float f5 = this.LLJILJIL + this.LLJILJILJ;
            path = path2;
            path.arcTo(0.0f, 0.0f, f5, f5, 90.0f, -90.0f, z2);
            path.lineTo(this.LLJILJIL + this.LLJILJILJ, 0.0f);
        } else {
            path2.lineTo(0.0f, this.LLJ);
            float f6 = this.LLJ * 2.0f;
            path = path2;
            path.arcTo(0.0f, 0.0f, f6, f6, 180.0f, 90.0f, z2);
        }
        path.close();
        canvas.clipPath(this.LLJILLL);
        super.draw(canvas);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C0FNZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0FNZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f = 4;
        this.LLIZLLLIL = C339190DRl.LIZ(f);
        this.LLJ = C339190DRl.LIZ(f);
        this.LLJI = C339190DRl.LIZ(f);
        this.LLJIJIL = C339190DRl.LIZ(f);
        this.LLJILJIL = C339190DRl.LIZ(8);
        this.LLJILJILJ = C339190DRl.LIZ(10);
        this.LLJILLL = new Path();
        Paint paint = new Paint();
        paint.setColor(-65536);
        this.LLJJ = paint;
    }
}
