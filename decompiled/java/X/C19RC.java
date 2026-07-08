package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19RC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19RC extends AppCompatImageView implements C19S4 {
    public final C21540019Rm LL;
    public final RectF LLILLJJLI;
    public final RectF LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final Path LLILZLL;
    public ColorStateList LLIZ;
    public C21538919Rb LLIZLLLIL;
    public C19RX LLJ;
    public float LLJI;
    public final Path LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final int LLJJIII;
    public boolean LLJJIJI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final int getContentPaddingEnd() {
        int i = this.LLJJIII;
        return i != Integer.MIN_VALUE ? i : LIZJ() ? this.LLJILJIL : this.LLJILLL;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (this.LLJJI != Integer.MIN_VALUE || this.LLJJIII != Integer.MIN_VALUE) {
            if (LIZJ() && (i2 = this.LLJJIII) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!LIZJ() && (i = this.LLJJI) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.LLJILJIL;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (this.LLJJI != Integer.MIN_VALUE || this.LLJJIII != Integer.MIN_VALUE) {
            if (LIZJ() && (i2 = this.LLJJI) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!LIZJ() && (i = this.LLJJIII) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.LLJILLL;
    }

    public final int getContentPaddingStart() {
        int i = this.LLJJI;
        return i != Integer.MIN_VALUE ? i : LIZJ() ? this.LLJILLL : this.LLJILJIL;
    }

    public final boolean LIZJ() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    public int getContentPaddingBottom() {
        return this.LLJJ;
    }

    public int getContentPaddingTop() {
        return this.LLJILJILJ;
    }

    public C19RX getShapeAppearanceModel() {
        return this.LLJ;
    }

    public ColorStateList getStrokeColor() {
        return this.LLIZ;
    }

    public float getStrokeWidth() {
        return this.LLJI;
    }

    public C19RC(Context context) {
        this(context, null, 0);
    }

    public final void LIZ(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.LLJIJIL, this.LLILZIL);
        if (this.LLIZ != null) {
            this.LLILZ.setStrokeWidth(this.LLJI);
            int colorForState = this.LLIZ.getColorForState(getDrawableState(), this.LLIZ.getDefaultColor());
            if (this.LLJI > 0.0f && colorForState != 0) {
                this.LLILZ.setColor(colorForState);
                canvas.drawPath(this.LLILZLL, this.LLILZ);
            }
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

    @Override // X.C19S4
    public void setShapeAppearanceModel(C19RX c19rx) {
        this.LLJ = c19rx;
        C21538919Rb c21538919Rb = this.LLIZLLLIL;
        if (c21538919Rb != null) {
            c21538919Rb.setShapeAppearanceModel(c19rx);
        }
        LIZLLL(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.LLIZ = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setStrokeWidth(float f) {
        if (this.LLJI != f) {
            this.LLJI = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public C19RC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZLLL(int i, int i2) {
        this.LLILLJJLI.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.LL.LIZ(this.LLJ, 1.0f, this.LLILLJJLI, null, this.LLILZLL);
        this.LLJIJIL.rewind();
        this.LLJIJIL.addPath(this.LLILZLL);
        this.LLILLL.set(0.0f, 0.0f, i, i2);
        this.LLJIJIL.addRect(this.LLILLL, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLJJIJI || !isLayoutDirectionResolved()) {
            return;
        }
        this.LLJJIJI = true;
        if (!isPaddingRelative() && this.LLJJI == Integer.MIN_VALUE && this.LLJJIII == Integer.MIN_VALUE) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    public C19RC(Context context, AttributeSet attributeSet, int i) {
        super(C1369550lk9.LIZ(context, attributeSet, 0, R.style.a5u), attributeSet, 0);
        this.LL = C19RE.LIZ;
        this.LLILZLL = new Path();
        this.LLJJIJI = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.LLILZIL = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLILLJJLI = new RectF();
        this.LLILLL = new RectF();
        this.LLJIJIL = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.ShapeableImageView, 0, R.style.a5u);
        this.LLIZ = C19RN.LIZ(context2, typedArrayObtainStyledAttributes, R$styleable.ShapeableImageView_strokeColor);
        this.LLJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPadding, 0);
        this.LLJILJIL = dimensionPixelSize;
        this.LLJILJILJ = dimensionPixelSize;
        this.LLJILLL = dimensionPixelSize;
        this.LLJJ = dimensionPixelSize;
        this.LLJILJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.LLJILLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.LLJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.LLJJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.LLJJIII = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.LLILZ = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.LLJ = new C19RX(C19RX.LIZIZ(context2, attributeSet, 0, R.style.a5u));
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.19RD
            public final Rect LIZ = new Rect();

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                C19RC c19rc = this.LIZIZ;
                if (c19rc.LLJ == null) {
                    return;
                }
                if (c19rc.LLIZLLLIL == null) {
                    c19rc.LLIZLLLIL = new C21538919Rb(this.LIZIZ.LLJ);
                }
                this.LIZIZ.LLILLJJLI.round(this.LIZ);
                this.LIZIZ.LLIZLLLIL.setBounds(this.LIZ);
                this.LIZIZ.LLIZLLLIL.getOutline(outline);
            }
        });
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZLLL(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }
}
