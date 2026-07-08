package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0xsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835960xsQ extends View {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final C1836130xsh<Float> LLILZ;
    public final C1836130xsh<Float> LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final boolean LLIZLLLIL;
    public final float LLJ;
    public final int LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public RectF LLJILJILJ;
    public RectF LLJILLL;
    public RectF LLJJ;
    public RectF LLJJI;
    public Function1<? super Float, Unit> LLJJIII;
    public Function0<Unit> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public long LLJJJ;
    public final C1836130xsh<Float> LLJJJIL;
    public final C1836130xsh<RectF> LLJJJJ;
    public final AwS571S0100000_27 LLJJJJJIL;
    public final AwS571S0100000_27 LLJJJJLIIL;
    public final AwS571S0100000_27 LLJJL;
    public final AwS606S0100000_27 LLJJLIIIJLLLLLLLZ;
    public final float[] LLJL;
    public final float[] LLJLIL;
    public final float[] LLJLILLLLZIIL;
    public final Path LLJLL;
    public final Path LLJLLIL;
    public final Path LLJLLL;
    public final int LLJZ;
    public final TuxIconDrawable LLJZIJLIL;
    public final TuxIconDrawable LLL;
    public boolean LLLF;
    public final C1836130xsh LLLFF;
    public final float LLLFFI;
    public float LLLFZ;
    public Function0<Unit> LLLI;
    public float LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public float LLLIILIL;
    public float LLLIL;
    public final int LLLILZ;
    public final int LLLILZJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1835960xsQ.class, "handleCount", "getHandleCount()I", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getHandleCount() {
        C1836130xsh c1836130xsh = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return ((Number) c1836130xsh.LIZIZ).intValue();
    }

    public final float getCurrentPercentage() {
        return this.LLLII;
    }

    public final boolean getDragLeft() {
        return this.LLLIIIIL;
    }

    public final boolean getDragPlayHead() {
        return this.LLLIIL;
    }

    public final boolean getDragRight() {
        return this.LLLIIIL;
    }

    public final C1836130xsh<Float> getLeftPosition() {
        return this.LLILZ;
    }

    public final float getLeftX() {
        return this.LLLIILIL;
    }

    public final C1836130xsh<Float> getPlayHeadCenterX() {
        return this.LLJJJIL;
    }

    public final Function0<Unit> getPlayHeadToLeft() {
        return this.LLJJJJJIL;
    }

    public final Function0<Unit> getPlayHeadToRight() {
        return this.LLJJJJLIIL;
    }

    public final Function0<Unit> getPlayHeadToStart() {
        return this.LLJJL;
    }

    public final float getPlayHeadWidth$live_release() {
        return this.LLJIJIL;
    }

    public final float getRectWidth() {
        return this.LLJ;
    }

    public final C1836130xsh<Float> getRightPosition() {
        return this.LLILZIL;
    }

    public final float getRightX() {
        return this.LLLIL;
    }

    public final float getScrollWidth() {
        return this.LLLFFI;
    }

    public final Function0<Unit> getSelectChangeCallback() {
        return this.LLLI;
    }

    public final boolean getStart() {
        return this.LLLF;
    }

    public final float getSteppingSize() {
        return this.LLLFZ;
    }

    public final float getVerticalHandleHeight() {
        return this.LLJILJIL;
    }

    public final Function1<Float, Boolean> getWithinRange() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C1835960xsQ(Context context) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        super(context, null, 0);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        paint2.setColor(iIntValue2);
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint();
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        paint3.setColor(iIntValue3);
        paint3.setAntiAlias(true);
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.e6, getContext());
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        paint3.setShadowLayer(fLIZIZ, 0.0f, 0.0f, iIntValue4);
        this.LLILLL = paint3;
        C1836130xsh<Float> c1836130xsh = new C1836130xsh<>(Float.valueOf(0.0f));
        this.LLILZ = c1836130xsh;
        C1836130xsh<Float> c1836130xsh2 = new C1836130xsh<>(Float.valueOf(100.0f));
        this.LLILZIL = c1836130xsh2;
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLIZLLLIL = C1835950xsP.LIZIZ(getContext());
        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJ = fLIZIZ2;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        this.LLJI = iLIZIZ;
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJILJILJ = new RectF();
        this.LLJILLL = new RectF();
        this.LLJJ = new RectF();
        this.LLJJI = new RectF();
        this.LLJJJ = -1L;
        C1836130xsh<Float> c1836130xsh3 = new C1836130xsh<>(Float.valueOf(0.0f));
        this.LLJJJIL = c1836130xsh3;
        this.LLJJJJ = new C1836130xsh<>(new RectF(0.0f, 0.0f, 0.0f, 0.0f));
        this.LLJJJJJIL = new AwS571S0100000_27(this, 1282);
        this.LLJJJJLIIL = new AwS571S0100000_27(this, 1283);
        this.LLJJL = new AwS571S0100000_27(this, 1284);
        this.LLJJLIIIJLLLLLLLZ = new AwS606S0100000_27(this, 501);
        float fLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        float fLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJL = new float[]{fLIZIZ4, fLIZIZ4, fLIZIZ4, fLIZIZ4, fLIZIZ4, fLIZIZ4, fLIZIZ4, fLIZIZ4};
        this.LLJLIL = new float[]{fLIZIZ3, fLIZIZ3, 0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ3, fLIZIZ3};
        this.LLJLILLLLZIIL = new float[]{0.0f, 0.0f, fLIZIZ3, fLIZIZ3, fLIZIZ3, fLIZIZ3, 0.0f, 0.0f};
        this.LLJLL = new Path();
        this.LLJLLIL = new Path();
        this.LLJLLL = new Path();
        this.LLJZ = 10;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZ = R.raw.icon_chevron_left_obtuse_fill_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        this.LLJZIJLIL = c419910GdJ.LIZ(getContext());
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZJ = iLIZIZ;
        c419910GdJ2.LIZIZ = iLIZIZ;
        c419910GdJ2.LIZ = R.raw.icon_chevron_right_obtuse_fill_ltr;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.zi);
        this.LLL = c419910GdJ2.LIZ(getContext());
        this.LLLFF = new C1836130xsh(0);
        this.LLLFFI = (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(32.0f))) - (fLIZIZ2 * 2);
        c1836130xsh.LIZIZ().add(new AwS606S0100000_27(this, 498));
        c1836130xsh2.LIZIZ().add(new AwS606S0100000_27(this, 499));
        c1836130xsh3.LIZIZ().add(new AwS606S0100000_27(this, 500));
        this.LLLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLLILZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    }

    public final float LIZ(Float f) {
        float fFloatValue;
        float f2;
        float f3;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = this.LLJJJIL.LIZIZ.floatValue();
        }
        if (this.LLIZLLLIL) {
            f3 = fFloatValue - this.LLJ;
            f2 = this.LLLFFI;
        } else {
            f2 = this.LLLFFI;
            f3 = (f2 - fFloatValue) + this.LLJ;
        }
        return f3 / f2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLJLL.reset();
        this.LLJLL.addRoundRect(this.LLJILJILJ, this.LLJLIL, Path.Direction.CW);
        canvas.drawPath(this.LLJLL, this.LL);
        this.LLJLLIL.reset();
        this.LLJLLIL.addRoundRect(this.LLJILLL, this.LLJLILLLLZIIL, Path.Direction.CW);
        canvas.drawPath(this.LLJLLIL, this.LL);
        canvas.drawRect(this.LLJJ, this.LL);
        canvas.drawRect(this.LLJJI, this.LL);
        this.LLJLLL.reset();
        this.LLJLLL.addRoundRect(this.LLJJJJ.LIZIZ, this.LLJL, Path.Direction.CW);
        canvas.drawPath(this.LLJLLL, this.LLILLL);
        LIZLLL(this.LLJILJILJ, (Drawable) C1835950xsP.LIZ(getContext(), this.LLJZIJLIL, this.LLL), true);
        LIZLLL(this.LLJILLL, (Drawable) C1835950xsP.LIZ(getContext(), this.LLL, this.LLJZIJLIL), false);
        if (this.LLIZLLLIL) {
            this.LLJZIJLIL.draw(canvas);
            this.LLL.draw(canvas);
        } else {
            LIZIZ(this, canvas, this.LLJILJILJ, false);
            LIZIZ(this, canvas, this.LLJILLL, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1835960xsQ.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setClipped$live_release(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setCurrentPercentage(float f) {
        this.LLLII = f;
    }

    public final void setDragLeft(boolean z) {
        this.LLLIIIIL = z;
    }

    public final void setDragPlayHead(boolean z) {
        this.LLLIIL = z;
    }

    public final void setDragRight(boolean z) {
        this.LLLIIIL = z;
    }

    public final void setHandleCount(int i) {
        C1836130xsh c1836130xsh = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        c1836130xsh.LIZJ(Integer.valueOf(i));
    }

    public final void setInClipMode$live_release(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setLeftX(float f) {
        this.LLLIILIL = f;
    }

    public final void setRightX(float f) {
        this.LLLIL = f;
    }

    public final void setScrolling(boolean z) {
        this.LLLIIII = z;
    }

    public final void setSelectChangeCallback(Function0<Unit> function0) {
        this.LLLI = function0;
    }

    public final void setStart(boolean z) {
        this.LLLF = z;
    }

    public final void setSteppingSize(float f) {
        this.LLLFZ = f;
    }

    public final void LIZLLL(RectF rectF, Drawable drawable, boolean z) {
        float f;
        float f2;
        float f3 = rectF.top;
        float f4 = 2;
        float f5 = f3 + ((rectF.bottom - f3) / f4);
        if (z) {
            f2 = rectF.left + this.LLJILJIL;
            f = (rectF.right - f2) / f4;
        } else {
            float f6 = rectF.right - this.LLJILJIL;
            f = rectF.left;
            f2 = (f6 - f) / f4;
        }
        float f7 = f2 + f;
        if (drawable != null) {
            float f8 = this.LLJI / 2;
            drawable.setBounds((int) (f7 - f8), (int) (f5 - f8), (int) (f7 + f8), (int) (f5 + f8));
        }
    }

    public static void LIZIZ(C1835960xsQ c1835960xsQ, Canvas canvas, RectF rectF, boolean z) {
        float f;
        int i = c1835960xsQ.LLLILZ;
        int i2 = c1835960xsQ.LLLILZJ;
        float fWidth = (rectF.width() / 2.0f) - (i / 2.0f);
        float fHeight = (rectF.height() / 2.0f) - (i2 / 2.0f);
        float f2 = rectF.left + fWidth;
        float f3 = rectF.top + fHeight;
        float f4 = rectF.right - fWidth;
        float f5 = rectF.bottom - fHeight;
        float f6 = (f3 + f5) / 2.0f;
        float f7 = ((f5 - f3) * 1.0f) / 2.0f;
        if (z) {
            f = f4;
        } else {
            f = f2;
            f2 = f4;
        }
        canvas.drawLine(f2, f6 - f7, f, f6, c1835960xsQ.LLILLJJLI);
        canvas.drawLine(f, f6, f2, f7 + f6, c1835960xsQ.LLILLJJLI);
    }

    public final boolean LIZJ(RectF rectF, float f, float f2, String str) {
        float fMax = rectF.left;
        float f3 = rectF.right;
        float f4 = rectF.top;
        float f5 = rectF.bottom;
        int iHashCode = str.hashCode();
        if (iHashCode != 3317767) {
            if (iHashCode != 108511772) {
                if (iHashCode == 1878397748 && str.equals("playHead")) {
                    float f6 = 2;
                    float f7 = fMax + ((f3 - fMax) / f6);
                    float f8 = this.LLIZ / f6;
                    float f9 = f7 - f8;
                    f3 = f8 + f7;
                    fMax = f9;
                }
            } else if (str.equals("right")) {
                float f10 = this.LLJILJIL;
                f4 -= f10;
                f5 += f10;
                f3 = fMax + this.LLILZLL;
            }
        } else if (str.equals("left")) {
            float f11 = this.LLJILJIL;
            f4 -= f11;
            f5 += f11;
            fMax = Math.max(0.0f, f3 - this.LLILZLL);
        }
        if (fMax <= f && f <= f3 && f4 <= f2 && f2 <= f5) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, i, i2)));
    }
}
