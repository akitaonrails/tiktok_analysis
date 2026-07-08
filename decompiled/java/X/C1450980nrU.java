package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0nrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450980nrU extends C1836880xtu {
    public Integer LLIZLLLIL;
    public Integer LLJ;
    public Rect LLJI;
    public float LLJIJIL;

    public final Integer getStoryBgColorEnd() {
        return this.LLJ;
    }

    public final Integer getStoryBgColorStart() {
        return this.LLIZLLLIL;
    }

    public final Rect getStoryVisibleRect() {
        return this.LLJI;
    }

    public C1450980nrU(Context context) {
        super(context, null, 0);
    }

    public final void setStoryBgColorEnd(Integer num) {
        this.LLJ = num;
    }

    public final void setStoryBgColorStart(Integer num) {
        this.LLIZLLLIL = num;
    }

    public final void setStoryCornerRadius(float f) {
        this.LLJIJIL = f;
    }

    public final void setStoryVisibleRect(Rect rect) {
        this.LLJI = rect;
    }

    @Override // X.C1836880xtu
    public final void LIZIZ(Canvas canvas, RectF rectF) {
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = this.LLJ;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                Rect rect = this.LLJI;
                if (rect != null) {
                    float f = this.LLJIJIL;
                    if (rectF.top > rect.top) {
                        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iIntValue, iIntValue2});
                        if (f > 0.0f) {
                            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                        }
                        gradientDrawable.setBounds(rect.left, rect.top, rect.right, (int) rectF.top);
                        gradientDrawable.draw(canvas);
                    }
                    if (rect.bottom > rectF.bottom) {
                        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iIntValue, iIntValue2});
                        if (f > 0.0f) {
                            gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
                        }
                        gradientDrawable2.setBounds(rect.left, (int) rectF.bottom, rect.right, rect.bottom);
                        gradientDrawable2.draw(canvas);
                    }
                }
            }
        }
    }
}
