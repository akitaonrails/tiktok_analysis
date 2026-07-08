package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421650Gg7 extends FrameLayout {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final RectF LL;
    public final Function0<Unit> LLILLJJLI;
    public final Paint LLILLL;
    public final Path LLILZ;
    public final RectF LLILZIL;
    public final C1295960jpS LLILZLL;
    public boolean LLIZ;

    public final void LIZIZ() {
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLILZIL.set(this.LL);
        float f = -fLIZIZ;
        this.LLILZIL.inset(f, f);
        this.LLILZIL.intersect(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLILZLL.cancelAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        animate().alpha(1.0f).setDuration(300L).withEndAction(new ARunnableS106S0100000_6((Object) this, 197)).start();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void LIZ(Function0<Unit> function0) {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        this.LLILZLL.cancelAnimation();
        animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS75S0200000_6((Object) this, (Object) function0, 94)).start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LIZIZ();
        this.LLILZ.reset();
        this.LLILZ.setFillType(Path.FillType.EVEN_ODD);
        this.LLILZ.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        this.LLILZ.addRoundRect(this.LLILZIL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Path.Direction.CW);
        canvas.drawPath(this.LLILZ, this.LLILLL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !this.LLIZ) {
            if (this.LLILZIL.contains(motionEvent.getX(), motionEvent.getY())) {
                LIZ(new AwS550S0100000_6(this, 1160));
            } else {
                LIZ(null);
            }
            super.performClick();
        }
        return true;
    }

    public C421650Gg7(Context context, RectF rectF, AwS550S0100000_6 awS550S0100000_6) {
        super(context);
        this.LL = rectF;
        this.LLILLJJLI = awS550S0100000_6;
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(153, 0, 0, 0));
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        this.LLILZ = new Path();
        this.LLILZIL = new RectF();
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setImportantForAccessibility(2);
        c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_only_tt_tap);
        c1295960jpS.setRepeatCount(-1);
        this.LLILZLL = c1295960jpS;
        setWillNotDraw(false);
        setImportantForAccessibility(2);
        setClickable(true);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        addView(c1295960jpS);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LIZIZ();
        float fMax = (Math.max(this.LL.width(), this.LL.height()) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54))) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(210.0f)));
        RectF rectF = this.LL;
        float f = rectF.right - (0.34285715f * fMax);
        float f2 = rectF.bottom - (0.5f * fMax);
        this.LLILZLL.layout((int) f, (int) f2, (int) (f + fMax), (int) (f2 + fMax));
    }
}
