package X;

import Y.ARunnableS106S0000000_33;
import Y.ARunnableS37S0201000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19P4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19P4 extends View {
    public static Drawable LLLLLIL;
    public int LL;
    public int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public final int LLJJ;
    public final float LLJJI;
    public final float LLJJIII;
    public final int LLJJIJI;
    public final Paint LLJJIJIIJIL;
    public final Paint LLJJIJIL;
    public final Paint LLJJJ;
    public final Paint LLJJJIL;
    public final Paint LLJJJJ;
    public final Paint LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public final RectF LLJJL;
    public final RectF LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public String LLJLILLLLZIIL;
    public float LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public final Rect LLJZIJLIL;
    public C19P5 LLL;
    public String LLLF;
    public final float LLLFF;
    public final float LLLFFI;
    public final float LLLFZ;
    public final float LLLI;
    public int LLLII;
    public final float LLLIIII;
    public final float LLLIIIIL;
    public final int LLLIIIL;
    public final boolean LLLIIL;
    public final float LLLIILIL;
    public final int LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public int LLLIZZ;
    public Boolean LLLJ;
    public boolean LLLJIL;
    public ValueAnimator LLLJL;
    public boolean LLLL;
    public final int LLLLII;
    public final C19P6 LLLLIIIILLL;
    public int LLLLIIL;
    public String LLLLIILL;
    public final boolean LLLLIILLL;
    public float LLLLIL;
    public final BPEAHandler LLLLILI;
    public final ARunnableS106S0000000_33 LLLLJ;
    public ARunnableS37S0201000_33 LLLLJI;
    public InterfaceC769710UHh LLLLL;

    public final boolean LIZIZ() {
        if (this.LLLILZLLLI != 0) {
            return true;
        }
        int i = this.LLLIZZ;
        return (i == 0 || i == 100) ? false : true;
    }

    public final void LIZLLL() {
        this.LLJILJIL = this.LL / 2;
        if (this.LLILZIL) {
            this.LLJILJILJ = (int) C497740JfY.LIZIZ(32.0f);
        } else {
            this.LLJILJILJ = ((int) (this.LLILLJJLI - this.LLJI)) / 2;
        }
        this.LLJILLL = (this.LL - (this.LLLIILIL * 2.0f)) / this.LLLILZ;
        this.LLJZ = true;
        invalidate();
    }

    public final void LJ() {
        if (this.LLILZIL) {
            HandlerHook.viewRemoveCallbacks(this, this.LLLLIIIILLL);
            if (this.LLLL || TextUtils.isEmpty(this.LLJLILLLLZIIL)) {
                return;
            }
            ValueAnimator valueAnimator = this.LLLJL;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.LLLJL.cancel();
            }
            this.LLJJJJJIL.setShadowLayer((int) C497740JfY.LIZIZ(3.0f), this.LLJJI, this.LLJJIII, this.LLJJIJI);
            setTextAlpha(255);
            this.LLLL = true;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void buildDrawingCache() {
        super.buildDrawingCache();
    }

    public int getPercent() {
        return this.LLJL;
    }

    public final int LIZ(int i) {
        int i2;
        int i3;
        int i4 = this.LLLIL;
        if (i4 > 1) {
            if (i % i4 >= i4 / 2.0f) {
                i3 = (i / i4) + 1;
            } else {
                i3 = i / i4;
            }
            i = i3 * i4;
        }
        if (i > this.LLLILZ) {
            i2 = this.LLLILZJ;
        } else if (i <= 0) {
            i2 = this.LLLILZLLLI;
        } else {
            i2 = i + this.LLLILZLLLI;
        }
        if (LIZIZ()) {
            int i5 = this.LLLIZZ;
            if (i2 > i5 - 1 && i2 < i5 + 1) {
                return i5;
            }
        }
        return i2;
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        super.buildDrawingCache(z);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String strValueOf;
        Paint paint;
        int i;
        int i2;
        super.onDraw(canvas);
        if (!this.LLJZ) {
            return;
        }
        int i3 = this.LLJL;
        int i4 = this.LLLILZLLLI;
        float f = this.LLLIILIL;
        float f2 = this.LLJILLL;
        float f3 = f + ((i3 - i4) * f2);
        float f4 = ((this.LLLIZZ - i4) * f2) + f;
        int i5 = this.LLJILJILJ;
        this.LLJJL.set((int) f, i5, (int) (this.LL - f), i5 + this.LLJI);
        RectF rectF = this.LLJJL;
        float f5 = this.LLJ;
        canvas.drawRoundRect(rectF, f5, f5, this.LLJJIJIL);
        if (this.LLLJ.booleanValue()) {
            RectF rectF2 = this.LLJJJJLIIL;
            float f6 = this.LLLIILIL;
            int i6 = this.LLJILJILJ;
            rectF2.set(f6, i6, f3, i6 + this.LLJI);
            RectF rectF3 = this.LLJJJJLIIL;
            float f7 = this.LLJ;
            canvas.drawRoundRect(rectF3, f7, f7, this.LLJJIJIIJIL);
        } else {
            RectF rectF4 = this.LLJJJJLIIL;
            int i7 = this.LLJILJILJ;
            rectF4.set(f3, i7, f4, i7 + this.LLJI);
            canvas.drawRect(this.LLJJJJLIIL, this.LLJJIJIIJIL);
        }
        this.LLJJJ.setAlpha(255);
        this.LLJJJIL.setAlpha(255);
        this.LLJJJJJIL.setAlpha(255);
        this.LLJJJJ.setAlpha(255);
        if (this.LLLIIL) {
            canvas.drawCircle(f3, this.LLJILJILJ + (this.LLJI / 2.0f), this.LLLFFI, this.LLJJJ);
            int i8 = this.LLLIZZ;
            if (i8 >= this.LLLILZLLLI && i8 <= this.LLLILZJ && LIZIZ()) {
                canvas.drawCircle(f4, this.LLJILJILJ + (this.LLJI / 2.0f), (int) C497740JfY.LIZIZ(4.0f), this.LLJJJIL);
            }
        } else {
            RectF rectF5 = this.LLJJLIIIJLLLLLLLZ;
            float f8 = this.LLLFZ;
            int i9 = this.LLJILJILJ;
            float f9 = this.LLLI;
            float f10 = this.LLJI;
            rectF5.set(f3 - (f8 / 2.0f), i9 - ((f9 - f10) / 2.0f), (f8 / 2.0f) + f3, i9 + ((f9 + f10) / 2.0f));
            RectF rectF6 = this.LLJJLIIIJLLLLLLLZ;
            float f11 = this.LLLFFI;
            canvas.drawRoundRect(rectF6, f11, f11, this.LLJJJ);
            int i10 = this.LLLIZZ;
            if (i10 >= this.LLLILZLLLI && i10 <= this.LLLILZJ && LIZIZ()) {
                float f12 = this.LLLIIII;
                int i11 = this.LLJILJILJ;
                canvas.drawRect(f4 - (f12 / 2.0f), i11, f4 + (f12 / 2.0f), i11 + this.LLLIIIIL, this.LLJJJIL);
            }
        }
        int i12 = this.LLLLII;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.LLJL;
        }
        if (this.LLILZIL) {
            if (this.LLLLIL == 0.0f) {
                strValueOf = String.valueOf(i12);
            } else {
                strValueOf = this.LLLLIILL;
                if (strValueOf == null) {
                    strValueOf = "";
                }
            }
            if (!TextUtils.isEmpty(this.LLLF) && !TextUtils.isEmpty(strValueOf)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLLF);
                sbLIZ.append(" ");
                sbLIZ.append(strValueOf);
                this.LLJLILLLLZIIL = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                this.LLJLILLLLZIIL = strValueOf;
            }
            if (TextUtils.isEmpty(this.LLJLILLLLZIIL)) {
                return;
            }
            if (this.LLLJIL) {
                paint = this.LLJJJJJIL;
            } else {
                paint = this.LLJJJJ;
            }
            Paint paint2 = this.LLJJJJ;
            String str = this.LLJLILLLLZIIL;
            paint2.getTextBounds(str, 0, str.length(), this.LLJZIJLIL);
            int iWidth = this.LLJZIJLIL.width();
            int iLIZIZ = (int) C497740JfY.LIZIZ(14.0f);
            if (this.LLLJIL) {
                i = this.LLJILJIL;
            } else {
                i = (int) f3;
            }
            int iLIZIZ2 = (i - (iWidth / 2)) - ((int) C497740JfY.LIZIZ(1.0f));
            int i13 = this.LLJILJILJ - iLIZIZ;
            Drawable drawable = LLLLLIL;
            if (!this.LLLJIL && drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int iMax = Math.max(iWidth, intrinsicWidth);
                float f13 = this.LLLLIL;
                if (f13 == 1.0f) {
                    i2 = this.LLLLIIL;
                    iMax += intrinsicWidth;
                } else if (f13 > 0.0f) {
                    iMax = (int) (((int) (((iMax - intrinsicWidth) * f13) + r1)) + (intrinsicWidth * f13));
                    i2 = 255;
                } else {
                    i2 = this.LLLLIIL;
                }
                float fLIZIZ = this.LLJILJILJ - ((int) C497740JfY.LIZIZ(57.0f));
                drawable.setAlpha(i2);
                drawable.setBounds(0, 0, iMax, drawable.getIntrinsicHeight());
                canvas.save();
                canvas.translate(i - (iMax / 2.0f), fLIZIZ);
                drawable.draw(canvas);
                canvas.restore();
            }
            if (C497740JfY.LJJ()) {
                paint.setTextScaleX(-1.0f);
                iLIZIZ2 += iWidth + ((int) C497740JfY.LIZIZ(1.0f));
            } else {
                paint.setTextScaleX(1.0f);
            }
            float f14 = this.LLLLIL;
            if (f14 > 0.0f && f14 < 1.0f) {
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.LLLLIL * 255.0f));
                canvas.drawText(this.LLJLILLLLZIIL, iLIZIZ2, i13, paint);
                paint.setAlpha(alpha);
                return;
            }
            canvas.drawText(this.LLJLILLLLZIIL, iLIZIZ2, i13, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19P4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setLevelAdjustBarTitle(String str) {
        this.LLLF = str;
    }

    public void setOnLevelChangeListener(C19P8 c19p8) {
        this.LLL = new C19P5(this, c19p8);
    }

    public void setPercent(int i) {
        this.LLJL = i;
        invalidate();
    }

    public void setTextAlpha(int i) {
        this.LLLLIIL = i;
        this.LLJJJJJIL.setAlpha(i);
        this.LLJJJJ.setAlpha(i);
    }

    public void setTextInCenter(boolean z) {
        this.LLLJIL = z;
    }

    public void setUpUiColor(boolean z) {
        this.LLJJIJIIJIL.setColor(this.LLIZ);
        if (z) {
            this.LLJJIJIIJIL.setShadowLayer((int) C497740JfY.LIZIZ(1.0f), 0.0f, 0.0f, this.LLJIJIL);
        }
        this.LLJJIJIL.setColor(this.LLIZLLLIL);
        if (z) {
            this.LLJJIJIL.setShadowLayer((int) C497740JfY.LIZIZ(1.0f), 0.0f, 0.0f, this.LLJIJIL);
        }
        this.LLJJJ.setColor(this.LLLII);
        if (z) {
            this.LLJJJ.setShadowLayer((int) C497740JfY.LIZIZ(3.0f), 0.0f, 0.0f, this.LLJIJIL);
        }
        this.LLJJJIL.setColor(this.LLLIIIL);
        this.LLJJJJ.setColor(this.LLJJ);
        this.LLJJJJJIL.setColor(this.LLIZ);
        setTextAlpha(this.LLLLIIL);
        if (LLLLLIL == null) {
            LLLLLIL = getResources().getDrawable(R.drawable.e4u);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        InterfaceC769710UHh interfaceC769710UHh = this.LLLLL;
        if (interfaceC769710UHh != null) {
            interfaceC769710UHh.LJIIJJI(visibility, i);
        }
    }

    public void setVisibilityListener(InterfaceC769710UHh interfaceC769710UHh) {
        this.LLLLL = interfaceC769710UHh;
    }

    public C19P4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = (int) C497740JfY.LIZIZ(9.0f);
        this.LLILZ = (int) C497740JfY.LIZIZ(10.0f);
        this.LLILZIL = true;
        this.LLILZLL = true;
        this.LLJI = 0.0f;
        this.LLJJJJLIIL = new RectF();
        this.LLJJL = new RectF();
        this.LLJJLIIIJLLLLLLLZ = new RectF();
        this.LLJLLL = true;
        this.LLJZ = false;
        this.LLJZIJLIL = new Rect();
        this.LLLF = null;
        this.LLLFF = 0.0f;
        this.LLLFFI = 0.0f;
        this.LLLFZ = 0.0f;
        this.LLLI = 0.0f;
        this.LLLII = 0;
        this.LLLIIII = 0.0f;
        this.LLLIIIIL = 0.0f;
        this.LLLIIIL = 0;
        this.LLLIIL = true;
        this.LLLIILIL = (int) C497740JfY.LIZIZ(40.0f);
        this.LLLJ = Boolean.TRUE;
        this.LLLJIL = false;
        this.LLLL = true;
        this.LLLLII = Integer.MIN_VALUE;
        this.LLLLIIIILLL = new C19P6(this);
        this.LLLLIIL = 0;
        this.LLLLIILLL = true;
        this.LLLLIL = 0.1f;
        this.LLLLILI = new BPEAHandler(Looper.getMainLooper());
        this.LLLLJ = new ARunnableS106S0000000_33(0);
        this.LLLLJI = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_AdjustPercentBar);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ttlive_AdjustPercentBar_ttlive_text);
            this.LLLF = strXd == null ? "" : strXd;
            typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_AdjustPercentBar_ttlive_textColor, -16777216);
            this.LLLFF = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_textSize, (int) C497740JfY.LIZIZ(14.0f));
            this.LLLIILIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_bar_padding, (int) C497740JfY.LIZIZ(40.0f));
            this.LLLFFI = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_thumb_radius, (int) C497740JfY.LIZIZ(9.0f));
            this.LLLFZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_thumb_width, (int) C497740JfY.LIZIZ(9.0f));
            this.LLLI = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_thumb_height, (int) C497740JfY.LIZIZ(9.0f));
            this.LLLII = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_AdjustPercentBar_ttlive_thumb_color, C497740JfY.LJFF(R.color.aas));
            typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_default_thumb_radius, (int) C497740JfY.LIZIZ(9.0f));
            this.LLLIIII = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_default_thumb_width, (int) C497740JfY.LIZIZ(9.0f));
            this.LLLIIIIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_default_thumb_height, (int) C497740JfY.LIZIZ(9.0f));
            this.LLLIIIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_AdjustPercentBar_ttlive_default_thumb_color, C497740JfY.LJFF(R.color.aas));
            this.LLLIIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ttlive_AdjustPercentBar_ttlive_circle_thumb, true);
            this.LLJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_bar_height, (int) C497740JfY.LIZIZ(4.0f));
            this.LLLIL = typedArrayObtainStyledAttributes.getInt(R$styleable.ttlive_AdjustPercentBar_ttlive_step, 1);
            this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_AdjustPercentBar_ttlive_bar_color, C497740JfY.LJFF(R.color.aas));
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_AdjustPercentBar_ttlive_bar_hint_color, C497740JfY.LJFF(R.color.aat));
            this.LLJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_AdjustPercentBar_ttlive_bar_round_radius, (int) C497740JfY.LIZIZ(3.0f));
            this.LLILZIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ttlive_AdjustPercentBar_ttlive_show_text, true);
            this.LLILZLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ttlive_AdjustPercentBar_ttlive_support_click, true);
            this.LLJJI = typedArrayObtainStyledAttributes.getFloat(R$styleable.ttlive_AdjustPercentBar_ttlive_shadow_dx, 0.0f);
            this.LLJJIII = typedArrayObtainStyledAttributes.getFloat(R$styleable.ttlive_AdjustPercentBar_ttlive_shadow_dy, 0.0f);
            this.LLJJIJI = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_AdjustPercentBar_ttlive_shadow_color, 1073741824);
            typedArrayObtainStyledAttributes.recycle();
        }
        setLayerType(1, null);
        this.LLJIJIL = 1073741824;
        C497740JfY.LJFF(R.color.dr);
        this.LLJJ = C497740JfY.LJFF(R.color.aas);
        Paint paint = new Paint();
        this.LLJJIJIIJIL = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LLJJIJIL = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.LLJJJ = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.LLJJJIL = paint4;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.LLJJJJ = paint5;
        paint5.setTextSize(this.LLLFF);
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.LLJJJJJIL = paint6;
        paint6.setTextSize(this.LLLFF);
        paint6.setAntiAlias(true);
        if (C497740JfY.LJJ()) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setScaleX(-1.0f);
        }
        setUpUiColor(true);
    }

    public final void LIZJ(int i, int i2, int i3, boolean z) {
        this.LLLILZJ = i;
        this.LLLILZLLLI = i2;
        if (i3 <= i && i3 >= i2) {
            this.LLLIZZ = i3;
        } else {
            this.LLLIZZ = i;
        }
        this.LLLILZ = i - i2;
        this.LLLJ = Boolean.valueOf(z);
        if (this.LL > 0 && this.LLILLJJLI > 0) {
            LIZLLL();
        }
        invalidate();
        this.LLLLIILL = null;
        this.LLLLIL = 0.0f;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLJJLI != getMeasuredHeight() || this.LL != getMeasuredWidth()) {
            this.LL = getMeasuredWidth();
            this.LLILLJJLI = getMeasuredHeight();
            LIZLLL();
        }
    }
}
