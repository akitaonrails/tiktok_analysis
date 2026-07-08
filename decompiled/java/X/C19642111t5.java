package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.11t5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19642111t5 extends View {
    public ArrayList<Integer> LL;
    public ArrayList<Boolean> LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public final Paint LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public OverScroller LLJJL;
    public VelocityTracker LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public InterfaceC19638511sV LLJLILLLLZIIL;
    public AbstractC19638411sU LLJLL;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r6 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r6.LL
            r5 = 0
            if (r0 != 0) goto L6
            r0 = r5
        L6:
            r0.clear()
            java.util.ArrayList<java.lang.Boolean> r0 = r6.LLILLJJLI
            if (r0 != 0) goto Le
            r0 = r5
        Le:
            r0.clear()
            java.lang.Integer r0 = r6.LLILZLL
            r4 = 0
            if (r0 == 0) goto L60
            int r1 = r0.intValue()
            int r0 = r6.LLILLL
            if (r1 < r0) goto L60
            java.lang.Integer r0 = r6.LLILZLL
            int r0 = r0.intValue()
            if (r0 <= 0) goto L64
            java.lang.Integer r0 = r6.LLILZLL
            int r0 = r0.intValue()
        L2c:
            r6.LLJI = r0
            int r3 = r6.LLJILJIL
        L30:
            if (r4 >= r3) goto L66
            int r2 = r6.LLJI
            int r0 = r6.LLIZ
            int r0 = r4 - r0
            int r2 = r2 + r0
            boolean r0 = r6.LLJIJIL
            if (r0 == 0) goto L41
            int r2 = r6.LIZJ(r2)
        L41:
            java.util.ArrayList<java.lang.Integer> r1 = r6.LL
            if (r1 != 0) goto L46
            r1 = r5
        L46:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.add(r0)
            java.util.ArrayList<java.lang.Boolean> r1 = r6.LLILLJJLI
            if (r1 != 0) goto L52
            r1 = r5
        L52:
            boolean r0 = r6.LJFF(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.add(r0)
            int r4 = r4 + 1
            goto L30
        L60:
            int r0 = r6.LLILLL
            if (r0 > 0) goto L2c
        L64:
            r0 = 0
            goto L2c
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19642111t5.LJ():void");
    }

    public final String getCurrentItem() {
        return LIZIZ(this.LLJI);
    }

    public final String getMaxValue() {
        AbstractC19638411sU abstractC19638411sU = this.LLJLL;
        return abstractC19638411sU != null ? abstractC19638411sU.LIZIZ(this.LLILZ) : String.valueOf(this.LLILZ);
    }

    public final String getMinValue() {
        AbstractC19638411sU abstractC19638411sU = this.LLJLL;
        return abstractC19638411sU != null ? abstractC19638411sU.LIZIZ(this.LLILLL) : String.valueOf(this.LLILLL);
    }

    private final int getGapHeight() {
        int itemHeight = getItemHeight();
        Paint.FontMetricsInt fontMetricsInt = this.LLJJJIL.getFontMetricsInt();
        return itemHeight - Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
    }

    private final int getItemHeight() {
        return getHeight() / (this.LLJILJIL - 2);
    }

    public final void LIZLLL() {
        this.LLJJIJIIJIL = getItemHeight();
        Paint.FontMetricsInt fontMetricsInt = this.LLJJJIL.getFontMetricsInt();
        this.LLJJIJIL = Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
        this.LLJJIJI = getGapHeight();
        int i = this.LLJJIJIIJIL;
        int i2 = ((this.LLIZLLLIL * i) + ((this.LLJJIJIL + i) / 2)) - (i * this.LLIZ);
        this.LLJJIII = i2;
        this.LLJJI = i2;
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.LLJJL.computeScrollOffset()) {
            int currX = this.LLJJL.getCurrX();
            int currY = this.LLJJL.getCurrY();
            if (this.LLJJJ == 0) {
                this.LLJJJ = this.LLJJL.getStartY();
            }
            scrollBy(currX, currY - this.LLJJJ);
            this.LLJJJ = currY;
            invalidate();
            return;
        }
        if (this.LLJJ) {
            return;
        }
        this.LLJJJ = 0;
        int i = this.LLJJIII - this.LLJJI;
        int iAbs = Math.abs(i);
        int i2 = this.LLJJIJIIJIL;
        if (iAbs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        if (i != 0) {
            this.LLJJL.startScroll(getScrollX(), getScrollY(), 0, i, 800);
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int suggestedMinimumWidth = super.getSuggestedMinimumWidth();
        return this.LLJILJILJ > 0 ? Math.max(suggestedMinimumWidth, ((int) C12ES.LIZJ(38.0f, getContext())) * this.LLJILJILJ) : suggestedMinimumWidth;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int iMeasureText;
        int suggestedMinimumHeight = super.getSuggestedMinimumHeight();
        if (this.LLJILJILJ <= 0) {
            return suggestedMinimumHeight;
        }
        this.LLJJJIL.setTextSize(this.LLJJJJLIIL * 1.3f);
        if (this.LLJLL != null) {
            iMeasureText = this.LLJ;
        } else {
            iMeasureText = (int) this.LLJJJIL.measureText(String.valueOf(this.LLILLL));
            int iMeasureText2 = (int) this.LLJJJIL.measureText(String.valueOf(this.LLILZ));
            this.LLJJJIL.setTextSize(this.LLJJJJLIIL * 1.0f);
            if (iMeasureText <= iMeasureText2) {
                iMeasureText = iMeasureText2;
            }
        }
        return Math.max(suggestedMinimumHeight, iMeasureText);
    }

    public final int getCurrentPosition() {
        return this.LLJI;
    }

    public final boolean getWrapSelectorPick() {
        return this.LLJIJIL;
    }

    public final String LIZIZ(int i) {
        AbstractC19638411sU abstractC19638411sU = this.LLJLL;
        if (abstractC19638411sU != null) {
            return abstractC19638411sU.LIZIZ(i);
        }
        if (!this.LLJIJIL) {
            if (i <= this.LLILZ && i >= this.LLILLL) {
                if (i <= 9) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('0');
                    sbLIZ.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return String.valueOf(i);
            }
            return "";
        }
        int iLIZJ = LIZJ(i);
        if (iLIZJ <= 9) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(iLIZJ);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return String.valueOf(iLIZJ);
    }

    public final int LIZJ(int i) {
        int i2 = this.LLILZ;
        if (i > i2) {
            int i3 = this.LLILLL;
            return (i3 + ((i - i2) % ((i2 - i3) + 1))) - 1;
        }
        int i4 = this.LLILLL;
        if (i < i4) {
            return (i2 - ((i4 - i) % ((i2 - i4) + 1))) + 1;
        }
        return i;
    }

    public final boolean LJFF(int i) {
        Integer num = this.LLILZLL;
        if (num != null && i < num.intValue()) {
            return false;
        }
        Integer num2 = this.LLILZIL;
        if (num2 != null && i > num2.intValue()) {
            return false;
        }
        return true;
    }

    public final void LJI(int i) {
        if (this.LLJI == i) {
            return;
        }
        this.LLJI = i;
        ArrayList<Integer> arrayList = this.LL;
        if (arrayList == null) {
            arrayList = null;
        }
        arrayList.clear();
        int i2 = this.LLJILJIL;
        for (int i3 = 0; i3 < i2; i3++) {
            int iLIZJ = this.LLJI + (i3 - this.LLIZ);
            if (this.LLJIJIL) {
                iLIZJ = LIZJ(iLIZJ);
            }
            ArrayList<Integer> arrayList2 = this.LL;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            arrayList2.add(Integer.valueOf(iLIZJ));
        }
        invalidate();
    }

    public final int LJII(int i) {
        if (!this.LLJIJIL) {
            Integer num = this.LLILZIL;
            if (num == null) {
                int i2 = this.LLILZ;
                if (i > i2) {
                    return i2;
                }
            } else if (i > num.intValue()) {
                return this.LLILZIL.intValue();
            }
            Integer num2 = this.LLILZLL;
            if (num2 == null) {
                int i3 = this.LLILLL;
                if (i < i3) {
                    return i3;
                }
            } else if (i < num2.intValue()) {
                return this.LLILZLL.intValue();
            }
            return i;
        }
        return LIZJ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19642111t5.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            this.LLJJLIIIJLLLLLLLZ = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LLJJLIIIJLLLLLLLZ;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        if (this.LLJJ) {
                            this.LLJJ = false;
                        }
                        VelocityTracker velocityTracker2 = this.LLJJLIIIJLLLLLLLZ;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        this.LLJJLIIIJLLLLLLLZ = null;
                    }
                } else {
                    float y = motionEvent.getY() - this.LLJILLL;
                    if (!this.LLJJ && Math.abs(y) > this.LLJL) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        if (y > 0.0f) {
                            y -= this.LLJL;
                        } else {
                            y += this.LLJL;
                        }
                        this.LLJJ = true;
                    }
                    if (this.LLJJ) {
                        scrollBy(0, (int) y);
                        invalidate();
                        this.LLJILLL = motionEvent.getY();
                        return true;
                    }
                }
                return true;
            }
            if (this.LLJJ) {
                this.LLJJ = false;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.LLJJLIIIJLLLLLLLZ;
                if (velocityTracker3 != null) {
                    velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJLIL);
                }
                VelocityTracker velocityTracker4 = this.LLJJLIIIJLLLLLLLZ;
                if (velocityTracker4 != null) {
                    numValueOf = Integer.valueOf((int) velocityTracker4.getYVelocity());
                } else {
                    numValueOf = null;
                }
                this.LLJJJ = 0;
                OverScroller overScroller = this.LLJJL;
                if (overScroller != null) {
                    overScroller.fling(getScrollX(), getScrollY(), 0, numValueOf.intValue(), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, (int) (((double) getItemHeight()) * 0.7d));
                }
                postInvalidateOnAnimation();
                VelocityTracker velocityTracker5 = this.LLJJLIIIJLLLLLLLZ;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                }
                this.LLJJLIIIJLLLLLLLZ = null;
                return true;
            }
            int y2 = (int) motionEvent.getY();
            int i = this.LLJJIJIIJIL;
            int i2 = (y2 / i) - this.LLIZLLLIL;
            this.LLJJJ = 0;
            this.LLJJL.startScroll(0, 0, 0, (-i) * i2, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            invalidate();
            return true;
        }
        if (!this.LLJJL.isFinished()) {
            this.LLJJL.forceFinished(true);
        }
        this.LLJILLL = motionEvent.getY();
        return true;
    }

    public final void setMaxValidValue(Integer num) {
        this.LLILZIL = num;
    }

    public final void setMaxValue(int i) {
        this.LLILZ = i;
    }

    public final void setMaxWidth(int i) {
        this.LLJ = i;
    }

    public final void setMinValidValue(Integer num) {
        this.LLILZLL = num;
    }

    public final void setMinValue(int i) {
        this.LLILLL = i;
    }

    public final void setOnValueChangedListener(InterfaceC19638511sV interfaceC19638511sV) {
        this.LLJLILLLLZIIL = interfaceC19638511sV;
    }

    public final void setPickerItemCount(int i) {
        int i2 = i + 2;
        this.LLJILJIL = i2;
        this.LLIZ = (i2 - 1) / 2;
        int i3 = i2 - 2;
        this.LLJILJILJ = i3;
        this.LLIZLLLIL = (i3 - 1) / 2;
        this.LL = new ArrayList<>(this.LLJILJIL);
        this.LLILLJJLI = new ArrayList<>(this.LLJILJIL);
        LJ();
        LIZLLL();
        invalidate();
        invalidate();
    }

    public final void setSelectedTextColor(int i) {
        this.LLJJJJ = C446980Hfs.LIZ(getContext(), i);
        invalidate();
    }

    public final void setTextAlign(Paint.Align align) {
        this.LLJJJIL.setTextAlign(align);
    }

    public final void setTypeface(Typeface typeface) {
        this.LLJJJIL.setTypeface(typeface);
    }

    public final void setUnselectedTextColor(int i) {
        this.LLJJJJJIL = i;
    }

    public final void setValue(String str) {
        AbstractC19638411sU abstractC19638411sU = this.LLJLL;
        int iLJII = 0;
        if (abstractC19638411sU != null) {
            abstractC19638411sU.LIZ();
            iLJII = LJII(0);
        } else {
            try {
                iLJII = LJII(CastIntegerProtector.parseInt(str));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJI(iLJII);
    }

    public final void setWrapSelectorWheel(boolean z) {
        this.LLJIJIL = z;
        invalidate();
    }

    public C19642111t5(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        int i;
        int i2;
        int color;
        super(context, attributeSet);
        this.LLJJIII = Integer.MIN_VALUE;
        Paint paint = new Paint();
        this.LLJJJIL = paint;
        boolean z = false;
        if (context != null) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCDNumberPicker, 0, 0);
        } else {
            typedArrayObtainStyledAttributes = null;
        }
        int i3 = (typedArrayObtainStyledAttributes != null ? typedArrayObtainStyledAttributes.getInt(R$styleable.LiveCDNumberPicker_wheelItemCount, 5) : 5) + 2;
        this.LLJILJIL = i3;
        this.LLIZ = (i3 - 1) / 2;
        int i4 = i3 - 2;
        this.LLJILJILJ = i4;
        this.LLIZLLLIL = (i4 - 1) / 2;
        this.LL = new ArrayList<>(this.LLJILJIL);
        this.LLILLJJLI = new ArrayList<>(this.LLJILJIL);
        if (typedArrayObtainStyledAttributes != null) {
            i = typedArrayObtainStyledAttributes.getInt(R$styleable.LiveCDNumberPicker_min, Integer.MIN_VALUE);
        } else {
            i = 0;
        }
        this.LLILLL = i;
        if (typedArrayObtainStyledAttributes != null) {
            i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.LiveCDNumberPicker_max, Integer.MAX_VALUE);
        } else {
            i2 = 0;
        }
        this.LLILZ = i2;
        if (typedArrayObtainStyledAttributes != null) {
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LiveCDNumberPicker_maxValidIndex)) {
                this.LLILZIL = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.LiveCDNumberPicker_maxValidIndex, 0));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LiveCDNumberPicker_minValidIndex)) {
                this.LLILZLL = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.LiveCDNumberPicker_minValidIndex, 0));
            }
            z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveCDNumberPicker_wrapSelectorWheel, false);
        }
        this.LLJIJIL = z;
        this.LLJJL = new OverScroller(context, new DecelerateInterpolator(2.5f));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLJL = viewConfiguration.getScaledTouchSlop();
        this.LLJLIL = viewConfiguration.getScaledMaximumFlingVelocity() / 4;
        viewConfiguration.getScaledMinimumFlingVelocity();
        int i5 = R.color.b6;
        if (typedArrayObtainStyledAttributes != null) {
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveCDNumberPicker_selectedTextColor, C960203pA.LIZ(R.attr.e1, context));
        } else {
            color = R.color.b6;
        }
        this.LLJJJJ = color;
        this.LLJJJJJIL = typedArrayObtainStyledAttributes != null ? typedArrayObtainStyledAttributes.getColor(R$styleable.LiveCDNumberPicker_textColor, C960203pA.LIZ(R.attr.e1, context)) : i5;
        this.LLJJJJLIIL = typedArrayObtainStyledAttributes != null ? typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveCDNumberPicker_textSize, 80) : 80;
        paint.setAntiAlias(true);
        paint.setAntiAlias(true);
        paint.setTextSize(paint.getTextSize());
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setTextAlign(Paint.Align.CENTER);
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
        LJ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        setMeasuredDimension(LIZ(getSuggestedMinimumWidth(), layoutParams.width, i) + getPaddingLeft() + getPaddingRight(), LIZ(getSuggestedMinimumHeight(), layoutParams.height, i2) + getPaddingTop() + getPaddingBottom());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (((java.lang.Number) com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r8.LLIZ)).intValue() <= r8.LLILZLL.intValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (((java.lang.Number) com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r8.LLIZ)).intValue() >= r8.LLILZIL.intValue()) goto L44;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void scrollBy(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19642111t5.scrollBy(int, int):void");
    }

    public static int LIZ(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(View.MeasureSpec.getMode(i3));
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                return size;
            }
            if (i2 != -2 && i2 != -1) {
                return i2;
            }
        } else {
            if (i2 != -2) {
                if (i2 == -1 || i2 > size) {
                    return size;
                }
                return i2;
            }
            if (i > size) {
                return size;
            }
        }
        return i;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            LIZLLL();
        }
    }
}
