package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0DWF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWF extends ViewOnAttachStateChangeListenerC20604515jv {
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;

    public C0DWF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r1 = r8.getAction()
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L79
            if (r1 == r5) goto L6f
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L6f
        L10:
            boolean r0 = super.onInterceptTouchEvent(r8)
            return r0
        L15:
            float r6 = r8.getX()
            float r2 = r8.getY()
            float r0 = r7.LLILZ
            float r6 = r6 - r0
            float r0 = r7.LLILZIL
            float r2 = r2 - r0
            boolean r0 = r7.LLILZLL
            if (r0 != 0) goto L35
            float r1 = java.lang.Math.abs(r6)
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r7.LLILZLL = r5
        L35:
            boolean r0 = r7.LLILZLL
            if (r0 == 0) goto L10
            r0 = -1
            boolean r3 = r7.canScrollHorizontally(r0)
            boolean r2 = r7.canScrollHorizontally(r5)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L59
            if (r3 != 0) goto L51
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            return r4
        L51:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            goto L10
        L59:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            if (r2 != 0) goto L67
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            return r4
        L67:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            goto L10
        L6f:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r7.LLILZLL = r4
            goto L10
        L79:
            float r0 = r8.getX()
            r7.LLILZ = r0
            float r0 = r8.getY()
            r7.LLILZIL = r0
            r7.LLILZLL = r4
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            goto L10
        L8f:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DWF.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public C0DWF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public /* synthetic */ C0DWF(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
