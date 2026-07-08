package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21415118rN extends View {
    public Layout LL;
    public int LLILLJJLI;
    public C21415418rQ LLILLL;
    public C21415618rS LLILZ;

    public C21415118rN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZJ() {
        C21415618rS c21415618rS = this.LLILZ;
        if (c21415618rS == null) {
            return;
        }
        c21415618rS.LIZ.LIZLLL();
        this.LLILZ = null;
        invalidate();
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

    public final Layout getTextLayout() {
        return this.LL;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZ(MotionEvent motionEvent) {
        Integer numValueOf;
        ClickableSpan[] clickableSpanArr;
        Layout layout = this.LL;
        boolean z = false;
        if (layout == null) {
            return false;
        }
        CharSequence text = layout.getText();
        if (!(text instanceof Spanned)) {
            return LIZIZ(motionEvent);
        }
        InterfaceC21415718rT interfaceC21415718rT = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 0)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int scrollX = x + getScrollX();
            int scrollY = y + getScrollY();
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = scrollX;
            int iU3 = C786410Ut5.U3(layout, lineForVertical, f);
            if (scrollY >= 0 && scrollY <= layout.getHeight() && f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical) && (clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(iU3, iU3, ClickableSpan.class)) != 0 && clickableSpanArr.length != 0) {
                C511601z0 c511601z0 = clickableSpanArr[0];
                if (c511601z0 instanceof InterfaceC21415718rT) {
                    if (numValueOf.intValue() == 1) {
                        ((InterfaceC21415718rT) c511601z0).LIZLLL();
                    } else if (numValueOf.intValue() == 0) {
                        InterfaceC21415718rT interfaceC21415718rT2 = (InterfaceC21415718rT) c511601z0;
                        interfaceC21415718rT2.LIZIZ();
                        this.LLILZ = new C21415618rS(interfaceC21415718rT2, (Spanned) text, iU3);
                    }
                    z = true;
                }
                if (numValueOf.intValue() == 1) {
                    C21415618rS c21415618rS = this.LLILZ;
                    if (c21415618rS != null) {
                        interfaceC21415718rT = c21415618rS.LIZ;
                    }
                    if (!Intrinsics.LJFF(c511601z0, interfaceC21415718rT)) {
                        LIZJ();
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

    public final boolean LIZIZ(MotionEvent motionEvent) {
        Layout layout;
        C21415418rQ c21415418rQ;
        if (motionEvent == null || (layout = this.LL) == null || layout.getHeight() <= this.LLILLJJLI) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2 && (c21415418rQ = this.LLILLL) != null) {
                    if (!c21415418rQ.LIZJ) {
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() / 4;
                        if (Math.abs(motionEvent.getX() - c21415418rQ.LIZ) >= scaledTouchSlop || Math.abs(motionEvent.getY() - c21415418rQ.LIZIZ) >= scaledTouchSlop) {
                            c21415418rQ.LIZJ = true;
                        }
                    }
                    if (c21415418rQ.LIZJ) {
                        c21415418rQ.LIZLLL = true;
                        float x = c21415418rQ.LIZ - motionEvent.getX();
                        float y = c21415418rQ.LIZIZ - motionEvent.getY();
                        c21415418rQ.LIZ = motionEvent.getX();
                        c21415418rQ.LIZIZ = motionEvent.getY();
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
            C21415418rQ c21415418rQ2 = this.LLILLL;
            this.LLILLL = null;
            if (c21415418rQ2 == null || !c21415418rQ2.LIZLLL) {
                return false;
            }
            LIZJ();
            invalidate();
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        getScrollX();
        getScrollY();
        this.LLILLL = new C21415418rQ(x2, y2);
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        try {
            Layout layout = this.LL;
            if (layout != null) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
                layout.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
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
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    LIZJ();
                    this.LLILLL = null;
                    return super.onTouchEvent(motionEvent);
                }
                boolean zLIZIZ = LIZIZ(motionEvent);
                if (!super.onTouchEvent(motionEvent) && !zLIZIZ) {
                    return false;
                }
                return true;
            }
            if (LIZIZ(motionEvent) || LIZ(motionEvent)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        boolean zLIZIZ2 = LIZIZ(motionEvent);
        if (!LIZ(motionEvent) && !zLIZIZ2) {
            z = false;
        } else {
            z = true;
        }
        if (!super.onTouchEvent(motionEvent) && !z) {
            return false;
        }
        return true;
    }

    public final void setMaxHeight(int i) {
        this.LLILLJJLI = i;
    }

    public final void setTextLayout(Layout layout) {
        this.LLILZ = null;
        this.LLILLL = null;
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
        Layout layout = this.LL;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            int iMax = 0;
            for (int i3 = 0; i3 < lineCount; i3++) {
                iMax = Math.max(iMax, (int) Math.ceil(layout.getLineRight(i3) - layout.getLineLeft(i3)));
            }
            C0OFE.LIZ(Integer.valueOf(iMax), Integer.valueOf(layout.getHeight()));
            setMeasuredDimension(getPaddingLeft() + getPaddingRight() + iMax, getPaddingTop() + getPaddingBottom() + layout.getHeight());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21415118rN(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLILLJJLI = Integer.MAX_VALUE;
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
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextLayoutView_tux_textLayoutShouldCache, true);
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextLayoutView_tux_textLayoutWarnText, false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxTextLayoutView_android_maxHeight)) {
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextLayoutView_android_maxHeight, Integer.MAX_VALUE);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
