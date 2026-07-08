package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0y8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845990y8b extends FrameLayout {
    public C676930Qgt LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public final /* synthetic */ C1846140y8q LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getDesiredContentWidth() {
        /*
            r7 = this;
            com.bytedance.tux.input.TuxTextView r3 = r7.LLILLL
            r5 = 0
            if (r3 != 0) goto L6
            return r5
        L6:
            int r0 = r3.getVisibility()
            if (r0 == 0) goto Ld
            return r5
        Ld:
            java.lang.CharSequence r0 = r3.getText()
            r6 = 0
            if (r0 == 0) goto L1a
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L1c
        L1a:
            java.lang.String r2 = ""
        L1c:
            int r0 = r2.length()
            if (r0 != 0) goto L23
            return r5
        L23:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L90
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L2d:
            android.text.TextPaint r0 = r3.getPaint()
            float r0 = r0.measureText(r2)
            int r4 = X.C814420VxA.LIZIZ(r0)
            if (r1 == 0) goto L8e
            int r0 = r1.leftMargin
        L3d:
            int r4 = r4 + r0
            if (r1 == 0) goto L8c
            int r0 = r1.rightMargin
        L42:
            int r4 = r4 + r0
            com.bytedance.tux.icon.TuxIconView r3 = r7.LLILZ
            if (r3 == 0) goto L77
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L77
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L8a
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L57:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 == 0) goto L85
            int r0 = r0.width
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L85
            int r1 = r1.intValue()
        L6d:
            if (r2 == 0) goto L83
            int r0 = r2.leftMargin
        L71:
            int r1 = r1 + r0
            if (r2 == 0) goto L76
            int r5 = r2.rightMargin
        L76:
            int r5 = r5 + r1
        L77:
            int r4 = r4 + r5
            int r0 = r7.getPaddingLeft()
            int r4 = r4 + r0
            int r0 = r7.getPaddingRight()
            int r4 = r4 + r0
            return r4
        L83:
            r0 = 0
            goto L71
        L85:
            int r1 = r3.getMeasuredWidth()
            goto L6d
        L8a:
            r2 = r6
            goto L57
        L8c:
            r0 = 0
            goto L42
        L8e:
            r0 = 0
            goto L3d
        L90:
            r1 = r6
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1845990y8b.getDesiredContentWidth():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1845990y8b.LIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer getInnerTextWidth() {
        /*
            r8 = this;
            com.bytedance.tux.input.TuxTextView r2 = r8.LLILLL
            r7 = 0
            if (r2 != 0) goto L6
            return r7
        L6:
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L6e
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L6e
            android.text.TextPaint r0 = r2.getPaint()
            float r0 = r0.measureText(r1)
            int r6 = X.C814420VxA.LIZIZ(r0)
            com.bytedance.tux.icon.TuxIconView r5 = r8.LLILZ
            r4 = 0
            if (r5 == 0) goto L5d
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L5d
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L6c
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L33:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L6a
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L3d:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            if (r0 == 0) goto L65
            int r0 = r0.width
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L65
            int r1 = r1.intValue()
        L53:
            if (r3 == 0) goto L63
            int r0 = r3.rightMargin
        L57:
            int r1 = r1 + r0
            if (r2 == 0) goto L5c
            int r4 = r2.leftMargin
        L5c:
            int r4 = r4 + r1
        L5d:
            int r6 = r6 + r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            return r0
        L63:
            r0 = 0
            goto L57
        L65:
            int r1 = r5.getMeasuredWidth()
            goto L53
        L6a:
            r2 = r7
            goto L3d
        L6c:
            r3 = r7
            goto L33
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1845990y8b.getInnerTextWidth():java.lang.Integer");
    }

    public final void LIZIZ() {
        int[] iArr = isSelected() ? new int[]{R.attr.state_selected} : new int[0];
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            ColorStateList colorStateList = this.LLILZIL.LLIZLLLIL;
            tuxIconView.setTintColor(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        C676930Qgt c676930Qgt = this.LL;
        if (c676930Qgt == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        Function1<? super C676930Qgt, Unit> function1 = this.LLILZIL.LLJJIJIL;
        if (function1 != null) {
            function1.invoke(c676930Qgt);
        }
        C1846140y8q c1846140y8q = c676930Qgt.LIZJ;
        if (c1846140y8q != null) {
            C1085640eME c1085640eME = C1846140y8q.LLLF;
            c1846140y8q.LJIIJ(c676930Qgt, true);
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C676930Qgt c676930Qgt = this.LL;
        if (c676930Qgt == null) {
            return;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZ(0, 1, c676930Qgt.LIZIZ, 1, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(C20092413jW.LJI);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        EnumC094600Xg enumC094600Xg;
        int i;
        super.setSelected(z);
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            tuxIconView.setSelected(z);
        }
        boolean z2 = true;
        if (((Number) C107100ar.LIZ.getValue()).intValue() == 1) {
            enumC094600Xg = EnumC094600Xg.FONT_STYLE_1;
        } else {
            enumC094600Xg = EnumC094600Xg.DEFAULT_STYLE;
        }
        if (enumC094600Xg != EnumC094600Xg.FONT_STYLE_1) {
            z2 = false;
        }
        int i2 = 42;
        if (z2) {
            i = 42;
        } else {
            i = 33;
            i2 = 32;
        }
        if (z) {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(i);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(i2);
            }
        }
        LIZIZ();
    }

    public final void setTab(C676930Qgt c676930Qgt) {
        if (c676930Qgt != this.LL) {
            this.LL = c676930Qgt;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845990y8b(C1846140y8q c1846140y8q, Context context) {
        super(context);
        this.LLILZIL = c1846140y8q;
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String string;
        super.onMeasure(i, i2);
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
            return;
        }
        CharSequence text = tuxTextView.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(tuxTextView.getPaint().measureText(string));
        if (iLIZIZ > tuxTextView.getMeasuredWidth()) {
            tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), tuxTextView.getLayoutParams().height));
        }
        int desiredContentWidth = getDesiredContentWidth();
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null && desiredContentWidth > linearLayout.getMeasuredWidth()) {
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(desiredContentWidth, 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), linearLayout.getLayoutParams().height));
        }
        if (desiredContentWidth > getMeasuredWidth()) {
            setMeasuredDimension(desiredContentWidth, getMeasuredHeight());
        }
    }
}
