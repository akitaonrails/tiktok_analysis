package X;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0GTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416280GTy extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final int[] LLILLL;
    public final float[] LLILZ;
    public final int[] LLILZIL;
    public final float[] LLILZLL;

    private final void setDstIn(Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(BlendMode.DST_IN);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width > 0.0f && height > 0.0f) {
            this.LL.setShader(new LinearGradient(0.0f, height, width, 0.0f, this.LLILLL, this.LLILZ, Shader.TileMode.CLAMP));
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            int iSaveLayer = canvas.saveLayer(rectF, null);
            if (C426750GoL.LIZLLL(getContext())) {
                canvas.scale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
            }
            canvas.drawRect(rectF, this.LL);
            setDstIn(this.LLILLJJLI);
            float f = width * 0.92f;
            this.LLILLJJLI.setShader(new LinearGradient(f, 0.0f, width, 0.0f, this.LLILZIL, this.LLILZLL, Shader.TileMode.CLAMP));
            canvas.drawRect(f, 0.0f, width, height, this.LLILLJJLI);
            Paint paint = this.LLILLJJLI;
            if (Build.VERSION.SDK_INT >= 29) {
                paint.setBlendMode(null);
            } else {
                paint.setXfermode(null);
            }
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public C416280GTy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayerType(1, null);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-16777216);
        this.LLILLJJLI = paint2;
        this.LLILLL = new int[]{ColorProtector.parseColor("#FE2C55"), ColorProtector.parseColor("#FF3353"), ColorProtector.parseColor("#FF4B80")};
        this.LLILZ = new float[]{0.0f, 0.6f, 1.0f};
        this.LLILZIL = new int[]{-16777216, ColorProtector.parseColor("#9A000000"), 0};
        this.LLILZLL = new float[]{0.0f, 0.5f, 1.0f};
    }
}
