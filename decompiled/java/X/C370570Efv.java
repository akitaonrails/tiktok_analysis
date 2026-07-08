package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Efv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370570Efv extends View {
    public final int LL;
    public Animator LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final Rect LLILZLL;
    public final int LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public Boolean LLJJI;
    public boolean LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public final int LLJJJIL;
    public final int LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public final int LLJLLIL;
    public Bitmap LLJLLL;
    public final Rect LLJZ;
    public final RectF LLJZIJLIL;
    public final float LLL;
    public final boolean LLLF;
    public final boolean LLLFF;
    public final boolean LLLFFI;
    public final int LLLFZ;
    public final float LLLI;
    public boolean LLLII;
    public final ArrayList<Float> LLLIIII;
    public InterfaceC370580Efw LLLIIIIL;
    public final C01GW LLLIIIL;
    public boolean LLLIIL;

    public static /* synthetic */ void getEaseOut$annotations() {
    }

    private final InterfaceC369250Edn getHapticFeedback() {
        return (InterfaceC369250Edn) this.LLLIIIL.getValue();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLJJJJJIL.getValue()).booleanValue();
    }

    public final float getHandleRadius() {
        return this.LLJLLIL + this.LLJLIL;
    }

    public final Bitmap getSelectBitmap() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(this.LLJLL);
        if (this.LLLIIL) {
            gradientDrawable.setColor(this.LLJLILLLLZIIL);
        }
        gradientDrawable.setStroke(this.LLJLIL, this.LLJL);
        int iLIZ = (this.LLJLIL + this.LLJLLIL) * 2;
        if (iLIZ <= 0) {
            iLIZ = C390810FTz.LIZ(15.0f);
        }
        gradientDrawable.setSize(iLIZ, iLIZ);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iLIZ, iLIZ, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        gradientDrawable.setBounds(0, 0, iLIZ, iLIZ);
        gradientDrawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private final Interpolator getEaseOut() {
        return C0GY9.LIZIZ(0.54f, 0.0f, 0.94f, 0.74f);
    }

    public final float LIZIZ() {
        return LIZLLL() ? (this.LLIZLLLIL - (this.LLJIJIL * this.LLJILJIL)) - getMeasuredWidth() : this.LLIZLLLIL + (this.LLJIJIL * this.LLJILJIL);
    }

    public final boolean getEnableSliding() {
        return this.LLLII;
    }

    public final float getHandleCenterRelativeY() {
        return this.LLJI;
    }

    public final boolean getHandleMasked() {
        return this.LLLIIL;
    }

    public final Boolean getSlideAble() {
        return this.LLJJI;
    }

    public final int LIZ(int i) {
        float f = 100;
        int i2 = (int) (this.LLLI * f);
        int size = this.LLLIIII.size();
        if (i < i2) {
            return i2;
        }
        if (i2 > 0 && i2 <= i && i < 201) {
            return i;
        }
        int i3 = size - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = i5 * 100;
            if (i4 * 100 <= i && i <= i6) {
                return ((int) (((Number) ListProtector.get(this.LLLIIII, i4)).floatValue() * f)) + ((int) ((i - r4) * (((Number) ListProtector.get(this.LLLIIII, i5)).floatValue() - ((Number) ListProtector.get(this.LLLIIII, i4)).floatValue())));
            }
            i4 = i5;
        }
        Iterator<Float> it2 = this.LLLIIII.iterator();
        if (it2.hasNext()) {
            float fFloatValue = it2.next().floatValue();
            while (it2.hasNext()) {
                fFloatValue = Math.max(fFloatValue, it2.next().floatValue());
            }
            return (int) (fFloatValue * f);
        }
        throw new NoSuchElementException();
    }

    public final int LIZJ(float f) {
        int size;
        double dCeil;
        int i = (int) (this.LLLI * 100);
        if (LIZLLL()) {
            float f2 = this.LLJ;
            float f3 = this.LLIZLLLIL;
            float f4 = i;
            float f5 = this.LLJIJIL;
            if (f <= f3 - (f4 * f5) && f2 <= f) {
                dCeil = Math.ceil(Math.abs(f3 - f) / this.LLJIJIL);
                return (int) dCeil;
            }
            if (f > f3 - (f4 * f5)) {
                return i;
            }
            size = this.LLLIIII.size();
            return (size - 1) * 100;
        }
        float f6 = this.LLIZLLLIL;
        float f7 = i;
        float f8 = this.LLJIJIL;
        float f9 = (f7 * f8) + f6;
        if (f <= this.LLJ && f9 <= f) {
            dCeil = Math.ceil((f - f6) / f8);
            return (int) dCeil;
        }
        if (f < f6 + (f7 * f8)) {
            return i;
        }
        size = this.LLLIIII.size();
        return (size - 1) * 100;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float fAbs;
        int i;
        float fFloatValue;
        float f2;
        Object objValueOf;
        float fHeight;
        super.onDraw(canvas);
        if (LIZLLL()) {
            f = this.LLIZLLLIL - (this.LLJIJIL * this.LLJILJIL);
        } else {
            f = this.LLIZLLLIL + (this.LLJIJIL * this.LLJILJIL);
        }
        String strK4 = C786410Ut5.k4(Locale.ENGLISH, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf((this.LLJILJILJ / 10) / 10.0f)}, 1));
        this.LLILZ.getTextBounds(strK4, 0, strK4.length(), this.LLILZLL);
        float fWidth = (f - (this.LLILZLL.width() / 2.0f)) - C390810FTz.LIZ(1.0f);
        float f3 = (this.LLJI - this.LLL) - this.LL;
        if (this.LLJJ && this.LLLF) {
            canvas.drawText(strK4, fWidth, f3, this.LLILZ);
        }
        if (!this.LLLIIII.isEmpty()) {
            int size = this.LLLIIII.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (LIZLLL()) {
                    float f4 = this.LLIZLLLIL;
                    fAbs = f4 - (i2 * (Math.abs(this.LLJ - f4) / (size - 1)));
                } else {
                    float f5 = this.LLIZLLLIL;
                    fAbs = f5 + (i2 * ((this.LLJ - f5) / (size - 1)));
                }
                int i3 = this.LLJJLIIIJLLLLLLLZ;
                int i4 = size - 1;
                int i5 = 9;
                if (i3 == 9) {
                    i = (i3 * i4) + i4;
                } else {
                    i = (i3 * i4) + size;
                }
                float fAbs2 = Math.abs(this.LLJ - this.LLIZLLLIL) / i;
                int i6 = this.LLJJLIIIJLLLLLLLZ;
                int i7 = i6 + 1;
                if (i2 == 0) {
                    if (i6 != 9) {
                        i5 = i7;
                    }
                    if (LIZLLL()) {
                        fAbs -= (this.LLLI * 100) * this.LLJIJIL;
                    } else {
                        fAbs += this.LLLI * 100 * this.LLJIJIL;
                    }
                    i7 = i5;
                } else if (i2 == i4) {
                    i7 = 1;
                }
                int i8 = this.LLJJIJIIJIL;
                this.LLILLL.setStrokeWidth(this.LLJJJ);
                this.LLILLL.setColor(this.LLJJL);
                float f6 = fAbs;
                for (int i9 = 0; i9 < i7; i9++) {
                    if (i9 == 1) {
                        i8 = this.LLJJIJI;
                        this.LLILLL.setStrokeWidth(this.LLJJIJIL);
                        this.LLILLL.setColor(this.LLJJJJLIIL);
                    }
                    if (canvas != null) {
                        float f7 = f6 - (this.LLJJJIL / 2);
                        float f8 = this.LLJI;
                        float f9 = i8 / 2;
                        canvas.drawLine(f7, f8 - f9, f7, f8 + f9, this.LLILLL);
                    }
                    if (LIZLLL()) {
                        f6 -= fAbs2;
                    } else {
                        f6 += fAbs2;
                    }
                }
                if (this.LLLFZ == 1) {
                    fFloatValue = (int) (((Number) ListProtector.get(this.LLLIIII, i2)).floatValue() * 10);
                    f2 = 10.0f;
                } else {
                    fFloatValue = (int) (((Number) ListProtector.get(this.LLLIIII, i2)).floatValue() * 100);
                    f2 = 100.0f;
                }
                float f10 = fFloatValue / f2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                int i10 = (int) f10;
                if (i10 == f10) {
                    objValueOf = Integer.valueOf(i10);
                } else {
                    objValueOf = Float.valueOf(f10);
                }
                sbLIZ.append(objValueOf);
                sbLIZ.append('x');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LLILZIL.getTextBounds(strLIZIZ, 0, strLIZIZ.length(), this.LLILZLL);
                float fWidth2 = (fAbs - (this.LLILZLL.width() / 2.0f)) - C390810FTz.LIZ(1.0f);
                if (this.LLLFFI) {
                    fHeight = this.LLJI + this.LLJJJJ + (this.LLJJIJIIJIL / 2) + this.LLILZLL.height();
                } else {
                    fHeight = (this.LLJI - this.LLJJJJ) - (this.LLJJIJIIJIL / 2);
                }
                if (canvas != null) {
                    canvas.drawText(strLIZIZ, fWidth2, fHeight, this.LLILZIL);
                }
            }
        }
        RectF rectF = this.LLJZIJLIL;
        float f11 = this.LLL;
        float f12 = this.LLJI;
        rectF.set(f - f11, f12 - f11, f + f11, f12 + f11);
        canvas.drawBitmap(this.LLJLLL, this.LLJZ, this.LLJZIJLIL, (Paint) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370570Efv.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCurrPosition(int i) {
        float fFloatValue;
        this.LLJILJILJ = i;
        float f = 100;
        int i2 = (int) (this.LLLI * f);
        int size = this.LLLIIII.size();
        if (i2 < 0 || i >= i2) {
            int i3 = size - 1;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    int iFloatValue = (int) (((Number) ListProtector.get(this.LLLIIII, i4)).floatValue() * f);
                    int i5 = i4 + 1;
                    int iFloatValue2 = (int) (((Number) ListProtector.get(this.LLLIIII, i5)).floatValue() * f);
                    if (iFloatValue <= i && i < iFloatValue2) {
                        float fFloatValue2 = ((Number) ListProtector.get(this.LLLIIII, i5)).floatValue();
                        if (i4 == 0) {
                            fFloatValue = 0.0f;
                        } else {
                            fFloatValue = ((Number) ListProtector.get(this.LLLIIII, i4)).floatValue();
                        }
                        float f2 = fFloatValue2 - fFloatValue;
                        if (i4 != 0) {
                            i2 = i4 * 100;
                        }
                        i = ((int) ((i - iFloatValue) / f2)) + i2;
                    } else {
                        i4 = i5;
                    }
                } else {
                    i = (this.LLLIIII.size() - 1) * 100;
                    break;
                }
            }
        }
        this.LLJILJIL = i;
        this.LLJIJIL = Math.abs(this.LLJ - this.LLIZLLLIL) / ((this.LLLIIII.size() - 1) * 100);
        invalidate();
    }

    public final void setEnableSliding(boolean z) {
        this.LLLII = z;
    }

    public final void setHandleMasked(boolean z) {
        if (z == this.LLLIIL) {
            return;
        }
        this.LLLIIL = z;
        this.LLJLLL = getSelectBitmap();
        invalidate();
    }

    public final void setOnSliderChangeListener(InterfaceC370580Efw interfaceC370580Efw) {
        this.LLLIIIIL = interfaceC370580Efw;
    }

    public final void setSlideAble(Boolean bool) {
        this.LLJJI = bool;
    }

    public final void setSpeedRange(ArrayList<Float> arrayList) {
        this.LLLIIII.clear();
        this.LLLIIII.addAll(arrayList);
        invalidate();
    }

    public final void setTextTypeface(Typeface typeface) {
        this.LLILZIL.setTypeface(typeface);
        invalidate();
    }

    public C370570Efv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C390810FTz.LIZ(12.5f);
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.LLILZ = paint3;
        Paint paint4 = new Paint(1);
        this.LLILZIL = paint4;
        ColorProtector.parseColor("#CCFFFFFF");
        float fLIZ = C390810FTz.LIZ(11.0f);
        this.LLILZLL = new Rect();
        this.LLIZ = C390810FTz.LIZ(10.0f);
        this.LLJIJIL = 1.0f;
        this.LLJILJIL = 10;
        this.LLJILJILJ = 10;
        this.LLJJI = Boolean.TRUE;
        this.LLJJIJI = C390810FTz.LIZ(4.6f);
        this.LLJJIJIIJIL = C390810FTz.LIZ(11.0f);
        this.LLJJIJIL = C390810FTz.LIZ(1.0f);
        this.LLJJJ = C390810FTz.LIZ(1.0f);
        this.LLJJJIL = C390810FTz.LIZ(1.0f);
        this.LLJJJJ = C390810FTz.LIZ(25.0f);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1714));
        this.LLJJJJLIIL = ColorProtector.parseColor("#D8D8D8");
        this.LLJJL = ColorProtector.parseColor("#D8D8D8");
        this.LLJJLIIIJLLLLLLLZ = 9;
        this.LLJL = -1;
        this.LLJLIL = C390810FTz.LIZ(3.0f);
        this.LLJLL = ColorProtector.parseColor("#181718");
        this.LLJLLIL = C390810FTz.LIZ(9.0f);
        this.LLJZIJLIL = new RectF();
        this.LLLF = true;
        this.LLLFF = true;
        this.LLLFFI = true;
        this.LLLFZ = 1;
        this.LLLI = 0.1f;
        this.LLLII = true;
        this.LLLIIII = C1697810uHb.LJ(Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(100.0f));
        this.LLLIIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(442));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ChangeSpeedView);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ChangeSpeedView_dividerTextColor, ColorProtector.parseColor("#CCFFFFFF"));
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ChangeSpeedView_smallDividerWidth, C390810FTz.LIZ(1.0f));
        this.LLJJIJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ChangeSpeedView_smallDividerHeight, C390810FTz.LIZ(4.6f));
        this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ChangeSpeedView_smallDividerColor, ColorProtector.parseColor("#D8D8D8"));
        this.LLJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ChangeSpeedView_bigDividerWidth, C390810FTz.LIZ(1.0f));
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ChangeSpeedView_bigDividerHeight, C390810FTz.LIZ(11.0f));
        this.LLJJL = typedArrayObtainStyledAttributes.getColor(R$styleable.ChangeSpeedView_bigDividerColor, ColorProtector.parseColor("#D8D8D8"));
        this.LLJJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ChangeSpeedView_dividerTextMargin, C390810FTz.LIZ(25.0f));
        this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getInteger(R$styleable.ChangeSpeedView_smallDividerUnitNum, 9);
        this.LLJLILLLLZIIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ChangeSpeedView_speedHandleMaskedColor, 0);
        this.LLJLL = typedArrayObtainStyledAttributes.getColor(R$styleable.ChangeSpeedView_speedHandleColor, ColorProtector.parseColor("#181718"));
        this.LLJLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ChangeSpeedView_speedHandleRadius, C390810FTz.LIZ(9.0f));
        this.LLJL = typedArrayObtainStyledAttributes.getColor(R$styleable.ChangeSpeedView_speedHandleStrokeColor, -1);
        this.LLJLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ChangeSpeedView_speedHandleStrokeWidth, C390810FTz.LIZ(3.0f));
        this.LLLF = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ChangeSpeedView_needText, true);
        this.LLLFF = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ChangeSpeedView_needHapticFeedBack, true);
        this.LLLFFI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ChangeSpeedView_isTextDown, true);
        this.LLLFZ = typedArrayObtainStyledAttributes.getInteger(R$styleable.ChangeSpeedView_fractionLength, 1);
        this.LLLI = typedArrayObtainStyledAttributes.getFloat(R$styleable.ChangeSpeedView_leftOffset, 0.1f);
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setShadowLayer(C390810FTz.LIZ(1.0f), 0.0f, 0.0f, 1073741824);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setShadowLayer(C390810FTz.LIZ(3.0f), 0.0f, 0.0f, 1073741824);
        paint3.setColor(color);
        paint3.setAntiAlias(true);
        paint3.setTextSize(fLIZ);
        paint4.setColor(color);
        paint4.setAntiAlias(true);
        paint4.setTextSize(fLIZ);
        this.LLJLLL = getSelectBitmap();
        this.LLJZ = new Rect(0, 0, this.LLJLLL.getWidth(), this.LLJLLL.getHeight());
        this.LLL = ((this.LLJLLL.getWidth() + this.LLJLLL.getHeight()) - 2) / 4.0f;
    }

    public final boolean LJ(float f, int i) {
        InterfaceC370580Efw interfaceC370580Efw;
        int iLIZJ = LIZJ(f);
        int iLIZ = LIZ(iLIZJ);
        this.LLJILJILJ = iLIZ;
        if (this.LLJILJIL != iLIZJ) {
            if (this.LLLFF) {
                Iterator<Float> it2 = this.LLLIIII.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Float next = it2.next();
                    if (((int) (next.floatValue() * 100)) == iLIZ) {
                        if (next != null) {
                            getHapticFeedback().LIZ(this, C0E4C.VIBRATE_IMPACT_LIGHT);
                        }
                    }
                }
            }
            InterfaceC370580Efw interfaceC370580Efw2 = this.LLLIIIIL;
            if (interfaceC370580Efw2 != null && !interfaceC370580Efw2.LIZJ()) {
                this.LLJJI = Boolean.FALSE;
            } else {
                this.LLJILJIL = iLIZJ;
                InterfaceC370580Efw interfaceC370580Efw3 = this.LLLIIIIL;
                if (interfaceC370580Efw3 != null) {
                    interfaceC370580Efw3.LIZIZ();
                }
                if (i == 2 && (interfaceC370580Efw = this.LLLIIIIL) != null) {
                    interfaceC370580Efw.LIZLLL(LIZIZ(), this.LLJILJILJ);
                }
                this.LLJJI = Boolean.TRUE;
            }
        }
        Boolean bool = this.LLJJI;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370570Efv.onMeasure(int, int):void");
    }
}
