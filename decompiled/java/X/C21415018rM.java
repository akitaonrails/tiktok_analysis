package X;

import Y.ARunnableS101S0200000_32;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21415018rM extends View {
    public Layout LL;
    public C444830HcP LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public C21415318rP LLILZLL;
    public C21415518rR LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    public C21415018rM(Context context) {
        this(context, null, 6);
    }

    public C21415018rM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!this.LLIZLLLIL) {
            super.computeScroll();
            return;
        }
        if (getScroller().computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = getScroller().getCurrX();
            int currY = getScroller().getCurrY();
            if (scrollX != currX || scrollY != currY) {
                overScrollBy(currX - scrollX, currY - scrollY, scrollX, scrollY, 0, getScrollRange(), 0, 0, false);
                onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            }
            if (getScroller().isFinished()) {
                return;
            }
            postInvalidateOnAnimation();
        }
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LLJILJILJ.getValue();
    }

    public final void LIZLLL() {
        C21415518rR c21415518rR = this.LLIZ;
        if (c21415518rR == null) {
            return;
        }
        c21415518rR.LIZ.LIZLLL();
        this.LLIZ = null;
        invalidate();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        if (!this.LLIZLLLIL) {
            return super.computeVerticalScrollExtent();
        }
        int height = getHeight() - (getPaddingTop() + getPaddingBottom());
        Layout layout = this.LL;
        int height2 = layout != null ? layout.getHeight() : height;
        return height > height2 ? height2 : height;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.LLIZLLLIL ? getScrollY() : super.computeVerticalScrollOffset();
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        Layout layout = this.LL;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        Layout layout = this.LL;
        if (layout == null) {
            return 0.0f;
        }
        return getScrollY() < layout.getHeight() - ((getHeight() - getPaddingTop()) - getPaddingBottom()) ? 1.0f : 0.0f;
    }

    public final int getScrollRange() {
        Layout layout = this.LL;
        if (layout == null) {
            return 0;
        }
        int height = getHeight() - (getPaddingTop() + getPaddingBottom());
        if (height < 0) {
            height = 0;
        }
        int height2 = layout.getHeight();
        if (height > height2) {
            height = height2;
        }
        int height3 = layout.getHeight() - height;
        if (height3 >= 0) {
            return height3;
        }
        return 0;
    }

    public final OverScroller getScroller() {
        return (OverScroller) this.LLJILJIL.getValue();
    }

    @Override // android.view.View
    public final boolean performLongClick() {
        if (this.LLIZLLLIL) {
            LIZLLL();
        }
        return super.performLongClick();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZ = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZ = true;
    }

    public final boolean getEnableFlingScroll() {
        return this.LLIZLLLIL;
    }

    public final boolean getEnableScrollBoundaryHandoff() {
        return this.LLJ;
    }

    public final Layout getLayout() {
        return this.LL;
    }

    public final Layout getTextLayout() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZIZ(MotionEvent motionEvent) {
        Integer numValueOf;
        int scrollX;
        int scrollY;
        ClickableSpan[] clickableSpanArr;
        Layout layout = this.LL;
        boolean z = false;
        if (layout == null) {
            return false;
        }
        CharSequence text = layout.getText();
        if (!(text instanceof Spanned)) {
            return LIZJ(motionEvent);
        }
        InterfaceC21415718rT interfaceC21415718rT = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 0)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.LLIZLLLIL) {
                scrollX = (x - getPaddingLeft()) + getScrollX();
                y -= getPaddingTop();
                scrollY = getScrollY();
            } else {
                scrollX = x + getScrollX();
                scrollY = getScrollY();
            }
            int i = y + scrollY;
            int lineForVertical = layout.getLineForVertical(i);
            float f = scrollX;
            int iU3 = C786410Ut5.U3(layout, lineForVertical, f);
            if (i >= 0 && i <= layout.getHeight() && f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical) && (clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(iU3, iU3, ClickableSpan.class)) != 0 && clickableSpanArr.length != 0) {
                C511601z0 c511601z0 = clickableSpanArr[0];
                if (c511601z0 instanceof InterfaceC21415718rT) {
                    if (numValueOf.intValue() == 1) {
                        ((InterfaceC21415718rT) c511601z0).LIZLLL();
                    } else if (numValueOf.intValue() == 0) {
                        InterfaceC21415718rT interfaceC21415718rT2 = (InterfaceC21415718rT) c511601z0;
                        interfaceC21415718rT2.LIZIZ();
                        this.LLIZ = new C21415518rR(interfaceC21415718rT2, (Spanned) text, iU3);
                    }
                    z = true;
                }
                if (numValueOf.intValue() == 1) {
                    C21415518rR c21415518rR = this.LLIZ;
                    if (c21415518rR != null) {
                        interfaceC21415718rT = c21415518rR.LIZ;
                    }
                    if (!Intrinsics.LJFF(c511601z0, interfaceC21415718rT)) {
                        LIZLLL();
                    }
                }
                if (numValueOf.intValue() == 1) {
                    c511601z0.onClick(this);
                }
                if (z) {
                    invalidate();
                }
                return true;
            }
            if (text instanceof Spannable) {
                Selection.removeSelection((Spannable) text);
            }
        }
        return false;
    }

    public final boolean LIZJ(MotionEvent motionEvent) {
        Layout layout;
        C21415318rP c21415318rP;
        if (motionEvent == null || (layout = this.LL) == null || layout.getHeight() <= this.LLILZIL) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2 && (c21415318rP = this.LLILZLL) != null) {
                    if (!c21415318rP.LIZJ) {
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() / 4;
                        if (Math.abs(motionEvent.getX() - c21415318rP.LIZ) >= scaledTouchSlop || Math.abs(motionEvent.getY() - c21415318rP.LIZIZ) >= scaledTouchSlop) {
                            c21415318rP.LIZJ = true;
                        }
                    }
                    if (c21415318rP.LIZJ) {
                        c21415318rP.LIZLLL = true;
                        float x = c21415318rP.LIZ - motionEvent.getX();
                        float y = c21415318rP.LIZIZ - motionEvent.getY();
                        c21415318rP.LIZ = motionEvent.getX();
                        c21415318rP.LIZIZ = motionEvent.getY();
                        int scrollX = getScrollX() + ((int) x);
                        int scrollY = getScrollY() + ((int) y);
                        int paddingTop = getPaddingTop() + getPaddingBottom();
                        int paddingLeft = getPaddingLeft() + getPaddingRight();
                        int height = layout.getHeight() - (getHeight() - paddingTop);
                        if (scrollY > height) {
                            scrollY = height;
                        }
                        if (scrollY < 0) {
                            scrollY = 0;
                        }
                        int width = layout.getWidth() - (getWidth() - paddingLeft);
                        if (scrollX > width) {
                            scrollX = width;
                        }
                        if (scrollX < 0) {
                            scrollX = 0;
                        }
                        int scrollX2 = getScrollX();
                        int scrollY2 = getScrollY();
                        if ((scrollY == 0 && y < 0.0f) || (scrollY == height && y > 0.0f)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        scrollTo(scrollX, scrollY);
                        if (scrollX2 != getScrollX() || scrollY2 != getScrollY()) {
                            cancelLongPress();
                        }
                        return true;
                    }
                }
                return false;
            }
            C21415318rP c21415318rP2 = this.LLILZLL;
            this.LLILZLL = null;
            if (c21415318rP2 == null || !c21415318rP2.LIZLLL) {
                return false;
            }
            LIZLLL();
            invalidate();
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        getScrollX();
        getScrollY();
        this.LLILZLL = new C21415318rP(x2, y2);
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Layout layout = this.LL;
        if (layout != null) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            layout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence text;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setClassName(getClass().getName());
            Layout layout = this.LL;
            if (layout == null || (text = layout.getText()) == null) {
                text = "";
            }
            accessibilityNodeInfo.setText(text);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.LLIZLLLIL) {
            if (motionEvent == null) {
                return false;
            }
            boolean zOnTouchEvent = getGestureDetector().onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!zOnTouchEvent) {
                    if (getScroller().springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                if (this.LLJ) {
                    if (!canScrollVertically(1)) {
                        this.LLJI = true;
                    }
                    if (!canScrollVertically(-1)) {
                        this.LLJIJIL = true;
                    }
                }
                LIZLLL();
                this.LLILZLL = null;
            }
            if (!zOnTouchEvent && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    LIZLLL();
                    this.LLILZLL = null;
                    return super.onTouchEvent(motionEvent);
                }
                boolean zLIZJ = LIZJ(motionEvent);
                if (!super.onTouchEvent(motionEvent) && !zLIZJ) {
                    return false;
                }
                return true;
            }
            if (LIZJ(motionEvent) || LIZIZ(motionEvent)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        boolean zLIZJ2 = LIZJ(motionEvent);
        if (!LIZIZ(motionEvent) && !zLIZJ2) {
            z = false;
        } else {
            z = true;
        }
        if (!super.onTouchEvent(motionEvent) && !z) {
            return false;
        }
        return true;
    }

    public final void setEnableFlingScroll(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setEnableScrollBoundaryHandoff(boolean z) {
        this.LLJ = z;
    }

    public final void setLayout(Layout layout) {
        this.LL = layout;
    }

    public final void setMaxHeight(int i) {
        this.LLILZIL = i;
    }

    public final void setTextLayout(Layout layout) {
        this.LLILLJJLI = null;
        this.LLIZ = null;
        this.LLILZLL = null;
        this.LLJI = false;
        this.LLJIJIL = false;
        setScrollX(0);
        setScrollY(0);
        if (!Intrinsics.LJFF(this.LL, layout)) {
            this.LL = layout;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C444830HcP c444830HcP = this.LLILLJJLI;
        if (c444830HcP != null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
            if (c444840HcQ.LIZLLL != size || c444840HcQ.LIZJ != mode) {
                c444840HcQ.LIZLLL = size;
                c444840HcQ.LIZJ = mode;
                if (this.LLILLL) {
                    this.LLILZ = true;
                    this.LL = c444830HcP.LIZIZ();
                } else {
                    this.LLILLL = true;
                    ((ExecutorService) C157H.LIZ.getValue()).execute(new ARunnableS101S0200000_32(this, c444830HcP, 30));
                }
            }
        }
        Layout layout = this.LL;
        if (layout != null) {
            int paddingLeft = getPaddingLeft() + getPaddingRight() + layout.getWidth();
            int height = layout.getHeight();
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    Method declaredMethod = layout.getClass().getDeclaredMethod("getHeight", Boolean.TYPE);
                    declaredMethod.setAccessible(true);
                    height = ((Integer) declaredMethod.invoke(layout, Boolean.TRUE)).intValue();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    System.out.println(e);
                }
            }
            int paddingTop = getPaddingTop() + getPaddingBottom() + height;
            int i3 = this.LLILZIL;
            if (paddingTop > i3) {
                paddingTop = i3;
            }
            if (this.LLIZLLLIL) {
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                if (mode2 == Integer.MIN_VALUE ? paddingTop > size2 : mode2 == 1073741824) {
                    paddingTop = size2;
                }
                int i4 = this.LLILZIL;
                if (paddingTop > i4) {
                    paddingTop = i4;
                }
            }
            setMeasuredDimension(paddingLeft, paddingTop);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21415018rM(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLILZIL = Integer.MAX_VALUE;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS576S0100000_32(context, 71));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS433S0200000_32(context, this, 6));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextLayoutView, 0, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextLayoutView_android_text);
        if (strXd != null) {
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LJIILIIL(strXd);
            Integer numLIZ = C1308910kAL.LIZ(R.attr.du, context);
            if (numLIZ != null && numLIZ.intValue() == 0) {
                z = false;
            } else {
                z = true;
            }
            c444830HcP.LJIIJJI(z);
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxTextLayoutView_tux_font)) {
                c444830HcP.LJII(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextLayoutView_tux_font, -1));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxTextLayoutView_android_textColor)) {
                c444830HcP.LJIILJJIL(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextLayoutView_android_textColor, -16777216));
            }
            c444830HcP.LIZLLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextLayoutView_tux_textLayoutShouldCache, true);
            c444830HcP.LJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextLayoutView_tux_textLayoutWarnText, false);
            this.LLILLJJLI = c444830HcP;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxTextLayoutView_android_maxHeight)) {
            this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextLayoutView_android_maxHeight, Integer.MAX_VALUE);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxTextLayoutView_tux_flingScroll)) {
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextLayoutView_tux_flingScroll, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
        if (this.LLIZLLLIL && !getScroller().isFinished() && z2) {
            getScroller().springBack(i, i2, 0, 0, 0, getScrollRange());
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LLILLL = false;
    }
}
