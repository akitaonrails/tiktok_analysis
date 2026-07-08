package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C417610GZb extends AppCompatImageView {
    public static final ImageView.ScaleType LLJJJ = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config LLJJJIL = Bitmap.Config.ARGB_8888;
    public final RectF LL;
    public final RectF LLILLJJLI;
    public final Matrix LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public Bitmap LLJIJIL;
    public Canvas LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public ColorFilter LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public final void LIZLLL() {
        int i;
        RectF rectF = this.LLILLJJLI;
        int iMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((r3 - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((r2 - iMin) / 2.0f);
        float f = iMin;
        rectF.set(new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop));
        this.LLJILLL = Math.min((this.LLILLJJLI.height() - this.LLIZLLLIL) / 2.0f, (this.LLILLJJLI.width() - this.LLIZLLLIL) / 2.0f);
        this.LL.set(this.LLILLJJLI);
        if (!this.LLJJIJIIJIL && (i = this.LLIZLLLIL) > 0) {
            this.LL.inset(i - 1.0f, i - 1.0f);
        }
        this.LLJILJILJ = Math.min(this.LL.height() / 2.0f, this.LL.width() / 2.0f);
        LJ();
    }

    public final void LJ() {
        float fWidth;
        float fHeight;
        if (this.LLJIJIL == null) {
            return;
        }
        this.LLILLL.set(null);
        int height = this.LLJIJIL.getHeight();
        float width = this.LLJIJIL.getWidth();
        float f = height;
        float fWidth2 = 0.0f;
        if (this.LL.height() * width > this.LL.width() * f) {
            fWidth = this.LL.height() / f;
            fWidth2 = (this.LL.width() - (width * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = this.LL.width() / width;
            fHeight = (this.LL.height() - (f * fWidth)) * 0.5f;
        }
        this.LLILLL.setScale(fWidth, fWidth);
        Matrix matrix = this.LLILLL;
        float f2 = (int) (fWidth2 + 0.5f);
        RectF rectF = this.LL;
        matrix.postTranslate(f2 + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.LLJJIII = true;
    }

    public final void LIZJ() {
        Bitmap bitmapCreateBitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            bitmapCreateBitmap = null;
        } else if (drawable instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            try {
                bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, LLJJJIL) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), LLJJJIL);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                bitmapCreateBitmap = null;
            }
        }
        this.LLJIJIL = bitmapCreateBitmap;
        if (bitmapCreateBitmap == null || !bitmapCreateBitmap.isMutable()) {
            this.LLJILJIL = null;
        } else {
            this.LLJILJIL = new Canvas(this.LLJIJIL);
        }
        if (this.LLJJI) {
            if (this.LLJIJIL != null) {
                LJ();
            } else {
                this.LLILZ.setShader(null);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public int getBorderColor() {
        return this.LLIZ;
    }

    public int getBorderWidth() {
        return this.LLIZLLLIL;
    }

    public int getCircleBackgroundColor() {
        return this.LLJ;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.LLJJ;
    }

    @Override // android.widget.ImageView
    public int getImageAlpha() {
        return this.LLJI;
    }

    public final void LIZ(Canvas canvas) {
        if (this.LLJJIJIL) {
            super.onDraw(canvas);
            return;
        }
        if (this.LLJ != 0) {
            canvas.drawCircle(this.LL.centerX(), this.LL.centerY(), this.LLJILJILJ, this.LLILZLL);
        }
        if (this.LLJIJIL != null) {
            if (this.LLJJIJI && this.LLJILJIL != null) {
                this.LLJJIJI = false;
                Drawable drawable = getDrawable();
                drawable.setBounds(0, 0, this.LLJILJIL.getWidth(), this.LLJILJIL.getHeight());
                drawable.draw(this.LLJILJIL);
            }
            if (this.LLJJIII) {
                this.LLJJIII = false;
                Bitmap bitmap = this.LLJIJIL;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.LLILLL);
                this.LLILZ.setShader(bitmapShader);
            }
            canvas.drawCircle(this.LL.centerX(), this.LL.centerY(), this.LLJILJILJ, this.LLILZ);
        }
        if (this.LLIZLLLIL > 0) {
            canvas.drawCircle(this.LLILLJJLI.centerX(), this.LLILLJJLI.centerY(), this.LLJILLL, this.LLILZIL);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.LLJJIJI = true;
        invalidate();
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

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJIJIL) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if ((!this.LLILLJJLI.isEmpty() && Math.pow(x - this.LLILLJJLI.centerX(), 2.0d) + Math.pow(y - this.LLILLJJLI.centerY(), 2.0d) > Math.pow(this.LLJILLL, 2.0d)) || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (!z) {
        } else {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i == this.LLIZ) {
            return;
        }
        this.LLIZ = i;
        this.LLILZIL.setColor(i);
        invalidate();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = z;
        LIZLLL();
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = i;
        this.LLILZIL.setStrokeWidth(i);
        LIZLLL();
        invalidate();
    }

    public void setCircleBackgroundColor(int i) {
        if (i == this.LLJ) {
            return;
        }
        this.LLJ = i;
        this.LLILZLL.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.LLJJ) {
            return;
        }
        this.LLJJ = colorFilter;
        if (this.LLJJI) {
            this.LLILZ.setColorFilter(colorFilter);
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (z == this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = z;
        if (z) {
            this.LLJIJIL = null;
            this.LLJILJIL = null;
            this.LLILZ.setShader(null);
        } else {
            LIZJ();
        }
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.LLJI) {
            return;
        }
        this.LLJI = i2;
        if (this.LLJJI) {
            this.LLILZ.setAlpha(i2);
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        LIZJ();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        LIZJ();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        LIZJ();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        LIZJ();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == LLJJJ) {
        } else {
            throw new IllegalArgumentException(C786410Ut5.j4("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }

    public C417610GZb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C417610GZb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = new RectF();
        this.LLILLJJLI = new RectF();
        this.LLILLL = new Matrix();
        Paint paint = new Paint();
        this.LLILZ = paint;
        Paint paint2 = new Paint();
        this.LLILZIL = paint2;
        Paint paint3 = new Paint();
        this.LLILZLL = paint3;
        this.LLIZ = -16777216;
        this.LLIZLLLIL = 0;
        this.LLJ = 0;
        this.LLJI = 255;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundImageView, 0, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundImageView_civ_border_width, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.RoundImageView_civ_border_color, -16777216);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RoundImageView_civ_border_overlay, false);
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.RoundImageView_civ_circle_background_color, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJI = true;
        super.setScaleType(LLJJJ);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAlpha(this.LLJI);
        paint.setColorFilter(this.LLJJ);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.LLIZ);
        paint2.setStrokeWidth(this.LLIZLLLIL);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(this.LLJ);
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GZd
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                if (this.LIZ.LLJJIJIL) {
                    ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                    return;
                }
                Rect rect = new Rect();
                this.LIZ.LLILLJJLI.roundOut(rect);
                outline.setRoundRect(rect, rect.width() / 2.0f);
            }
        });
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZLLL();
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        LIZLLL();
        invalidate();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        LIZLLL();
        invalidate();
    }
}
