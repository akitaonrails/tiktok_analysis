package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FRQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRQ extends FrameLayout {
    public final C427660Gpo LL;
    public C0FRS LLILLJJLI;
    public final Paint LLILLL;

    public final void LIZ() {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i = C0FRR.LIZ[this.LLILLJJLI.ordinal()];
        if (i == 1) {
            this.LLILLL.setShader(null);
            this.LLILLL.setColor(0);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new C1954807lC();
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nn, getContext());
            int iIntValue = numLIZJ != null ? numLIZJ.intValue() : -59548;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nm, getContext());
            int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : -1231723;
            this.LLILLL.setAlpha(255);
            this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, width, height, iIntValue, iIntValue2, Shader.TileMode.MIRROR));
            return;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.as4, getContext());
        int iIntValue3 = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.as5, getContext());
        int iIntValue4 = numLIZJ4 != null ? numLIZJ4.intValue() : 0;
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.as6, getContext());
        int iIntValue5 = numLIZJ5 != null ? numLIZJ5.intValue() : 0;
        this.LLILLL.setAlpha(255);
        this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, width, height, new int[]{iIntValue3, iIntValue4, iIntValue5}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final C427660Gpo getAvatar() {
        return this.LL;
    }

    public C0FRQ(Context context) {
        super(context);
        C427660Gpo c427660Gpo = new C427660Gpo(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        layoutParams.gravity = 17;
        C786410Ut5.H6(c427660Gpo, layoutParams);
        this.LL = c427660Gpo;
        this.LLILLJJLI = C0FRS.NONE;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f))));
        this.LLILLL = paint;
        setClipChildren(false);
        addView(c427660Gpo);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        if (this.LLILLJJLI != C0FRS.NONE) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() - this.LLILLL.getStrokeWidth()) / 2.0f, this.LLILLL);
        }
    }

    public final void LIZIZ(UrlModel urlModel, C0FRS c0frs) {
        int i;
        this.LLILLJJLI = c0frs;
        if (c0frs != C0FRS.NONE) {
            i = 20;
        } else {
            i = 24;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        C427660Gpo c427660Gpo = this.LL;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c427660Gpo.getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = iLIZIZ;
        C786410Ut5.H6(c427660Gpo, layoutParams);
        C427660Gpo.LJIIJJI(this.LL, C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, null, 1022);
        LIZ();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
