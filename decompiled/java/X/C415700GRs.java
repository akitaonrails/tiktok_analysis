package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415700GRs extends View {
    public final Paint LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;

    public C415700GRs(Context context) {
        super(context);
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.fxa, context);
        Paint paint = new Paint();
        this.LL = paint;
        float fLIZIZ = C497740JfY.LIZIZ(1);
        float fLIZIZ2 = C497740JfY.LIZIZ(5.0f);
        float fLIZIZ3 = C497740JfY.LIZIZ(5.0f);
        paint.setColor(iLIZIZ);
        paint.setStrokeWidth(fLIZIZ);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{fLIZIZ3, fLIZIZ2}, 0.0f));
        setTag("DottedLineView");
    }

    public final void LIZ(Canvas canvas) {
        canvas.drawLine(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILLJJLI = 0.0f;
        this.LLILLL = getHeight() / 2.0f;
        this.LLILZ = getWidth();
        this.LLILZIL = this.LLILLL;
        LIZ(canvas);
        float width = getWidth() / 2.0f;
        this.LLILLJJLI = width;
        this.LLILLL = 0.0f;
        this.LLILZ = width;
        this.LLILZIL = getHeight();
        LIZ(canvas);
        float width2 = getWidth() * 0.0f;
        this.LLILLJJLI = width2;
        this.LLILLL = 0.0f;
        this.LLILZ = width2;
        this.LLILZIL = getHeight();
        LIZ(canvas);
        float width3 = this.LLILLJJLI + (getWidth() * 1.0f);
        this.LLILLJJLI = width3;
        this.LLILLL = 0.0f;
        this.LLILZ = width3;
        this.LLILZIL = getHeight();
        LIZ(canvas);
    }
}
