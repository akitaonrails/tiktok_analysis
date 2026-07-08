package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376310EpB extends AppCompatImageView {
    public static final int LLILZ;
    public static final int LLILZIL;
    public static final int LLILZLL;
    public final C01GW LL;
    public final Paint LLILLJJLI;
    public Path LLILLL;

    static {
        boolean z = C368130Ebz.LJII;
        LLILZ = C0FU0.LIZ(z ? 26.0f : 20.0f);
        LLILZIL = C0FU0.LIZ(z ? 30.0f : 23.0f);
        LLILZLL = C0FU0.LIZ(2.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            canvas.clipPath(this.LLILLL);
            super.onDraw(canvas);
            canvas.drawPath(this.LLILLL, this.LLILLJJLI);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C376310EpB(Context context, int i) {
        int iLIZ;
        super(context, null, 0);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(410));
        this.LL = c01gwLIZIZ;
        if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
            iLIZ = C354870Dvh.LIZ(3);
        } else {
            iLIZ = LLILZLL;
        }
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        this.LLILLL = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(iLIZ);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            size = View.MeasureSpec.getSize(i);
        } else {
            size = LLILZ;
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            size2 = View.MeasureSpec.getSize(i2);
        } else {
            size2 = LLILZIL;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = new Path();
        float f = i / 20.0f;
        float f2 = i2 / 23.0f;
        if (f >= f2) {
            f = f2;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        path.reset();
        path.moveTo(10.0f, 1.0f);
        path.cubicTo(5.04f, 1.0f, 1.0f, 5.02f, 1.0f, 9.99f);
        path.cubicTo(1.0f, 11.35f, 1.57f, 12.77f, 2.32f, 14.07f);
        path.cubicTo(3.07f, 15.39f, 4.08f, 16.69f, 5.08f, 17.82f);
        path.cubicTo(6.08f, 18.95f, 7.1f, 19.95f, 7.9f, 20.66f);
        path.cubicTo(8.31f, 21.02f, 8.66f, 21.31f, 8.95f, 21.52f);
        path.cubicTo(9.09f, 21.62f, 9.22f, 21.72f, 9.34f, 21.79f);
        path.cubicTo(9.4f, 21.83f, 9.48f, 21.87f, 9.56f, 21.9f);
        path.cubicTo(9.61f, 21.92f, 9.78f, 22.0f, 10.0f, 22.0f);
        path.cubicTo(10.22f, 22.0f, 10.39f, 21.92f, 10.44f, 21.9f);
        path.cubicTo(10.52f, 21.87f, 10.6f, 21.83f, 10.66f, 21.79f);
        path.cubicTo(10.78f, 21.72f, 10.91f, 21.62f, 11.05f, 21.52f);
        path.cubicTo(11.34f, 21.31f, 11.69f, 21.02f, 12.1f, 20.66f);
        path.cubicTo(12.9f, 19.95f, 13.92f, 18.95f, 14.92f, 17.82f);
        path.cubicTo(15.92f, 16.69f, 16.93f, 15.39f, 17.68f, 14.07f);
        path.cubicTo(18.43f, 12.77f, 19.0f, 11.35f, 19.0f, 9.99f);
        path.cubicTo(19.0f, 5.02f, 14.96f, 1.0f, 10.0f, 1.0f);
        path.transform(matrix);
        this.LLILLL = path;
    }
}
