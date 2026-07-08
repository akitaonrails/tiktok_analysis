package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20503315Kt extends C20503115Kr {
    public final Paint LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public final float LLJJIII;
    public final float LLJJIJI;
    public final float LLJJIJIIJIL;
    public final RectF LLJJIJIL;
    public final RectF LLJJJ;
    public final RectF LLJJJIL;
    public final RectF LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public EnumC1084680eKg LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public Function1<? super MotionEvent, Unit> LLJLIL;

    public C20503315Kt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getEndForWave() {
        return (int) (this.LLJJJJLIIL ? getSelectFrameRect().right - this.LLJIJIL : (getSelectFrameRect().right - this.LLJILJILJ) + this.LLJJ);
    }

    public final int getStartForWave() {
        return (int) (this.LLJJJJJIL ? getSelectFrameRect().left + this.LLJIJIL : (getSelectFrameRect().left + this.LLJILJILJ) - this.LLJJ);
    }

    public final EnumC1084680eKg getCurOperateHandle() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getDisableLeftHandle() {
        return this.LLJJJJJIL;
    }

    public final boolean getDisableRightHandle() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C20503115Kr
    public Function1<MotionEvent, Unit> getOnInterceptTouchListener() {
        return this.LLJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        getSelectFrameRect().top = this.LLJIJIL;
        RectF selectFrameRect = getSelectFrameRect();
        float measuredHeight = getMeasuredHeight();
        float f = this.LLJIJIL;
        selectFrameRect.bottom = measuredHeight - f;
        getSelectFrameRect().left += f;
        getSelectFrameRect().right -= f;
        Context context = getContext();
        Integer numValueOf = Integer.valueOf(R.attr.a04);
        Integer numLIZ = LIZ(context, numValueOf);
        if (numLIZ != null) {
            this.LLJI.setColor(numLIZ.intValue());
        }
        this.LLJI.setStyle(Paint.Style.STROKE);
        float f2 = 2;
        this.LLJI.setStrokeWidth(this.LLJIJIL * f2);
        Paint paint = this.LLJI;
        if (!this.LLJJL) {
            i = 100;
        } else {
            i = 255;
        }
        paint.setAlpha(i);
        RectF selectFrameRect2 = getSelectFrameRect();
        float f3 = this.LLJILJIL;
        canvas.drawRoundRect(selectFrameRect2, f3, f3, this.LLJI);
        getSelectFrameRect().left -= f;
        getSelectFrameRect().right += f;
        this.LLJI.setAlpha(255);
        this.LLJI.setStyle(Paint.Style.FILL);
        float f4 = ((getSelectFrameRect().bottom - getSelectFrameRect().top) - this.LLJILLL) / f2;
        this.LLJJJ.set(getSelectFrameRect().left - this.LLJILJILJ, f4, getSelectFrameRect().left + this.LLJILJILJ, this.LLJILLL + f4);
        RectF rectF = this.LLJJJJ;
        RectF rectF2 = this.LLJJJ;
        float f5 = rectF2.left;
        float f6 = this.LLJJ;
        rectF.set(f5 + f6, rectF2.top + f6, rectF2.right - f6, rectF2.bottom - f6);
        RectF rectF3 = this.LLJJIJIL;
        RectF rectF4 = this.LLJJJJ;
        float f7 = rectF4.left;
        float f8 = this.LLJJI;
        float f9 = rectF4.top;
        float f10 = this.LLJJIII;
        rectF3.set(f7 + f8, f9 + f10, rectF4.right - f8, rectF4.bottom - f10);
        if (!this.LLJJJJJIL) {
            RectF rectF5 = this.LLJJJJ;
            float f11 = this.LLJJIJI;
            canvas.drawRoundRect(rectF5, f11, f11, this.LLJI);
            Integer numLIZ2 = LIZ(getContext(), Integer.valueOf(R.attr.zi));
            if (numLIZ2 != null) {
                this.LLJI.setColor(numLIZ2.intValue());
            }
            RectF rectF6 = this.LLJJIJIL;
            float f12 = this.LLJJIJIIJIL;
            canvas.drawRoundRect(rectF6, f12, f12, this.LLJI);
        }
        this.LLJJJIL.set(getSelectFrameRect().right - this.LLJILJILJ, f4, getSelectFrameRect().right + this.LLJILJILJ, this.LLJILLL + f4);
        RectF rectF7 = this.LLJJJJ;
        RectF rectF8 = this.LLJJJIL;
        float f13 = rectF8.left;
        float f14 = this.LLJJ;
        rectF7.set(f13 + f14, rectF8.top + f14, rectF8.right - f14, rectF8.bottom - f14);
        RectF rectF9 = this.LLJJIJIL;
        RectF rectF10 = this.LLJJJJ;
        float f15 = rectF10.left;
        float f16 = this.LLJJI;
        float f18 = rectF10.top;
        float f19 = this.LLJJIII;
        rectF9.set(f15 + f16, f18 + f19, rectF10.right - f16, rectF10.bottom - f19);
        if (!this.LLJJJJLIIL) {
            Integer numLIZ3 = LIZ(getContext(), numValueOf);
            if (numLIZ3 != null) {
                this.LLJI.setColor(numLIZ3.intValue());
            }
            RectF rectF11 = this.LLJJJJ;
            float f20 = this.LLJJIJI;
            canvas.drawRoundRect(rectF11, f20, f20, this.LLJI);
            Integer numLIZ4 = LIZ(getContext(), Integer.valueOf(R.attr.zi));
            if (numLIZ4 != null) {
                this.LLJI.setColor(numLIZ4.intValue());
            }
            RectF rectF12 = this.LLJJIJIL;
            float f21 = this.LLJJIJIIJIL;
            canvas.drawRoundRect(rectF12, f21, f21, this.LLJI);
        }
    }

    public final void setClipping(boolean z) {
        this.LLJL = z;
    }

    public final void setCurOperateHandle(EnumC1084680eKg enumC1084680eKg) {
        this.LLJJLIIIJLLLLLLLZ = enumC1084680eKg;
    }

    public final void setDisableLeftHandle(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setDisableRightHandle(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public final void setFrameSelected(boolean z) {
        this.LLJJL = z;
    }

    @Override // X.C20503115Kr
    public void setOnInterceptTouchListener(Function1<? super MotionEvent, Unit> function1) {
        this.LLJLIL = function1;
    }

    public static Integer LIZ(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C1308910kAL.LIZJ(num.intValue(), context);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension((int) (getSelectFrameRect().right - getSelectFrameRect().left), i2);
    }

    public C20503315Kt(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint();
        this.LLJI = paint;
        this.LLJIJIL = C418440Gaw.LIZIZ(1);
        this.LLJILJIL = C418440Gaw.LIZIZ(12);
        this.LLJILJILJ = C418440Gaw.LIZIZ(19);
        this.LLJILLL = C418440Gaw.LIZIZ(52);
        this.LLJJ = C418440Gaw.LIZIZ(12);
        this.LLJJI = C418440Gaw.LIZIZ(6);
        this.LLJJIII = C418440Gaw.LIZIZ(8);
        this.LLJJIJI = C418440Gaw.LIZIZ(8);
        this.LLJJIJIIJIL = C418440Gaw.LIZIZ(2);
        this.LLJJIJIL = new RectF();
        this.LLJJJ = new RectF();
        this.LLJJJIL = new RectF();
        this.LLJJJJ = new RectF();
        paint.setAntiAlias(true);
        this.LLJLIL = new AwS610S0100000_31(this, 142);
    }
}
