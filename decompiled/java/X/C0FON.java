package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0FON, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FON extends FrameLayout {
    public final int LL;
    public float LLILLJJLI;
    public float LLILLL;

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final C20632315oP getParentViewPager() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof View)) {
            view = null;
            break;
        }
        view = (View) parent;
        while (view != null && !(view instanceof C20632315oP)) {
            Object parent2 = view.getParent();
            if (!(parent2 instanceof View)) {
                view = null;
                break;
            }
            view = (View) parent2;
        }
        if (view instanceof C20632315oP) {
            return (C20632315oP) view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            X.15oP r0 = r10.getParentViewPager()
            if (r0 == 0) goto L24
            int r5 = r0.getOrientation()
            int r0 = r11.getAction()
            r3 = 1
            if (r0 != 0) goto L29
            float r0 = r11.getX()
            r10.LLILLJJLI = r0
            float r0 = r11.getY()
            r10.LLILLL = r0
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L24:
            boolean r0 = super.onInterceptTouchEvent(r11)
            return r0
        L29:
            int r1 = r11.getAction()
            r0 = 2
            if (r1 != r0) goto L24
            float r9 = r11.getX()
            float r0 = r10.LLILLJJLI
            float r9 = r9 - r0
            float r8 = r11.getY()
            float r0 = r10.LLILLL
            float r8 = r8 - r0
            r2 = 0
            if (r5 != 0) goto L75
            r7 = 1
        L42:
            float r6 = java.lang.Math.abs(r9)
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L72
            r0 = 1056964608(0x3f000000, float:0.5)
        L4c:
            float r6 = r6 * r0
            float r4 = java.lang.Math.abs(r8)
            if (r7 == 0) goto L55
            r1 = 1065353216(0x3f800000, float:1.0)
        L55:
            float r4 = r4 * r1
            int r0 = r10.LL
            float r1 = (float) r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L61
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L24
        L61:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L70
            r0 = 1
        L66:
            if (r7 != r0) goto L77
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L24
        L70:
            r0 = 0
            goto L66
        L72:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L4c
        L75:
            r7 = 0
            goto L42
        L77:
            if (r7 != 0) goto L7a
            r9 = r8
        L7a:
            float r0 = java.lang.Math.signum(r9)
            int r0 = (int) r0
            int r1 = -r0
            if (r5 == 0) goto L98
            if (r5 != r3) goto Lac
            android.view.View r0 = r10.getChild()
            if (r0 == 0) goto La3
            boolean r0 = r0.canScrollVertically(r1)
        L8e:
            if (r0 == 0) goto La3
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L24
        L98:
            android.view.View r0 = r10.getChild()
            if (r0 == 0) goto La3
            boolean r0 = r0.canScrollHorizontally(r1)
            goto L8e
        La3:
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L24
        Lac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FON.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public C0FON(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
