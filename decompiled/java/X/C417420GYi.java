package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417420GYi extends ImageView {
    public final Path LL;
    public final int LLILLJJLI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLILLJJLI > 0) {
            Path path = this.LL;
            RectF rectF = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            int i = this.LLILLJJLI;
            path.addRoundRect(rectF, i, i, Path.Direction.CW);
            canvas.clipPath(this.LL);
        }
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C417420GYi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CutRoundCornerView, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CutRoundCornerView_cutradius, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLILLJJLI = dimensionPixelSize;
    }
}
