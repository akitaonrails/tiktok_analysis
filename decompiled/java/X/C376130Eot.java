package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Eot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376130Eot extends FrameLayout {
    public float LL;
    public final float[] LLILLJJLI;
    public final RectF LLILLL;
    public final RectF LLILZ;
    public final Path LLILZIL;

    public final float getRadius() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayer(this.LLILZ, null, 31);
        canvas.clipPath(this.LLILZIL);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void setRadius(float f) {
        this.LL = f;
    }

    public C376130Eot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new RectF();
        this.LLILZ = new RectF();
        this.LLILZIL = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SimpleRoundCornerLayout);
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SimpleRoundCornerLayout_radius, 0);
        typedArrayObtainStyledAttributes.recycle();
        float f = this.LL;
        this.LLILLJJLI = new float[]{f, f, f, f, f, f, f, f};
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        RectF rectF = this.LLILLL;
        rectF.left = getPaddingLeft();
        rectF.top = getPaddingTop();
        float f = i;
        rectF.right = f - getPaddingRight();
        float f2 = i2;
        rectF.bottom = f2 - getPaddingBottom();
        this.LLILZ.set(0.0f, 0.0f, f, f2);
        this.LLILZIL.addRoundRect(this.LLILLL, this.LLILLJJLI, Path.Direction.CW);
    }
}
