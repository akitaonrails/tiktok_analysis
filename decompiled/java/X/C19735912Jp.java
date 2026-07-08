package X;

import Y.ALAdapterS24S0100000_29;
import Y.AUListenerS19S0102000_29;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12Jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19735912Jp extends View {
    public static final /* synthetic */ int LLLIL = 0;
    public Context LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public String LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public Paint LLJL;
    public Paint LLJLIL;
    public Paint LLJLILLLLZIIL;
    public Paint LLJLL;
    public Paint LLJLLIL;
    public Paint LLJLLL;
    public Paint LLJZ;
    public String LLJZIJLIL;
    public int LLL;
    public Rect LLLF;
    public boolean LLLFF;
    public Drawable LLLFFI;
    public Drawable LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public final C01GW LLLIIL;
    public C19736112Jr LLLIILIL;

    public final C19736012Jq getMPercentCalculator() {
        return (C19736012Jq) this.LLLIIL.getValue();
    }

    public final void LIZIZ() {
        this.LLLIIIL = (int) C11VU.LIZIZ(32.0f, getContext());
        this.LLJI = (this.LLLIIII - (this.LLJJIJIIJIL * 2)) / this.LLILZ;
        this.LLLII = true;
        invalidate();
    }

    public final float getMAttrsBarPadding() {
        return this.LLJJIJIIJIL;
    }

    public final float getMAttrsLineWidth() {
        return this.LLJJIJI;
    }

    public final float getMAttrsSlideRadius() {
        return this.LLJJIII;
    }

    public final String getMAttrsText() {
        return this.LLJILLL;
    }

    public final int getMAttrsTextColor() {
        return this.LLJJ;
    }

    public final float getMAttrsTextSize() {
        return this.LLJJI;
    }

    public final int getMBarLocationY() {
        return this.LLLIIIL;
    }

    public final int getMColorBlack() {
        return this.LLJJJIL;
    }

    public final int getMColorBlackHint() {
        return this.LLJJJJ;
    }

    public final int getMColorCircle() {
        return this.LLJJL;
    }

    public final int getMColorText() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getMColorTextShadow() {
        return this.LLJJJJJIL;
    }

    public final int getMColorTransparent() {
        return this.LLJJJJLIIL;
    }

    public final int getMColorWhite() {
        return this.LLJJIJIL;
    }

    public final int getMColorWhiteHint() {
        return this.LLJJJ;
    }

    public final Context getMContext() {
        return this.LL;
    }

    public final int getMCurSelectPercent() {
        return this.LLILZLL;
    }

    public final float getMCurSelectPoint() {
        return this.LLJILJILJ;
    }

    public final float getMCurTouchPoint() {
        return this.LLJILJIL;
    }

    public final int getMDefaultPercent() {
        return this.LLIZLLLIL;
    }

    public final boolean getMHasInit() {
        return this.LLLII;
    }

    public final int getMMaxPercent() {
        return this.LLILLL;
    }

    public final int getMMinPercent() {
        return this.LLILLJJLI;
    }

    public final boolean getMNeedShowSuggestPercentCircle() {
        return this.LLJIJIL;
    }

    public final int getMOriginPercent() {
        return this.LLILZIL;
    }

    public final Paint getMPaintBar() {
        return this.LLJL;
    }

    public final Paint getMPaintBarHint() {
        return this.LLJLIL;
    }

    public final Paint getMPaintCircle() {
        return this.LLJLILLLLZIIL;
    }

    public final Paint getMPaintDefaultCircle() {
        return this.LLJLL;
    }

    public final Paint getMPaintSuggestCircle() {
        return this.LLJZ;
    }

    public final Paint getMPaintTextCenter() {
        return this.LLJLLL;
    }

    public final Paint getMPaintTextFollow() {
        return this.LLJLLIL;
    }

    public final int getMPercentRange() {
        return this.LLILZ;
    }

    public final float getMPercentStep() {
        return this.LLJ;
    }

    public final float getMPercentStepLength() {
        return this.LLJI;
    }

    public final int getMSuggestPercent() {
        return this.LLIZ;
    }

    public final String getMText() {
        return this.LLJZIJLIL;
    }

    public final int getMTextAlpha() {
        return this.LLL;
    }

    public final Rect getMTextBounds() {
        return this.LLLF;
    }

    public final boolean getMTouchable() {
        return this.LLLI;
    }

    public final boolean getMUseBlackUi() {
        return this.LLLFF;
    }

    public final int getMViewHeight() {
        return this.LLLIIIIL;
    }

    public final int getMViewWidth() {
        return this.LLLIIII;
    }

    public final int getMaxPercent() {
        return this.LLILLL;
    }

    public final int getMinPercent() {
        return this.LLILLJJLI;
    }

    public final int getPercent() {
        return this.LLILZLL;
    }

    public final Drawable getSTextBlackBg() {
        return this.LLLFZ;
    }

    public final Drawable getSTextWhiteBg() {
        return this.LLLFFI;
    }

    public final int getSuggestPercent() {
        return this.LLIZ;
    }

    private final void setCurrentPercent(int i) {
        setPercent(i);
        invalidate();
        sendAccessibilityEvent(4);
    }

    private final void setTextAlpha(int i) {
        this.LLL = i;
        this.LLJLLL.setAlpha(i);
        this.LLJLLIL.setAlpha(i);
    }

    public final void LIZJ(boolean z) {
        this.LLJL.setColor(this.LLJJIJIL);
        if (z) {
            this.LLJL.setShadowLayer(C11VU.LIZIZ(1.0f, getContext()), 0.0f, 0.0f, this.LLJJJJJIL);
        }
        this.LLJLIL.setColor(this.LLJJJ);
        if (z) {
            this.LLJLIL.setShadowLayer(C11VU.LIZIZ(1.0f, getContext()), 0.0f, 0.0f, this.LLJJJJJIL);
        }
        this.LLJLILLLLZIIL.setColor(this.LLJJL);
        if (z) {
            this.LLJLILLLLZIIL.setShadowLayer(C11VU.LIZIZ(3.0f, getContext()), 0.0f, 0.0f, this.LLJJJJJIL);
        }
        this.LLJLL.setColor(this.LLJJIJIL);
        this.LLJZ.setColor(getResources().getColor(R.color.white));
        this.LLJLLIL.setColor(this.LLJJLIIIJLLLLLLLZ);
        this.LLJLLL.setColor(this.LLJJIJIL);
        setTextAlpha(this.LLL);
        this.LLLFF = false;
        if (this.LLLFFI == null) {
            this.LLLFFI = getResources().getDrawable(com.zhiliaoapp.musically.R.drawable.a7_);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.LLLII) {
            return;
        }
        float fLIZ = getMPercentCalculator().LIZ(this.LLILZLL);
        float fLIZ2 = getMPercentCalculator().LIZ(this.LLIZLLLIL);
        float fLIZ3 = getMPercentCalculator().LIZ(this.LLIZ);
        getMPercentCalculator().LIZ(this.LLILZIL);
        float f = this.LLJJIJIIJIL;
        float f2 = this.LLLIIIL;
        canvas.drawLine(f, f2, this.LLLIIII - f, f2, this.LLJLIL);
        int i = this.LLIZLLLIL;
        if (this.LLLIIII / 2 == fLIZ2) {
            if (i < 0) {
                float f3 = this.LLLIIIL;
                canvas2 = canvas;
                canvas2.drawLine(fLIZ, f3, fLIZ2, f3, this.LLJL);
            } else {
                float f4 = this.LLLIIIL;
                canvas2 = canvas;
                canvas2.drawLine(fLIZ2, f4, fLIZ, f4, this.LLJL);
            }
        } else {
            float f5 = this.LLLIIIL;
            canvas2 = canvas;
            canvas2.drawLine(fLIZ2, f5, fLIZ, f5, this.LLJL);
        }
        this.LLJLILLLLZIIL.setAlpha(255);
        this.LLJLL.setAlpha(255);
        this.LLJZ.setAlpha(255);
        this.LLJLLL.setAlpha(255);
        this.LLJLLIL.setAlpha(255);
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        int i4 = this.LLIZLLLIL;
        if (i2 <= i4 && i4 <= i3) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i2 != 0 || (i4 != i2 && i4 != i3))) {
            canvas2.drawCircle(fLIZ2, this.LLLIIIL, C11VU.LIZIZ(2.0f, getContext()), this.LLJLL);
        }
        int i5 = this.LLILLJJLI;
        int i6 = this.LLILLL;
        int i7 = this.LLIZ;
        if (i5 <= i7 && i7 <= i6 && this.LLJIJIL) {
            canvas2.drawCircle(fLIZ3, this.LLLIIIL, C11VU.LIZIZ(3.0f, getContext()), this.LLJZ);
        }
        canvas2.drawCircle(fLIZ, this.LLLIIIL, this.LLJJIII, this.LLJLILLLLZIIL);
        String strValueOf = String.valueOf(this.LLILZLL);
        if (!TextUtils.isEmpty(this.LLJILLL) && !TextUtils.isEmpty(strValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJILLL);
            sbLIZ.append(' ');
            sbLIZ.append(strValueOf);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLJZIJLIL = strValueOf;
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        Paint paint = this.LLJLLIL;
        String str = this.LLJZIJLIL;
        paint.getTextBounds(str, 0, str.length(), this.LLLF);
        int iWidth = this.LLLF.width();
        int iLIZIZ = (int) C11VU.LIZIZ(14.0f, getContext());
        int i8 = (int) fLIZ;
        int iLIZIZ2 = (i8 - (iWidth / 2)) - ((int) C11VU.LIZIZ(1.0f, getContext()));
        int i9 = this.LLLIIIL - iLIZIZ;
        if (this.LLLFF) {
            drawable = this.LLLFZ;
        } else {
            drawable = this.LLLFFI;
        }
        if (drawable != null) {
            int iMax = Math.max(iWidth, drawable.getIntrinsicWidth());
            int i10 = this.LLL;
            float f6 = i8 - (iMax / 2.0f);
            float fLIZIZ = this.LLLIIIL - C11VU.LIZIZ(57.0f, getContext());
            drawable.setAlpha(i10);
            drawable.setBounds(0, 0, iMax, drawable.getIntrinsicHeight());
            canvas2.save();
            canvas2.translate(f6, fLIZIZ);
            drawable.draw(canvas2);
            canvas2.restore();
        }
        canvas2.drawText(this.LLJZIJLIL, iLIZIZ2, i9, paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        }
        if (isEnabled()) {
            if (this.LLILZLL > this.LLILLJJLI) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (this.LLILZLL < this.LLILLL) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, this.LLILLJJLI, this.LLILLL, this.LLILZLL));
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C19736112Jr c19736112Jr;
        if (!this.LLLI) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getX() < this.LLJJIJIIJIL - C11VU.LIZIZ(10.0f, getContext()) || motionEvent.getX() > ScreenUtils.getScreenWidth(C786410Ut5.N3(getContext())) - (this.LLJJIJIIJIL - C11VU.LIZIZ(10.0f, getContext()))) {
                return false;
            }
            if (Math.abs(motionEvent.getY() - this.LLLIIIL) > this.LLLIIIIL - this.LLLIIIL) {
                return true;
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (c19736112Jr = this.LLLIILIL) != null) {
                        c19736112Jr.LIZ(this.LLILZLL);
                    }
                } else {
                    this.LLJILJIL = motionEvent.getX();
                    this.LLJILJILJ = motionEvent.getX();
                    int iLIZIZ = getMPercentCalculator().LIZIZ(this.LLJILJILJ);
                    if (iLIZIZ != this.LLILZLL) {
                        this.LLILZLL = iLIZIZ;
                        C19736112Jr c19736112Jr2 = this.LLLIILIL;
                        if (c19736112Jr2 != null) {
                            c19736112Jr2.LIZJ(iLIZIZ);
                        }
                        invalidate();
                    }
                }
            } else {
                this.LLJILJIL = motionEvent.getX();
                int iLIZIZ2 = getMPercentCalculator().LIZIZ(this.LLJILJIL);
                if (this.LLILZLL != iLIZIZ2) {
                    this.LLILZLL = iLIZIZ2;
                    C19736112Jr c19736112Jr3 = this.LLLIILIL;
                    if (c19736112Jr3 != null) {
                        c19736112Jr3.LIZJ(iLIZIZ2);
                    }
                    int i = this.LLILZLL;
                    this.LLLI = false;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setTarget(this);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS19S0102000_29(i, iLIZIZ2, this, 0));
                    valueAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(this, 6));
                    valueAnimatorOfFloat.setDuration(50L);
                    valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfFloat.start();
                }
                C19736112Jr c19736112Jr4 = this.LLLIILIL;
                if (c19736112Jr4 != null) {
                    c19736112Jr4.LIZ(this.LLILZLL);
                }
            }
        } else {
            this.LLJILJIL = motionEvent.getX();
            C19736112Jr c19736112Jr5 = this.LLLIILIL;
            if (c19736112Jr5 != null) {
                c19736112Jr5.LIZLLL();
            }
        }
        C19736112Jr c19736112Jr6 = this.LLLIILIL;
        if (c19736112Jr6 != null) {
            c19736112Jr6.LIZIZ();
        }
        return true;
    }

    public void setBarHeight(float f) {
        this.LLJL.setStrokeWidth(f);
        this.LLJLIL.setStrokeWidth(f);
    }

    public final void setBarPadding(float f) {
        this.LLJJIJIIJIL = f;
        LIZIZ();
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        try {
            Field declaredField = View.class.getDeclaredField("mContentDescription");
            declaredField.setAccessible(true);
            declaredField.set(this, charSequence);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            super.setContentDescription(charSequence);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            super.setContentDescription(charSequence);
        }
    }

    public final void setDefaultCircleConfig(int i) {
        this.LLJLL.setColor(getResources().getColor(i));
    }

    public final void setMAttrsBarPadding(float f) {
        this.LLJJIJIIJIL = f;
    }

    public final void setMAttrsLineWidth(float f) {
        this.LLJJIJI = f;
    }

    public final void setMAttrsSlideRadius(float f) {
        this.LLJJIII = f;
    }

    public final void setMAttrsText(String str) {
        this.LLJILLL = str;
    }

    public final void setMAttrsTextColor(int i) {
        this.LLJJ = i;
    }

    public final void setMAttrsTextSize(float f) {
        this.LLJJI = f;
    }

    public final void setMBarLocationY(int i) {
        this.LLLIIIL = i;
    }

    public final void setMColorBlack(int i) {
        this.LLJJJIL = i;
    }

    public final void setMColorBlackHint(int i) {
        this.LLJJJJ = i;
    }

    public final void setMColorCircle(int i) {
        this.LLJJL = i;
    }

    public final void setMColorText(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public final void setMColorTextShadow(int i) {
        this.LLJJJJJIL = i;
    }

    public final void setMColorTransparent(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setMColorWhite(int i) {
        this.LLJJIJIL = i;
    }

    public final void setMColorWhiteHint(int i) {
        this.LLJJJ = i;
    }

    public final void setMContext(Context context) {
        this.LL = context;
    }

    public final void setMCurSelectPercent(int i) {
        this.LLILZLL = i;
    }

    public final void setMCurSelectPoint(float f) {
        this.LLJILJILJ = f;
    }

    public final void setMCurTouchPoint(float f) {
        this.LLJILJIL = f;
    }

    public final void setMDefaultPercent(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setMHasInit(boolean z) {
        this.LLLII = z;
    }

    public final void setMMaxPercent(int i) {
        this.LLILLL = i;
    }

    public final void setMMinPercent(int i) {
        this.LLILLJJLI = i;
    }

    public final void setMNeedShowSuggestPercentCircle(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setMOriginPercent(int i) {
        this.LLILZIL = i;
    }

    public final void setMPaintBar(Paint paint) {
        this.LLJL = paint;
    }

    public final void setMPaintBarHint(Paint paint) {
        this.LLJLIL = paint;
    }

    public final void setMPaintCircle(Paint paint) {
        this.LLJLILLLLZIIL = paint;
    }

    public final void setMPaintDefaultCircle(Paint paint) {
        this.LLJLL = paint;
    }

    public final void setMPaintSuggestCircle(Paint paint) {
        this.LLJZ = paint;
    }

    public final void setMPaintTextCenter(Paint paint) {
        this.LLJLLL = paint;
    }

    public final void setMPaintTextFollow(Paint paint) {
        this.LLJLLIL = paint;
    }

    public final void setMPercentRange(int i) {
        this.LLILZ = i;
    }

    public final void setMPercentStep(float f) {
        this.LLJ = f;
    }

    public final void setMPercentStepLength(float f) {
        this.LLJI = f;
    }

    public final void setMSuggestPercent(int i) {
        this.LLIZ = i;
    }

    public final void setMText(String str) {
        this.LLJZIJLIL = str;
    }

    public final void setMTextAlpha(int i) {
        this.LLL = i;
    }

    public final void setMTextBounds(Rect rect) {
        this.LLLF = rect;
    }

    public final void setMTouchable(boolean z) {
        this.LLLI = z;
    }

    public final void setMUseBlackUi(boolean z) {
        this.LLLFF = z;
    }

    public final void setMViewHeight(int i) {
        this.LLLIIIIL = i;
    }

    public final void setMViewWidth(int i) {
        this.LLLIIII = i;
    }

    public final void setNeedShowSuggestCircle(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setOnLevelChangeListener(InterfaceC19736212Js interfaceC19736212Js) {
        this.LLLIILIL = new C19736112Jr(interfaceC19736212Js);
    }

    public final void setPercent(int i) {
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            C19736112Jr c19736112Jr = this.LLLIILIL;
            if (c19736112Jr != null) {
                c19736112Jr.LIZJ(i);
            }
            invalidate();
        }
    }

    public final void setSTextBlackBg(Drawable drawable) {
        this.LLLFZ = drawable;
    }

    public final void setSTextWhiteBg(Drawable drawable) {
        this.LLLFFI = drawable;
    }

    public final void setSuggestCircleColor(int i) {
        this.LLJZ.setColor(getResources().getColor(i));
    }

    public final void setSuggestPercent(int i) {
        this.LLIZ = i;
    }

    public final void setTextSize(float f) {
        this.LLJLLL.setTextSize(f);
        this.LLJLLIL.setTextSize(f);
    }

    public C19735912Jp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJIJIL = true;
        this.LLJJIJIIJIL = C11VU.LIZIZ(40.0f, context);
        this.LLJL = new Paint();
        this.LLJLIL = new Paint();
        this.LLJLILLLLZIIL = new Paint();
        this.LLJLL = new Paint();
        this.LLJLLIL = new Paint();
        this.LLJLLL = new Paint();
        this.LLJZ = new Paint();
        this.LLJZIJLIL = "";
        this.LLLF = new Rect();
        this.LLLI = true;
        this.LLLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 519));
        this.LL = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BeautySeekBar);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.BeautySeekBar_beauty_text);
            this.LLJILLL = strXd != null ? strXd : "";
            this.LLJJ = typedArrayObtainStyledAttributes.getColor(R$styleable.BeautySeekBar_beauty_textColor, -16777216);
            this.LLJJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.BeautySeekBar_beauty_textSize, C11VU.LIZIZ(14.0f, context));
            this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.BeautySeekBar_beauty_bar_padding, C11VU.LIZIZ(40.0f, context));
            this.LLJJIII = typedArrayObtainStyledAttributes.getDimension(R$styleable.BeautySeekBar_beauty_sliderRadius, C11VU.LIZIZ(9.0f, context));
            this.LLJJIJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.BeautySeekBar_beauty_lineWidth, C11VU.LIZIZ(4.0f, context));
            this.LLJ = typedArrayObtainStyledAttributes.getFloat(R$styleable.BeautySeekBar_beauty_step, 1.0f);
            this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getColor(R$styleable.BeautySeekBar_beauty_followTextColor, getResources().getColor(R.color.white));
            typedArrayObtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.LLJJIJIL = R.color.white;
            this.LLJJJ = 1040187391;
            this.LLJJJIL = com.zhiliaoapp.musically.R.color.fw;
            this.LLJJJJ = com.zhiliaoapp.musically.R.color.fh;
            this.LLJJJJJIL = 1073741824;
            this.LLJJJJLIIL = com.zhiliaoapp.musically.R.color.a1d;
            this.LLJJL = R.color.white;
            this.LLJL.setStyle(Paint.Style.FILL);
            this.LLJL.setStrokeWidth(this.LLJJIJI);
            this.LLJL.setStrokeCap(Paint.Cap.ROUND);
            this.LLJL.setAntiAlias(true);
            this.LLJLIL.setStyle(Paint.Style.FILL);
            this.LLJLIL.setStrokeWidth(this.LLJJIJI);
            this.LLJLIL.setStrokeCap(Paint.Cap.ROUND);
            this.LLJLIL.setAntiAlias(true);
            this.LLJLILLLLZIIL.setStyle(Paint.Style.FILL);
            this.LLJLILLLLZIIL.setAntiAlias(true);
            this.LLJLL.setStyle(Paint.Style.FILL);
            this.LLJLL.setAntiAlias(true);
            this.LLJZ.setStyle(Paint.Style.FILL);
            this.LLJZ.setAntiAlias(true);
            this.LLJLLIL.setTextSize(this.LLJJI);
            this.LLJLLIL.setAntiAlias(true);
            this.LLJLLL.setTextSize(this.LLJJI);
            this.LLJLLL.setAntiAlias(true);
            LIZJ(true);
            setImportantForAccessibility(1);
            setFocusable(true);
            setFocusableInTouchMode(true);
            setClickable(true);
            if (Build.VERSION.SDK_INT >= 26) {
                setFocusedByDefault(true);
            }
        }
        setImportantForAccessibility(1);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setFocusedByDefault(true);
        }
    }

    public final void LIZ(int i, int i2) {
        int i3;
        this.LLILLL = i;
        this.LLILLJJLI = i2;
        if (i >= 0 && i2 <= 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this.LLIZLLLIL = i3;
        this.LLILZ = i - i2;
        this.LLILZIL = 0;
        if (this.LLLIIII > 0 && this.LLLIIIIL > 0) {
            LIZIZ();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!isEnabled()) {
            return false;
        }
        if (i != 4096 && i != 8192) {
            if (i != 16908349) {
                return super.performAccessibilityAction(i, bundle);
            }
            if (Build.VERSION.SDK_INT < 24 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            setCurrentPercent((int) bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            return true;
        }
        int iMax = Math.max(1, Math.round((this.LLILLL - this.LLILLJJLI) / 20));
        if (i == 8192) {
            iMax = -iMax;
        }
        setCurrentPercent(this.LLILZLL + iMax);
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLLIIIIL != getMeasuredHeight() || this.LLLIIII != getMeasuredWidth()) {
            this.LLLIIII = getMeasuredWidth();
            this.LLLIIIIL = getMeasuredHeight();
            LIZIZ();
        }
    }
}
