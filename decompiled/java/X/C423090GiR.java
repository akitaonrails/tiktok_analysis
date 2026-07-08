package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423090GiR extends View {
    public Drawable LL;
    public Drawable LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;

    public final int getRatingDivide() {
        return this.LLILZIL;
    }

    public final Drawable getRatingImage() {
        return this.LLILLJJLI;
    }

    public final float getRatingProgress() {
        return this.LLILLL;
    }

    public final int getRatingStarNumber() {
        return this.LLILZ;
    }

    public final Drawable getRatingUnImage() {
        return this.LL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int intrinsicHeight = ((int) this.LLILLL) * this.LL.getIntrinsicHeight();
        float intrinsicWidth = intrinsicHeight + (((int) r2) * this.LLILZIL) + ((this.LLILLL - ((int) r2)) * this.LL.getIntrinsicWidth());
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, intrinsicWidth, this.LLILLJJLI.getIntrinsicHeight());
        int i = this.LLILZ;
        for (int i2 = 0; i2 < i; i2++) {
            int intrinsicWidth2 = (this.LLILLJJLI.getIntrinsicWidth() * i2) + (this.LLILZIL * i2);
            Drawable drawable = this.LLILLJJLI;
            drawable.setBounds(intrinsicWidth2, 0, drawable.getIntrinsicWidth() + intrinsicWidth2, this.LLILLJJLI.getIntrinsicHeight());
            this.LLILLJJLI.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.clipRect(intrinsicWidth, 0.0f, getWidth(), this.LL.getIntrinsicHeight());
        int i3 = this.LLILZ;
        for (int i4 = 0; i4 < i3; i4++) {
            int intrinsicWidth3 = (this.LL.getIntrinsicWidth() * i4) + (this.LLILZIL * i4);
            Drawable drawable2 = this.LL;
            drawable2.setBounds(intrinsicWidth3, 0, drawable2.getIntrinsicWidth() + intrinsicWidth3, this.LL.getIntrinsicHeight());
            this.LL.draw(canvas);
        }
        canvas.restore();
    }

    public final void setRatingDivide(int i) {
        this.LLILZIL = i;
        invalidate();
    }

    public final void setRatingImage(Drawable drawable) {
        this.LLILLJJLI = drawable;
        invalidate();
    }

    public final void setRatingProgress(float f) {
        this.LLILLL = f;
        invalidate();
    }

    public final void setRatingStarNumber(int i) {
        this.LLILZ = i;
        invalidate();
    }

    public final void setRatingUnImage(Drawable drawable) {
        this.LL = drawable;
        invalidate();
    }

    public C423090GiR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = context.getResources().getDrawable(R.drawable.cg6, null);
        this.LLILLJJLI = context.getResources().getDrawable(R.drawable.d9r, null);
        this.LLILZ = 5;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AdRatingView);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AdRatingView_ratingImage);
            if (drawable != null) {
                setRatingImage(drawable);
            }
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AdRatingView_ratingUnImage);
            if (drawable2 != null) {
                setRatingUnImage(drawable2);
            }
            setRatingProgress(typedArrayObtainStyledAttributes.getFloat(R$styleable.AdRatingView_ratingProgress, this.LLILLL));
            setRatingStarNumber(typedArrayObtainStyledAttributes.getInt(R$styleable.AdRatingView_ratingStarNumber, this.LLILZ));
            setRatingDivide(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AdRatingView_ratingDivided, this.LLILZIL));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int intrinsicHeight = 0;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0 && mode != 1073741824) {
                size = 0;
            } else {
                size = View.MeasureSpec.getSize(i);
            }
        } else {
            int intrinsicWidth = this.LL.getIntrinsicWidth();
            int i3 = this.LLILZ;
            size = (intrinsicWidth * i3) + ((i3 - 1) * this.LLILZIL);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0 || mode2 == 1073741824) {
                intrinsicHeight = View.MeasureSpec.getSize(i2);
            }
        } else {
            intrinsicHeight = this.LL.getIntrinsicHeight();
        }
        setMeasuredDimension(size, intrinsicHeight);
    }
}
