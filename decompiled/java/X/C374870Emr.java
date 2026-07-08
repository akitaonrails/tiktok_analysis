package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Emr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374870Emr extends View {
    public final int[] LL;
    public final float[] LLILLJJLI;
    public final Paint LLILLL;
    public Bitmap LLILZ;
    public Canvas LLILZIL;
    public final RectF LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILZLL.set(0.0f, 0.0f, getWidth(), getHeight());
        int iSaveLayer = canvas.saveLayer(this.LLILZLL, null);
        canvas.drawRect(this.LLILZLL, this.LLILLL);
        Bitmap bitmap = this.LLILZ;
        if (bitmap != null) {
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            paint.setXfermode(null);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public C374870Emr(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super(context, attributeSet, 0);
        int[] iArr = new int[4];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a3r, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a3s, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a3t, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        iArr[2] = iIntValue3;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a3u, context);
        iArr[3] = numLIZJ4 != null ? numLIZJ4.intValue() : 0;
        this.LL = iArr;
        this.LLILLJJLI = new float[]{0.0f, 0.6f, 0.7f, 1.0f};
        this.LLILLL = new Paint(1);
        this.LLILZLL = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.LL, this.LLILLJJLI, Shader.TileMode.CLAMP));
        Bitmap bitmap = this.LLILZ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.LLILZ = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            this.LLILZIL = new Canvas(bitmapCreateBitmap);
        }
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        Canvas canvas = this.LLILZIL;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Canvas canvas2 = this.LLILZIL;
        if (canvas2 != null) {
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }
}
