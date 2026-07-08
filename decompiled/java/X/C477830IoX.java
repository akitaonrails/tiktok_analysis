package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0IoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477830IoX extends RunnableC781530UlD {
    public float LLJ;
    public float LLJI;
    public ViewGroup LLJIJIL;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            r4 = 1
            if (r1 == 0) goto L53
            r3 = 0
            if (r1 == r4) goto L47
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L47
        L10:
            boolean r0 = super.dispatchTouchEvent(r6)
            return r0
        L15:
            float r1 = r6.getX()
            float r0 = r5.LLJ
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r6.getY()
            float r0 = r5.LLJI
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3b
            android.view.ViewGroup r0 = r5.LLJIJIL
            if (r0 != 0) goto L37
            android.view.ViewParent r0 = r5.getParent()
        L37:
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L10
        L3b:
            android.view.ViewGroup r0 = r5.LLJIJIL
            if (r0 != 0) goto L43
            android.view.ViewParent r0 = r5.getParent()
        L43:
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L10
        L47:
            android.view.ViewGroup r0 = r5.LLJIJIL
            if (r0 != 0) goto L4f
            android.view.ViewParent r0 = r5.getParent()
        L4f:
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L10
        L53:
            float r0 = r6.getX()
            r5.LLJ = r0
            float r0 = r6.getY()
            r5.LLJI = r0
            android.view.ViewGroup r0 = r5.LLJIJIL
            if (r0 != 0) goto L67
            android.view.ViewParent r0 = r5.getParent()
        L67:
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477830IoX.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setConflictParent(ViewGroup viewGroup) {
        this.LLJIJIL = viewGroup;
    }

    public C477830IoX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C477830IoX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
