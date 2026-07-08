package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GU6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GU6 extends C1091700eW0 {
    public final Paint LLILLL;
    public final Path LLILZ;
    public final int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final int LLIZLLLIL;
    public Rect LLJ;
    public Rect LLJI;
    public final C415740GRw LLJIJIL;
    public Rect LLJILJIL;

    public final int[] getAnchorPos() {
        Rect rect = this.LLJ;
        return new int[]{rect.left, rect.top};
    }

    public final View getAnchorView() {
        return getChildAt(0);
    }

    public final Rect getAnchorRect() {
        return this.LLJ;
    }

    public C0GU6(Context context) {
        super(context);
        this.LLILLL = new Paint(1);
        this.LLILZ = new Path();
        this.LLILZIL = 356;
        this.LLILZLL = -1.0f;
        this.LLIZ = -1.0f;
        this.LLIZLLLIL = 26;
        this.LLJ = new Rect(0, 0, 0, 0);
        this.LLJI = new Rect(0, 0, 0, 0);
        this.LLJIJIL = new C415740GRw(context);
        this.LLILZIL = context.getResources().getDimensionPixelSize(R.dimen.an8);
        this.LLIZLLLIL = context.getResources().getDimensionPixelSize(R.dimen.an7);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.save();
        this.LLILLL.setXfermode(null);
        Rect rect = this.LLJI;
        this.LLILLL.setColor(C20736316Cj.LIZIZ(R.attr.cc9, getContext()));
        float f = rect.left;
        this.LLILLL.setShader(new LinearGradient(f, rect.bottom, f, rect.top, C20736316Cj.LIZIZ(R.attr.cc9, getContext()), C20736316Cj.LIZIZ(R.attr.exe, getContext()), Shader.TileMode.CLAMP));
        this.LLILZ.setFillType(Path.FillType.WINDING);
        canvas.drawPath(this.LLILZ, this.LLILLL);
        canvas.restore();
        if (this.LLILZLL > 0.0f && this.LLIZ > 0.0f && this.LLIZLLLIL > 0) {
            canvas.save();
            this.LLILLL.setColor(C20736316Cj.LIZIZ(R.attr.ewn, getContext()));
            this.LLILLL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            canvas.drawCircle(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILLL);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void setAnchorBounds(Rect rect) {
        if (rect != null) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            this.LLILZLL = rect.left + (iWidth / 2.0f);
            this.LLIZ = rect.top + (iHeight / 2.0f);
            int i = (int) this.LLILZLL;
            int i2 = this.LLIZLLLIL;
            int i3 = (int) this.LLIZ;
            this.LLJ = new Rect(i - i2, i3 - i2, i + i2, i3 + i2);
            this.LLJIJIL.setCircleX(this.LLILZLL);
            this.LLJIJIL.setCircleY(this.LLIZ);
            this.LLJIJIL.setCircleRadius(this.LLIZLLLIL);
        }
    }

    public final void setWindowVisibleRect(Rect rect) {
        this.LLJILJIL = rect;
        if (rect != null) {
            int i = rect.bottom;
            this.LLJI = new Rect(0, i - this.LLILZIL, rect.right, i);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        childAt.measure(FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(this.LLIZLLLIL * 2, Integer.MIN_VALUE), 0, layoutParams.width), FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(this.LLIZLLLIL * 2, Integer.MIN_VALUE), 0, layoutParams.height));
        if (this.LLJILJIL != null) {
            setMeasuredDimension(this.LLJI.width(), this.LLJI.height());
        }
        this.LLILZ.reset();
        Path path = this.LLILZ;
        Rect rect = this.LLJI;
        path.moveTo(rect.left, rect.top);
        Path path2 = this.LLILZ;
        Rect rect2 = this.LLJI;
        path2.lineTo(rect2.left, rect2.bottom);
        Path path3 = this.LLILZ;
        Rect rect3 = this.LLJI;
        path3.lineTo(rect3.right, rect3.bottom);
        Path path4 = this.LLILZ;
        Rect rect4 = this.LLJI;
        path4.lineTo(rect4.right, rect4.top);
        Path path5 = this.LLILZ;
        Rect rect5 = this.LLJI;
        path5.lineTo(rect5.left, rect5.top);
        this.LLILZ.close();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt instanceof C415740GRw) {
            Rect rect = this.LLJ;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
