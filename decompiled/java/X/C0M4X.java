package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0M4X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4X extends View {
    public C0M4Y LL;
    public float LLILLJJLI;

    public final C0M4Y getOnFrameCoverDragListener() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            super.onTouchEvent(r6)
            boolean r0 = r5.isEnabled()
            r4 = 0
            if (r0 == 0) goto L82
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L71
            if (r1 == r3) goto L66
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L66
        L19:
            return r3
        L1a:
            float r2 = r6.getX()
            float r0 = r5.LLILLJJLI
            float r2 = r2 - r0
            float r1 = java.lang.Math.abs(r2)
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            int r0 = r5.getLeft()
            float r0 = (float) r0
            float r0 = r0 + r2
            int r1 = (int) r0
            int r2 = r5.getMeasuredWidth()
            int r2 = r2 + r1
            if (r1 >= 0) goto L4b
            int r2 = r5.getMeasuredWidth()
        L3d:
            int r0 = r5.getLeft()
            int r1 = r4 - r0
            X.0M4Y r0 = r5.LL
            if (r0 == 0) goto L19
            r0.LIZJ(r4, r2, r1)
            return r3
        L4b:
            android.content.Context r0 = r5.getContext()
            int r0 = X.C12ES.LJIIJ(r0)
            if (r2 <= r0) goto L64
            android.content.Context r0 = r5.getContext()
            int r2 = X.C12ES.LJIIJ(r0)
            int r0 = r5.getMeasuredWidth()
            int r4 = r2 - r0
            goto L3d
        L64:
            r4 = r1
            goto L3d
        L66:
            r5.setPressed(r4)
            X.0M4Y r0 = r5.LL
            if (r0 == 0) goto L19
            r0.LIZIZ()
            return r3
        L71:
            X.0M4Y r0 = r5.LL
            if (r0 == 0) goto L78
            r0.LIZ()
        L78:
            float r0 = r6.getX()
            r5.LLILLJJLI = r0
            r6.getY()
            return r3
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M4X.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnFrameCoverDragListener(C0M4Y c0m4y) {
        this.LL = c0m4y;
    }

    public C0M4X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
