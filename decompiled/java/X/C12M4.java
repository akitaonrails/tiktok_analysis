package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.12M4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12M4 extends View {
    public static final int LLLIIIL = Color.rgb(0, 150, 136);
    public int LL;
    public int LLILLJJLI;
    public TextPaint LLILLL;
    public C444890HcV LLILZ;
    public C444890HcV LLILZIL;
    public Rect LLILZLL;
    public C12M8[] LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public String LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public int[] LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public RectF LLJJJJ;
    public Rect LLJJJJJIL;
    public int LLJJJJLIIL;
    public Scroller LLJJL;
    public Scroller LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public VelocityTracker LLL;
    public C12MA LLLF;
    public C12M9 LLLFF;
    public Set<String> LLLFFI;
    public int LLLFZ;
    public final float LLLI;
    public String[] LLLII;
    public boolean LLLIIII;
    public int LLLIIIIL;

    public final void LIZ() {
        if (this.LLJJLIIIJLLLLLLLZ.isFinished()) {
            this.LLJLL = 0;
            int iRound = (this.LLIZLLLIL + (Math.round((getMTextYAxisArray()[0].LIZIZ - this.LLIZLLLIL) / this.LLJZ) * this.LLJZ)) - getMTextYAxisArray()[0].LIZIZ;
            if (iRound != 0) {
                this.LLJJLIIIJLLLLLLLZ.startScroll(0, 0, 0, iRound, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }
        }
    }

    public final void LIZLLL() {
        C444890HcV c444890HcV = new C444890HcV();
        this.LLILZ = c444890HcV;
        c444890HcV.LIZ(this.LLJILJIL);
        this.LLILZ.setTextSize(this.LLJIJIL);
        this.LLILZ.setColor(this.LLJI);
        this.LLILZ.setFlags(1);
        this.LLILZ.setTextAlign(Paint.Align.CENTER);
        C444890HcV c444890HcV2 = new C444890HcV();
        this.LLILZIL = c444890HcV2;
        c444890HcV2.LIZ(this.LLJILJIL);
        this.LLILZIL.setTextSize(this.LLJIJIL);
        this.LLILZIL.setColor(this.LLJI);
        this.LLILZIL.setFlags(1);
        this.LLILZIL.setTextAlign(Paint.Align.CENTER);
        this.LLILZIL.setAlpha(127);
        TextPaint textPaint = new TextPaint();
        this.LLILLL = textPaint;
        textPaint.setTextSize(this.LLJJIJIIJIL);
        this.LLILLL.setColor(this.LLJJIJI);
        this.LLILLL.setFlags(1);
        this.LLILLL.setTextAlign(Paint.Align.LEFT);
    }

    public final void LJ() {
        int i = 0;
        if (this.LLLIIII) {
            this.LLLIIIIL = getMTextYAxisArray().length / 2;
            int length = getMTextYAxisArray().length;
            while (i < length) {
                getMTextYAxisArray()[i] = new C12M8((this.LLJJJ - 3) + i, this.LLIZLLLIL + (this.LLJZ * i));
                i++;
            }
            return;
        }
        int length2 = getMTextYAxisArray().length;
        while (i < length2) {
            C12M8 c12m8 = new C12M8((this.LLJJJ - 3) + i, this.LLIZLLLIL + (this.LLJZ * i));
            if (c12m8.LIZ > getMNumberArray().length - 1) {
                c12m8.LIZ -= getMNumberArray().length;
            } else {
                int i2 = c12m8.LIZ;
                if (i2 < 0) {
                    c12m8.LIZ = i2 + getMNumberArray().length;
                }
            }
            getMTextYAxisArray()[i] = c12m8;
            i++;
        }
    }

    public final void LJI() {
        int i = this.LLJILJILJ;
        if (i < 0 || this.LLJILLL < 0) {
            "number can not be negative".toString();
            throw new IllegalArgumentException("number can not be negative");
        }
        if (i > this.LLJILLL) {
            this.LLJILLL = i;
        }
        if (this.LLJJ < i) {
            this.LLJJ = i;
        }
        int i2 = this.LLJJ;
        int i3 = this.LLJILLL;
        if (i2 > i3) {
            this.LLJJ = i3;
        }
        setMNumberArray(new int[(i3 - i) + 1]);
        int length = getMNumberArray().length;
        for (int i4 = 0; i4 < length; i4++) {
            getMNumberArray()[i4] = this.LLJILJILJ + i4;
        }
        this.LLJJJ = this.LLJJ - this.LLJILJILJ;
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.LLJJL;
        if (scroller.isFinished()) {
            scroller = this.LLJJLIIIJLLLLLLLZ;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.LLJLLIL = currY;
        int i = currY - this.LLJLL;
        this.LLJLLL = i;
        LIZIZ(i);
        invalidate();
        this.LLJLL = this.LLJLLIL;
    }

    public final int[] getMNumberArray() {
        int[] iArr = this.LLJJIJIL;
        if (iArr != null) {
            return iArr;
        }
        return null;
    }

    public final C12M8[] getMTextYAxisArray() {
        C12M8[] c12m8Arr = this.LLIZ;
        if (c12m8Arr != null) {
            return c12m8Arr;
        }
        return null;
    }

    public final void LIZJ() {
        LJI();
        LIZLLL();
        this.LLILZLL = new Rect();
        this.LLJJJJJIL = new Rect();
        int length = String.valueOf(this.LLJILLL).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        String string = sb.toString();
        this.LLILZ.getTextBounds(string, 0, string.length(), this.LLILZLL);
        String str = this.LLJJIII;
        if (str != null) {
            this.LLILLL.getTextBounds(str, 0, str.length(), this.LLJJJJJIL);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Method method = C19737612Kg.LIZ;
        this.LLJJJIL = viewConfiguration.getScaledPagingTouchSlop();
        this.LLJL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLJLIL = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.LLJJL = new Scroller(getContext(), null);
        this.LLJJLIIIJLLLLLLLZ = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
    }

    public final Scroller getMAdjustScroller() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getMBackgroundColor() {
        return this.LLJLILLLLZIIL;
    }

    public final boolean getMCanScroll() {
        return this.LLJZIJLIL;
    }

    public final int getMCurrNumIndex() {
        return this.LLJJJ;
    }

    public final int getMCurrTextYAxisIndex() {
        return this.LLLIIIIL;
    }

    public final int getMCurrY() {
        return this.LLJLLIL;
    }

    public final Set<String> getMDrawedText() {
        return this.LLLFFI;
    }

    public final int getMEndNumber() {
        return this.LLJILLL;
    }

    public final int getMEndYPos() {
        return this.LLJ;
    }

    public final String getMFlagText() {
        return this.LLJJIII;
    }

    public final int getMFlagTextColor() {
        return this.LLJJIJI;
    }

    public final TextPaint getMFlagTextPaint() {
        return this.LLILLL;
    }

    public final float getMFlagTextSize() {
        return this.LLJJIJIIJIL;
    }

    public final Scroller getMFlingScroller() {
        return this.LLJJL;
    }

    public final int getMFont() {
        return this.LLJILJIL;
    }

    public final int getMHeight() {
        return this.LLILLJJLI;
    }

    public final int getMOffsetY() {
        return this.LLJLLL;
    }

    public final C12M9 getMOnRecurrentLoopListener() {
        return this.LLLFF;
    }

    public final C12MA getMOnValueChangeListener() {
        return this.LLLF;
    }

    public final int getMRowNumber() {
        return this.LLLFZ;
    }

    public final int getMSpacing() {
        return this.LLJZ;
    }

    public final int getMStartNumber() {
        return this.LLJILJILJ;
    }

    public final int getMStartY() {
        return this.LLJLL;
    }

    public final int getMStartYPos() {
        return this.LLIZLLLIL;
    }

    public final String[] getMTextArray() {
        return this.LLLII;
    }

    public final Rect getMTextBounds() {
        return this.LLILZLL;
    }

    public final Rect getMTextBoundsFlag() {
        return this.LLJJJJJIL;
    }

    public final int getMTextColor() {
        return this.LLJI;
    }

    public final float getMTextSize() {
        return this.LLJIJIL;
    }

    public final int getMTouchAction() {
        return this.LLJJJJLIIL;
    }

    public final C444890HcV getMTuxPaint() {
        return this.LLILZ;
    }

    public final C444890HcV getMTuxShadowPaint() {
        return this.LLILZIL;
    }

    public final int getMVerticalSpacing() {
        return this.LLJJI;
    }

    public final int getMWidth() {
        return this.LL;
    }

    public C12M4(Context context) {
        super(context, null, 0);
        this.LLJJJJLIIL = 3;
        this.LLLFFI = new HashSet();
        float f = getResources().getDisplayMetrics().density;
        this.LLLI = f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.NumberWheelPicker, 0, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.a1h, typedValue, true);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.NumberWheelPicker_numberTextColor, typedValue.data);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberWheelPicker_numberTextSize, 17.0f * f);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberWheelPicker_numberArrayStartNumber, 0);
        this.LLJILLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberWheelPicker_numberArrayEndNumber, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberWheelPicker_numberArrayCurrentNumber, 0);
        this.LLJJI = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberWheelPicker_numberRowVerticalSpacing, 40 * f);
        this.LLJJIII = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NumberWheelPicker_numberFlagText);
        this.LLJJIJI = typedArrayObtainStyledAttributes.getColor(R$styleable.NumberWheelPicker_numberFlagTextColor, LLLIIIL);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberWheelPicker_numberFlagTextSize, f * 12.0f);
        this.LLLFZ = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberWheelPicker_numberRowNumber, 5);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.NumberWheelPicker_tux_font, 31);
        typedArrayObtainStyledAttributes.recycle();
        LIZJ();
        setMTextYAxisArray(new C12M8[this.LLLFZ + 4]);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r7) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12M4.LIZIZ(int):void");
    }

    public final void LJFF(int i) {
        this.LLJJ = i;
        LJI();
        LJ();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String strValueOf;
        C444890HcV c444890HcV;
        int i = this.LLJLILLLLZIIL;
        if (i != 0) {
            canvas.drawColor(i);
        }
        if (this.LLJJIII != null) {
            canvas.drawText(this.LLJJIII, (int) (((this.LL + this.LLILZLL.width()) / 2) + (this.LLLI * 4)), ((this.LLILLJJLI / 2) + (this.LLILZLL.height() / 2)) - 4, this.LLILLL);
        }
        int length = getMTextYAxisArray().length;
        for (int i2 = 0; i2 < length; i2++) {
            if (getMTextYAxisArray()[i2].LIZ >= 0 && getMTextYAxisArray()[i2].LIZ <= this.LLJILLL - this.LLJILJILJ) {
                if (getMTextYAxisArray()[i2].LIZ >= 0 && getMTextYAxisArray()[i2].LIZ < getMNumberArray().length) {
                    String[] strArr = this.LLLII;
                    if (strArr != null) {
                        strValueOf = strArr[getMTextYAxisArray()[i2].LIZ];
                    } else {
                        strValueOf = String.valueOf(getMNumberArray()[getMTextYAxisArray()[i2].LIZ]);
                    }
                } else {
                    strValueOf = "";
                }
                if (!this.LLLFFI.contains(strValueOf)) {
                    float f = this.LL / 2;
                    float fHeight = getMTextYAxisArray()[i2].LIZIZ + (this.LLILZLL.height() / 2);
                    if (getMTextYAxisArray()[i2].LIZ == this.LLJJJ) {
                        c444890HcV = this.LLILZ;
                    } else {
                        c444890HcV = this.LLILZIL;
                    }
                    canvas.drawText(strValueOf, f, fHeight, c444890HcV);
                    this.LLLFFI.add(strValueOf);
                }
            }
        }
        this.LLLFFI.clear();
        if (1 == this.LLJJJJLIIL && this.LLJJL.isFinished()) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.LLL == null) {
            this.LLL = VelocityTracker.obtain();
        }
        this.LLL.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        this.LLJJJJLIIL = actionMasked;
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.LLJLL = (int) motionEvent.getY();
            if (!this.LLJJL.isFinished() || !this.LLJJLIIIJLLLLLLLZ.isFinished()) {
                this.LLJJL.forceFinished(true);
                this.LLJJLIIIJLLLLLLLZ.forceFinished(true);
            }
        } else {
            if (2 == actionMasked) {
                int y = (int) motionEvent.getY();
                this.LLJLLIL = y;
                int i = y - this.LLJLL;
                this.LLJLLL = i;
                if (!this.LLJZIJLIL && Math.abs(i) < this.LLJJJIL) {
                    return false;
                }
                this.LLJZIJLIL = true;
                int i2 = this.LLJLLL;
                int i3 = this.LLJJJIL;
                if (i2 > i3) {
                    this.LLJLLL = i2 - i3;
                } else if (i2 < (-i3)) {
                    this.LLJLLL = i2 + i3;
                }
                this.LLJLL = this.LLJLLIL;
                LIZIZ(this.LLJLLL);
                invalidate();
                return true;
            }
            if (1 == actionMasked) {
                this.LLJZIJLIL = false;
                VelocityTracker velocityTracker = this.LLL;
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJLIL);
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.LLJL) {
                    if (yVelocity > 0) {
                        int i4 = (int) (this.LLJIJIL * 10);
                        this.LLJLL = 0;
                        this.LLJJL.fling(0, 0, 0, yVelocity, 0, 0, 0, i4);
                    } else if (yVelocity < 0) {
                        int i5 = (int) (this.LLJIJIL * 10);
                        this.LLJLL = i5;
                        this.LLJJL.fling(0, i5, 0, yVelocity, 0, 0, 0, i5);
                    }
                    invalidate();
                } else {
                    LIZ();
                    invalidate();
                }
                this.LLL.recycle();
                this.LLL = null;
                return true;
            }
        }
        return true;
    }

    public final void setMAdjustScroller(Scroller scroller) {
        this.LLJJLIIIJLLLLLLLZ = scroller;
    }

    public final void setMBackgroundColor(int i) {
        this.LLJLILLLLZIIL = i;
    }

    public final void setMCanScroll(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setMCurrNumIndex(int i) {
        this.LLJJJ = i;
    }

    public final void setMCurrTextYAxisIndex(int i) {
        this.LLLIIIIL = i;
    }

    public final void setMCurrY(int i) {
        this.LLJLLIL = i;
    }

    public final void setMDrawedText(Set<String> set) {
        this.LLLFFI = set;
    }

    public final void setMEndNumber(int i) {
        this.LLJILLL = i;
    }

    public final void setMEndYPos(int i) {
        this.LLJ = i;
    }

    public final void setMFlagText(String str) {
        this.LLJJIII = str;
    }

    public final void setMFlagTextColor(int i) {
        this.LLJJIJI = i;
    }

    public final void setMFlagTextPaint(TextPaint textPaint) {
        this.LLILLL = textPaint;
    }

    public final void setMFlagTextSize(float f) {
        this.LLJJIJIIJIL = f;
    }

    public final void setMFlingScroller(Scroller scroller) {
        this.LLJJL = scroller;
    }

    public final void setMFont(int i) {
        this.LLJILJIL = i;
    }

    public final void setMHeight(int i) {
        this.LLILLJJLI = i;
    }

    public final void setMNumberArray(int[] iArr) {
        this.LLJJIJIL = iArr;
    }

    public final void setMOffsetY(int i) {
        this.LLJLLL = i;
    }

    public final void setMOnRecurrentLoopListener(C12M9 c12m9) {
        this.LLLFF = c12m9;
    }

    public final void setMOnValueChangeListener(C12MA c12ma) {
        this.LLLF = c12ma;
    }

    public final void setMRowNumber(int i) {
        this.LLLFZ = i;
    }

    public final void setMSpacing(int i) {
        this.LLJZ = i;
    }

    public final void setMStartNumber(int i) {
        this.LLJILJILJ = i;
    }

    public final void setMStartY(int i) {
        this.LLJLL = i;
    }

    public final void setMStartYPos(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setMTextArray(String[] strArr) {
        this.LLLII = strArr;
    }

    public final void setMTextBounds(Rect rect) {
        this.LLILZLL = rect;
    }

    public final void setMTextBoundsFlag(Rect rect) {
        this.LLJJJJJIL = rect;
    }

    public final void setMTextColor(int i) {
        this.LLJI = i;
    }

    public final void setMTextSize(float f) {
        this.LLJIJIL = f;
    }

    public final void setMTextYAxisArray(C12M8[] c12m8Arr) {
        this.LLIZ = c12m8Arr;
    }

    public final void setMTouchAction(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setMTuxPaint(C444890HcV c444890HcV) {
        this.LLILZ = c444890HcV;
    }

    public final void setMTuxShadowPaint(C444890HcV c444890HcV) {
        this.LLILZIL = c444890HcV;
    }

    public final void setMVerticalSpacing(int i) {
        this.LLJJI = i;
    }

    public final void setMWidth(int i) {
        this.LL = i;
    }

    public final void setNonRecurrent(boolean z) {
        this.LLLIIII = z;
        LJ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = this.LLILZLL.width() + getPaddingLeft() + getPaddingRight() + this.LLJJJJJIL.width() + 6;
        }
        this.LL = size;
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + (this.LLLFZ * this.LLILZLL.height()) + ((this.LLLFZ - 1) * this.LLJJI) + getPaddingTop();
        }
        this.LLILLJJLI = size2;
        setMeasuredDimension(this.LL, size2);
        if (this.LLJJJJ == null) {
            RectF rectF = new RectF();
            this.LLJJJJ = rectF;
            rectF.left = 0.0f;
            rectF.right = this.LL;
            rectF.top = ((this.LLILLJJLI - this.LLILZLL.height()) - this.LLJJI) / 2;
            RectF rectF2 = this.LLJJJJ;
            int iHeight = this.LLILLJJLI + this.LLILZLL.height();
            int i3 = this.LLJJI;
            rectF2.bottom = (iHeight + i3) / 2;
            int iHeight2 = i3 + this.LLILZLL.height();
            this.LLJZ = iHeight2;
            int i4 = this.LLILLJJLI;
            this.LLIZLLLIL = (i4 / 2) - (iHeight2 * 3);
            this.LLJ = (i4 / 2) + (iHeight2 * 3);
            LJ();
        }
    }
}
