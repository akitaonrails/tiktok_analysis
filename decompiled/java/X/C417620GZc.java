package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417620GZc extends AppCompatImageView {
    public float LL;
    public final Path LLILLJJLI;
    public final RectF LLILLL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
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

    public final void setCornerRadius(float f) {
        this.LL = f;
        this.LLILLJJLI.reset();
        Path path = this.LLILLJJLI;
        RectF rectF = this.LLILLL;
        float f2 = this.LL;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        invalidate();
    }

    public C417620GZc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C418440Gaw.LIZIZ(4);
        this.LLILLJJLI = new Path();
        this.LLILLL = new RectF();
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundedShadowImageView);
        this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundedShadowImageView_cornerRadius, this.LL);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new C0IDB(this, 9));
        setClipToOutline(true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL.set(0.0f, 0.0f, i, i2);
        this.LLILLJJLI.reset();
        Path path = this.LLILLJJLI;
        RectF rectF = this.LLILLL;
        float f = this.LL;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }
}
