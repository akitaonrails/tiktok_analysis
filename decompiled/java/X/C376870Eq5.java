package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Eq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376870Eq5 extends View {
    public static final float LLJILJIL = C418440Gaw.LIZIZ(Double.valueOf(5.5d));
    public static final float LLJILJILJ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
    public final Paint LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public Bitmap LLILZ;
    public Canvas LLILZIL;
    public final List<Float> LLILZLL;
    public int LLIZ;
    public final List<Float> LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public int LLJIJIL;

    private final Paint getPrimaryPaint() {
        return (Paint) this.LLILLJJLI.getValue();
    }

    private final Paint getSecondaryPaint() {
        return (Paint) this.LLILLL.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getWidth() != this.LLJIJIL || getHeight() != this.LLJI) {
            this.LLJIJIL = getWidth();
            this.LLJI = getHeight();
            Bitmap bitmap = this.LLILZ;
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            if (getWidth() != 0 && getHeight() != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                this.LLILZ = bitmapCreateBitmap;
                this.LLILZIL = new Canvas(bitmapCreateBitmap);
                Paint paint = this.LL;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                ((ArrayList) this.LLIZLLLIL).clear();
            } else {
                return;
            }
        }
        if (((ArrayList) this.LLIZLLLIL).isEmpty() && (!((ArrayList) this.LLILZLL).isEmpty())) {
            int width = this.LLIZ;
            if (width <= 0) {
                width = (int) (getWidth() / LLJILJIL);
            }
            ((ArrayList) this.LLIZLLLIL).addAll(C1341690l1D.LIZIZ(width, this.LLILZLL));
        }
        Canvas canvas2 = this.LLILZIL;
        if (canvas2 != null) {
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), getSecondaryPaint());
            canvas2.drawRect(0.0f, 0.0f, getWidth() * this.LLJ, getHeight(), getPrimaryPaint());
        }
        getWidth();
        int i = 0;
        for (Object obj : (ArrayList) this.LLIZLLLIL) {
            int i2 = i + 1;
            if (i >= 0) {
                float fFloatValue = (((Number) obj).floatValue() * (getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                float fLIZIZ = C418440Gaw.LIZIZ(2);
                if (fFloatValue < fLIZIZ) {
                    fFloatValue = fLIZIZ;
                }
                float f = (i + 0.5f) * LLJILJIL;
                float f2 = LLJILJILJ;
                float height = (f2 / 2) + (((canvas.getHeight() - f2) - fFloatValue) / 2.0f);
                canvas.drawLine(f, height, f, height + fFloatValue, this.LL);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void setProgress(float f) {
        this.LLJ = f;
        invalidate();
    }

    public C376870Eq5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setStrokeWidth(LLJILJILJ);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.LL = paint;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1139));
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1140));
        this.LLILZLL = new ArrayList();
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = 1.0f;
    }
}
