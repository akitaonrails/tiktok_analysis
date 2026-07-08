package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0kQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318770kQF extends C21578619ce {
    public float LL;
    public float LLILLJJLI;

    public C1318770kQF() {
        throw null;
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        canScrollVertically(-1);
        if (canScrollVertically(1)) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        return zOnInterceptTouchEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // X.C21578619ce, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r1 = r10.getAction()
            r4 = 1
            if (r1 == 0) goto L57
            r8 = 0
            r6 = 0
            if (r1 == r4) goto L4b
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L4b
        L11:
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L16:
            r0 = -1
            boolean r7 = r9.canScrollVertically(r0)
            boolean r5 = r9.canScrollVertically(r4)
            float r3 = r10.getY()
            float r2 = r10.getX()
            float r0 = r9.LLILLJJLI
            float r3 = r3 - r0
            float r0 = r9.LL
            float r2 = r2 - r0
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L73
            if (r7 == 0) goto L6b
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L4b:
            r9.LLILLJJLI = r8
            r9.LL = r8
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r6)
            goto L11
        L57:
            float r0 = r10.getY()
            r9.LLILLJJLI = r0
            float r0 = r10.getX()
            r9.LL = r0
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L11
        L6b:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r6)
            return r6
        L73:
            if (r5 == 0) goto L81
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L81:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318770kQF.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C1318770kQF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
