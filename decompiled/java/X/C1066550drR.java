package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0drR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1066550drR extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public View LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Animator LLJI;

    public boolean getCanScaleContent() {
        return true;
    }

    public boolean getCanScroll() {
        return false;
    }

    public final View getHeader() {
        return this.LLILLL;
    }

    public final int getHeaderId() {
        return this.LL;
    }

    public final int getScrollOffset() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066550drR.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.LL != -1 && view.getId() == this.LL) {
            if (this.LLILLL == null) {
                this.LLILLL = view;
                return;
            }
            throw new RuntimeException("dup header");
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (Intrinsics.LJFF(this.LLILLL, view)) {
            this.LLILLL = null;
        }
    }

    public final void setHeaderId(int i) {
        if (this.LL != i) {
            View viewFindViewById = findViewById(i);
            if (!Intrinsics.LJFF(this.LLILLL, viewFindViewById)) {
                this.LLILLL = viewFindViewById;
                requestLayout();
            }
            this.LL = i;
        }
    }

    public final void setScrollOffset(int i) {
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            requestLayout();
        }
    }

    public C1066550drR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLILZ = i;
        this.LLILZIL = i2;
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r10 = r10 + r0
            int r0 = r8.getPaddingTop()
            int r11 = r11 + r0
            int r0 = r8.getPaddingRight()
            int r12 = r12 - r0
            int r0 = r8.getPaddingBottom()
            int r13 = r13 - r0
            r1 = 0
            int r0 = r8.getChildCount()
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r1, r0)
            java.util.Iterator r7 = r0.iterator()
        L21:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb9
            r0 = r7
            X.08Jy r0 = (X.AbstractC2098408Jy) r0
            int r0 = r0.nextInt()
            android.view.View r5 = r8.getChildAt(r0)
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L21
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r4 = r5.getMeasuredWidth()
            int r3 = r5.getMeasuredHeight()
            int r1 = r6.gravity
            r0 = -1
            if (r1 != r0) goto L50
            r1 = 8388659(0x800033, float:1.1755015E-38)
        L50:
            int r0 = r8.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r0 & 7
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 1
            if (r1 == r0) goto Lac
            r0 = 5
            if (r1 == r0) goto La7
            r1 = r10
        L63:
            r0 = 16
            if (r2 == r0) goto L9a
            r0 = 80
            if (r2 == r0) goto L95
            int r2 = r6.topMargin
            int r2 = r2 + r11
        L6e:
            int r4 = r4 + r1
            int r3 = r3 + r2
            android.view.View r0 = r8.LLILLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L85
            int r6 = r8.LLILLJJLI
            int r0 = r5.getMeasuredHeight()
            int r6 = r6 - r0
            int r2 = r2 + r6
        L80:
            int r3 = r3 + r6
        L81:
            r5.layout(r1, r2, r4, r3)
            goto L21
        L85:
            android.view.View r0 = r8.LLILLL
            if (r0 == 0) goto L81
            int r0 = r8.LLILLJJLI
            int r2 = r2 + r0
            boolean r0 = r8.getCanScaleContent()
            if (r0 != 0) goto L81
            int r6 = r8.LLILLJJLI
            goto L80
        L95:
            int r2 = r13 - r3
            int r0 = r6.bottomMargin
            goto La5
        L9a:
            int r0 = r13 - r11
            int r0 = r0 - r3
            int r2 = r0 / 2
            int r2 = r2 + r11
            int r0 = r6.topMargin
            int r2 = r2 + r0
            int r0 = r6.bottomMargin
        La5:
            int r2 = r2 - r0
            goto L6e
        La7:
            int r1 = r12 - r4
            int r0 = r6.rightMargin
            goto Lb7
        Lac:
            int r0 = r12 - r10
            int r0 = r0 - r4
            int r1 = r0 / 2
            int r1 = r1 + r10
            int r0 = r6.leftMargin
            int r1 = r1 + r0
            int r0 = r6.rightMargin
        Lb7:
            int r1 = r1 - r0
            goto L63
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066550drR.onLayout(boolean, int, int, int, int):void");
    }
}
