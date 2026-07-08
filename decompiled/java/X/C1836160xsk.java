package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.settings.LiveHostReplayUISettings;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: renamed from: X.0xsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836160xsk extends View {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJL;
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final TextPaint LLILLL;
    public final Paint LLILZ;
    public final C1836130xsh<Float> LLILZIL;
    public final C1836130xsh<Float> LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final int LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final C1836130xsh<Integer> LLJILLL;
    public C1836130xsh<C1836200xso> LLJJ;
    public RectF LLJJI;
    public RectF LLJJIII;
    public RectF LLJJIJI;
    public RectF LLJJIJIIJIL;
    public final RectF LLJJIJIL;
    public RectF LLJJJ;
    public RectF LLJJJIL;
    public Function1<? super Float, Unit> LLJJJJ;
    public Function1<? super Float, Unit> LLJJJJJIL;
    public Function2<? super Float, ? super Float, Integer> LLJJJJLIIL;
    public final C1836130xsh<Float> LLJJL;
    public final C1836130xsh<RectF> LLJJLIIIJLLLLLLLZ;
    public final AwS571S0100000_27 LLJL;
    public final AwS571S0100000_27 LLJLIL;
    public final AwS571S0100000_27 LLJLILLLLZIIL;
    public final AwS606S0100000_27 LLJLL;
    public final float[] LLJLLIL;
    public final float[] LLJLLL;
    public final float[] LLJZ;
    public final float[] LLJZIJLIL;
    public final Path LLL;
    public final Path LLLF;
    public final Path LLLFF;
    public final Path LLLFFI;
    public final int LLLFZ;
    public final int LLLI;
    public final int LLLII;
    public final int LLLIIII;
    public final int LLLIIIIL;
    public final TuxIconDrawable LLLIIIL;
    public final TuxIconDrawable LLLIIL;
    public boolean LLLIILIL;
    public final C1836130xsh LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public float LLLJ;
    public float LLLJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1836160xsk.class, "handleCount", "getHandleCount()I", 0);
        C13LE.LIZ.getClass();
        LLLJL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final Function2<Float, Float, Integer> getCalculateSelectedTimeSpan() {
        Function2 function2 = this.LLJJJJLIIL;
        if (function2 != null) {
            return function2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getHandleCount() {
        C1836130xsh c1836130xsh = this.LLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJL;
        return ((Number) c1836130xsh.LIZIZ).intValue();
    }

    public final Function1<Float, Unit> getPlayOffset() {
        Function1 function1 = this.LLJJJJ;
        if (function1 != null) {
            return function1;
        }
        return null;
    }

    public final Function1<Float, Unit> getPlayerPause() {
        Function1 function1 = this.LLJJJJJIL;
        if (function1 != null) {
            return function1;
        }
        return null;
    }

    public final boolean getDragLeft() {
        return this.LLLILZJ;
    }

    public final boolean getDragPlayHead() {
        return this.LLLIZZ;
    }

    public final boolean getDragRight() {
        return this.LLLILZLLLI;
    }

    public final float getHandleVerticalExtraLength() {
        return this.LLJILJILJ;
    }

    public final C1836130xsh<Float> getLeftPosition() {
        return this.LLILZIL;
    }

    public final float getLeftX() {
        return this.LLLJ;
    }

    public final C1836130xsh<Float> getPlayHeadCenterX() {
        return this.LLJJL;
    }

    public final Function0<Unit> getPlayHeadToLeft() {
        return this.LLJL;
    }

    public final Function0<Unit> getPlayHeadToRight() {
        return this.LLJLIL;
    }

    public final Function0<Unit> getPlayHeadToStart() {
        return this.LLJLILLLLZIIL;
    }

    public final float getRectWidth() {
        return this.LLJ;
    }

    public final C1836130xsh<Float> getRightPosition() {
        return this.LLILZLL;
    }

    public final float getRightX() {
        return this.LLLJIL;
    }

    public final boolean getStart() {
        return this.LLLIILIL;
    }

    public final float getVerticalHandleHeight() {
        return this.LLJILJIL;
    }

    public final Function1<Float, Boolean> getWithinRange() {
        return this.LLJLL;
    }

    public final void LIZIZ(float f) {
        C1836200xso c1836200xso = this.LLJJ.LIZIZ;
        C1836200xso c1836200xso2 = c1836200xso;
        float f2 = (c1836200xso2.LIZ - c1836200xso2.LJFF) - c1836200xso2.LJI;
        int i = c1836200xso.LJIIIIZZ;
        Float fValueOf = Float.valueOf(this.LLILZLL.LIZIZ.floatValue() - c1836200xso2.LJFF);
        Float fValueOf2 = Float.valueOf((c1836200xso2.LIZ - this.LLILZIL.LIZIZ.floatValue()) - c1836200xso2.LJI);
        if (i != 0) {
            fValueOf = fValueOf2;
        }
        float fFloatValue = f2 - fValueOf.floatValue();
        if (f > fFloatValue) {
            f = fFloatValue;
        }
        int i2 = this.LLJJ.LIZIZ.LJIIIIZZ;
        Float fValueOf3 = Float.valueOf(f);
        Float fValueOf4 = Float.valueOf(-f);
        if (i2 != 0) {
            fValueOf3 = fValueOf4;
        }
        float fFloatValue2 = fValueOf3.floatValue();
        C1836130xsh<Float> c1836130xsh = this.LLILZIL;
        c1836130xsh.LIZJ(Float.valueOf(c1836130xsh.LIZIZ.floatValue() + fFloatValue2));
        C1836130xsh<Float> c1836130xsh2 = this.LLILZLL;
        c1836130xsh2.LIZJ(Float.valueOf(c1836130xsh2.LIZIZ.floatValue() + fFloatValue2));
        C1836130xsh<Float> c1836130xsh3 = this.LLJJL;
        c1836130xsh3.LIZJ(Float.valueOf(c1836130xsh3.LIZIZ.floatValue() + fFloatValue2));
        invalidate();
    }

    public final void LIZJ(float f) {
        C1836130xsh<Float> c1836130xsh = this.LLJJL;
        float fFloatValue = c1836130xsh.LIZIZ.floatValue();
        int i = this.LLJJ.LIZIZ.LJIIIIZZ;
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(-f);
        if (i != 0) {
            fValueOf = fValueOf2;
        }
        c1836130xsh.LIZJ(Float.valueOf(fFloatValue + fValueOf.floatValue()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.LLLFFI;
        path.reset();
        path.addRoundRect(this.LLJJIJIL, this.LLJZ, Path.Direction.CW);
        canvas.drawPath(path, this.LLILZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJILLL.LIZIZ.intValue());
        sbLIZ.append('s');
        canvas.drawText(C2188811AlT.LIZIZ(sbLIZ), this.LLJJIJIL.centerX(), this.LLJJIJIL.centerY() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), this.LLILLL);
        this.LLL.reset();
        this.LLL.addRoundRect(this.LLJJI, this.LLJLLL, Path.Direction.CW);
        canvas.drawPath(this.LLL, this.LL);
        this.LLLF.reset();
        this.LLLF.addRoundRect(this.LLJJIII, this.LLJZIJLIL, Path.Direction.CW);
        canvas.drawPath(this.LLLF, this.LL);
        canvas.drawRect(this.LLJJIJI, this.LL);
        canvas.drawRect(this.LLJJIJIIJIL, this.LL);
        this.LLLFF.reset();
        this.LLLFF.addRoundRect(this.LLJJLIIIJLLLLLLLZ.LIZIZ, this.LLJLLIL, Path.Direction.CW);
        canvas.drawPath(this.LLLFF, this.LLILLJJLI);
        LIZLLL(this.LLJJI, (Drawable) C1835950xsP.LIZ(getContext(), this.LLLIIIL, this.LLLIIL), true);
        LIZLLL(this.LLJJIII, (Drawable) C1835950xsP.LIZ(getContext(), this.LLLIIL, this.LLLIIIL), false);
        this.LLLIIIL.draw(canvas);
        this.LLLIIL.draw(canvas);
        canvas.drawRect(this.LLJJJ, this.LLILZ);
        canvas.drawRect(this.LLJJJIL, this.LLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1836160xsk.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCalculateSelectedTimeSpan(Function2<? super Float, ? super Float, Integer> function2) {
        this.LLJJJJLIIL = function2;
    }

    public final void setDragLeft(boolean z) {
        this.LLLILZJ = z;
    }

    public final void setDragPlayHead(boolean z) {
        this.LLLIZZ = z;
    }

    public final void setDragRight(boolean z) {
        this.LLLILZLLLI = z;
    }

    public final void setHandleCount(int i) {
        C1836130xsh c1836130xsh = this.LLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJL;
        c1836130xsh.LIZJ(Integer.valueOf(i));
    }

    public final void setLeftX(float f) {
        this.LLLJ = f;
    }

    public final void setPlayOffset(Function1<? super Float, Unit> function1) {
        this.LLJJJJ = function1;
    }

    public final void setPlayerPause(Function1<? super Float, Unit> function1) {
        this.LLJJJJJIL = function1;
    }

    public final void setRightX(float f) {
        this.LLLJIL = f;
    }

    public final void setScrolling(boolean z) {
        this.LLLILZ = z;
    }

    public final void setStart(boolean z) {
        this.LLLIILIL = z;
    }

    public C1836160xsk(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int i;
        int i2;
        Integer numValueOf;
        Integer numValueOf2;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        this.LL = paint;
        Paint paint2 = new Paint();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        paint2.setColor(iIntValue2);
        paint2.setAntiAlias(true);
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.e6, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        paint2.setShadowLayer(fLIZIZ, 0.0f, 0.0f, iIntValue3);
        this.LLILLJJLI = paint2;
        TextPaint textPaint = new TextPaint();
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ef, context);
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        textPaint.setColor(iIntValue4);
        textPaint.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.LLILLL = textPaint;
        Paint paint3 = new Paint();
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.oh, context);
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        } else {
            iIntValue5 = 0;
        }
        paint3.setColor(iIntValue5);
        paint3.setAlpha(50);
        this.LLILZ = paint3;
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(507);
        C1836130xsh<Float> c1836130xsh = new C1836130xsh<>(Float.valueOf(0.0f));
        this.LLILZIL = c1836130xsh;
        C1836130xsh<Float> c1836130xsh2 = new C1836130xsh<>(Float.valueOf(100.0f));
        this.LLILZLL = c1836130xsh2;
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LiveHostReplayUISettings.getValue().handleHotspotWidth)));
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LiveHostReplayUISettings.getValue().playHeadHotspotWidth)));
        LiveHostReplayUISettings liveHostReplayUISettings = LiveHostReplayUISettings.INSTANCE;
        if (liveHostReplayUISettings.getEnable()) {
            i = 16;
        } else {
            i = 14;
        }
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (liveHostReplayUISettings.getEnable()) {
            i2 = 20;
        } else {
            i2 = 12;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
        this.LLJI = iLIZIZ;
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        C1836130xsh<Integer> c1836130xshLIZ = C1836280xsw.LIZ(0, c1836130xsh, c1836130xsh2, new AwS668S0100000_19(this, 53));
        this.LLJILLL = c1836130xshLIZ;
        this.LLJJ = new C1836130xsh<>(C1836310xsz.LIZ);
        this.LLJJI = new RectF();
        this.LLJJIII = new RectF();
        this.LLJJIJI = new RectF();
        this.LLJJIJIIJIL = new RectF();
        this.LLJJIJIL = new RectF();
        this.LLJJJ = new RectF();
        this.LLJJJIL = new RectF();
        C1836130xsh<Float> c1836130xsh3 = new C1836130xsh<>(Float.valueOf(0.0f));
        this.LLJJL = c1836130xsh3;
        this.LLJJLIIIJLLLLLLLZ = new C1836130xsh<>(new RectF(0.0f, 0.0f, 0.0f, 0.0f));
        this.LLJL = new AwS571S0100000_27(this, 1336);
        this.LLJLIL = new AwS571S0100000_27(this, 1337);
        this.LLJLILLLLZIIL = new AwS571S0100000_27(this, 1338);
        this.LLJLL = new AwS606S0100000_27(this, 597);
        float fFloatValue = ((Number) aFwS236S0000000_6.invoke(Float.valueOf(6.0f))).floatValue();
        float fFloatValue2 = ((Number) aFwS236S0000000_6.invoke(Float.valueOf(4.0f))).floatValue();
        float fFloatValue3 = ((Number) aFwS236S0000000_6.invoke(Float.valueOf(2.0f))).floatValue();
        this.LLJLLIL = new float[]{fFloatValue2, fFloatValue2, fFloatValue2, fFloatValue2, fFloatValue2, fFloatValue2, fFloatValue2, fFloatValue2};
        this.LLJLLL = new float[]{fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, fFloatValue};
        this.LLJZ = new float[]{fFloatValue3, fFloatValue3, fFloatValue3, fFloatValue3, fFloatValue3, fFloatValue3, fFloatValue3, fFloatValue3};
        this.LLJZIJLIL = new float[]{0.0f, 0.0f, fFloatValue, fFloatValue, fFloatValue, fFloatValue, 0.0f, 0.0f};
        this.LLL = new Path();
        this.LLLF = new Path();
        this.LLLFF = new Path();
        this.LLLFFI = new Path();
        this.LLLFZ = 20;
        this.LLLI = 5;
        this.LLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        this.LLLIIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
        this.LLLIIIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZ = R.raw.icon_chevron_left_obtuse_fill_ltr;
        if (liveHostReplayUISettings.getEnable()) {
            numValueOf = Integer.valueOf(R.attr.a1j);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1p);
        }
        c419910GdJ.LJ = numValueOf;
        this.LLLIIIL = c419910GdJ.LIZ(context);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZJ = iLIZIZ;
        c419910GdJ2.LIZIZ = iLIZIZ;
        c419910GdJ2.LIZ = R.raw.icon_chevron_right_obtuse_fill_ltr;
        if (liveHostReplayUISettings.getEnable()) {
            numValueOf2 = Integer.valueOf(R.attr.a1j);
        } else {
            numValueOf2 = Integer.valueOf(R.attr.a1p);
        }
        c419910GdJ2.LJ = numValueOf2;
        this.LLLIIL = c419910GdJ2.LIZ(context);
        this.LLLIL = new C1836130xsh(0);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 1339);
        c1836130xsh.LIZIZ().add(new AwS393S0200000_27(this, awS571S0100000_27, 139));
        c1836130xsh2.LIZIZ().add(new AwS393S0200000_27(this, awS571S0100000_27, 140));
        c1836130xsh3.LIZIZ().add(new AwS606S0100000_27(this, 595));
        c1836130xshLIZ.LIZIZ().add(new AwS606S0100000_27(this, 596));
    }

    public final boolean LJ(RectF rectF, float f) {
        if (Math.abs(rectF.left - f) > this.LLLFZ && Math.abs(rectF.right - f) > this.LLLFZ) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(RectF rectF, Drawable drawable, boolean z) {
        float f;
        int i;
        float f2;
        float f3;
        float f4 = rectF.top;
        float f5 = 2;
        float f6 = f4 + ((rectF.bottom - f4) / f5);
        if (LiveHostReplayUISettings.INSTANCE.getEnable()) {
            if (z) {
                f3 = rectF.left + this.LLJILJIL;
                f2 = (rectF.right - f3) / f5;
            } else {
                float f7 = rectF.right - this.LLJILJIL;
                f2 = rectF.left;
                f3 = (f7 - f2) / f5;
            }
            float f8 = f3 + f2;
            if (drawable != null) {
                float f9 = this.LLJI / 2;
                drawable.setBounds((int) (f8 - f9), (int) (f6 - f9), (int) (f8 + f9), (int) (f6 + f9));
                return;
            }
            return;
        }
        if (drawable == null) {
            return;
        }
        if (z) {
            f = rectF.left + f5;
        } else {
            f = (rectF.right - f5) - this.LLJI;
        }
        int i2 = (int) f;
        int i3 = this.LLJI;
        float f10 = i3 / 2;
        int i4 = (int) (f6 - f10);
        if (z) {
            i = (int) (rectF.left + f5 + i3);
        } else {
            i = ((int) rectF.right) - 2;
        }
        drawable.setBounds(i2, i4, i, (int) (f6 + f10));
    }

    public final boolean LIZ(RectF rectF, float f, float f2, String str) {
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
                    float f8 = this.LLIZLLLIL / f6;
                    float f9 = f7 - f8;
                    f3 = f8 + f7;
                    fMax = f9;
                }
            } else if (str.equals("right")) {
                float f10 = this.LLJILJIL;
                f4 -= f10;
                f5 += f10;
                f3 = fMax + this.LLIZ;
            }
        } else if (str.equals("left")) {
            float f11 = this.LLJILJIL;
            f4 -= f11;
            f5 += f11;
            fMax = Math.max(0.0f, f3 - this.LLIZ);
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
