package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ef7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370070Ef7 extends C370050Ef5 {
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
    public final float LLJJIJIL;
    public final float LLJJJ;
    public final RectF LLJJJIL;
    public final RectF LLJJJJ;
    public final RectF LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public EnumC370090Ef9 LLJJL;
    public Function1<? super MotionEvent, Boolean> LLJJLIIIJLLLLLLLZ;

    public final void LIZIZ() {
        Integer numLIZ = LIZ(getContext(), Integer.valueOf(R.attr.ee));
        if (numLIZ != null) {
            this.LLJI.setColor(numLIZ.intValue());
        }
    }

    public final EnumC370090Ef9 getCurOperateHandle() {
        return this.LLJJL;
    }

    @Override // X.C370050Ef5
    public Function1<MotionEvent, Boolean> getOnInterceptTouchListener() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Number numberValueOf;
        Number numberValueOf2;
        RectF selectFrameRect = getSelectFrameRect();
        boolean zLIZ = C293810BfP.LIZ();
        Float fValueOf = Float.valueOf(6.0f);
        if (zLIZ) {
            C1546210qL5.LIZ.getClass();
            numberValueOf = Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
        } else {
            numberValueOf = Float.valueOf(this.LLJIJIL);
        }
        selectFrameRect.top = numberValueOf.floatValue();
        RectF selectFrameRect2 = getSelectFrameRect();
        float measuredHeight = getMeasuredHeight();
        if (C293810BfP.LIZ()) {
            C1546210qL5.LIZ.getClass();
            numberValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
        } else {
            numberValueOf2 = Float.valueOf(this.LLJIJIL);
        }
        selectFrameRect2.bottom = measuredHeight - numberValueOf2.floatValue();
        LIZIZ();
        this.LLJI.setStyle(Paint.Style.STROKE);
        float f = 2;
        this.LLJI.setStrokeWidth(this.LLJIJIL * f);
        RectF selectFrameRect3 = getSelectFrameRect();
        float f2 = this.LLJILJIL;
        canvas.drawRoundRect(selectFrameRect3, f2, f2, this.LLJI);
        if (C293810BfP.LIZ()) {
            float f3 = (getSelectFrameRect().right - getSelectFrameRect().left) / f;
            float f4 = this.LLJILJILJ;
            if (f3 > f4) {
                f3 = f4;
            }
            this.LLJI.setStyle(Paint.Style.FILL);
            this.LLJJJJ.set(getSelectFrameRect().left - this.LLJILJILJ, getSelectFrameRect().top + this.LLJILLL, getSelectFrameRect().left + f3, getSelectFrameRect().top + this.LLJILLL + this.LLJJ);
            canvas.save();
            RectF rectF = this.LLJJJJ;
            canvas.clipRect(rectF.left, rectF.top, getSelectFrameRect().left + f3, this.LLJJJJ.bottom);
            float f5 = getSelectFrameRect().left + this.LLJILJILJ;
            float f6 = getSelectFrameRect().right - this.LLJILJILJ;
            RectF rectF2 = this.LLJJJJLIIL;
            float f7 = getSelectFrameRect().left - this.LLJILJILJ;
            float f8 = this.LLJJIII;
            RectF rectF3 = this.LLJJJJ;
            float f9 = rectF3.top;
            float f10 = this.LLJJI;
            rectF2.set(f7 + f8, f9 + f10, f5 - f8, rectF3.bottom - f10);
            RectF rectF4 = this.LLJJJIL;
            RectF rectF5 = this.LLJJJJLIIL;
            float f11 = rectF5.left;
            float f12 = this.LLJJIJI;
            float f13 = rectF5.top;
            float f14 = this.LLJJIJIIJIL;
            rectF4.set(f11 + f12, f13 + f14, rectF5.right - f12, rectF5.bottom - f14);
            LIZIZ();
            RectF rectF6 = this.LLJJJJLIIL;
            float f15 = this.LLJJIJIL;
            canvas.drawRoundRect(rectF6, f15, f15, this.LLJI);
            Integer numLIZ = LIZ(getContext(), Integer.valueOf(R.attr.e2));
            if (numLIZ != null) {
                this.LLJI.setColor(numLIZ.intValue());
            }
            RectF rectF7 = this.LLJJJIL;
            float f16 = this.LLJJJ;
            canvas.drawRoundRect(rectF7, f16, f16, this.LLJI);
            canvas.restore();
            this.LLJJJJJIL.set(getSelectFrameRect().right - f3, getSelectFrameRect().top + this.LLJILLL, getSelectFrameRect().right + this.LLJILJILJ, getSelectFrameRect().top + this.LLJILLL + this.LLJJ);
            canvas.save();
            float f18 = getSelectFrameRect().right - f3;
            RectF rectF8 = this.LLJJJJJIL;
            canvas.clipRect(f18, rectF8.top, rectF8.right, rectF8.bottom);
            this.LLJJJJLIIL.set(f6 + this.LLJJIII, this.LLJJJJJIL.top + this.LLJJI, (getSelectFrameRect().right + this.LLJILJILJ) - this.LLJJIII, this.LLJJJJJIL.bottom - this.LLJJI);
            RectF rectF9 = this.LLJJJIL;
            RectF rectF10 = this.LLJJJJLIIL;
            float f19 = rectF10.left;
            float f20 = this.LLJJIJI;
            float f21 = rectF10.top;
            float f22 = this.LLJJIJIIJIL;
            rectF9.set(f19 + f20, f21 + f22, rectF10.right - f20, rectF10.bottom - f22);
            LIZIZ();
            RectF rectF11 = this.LLJJJJLIIL;
            float f23 = this.LLJJIJIL;
            canvas.drawRoundRect(rectF11, f23, f23, this.LLJI);
            Integer numLIZ2 = LIZ(getContext(), Integer.valueOf(R.attr.e2));
            if (numLIZ2 != null) {
                this.LLJI.setColor(numLIZ2.intValue());
            }
            RectF rectF12 = this.LLJJJIL;
            float f24 = this.LLJJJ;
            canvas.drawRoundRect(rectF12, f24, f24, this.LLJI);
            canvas.restore();
            return;
        }
        this.LLJI.setStyle(Paint.Style.FILL);
        this.LLJJJJ.set(getSelectFrameRect().left - this.LLJILJILJ, getSelectFrameRect().top + this.LLJILLL, getSelectFrameRect().left + this.LLJILJILJ, getSelectFrameRect().top + this.LLJILLL + this.LLJJ);
        RectF rectF13 = this.LLJJJJLIIL;
        RectF rectF14 = this.LLJJJJ;
        float f25 = rectF14.left;
        float f26 = this.LLJJIII;
        float f27 = rectF14.top;
        float f28 = this.LLJJI;
        rectF13.set(f25 + f26, f27 + f28, rectF14.right - f26, rectF14.bottom - f28);
        RectF rectF15 = this.LLJJJIL;
        RectF rectF16 = this.LLJJJJLIIL;
        float f29 = rectF16.left;
        float f30 = this.LLJJIJI;
        float f31 = rectF16.top;
        float f32 = this.LLJJIJIIJIL;
        rectF15.set(f29 + f30, f31 + f32, rectF16.right - f30, rectF16.bottom - f32);
        RectF rectF17 = this.LLJJJJLIIL;
        float f33 = this.LLJJIJIL;
        canvas.drawRoundRect(rectF17, f33, f33, this.LLJI);
        Integer numLIZ3 = LIZ(getContext(), Integer.valueOf(R.attr.e2));
        if (numLIZ3 != null) {
            this.LLJI.setColor(numLIZ3.intValue());
        }
        RectF rectF18 = this.LLJJJIL;
        float f34 = this.LLJJJ;
        canvas.drawRoundRect(rectF18, f34, f34, this.LLJI);
        this.LLJJJJJIL.set(getSelectFrameRect().right - this.LLJILJILJ, getSelectFrameRect().top + this.LLJILLL, getSelectFrameRect().right + this.LLJILJILJ, getSelectFrameRect().top + this.LLJILLL + this.LLJJ);
        RectF rectF19 = this.LLJJJJLIIL;
        RectF rectF20 = this.LLJJJJJIL;
        float f35 = rectF20.left;
        float f36 = this.LLJJIII;
        float f37 = rectF20.top;
        float f38 = this.LLJJI;
        rectF19.set(f35 + f36, f37 + f38, rectF20.right - f36, rectF20.bottom - f38);
        RectF rectF21 = this.LLJJJIL;
        RectF rectF22 = this.LLJJJJLIIL;
        float f39 = rectF22.left;
        float f40 = this.LLJJIJI;
        float f41 = rectF22.top;
        float f42 = this.LLJJIJIIJIL;
        rectF21.set(f39 + f40, f41 + f42, rectF22.right - f40, rectF22.bottom - f42);
        LIZIZ();
        RectF rectF23 = this.LLJJJJLIIL;
        float f43 = this.LLJJIJIL;
        canvas.drawRoundRect(rectF23, f43, f43, this.LLJI);
        Integer numLIZ4 = LIZ(getContext(), Integer.valueOf(R.attr.e2));
        if (numLIZ4 != null) {
            this.LLJI.setColor(numLIZ4.intValue());
        }
        RectF rectF24 = this.LLJJJIL;
        float f44 = this.LLJJJ;
        canvas.drawRoundRect(rectF24, f44, f44, this.LLJI);
    }

    public final void setCurOperateHandle(EnumC370090Ef9 enumC370090Ef9) {
        this.LLJJL = enumC370090Ef9;
    }

    @Override // X.C370050Ef5
    public void setOnInterceptTouchListener(Function1<? super MotionEvent, Boolean> function1) {
        this.LLJJLIIIJLLLLLLLZ = function1;
    }

    public C370070Ef7(Context context, AttributeSet attributeSet) {
        float f;
        float f2;
        float f3;
        float f4;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LLJI = paint;
        this.LLJIJIL = C0FU0.LIZ(1.0f);
        this.LLJILJIL = C0FU0.LIZ(6.0f);
        if (C293810BfP.LIZ()) {
            f = 20.0f;
        } else {
            f = 19.0f;
        }
        this.LLJILJILJ = C418440Gaw.LIZIZ(Float.valueOf(f));
        if (C293810BfP.LIZ()) {
            f2 = -5.0f;
        } else {
            f2 = 0.0f;
        }
        this.LLJILLL = C418440Gaw.LIZIZ(Float.valueOf(f2));
        if (C293810BfP.LIZ()) {
            f3 = 62.0f;
        } else {
            f3 = 52.0f;
        }
        this.LLJJ = C418440Gaw.LIZIZ(Float.valueOf(f3));
        if (C293810BfP.LIZ()) {
            f4 = 17.0f;
        } else {
            f4 = 12.0f;
        }
        this.LLJJI = C418440Gaw.LIZIZ(Float.valueOf(f4));
        this.LLJJIII = C418440Gaw.LIZIZ(Float.valueOf(C293810BfP.LIZ() ? 13.0f : 12.0f));
        this.LLJJIJI = C0FU0.LIZ(6.0f);
        this.LLJJIJIIJIL = C0FU0.LIZ(8.0f);
        this.LLJJIJIL = C0FU0.LIZ(8.0f);
        this.LLJJJ = C0FU0.LIZ(2.0f);
        this.LLJJJIL = new RectF();
        this.LLJJJJ = new RectF();
        this.LLJJJJJIL = new RectF();
        this.LLJJJJLIIL = new RectF();
        paint.setAntiAlias(true);
        this.LLJJLIIIJLLLLLLLZ = new AwS584S0100000_5(this, 683);
    }

    public final Integer LIZ(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C1308910kAL.LIZJ(num.intValue(), context);
    }
}
