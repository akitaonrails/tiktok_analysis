package X;

import Y.ATListenerS348S0200000_29;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import u4.q0;

/* JADX INFO: renamed from: X.12Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19724512Ff extends View {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final RectF LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public int LLJJIJIL;
    public InterfaceC19724812Fi LLJJJ;
    public final Paint LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public final PorterDuffXfermode LLJJLIIIJLLLLLLLZ;

    public final int getValueFrom() {
        return 0;
    }

    public final int getIndicator() {
        return this.LLJJIJIL;
    }

    public final InterfaceC19724812Fi getOnSliderListener() {
        return this.LLJJJ;
    }

    public final int getValueTo() {
        return this.LLJJIJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.LLJJJJLIIL <= 0) {
            return;
        }
        int i = this.LLJJIJI;
        int i2 = this.LLJJIJIIJIL;
        float f3 = (i - (i % i2)) / i2;
        float f4 = (this.LLJJIJIL / i2) / f3;
        if (getLayoutDirection() == 1) {
            f = this.LLJJJJ;
            f2 = this.LLJJJJLIIL * (1 - f4);
        } else {
            f = this.LLJJJJ;
            f2 = this.LLJJJJLIIL * f4;
        }
        float f5 = f + f2;
        int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLJJJIL, 31);
        this.LLJJJIL.setColor(this.LL);
        float f6 = this.LLJJJJ;
        int i3 = this.LLJJL;
        canvas2.drawLine(f6, i3, this.LLJJJJJIL, i3, this.LLJJJIL);
        this.LLJJJIL.setXfermode(this.LLJJLIIIJLLLLLLLZ);
        int i4 = 0;
        while (i4 <= this.LLJJIJI) {
            float f7 = this.LLJJJJ + (this.LLJJJJLIIL * ((i4 / this.LLJJIJIIJIL) / f3));
            float f8 = this.LLJJL;
            RectF rectF = this.LLJJIII;
            int i5 = this.LLJ;
            int i6 = this.LLJI;
            rectF.set(f7 - (i5 / 2), f8 - (i6 / 2), f7 + (i5 / 2), f8 + (i6 / 2));
            RectF rectF2 = this.LLJJIII;
            int i7 = this.LLJIJIL;
            canvas2.drawRoundRect(rectF2, i7, i7, this.LLJJJIL);
            i4 += this.LLJJIJIIJIL;
        }
        this.LLJJJIL.setXfermode(null);
        this.LLJJJIL.setColor(this.LLILLJJLI);
        if (getLayoutDirection() == 1) {
            int i8 = this.LLJJL;
            canvas2 = canvas2;
            canvas2.drawLine(f5, i8, this.LLJJJJJIL, i8, this.LLJJJIL);
        } else {
            float f9 = this.LLJJJJ;
            int i9 = this.LLJJL;
            canvas2.drawLine(f9, i9, f5, i9, this.LLJJJIL);
        }
        this.LLJJJIL.setXfermode(this.LLJJLIIIJLLLLLLLZ);
        if (getLayoutDirection() == 1) {
            int i10 = 0;
            while (i10 <= this.LLJJIJIL) {
                float f10 = this.LLJJJJ + (this.LLJJJJLIIL * (1 - ((i10 / this.LLJJIJIIJIL) / f3)));
                float f11 = this.LLJJL;
                RectF rectF3 = this.LLJJIII;
                int i11 = this.LLJ;
                int i12 = this.LLJI;
                rectF3.set(f10 - (i11 / 2), f11 - (i12 / 2), f10 + (i11 / 2), f11 + (i12 / 2));
                RectF rectF4 = this.LLJJIII;
                int i13 = this.LLJIJIL;
                canvas2.drawRoundRect(rectF4, i13, i13, this.LLJJJIL);
                i10 += this.LLJJIJIIJIL;
            }
        } else {
            int i14 = 0;
            while (i14 <= this.LLJJIJIL) {
                float f12 = this.LLJJJJ + (this.LLJJJJLIIL * ((i14 / this.LLJJIJIIJIL) / f3));
                float f13 = this.LLJJL;
                RectF rectF5 = this.LLJJIII;
                int i15 = this.LLJ;
                int i16 = this.LLJI;
                rectF5.set(f12 - (i15 / 2), f13 - (i16 / 2), f12 + (i15 / 2), f13 + (i16 / 2));
                RectF rectF6 = this.LLJJIII;
                int i17 = this.LLJIJIL;
                canvas2.drawRoundRect(rectF6, i17, i17, this.LLJJJIL);
                i14 += this.LLJJIJIIJIL;
            }
        }
        this.LLJJJIL.setXfermode(null);
        canvas2.restoreToCount(iSaveLayer);
        this.LLJJJIL.setColor(this.LLILZ);
        if (getLayoutDirection() == 1) {
            this.LLJJJIL.setShadowLayer(this.LLJILLL, -this.LLJJ, this.LLJJI, this.LLILZIL);
        } else {
            this.LLJJJIL.setShadowLayer(this.LLJILLL, this.LLJJ, this.LLJJI, this.LLILZIL);
        }
        int i18 = (this.LLILZLL / 2) - (this.LLJ / 2);
        int i19 = this.LLJJL;
        int i20 = this.LLIZ;
        float f14 = i19 - (i20 / 2);
        float f15 = i19 + (i20 / 2);
        float f16 = f5 - (r3 / 2);
        float f18 = f5 + (r3 / 2);
        int i21 = this.LLJJIJIL;
        if (i21 == 0) {
            RectF rectF7 = this.LLJJIII;
            int i22 = this.LLJILJIL;
            float f19 = i18;
            rectF7.set((f16 - i22) + f19, f14 - i22, i22 + f18 + f19, i22 + f15);
            RectF rectF8 = this.LLJJIII;
            int i23 = this.LLIZLLLIL;
            int i24 = this.LLJILJIL;
            canvas2.drawRoundRect(rectF8, i23 + i24, i23 + i24, this.LLJJJIL);
            this.LLJJJIL.setColor(this.LLILLL);
            this.LLJJIII.set(f16 + f19, f14, f18 + f19, f15);
            RectF rectF9 = this.LLJJIII;
            int i25 = this.LLIZLLLIL;
            canvas2.drawRoundRect(rectF9, i25, i25, this.LLJJJIL);
        } else if (i21 == this.LLJJIJI) {
            RectF rectF10 = this.LLJJIII;
            int i26 = this.LLJILJIL;
            float f20 = i18;
            rectF10.set((f16 - i26) - f20, f14 - i26, (i26 + f18) - f20, i26 + f15);
            RectF rectF11 = this.LLJJIII;
            int i27 = this.LLIZLLLIL;
            int i28 = this.LLJILJIL;
            canvas2.drawRoundRect(rectF11, i27 + i28, i27 + i28, this.LLJJJIL);
            this.LLJJJIL.setColor(this.LLILLL);
            this.LLJJIII.set(f16 - f20, f14, f18 - f20, f15);
            RectF rectF12 = this.LLJJIII;
            int i29 = this.LLIZLLLIL;
            canvas2.drawRoundRect(rectF12, i29, i29, this.LLJJJIL);
        } else {
            RectF rectF13 = this.LLJJIII;
            int i30 = this.LLJILJIL;
            rectF13.set(f16 - i30, f14 - i30, i30 + f18, i30 + f15);
            RectF rectF14 = this.LLJJIII;
            int i31 = this.LLIZLLLIL;
            int i32 = this.LLJILJIL;
            canvas2.drawRoundRect(rectF14, i31 + i32, i31 + i32, this.LLJJJIL);
            this.LLJJJIL.setColor(this.LLILLL);
            this.LLJJIII.set(f16, f14, f18, f15);
            RectF rectF15 = this.LLJJIII;
            int i33 = this.LLIZLLLIL;
            canvas2.drawRoundRect(rectF15, i33, i33, this.LLJJJIL);
        }
        this.LLJJJIL.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void setIndicator(int i) {
        int i2;
        InterfaceC19724812Fi interfaceC19724812Fi;
        if (i < 0) {
            i2 = 0;
        } else {
            int i3 = this.LLJJIJI;
            int i4 = this.LLJJIJIIJIL;
            i2 = i3 - (i3 % i4);
            if (i <= i2) {
                int i5 = i % i4;
                if (i5 < i4 / 2.0f) {
                    i2 = i - i5;
                } else {
                    i2 = i + (i4 - i5);
                }
            }
        }
        if (this.LLJJIJIL != i2 && (interfaceC19724812Fi = this.LLJJJ) != null) {
            interfaceC19724812Fi.onProgressChanged(i2);
        }
        this.LLJJIJIL = i2;
        invalidate();
    }

    public final void setOnSliderListener(InterfaceC19724812Fi interfaceC19724812Fi) {
        this.LLJJJ = interfaceC19724812Fi;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(new ATListenerS348S0200000_29(this, onTouchListener, 2));
    }

    public C19724512Ff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C960203pA.LIZ(R.attr.ne, context);
        this.LLILLJJLI = C960203pA.LIZ(R.attr.a04, context);
        this.LLILLL = C960203pA.LIZ(R.attr.ee, context);
        this.LLILZ = C960203pA.LIZ(R.attr.na, context);
        this.LLILZIL = C960203pA.LIZ(R.attr.na, context);
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJJIII = new RectF();
        this.LLJJIJI = 3;
        this.LLJJIJIIJIL = 1;
        this.LLJJIJIL = 0;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(iLIZIZ);
        this.LLJJJIL = paint;
        this.LLJJLIIIJLLLLLLLZ = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        q0.LJIJ(this, new AbstractC1324060kYm(this) { // from class: X.12Fg
            public final C19724512Ff LJIILIIL;
            public final Rect LJIILJJIL;

            {
                super(this);
                this.LJIILIIL = this;
                this.LJIILJJIL = new Rect();
            }

            @Override // X.AbstractC1324060kYm
            public final void LIZJ(List<Integer> list) {
                ((ArrayList) list).add(0);
            }

            @Override // X.AbstractC1324060kYm
            public final boolean LJFF(int i, int i2) {
                if (!this.LJIILIIL.isEnabled()) {
                    return false;
                }
                if (i2 != 4096) {
                    if (i2 != 8192) {
                        return false;
                    }
                    C19724512Ff c19724512Ff = this.LJIILIIL;
                    c19724512Ff.setIndicator(c19724512Ff.getIndicator() - 1);
                    sendAccessibilityEvent(this.LJIILIIL, 4);
                } else {
                    C19724512Ff c19724512Ff2 = this.LJIILIIL;
                    c19724512Ff2.setIndicator(c19724512Ff2.getIndicator() + 1);
                    sendAccessibilityEvent(this.LJIILIIL, 4);
                }
                return true;
            }

            @Override // X.AbstractC1324060kYm
            public final void LJII(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                accessibilityNodeInfoCompat.addAction(C20092413jW.LJJIJIIJIL);
                int valueFrom = this.LJIILIIL.getValueFrom();
                int valueTo = this.LJIILIIL.getValueTo();
                if (this.LJIILIIL.isEnabled()) {
                    accessibilityNodeInfoCompat.addAction(8192);
                    accessibilityNodeInfoCompat.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                }
                accessibilityNodeInfoCompat.setRangeInfo(new C19724712Fh(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, this.LJIILIIL.getIndicator())));
                accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
                accessibilityNodeInfoCompat.setContentDescription("");
                C19724512Ff c19724512Ff = this.LJIILIIL;
                Rect rect = this.LJIILJJIL;
                int i2 = c19724512Ff.LLJJJJ;
                int i3 = c19724512Ff.LLJILJILJ;
                int i4 = c19724512Ff.LLJJL;
                rect.set(i2 - i3, i4 - i3, i2 + c19724512Ff.LLJJJJLIIL + i3, i4 + i3);
                accessibilityNodeInfoCompat.setBoundsInParent(this.LJIILJJIL);
            }
        });
        setOnTouchListener(null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int iAbs = this.LLIZLLLIL + this.LLJILLL + Math.abs(this.LLJJ);
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        this.LLJJJJ = paddingLeft + iAbs;
        if (getLayoutDirection() == 1) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int i3 = size - (iAbs + paddingRight);
        this.LLJJJJJIL = i3;
        this.LLJJJJLIIL = i3 - this.LLJJJJ;
        int i4 = this.LLJILLL - this.LLJJI;
        if (i4 > 0) {
            paddingTop = getPaddingTop() + this.LLIZLLLIL + i4;
        } else {
            paddingTop = this.LLIZLLLIL + getPaddingTop();
        }
        this.LLJJL = paddingTop;
        this.LLJJL = Math.max(this.LLJILJILJ / 2, paddingTop);
        int i5 = this.LLJILLL + this.LLJJI;
        if (i5 > 0) {
            paddingBottom = getPaddingBottom() + this.LLIZLLLIL + i5;
        } else {
            paddingBottom = this.LLIZLLLIL + getPaddingBottom();
        }
        int iMax = Math.max(this.LLJILJILJ / 2, paddingBottom);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size2 = this.LLJJL + iMax;
        }
        setMeasuredDimension(size, size2);
    }
}
