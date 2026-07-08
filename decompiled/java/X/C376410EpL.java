package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0EpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376410EpL extends AppCompatImageView {
    public final RectF LL;
    public final RectF LLILLJJLI;
    public final Path LLILLL;
    public final Paint LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public int LLIZ;

    public final void LIZJ() {
        this.LL.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        float f = this.LLILZLL / 2.0f;
        this.LLILLJJLI.set(this.LL);
        this.LLILLJJLI.inset(f, f);
        this.LLILLL.reset();
        if (this.LLILZIL > 0.0f && this.LL.width() > 0.0f && this.LL.height() > 0.0f) {
            Path path = this.LLILLL;
            RectF rectF = this.LL;
            float f2 = this.LLILZIL;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZ(Canvas canvas) {
        float f = 0.0f;
        if (this.LL.width() > 0.0f && this.LL.height() > 0.0f && this.LLILZIL > 0.0f) {
            int iSave = canvas.save();
            canvas.clipPath(this.LLILLL);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
        } else {
            super.onDraw(canvas);
        }
        float f2 = this.LLILZLL;
        if (f2 > 0.0f && this.LLIZ != 0) {
            float f3 = this.LLILZIL - (f2 / 2.0f);
            if (f3 >= 0.0f) {
                f = f3;
            }
            canvas.drawRoundRect(this.LLILLJJLI, f, f, this.LLILZ);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBorderColor(int i) {
        if (this.LLIZ == i) {
            return;
        }
        this.LLIZ = i;
        this.LLILZ.setStrokeWidth(this.LLILZLL);
        this.LLILZ.setColor(this.LLIZ);
        invalidate();
    }

    public final void setBorderWidth(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (this.LLILZLL == f) {
            return;
        }
        this.LLILZLL = f;
        this.LLILZ.setStrokeWidth(f);
        this.LLILZ.setColor(this.LLIZ);
        LIZJ();
    }

    public final void setCornerRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (this.LLILZIL == f) {
            return;
        }
        this.LLILZIL = f;
        LIZJ();
    }

    public C376410EpL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C376410EpL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new RectF();
        this.LLILLJJLI = new RectF();
        this.LLILLL = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.LLILZ = paint;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SearchKeyframeRoundedImageView, i, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.SearchKeyframeRoundedImageView_roundedCornerRadius, 0.0f);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.SearchKeyframeRoundedImageView_roundingBorderWidth, 0.0f);
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.SearchKeyframeRoundedImageView_roundingBorderColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        paint.setStrokeWidth(this.LLILZLL);
        paint.setColor(this.LLIZ);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZJ();
    }
}
