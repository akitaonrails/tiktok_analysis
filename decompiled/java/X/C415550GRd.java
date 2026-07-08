package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415550GRd extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Path LLILLL;
    public final Path LLILZ;
    public final float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;

    public final float getCurveDepth() {
        return this.LLIZ;
    }

    public final float getInnerHeight() {
        return this.LLILZLL;
    }

    public final float getVerticalMargin() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f = width - 0.0f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            float f2 = this.LLILZLL;
            if (f2 > 0.0f) {
                float f3 = this.LLIZLLLIL;
                if (f3 > 0.0f) {
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    float f4 = f2 + f3;
                    if (f4 > height) {
                        f4 = height;
                    }
                    if (f > 0.0f && f4 > f3) {
                        Path path = this.LLILZ;
                        float f5 = this.LLILZIL;
                        float f6 = this.LLIZ;
                        path.reset();
                        float f7 = f - 0.0f;
                        float f8 = f4 - f3;
                        if (f7 > 0.0f && f8 > 0.0f) {
                            float fMin = Math.min(f7, f8) / 2.0f;
                            if (f5 > fMin) {
                                f5 = fMin;
                            }
                            float f9 = (0.0f + f) / 2.0f;
                            if (f6 < 0.0f) {
                                f6 = 0.0f;
                            }
                            float f10 = f8 * 0.5f;
                            if (f6 > f10) {
                                f6 = f10;
                            }
                            float f11 = f3 + f5;
                            path.moveTo(0.0f, f11);
                            path.quadTo(0.0f, f3, 0.0f + f5, f3);
                            path.lineTo(f - f5, f3);
                            path.quadTo(f, f3, f, f11);
                            path.lineTo(f, f4);
                            path.quadTo(f9, f6 + f4, 0.0f, f4);
                            path.lineTo(0.0f, f11);
                            path.close();
                        }
                        this.LLILLL.reset();
                        this.LLILLL.setFillType(Path.FillType.EVEN_ODD);
                        this.LLILLL.addRect(0.0f, 0.0f, width, height, Path.Direction.CW);
                        this.LLILLL.addPath(this.LLILZ);
                        canvas.drawPath(this.LLILLL, this.LL);
                        canvas.drawPath(this.LLILZ, this.LLILLJJLI);
                        return;
                    }
                    return;
                }
            }
            this.LLILLL.reset();
            this.LLILLL.addRect(0.0f, 0.0f, width, height, Path.Direction.CW);
            canvas.drawPath(this.LLILLL, this.LL);
        }
    }

    public final void setCurveDepth(float f) {
        this.LLIZ = f;
        invalidate();
    }

    public final void setInnerHeight(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.LLILZLL = f;
        invalidate();
    }

    public final void setVerticalMargin(float f) {
        this.LLIZLLLIL = f;
        invalidate();
    }

    public C415550GRd(Context context, AttributeSet attributeSet) {
        int color;
        String str;
        int color2;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, context);
        if (numLIZJ != null) {
            color = numLIZJ.intValue();
        } else {
            color = ColorProtector.parseColor("#80000000");
        }
        paint.setColor(color);
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        if (!C960203pA.LIZIZ(context)) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zb, context);
            if (numLIZJ2 != null) {
                color2 = numLIZJ2.intValue();
                paint2.setColor(color2);
                this.LLILLJJLI = paint2;
                this.LLILLL = new Path();
                this.LLILZ = new Path();
                this.LLILZIL = C418440Gaw.LIZIZ(12);
            }
            str = "#4D000000";
        } else {
            str = "#54000000";
        }
        color2 = ColorProtector.parseColor(str);
        paint2.setColor(color2);
        this.LLILLJJLI = paint2;
        this.LLILLL = new Path();
        this.LLILZ = new Path();
        this.LLILZIL = C418440Gaw.LIZIZ(12);
    }
}
