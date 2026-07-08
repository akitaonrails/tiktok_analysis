package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0GSH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSH extends Drawable {
    public final float LIZ = 17.0f;
    public final float LIZIZ = 46.0f;
    public final Path LIZJ = C21518819Ji.LIZLLL("M0.8948 6.1357C0.578 5.1978 0.8503 4.3709 1.7863 3.9993L9.2295 1.3473C9.96 1.0574 10.8645 1.1648 11.1519 1.8913C11.4394 2.6178 11.0802 3.4419 10.3497 3.7319L5.9929 5.1586C19.2015 12.6983 18.5167 34.8694 8.5789 42.8815C16.3944 32.2676 14.9822 12.7831 4.4419 7.6331C4.5026 7.7966 4.5758 7.9833 4.6619 8.201L5.6796 12.1142C5.967 12.8407 5.6078 13.6648 4.8774 13.9548C4.1469 14.2448 3.445 13.9299 3.1576 13.2034L0.9281 6.2261L0.8948 6.1357Z");
    public final Paint LIZLLL;
    public final Paint LJ;
    public int LJFF;
    public int LJI;
    public final int LJII;
    public boolean LJIIIIZZ;
    public float LJIIIZ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return C814420VxA.LIZIZ(this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return C814420VxA.LIZIZ(this.LIZ);
    }

    public C0GSH() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LIZLLL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(3.0f);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        this.LJ = paint2;
        this.LJFF = ColorProtector.parseColor("#47EDF3");
        this.LJI = ColorProtector.parseColor("#00C8FF");
        this.LJII = -1;
        this.LJIIIZ = 1.0f;
        paint.setShadowLayer(9.1332f, 0.0f, 4.5666f, Color.argb(25, 0, 0, 0));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        View view;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            view = (View) callback;
        } else {
            view = null;
        }
        int paddingBottom = 0;
        if (view != null) {
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            paddingRight = view.getPaddingRight();
            paddingBottom = view.getPaddingBottom();
        } else {
            paddingLeft = 0;
            paddingTop = 0;
            paddingRight = 0;
        }
        Rect rect = new Rect(getBounds().left + paddingLeft, getBounds().top + paddingTop, getBounds().right - paddingRight, getBounds().bottom - paddingBottom);
        float fWidth = rect.width();
        float fHeight = rect.height();
        if (fWidth > 0.0f && fHeight > 0.0f) {
            float f = fWidth / this.LIZ;
            float f2 = fHeight / this.LIZIZ;
            LIZ(fWidth, fHeight);
            canvas.save();
            canvas.translate(rect.left, rect.top);
            if (this.LJIIIIZZ) {
                canvas.save();
                canvas.translate(fWidth, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            this.LJ.setColor(this.LJII);
            canvas.save();
            canvas.scale(f, f2);
            canvas.drawPath(this.LIZJ, this.LJ);
            canvas.drawPath(this.LIZJ, this.LIZLLL);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LIZ(rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZLLL.setAlpha(i);
        this.LJ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
        this.LJ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void LIZ(float f, float f2) {
        if (f != 0.0f && f2 != 0.0f) {
            this.LJIIIZ = getBounds().width() / this.LIZ;
            float fHeight = getBounds().height() / this.LIZIZ;
            float f3 = this.LJIIIZ;
            this.LIZLLL.setShader(new LinearGradient(f3 * 1.4851f, fHeight * 1.754f, f3 * 13.9497f, fHeight * 44.8545f, this.LJFF, this.LJI, Shader.TileMode.CLAMP));
        }
    }
}
