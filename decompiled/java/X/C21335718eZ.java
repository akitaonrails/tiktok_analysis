package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.bindinfo.MynaBindForConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18eZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21335718eZ extends ViewGroup {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public List<? extends InterfaceC21337118en> LL;
    public boolean LLILLJJLI;
    public CharSequence LLILLL;
    public C21337318ep LLILZ;
    public boolean LLILZIL;
    public C21337618es LLILZLL;
    public C21337618es LLIZ;
    public String LLIZLLLIL;
    public float LLJ;
    public final C21335818ea LLJI;
    public final C21337818eu LLJIJIL;
    public GestureDetector LLJILJIL;

    public static /* synthetic */ void getAlignItems$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.TextView";
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final void measureChildren(int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final GestureDetector getGestureHandler() {
        GestureDetector gestureDetector = this.LLJILJIL;
        if (gestureDetector != null) {
            return gestureDetector;
        }
        GestureDetector gestureDetector2 = new GestureDetector(getContext(), this.LLJIJIL);
        this.LLJILJIL = gestureDetector2;
        return gestureDetector2;
    }

    private final C21337618es getShowTextWithTail() {
        C21337618es c21337618es = this.LLIZ;
        if (c21337618es != null) {
            return c21337618es;
        }
        C21337618es c21337618es2 = new C21337618es(0);
        this.LLIZ = c21337618es2;
        return c21337618es2;
    }

    private final C21337618es getTailWithEllipse() {
        C21337618es c21337618es = this.LLILZLL;
        if (c21337618es != null) {
            return c21337618es;
        }
        C21337618es c21337618es2 = new C21337618es(0);
        this.LLILZLL = c21337618es2;
        return c21337618es2;
    }

    private final int getVerticalOffset() {
        String str = this.LLIZLLLIL;
        int paddingTop = getPaddingTop();
        int measuredHeight = (getMeasuredHeight() - paddingTop) - getPaddingBottom();
        int iLIZIZ = LIZIZ(measuredHeight);
        int iHashCode = str.hashCode();
        if (iHashCode == -1364013995) {
            return str.equals("center") ? paddingTop + ((measuredHeight - iLIZIZ) / 2) : paddingTop;
        }
        if (iHashCode != -46581362) {
            return (iHashCode == 1742952711 && str.equals("flex-end")) ? (paddingTop + measuredHeight) - iLIZIZ : paddingTop;
        }
        str.equals("flex-start");
        return paddingTop;
    }

    public final void LIZ() {
        List<InterfaceC21337118en> list;
        C21337318ep c21337318ep = this.LLILZ;
        if (c21337318ep == null || (list = c21337318ep.LIZLLL) == null) {
            return;
        }
        Iterator<InterfaceC21337118en> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        Layout layoutLIZIZ = this.LLJI.LIZIZ();
        return layoutLIZIZ != null ? layoutLIZIZ.getLineBaseline(0) + getVerticalOffset() : super.getBaseline();
    }

    public final int getMynaLineCount$myna_render_release() {
        Layout layout = this.LLJI.LJIIL;
        int lineCount = layout != null ? layout.getLineCount() : 0;
        int i = this.LLJI.LJ;
        return lineCount > i ? i : lineCount;
    }

    public final CharSequence getMynaText$myna_render_release() {
        return this.LLJI.LIZ;
    }

    public final Typeface getMynaTypeface$myna_render_release() {
        return this.LLJI.LIZIZ.getTypeface();
    }

    public final CharSequence getText() {
        return this.LLJI.LIZ;
    }

    public final float getTextSize() {
        return this.LLJI.LIZIZ.getTextSize();
    }

    private final CharSequence getTextForAccessibility() {
        CharSequence text = getText();
        if (text == null || a0.LJJJIL(text)) {
            return "";
        }
        int i = 100000;
        if (text.length() <= 100000) {
            return text;
        }
        if (Character.isHighSurrogate(text.charAt(99999)) && Character.isLowSurrogate(text.charAt(100000))) {
            i = 99999;
        }
        return text.subSequence(0, i);
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        CharSequence contentDescription = super.getContentDescription();
        return (contentDescription == null || a0.LJJJIL(contentDescription)) ? getTextForAccessibility() : contentDescription;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        List<? extends InterfaceC21337118en> list = this.LL;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJ();
            }
        }
        LIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        List<InterfaceC21337118en> list;
        super.onDetachedFromWindow();
        List<? extends InterfaceC21337118en> list2 = this.LL;
        if (list2 != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF();
            }
        }
        C21337318ep c21337318ep = this.LLILZ;
        if (c21337318ep == null || (list = c21337318ep.LIZLLL) == null) {
            return;
        }
        Iterator<InterfaceC21337118en> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().LJFF();
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        List<? extends InterfaceC21337118en> list = this.LL;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJ();
            }
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        List<? extends InterfaceC21337118en> list = this.LL;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF();
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        List<? extends InterfaceC21337118en> list;
        if (!isLayoutRequested()) {
            super.requestLayout();
            if (getChildCount() > 0 || ((list = this.LL) != null && !list.isEmpty())) {
                this.LLJI.LIZLLL();
            }
        }
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.18eu] */
    public C21335718eZ(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = "flex-start";
        C21335818ea c21335818ea = new C21335818ea();
        float f = getResources().getDisplayMetrics().density;
        c21335818ea.LJ();
        c21335818ea.LIZIZ.density = f;
        c21335818ea.LIZLLL();
        this.LLJI = c21335818ea;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (getImportantForAutofill() == 0) {
                setImportantForAutofill(1);
            }
            if (i >= 30 && getImportantForContentCapture() == 0) {
                setImportantForContentCapture(1);
            }
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.LLJIJIL = new C21648719nx() { // from class: X.18eu
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                Spannable spannable;
                MynaBindForConfig mynaBindForConfig;
                if (motionEvent == null) {
                    return;
                }
                C21335718eZ c21335718eZ = this.LL;
                CharSequence text = c21335718eZ.getText();
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                } else {
                    spannable = null;
                }
                C21338018ew c21338018ewLJFF = c21335718eZ.LJFF(motionEvent, spannable);
                if (c21338018ewLJFF != null && c21338018ewLJFF.LLILZIL != null) {
                    this.LL.performHapticFeedback(0);
                    InterfaceC1547330qMt interfaceC1547330qMt = c21338018ewLJFF.LLILZIL;
                    if (interfaceC1547330qMt != null) {
                        AbstractC21333318eB<?> abstractC21333318eB = c21338018ewLJFF.LL;
                        C21325918cz c21325918cz = abstractC21333318eB.LL;
                        View view = abstractC21333318eB.getView();
                        C21329618da c21329618da = c21338018ewLJFF.LLILLL;
                        C21330518dj c21330518dj = c21338018ewLJFF.LLILZ;
                        Map<String, ? extends Object> mapLIZJ = c21338018ewLJFF.LLILZLL;
                        if (c21329618da != null && (mynaBindForConfig = c21329618da.LJ) != null) {
                            mapLIZJ = C21330418di.LIZJ(mapLIZJ, mynaBindForConfig, c21330518dj);
                        }
                        c21325918cz.LJ(interfaceC1547330qMt, view, mapLIZJ, null);
                        return;
                    }
                    return;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    this.LL.performLongClick(motionEvent.getX(), motionEvent.getY());
                } else {
                    this.LL.performLongClick();
                }
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                Spannable spannable;
                if (motionEvent == null) {
                    return false;
                }
                C21335718eZ c21335718eZ = this.LL;
                CharSequence text = c21335718eZ.getText();
                InterfaceC1547330qMt interfaceC1547330qMt = null;
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                } else {
                    spannable = null;
                }
                C21338018ew c21338018ewLJFF = c21335718eZ.LJFF(motionEvent, spannable);
                if (c21338018ewLJFF != null) {
                    interfaceC1547330qMt = c21338018ewLJFF.LLILLJJLI;
                }
                if (interfaceC1547330qMt != null) {
                    c21338018ewLJFF.onClick(this.LL);
                    return true;
                }
                if (!this.LL.hasOnClickListeners()) {
                    return false;
                }
                this.LL.performClick();
                return true;
            }
        };
    }

    public final int LIZIZ(int i) {
        int iLIZ;
        TextUtils.TruncateAt truncateAt;
        C21335818ea c21335818ea = this.LLJI;
        int i2 = c21335818ea.LJ;
        Layout layoutLIZIZ = c21335818ea.LIZIZ();
        if (layoutLIZIZ != null) {
            C21335818ea c21335818ea2 = this.LLJI;
            if (!c21335818ea2.LJIIJ) {
                truncateAt = c21335818ea2.LIZLLL;
            } else {
                truncateAt = null;
            }
            iLIZ = C1318120kPC.LIZ(layoutLIZIZ, i2, truncateAt);
        } else {
            iLIZ = 0;
        }
        if (iLIZ < i) {
            return iLIZ;
        }
        return i;
    }

    public final void LIZLLL(Canvas canvas) {
        int i;
        canvas.save();
        int height = getHeight();
        float width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingTop2 = height - (getPaddingTop() + getPaddingBottom());
        int iLIZIZ = LIZIZ(paddingTop2);
        String str = this.LLIZLLLIL;
        int iHashCode = str.hashCode();
        if (iHashCode != -1364013995) {
            if (iHashCode != -46581362) {
                if (iHashCode == 1742952711 && str.equals("flex-end")) {
                    i = paddingTop2 - iLIZIZ;
                }
            } else {
                str.equals("flex-start");
            }
            i = 0;
        } else if (str.equals("center")) {
            i = (paddingTop2 - iLIZIZ) / 2;
        } else {
            i = 0;
        }
        int i2 = i + paddingTop;
        float f = iLIZIZ + i2;
        if (paddingRight != 0 || f < height) {
            canvas.clipRect(0.0f, 0.0f, width - paddingRight, f);
        }
        float f2 = paddingLeft;
        float f3 = i2;
        if (f2 != 0.0f || f3 != 0.0f) {
            canvas.translate(f2, f3);
        }
        Layout layoutLIZIZ = this.LLJI.LIZIZ();
        if (layoutLIZIZ != null) {
            layoutLIZIZ.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1337860kv2 c1337860kv2;
        C1337870kv3 c1337870kv3;
        if (C1337860kv2.LLJJI) {
            Drawable background = getBackground();
            if ((background instanceof C1337860kv2) && (c1337860kv2 = (C1337860kv2) background) != null && (c1337870kv3 = c1337860kv2.LLIZ) != null && c1337870kv3.LJ) {
                c1337870kv3.LIZLLL(this);
                Path pathLIZIZ = c1337870kv3.LIZIZ();
                int iSave = canvas.save();
                canvas.clipPath(pathLIZIZ);
                try {
                    LIZLLL(canvas);
                    canvas.restoreToCount(iSave);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
            LIZLLL(canvas);
            return;
        }
        C1337990kvF.LIZIZ(this, canvas, new AwS433S0200000_32(this, canvas, 2));
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        List<? extends InterfaceC21337118en> list = this.LL;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ() == drawable) {
                    invalidate();
                    return;
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence textForAccessibility = getTextForAccessibility();
        if (!TextUtils.isEmpty(textForAccessibility) && accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setText(textForAccessibility);
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfo.addAction(131072);
        }
        if (this.LLJI.LJ != 1) {
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setMultiLine(true);
            } else {
                return;
            }
        }
        if (accessibilityNodeInfo != null) {
            if ((accessibilityNodeInfo.isClickable() || accessibilityNodeInfo.isLongClickable()) && this.LLILLJJLI) {
                if (!hasOnClickListeners()) {
                    accessibilityNodeInfo.setClickable(false);
                    accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                }
                if (Build.VERSION.SDK_INT >= 30 && !hasOnLongClickListeners()) {
                    accessibilityNodeInfo.setLongClickable(false);
                    accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        List<CharSequence> text;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(getText()) && accessibilityEvent != null && (text = accessibilityEvent.getText()) != null) {
            text.add(getTextForAccessibility());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21337318ep c21337318ep;
        try {
            if (this.LLILLJJLI || (this.LLILZIL && (c21337318ep = this.LLILZ) != null && c21337318ep.LIZJ)) {
                return getGestureHandler().onTouchEvent(motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1325860kbg.LJFF(th, "myna  text onTouchEvent method happen exception");
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public final void setAlignItems(String str) {
        if (str == null) {
            str = "flex-start";
        }
        this.LLIZLLLIL = str;
        requestLayout();
    }

    public final void setDrawableSpans(List<? extends InterfaceC21337118en> list) {
        if (list != null) {
            for (InterfaceC21337118en interfaceC21337118en : list) {
                interfaceC21337118en.LIZJ(this);
                interfaceC21337118en.LJ();
            }
        }
        this.LL = list;
    }

    public final void setEndEllipse(boolean z) {
        TextUtils.TruncateAt truncateAt;
        C21335818ea c21335818ea = this.LLJI;
        if (z) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            truncateAt = null;
        }
        c21335818ea.LIZLLL = truncateAt;
        c21335818ea.LJIIL = null;
        requestLayout();
    }

    public final void setFontColor(Integer num) {
        int iIntValue;
        C21335818ea c21335818ea = this.LLJI;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -15329245;
        }
        c21335818ea.LJ();
        c21335818ea.LIZIZ.setColor(iIntValue);
        c21335818ea.LJIIL = null;
        invalidate();
    }

    public final void setFontSize(float f) {
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LJ();
        c21335818ea.LIZIZ.setTextSize(f);
        c21335818ea.LIZLLL();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFontStyle(java.lang.String r11) {
        /*
            r10 = this;
            X.18ea r4 = r10.LLJI
            r4.LJ()
            android.text.TextPaint r5 = r4.LIZIZ
            android.graphics.Typeface r8 = r5.getTypeface()
            java.lang.String r0 = "italic"
            boolean r9 = kotlin.jvm.internal.Intrinsics.LJFF(r11, r0)
            r7 = 1
            r6 = 0
            if (r8 == 0) goto L69
            boolean r0 = r8.isBold()
            if (r0 != r7) goto L69
            r0 = 1
        L1c:
            int r3 = X.C21336218ee.LIZJ(r0, r9)
            if (r8 == 0) goto L67
            boolean r0 = r8.isBold()
            if (r0 != r7) goto L67
            r2 = 1
        L29:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L5f
            if (r8 == 0) goto L64
            int r1 = r8.getWeight()
        L35:
            int r0 = X.C21336218ee.LIZJ(r2, r9)
            android.graphics.Typeface r0 = X.C21336218ee.LJ(r8, r1, r0)
            r5.setTypeface(r0)
            r1 = 0
            if (r3 <= r7) goto L5b
            if (r0 == 0) goto L49
            int r6 = r0.getStyle()
        L49:
            int r0 = ~r6
            r0 = r0 & r3
            r0 = r0 & 2
            if (r0 == 0) goto L51
            r1 = -1098907648(0xffffffffbe800000, float:-0.25)
        L51:
            r5.setTextSkewX(r1)
        L54:
            r0 = 0
            r4.LJIIL = r0
            r10.invalidate()
            return
        L5b:
            r5.setTextSkewX(r1)
            goto L54
        L5f:
            if (r2 == 0) goto L64
            r1 = 700(0x2bc, float:9.81E-43)
            goto L35
        L64:
            r1 = 400(0x190, float:5.6E-43)
            goto L35
        L67:
            r2 = 0
            goto L29
        L69:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335718eZ.setFontStyle(java.lang.String):void");
    }

    public final void setFontWeight(Integer num) {
        int iIntValue;
        boolean z;
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LJ();
        TextPaint textPaint = c21335818ea.LIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 400;
        }
        Typeface typeface = textPaint.getTypeface();
        boolean z2 = true;
        if (typeface != null && typeface.isItalic()) {
            z = true;
        } else {
            z = false;
        }
        Typeface typefaceLJ = C21336218ee.LJ(typeface, iIntValue, C21336218ee.LIZJ(C21338418f0.LIZ(Integer.valueOf(iIntValue)), z));
        boolean zLIZ = C21338418f0.LIZ(Integer.valueOf(iIntValue));
        if (typefaceLJ == null || typefaceLJ.isBold() != zLIZ) {
            if (typeface == null || !typeface.isItalic()) {
                z2 = false;
            }
            int iLIZJ = C21336218ee.LIZJ(zLIZ, z2);
            if (typefaceLJ == null) {
                typefaceLJ = Typeface.defaultFromStyle(iLIZJ);
            } else {
                typefaceLJ = Typeface.create(typefaceLJ, iLIZJ);
            }
        }
        textPaint.setTypeface(typefaceLJ);
        c21335818ea.LIZLLL();
        requestLayout();
    }

    public final void setHasClickSpan(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setHasLineHeightSpan(boolean z) {
        C21335818ea c21335818ea = this.LLJI;
        if (z != c21335818ea.LJIIIZ) {
            c21335818ea.LJIIIZ = z;
            c21335818ea.LJIIL = null;
        }
    }

    public final void setIncludeFontPadding(boolean z) {
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LJI = z;
        c21335818ea.LJIIL = null;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setJustifyContent(java.lang.String r4) {
        /*
            r3 = this;
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r4 == 0) goto L40
            int r1 = r4.hashCode()
            r0 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r1 == r0) goto L35
            r0 = -46581362(0xfffffffffd39398e, float:-1.5387876E37)
            if (r1 == r0) goto L2c
            r0 = 1742952711(0x67e35907, float:2.1472389E24)
            if (r1 != r0) goto L21
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L21
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L21:
            X.18ea r1 = r3.LLJI
            r1.LJII = r2
            r0 = 0
            r1.LJIIL = r0
            r3.invalidate()
            return
        L2c:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L40
            goto L21
        L35:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L21
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L21
        L40:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335718eZ.setJustifyContent(java.lang.String):void");
    }

    public final void setMaxLine(int i) {
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LJ = i;
        c21335818ea.LJIIL = null;
        requestLayout();
    }

    public final void setMinFontSize(float f) {
        if (f > 0.0f) {
            this.LLJ = f;
        } else {
            this.LLJ = 0.0f;
        }
        this.LLJI.LIZLLL();
        requestLayout();
    }

    public final void setTailInfo(C21337318ep c21337318ep) {
        boolean z;
        CharSequence charSequence;
        this.LLILZ = c21337318ep;
        C21335818ea c21335818ea = this.LLJI;
        if (c21337318ep != null && c21337318ep.LIZ != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != c21335818ea.LJIIJ) {
            c21335818ea.LJIIJ = z;
            c21335818ea.LJIIL = null;
        }
        if (c21337318ep != null) {
            List<InterfaceC21337118en> list = c21337318ep.LIZLLL;
            if (list != null) {
                Iterator<InterfaceC21337118en> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(this);
                }
            }
            LIZ();
            if (c21337318ep.LIZ != 0 && (charSequence = c21337318ep.LIZIZ) != null && charSequence.length() != 0) {
                getTailWithEllipse().clear();
                getTailWithEllipse().append("...").append(c21337318ep.LIZIZ);
            }
        }
    }

    public final void setText(CharSequence charSequence) {
        CharSequence charSequence2;
        this.LLILLL = charSequence;
        C21337318ep c21337318ep = this.LLILZ;
        if (c21337318ep != null) {
            charSequence2 = c21337318ep.LIZIZ;
        } else {
            charSequence2 = null;
        }
        if (charSequence2 != null && c21337318ep.LIZ == 1) {
            this.LLILZIL = true;
            getShowTextWithTail().clear();
            C21337618es showTextWithTail = getShowTextWithTail();
            if (charSequence == null) {
                charSequence = "";
            }
            charSequence = showTextWithTail.append(charSequence).append(c21337318ep.LIZIZ);
        } else {
            this.LLILZIL = false;
            if (charSequence == null) {
                charSequence = "";
            }
        }
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LIZ = charSequence;
        c21335818ea.LIZLLL();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTextAlign(java.lang.String r4) {
        /*
            r3 = this;
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r4 == 0) goto L40
            int r1 = r4.hashCode()
            r0 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r1 == r0) goto L35
            r0 = 3317767(0x32a007, float:4.649182E-39)
            if (r1 == r0) goto L2c
            r0 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r1 != r0) goto L21
            java.lang.String r0 = "right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L21
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L21:
            X.18ea r1 = r3.LLJI
            r1.LJII = r2
            r0 = 0
            r1.LJIIL = r0
            r3.invalidate()
            return
        L2c:
            java.lang.String r0 = "left"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L40
            goto L21
        L35:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L21
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L21
        L40:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335718eZ.setTextAlign(java.lang.String):void");
    }

    public final void setTypeface(Typeface typeface) {
        if (!Intrinsics.LJFF(getMynaTypeface$myna_render_release(), typeface)) {
            C21335818ea c21335818ea = this.LLJI;
            c21335818ea.LIZIZ.setTypeface(typeface);
            c21335818ea.LJIIL = null;
            requestLayout();
        }
    }

    public final void setUseFallbackLineSpacing(boolean z) {
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LJFF = z;
        c21335818ea.LJIIL = null;
        requestLayout();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        List<InterfaceC21337118en> list;
        List<? extends InterfaceC21337118en> list2 = this.LL;
        if (list2 != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ() == drawable) {
                    return true;
                }
            }
        }
        C21337318ep c21337318ep = this.LLILZ;
        if (c21337318ep != null && (list = c21337318ep.LIZLLL) != null) {
            Iterator<InterfaceC21337118en> it3 = list.iterator();
            while (it3.hasNext()) {
                if (it3.next().LIZ() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public final int LIZJ(int i, int i2) {
        int iLIZ;
        TextUtils.TruncateAt truncateAt;
        C21335818ea c21335818ea = this.LLJI;
        int i3 = c21335818ea.LJ;
        if (i2 == 1073741824) {
            return i;
        }
        Layout layoutLIZIZ = c21335818ea.LIZIZ();
        if (layoutLIZIZ != null) {
            C21335818ea c21335818ea2 = this.LLJI;
            if (!c21335818ea2.LJIIJ) {
                truncateAt = c21335818ea2.LIZLLL;
            } else {
                truncateAt = null;
            }
            iLIZ = C1318120kPC.LIZ(layoutLIZIZ, i3, truncateAt);
        } else {
            iLIZ = 0;
        }
        int paddingTop = iLIZ + getPaddingTop() + getPaddingBottom();
        if (i2 == Integer.MIN_VALUE) {
            return Math.min(i, paddingTop);
        }
        return paddingTop;
    }

    public final boolean LJ(Canvas canvas, View view) {
        return drawChild(canvas, view, getDrawingTime());
    }

    public final C21338018ew LJFF(MotionEvent motionEvent, Spannable spannable) {
        if (spannable == null) {
            return null;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int paddingLeft = x - getPaddingLeft();
        int paddingTop = y - getPaddingTop();
        int scrollX = paddingLeft + getScrollX();
        int scrollY = paddingTop + getScrollY();
        Layout layout = this.LLJI.LJIIL;
        if (layout == null) {
            return null;
        }
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX);
        return (C21338018ew) C13LQ.LJJIIZ(0, spannable.getSpans(iU3, iU3, C21338018ew.class));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (rect != null) {
            rect.set(getLeft(), getTop(), getRight(), getBottom());
        }
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197 A[EDGE_INSN: B:79:0x0197->B:70:0x0197 BREAK  A[LOOP:1: B:56:0x0153->B:84:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:1: B:56:0x0153->B:84:?, LOOP_END, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335718eZ.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LJIILJJIL = i;
        c21335818ea.LJIIJJI = null;
        c21335818ea.LJIILL = i3;
        c21335818ea.LJIIJJI = null;
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        C21335818ea c21335818ea = this.LLJI;
        c21335818ea.LJIILJJIL = getPaddingLeft();
        c21335818ea.LJIIJJI = null;
        C21335818ea c21335818ea2 = this.LLJI;
        c21335818ea2.LJIILL = getPaddingRight();
        c21335818ea2.LJIIJJI = null;
    }
}
