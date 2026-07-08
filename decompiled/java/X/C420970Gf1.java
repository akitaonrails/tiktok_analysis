package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Gf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420970Gf1 extends View {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Path LLILZ;
    public int LLILZIL;
    public ShapeDrawable LLILZLL;
    public PathShape LLIZ;
    public RectF LLIZLLLIL;
    public boolean LLJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILZ.reset();
        this.LLILZ.moveTo(0.0f, 0.0f);
        RectF rectF = this.LLIZLLLIL;
        if (rectF != null) {
            this.LLILZ.arcTo(rectF, 0.0f, 180.0f);
        }
        this.LLILZ.lineTo(0.0f, this.LLILLJJLI);
        this.LLILZ.lineTo(this.LL, this.LLILLJJLI);
        this.LLILZ.lineTo(this.LL, 0.0f);
        this.LLILZ.close();
        if (this.LLIZ == null || this.LLJ) {
            this.LLIZ = new PathShape(this.LLILZ, this.LL, this.LLILLJJLI);
            if (this.LLJ) {
                this.LLJ = false;
            }
        }
        this.LLILZLL.setShape(this.LLIZ);
        this.LLILZLL.setBounds(0, 0, this.LL, this.LLILLJJLI);
        this.LLILZLL.getPaint().setColor(this.LLILZIL);
        this.LLILZLL.draw(canvas);
    }

    public final void setArcBackgroundViewEndColor(int i) {
        this.LLILZIL = i;
    }

    public C420970Gf1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ArcBackgroundView);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ArcBackgroundView_ArcBackgroundViewEndColor, this.LLILZIL);
        this.LLILLL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ArcBackgroundView_ArcBackgroundViewTopHeight, 0);
        this.LLILZ = new Path();
        typedArrayObtainStyledAttributes.recycle();
        this.LLILZLL = new ShapeDrawable();
        this.LLIZLLLIL = new RectF(0.0f, -r1, r1 * 2, this.LLILLL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LL = View.MeasureSpec.getSize(i);
        this.LLILLJJLI = View.MeasureSpec.getSize(i2);
        this.LLJ = true;
    }
}
