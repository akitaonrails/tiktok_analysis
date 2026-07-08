package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0ejp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1100270ejp extends View {
    public int LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public Paint LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public ViewPager LLJIJIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLIZLLLIL = getPaddingLeft();
        this.LLJ = getPaddingTop();
        this.LLILZLL.setColor(this.LLILLJJLI);
        float f = this.LLIZLLLIL;
        for (int i = 0; i < this.LLIZ; i++) {
            if (this.LLJI == i) {
                this.LLILZLL.setColor(this.LL);
            } else {
                this.LLILZLL.setColor(this.LLILLJJLI);
            }
            float f2 = this.LLILZIL;
            canvas.drawCircle(f + f2, this.LLJ + f2, f2, this.LLILZLL);
            f += this.LLILZ + this.LLILLL;
        }
    }

    public void setCount(int i) {
        this.LLIZ = i;
        measure(0, 0);
        invalidate();
    }

    public void setPosition(int i) {
        this.LLJI = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.LLJIJIL = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0ejq
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    C1100270ejp c1100270ejp = this.LL;
                    int i2 = c1100270ejp.LLIZ;
                    if (i2 > 0) {
                        int i3 = i % i2;
                        if (i3 < i2) {
                            c1100270ejp.setPosition(i3);
                        } else {
                            c1100270ejp.setPosition(0);
                        }
                    }
                }
            });
        }
    }

    public C1100270ejp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_RoundIndicatorView, 0, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_RoundIndicatorView_ri_space, 0.0f);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_RoundIndicatorView_ri_size, 0.0f);
        this.LLILZ = dimension;
        this.LLILZIL = dimension / 2.0f;
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_RoundIndicatorView_ri_default_color, -1726079458);
        this.LL = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_RoundIndicatorView_ri_selected_color, -10704);
        this.LLIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.ttlive_RoundIndicatorView_ri_count, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LLILZLL = paint;
        paint.setAntiAlias(true);
        this.LLJI = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getPaddingLeft() + getPaddingRight();
            int i3 = this.LLIZ;
            if (i3 > 0) {
                size = (int) (size + (i3 * this.LLILZ) + ((i3 - 1) * this.LLILLL));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop();
            if (this.LLIZ > 0) {
                size2 += (int) this.LLILZ;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }
}
