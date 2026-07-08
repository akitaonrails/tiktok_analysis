package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Efo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370500Efo extends View {
    public static final float[] LLILZLL = {0.0f, 1.0f};
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Path LLILLL;
    public final RectF LLILZ;
    public final RectF LLILZIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int iRgb;
        int iIntValue;
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            int iSave = canvas.save();
            this.LLILZIL.set(0.0f, 0.0f, getWidth(), getHeight());
            this.LLILLL.reset();
            float width = (getWidth() * 20.0f) / 210.0f;
            this.LLILLL.addRoundRect(this.LLILZIL, new float[]{width, width, width, width, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            canvas.clipPath(this.LLILLL);
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int iRgb2 = Color.rgb(58, 58, 58);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, getContext());
                if (numLIZJ != null) {
                    iRgb2 = numLIZJ.intValue();
                }
                iRgb = (iRgb2 & 16777215) | (C13LZ.LJ(217, 0, 255) << 24);
            } else {
                iRgb = Color.rgb(245, 245, 245);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, getContext());
                if (numLIZJ2 != null) {
                    iRgb = numLIZJ2.intValue();
                }
            }
            this.LL.setShader(new LinearGradient(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, getHeight(), new int[]{iRgb, (16777215 & iRgb) | (C13LZ.LJ(0, 0, 255) << 24)}, LLILZLL, Shader.TileMode.CLAMP));
            canvas.drawRect(this.LLILZIL, this.LL);
            if (z) {
                iIntValue = Color.rgb(58, 58, 58);
            } else {
                iIntValue = -1;
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1d, getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            }
            this.LLILLJJLI.setColor(iIntValue);
            LIZ(canvas, 14.0f, 20.0f, 38.0f, 38.0f, 12.0f);
            LIZ(canvas, 62.0f, 20.0f, 38.0f, 38.0f, 12.0f);
            LIZ(canvas, 14.0f, 68.0f, 38.0f, 38.0f, 12.0f);
            LIZ(canvas, 62.0f, 68.0f, 38.0f, 38.0f, 12.0f);
            LIZ(canvas, 110.0f, 20.0f, 86.0f, 86.0f, 14.0f);
            canvas.restoreToCount(iSave);
        }
    }

    public C370500Efo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint(1);
        this.LLILLJJLI = new Paint(1);
        this.LLILLL = new Path();
        this.LLILZ = new RectF();
        this.LLILZIL = new RectF();
    }

    public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        float width = getWidth() / 210.0f;
        float height = getHeight() / 160.0f;
        this.LLILZ.set(f * width, f2 * height, (f + f3) * width, (f2 + f4) * height);
        float fMin = f5 * Math.min(width, height);
        canvas.drawRoundRect(this.LLILZ, fMin, fMin, this.LLILLJJLI);
    }
}
