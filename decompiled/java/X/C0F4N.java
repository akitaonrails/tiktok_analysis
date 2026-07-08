package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0F4N, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4N extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public float LLILZLL;
    public int[] LLIZ;
    public int[] LLIZLLLIL;
    public final Path LLJ;
    public final Path LLJI;

    public C0F4N(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        paint3.setColor(1727031950);
        Float fValueOf = Float.valueOf(2.0f);
        paint3.setPathEffect(new DashPathEffect(new float[]{C418440Gaw.LIZIZ(fValueOf), C418440Gaw.LIZIZ(fValueOf)}, 0.0f));
        this.LLILLL = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(-1);
        this.LLILZ = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setColor(-114586);
        this.LLILZIL = paint5;
        this.LLILZLL = 0.62f;
        this.LLIZ = new int[]{-9759, -114586};
        this.LLIZLLLIL = new int[]{452865109, 872415231};
        this.LLJ = new Path();
        this.LLJI = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = this.LLILZLL * height;
        Float fValueOf = Float.valueOf(4.0f);
        float fLIZLLL = C13LZ.LIZLLL(f, C418440Gaw.LIZIZ(fValueOf), height - C418440Gaw.LIZIZ(fValueOf));
        float f2 = width * 0.94f;
        this.LLJ.reset();
        this.LLJ.moveTo(0.0f, 0.0f);
        this.LLJ.cubicTo(width * 0.47f, 0.0f, width * 0.72f, fLIZLLL, f2, fLIZLLL);
        this.LLJI.set(this.LLJ);
        this.LLJI.lineTo(f2, height);
        this.LLJI.lineTo(0.0f, height);
        this.LLJI.close();
        canvas.drawPath(this.LLJI, this.LLILLJJLI);
        canvas.drawPath(this.LLJ, this.LL);
        canvas.drawLine(f2, 0.0f, f2, height, this.LLILLL);
        canvas.drawCircle(f2, fLIZLLL, C418440Gaw.LIZIZ(fValueOf), this.LLILZ);
        canvas.drawCircle(f2, fLIZLLL, C418440Gaw.LIZIZ(Float.valueOf(3.0f)), this.LLILZIL);
    }

    public final void LIZ(int i, int i2) {
        if (i > 0 && i2 > 0) {
            try {
                this.LL.setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, this.LLIZ, (float[]) null, Shader.TileMode.CLAMP));
                this.LLILLJJLI.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i2, this.LLIZLLLIL, (float[]) null, Shader.TileMode.CLAMP));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ(i, i2);
    }
}
