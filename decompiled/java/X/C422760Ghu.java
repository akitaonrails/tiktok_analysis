package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: renamed from: X.0Ghu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422760Ghu extends FrameLayout {
    public final C1322110kVd LL;
    public final Paint LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public final Path LLILZIL;
    public final int LLILZLL;

    public C422760Ghu(Context context) {
        super(context, null, 0);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.LLILLJJLI = paint;
        this.LLILZIL = new Path();
        setWillNotDraw(false);
        this.LLILZLL = (int) (getResources().getDisplayMetrics().density * 2.0f);
        C1322110kVd c1322110kVd = new C1322110kVd(context);
        c1322110kVd.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
        this.LL = c1322110kVd;
        addView(c1322110kVd, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.LLILZIL);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.LLILZ > 0.0f && this.LLILLL != 0) {
            canvas.drawPath(this.LLILZIL, this.LLILLJJLI);
        }
    }

    public final void setImageUrls(List<String> list) {
        if (!list.isEmpty()) {
            this.LL.setImageURI((String) C13LP.LJJJJZI(list));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILZIL.reset();
        Path pathLIZLLL = C21518819Ji.LIZLLL("M17.4866 76.1565C28.3727 49.5158 49.5158 28.3727 76.1565 17.4866C131.818 -5.25831 194.182 -5.25832 249.843 17.4865C276.484 28.3727 297.627 49.5158 308.513 76.1566C331.258 131.818 331.258 194.182 308.513 249.843C297.627 276.484 276.484 297.627 249.843 308.513C194.182 331.258 131.818 331.258 76.1566 308.513C49.5158 297.627 28.3727 276.484 17.4865 249.843C-5.25832 194.182 -5.25831 131.818 17.4866 76.1565Z");
        Matrix matrix = new Matrix();
        RectF rectF = new RectF();
        pathLIZLLL.computeBounds(rectF, true);
        float f = this.LLILZLL * 2;
        float fMin = Math.min((i - f) / ((rectF.width() + (rectF.left * 2.0f)) - (-36.0f)), (i2 - f) / ((rectF.height() + (rectF.top * 2.0f)) - (-36.0f)));
        float f2 = this.LLILZLL + (18.0f * fMin);
        matrix.setTranslate(f2, f2);
        float f3 = this.LLILZLL;
        matrix.postScale(fMin, fMin, f3, f3);
        pathLIZLLL.transform(matrix, this.LLILZIL);
    }
}
