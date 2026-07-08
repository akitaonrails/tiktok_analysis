package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import android.widget.SeekBar;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.ranges.IntRange;
import u4.q0;

/* JADX INFO: renamed from: X.12KT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KT extends View {
    public static final int LLLL = Color.rgb(0, 150, 136);
    public static final int LLLLII = Color.rgb(0, 150, 136);
    public int LL;
    public int LLILLJJLI;
    public TextPaint LLILLL;
    public TextPaint LLILZ;
    public TextPaint LLILZIL;
    public float LLILZLL;
    public Locale LLIZ;
    public Paint LLIZLLLIL;
    public Paint LLJ;
    public Rect LLJI;
    public C12KU[] LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public Path LLJJJJLIIL;
    public int LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public float LLJLIL;
    public int[] LLJLILLLLZIIL;
    public String[] LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public RectF LLJZ;
    public Rect LLJZIJLIL;
    public int LLL;
    public Scroller LLLF;
    public Scroller LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public boolean LLLIIL;
    public VelocityTracker LLLIILIL;
    public InterfaceC19318310hx LLLIL;
    public Set<String> LLLILZ;
    public int LLLILZJ;
    public final float LLLILZLLLI;
    public String[] LLLIZZ;
    public boolean LLLJ;
    public int LLLJIL;
    public boolean LLLJL;

    static {
        Color.rgb(255, 255, 255);
    }

    private final String getCurrentText() {
        String str;
        String[] strArr = this.LLLIZZ;
        if (strArr != null && (str = strArr[this.LLJLLIL]) != null) {
            return str;
        }
        Integer numLJJIIJ = C13LQ.LJJIIJ(this.LLJLLIL, getMNumberArray());
        return numLJJIIJ != null ? numLJJIIJ.toString() : "";
    }

    private final String[] getLocalizedNumberStringArray() {
        IntRange intRange = new IntRange(this.LLJJIII, this.LLJJIJI);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRange, 10));
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZJ(((AbstractC2098408Jy) it2).nextInt()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void LIZ() {
        if (this.LLLFF.isFinished()) {
            this.LLLII = 0;
            int iRound = (this.LLJILJIL + (Math.round((getMTextYAxisArray()[0].LIZIZ - this.LLJILJIL) / this.LLLIIIL) * this.LLLIIIL)) - getMTextYAxisArray()[0].LIZIZ;
            if (iRound != 0) {
                this.LLLFF.startScroll(0, 0, 0, iRound, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }
        }
    }

    public final void LIZLLL() {
        int i = 0;
        if (this.LLLJ) {
            this.LLLJIL = getMTextYAxisArray().length / 2;
            int length = getMTextYAxisArray().length;
            while (i < length) {
                getMTextYAxisArray()[i] = new C12KU((this.LLJLLIL - 3) + i, this.LLJILJIL + (this.LLLIIIL * i));
                i++;
            }
            return;
        }
        int length2 = getMTextYAxisArray().length;
        while (i < length2) {
            C12KU c12ku = new C12KU((this.LLJLLIL - 3) + i, this.LLJILJIL + (this.LLLIIIL * i));
            if (c12ku.LIZ > getMNumberArray().length - 1) {
                c12ku.LIZ -= getMNumberArray().length;
            } else {
                int i2 = c12ku.LIZ;
                if (i2 < 0) {
                    c12ku.LIZ = i2 + getMNumberArray().length;
                }
            }
            getMTextYAxisArray()[i] = c12ku;
            i++;
        }
    }

    public final void LJI() {
        int i = this.LLJJIII;
        if (i < 0 || this.LLJJIJI < 0) {
            "number can not be negative".toString();
            throw new IllegalArgumentException("number can not be negative");
        }
        if (i > this.LLJJIJI) {
            this.LLJJIJI = i;
        }
        if (this.LLJJIJIIJIL < i) {
            this.LLJJIJIIJIL = i;
        }
        int i2 = this.LLJJIJIIJIL;
        int i3 = this.LLJJIJI;
        if (i2 > i3) {
            this.LLJJIJIIJIL = i3;
        }
        setMNumberArray(new int[(i3 - i) + 1]);
        this.LLJLL = getLocalizedNumberStringArray();
        int length = getMNumberArray().length;
        for (int i4 = 0; i4 < length; i4++) {
            getMNumberArray()[i4] = this.LLJJIII + i4;
        }
        this.LLJLLIL = this.LLJJIJIIJIL - this.LLJJIII;
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.LLLF;
        if (scroller.isFinished()) {
            scroller = this.LLLFF;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.LLLIIII = currY;
        int i = currY - this.LLLII;
        this.LLLIIIIL = i;
        LIZIZ(i);
        invalidate();
        this.LLLII = this.LLLIIII;
    }

    public final int[] getMNumberArray() {
        int[] iArr = this.LLJLILLLLZIIL;
        if (iArr != null) {
            return iArr;
        }
        return null;
    }

    public final C12KU[] getMTextYAxisArray() {
        C12KU[] c12kuArr = this.LLJIJIL;
        if (c12kuArr != null) {
            return c12kuArr;
        }
        return null;
    }

    public final float getCornerRadius() {
        return this.LLILZLL;
    }

    public final int getEndNumber() {
        return this.LLJJIJI;
    }

    public final Paint getHighlightPaint() {
        return this.LLJ;
    }

    public final Locale getLocale() {
        return this.LLIZ;
    }

    public final Scroller getMAdjustScroller() {
        return this.LLLFF;
    }

    public final int getMBackgroundColor() {
        return this.LLLI;
    }

    public final boolean getMCanScroll() {
        return this.LLLIIL;
    }

    public final int getMCurrNumIndex() {
        return this.LLJLLIL;
    }

    public final int getMCurrTextYAxisIndex() {
        return this.LLLJIL;
    }

    public final int getMCurrY() {
        return this.LLLIIII;
    }

    public final int getMCurrentNumber() {
        return this.LLJJIJIIJIL;
    }

    public final int getMDividerColor() {
        return this.LLJJ;
    }

    public final float getMDividerLength() {
        return this.LLJJJ;
    }

    public final Paint getMDividerLinePaint() {
        return this.LLIZLLLIL;
    }

    public final float getMDividerStroke() {
        return this.LLJJIJIL;
    }

    public final Set<String> getMDrawedText() {
        return this.LLLILZ;
    }

    public final int getMEndNumber() {
        return this.LLJJIJI;
    }

    public final int getMEndYPos() {
        return this.LLJILJILJ;
    }

    public final String getMFlagText() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getMFlagTextColor() {
        return this.LLJL;
    }

    public final TextPaint getMFlagTextPaint() {
        return this.LLILZ;
    }

    public final float getMFlagTextSize() {
        return this.LLJLIL;
    }

    public final Scroller getMFlingScroller() {
        return this.LLLF;
    }

    public final int getMHeight() {
        return this.LLILLJJLI;
    }

    public final RectF getMHighLightRect() {
        return this.LLJZ;
    }

    public final int getMOffsetY() {
        return this.LLLIIIIL;
    }

    public final InterfaceC19318310hx getMOnValueChangeListener() {
        return this.LLLIL;
    }

    public final int getMRowNumber() {
        return this.LLLILZJ;
    }

    public final int getMSpacing() {
        return this.LLLIIIL;
    }

    public final int getMStartNumber() {
        return this.LLJJIII;
    }

    public final int getMStartY() {
        return this.LLLII;
    }

    public final int getMStartYPos() {
        return this.LLJILJIL;
    }

    public final String[] getMTextArray() {
        return this.LLLIZZ;
    }

    public final Rect getMTextBounds() {
        return this.LLJI;
    }

    public final Rect getMTextBoundsFlag() {
        return this.LLJZIJLIL;
    }

    public final int getMTextColor() {
        return this.LLJILLL;
    }

    public final TextPaint getMTextPaint() {
        return this.LLILLL;
    }

    public final TextPaint getMTextShadowPaint() {
        return this.LLILZIL;
    }

    public final float getMTextSize() {
        return this.LLJJI;
    }

    public final int getMTouchAction() {
        return this.LLL;
    }

    public final int getMVerticalSpacing() {
        return this.LLJJL;
    }

    public final int getMWidth() {
        return this.LL;
    }

    public final Path getPath() {
        return this.LLJJJJLIIL;
    }

    public final boolean getRoundedCornerEnd() {
        return this.LLJJJJJIL;
    }

    public final boolean getRoundedCornerStart() {
        return this.LLJJJJ;
    }

    public final int getStartNumber() {
        return this.LLJJIII;
    }

    public final boolean getUseHighlight() {
        return this.LLJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r7) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12KT.LIZIZ(int):void");
    }

    public final String LIZJ(int i) {
        NumberFormat numberFormat = NumberFormat.getInstance(this.LLIZ);
        numberFormat.setGroupingUsed(false);
        return numberFormat.format(Integer.valueOf(i));
    }

    public final void LJ(int i) {
        this.LLJJIJIIJIL = i;
        LJI();
        LIZLLL();
        invalidate();
    }

    public final void LJFF(int i) {
        this.LLJJIJI = i;
        LJI();
        LIZLLL();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        TextPaint textPaint;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int iHeight;
        canvas.drawColor(this.LLLI);
        float f8 = 0.0f;
        if (this.LLJJJIL) {
            if (this.LLJZ == null) {
                Rect rect = this.LLJI;
                if (rect != null) {
                    iHeight = rect.height();
                } else {
                    iHeight = 0;
                }
                int i2 = iHeight + this.LLJJL;
                int height = getHeight() / 2;
                int i3 = i2 / 2;
                this.LLJZ = new RectF(0.0f, height - i3, getWidth(), height + i3);
            }
            RectF rectF = this.LLJZ;
            if (rectF == null) {
                rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            }
            Path path = this.LLJJJJLIIL;
            float[] fArr = new float[8];
            boolean z = this.LLJJJJ;
            if (z) {
                f = this.LLILZLL;
            } else {
                f = 0.0f;
            }
            fArr[0] = f;
            if (z) {
                f2 = this.LLILZLL;
            } else {
                f2 = 0.0f;
            }
            fArr[1] = f2;
            boolean z2 = this.LLJJJJJIL;
            if (z2) {
                f3 = this.LLILZLL;
            } else {
                f3 = 0.0f;
            }
            fArr[2] = f3;
            if (z2) {
                f4 = this.LLILZLL;
            } else {
                f4 = 0.0f;
            }
            fArr[3] = f4;
            if (z2) {
                f5 = this.LLILZLL;
            } else {
                f5 = 0.0f;
            }
            fArr[4] = f5;
            if (z2) {
                f6 = this.LLILZLL;
            } else {
                f6 = 0.0f;
            }
            fArr[5] = f6;
            if (z) {
                f7 = this.LLILZLL;
            } else {
                f7 = 0.0f;
            }
            fArr[6] = f7;
            if (z) {
                f8 = this.LLILZLL;
            }
            fArr[7] = f8;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            Path path2 = this.LLJJJJLIIL;
            Paint paint = this.LLJ;
            if (paint == null) {
                paint = new Paint();
            }
            canvas.drawPath(path2, paint);
        } else {
            if (this.LLJJJ == 0.0f) {
                this.LLJJJ = this.LL;
            }
            float f9 = this.LLJJJ;
            int i4 = this.LL;
            if (f9 > i4) {
                f9 = i4;
            }
            float f10 = f9 / 2;
            float f11 = (i4 / 2) - f10;
            float f12 = f10 + (i4 / 2);
            RectF rectF2 = this.LLJZ;
            if (rectF2 != null) {
                float f13 = rectF2.top;
                Paint paint2 = this.LLIZLLLIL;
                if (paint2 == null) {
                    paint2 = new Paint();
                }
                canvas.drawLine(f11, f13, f12, f13, paint2);
                float f14 = rectF2.bottom;
                Paint paint3 = this.LLIZLLLIL;
                if (paint3 == null) {
                    paint3 = new Paint();
                }
                canvas.drawLine(f11, f14, f12, f14, paint3);
            }
        }
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            canvas.drawText(this.LLJJLIIIJLLLLLLLZ, (int) (((this.LL + this.LLJI.width()) / 2) + (this.LLLILZLLLI * 4)), ((this.LLILLJJLI / 2) + (this.LLJI.height() / 2)) - 4, this.LLILZ);
        }
        int length = getMTextYAxisArray().length;
        for (int i5 = 0; i5 < length; i5++) {
            if (getMTextYAxisArray()[i5].LIZ >= 0 && getMTextYAxisArray()[i5].LIZ <= this.LLJJIJI - this.LLJJIII) {
                if (getMTextYAxisArray()[i5].LIZ >= 0 && getMTextYAxisArray()[i5].LIZ < getMNumberArray().length) {
                    String[] strArr = this.LLLIZZ;
                    if (strArr != null) {
                        str = strArr[getMTextYAxisArray()[i5].LIZ];
                    } else {
                        String[] strArr2 = this.LLJLL;
                        C12KU c12ku = getMTextYAxisArray()[i5];
                        if (c12ku != null) {
                            i = c12ku.LIZ;
                        } else {
                            i = 0;
                        }
                        str = strArr2[i];
                    }
                } else {
                    str = "";
                }
                this.LLLILZ.contains(str);
                float f15 = this.LL / 2;
                float fHeight = getMTextYAxisArray()[i5].LIZIZ + (this.LLJI.height() / 2);
                if (getMTextYAxisArray()[i5].LIZ == this.LLJLLIL) {
                    textPaint = this.LLILLL;
                } else {
                    textPaint = this.LLILZIL;
                }
                canvas.drawText(str, f15, fHeight, textPaint);
                this.LLLILZ.add(str);
            }
        }
        this.LLLILZ.clear();
        if (1 == this.LLL && this.LLLF.isFinished()) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setScrollable(true);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.LLLIILIL == null) {
            this.LLLIILIL = VelocityTracker.obtain();
        }
        this.LLLIILIL.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        this.LLL = actionMasked;
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.LLLII = (int) motionEvent.getY();
            if (!this.LLLF.isFinished() || !this.LLLFF.isFinished()) {
                this.LLLF.forceFinished(true);
                this.LLLFF.forceFinished(true);
            }
        } else {
            if (2 == actionMasked) {
                int y = (int) motionEvent.getY();
                this.LLLIIII = y;
                int i = y - this.LLLII;
                this.LLLIIIIL = i;
                if (!this.LLLIIL && Math.abs(i) < this.LLJLLL) {
                    return false;
                }
                this.LLLIIL = true;
                int i2 = this.LLLIIIIL;
                int i3 = this.LLJLLL;
                if (i2 > i3) {
                    this.LLLIIIIL = i2 - i3;
                } else if (i2 < (-i3)) {
                    this.LLLIIIIL = i2 + i3;
                }
                this.LLLII = this.LLLIIII;
                LIZIZ(this.LLLIIIIL);
                invalidate();
                return true;
            }
            if (1 == actionMasked) {
                this.LLLIIL = false;
                VelocityTracker velocityTracker = this.LLLIILIL;
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLLFZ);
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.LLLFFI) {
                    int i4 = Integer.MAX_VALUE;
                    if (yVelocity > 0) {
                        if (!this.LLLJL) {
                            i4 = (int) (this.LLJJI * 10);
                        }
                        this.LLLII = 0;
                        this.LLLF.fling(0, 0, 0, yVelocity, 0, 0, 0, i4);
                    } else if (yVelocity < 0) {
                        if (!this.LLLJL) {
                            i4 = (int) (this.LLJJI * 10);
                        }
                        this.LLLII = i4;
                        this.LLLF.fling(0, i4, 0, yVelocity, 0, 0, 0, i4);
                    }
                    invalidate();
                } else {
                    LIZ();
                    invalidate();
                }
                this.LLLIILIL.recycle();
                this.LLLIILIL = null;
                return true;
            }
        }
        return true;
    }

    public final void setCornerRadius(float f) {
        this.LLILZLL = f;
    }

    public final void setHighlightPaint(Paint paint) {
        this.LLJ = paint;
    }

    public final void setLocale(Locale locale) {
        this.LLIZ = locale;
    }

    public final void setMAdjustScroller(Scroller scroller) {
        this.LLLFF = scroller;
    }

    public final void setMBackgroundColor(int i) {
        this.LLLI = i;
    }

    public final void setMCanScroll(boolean z) {
        this.LLLIIL = z;
    }

    public final void setMCurrNumIndex(int i) {
        this.LLJLLIL = i;
    }

    public final void setMCurrTextYAxisIndex(int i) {
        this.LLLJIL = i;
    }

    public final void setMCurrY(int i) {
        this.LLLIIII = i;
    }

    public final void setMCurrentNumber(int i) {
        this.LLJJIJIIJIL = i;
    }

    public final void setMDividerColor(int i) {
        this.LLJJ = i;
    }

    public final void setMDividerLength(float f) {
        this.LLJJJ = f;
    }

    public final void setMDividerLinePaint(Paint paint) {
        this.LLIZLLLIL = paint;
    }

    public final void setMDividerStroke(float f) {
        this.LLJJIJIL = f;
    }

    public final void setMDrawedText(Set<String> set) {
        this.LLLILZ = set;
    }

    public final void setMEndNumber(int i) {
        this.LLJJIJI = i;
    }

    public final void setMEndYPos(int i) {
        this.LLJILJILJ = i;
    }

    public final void setMFlagText(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
    }

    public final void setMFlagTextColor(int i) {
        this.LLJL = i;
    }

    public final void setMFlagTextPaint(TextPaint textPaint) {
        this.LLILZ = textPaint;
    }

    public final void setMFlagTextSize(float f) {
        this.LLJLIL = f;
    }

    public final void setMFlingScroller(Scroller scroller) {
        this.LLLF = scroller;
    }

    public final void setMHeight(int i) {
        this.LLILLJJLI = i;
    }

    public final void setMHighLightRect(RectF rectF) {
        this.LLJZ = rectF;
    }

    public final void setMNumberArray(int[] iArr) {
        this.LLJLILLLLZIIL = iArr;
    }

    public final void setMOffsetY(int i) {
        this.LLLIIIIL = i;
    }

    public final void setMOnValueChangeListener(InterfaceC19318310hx interfaceC19318310hx) {
        this.LLLIL = interfaceC19318310hx;
    }

    public final void setMRowNumber(int i) {
        this.LLLILZJ = i;
    }

    public final void setMSpacing(int i) {
        this.LLLIIIL = i;
    }

    public final void setMStartNumber(int i) {
        this.LLJJIII = i;
    }

    public final void setMStartY(int i) {
        this.LLLII = i;
    }

    public final void setMStartYPos(int i) {
        this.LLJILJIL = i;
    }

    public final void setMTextArray(String[] strArr) {
        this.LLLIZZ = strArr;
    }

    public final void setMTextBounds(Rect rect) {
        this.LLJI = rect;
    }

    public final void setMTextBoundsFlag(Rect rect) {
        this.LLJZIJLIL = rect;
    }

    public final void setMTextColor(int i) {
        this.LLJILLL = i;
    }

    public final void setMTextPaint(TextPaint textPaint) {
        this.LLILLL = textPaint;
    }

    public final void setMTextShadowPaint(TextPaint textPaint) {
        this.LLILZIL = textPaint;
    }

    public final void setMTextSize(float f) {
        this.LLJJI = f;
    }

    public final void setMTextYAxisArray(C12KU[] c12kuArr) {
        this.LLJIJIL = c12kuArr;
    }

    public final void setMTouchAction(int i) {
        this.LLL = i;
    }

    public final void setMVerticalSpacing(int i) {
        this.LLJJL = i;
    }

    public final void setMWidth(int i) {
        this.LL = i;
    }

    public final void setNonRecurrent(boolean z) {
        this.LLLJ = z;
        LIZLLL();
    }

    public final void setPath(Path path) {
        this.LLJJJJLIIL = path;
    }

    public final void setRoundedCornerEnd(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setRoundedCornerStart(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setRoundedEnd(boolean z) {
        this.LLJJJJJIL = z;
        invalidate();
    }

    public final void setRoundedStart(boolean z) {
        this.LLJJJJ = z;
        invalidate();
    }

    public final void setUseHighlight(boolean z) {
        this.LLJJJIL = z;
    }

    public C12KT(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LLILZLL = 25.0f;
        this.LLIZ = Locale.getDefault();
        this.LLJJJJLIIL = new Path();
        this.LLJLL = new String[0];
        this.LLL = 3;
        this.LLLILZ = new HashSet();
        float f = getResources().getDisplayMetrics().density;
        this.LLLILZLLLI = f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NumberPicker, 0, 0);
        int i = R$styleable.NumberPicker_dateTextColor;
        int i2 = LLLL;
        this.LLJILLL = typedArrayObtainStyledAttributes.getColor(i, i2);
        this.LLJJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberPicker_dateTextSize, 32.0f * f);
        this.LLJJ = typedArrayObtainStyledAttributes.getColor(R$styleable.NumberPicker_dividerColor, i2);
        this.LLJJIII = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberPicker_startNumber, 0);
        this.LLJJIJI = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberPicker_endNumber, 0);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberPicker_currentNumber, 0);
        this.LLJJL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberPicker_verticalSpacing, 16 * f);
        this.LLJJLIIIJLLLLLLLZ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NumberPicker_flagText);
        this.LLJL = typedArrayObtainStyledAttributes.getColor(R$styleable.NumberPicker_flagTextColor, LLLLII);
        this.LLJLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberPicker_flagTextSize, 12.0f * f);
        this.LLLI = typedArrayObtainStyledAttributes.getColor(R$styleable.NumberPicker_backgroundColor, 0);
        this.LLLILZJ = typedArrayObtainStyledAttributes.getInteger(R$styleable.NumberPicker_rowNumber, 5);
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberPicker_dividerStroke, 2 * f);
        this.LLJJJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.NumberPicker_dividerLength, 0.0f);
        this.LLJJJJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NumberPicker_hasRoundedCornerStart, false);
        this.LLJJJJJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NumberPicker_hasRoundedCornerEnd, false);
        this.LLJJJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NumberPicker_useHighlight, false);
        typedArrayObtainStyledAttributes.recycle();
        LJI();
        TextPaint textPaint = new TextPaint();
        this.LLILLL = textPaint;
        textPaint.setTextSize(this.LLJJI);
        this.LLILLL.setColor(this.LLJILLL);
        this.LLILLL.setFlags(1);
        this.LLILLL.setTextAlign(Paint.Align.CENTER);
        TextPaint textPaint2 = new TextPaint(this.LLILLL);
        this.LLILZIL = textPaint2;
        textPaint2.setAlpha(77);
        TextPaint textPaint3 = new TextPaint();
        this.LLILZ = textPaint3;
        textPaint3.setTextSize(this.LLJLIL);
        this.LLILZ.setColor(this.LLJL);
        this.LLILZ.setFlags(1);
        this.LLILZ.setTextAlign(Paint.Align.LEFT);
        Paint paint = new Paint();
        this.LLIZLLLIL = paint;
        paint.setColor(this.LLJJ);
        this.LLIZLLLIL.setStyle(Paint.Style.STROKE);
        this.LLIZLLLIL.setStrokeWidth(this.LLJJIJIL);
        Paint paint2 = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -3355444;
        }
        paint2.setColor(iIntValue);
        paint2.setStyle(Paint.Style.FILL);
        this.LLJ = paint2;
        this.LLJI = new Rect();
        this.LLJZIJLIL = new Rect();
        int length = LIZJ(this.LLJJIJI).length();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(LIZJ(0));
        }
        String string = sb.toString();
        this.LLILLL.getTextBounds(string, 0, string.length(), this.LLJI);
        String str = this.LLJJLIIIJLLLLLLLZ;
        if (str != null) {
            this.LLILZ.getTextBounds(str, 0, str.length(), this.LLJZIJLIL);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Method method = C19737612Kg.LIZ;
        this.LLJLLL = viewConfiguration.getScaledPagingTouchSlop();
        this.LLLFFI = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLLFZ = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.LLLF = new Scroller(getContext(), null);
        this.LLLFF = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        setMTextYAxisArray(new C12KU[this.LLLILZJ + 4]);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = this.LLJI.width() + getPaddingLeft() + getPaddingRight() + this.LLJZIJLIL.width() + 6;
        }
        this.LL = size;
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + (this.LLLILZJ * this.LLJI.height()) + ((this.LLLILZJ - 1) * this.LLJJL) + getPaddingTop();
        }
        this.LLILLJJLI = size2;
        setMeasuredDimension(this.LL, size2);
        if (this.LLJZ == null) {
            RectF rectF = new RectF();
            this.LLJZ = rectF;
            rectF.left = 0.0f;
            rectF.right = this.LL;
            rectF.top = ((this.LLILLJJLI - this.LLJI.height()) - this.LLJJL) / 2;
            RectF rectF2 = this.LLJZ;
            int iHeight = this.LLILLJJLI + this.LLJI.height();
            int i3 = this.LLJJL;
            rectF2.bottom = (iHeight + i3) / 2;
            int iHeight2 = i3 + this.LLJI.height();
            this.LLLIIIL = iHeight2;
            int i4 = this.LLILLJJLI;
            this.LLJILJIL = (i4 / 2) - (iHeight2 * 3);
            this.LLJILJILJ = (i4 / 2) + (iHeight2 * 3);
            LIZLLL();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 64) {
            if (i != 4096) {
                if (i != 8192) {
                    return super.performAccessibilityAction(i, bundle);
                }
                LIZIZ(this.LLLIIIL);
                LIZ();
                announceForAccessibility(getCurrentText());
                invalidate();
                return true;
            }
            LIZIZ(-this.LLLIIIL);
            LIZ();
            announceForAccessibility(getCurrentText());
            invalidate();
            return true;
        }
        q0.LJJIFFI(this, getCurrentText());
        return super.performAccessibilityAction(i, bundle);
    }
}
