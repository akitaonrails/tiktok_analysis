package com.bytedance.android.live.design.widget;

import X.C011Z;
import X.C0WZX;
import X.C1105290erv;
import X.C16F5;
import X.C1CC2;
import X.C20140313rF;
import X.C20141413rQ;
import X.C20441214yg;
import X.C20745516Fx;
import X.C21370918kF;
import X.C21382018m2;
import X.C21409818qW;
import X.C21409918qX;
import X.C21410118qZ;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C444890HcV;
import X.C814420VxA;
import X.InterfaceC1119800fFK;
import X.InterfaceC1294060jmO;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.BoringLayout;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.emoji2.text.e;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.AwS138S0101000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class SimpleLiveTextView extends C16F5 {
    public static final Field LLJJJJJIL;
    public static final Field LLJJJJLIIL;
    public static final Method LLJJL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C21410118qZ LLJJIII;
    public Layout LLJJIJI;
    public C21409818qW LLJJIJIIJIL;
    public TextDirectionHeuristic LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;

    public SimpleLiveTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public void LJJLIIIIJ(Context context) {
    }

    public final void LJJLIIIJJI() {
        setLayout(null);
        C21409818qW defaultBuilder = getDefaultBuilder();
        Layout layout = defaultBuilder.LIZJ;
        if ((layout instanceof BoringLayout) && defaultBuilder.LJIIJ == null) {
            defaultBuilder.LJIIJ = (BoringLayout) layout;
        }
        defaultBuilder.LIZJ = null;
        defaultBuilder.LJIIIZ = null;
    }

    static {
        try {
            Field declaredField = TextView.class.getDeclaredField("mLayout");
            declaredField.setAccessible(true);
            LLJJJJJIL = declaredField;
            Field declaredField2 = TextView.class.getDeclaredField("mGravity");
            declaredField2.setAccessible(true);
            LLJJJJLIIL = declaredField2;
            Method declaredMethod = TextView.class.getDeclaredMethod("getLayoutAlignment", new Class[0]);
            declaredMethod.setAccessible(true);
            LLJJL = declaredMethod;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C011Z.LIZ.LJIILIIL().getClass();
            C1CC2.LIZ("SimpleLiveTextView init reflect failed!", th);
        }
    }

    private final Layout.Alignment getLayoutAlignment() {
        Layout.Alignment alignment;
        Method method = LLJJL;
        Object objA0 = method != null ? C2204961BRm.a0(method, this, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGJ544i2jfYvuGwucSZEQ5jaF1cV5jt6YoUZV/qwldaw=", null)) : null;
        return (!(objA0 instanceof Layout.Alignment) || (alignment = (Layout.Alignment) objA0) == null) ? Layout.Alignment.ALIGN_NORMAL : alignment;
    }

    @Override // android.widget.TextView, android.view.View
    public final int computeVerticalScrollRange() {
        if (!this.LLJJI) {
            return super.computeVerticalScrollRange();
        }
        Layout layout = this.LLJJIJI;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.LLJJI ? "com.bytedance.android.live.design.widget.SimpleLiveTextView" : super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (!this.LLJJI) {
            return super.getBottomFadingEdgeStrength();
        }
        Layout layout = this.LLJJIJI;
        if (layout != null) {
            return getScrollY() < layout.getHeight() - ((getHeight() - getPaddingTop()) - getPaddingBottom()) ? 1.0f : 0.0f;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public int getBottomPaddingOffset() {
        if (!this.LLJJI) {
            return super.getBottomPaddingOffset();
        }
        float shadowDy = getShadowDy() + getShadowRadius();
        if (0.0f >= shadowDy) {
            shadowDy = 0.0f;
        }
        return (int) shadowDy;
    }

    public final C21409818qW getDefaultBuilder() {
        if (!this.LLJJI) {
            throw new UnsupportedOperationException("Not enabled");
        }
        C21409818qW c21409818qW = this.LLJJIJIIJIL;
        if (c21409818qW != null) {
            return c21409818qW;
        }
        throw new UnsupportedOperationException("currentBuilder is null");
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJIILL : super.getEllipsize();
    }

    @Override // android.widget.TextView
    public int getGravity() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJJI : super.getGravity();
    }

    @Override // android.widget.TextView
    public boolean getIncludeFontPadding() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJIILJJIL : super.getIncludeFontPadding();
    }

    @Override // android.widget.TextView, android.view.View
    public int getLeftPaddingOffset() {
        if (!this.LLJJI) {
            return super.getLeftPaddingOffset();
        }
        int compoundPaddingLeft = getCompoundPaddingLeft() - getPaddingLeft();
        float shadowDx = getShadowDx() - getShadowRadius();
        if (0.0f <= shadowDx) {
            shadowDx = 0.0f;
        }
        return compoundPaddingLeft + ((int) shadowDx);
    }

    @Override // android.widget.TextView
    public int getLineHeight() {
        if (!this.LLJJI) {
            return super.getLineHeight();
        }
        C21409818qW defaultBuilder = getDefaultBuilder();
        float fontMetricsInt = defaultBuilder.LIZ.getFontMetricsInt(null);
        C21409918qX c21409918qX = defaultBuilder.LIZIZ;
        return C814420VxA.LIZIZ((fontMetricsInt * c21409918qX.LJIIL) + c21409918qX.LJIILIIL);
    }

    @Override // android.widget.TextView
    public float getLineSpacingExtra() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJIILIIL : super.getLineSpacingExtra();
    }

    @Override // android.widget.TextView
    public float getLineSpacingMultiplier() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJIIL : super.getLineSpacingMultiplier();
    }

    public final int getLinkColor() {
        if (this.LLJJI) {
            return ((TextPaint) getDefaultBuilder().LIZ).linkColor;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    @Override // android.widget.TextView
    public int getMaxHeight() {
        if (!this.LLJJI) {
            return super.getMaxHeight();
        }
        int i = getDefaultBuilder().LIZIZ.LJIIIZ;
        if (i != 2) {
            return -1;
        }
        return i;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LIZJ : super.getMaxLines();
    }

    @Override // android.widget.TextView
    public int getMaxWidth() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LIZLLL : super.getMaxWidth();
    }

    @Override // android.widget.TextView
    public int getMinHeight() {
        if (!this.LLJJI) {
            return super.getMinHeight();
        }
        int i = getDefaultBuilder().LIZIZ.LJI;
        if (i != 2) {
            return -1;
        }
        return i;
    }

    @Override // android.widget.TextView
    public int getMinWidth() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJ : super.getMinWidth();
    }

    @Override // android.widget.TextView
    public TextPaint getPaint() {
        return this.LLJJI ? getDefaultBuilder().LIZ : super.getPaint();
    }

    @Override // android.widget.TextView, android.view.View
    public int getRightPaddingOffset() {
        if (!this.LLJJI) {
            return super.getRightPaddingOffset();
        }
        int i = -(getCompoundPaddingRight() - getPaddingRight());
        float shadowDx = getShadowDx() + getShadowRadius();
        if (0.0f >= shadowDx) {
            shadowDx = 0.0f;
        }
        return i + ((int) shadowDx);
    }

    @Override // android.widget.TextView
    public int getShadowColor() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJJ : super.getShadowColor();
    }

    @Override // android.widget.TextView
    public float getShadowDx() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJIJJ : super.getShadowDx();
    }

    @Override // android.widget.TextView
    public float getShadowDy() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJIJJLI : super.getShadowDy();
    }

    @Override // android.widget.TextView
    public float getShadowRadius() {
        return this.LLJJI ? getDefaultBuilder().LIZIZ.LJIL : super.getShadowRadius();
    }

    public final boolean getShouldCacheLayout() {
        if (this.LLJJI) {
            return getDefaultBuilder().LJ;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    public final boolean getShouldWarmText() {
        if (this.LLJJI) {
            return getDefaultBuilder().LJFF;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    public final boolean getSingleLine() {
        if (this.LLJJI) {
            return getDefaultBuilder().LIZIZ.LIZIZ;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        if (!this.LLJJI) {
            return super.getText();
        }
        CharSequence charSequence = getDefaultBuilder().LIZIZ.LIZ;
        return charSequence == null ? "" : charSequence;
    }

    public final int getTextColor() {
        if (this.LLJJI) {
            return getDefaultBuilder().LIZ.getColor();
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    @Override // android.widget.TextView
    public TextDirectionHeuristic getTextDirectionHeuristic() {
        return this.LLJJI ? getTextDirectionHeuristicFromView() : super.getTextDirectionHeuristic();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public C21370918kF getTextMetricsParamsCompat() {
        if (!this.LLJJI) {
            return super.getTextMetricsParamsCompat();
        }
        TextPaint paint = getPaint();
        C21382018m2 c21382018m2 = new C21382018m2(paint);
        return new C21370918kF(paint, c21382018m2.LIZ, c21382018m2.LIZIZ, c21382018m2.LIZJ);
    }

    @Override // android.widget.TextView
    public float getTextSize() {
        return this.LLJJI ? getDefaultBuilder().LIZ.getTextSize() : super.getTextSize();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.18qZ] */
    @Override // X.C16F5
    public C20745516Fx getTextStyleableHelper() {
        if (!this.LLJJJIL) {
            return super.getTextStyleableHelper();
        }
        if (this.LLJJIII == null) {
            this.LLJJIII = new C20745516Fx(this) { // from class: X.18qZ
                {
                    super(this);
                }

                @Override // X.C20745516Fx, X.AbstractC20736416Ck
                public final void LJFF(TypedArray typedArray) throws Throwable {
                    SimpleLiveTextView simpleLiveTextView;
                    super.LJFF(typedArray);
                    T t = this.LL;
                    if ((t instanceof SimpleLiveTextView) && (simpleLiveTextView = (SimpleLiveTextView) t) != null) {
                        C118300cf c118300cf = new C118300cf();
                        C817403Hg c817403Hg = new C817403Hg();
                        C817403Hg c817403Hg2 = new C817403Hg();
                        C817403Hg c817403Hg3 = new C817403Hg();
                        Field field = SimpleLiveTextView.LLJJJJJIL;
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_text, new AwS398S0200000_32(simpleLiveTextView, typedArray, 55));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_gravity, new AwS398S0200000_32(simpleLiveTextView, typedArray, 59));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_textColor, new AwS398S0200000_32(simpleLiveTextView, typedArray, 60));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_singleLine, new AwS398S0200000_32(simpleLiveTextView, typedArray, 61));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_maxLines, new AwS398S0200000_32(simpleLiveTextView, typedArray, 62));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_width, new AwS398S0200000_32(simpleLiveTextView, typedArray, 63));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_height, new AwS398S0200000_32(simpleLiveTextView, typedArray, 64));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_maxHeight, new AwS398S0200000_32(simpleLiveTextView, typedArray, 65));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_minHeight, new AwS398S0200000_32(simpleLiveTextView, typedArray, 66));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_maxWidth, new AwS398S0200000_32(simpleLiveTextView, typedArray, 46));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_minWidth, new AwS398S0200000_32(simpleLiveTextView, typedArray, 47));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_ellipsize, new AwS398S0200000_32(simpleLiveTextView, typedArray, 48));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_typeface, new AwS398S0200000_32(simpleLiveTextView, typedArray, 49));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_includeFontPadding, new AwS398S0200000_32(simpleLiveTextView, typedArray, 50));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_lineHeight, new AwS398S0200000_32(simpleLiveTextView, typedArray, 51));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_textLayoutShouldCache, new AwS398S0200000_32(simpleLiveTextView, typedArray, 52));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_textLayoutWarmText, new AwS398S0200000_32(simpleLiveTextView, typedArray, 53));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_textDirection, new AwS611S0100000_32(simpleLiveTextView, 232));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_shadowColor, new AwS398S0200000_32(c118300cf, typedArray, 54));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_shadowDx, new AwS398S0200000_32(c817403Hg, typedArray, 56));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_shadowDy, new AwS398S0200000_32(c817403Hg2, typedArray, 57));
                        C1105290erv.LIZIZ(typedArray, R$styleable.TextStyleableHelper_android_shadowRadius, new AwS398S0200000_32(c817403Hg3, typedArray, 58));
                        int i = c118300cf.element;
                        if (i != 0) {
                            simpleLiveTextView.setShadowLayer(c817403Hg3.element, c817403Hg.element, c817403Hg2.element, i);
                        }
                    }
                }
            };
        }
        return this.LLJJIII;
    }

    @Override // android.widget.TextView, android.view.View
    public int getTopPaddingOffset() {
        if (!this.LLJJI) {
            return super.getTopPaddingOffset();
        }
        float shadowDy = getShadowDy() - getShadowRadius();
        if (0.0f <= shadowDy) {
            shadowDy = 0.0f;
        }
        return (int) shadowDy;
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return this.LLJJI ? getDefaultBuilder().LIZ.getTypeface() : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean isPaddingOffsetRequired() {
        if (this.LLJJI) {
            return !(getShadowRadius() == 0.0f);
        }
        return super.isPaddingOffsetRequired();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL() {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r1 = r0.width
            r0 = -2
            if (r1 != r0) goto L22
            X.18qW r0 = r5.getDefaultBuilder()
            X.18qX r2 = r0.LIZIZ
            int r1 = r2.LJFF
            int r0 = r2.LJII
            if (r1 != r0) goto L61
            int r1 = r2.LIZLLL
            int r0 = r2.LJ
            if (r1 != r0) goto L61
        L22:
            int r1 = r5.getRight()
            int r0 = r5.getLeft()
            int r1 = r1 - r0
            int r0 = r5.getCompoundPaddingLeft()
            int r1 = r1 - r0
            int r0 = r5.getCompoundPaddingRight()
            int r1 = r1 - r0
            if (r1 <= 0) goto L61
            android.text.Layout r4 = r5.LLJJIJI
            if (r4 == 0) goto L64
            int r3 = r4.getWidth()
            android.util.LruCache<java.lang.Integer, android.text.Layout> r0 = X.C21409818qW.LJIIL
            android.text.BoringLayout$Metrics r2 = X.C21409818qW.LJIILIIL
            int r1 = r5.getRight()
            int r0 = r5.getLeft()
            int r1 = r1 - r0
            int r0 = r5.getCompoundPaddingLeft()
            int r1 = r1 - r0
            int r0 = r5.getCompoundPaddingRight()
            int r1 = r1 - r0
            r5.LJJLIIIJILLIZJL(r3, r2, r1)
            android.text.Layout r0 = r5.LLJJIJI
            if (r0 == 0) goto L64
            r5.LJJJZ(r0, r4)
            return
        L61:
            r5.LJJLIIIJJI()
        L64:
            r5.requestLayout()
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.widget.SimpleLiveTextView.LJJL():void");
    }

    public final TextDirectionHeuristic getTextDirectionHeuristicFromView() {
        boolean z = getLayoutDirection() == 1;
        switch (getTextDirection()) {
            case 1:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public final C21409818qW getTextLayoutBuilder() {
        return getDefaultBuilder();
    }

    public final Layout getTextLayout() {
        return this.LLJJIJI;
    }

    @InterfaceC1294060jmO
    private final void setFont(int i) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 50);
            if (defaultBuilder.LIZIZ.LJJIFFI != i) {
                defaultBuilder.LIZJ();
                defaultBuilder.LIZ.LIZ(i);
                defaultBuilder.LIZIZ.LJJIFFI = i;
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    private final void setLayout(Layout layout) {
        this.LLJJIJI = layout;
        try {
            Field field = LLJJJJJIL;
            if (field != null) {
                field.set(this, layout);
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (this.LLJJI) {
            if (viewStructure != null) {
                viewStructure.setClassName(getAccessibilityClassName().toString());
                return;
            }
            return;
        }
        super.dispatchProvideStructure(viewStructure);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.LLJJI) {
            if (this.LLJJIJI != null) {
                LJJLIIIJJI();
                requestLayout();
                invalidate();
                return;
            }
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.LLJJI) {
            return null;
        }
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.LLJJI) {
            canvas.save();
            int measuredHeight = 0;
            if (this.LLJJIJI == null) {
                int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
                if (right < 1) {
                    right = 0;
                }
                LJJLIIIJILLIZJL(right, C21409818qW.LJIILIIL, right);
            }
            Layout layout = this.LLJJIJI;
            if (layout != null) {
                int i = getDefaultBuilder().LIZIZ.LJJI & 112;
                if (i != 48) {
                    int paddingTop = getPaddingTop() + getPaddingBottom();
                    if (layout.getHeight() < getMeasuredHeight() - paddingTop) {
                        measuredHeight = i == 80 ? (getMeasuredHeight() - paddingTop) - layout.getHeight() : ((getMeasuredHeight() - paddingTop) - layout.getHeight()) >> 1;
                    }
                }
                canvas.translate(getPaddingLeft(), getPaddingTop() + measuredHeight);
                layout.draw(canvas);
            }
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence text;
        if (this.LLJJI) {
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setClassName(getClass().getName());
                Layout layout = this.LLJJIJI;
                if (layout == null || (text = layout.getText()) == null) {
                    text = "";
                }
                accessibilityNodeInfo.setText(text);
                return;
            }
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.LLJJI) {
            TextDirectionHeuristic textDirectionHeuristic = getTextDirectionHeuristic();
            if (!Intrinsics.LJFF(this.LLJJIJIL, textDirectionHeuristic)) {
                setCurTextDir(textDirectionHeuristic);
                if (this.LLJJIJI != null) {
                    LJJL();
                    return;
                }
                return;
            }
            return;
        }
        super.onRtlPropertiesChanged(i);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence charSequence;
        boolean zOnTouchEvent;
        MovementMethod movementMethod;
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            Spannable spannable = null;
            if (defaultBuilder != null) {
                charSequence = defaultBuilder.LIZIZ.LIZ;
            } else {
                charSequence = null;
            }
            if (charSequence instanceof Spannable) {
                spannable = (Spannable) charSequence;
            }
            if (spannable != null && (movementMethod = getMovementMethod()) != null) {
                zOnTouchEvent = movementMethod.onTouchEvent(this, spannable, motionEvent);
            } else {
                zOnTouchEvent = false;
            }
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C011Z.LIZ.LJIILIIL().getClass();
                C1CC2.LIZ("SimpleLiveTextView onTouchEvent error!", e);
            }
            if (!super.onTouchEvent(motionEvent)) {
                if (!zOnTouchEvent) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (!this.LLJJI) {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setAllCaps(boolean z) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setAllCaps");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setAllCaps(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setCompoundDrawablePadding");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setCompoundDrawablePadding(i);
    }

    public final void setCurTextDir(TextDirectionHeuristic textDirectionHeuristic) {
        this.LLJJIJIL = textDirectionHeuristic;
        C21409818qW.LJFF(getDefaultBuilder(), textDirectionHeuristic);
    }

    public final void setEllipsize(int i) {
        if (this.LLJJI) {
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                setEllipsize(TextUtils.TruncateAt.MARQUEE);
                                return;
                            }
                            return;
                        }
                        setEllipsize(TextUtils.TruncateAt.END);
                        return;
                    }
                    setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    return;
                }
                setEllipsize(TextUtils.TruncateAt.START);
                return;
            }
            if (getDefaultBuilder().LIZIZ.LIZJ != 1) {
                return;
            }
            setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    public final void setEllipsizedWidth(int i) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 49);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            if (c21409918qX.LJIILLIIL != i) {
                c21409918qX.LJIILLIIL = i;
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    @Override // android.widget.TextView
    public void setFallbackLineSpacing(boolean z) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setFallbackLineSpacing");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setFallbackLineSpacing(z);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        boolean z;
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS138S0101000_32 awS138S0101000_32 = new AwS138S0101000_32(this, i, 0);
            defaultBuilder.getClass();
            if ((i & 8388615) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            int i2 = i & 8388615;
            int i3 = defaultBuilder.LIZIZ.LJJI;
            if (i2 != (8388615 & i3)) {
                z = true;
            } else {
                z = false;
            }
            if (i3 != i) {
                awS138S0101000_32.invoke(Boolean.valueOf(z));
            }
            defaultBuilder.LIZIZ.LJJI = i;
            return;
        }
        super.setGravity(i);
    }

    @Override // android.widget.TextView
    public void setHeight(int i) {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS169S0101000_32 awS169S0101000_32 = new AwS169S0101000_32(this, i, 1);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            c21409918qX.LJIIIZ = i;
            c21409918qX.LJI = i;
            c21409918qX.LJFF = 2;
            c21409918qX.LJII = 2;
            awS169S0101000_32.invoke();
            return;
        }
        super.setHeight(i);
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 51);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            if (c21409918qX.LJIILJJIL != z) {
                c21409918qX.LJIILJJIL = z;
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        super.setIncludeFontPadding(z);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setLineHeight(int i) {
        if (this.LLJJI) {
            getDefaultBuilder().LIZLLL(i, new AwS576S0100000_32(this, 52));
        } else {
            super.setLineHeight(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS169S0101000_32 awS169S0101000_32 = new AwS169S0101000_32(this, i, 2);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            c21409918qX.LJIIIZ = i;
            c21409918qX.LJI = i;
            c21409918qX.LJFF = 1;
            c21409918qX.LJII = 1;
            awS169S0101000_32.invoke();
            return;
        }
        super.setLines(i);
    }

    public final void setLinkColor(int i) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 54);
            if (defaultBuilder.LIZIZ.LJIJI != i) {
                defaultBuilder.LIZJ();
                defaultBuilder.LIZIZ.LJIJI = i;
                ((TextPaint) defaultBuilder.LIZ).linkColor = i;
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    @Override // android.widget.TextView
    public void setMaxEms(int i) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setMaxEms");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setMaxEms(i);
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int i) {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS169S0101000_32 awS169S0101000_32 = new AwS169S0101000_32(this, i, 3);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            c21409918qX.LJIIIZ = i;
            c21409918qX.LJFF = 2;
            awS169S0101000_32.invoke();
            return;
        }
        super.setMaxHeight(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (this.LLJJI) {
            getDefaultBuilder().LJ(i, new AwS169S0101000_32(this, i, 4));
        } else {
            super.setMaxLines(i);
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS169S0101000_32 awS169S0101000_32 = new AwS169S0101000_32(this, i, 5);
            defaultBuilder.LIZIZ.LIZLLL = i;
            awS169S0101000_32.invoke();
            return;
        }
        super.setMaxWidth(i);
    }

    @Override // android.widget.TextView
    public void setMinHeight(int i) {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS169S0101000_32 awS169S0101000_32 = new AwS169S0101000_32(this, i, 6);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            c21409918qX.LJI = i;
            c21409918qX.LJII = 2;
            awS169S0101000_32.invoke();
            return;
        }
        super.setMinHeight(i);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setMinLines");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setMinWidth(int i) {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS169S0101000_32 awS169S0101000_32 = new AwS169S0101000_32(this, i, 7);
            defaultBuilder.LIZIZ.LJ = i;
            awS169S0101000_32.invoke();
            return;
        }
        super.setMinWidth(i);
    }

    public final void setShouldCacheLayout(boolean z) {
        if (this.LLJJI) {
            getDefaultBuilder().LJ = z;
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    public final void setShouldWarmText(boolean z) {
        if (this.LLJJI) {
            getDefaultBuilder().LJFF = z;
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) throws Throwable {
        TextUtils.TruncateAt truncateAt;
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 56);
            defaultBuilder.LIZIZ.LIZIZ = z;
            if (z) {
                defaultBuilder.LJ(1, null);
                C21409918qX c21409918qX = defaultBuilder.LIZIZ;
                TextUtils.TruncateAt truncateAt2 = c21409918qX.LJIILL;
                if (truncateAt2 == null && truncateAt2 != (truncateAt = TextUtils.TruncateAt.END)) {
                    c21409918qX.LJIILL = truncateAt;
                }
            }
            awS576S0100000_32.invoke();
            return;
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) throws Throwable {
        int colorForState;
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            int[] drawableState = getDrawableState();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 59);
            int defaultColor = -16777216;
            if (colorStateList != null) {
                defaultBuilder.getClass();
                colorForState = colorStateList.getColorForState(drawableState, 0);
            } else {
                colorForState = -16777216;
            }
            if (defaultBuilder.LIZIZ.LJIJ != colorForState) {
                defaultBuilder.LIZJ();
                C21409918qX c21409918qX = defaultBuilder.LIZIZ;
                c21409918qX.getClass();
                c21409918qX.LJIJ = colorForState;
                C444890HcV c444890HcV = defaultBuilder.LIZ;
                if (colorStateList != null) {
                    defaultColor = colorStateList.getDefaultColor();
                }
                c444890HcV.setColor(defaultColor);
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        super.setTextColor(colorStateList);
    }

    public final void setTrimEllipsizedContent(boolean z) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 61);
            if (defaultBuilder.LJI != z) {
                defaultBuilder.LJI = z;
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    public final void setTypeface(int i) {
        if (this.LLJJI) {
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            setTypeface((Typeface) null);
                            return;
                        } else {
                            setTypeface(Typeface.MONOSPACE);
                            return;
                        }
                    }
                    setTypeface(Typeface.SERIF);
                    return;
                }
                setTypeface(Typeface.SANS_SERIF);
                return;
            }
            setTypeface((Typeface) null);
            return;
        }
        throw new UnsupportedOperationException("Not enabled");
    }

    public final void setUseLayout(C21409818qW c21409818qW) {
        this.LLJJIJIIJIL = c21409818qW;
        c21409818qW.getClass();
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS169S0101000_32 awS169S0101000_32 = new AwS169S0101000_32(this, i, 8);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            c21409918qX.LIZLLL = i;
            c21409918qX.LJ = i;
            c21409918qX.getClass();
            awS169S0101000_32.invoke();
            return;
        }
        super.setWidth(i);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 48);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            if (c21409918qX.LJIILL != truncateAt) {
                c21409918qX.LJIILL = truncateAt;
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        super.setEllipsize(truncateAt);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 58);
            if (defaultBuilder.LIZIZ.LJIJ != i) {
                defaultBuilder.LIZJ();
                C21409918qX c21409918qX = defaultBuilder.LIZIZ;
                c21409918qX.getClass();
                c21409918qX.LJIJ = i;
                defaultBuilder.LIZ.setColor(i);
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        super.setTextColor(i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 62);
            if (defaultBuilder.LIZ.getTypeface() != typeface) {
                defaultBuilder.LIZJ();
                defaultBuilder.LIZ.setTypeface(typeface);
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        super.setTypeface(typeface);
    }

    public final void LJJJZ(Layout layout, Layout layout2) {
        if (getLayoutParams().width != -2) {
            if (getLayoutParams().height != -2 && getLayoutParams().height != -1) {
                invalidate();
                return;
            } else if (layout.getHeight() == layout2.getHeight()) {
                invalidate();
                return;
            } else {
                requestLayout();
                return;
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.LLJJI) {
            if (this.LLJJJJ && Build.VERSION.SDK_INT >= 26) {
                viewStructure.setAutofillId(getAutofillId());
            }
            viewStructure.setClassName(getAccessibilityClassName().toString());
            return;
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.widget.SimpleLiveTextView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (!this.LLJJI) {
            super.onProvideAutofillStructure(viewStructure, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C011Z.LIZ.LJIILIIL().getClass();
            C1CC2.LIZ("SimpleLiveTextView onVisibilityChanged error!", th);
        }
    }

    @Override // android.widget.TextView
    public final void setError(CharSequence charSequence, Drawable drawable) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setError");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setError(charSequence, drawable);
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 53);
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            if (c21409918qX.LJIILIIL == f && c21409918qX.LJIIL == f2) {
                return;
            }
            c21409918qX.LJIILIIL = f;
            c21409918qX.LJIIL = f2;
            awS576S0100000_32.invoke();
            return;
        }
        super.setLineSpacing(f, f2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) throws Throwable {
        CharSequence charSequence2;
        Spannable spannable;
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 57);
            if (defaultBuilder.LJIIIIZZ) {
                charSequence = e.LIZ().LJIIIZ(charSequence);
            }
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            c21409918qX.LIZ = charSequence2;
            if (charSequence instanceof Spannable) {
                spannable = (Spannable) charSequence;
            } else {
                spannable = null;
            }
            defaultBuilder.LJIIJJI = spannable;
            awS576S0100000_32.invoke();
            return;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        if (this.LLJJI) {
            try {
                C20745516Fx textStyleableHelper = getTextStyleableHelper();
                if (textStyleableHelper != null) {
                    textStyleableHelper.LJIIIIZZ(i);
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC1119800fFK interfaceC1119800fFKLIZIZ = C011Z.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setTextAppearance-xml resId ");
                sbLIZ.append(i);
                sbLIZ.append(" | e: ");
                sbLIZ.append(th.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                interfaceC1119800fFKLIZIZ.getClass();
                C20441214yg.LJ("SimpleLiveTextView", strLIZIZ);
                return;
            }
        }
        super.setTextAppearance(context, i);
    }

    @Override // X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            float fLJJJIL = LJJJIL(f, i);
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 60);
            if (defaultBuilder.LIZ.getTextSize() != fLJJJIL) {
                defaultBuilder.LIZJ();
                defaultBuilder.LIZ.setTextSize(fLJJJIL);
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        super.setTextSize(i, f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        Typeface typefaceDefaultFromStyle;
        int style;
        if (this.LLJJI) {
            if (!this.LLJJ) {
                if (typeface != null && i > 0) {
                    Context context = getContext();
                    C20141413rQ c20141413rQ = C20140313rF.LIZ;
                    if (context != null) {
                        typefaceCreate = Typeface.create(typeface, i);
                    } else {
                        throw new IllegalArgumentException("Context cannot be null");
                    }
                } else {
                    typefaceCreate = null;
                }
                boolean z = true;
                this.LLJJ = true;
                if (typefaceCreate != null) {
                    typeface = typefaceCreate;
                }
                float f = 0.0f;
                try {
                    if (i > 0) {
                        if (typeface == null) {
                            typefaceDefaultFromStyle = Typeface.defaultFromStyle(i);
                        } else {
                            typefaceDefaultFromStyle = Typeface.create(typeface, i);
                        }
                        setTypeface(typefaceDefaultFromStyle);
                        if (typefaceDefaultFromStyle == null) {
                            style = 0;
                        } else {
                            style = typefaceDefaultFromStyle.getStyle();
                        }
                        int i2 = (~style) & i;
                        C21409818qW defaultBuilder = getDefaultBuilder();
                        if ((i2 & 1) == 0) {
                            z = false;
                        }
                        if ((i2 & 2) != 0) {
                            f = -0.25f;
                        }
                        defaultBuilder.LIZ.setFakeBoldText(z);
                        defaultBuilder.LIZ.setTextSkewX(f);
                    } else {
                        C21409818qW defaultBuilder2 = getDefaultBuilder();
                        defaultBuilder2.LIZ.setFakeBoldText(false);
                        defaultBuilder2.LIZ.setTextSkewX(0.0f);
                        setTypeface(typeface);
                    }
                    this.LLJJ = false;
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLJJ = false;
                    throw th;
                }
            }
            return;
        }
        super.setTypeface(typeface, i);
    }

    public SimpleLiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void LJJLIIIJILLIZJL(int i, BoringLayout.Metrics metrics, int i2) {
        int lineCount;
        if (this.LLJJIJIL == null) {
            setCurTextDir(getTextDirectionHeuristic());
        }
        C21409818qW defaultBuilder = getDefaultBuilder();
        Layout.Alignment layoutAlignment = getLayoutAlignment();
        defaultBuilder.getClass();
        Layout layoutLIZ = defaultBuilder.LIZ(i, metrics, i2, layoutAlignment);
        Layout layout = null;
        if (layoutLIZ != null) {
            if (defaultBuilder.LJI && defaultBuilder.LIZIZ.LJIILL == TextUtils.TruncateAt.END && (lineCount = layoutLIZ.getLineCount()) == defaultBuilder.LIZIZ.LIZJ) {
                int i3 = lineCount - 1;
                if (layoutLIZ.getEllipsisCount(i3) > 10) {
                    int lineStart = layoutLIZ.getLineStart(i3) + layoutLIZ.getEllipsisStart(i3);
                    C21409918qX c21409918qX = defaultBuilder.LIZIZ;
                    if (c21409918qX.LIZ != null) {
                        c21409918qX.LIZ = layoutLIZ.getText().subSequence(0, lineStart + 2);
                        layoutLIZ = defaultBuilder.LIZ(0, null, 0, null);
                    }
                }
            }
            layout = layoutLIZ;
        }
        defaultBuilder.LIZJ = layout;
        setLayout(layout);
    }

    @Override // android.widget.TextView, android.view.View
    public final void addExtraDataToAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        try {
            super.addExtraDataToAccessibilityNodeInfo(accessibilityNodeInfo, str, bundle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C011Z.LIZ.LJIILIIL().getClass();
            C1CC2.LIZ("SimpleLiveTextView addExtraDataToAccessibilityNodeInfo error!", th);
        }
    }

    public SimpleLiveTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final boolean LJJLI(Context context, AttributeSet attributeSet, boolean z, Map map) {
        boolean z2;
        boolean z3;
        long jNanoTime;
        Field field = LLJJJJJIL;
        boolean z4 = true;
        if (field != null && LLJJJJLIIL != null && LLJJL != null) {
            if (map != null) {
                jNanoTime = System.nanoTime();
            } else {
                jNanoTime = 0;
            }
            this.LLJJI = true;
            this.LLJJJ = z;
            this.LLJJJIL = true;
            this.LLJJIJIIJIL = new C21409818qW();
            this.LLJJJJ = true;
            C011Z.LIZ.getClass();
            LJJJJ(context, attributeSet, R.attr.ex8);
            C1105290erv.LIZ(C1105290erv.LIZ(jNanoTime, "live_attr_duration_us", map), "text_attr_duration_us", map);
            setFilters(new InputFilter[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                setImportantForAutofill(2);
            }
            LJJLIIIIJ(context);
            return true;
        }
        InterfaceC1119800fFK interfaceC1119800fFKLIZIZ = C011Z.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleLiveTextView init failed! ");
        if (field == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(' ');
        if (LLJJJJLIIL == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append(' ');
        if (LLJJL != null) {
            z4 = false;
        }
        sbLIZ.append(z4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1119800fFKLIZIZ.getClass();
        C20441214yg.LJ("SimpleLiveTextView", strLIZIZ);
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, X.InterfaceC20745616Fy
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setAutoSizeTextTypeUniformWithConfiguration");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setCompoundDrawables");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (this.LLJJI) {
            if (this.LLJJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setCompoundDrawablesWithIntrinsicBounds");
                sbLIZ.append(" is not enabled");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (this.LLJJI) {
            if (i != getPaddingLeft() || i3 != getPaddingRight() || i2 != getPaddingTop() || i4 != getPaddingBottom()) {
                LJJLIIIJJI();
            }
            super.setPadding(i, i2, i3, i4);
            return;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setShadowLayer(float f, float f2, float f3, int i) throws Throwable {
        if (this.LLJJI) {
            C21409818qW defaultBuilder = getDefaultBuilder();
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 55);
            defaultBuilder.LIZJ();
            C21409918qX c21409918qX = defaultBuilder.LIZIZ;
            c21409918qX.LJIL = f;
            c21409918qX.LJIJJ = f2;
            c21409918qX.LJIJJLI = f3;
            c21409918qX.LJJ = i;
            defaultBuilder.LIZ.setShadowLayer(f, f2, f3, i);
            awS576S0100000_32.invoke();
            return;
        }
        super.setShadowLayer(f, f2, f3, i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.LLJJI) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }
}
