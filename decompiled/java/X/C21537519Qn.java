package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19Qn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21537519Qn extends RelativeLayout {
    public C21537619Qo LL;

    public float getBottomLeftRadius() {
        return this.LL.LIZ[4];
    }

    public float getBottomRightRadius() {
        return this.LL.LIZ[6];
    }

    public int getStrokeColor() {
        return this.LL.LJ;
    }

    public int getStrokeWidth() {
        return this.LL.LJI;
    }

    public float getTopLeftRadius() {
        return this.LL.LIZ[0];
    }

    public float getTopRightRadius() {
        return this.LL.LIZ[2];
    }

    @Override // android.view.View
    public final void invalidate() {
        C21537619Qo c21537619Qo = this.LL;
        if (c21537619Qo != null) {
            c21537619Qo.LIZLLL(this);
        }
        super.invalidate();
    }

    public final C21537619Qo getMRectCornerHelper() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayer(this.LL.LIZIZ(), null, 31);
        super.dispatchDraw(canvas);
        C21537619Qo c21537619Qo = this.LL;
        if (c21537619Qo.LJI > 0) {
            c21537619Qo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            c21537619Qo.LIZJ().setColor(-1);
            c21537619Qo.LIZJ().setStrokeWidth(c21537619Qo.LJI * 2);
            c21537619Qo.LIZJ().setStyle(Paint.Style.STROKE);
            canvas.drawPath(c21537619Qo.LIZ(), c21537619Qo.LIZJ());
            c21537619Qo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            c21537619Qo.LIZJ().setColor(c21537619Qo.LJ);
            c21537619Qo.LIZJ().setStyle(Paint.Style.STROKE);
            canvas.drawPath(c21537619Qo.LIZ(), c21537619Qo.LIZJ());
        }
        c21537619Qo.LIZJ().setColor(-1);
        c21537619Qo.LIZJ().setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            c21537619Qo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(c21537619Qo.LIZ(), c21537619Qo.LIZJ());
        } else {
            c21537619Qo.LIZJ().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path = new Path();
            path.addRect(0.0f, 0.0f, c21537619Qo.LIZIZ().width(), c21537619Qo.LIZIZ().height(), Path.Direction.CW);
            path.op(c21537619Qo.LIZ(), Path.Op.DIFFERENCE);
            canvas.drawPath(path, c21537619Qo.LIZJ());
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            Region region = this.LL.LJIIIIZZ;
            if (region == null) {
                region = null;
            }
            if (!region.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        } else {
            if (action != 1) {
                if (action == 3) {
                    setPressed(false);
                    refreshDrawableState();
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        refreshDrawableState();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LL.LJII) {
            canvas.save();
            canvas.clipPath(this.LL.LIZ());
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public void setBottomLeftRadius(int i) {
        float[] fArr = this.LL.LIZ;
        float f = i * 1.0f;
        fArr[6] = f;
        fArr[7] = f;
        invalidate();
    }

    public void setBottomRightRadius(int i) {
        float[] fArr = this.LL.LIZ;
        float f = i * 1.0f;
        fArr[4] = f;
        fArr[5] = f;
        invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.LL.LJII = z;
        invalidate();
    }

    public final void setMRectCornerHelper(C21537619Qo c21537619Qo) {
        this.LL = c21537619Qo;
    }

    public void setRadius(int i) {
        int length = this.LL.LIZ.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.LL.LIZ[i2] = i * 1.0f;
        }
        invalidate();
    }

    public final void setRoundAsCircle(boolean z) {
        this.LL.LIZLLL = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.LL.LJ = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.LL.LJI = i;
        invalidate();
    }

    public void setTopLeftRadius(int i) {
        float[] fArr = this.LL.LIZ;
        float f = i * 1.0f;
        fArr[0] = f;
        fArr[1] = f;
        invalidate();
    }

    public void setTopRightRadius(int i) {
        float[] fArr = this.LL.LIZ;
        float f = i * 1.0f;
        fArr[2] = f;
        fArr[3] = f;
        invalidate();
    }

    public C21537519Qn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C21537619Qo c21537619Qo = new C21537619Qo();
        this.LL = c21537619Qo;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RectCornerAttrs);
        c21537619Qo.LIZLLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RectCornerAttrs_round_as_circle, false);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RectCornerAttrs_stroke_color);
        c21537619Qo.LJFF = colorStateList;
        if (colorStateList != null) {
            c21537619Qo.LJ = colorStateList.getDefaultColor();
            c21537619Qo.LJFF.getDefaultColor();
        } else {
            c21537619Qo.LJ = -1;
        }
        c21537619Qo.LJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RectCornerAttrs_stroke_width, 0);
        c21537619Qo.LJII = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RectCornerAttrs_clip_background, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RectCornerAttrs_round_corner, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RectCornerAttrs_round_corner_top_left, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RectCornerAttrs_round_corner_top_right, dimensionPixelSize);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RectCornerAttrs_round_corner_bottom_left, dimensionPixelSize);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RectCornerAttrs_round_corner_bottom_right, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
        float[] fArr = c21537619Qo.LIZ;
        float f = dimensionPixelSize2;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = dimensionPixelSize3;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = dimensionPixelSize5;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = dimensionPixelSize4;
        fArr[6] = f4;
        fArr[7] = f4;
        c21537619Qo.LJIIIZ = new RectF();
        c21537619Qo.LIZIZ = new Path();
        c21537619Qo.LJIIIIZZ = new Region();
        c21537619Qo.LIZJ = new Paint();
        c21537619Qo.LIZJ().setColor(-1);
        c21537619Qo.LIZJ().setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C21537619Qo c21537619Qo = this.LL;
        c21537619Qo.LIZIZ().set(0.0f, 0.0f, i, i2);
        c21537619Qo.LIZLLL(this);
    }
}
