package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0GXX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXX extends FrameLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final int LLILLL;
    public Integer LLILZ;
    public boolean LLILZIL;
    public final float LLILZLL;
    public final C01GW LLIZ;

    public final void LIZ() {
        this.LLILZIL = true;
        Integer num = this.LLILZ;
        if ((num == null || num.intValue() != R.raw.icon_calendar_star_fill) && getContext() != null) {
            getNotificationIcon().setIconRes(R.raw.icon_calendar_star_fill);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZ = R.raw.icon_calendar_star_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            getNotificationIcon().setTuxIcon(c419910GdJ);
            if (this.LLILZ == null) {
                addView(getNotificationIcon());
            }
            this.LLILZ = Integer.valueOf(R.raw.icon_calendar_star_fill);
        }
    }

    private final TuxIconView getNotificationIcon() {
        return (TuxIconView) this.LLIZ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLILZIL && getChildCount() != 0) {
            View viewLIZ = C460180I2u.LIZ(0, this);
            float left = (viewLIZ.getLeft() + viewLIZ.getRight()) / 2.0f;
            float top = (viewLIZ.getTop() + viewLIZ.getBottom()) / 2.0f;
            float f = this.LLILZLL / 2.0f;
            float f2 = (this.LLILLL / 2.0f) + f;
            float f3 = f2 - f;
            if (this.LLILLJJLI.getShader() == null) {
                this.LLILLJJLI.setShader(new LinearGradient(left - f3, top - f3, left + f3, top + f3, -59548, -1231723, Shader.TileMode.CLAMP));
            }
            canvas.drawCircle(left, top, f3, this.LLILLJJLI);
            canvas.drawCircle(left, top, f2, this.LL);
        }
        super.dispatchDraw(canvas);
    }

    public C0GXX(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Float fValueOf = Float.valueOf(2.0f);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(fValueOf));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setColor(iIntValue);
        this.LL = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = paint2;
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        this.LLILZLL = C418440Gaw.LIZIZ(fValueOf);
        this.LLIZ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 52));
    }
}
